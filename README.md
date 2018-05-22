Connecting to Mogodb Docker Container
------------------------------------

Opent Docker Quickstart Terminal

$docker ps
$docker run -p 27017:27017 -d mongo
$docker ps
$docker logs -f {container_id}

To stop the containter
$docker stop {containter_id}


===================================
Running spring boot application

>mvn spring-boot:run
