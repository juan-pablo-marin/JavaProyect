
#imagen modelo
FROM eclipse-temurin:21.0.8_9-jdk

#informar el puerto donde se ejecutar el contenedor (informativo)
EXPOSE 8080

#definir directorio raiz de nuestro contenedor
WORKDIR /root

#copiar y pegar archivos dentro del contenedor
COPY ./pom.xml /root
COPY ./.mvn /root/.mvn
COPY ./mvnw /root

#descargar las dependencias

RUN ./mvnw dependency:go-offline

#copiar codigo fuente dentro del contenedor

COPY ./src /root/src

 #construir nuestra aplicacion
 RUN chmod +x mvnw
 RUN ./mvnw clean install

 #levantar nuestra aplicacion cuando el contenedor inicie
 ENTRYPOINT ["java","-jar","/root/target/proyecto1-0.0.1-SNAPSHOT.jar"]
