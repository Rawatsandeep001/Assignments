def call() {
    stage('SonarQube Analysis') {
        withSonarQubeEnv('SonarServer') {
            sh 'mvn sonar:sonar'
        }
    }
}
