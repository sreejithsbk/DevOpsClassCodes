pipeline {
    agent none

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "mymaven"
        jdk "myjava"
    }

    stages {
        stage('Checkout') {
            agent any
            steps {
                git 'https://github.com/devops-trainer/DevOpsClassCodes.git'
    }
}
    stage('Compile') {
        agent any
            steps {
                sh 'mvn compile'
    }
}
 stage('CodeReview') {
     agent any
            steps {
                sh 'mvn pmd:pmd'
    }
}
 stage('UnitTest') {
     agent any
            steps {
                sh 'mvn test'
    }
}
 stage('MetricCheck') {
     agent any
            steps {
                sh 'mvn cobertura:cobertura -Dcobertura.report.format=xml'
    }
}
stage('Package') {
    agent any
            steps {
                sh 'mvn package'
    }
}

}
}
