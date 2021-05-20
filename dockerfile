From tomcat
Maintainer Preethi
ADD /var/lib/jenkins/workspace/newdevops/addressbook.war /usr/local/tomcat/webapps
CMD "catalina.sh" "run"
EXPOSE 8080
