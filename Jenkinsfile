pipeline {
    agent any
    
    stages {
        
        stage('Build') {
            steps {
                echo 'Building..'
                env.JAVA_HOME = 'C:\Program Files\Java\jdk1.8.0_131'
                bat "mvn clean install"
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
