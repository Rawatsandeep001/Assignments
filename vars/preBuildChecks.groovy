def call() {
  stage("pre Build Checks') {
        sh 'mvn clean compile checkstyle:checstyle'
        }
}
