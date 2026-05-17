def call() {
  stage('sonarqube Analysis') {
    withSonarQubeEnv('SonarServer') {
      sh 'mvn sonar:sonar'
    }
  }
}
