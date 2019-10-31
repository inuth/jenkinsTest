pipeline {
    agent any
    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk1.8.0_131'
    }
    stages {
        
        stage('Build') {
            steps {
                echo 'Cleaning..'
                bat "mvn clean"
            }
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
