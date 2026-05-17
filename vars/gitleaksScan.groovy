def () {
    stage('Gitleaks Scan') {
        sh 'gitleaks detect --source . --report-format json --report-path gitleaks-report.json'
    }
}
