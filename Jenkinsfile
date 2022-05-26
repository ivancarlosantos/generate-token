node {

     stage('Preparation') { 
         git branch: 'master', 
         url: 'https://github.com/ivancarlosantos/generate-token.git' }

     stage('Verify Directory') { sh 'ls' }

     stage('build') { sh 'java -version' }

     stage('test') { sh './mvn -v' }

     stage('deploy') { echo 'sh mvn clean install' }

}