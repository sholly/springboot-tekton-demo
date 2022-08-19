FROM openjdk:8
RUN mkdir -p /deployments/config &&  \
    chown -R 1001:0 /deployments/ && \
    chmod -R 775 /deployments/ && \
    ls -lR /workspace 
ADD /workspace/source/target/openshift-tekton.jar /deployments/openshift-tekton.jar
WORKDIR /deployments
USER 1001
EXPOSE 8080
ENTRYPOINT ["java","-jar", "/deployments/openshift-tekton.jar"]
