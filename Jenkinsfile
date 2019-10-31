pipeline {
    agent any
    
    stages {
        
        stage('Build') {
            steps {
                echo 'Building..'
                env.JAVA_HOME = tool 'JDK-1.8'
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
