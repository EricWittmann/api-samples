FROM centos:7
ENV RELEASE_PATH target/b-swarm.jar
RUN yum install -y \
    java-1.8.0-openjdk-headless \
  && yum clean all

WORKDIR /opt/b

ADD ${RELEASE_PATH} /opt/b

RUN groupadd -r duser -g 1001 \
    && useradd -u 1001 -r -g duser -d /opt/b/ -s /sbin/nologin -c "Docker image user" duser \
    && chown -R duser:duser /opt/b/ \
    && chgrp -R 0 /opt/b && chmod -R g=u /opt/b

USER 1001


EXPOSE 8080

ENV PORT_OFFSET=0
ENV LOGGING_LEVEL=INFO

CMD java -jar /opt/b/b-swarm.jar \
    -Dswarm.port.offset=${PORT_OFFSET} \
    -Dswarm.logging=${LOGGING_LEVEL}
