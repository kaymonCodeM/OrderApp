# Hotel Reservation App



RestAPI using Java SpringBoot and JPA.

Dependencies:

	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<scope>runtime</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-oauth2-resource-server</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

SpringBoot Security using SpringBoots Oauth2 for JWT Tokens.

url-> http://localhost:8080/token

Input: Takes in Authentication Header

Output: JWT Token including user jti which is userId.

## Postman Data:

###### User:

{
    "username":"Hannah",
    "password":"pass",
    "active": true,
    "roles": "ROLE_USER,ROLE_ADMIN"
}

###### Address:

###### Contact:

###### CardPayment:

###### UserInfo:

###### Reservation:

###### AddOn:

###### Amenity:

###### HotelRoom:
