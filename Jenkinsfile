node {

     stage('Preparation') { 
         git branch: 'master', 
         url: 'https://github.com/ivancarlosantos/generate-token.git' }

     stage('Verify Directory') { sh 'ls' }

     stage('Java version') { sh 'java -version' }

     stage('compile') { sh 'java -jar .\ttoken.jar' }

}