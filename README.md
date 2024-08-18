## Diagrama de Classes

```mermaid
classDiagram
    class Aluno {
        +String nome
        +String matricula
        +Date dataNascimento
        +String email
        +List~Disciplina~ disciplinas
        +void cadastrar()
        +void atualizar()
        +void excluir()
    }

    class Disciplina {
        +String nome
        +String codigo
        +Professor professor
        +void adicionarAluno(Aluno aluno)
        +void removerAluno(Aluno aluno)
    }

    class Professor {
        +String nome
        +String matricula
        +String email
        +List~Disciplina~ disciplinas
        +void adicionarDisciplina(Disciplina disciplina)
        +void removerDisciplina(Disciplina disciplina)
    }

    class Turma {
        +String codigo
        +Disciplina disciplina
        +List~Aluno~ alunos
        +void adicionarAluno(Aluno aluno)
        +void removerAluno(Aluno aluno)
    }

    Aluno "1" --o "*" Disciplina : "matriculado em"
    Professor "1" --o "*" Disciplina : "ensina"
    Disciplina "1" --o "1" Turma : "pertence a"
    Turma "1" --o "*" Aluno : "contém"
```
