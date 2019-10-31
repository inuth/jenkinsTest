pipeline {
    agent any
    
    stages {
        
        stage('Build') {
            steps {
                echo 'Building..'
                bat "./mvnw.cmd clean install"
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
