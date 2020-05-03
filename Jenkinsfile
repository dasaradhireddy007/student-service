pipeline{
     agent any
     tools {
       maven 'maven3'
     }
     stages{
       stage('Build'){
         steps{
          // mavn command
          sh script: 'mvn clean package'
         }
       }

     }
}