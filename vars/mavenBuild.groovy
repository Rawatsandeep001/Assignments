def call() {
    parallel(
        "Maven Compile": {
            sh 'mvn clean compile'
        },
        "Maven Test": {
            sh 'mvn test'
        }
    )

    sh 'mvn package -DskipTests'
}
