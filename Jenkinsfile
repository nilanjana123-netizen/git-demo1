pipeline {
    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/nilanjana123-netizen/git-demo1.git'
            }
        }

        stage('Build Main Framework') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Build API Testing Project') {
            steps {
                dir('api-testing-project') {
                    bat 'mvn clean test'
                }
            }
        }

        stage('Archive Reports') {
            steps {
                archiveArtifacts artifacts: '**/target/**/*.*', fingerprint: true
            }
        }
    }

    post {
        always {
            echo 'CI/CD Pipeline Completed Successfully'
        }

        success {
            echo 'Build Passed Successfully'
        }

        failure {
            echo 'Build Failed'
        }
    }
}
