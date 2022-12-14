# Hotel Reservation App

Database:

![image](https://user-images.githubusercontent.com/73083538/205366187-11a3de3f-88bc-43a1-b6d4-b221b285c0cc.png)

https://online.visual-paradigm.com/diagrams/features/erd-tool/

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

Pasword encryption: bcrypt

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

###### UserInfo:
{
    "user":{
        "userId": 3
    }
}

###### Address:

{
    "street":"515 South Ave",
     "country": "US",
     "state": "NE",
     "city": "Lincoln",
     "zip": "65612",
    "userInfo":{
    "userInfoId": 6
    }
}

###### Contact:

{
    "firstName":"Hannah",
    "lastName":"blksndkf",
    "email": "email@email.com",
    "phone": "5568754132",
    "userInfo":{
    "userInfoId": 6
    }
}

###### CardPayment:

{
    "cardHolder": "Hannah",
    "cardNumber":"6623554626515414",
    "ExpirationDate": "2017-01-12",
    "cvv":624,
    "userInfo":{
    "userInfoId": 6
    }
}

###### Amenity:

{
    "name": "Workout Gym",
    "cost": 2.50
}

###### HotelRoom:

{
     "bed": "queen",
     "peopleAllowed":2,
     "active":true,
     "imgUrl": "img/hotel/spark.jpg",
     "roomCost": 95.25
}

###### Reservation:

{
    "checkIn":"2022-12-20",
    "checkOut":"2022-12-22",
    "people": 2,
    "hotelRoom":{
        "hotelRoomId":2
    },
    "userInfo":{
        "userInfoId":6
    }
}

###### AddOn:
{
    "amenity":{
        "amenityId": 4
    },
    "reservation":{
        "reservationId": 1
    }
}

