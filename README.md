# Dmartready

This is Baaic atock management system where user can purchase a stock and he/she can see the stock movement as well as stock location

## ER Diagram
![Stocks](https://github.com/pradeepsingroul/Dmartready/assets/104360276/0f0a3d1b-0fd5-4fe6-acde-6a9ba9dcafde)

## Features
### Stock.
get all stocks
 ```getall 
GetMethod-
http://localhost:8080/stocks
```
get stock whose quantity is greater than passed quantity
 ```greaterThanQuantity
GetMethod-
http://localhost:8080/stocks/greater?quantity=yourQuantity
```
Add new stock items to the system.
 ```add
PostMethod-
http://localhost:8080/stocks/add
```
Update the quantity of existing stock items.
 ```update
GetMethod-
http://localhost:8080/stocks/update?id=2yourItemID&quantity=Quantity
```
Delete stock items from the system.
 ```delete
GetMethod-
http://localhost:8080/stocks/delete?id=id
```


### store location
get all the locations
 ```getall 
GetMethod-
http://localhost:8080/storeLocations
```
add new locations
 ```add 
PostMethod-
http://localhost:8080/storeLocations
```
get location by name
 ```getByName 
GetMethod-
http://localhost:8080/storeLocations/getByName?name=yourLocation
```
get location by aaddress
 ```getByAddress 
GetMethod-
http://localhost:8080/storeLocations/getByAddress?address=yourAddress
```

### stock movement
get all stock movement
add new stock movement


 ## Rest Api
 


```login 
GetMethod-
http://localhost:8080/users/login
```

```Play game 
GetMethod-
http://localhost:8888/users?RcokPapperScissor={your sign}
```
 

## Tech Stack

- Core Java
- Spring Boot
- Spring Security
- MySQL (RDBMS)
- Sql
- Maven
- Swagger UI
- postman
- Giuhub


## Deployment

To deploy this project on localhost paste this below code in application.properties file in the 
resources and update according to your database name, username and password of your MySQL database.

```properties
 #changing the server port
server.port=8080

#db specific properties
spring.datasource.url=jdbc:mysql://localhost:3306/database
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=username
spring.datasource.password=password



#ORM s/w specific properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.mvc.throw-exception-if-no-handler-found=true
spring.web.resources.add-mappings=false

spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER

```
### Swagger UI - Link

Use this link to run it on browser.
