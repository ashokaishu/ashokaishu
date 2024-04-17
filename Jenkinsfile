pipeline {
    agent any
    
    stages {
        stage("Build and Test") {
            steps {
                // Compile Java code
                bat 'javac Calculator.java'
                
                bat 'java Calculator'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                // Define SonarQube environment
                withSonarQubeEnv('SonarQube Scanner') {
                    // Execute SonarQube Scanner
                    bat script: "\"C:/Sonar/sonar-scanner-5.0.1.3006-windows/bin/sonar-scanner.bat\" -Dsonar.login=admin -Dsonar.password=admin123 -Dsonar.projectKey=practice -Dsonar.coverage.exclusions=**/*.java", returnStatus: true
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
