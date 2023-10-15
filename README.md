# Projeto Spring Boot com Clean Architecture

Este é um projeto Spring Boot que segue o padrão de arquitetura limpa (Clean Architecture) para separação de responsabilidades em camadas. O objetivo do projeto foi me auxiliar a identificar e organizar minhas tarefas do dia-a-dia. O projeto é dividido em três principais módulos:

1. **core**: Contém as regras de negócio e a lógica de domínio do aplicativo. É a camada mais interna e não deve depender de nenhum outro módulo.
   
2. **infra**: Responsável por lidar com as implementações de persistência, como repositórios de banco de dados e configurações de armazenamento.
   
3. **presentation**: Oferece a interface de API REST para interagir com o aplicativo. Esta camada também lida com a transformação de dados entre as solicitações e respostas da API e as entidades do domínio.

## Executando o Projeto

Para executar o projeto, você deve seguir as etapas abaixo:

1. Clone o repositório: git clone https://github.com/seuusuario/seuprojeto.git
 
2. Navegue para o diretório do projeto: ```cd taskfy-api```


3. Compile e execute o aplicativo: 
````./mvnw spring-boot:run -Dspring.profiles.active=test````


O aplicativo será executado localmente na porta padrão 8080. Você pode acessar a API REST em `http://localhost:8080/api` e realizar chamadas para interagir com as funcionalidades do aplicativo.

## Dependências

O projeto utiliza as seguintes tecnologias e dependências:

- Spring Boot
- Spring Data JPA
- H2
- Spring Web (para API REST)
- Spring Validation
- Mockito (para testes utilizando mocks)

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) ou enviar solicitações de pull (pull requests) para melhorias ou correções no projeto.
