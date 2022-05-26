pipeline {
    
    agent { docker { image 'maven:3.8.5-openjdk-11' } }
    
    stages {

     stage('Preparation') { git 'https://github.com/ivancarlosantos/generate-token.git' }

     stage('Verify Directory') { steps { sh 'ls'} }

     stage('build') { steps { sh 'mvn --version'} }
     
    }
}