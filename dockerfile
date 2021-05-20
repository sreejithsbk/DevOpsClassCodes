From tomcat
Maintainer Preethi
ADD /var/lib/jenkins/Package/addressbook.war /usr/local/tomcat/webapps
CMD "catalina.sh" "run"
EXPOSE 8080
