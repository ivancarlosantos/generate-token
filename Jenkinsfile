node{
        stage('checkout'){
            git branch: 'master', url: 'https://github.com/ivancarlosantos/generate-token.git'
        }

        stage('build'){
            echo 'Replacing main artifact with repackaged archive - building application...'
            sh 'mvn package'
        }

        stage('test'){
            echo 'unit test...'
            sh 'mvn -f /app/pom.xml clean package -Dmaven.test.skip'
        }
        
        stage('deploy'){
            echo 'Aplication Deploy on Heroku'
        }
}