pipeline {
  agent any
  
  stages {
    stage('Preparation') { // for display purposes
        // Get some code from a GitHub repository
        git branch: 'main',
            url: 'https://github.com/nicolas59/epsi-demo-maven.git'
        // Get the Maven tool.
        // ** NOTE: This 'M3' Maven tool must be configured
        // **       in the global configuration.
    }
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
