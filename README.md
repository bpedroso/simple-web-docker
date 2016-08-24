# Simple Web Docker
=============

Application to validate deploy of web application with docker on jenkins.

Pre Requisites:
=============

1 - docker daemon running
2 - docker group created
3 - current user in the docker group


Build And Run
=============


1 - Build Docker
```ruby
mvn package docker:build
```

2 - Run Docker
docker run --name swd -p 8080:8080 poc/simple-web-docker


//TODO NOW
------------
2 - Add docker to mongodb

3 - Separate profiles to pipeline

4 - Create integration tests to persist and validade data on mongo docker


//Future
------------
Pipeline on Jenkins

References:
------------

https://github.com/picadoh/boots
