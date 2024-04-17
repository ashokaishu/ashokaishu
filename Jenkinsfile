pipeline {
    agent any
    
    stages {
        stage("Build and Test") {
            steps {
                // Compile Java code
                bat 'javac Calculator.java'
                
                // Run unit tests with coverage using JaCoCo
                bat 'java -javaagent:jacocoagent.jar -cp . org.junit.platform.console.ConsoleLauncher --scan-class-path --reports-dir coverage --disable-ansi-colors'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                // Define SonarQube environment
                withSonarQubeEnv('SonarQube Scanner') {
                    // Execute SonarQube Scanner
                    bat 'sonar-scanner -Dsonar.projectKey=practice '
                }
            }
        }
    }    
    post {
        always {
            // Check code coverage
            script {
                def coverageReport = readFile('coverage/coverage-summary.csv').trim().split('\n')
                def totalLines = coverageReport[1].split(',')[3].toInteger()
                def coveredLines = coverageReport[1].split(',')[2].toInteger()
                def coveragePercentage = (coveredLines.toDouble() / totalLines.toDouble()) * 100
                
                echo "Total lines: $totalLines"
                echo "Covered lines: $coveredLines"
                echo "Code coverage: $coveragePercentage%"
                
                if (coveragePercentage >= 80) {
                    echo 'Code coverage check passed!'
                } else {
                    error 'Code coverage is below the threshold!'
                }
            }
        }
    }
}
