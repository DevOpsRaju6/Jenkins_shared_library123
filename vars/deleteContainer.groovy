def call() {
    sh 'docker stop youtube12'
    sh 'docker rm youtube12'
}