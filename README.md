## Project carried out during the week of the superior dev

 # Getting started
 
Access the link below to check the web page

 [Web](https://sds1-kaique.netlify.app/)

Access the link below to check the back end endpoints

 [Back-end](https://sds1-dspesquisa-kaique.herokuapp.com)

# API endpoints

These endpoints allow you to return record and games information..

## GET
`Retrieve movies by rate` [/records]<br/>
### Request

`GET /records`

    curl -i -H 'Accept: application/json' https://sds1-dspesquisa-kaique.herokuapp.com/records/
    
### Response

    HTTP/1.1 200 OK
    Date: Sun, 06 Dec 2020 16:29:45 GMT
    Server: Spring Boot
    Content-Type: application/json

    [{"id":211,"moment":"2020-09-19T18:49:37.252455Z","name":"Souza","age":29,"gameTitle":"Fall Guys","gamePlatform":"PLAYSTATION","genreName":"Battle Royale"}

## GET
`Retrieve movies by rate` [/games]<br/>
### Request

`GET /games`

    curl -i -H 'Accept: application/json' https://sds1-dspesquisa-kaique.herokuapp.com/games/
    
### Response

    HTTP/1.1 200 OK
    Date: Sun, 06 Dec 2020 16:29:45 GMT
    Server: Spring Boot
    Content-Type: application/json

    [{"id":1,"title":"The Witcher 3","platform":"XBOX"},{"id":2,"title":"League of Legends","platform":"PC"},{"id":3,"title":"CS GO","platform":"PC"}
    
# Built With

* [Java](https://www.oracle.com/br/java/technologies/) - The programming language that does more with less code
* [SpringBoot](https://spring.io/projects/spring-boot/) - A lightweight web framework for Java and Kotlin
* [Postgresql](https://www.postgresql.org/) - SQL document based database
* [Maven](https://maven.apache.org/) - More than just a building toolkit
