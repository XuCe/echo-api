FROM registry.cn-hangzhou.aliyuncs.com/qingmou/java
VOLUME /tmp
ADD app.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
