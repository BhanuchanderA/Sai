FROM tomcat:8-jdk8-corretto
COPY /target/servlet-jsp-crud-operation.war /usr/local/tomcat/webapps/servlet-jsp-crud-operation.war
