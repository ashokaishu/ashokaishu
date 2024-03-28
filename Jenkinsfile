pipeline {
    agent any
    stages {
        stage("run frontend") {
            steps {
                echo 'executing yarn.....'
                nodejs('NodeJS-18.12') {
                    sh 'yarn install'
                }
            }
        }
        stage("run backend") {
            steps {
                echo 'executing gradle....'
                withGradle() {
                    echo 'Hello'
                }
            }
        }
    }
}
