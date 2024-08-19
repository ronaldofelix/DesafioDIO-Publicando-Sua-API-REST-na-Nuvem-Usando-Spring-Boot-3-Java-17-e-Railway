# GFT - Desenvolvimento Java com IA
Desafio publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway

## Principais Tecnologias
- Java 17: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
- Spring Boot 3: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
- Spring Data JPA: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
- OpenAPI (Swagger): Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
- Railway: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.

## Diagrama de Classes

```mermaid
classDiagram
    class Aluno {
        +String nome
        +String matricula
        +Date dataNascimento
        +String email
        +List~Disciplina~ disciplinas
    }

    class Disciplina {
        +String nome
        +String codigo
        +Professor professor
    }

    class Professor {
        +String nome
        +String matricula
        +String email
        +List~Disciplina~ disciplinas
    }

    class Turma {
        +String codigo
        +Disciplina disciplina
        +List~Aluno~ alunos

    }

    Aluno "1" --o "*" Disciplina : "matriculado em"
    Professor "1" --o "*" Disciplina : "ensina"
    Disciplina "1" --o "1" Turma : "pertence a"
    Turma "1" --o "*" Aluno : "contém"
```
