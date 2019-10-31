pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat(/"${mvnHome}\bin\mvn" -Dintegration-tests.skip=true clean package/)
                archive 'target*//*.jar'
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
