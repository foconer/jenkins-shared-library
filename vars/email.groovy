def call(String to, String message){
  emailext body: ${message}, subject: 'Jenkins Pipeline', to: ${to}
}
