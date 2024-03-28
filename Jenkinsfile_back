pipeline {
    agent any
    stages {
        stage('version') {
            steps {
                // Execute a PowerShell command to get the version
                powershell 'Get-Host | Select-Object Version'
            }
        }
        stage('hello') {
            steps {
                // Execute a PowerShell script named hello.ps1
                bat 'javac hello.java'
                bat 'java hello'
            }
        }
    }
}
