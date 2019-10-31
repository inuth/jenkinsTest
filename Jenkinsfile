pipeline {
    agent any
    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk1.8.0_131'
    }
    stages {
        
        stage('Clean') {
            steps {
                echo 'Cleaning..'
                bat "mvn clean"
            }
        }
        stage('Install') {
            steps {
                echo 'Installing..'
                bat "mvn install"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
