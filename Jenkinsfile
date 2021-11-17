pipeline {
  agent any
  
  stages {
    stage('Build') {
        sh 'mvn -Dmaven.test.failure.ignore clean compile'
    }
    stage('Test') {
        sh 'mvn test'
    }
    stage('Package') {
        sh 'mvn package'
    }
    stage('Execution') {
        sh 'cd target/classes;ls;java -cp . fr.epsi.demo.Helloworld'
    }
    stage('Results') {
        junit '**/target/surefire-reports/TEST-*.xml'
        archiveArtifacts 'target/*.jar'
    }
  }
}
