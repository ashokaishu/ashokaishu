pipeline {
    agent any
    stages {
        stage("run frontend") {
            steps {
                echo 'executing yarn.....'
                nodejs('NodeJS-21.7') {
                    echo 'Hi'
                }
            }
        }
        stage("run backend") {
            steps {
                echo 'executing gradle....'
                withGradle() {
                    sh './gradlew.bat -v'
                }
            }
        }
    }
}
