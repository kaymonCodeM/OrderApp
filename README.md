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

###### Result 

http://localhost:8080/user/get/3:

{
    "userId": 3,
    "username": "Hannah",
    "password": "$2a$10$dq2ozFM6EfI0QAzNehIjK.LSmSx8sKguEo4lUoU0lLEtD2UBOdvcC",
    "active": true,
    "roles": "ROLE_USER,ROLE_ADMIN",
    "userInfo": {
        "userInfoId": 6,
        "address": {
            "addressId": 1,
            "street": "515 South Ave",
            "country": "US",
            "state": "NE",
            "city": "Lincoln",
            "zip": "65612"
        },
        "contact": {
            "contactId": 2,
            "firstName": "Hannah",
            "lastName": "blksndkf",
            "email": "email@email.com",
            "phone": "5568754132"
        },
        "cardPayment": {
            "cardPaymentId": 1,
            "cardHolder": "Hannah",
            "cardNumber": "6623554626515414",
            "cvv": 624,
            "expirationDate": null
        },
        "user": {
            "userId": 3,
            "username": "Hannah",
            "password": "$2a$10$dq2ozFM6EfI0QAzNehIjK.LSmSx8sKguEo4lUoU0lLEtD2UBOdvcC",
            "active": true,
            "roles": "ROLE_USER,ROLE_ADMIN"
        },
        "reservations": [
            {
                "reservationId": 1,
                "checkIn": "2022-12-20",
                "checkOut": "2022-12-22",
                "people": 2,
                "hotelRoom": {
                    "hotelRoomId": 2,
                    "bed": "queen",
                    "peopleAllowed": 2,
                    "active": true,
                    "imgUrl": "img/hotel/spark.jpg",
                    "roomCost": 95.25
                },
                "addOns": [
                    {
                        "addOnId": 3,
                        "amenity": {
                            "amenityId": 4,
                            "name": "Workout Gym",
                            "cost": 2.5
                        }
                    }
                ]
            }
        ]
    }
}

