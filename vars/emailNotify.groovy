def call(String status) {
    emailext(
        subject: "Build ${status}",
        body: "Check Jenkins",
        to: "sunraw541@gmail.com"
    )
}
