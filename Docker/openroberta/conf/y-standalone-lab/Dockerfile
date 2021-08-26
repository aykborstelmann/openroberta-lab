ARG BASEVERSION

FROM $BUILDARCH/maven:3.8-openjdk-8-slim AS build

RUN mkdir -p /tmp/build && cd /tmp/build
WORKDIR /tmp/build
COPY . .
RUN ls -la && mvn clean install -DskipTests && ./ora.sh export /tmp/build/export gzip

FROM openroberta/base-$TARGETARCH:$BASEVERSION

VOLUME /opt/db
EXPOSE 1999

RUN mkdir --parent /opt/openroberta-lab/lib /tmp/openrobertaTmp
WORKDIR /opt/openroberta-lab

COPY --from=build /tmp/build/export .
COPY Docker/openroberta/conf/y-standalone-lab/start.sh . 
RUN chmod ugo+rx ./*.sh

ENTRYPOINT ["./start.sh"]
CMD []