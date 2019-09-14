FROM ubuntu

MAINTAINER Tushar Bisht

#installing java on the machine
RUN apt-get update && \

    apt-get upgrade -y && \

    apt-get install -y  software-properties-common && \

    add-apt-repository ppa:webupd8team/java -y && \

    apt-get update && \

    echo oracle-java7-installer shared/accepted-oracle-license-v1-1 select true | /usr/bin/debconf-set-selections && \

    apt-get install -y openjdk-8-jdk && \
    apt-get clean


#loading volume for spring boot to load files
VOLUME /tmp

#Add artifact along with renaming the jar
ADD /Users/sg0220142/codebase/mycodes/java/dolittle/jrest/build/libs/jrest-all-0.1.0.jar jrest.jar

#Running shell command to update the timestamp of the jar file
RUN sh -C 'touch /jrest.jar'

#spring boot command to run the jar file along with some specification (read more on this)
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/jrest.jar"]