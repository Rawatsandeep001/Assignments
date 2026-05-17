def call() {
    stage('OWASP Dependency Check') {
        sh '/opt/dependency-check/bin/dependency-check.sh --project secretsanta --scan .'
    }
}
