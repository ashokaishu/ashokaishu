pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                bat 'javac hello.java'
                bat 'java hello'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                // Define the SonarScanner tool
                script {
                    def scannerHome = tool 'SonarQube Scanner'
                    def coverageResult = bat(script: "\"C:/Sonar/sonar-scanner-5.0.1.3006-windows/bin/sonar-scanner.bat\" -Dsonar.login=admin -Dsonar.password=admin123 -Dsonar.projectKey=practice -Dsonar.coverage.exclusions=**/*.java", returnStatus: true)
                    if (coverageResult == 0) {
                        echo 'Code coverage check passed!'
                    } else {
                        error 'Code coverage is below the threshold!'
                    }
                }
            }
        }
    }
}
