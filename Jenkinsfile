pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                bat 'hello.java' // Replace YourSourceFile.java with your actual source file name
            }
        }
        stage("Run SonarQube Scanner") {
            steps {
                withSonarQubeEnv('SonarQube Scanner') {
                    bat 'sonar-scanner.bat' // Run SonarQube scanner
                }
            }
        }
    }
}
