def call(String status) {
    stage('Email Notification') {
        emailext (
            subject: "Build ${status}",
            body: "Build ${status} — Check Jenkins for details",
            to: "sunraw541@gmail.com"
        )
    }
}
