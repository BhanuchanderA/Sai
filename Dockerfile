FROM tomcat:8-jdk8-corretto
# Set default values
ENV DB_USERNAME=default_username
ENV DB_PASSWORD=default_password
ENV DB_PORT=default_port
ENV DB_NAME=default_name
COPY /target/servlet-jsp-crud-operation.war /usr/local/tomcat/webapps/servlet-jsp-crud-operation.war
