def call() {
    sh '/opt/dependency-check/bin/dependency-check.sh --project secretsanta --scan .'
}
