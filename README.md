# Projeto de cálculo IMC

# Start do Projeto


```
server.error.include-stacktrace=never
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/test
spring.datasource.username=postgres
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=validate
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

spring.jackson.default-property-inclusion= non-null

```


#### Rota [POST] - Inserir um comentário na ordem de serviço
- [POST] http://localhost:8080/api/v1/imc

#### Body:
```
{
    "altura": 1.60,
    "peso": 60
}
```
#### Response:
```
{
    "id": 1,
    "imc": 23.437499999999996
}

```
