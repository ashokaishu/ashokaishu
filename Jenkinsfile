pipeline {
    agent any
    stages {
        stage("Build") {
            steps {
                bat 'javac -d . *.java' // Compile Java files
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
