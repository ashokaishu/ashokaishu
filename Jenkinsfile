pipeline {
    agent any

    stages {
        stage('Build and Test') {
            steps {
                // Compile Java code
                bat 'javac Calculator.java'

                // Run unit tests
                bat 'java Calculator'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                // Execute SonarQube Scanner
                bat "\"C:/Sonar/sonar-scanner-5.0.1.3006-windows/bin/sonar-scanner.bat\" -Dsonar.login=admin -Dsonar.password=admin123 -Dsonar.projectKey=practice -Dsonar.coverage.exclusions=**/*.java"
            }
        }
    }
}
