# Simply Spring Boot < Prerequisites - OpenJDK 11/17 >

First time working with Spring Boot.

### Tested on Ubuntu machine, make sure java version 11 is installed and intellij idea is configured for spring boot.

### Build project first on ide and then use gui or terminal as follows
```
cd dummy
./gradlew bootRun
```

### On browser or Postman, go to this url to see the generated message 
```
http://localhost:8080
```
### Setup a PostgreSQL database on a virtual machine. Use JPA and hibernate to connect successfully.
```
http://localhost:8080/api/clients
```
### Here the dummy database table's contents will be displayed on browser in JSON format.

#### Another server created as a nodejs app which will be listening on port 9000. To start it, do the following.
```
cd demo
npm install
node m.js
```
### Now added a service class to handle calling the below external API on our spring boot application with every request to /api/clients.
```
http://localhost:9000/retrieve
```

### For building project and deploying war
```
cd dummy
./gradlew bootWar
```
### Built war can be found in dummy/build/libs/launcher.war

