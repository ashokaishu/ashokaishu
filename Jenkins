pipeline {
    agent any
    stages {
        stage("run frontend") {
            steps {
                echo 'excecuting yarn.....'
                nodejs('NodeJS-21.7') {
                    sh 'yarn install'
                }
            }
        }
        stage("run backend") {
            steps {
                echo 'excecuting gradle....'
                withGradle() {
                    sh './gradlew -v'
                }
            }
        }
    }
}
