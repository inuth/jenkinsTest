pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                bat(/"${mvnHome}\bin\mvn" -Dintegration-tests.skip=true clean package/)
                def pom = readMavenPom file: 'pom.xml'
                print pom.version
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
