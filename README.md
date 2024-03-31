# :briefcase: - Projeto Gerenciamento de Vagas de RH

- API REST para controle de Empresas, Vagas e aplicações, utilizando dos principais pacotes Spring Boot para persistência, segurança e autorização;
- Esta é uma aplicação Spring Boot que permite o gerenciamento de vagas de Recursos Humanos (RH).

## :memo: - Requisitos:

- Java 17 ou superior;
- Maven;
- Banco de dados (Postgres);

## :pushpin: - Configuração: 

1. Clone do repositório:

```
  git clone https://github.com/carloshenriquefs/gestao_vagas.git
```

2. Configure o banco de dados editando o arquivo application.properties e fornecendo as configurações necessárias:

```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/database
    spring.datasource.username=admin
    spring.datasource.password=admin
```

3. Construa a aplicação:

```
  mvn clean install
```

4. Inicie a aplicação:

```
  mvn spring-boot:run
```

## :robot: - Tecnologias:

- Spring Boot;
- Swagger;
- SonarQube;
- Jacoco;
- JUnit;
- Mockito;
- Actuator;
- Prometheus;
- Grafana;
- Thymeleaf;

## :pencil2: - Conceitos: 

- Fundamentos do Spring Boot;
- Rotas, Autenticação e Autorização;
- Documentação;
- Testes e Qualidade de Código;
- Implantação e Monitoramento;
- Thymeleaf;

## :scroll: - Documentação:

- Acesse a documentação completa da API para obter informações detalhadas sobre os endpoints e como usá-los <a href="https://www.apidog.com/apidoc/shared-fade4710-ac0c-4454-8025-845b9ec61bef">aqui</a>.
  

## :gear: - Endpoints

Criar candidato

#### Criar candidato
```shell
curl --location --request POST 'http://localhost:8080/candidate/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": "jose",
    "name": "Jose de Souza",
    "email": "jose@gmail.com",
    "password": "1234567890",
    "description": "Desenvolvedora Java Junior em busca da primeira oportunidade."
}'
```
