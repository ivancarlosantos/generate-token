pipeline {
    agent any
    tools {
        maven 'maven-3.8.5'
        jdk 'jdk11'
    }
    stages {
        stage ('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
 
        stage('checkout'){
            git branch: 'master', 
            url: 'https://github.com/ivancarlosantos/generate-token.git'
        }

        stage ('compile stage') {
            steps {
                withMaven(maven: 'maven_3_8_5'){
                echo 'compile stage...'
                sh 'mvn clean compile' 
              }
            }
        }
 
        stage ('test and deploy') {
            steps {
                withMaven(maven: 'maven_3_8_5'){
                echo 'deploy stage...'
                sh 'mvn deploy' 
              }
            }
        }
    }
}