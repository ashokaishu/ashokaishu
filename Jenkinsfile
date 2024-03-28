pipeline {
    agent any
    stages {
        stage('Execute PowerShell Script') {
            steps {
                powershell '''
                    # Your PowerShell script goes here
                    $pass = ConvertTo-SecureString 'your_client_secret' -AsPlainText -Force
                    $cred = New-Object -TypeName pscredential -ArgumentList 'your_client_id', $pass
                    # Add more commands as needed
                '''
            }
        }
    }
}
