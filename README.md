<h1 align="left">Projeto Terminal Java</h1>

### 📌 Sobre o Repositório

<p align="left">Este repositório foi criado para armazenar e gerenciar o projeto proposto na disciplina de Programação Orientada a Objetos (POO). Aqui, serão realizadas todas as atualizações e melhorias necessárias ao longo do desenvolvimento.  👇🏼</p>

### 🎯 Objetivo

<p align="left">O principal propósito deste repositório é facilitar o trabalho em grupo, garantindo um ambiente organizado e colaborativo para o desenvolvimento do projeto.</p>

### 👥 Desenvolvedores

<p align="left">As atualizações e contribuições serão feitas por:</p>
<p>🧑‍💻 Natan Ribeiro Limiro</p>
<p>🧑‍💻 Juracy Neto</p>


## Diagrama De Classes
![UML](docs/uml/diagrama.png)

### Código PlantUML
```plantuml
@startuml
class Terminal {
    +main(args: String[]): void
}

class CommandHandler {
    +executeCommand(cmd: String): void
}

Terminal --> CommandHandler

@enduml