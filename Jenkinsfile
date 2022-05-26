node {

     stage('Preparation') { 
         git branch: 'master', 
         url: 'https://github.com/ivancarlosantos/generate-token.git' }

     stage('Verify Directory') { sh 'ls' }

     stage('Git Version') { sh 'git --version' }

     stage('Docker') { sh 'docker-compose ls' }

     stage('Java version') { sh 'java -version' }

     stage('Javac version') { sh 'javac -version' }

     stage('Finalize') { echo 'Build Finished'}

}