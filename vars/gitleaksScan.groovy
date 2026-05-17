def call() {
    catchError(buildResult: 'UNSTABLE', stageResult: 'FAILURE') {
        sh '''
        gitleaks detect \
          --source . \
          --report-format json \
          --report-path gitleaks-report.json
        '''
    }

    sh '''
    if [ ! -f gitleaks-report.json ]; then
      echo "[]" > gitleaks-report.json
    fi
    '''

    archiveArtifacts artifacts: 'gitleaks-report.json', fingerprint: true
}
