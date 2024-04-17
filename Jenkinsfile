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
            steps{
                def scannerHome = tool 'SonarScanner';
                withSonarQubeEnv() {
                  bat "$C:/Sonar/sonar-scanner-5.0.1.3006-windows/bin/sonar-scanner"
                }
            }
        }
    }
}
