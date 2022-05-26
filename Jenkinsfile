node{
        stage('checkout'){
            git branch: 'master', url: 'https://github.com/ivancarlosantos/generate-token.git'
        }

        stage('build'){
            sh 'mvn clean install'
        }

        stage('test'){
            sh 'mvn -f /app/pom.xml clean package -Dmaven.test.skip'
        }
        
        stage('deploy'){
            sh 'echo "init deploy on heroku"',
            sh ''
        }
}