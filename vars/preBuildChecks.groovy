def call() {
    stage('Pre Build Checks') {
        sh 'mvn clean compile checkstyle:checkstyle'
    }
}
