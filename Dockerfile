FROM docker.io/tomcat:9.0

# VOLUME MOUNT THIS DIRECTORY /usr/local/tomcat/webapps/ROOT/

EXPOSE 8080
CMD ["catalina.sh", "run"]
