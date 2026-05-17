def call() {
    stage('OWASP Dependency check') {
        sh 'dependency-check.sh --project secretsanta --scan . --format HTML '
    }
}
