# Artemis Bonus – Messaging with Topics

This project demonstrates the usage of Apache ActiveMQ Artemis
as a distributed messaging broker using Spring Boot.

## What was done
- Apache ActiveMQ Artemis was run in Docker
- Spring Boot application connected to Artemis using JMS
- Topic-based (pub-sub) messaging was configured
- Messages were published and consumed through an Artemis topic

## Technologies
- Java 17
- Spring Boot 4
- Apache ActiveMQ Artemis
- JMS (Pub-Sub)

## Run Artemis (Docker)
docker rm -f artemis 2>/dev/null || true
docker run --rm --name artemis \
  -p 50000:61616 -p 50001:8161 \
  -e ARTEMIS_USER=admin \
  -e ARTEMIS_PASSWORD=admin \
  apache/activemq-artemis:latest

## Artemis Web Console
- URL: http://localhost:50001/console
- Username: admin
- Password: admin

## How it works
- Messages are sent to a MULTICAST topic
- If consumers are running, messages are delivered
- If no consumers exist, messages are discarded (non-durable)

This demonstrates distributed messaging using a topic-based architecture.
