# MGS Employee Management API

Uma API RESTful em Java com Spring Boot para gerenciar informações dos empregados da MGS, incluindo inserção, obtenção, atualização e deleção dos dados, com persistência garantida em um banco de dados MySQL.

## Funcionalidades

- Adicionar um empregado
- Obter detalhes de um empregado por ID
- Listar todos os empregados
- Atualizar informações de um empregado
- Deletar um empregado por ID

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- Maven

## Requisitos

- Java 11+
- Maven


### Clonar o Repositório

git clone https://github.com/luizkhalil2000/POO_Sistematizacao.git
cd REPOSITORY
Configurar o Banco de Dados
Atualize src/main/resources/application.properties com suas credenciais do MySQL:

## properties
spring.datasource.url=jdbc:mysql://localhost:3306/mgsdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

## Executar a Aplicação
sh
mvn clean package
mvn spring-boot:run
A aplicação estará disponível em http://localhost:8080.

## Endpoints da API
## Criar um Empregado
URL: /api/employees
Método: POST
Corpo:
{
    "name": "John Doe",
    "email": "john.doe@example.com",
    "phone": "123456789",
    "allergies": "Peanuts",
    "medicalConditions": "Asthma"
}
## Obter um Empregado por ID
URL: /api/employees/{id}
Método: GET
Listar Todos os Empregados
URL: /api/employees
Método: GET
## Atualizar um Empregado
URL: /api/employees/{id}
Método: PUT
Corpo:
{
    "name": "John Doe Updated",
    "email": "john.doe.updated@example.com",
    "phone": "987654321",
    "allergies": "None",
    "medicalConditions": "None"
}
## Deletar um Empregado
URL: /api/employees/{id}
Método: DELETE
Licença
Este projeto está licenciado sob a Licença MIT.


Esse `README.md` fornece uma visão geral clara e concisa do projeto, suas funcionalidades principais, tecnologias usadas, requisitos, como configurar e executar a aplicação, e os endpoints da API.
