pipeline {
    agent none

    tools {
        jdk 'myjava'
        // Install the Maven version configured as "M3" and add it to the path.
        maven "mymaven"
    }

    stages {
        stage('Checkout') {
            agent any
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/devops-trainer/DevOpsClassCodes.git'

            }
        }
        
        stage('Compile') {
            agent any
            steps {
                // Get some code from a GitHub repository
                sh 'mvn compile'

            }
        }
        stage('Codereview') {
           agent any
            steps {
                // Get some code from a GitHub repository
                sh 'mvn pmd:pmd'

            }
        }
         
        stage('UnitTest') {
            agent any
            steps {
                // Get some code from a GitHub repository
                sh 'mvn test'

            }
        }
        stage('MetricCheck') {
            agent any
            steps {
                // Get some code from a GitHub repository
                sh 'mvn cobertura:cobertura -Dcobertura.report.format=xml'

            }
            post{
                always{
                    cobertura coberturaReportFile: 'target/site/cobertura/coverage.xml'
            }
        }
        stage('Package') {
            agent any
            steps {
                // Get some code from a GitHub repository
                sh 'mvn package'
                
            }
        }

           
        
    }
    }
