# MariaDB Bonus – Spring Boot

This project demonstrates the usage of MariaDB as a distributed database resource
with a Spring Boot application.

## What was done
- MariaDB was run using Docker
- Spring Boot application connected to MariaDB using Spring Data JPA
- Database schema was created automatically using Hibernate
- REST endpoint was used to store data in MariaDB

## Technologies
- Java 17
- Spring Boot 4
- Spring Data JPA
- MariaDB (Docker)

## Run MariaDB (Docker)
docker rm -f mariadb 2>/dev/null || true
docker run --name mariadb \
  -e MARIADB_ROOT_PASSWORD=root \
  -e MARIADB_DATABASE=testdb \
  -p 3306:3306 \
  -d mariadb:11

## Run the application
./mvnw spring-boot:run

## Example request
curl -X POST "http://localhost:8085/users?email=test@tamk.fi"

This confirms that the application is connected to MariaDB
and data is stored in the database.
