node {
    
     stage('Preparation') { 
         git branch: 'master', 
         url: 'https://github.com/ivancarlosantos/generate-token.git' }

     stage('Verify Directory') { sh 'ls' }

     stage('build') { sh 'apt-get update -y' }

     stage('test') { sh 'ls -a' }

     stage('deploy') { sh 'ls -lha' }

}