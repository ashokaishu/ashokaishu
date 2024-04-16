pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                bat 'javac hello.java'
                bat 'java hello'
            }
        }
        stage("Run SonarQube Scanner") {
            steps {
                echo 'Hi'
                withSonarQubeEnv('SonarQube Scanner') {
                    bat 'sonar-scanner.bat' // Run SonarQube scanner
                }
            }
        }
    }
}
