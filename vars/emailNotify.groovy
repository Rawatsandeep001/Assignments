def call(String status) {
    emailext (
        subject: "Build ${status}",
        body: "Build ${status} - Check jenkins for details:,
        to: "sunraw541@gmail.com"
        )
}
