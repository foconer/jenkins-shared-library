def call(String to){
  emailext body: 'test'', subject: 'Jenkins Pipeline', to: ${to}
}
