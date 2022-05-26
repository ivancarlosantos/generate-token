node {
    
    agent { docker { image 'maven:3.8.5-openjdk-11' } }

     stage('Preparation') { 
         git branch: 'master', 
         url: 'https://github.com/ivancarlosantos/generate-token.git' }

     stage('Verify Directory') { sh 'ls' }

     stage('build') { sh 'apt-get update -y' }

     stage('test') { sh 'ls -a' }

     stage('deploy') { sh 'ls -lha' }

}