def buildJar() {
    echo "building the application..."
    sh 'mvn package'
} 

def buildImage() {
    echo "building the docker image..."
                    withCredentials([usernamePassword(credentialsId: 'docker-hub ', passwordVariable: 'PASS', usernameVariable: 'USER')])
                    sh 'sudo docker build -t devopstrainer/myrepoprivate:jenkinsjob .'
                    sh 'echo $PASS | sudo docker login -u $USER --password-stdin'
                    sh 'sudo docker push devopstrainer/myrepoprivate:jenkinsjob'
} 
}
def deployApp() {
    echo 'deploying the application...'
} 

return this
