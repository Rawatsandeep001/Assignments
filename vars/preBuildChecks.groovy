def call() {
    sh 'mvn clean compile checkstyle:checkstyle'
}
