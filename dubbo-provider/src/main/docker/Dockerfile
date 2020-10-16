FROM docker.io/java:8

COPY *.jar /app.jar

EXPOSE 8088

ENTRYPOINT ["java","-jar","-Duser.timezone=GMT+08","/app.jar","&"]