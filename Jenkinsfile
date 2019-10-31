pipeline {
    agent any
    
    tools {
        maven 'Maven 3.3.9'
        jdk 'jdk8'
    }
    
    stages {
        
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn -Dmaven.test.failure.ignore=true install'
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
