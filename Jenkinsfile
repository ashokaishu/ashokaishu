pipeline {
    agent any
    
    tools {
        // Specify the SonarQube Scanner installation name
        // Make sure this matches the name configured in Jenkins Global Tool Configuration
        sonarqube 'SonarQube Scanner'
    }
    
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
}
