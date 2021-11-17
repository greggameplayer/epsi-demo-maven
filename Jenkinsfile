pipeline {
  agent any
  
  stages {
    stage('Build') {
      steps {
       sh 'mvn -Dmaven.test.failure.ignore clean compile' 
      }
    }
    stage('Test') {
      steps {
       sh 'mvn test' 
      }
    }
    stage('Package') {
      steps {
       sh 'mvn package' 
      }
    }
    stage('Execution') {
      steps {
       sh 'cd target/classes;ls;java -cp . fr.epsi.demo.Helloworld' 
      }
    }
    stage('Results') {
      steps {
       junit '**/target/surefire-reports/TEST-*.xml'
       archiveArtifacts 'target/*.jar' 
      }
    }
  }
}
