**SpringDoc operationId issue**

1. Start service: `./mvnw spring-boot:run`
2. Call with one locale: `curl "http://localhost:8080/v3/api-docs" -H 'Accept-Language: ru-RU'`
3. Call with another locale: `curl "http://localhost:8080/v3/api-docs" -H 'Accept-Language: en-US'`
4. OperationId is changed