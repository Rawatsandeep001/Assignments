def call() {
    stage('Gitleaks Scan') {
        sh 'gitleaks detect --source .'
    }
}
