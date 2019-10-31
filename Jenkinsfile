pipeline {
    agent any
    
    stages {
        
        stage('Build') {
            steps {
                echo 'Building..'
                sh "mvn clean verify"
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
