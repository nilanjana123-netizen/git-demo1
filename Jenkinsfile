pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'http://gitlab.novelvista.com/AIVSJAVA/nilanjana-tapan-manna.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Report') {
            steps {
                publishHTML(target: [
                    allowMissing: false,
                    alwasysLinkToLastBuild: true,
                    keepAll:true,
                    reportDir: 'reports',
                    reportFiles: 'extent-report.html',
                    reportName: 'Test Report'
                ])
            }
        }
    }
}
