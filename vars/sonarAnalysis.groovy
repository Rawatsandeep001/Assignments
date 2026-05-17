def call() {
    withSonarQubeEnv('SonarServer') {
        sh 'mvn sonar:sonar'
    }
}
