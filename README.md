## Documentação Clínica do Trabalho API

### 1. Sobre 📌

#### 1.1 Descrição do Projeto 📲
Uma clínica do trabalho deseja criar um sistema que fornecerá atestados de saúde ocupacional (ASO) para funcionários de suas empresas cadastradas. A clínica cadastra as empresas que são clientes dela e os funcionários das mesmas. Cada funcionário paciente da clínica pode fazer cinco tipos de exames: admissional, periódico, retorno ao trabalho, demissional e transferência de função. Os médicos da clínica informam os riscos ocupacionais presentes no paciente a partir dos exames feitos nele. O sistema deve ter uma funcionalidade onde é possível fazer uma análise estatística para obter os riscos mais comuns nas empresas cadastradas.


#### 1.2 Tecnologias 🛠
* Spring Boot
* Hibernate
* Java 11
* MySQL
* Flutter

> O link do repositório do APP (Front-End) é: https://github.com/LucasBona05/clinica_trabalhista_app

### 2. Documento de Requisitos 📋

#### 2.1 Requisitos Funcionais 📑
![alt text](https://i.imgur.com/4bhzSF5.png)

#### 2.2 Requisitos Não-Funcionais 📑
![alt text](https://i.imgur.com/C8b7i46.png)

### 3. Diagrama de Entidade e Relacionamento 📊
![alt text](https://i.imgur.com/4M4URPD.png)

### 4. Endpoints 🌐

#### 4.1 ContatoController.java
```
Endpoint: /contato

Tipo: HTTP GET
Nome: findAll
Path: /all

Tipo: HTTP GET
Nome: findById
Tipo do ID: Integer
Path: /{id}

Tipo: HTTP POST
Nome: create
Aceita: JSON
Path: /create

Tipo: HTTP PUT
Nome: update
Tipo do ID: Integer
Aceita: JSON
Path: /update/{id}

Tipo: HTTP DELETE
Nome: delete
Tipo do ID: Integer
Path: /delete/{id}
```

#### 4.2 EmpresaController.java
```
Endpoint: /empresa

Tipo: HTTP GET
Nome: findAll
Path: /all

Tipo: HTTP GET
Nome: findById
Tipo do ID: Integer
Path: /{id}

Tipo: HTTP POST
Nome: create
Aceita: JSON
Path: /create

Tipo: HTTP PUT
Nome: update
Tipo do ID: Integer
Aceita: JSON
Path: /update/{id}

Tipo: HTTP DELETE
Nome: delete
Tipo do ID: Integer
Path: /delete/{id}

Tipo: HTTP GET
Nome: findAllFuncionariosById
Tipo do ID: Integer
Path: /funcionarios/{id}

Tipo: HTTP GET
Nome: findContatoById
Tipo do ID: Integer
Path: /contato/{id}

Tipo: HTTP GET
Nome: findLogradouroById
Tipo do ID: Integer
Path: /logradouro/{id}

Tipo: HTTP GET
Nome: findMaiorRiscoByIdEmpresa
Tipo do ID: Integer
Path: /maior-risco-ocupacional/{id}

Tipo: HTTP GET
Nome: findContagemRiscosByIdEmpresa
Tipo do ID: Integer
Path: /contagem-riscos-ocupacionais/{id}
```

#### 4.3 ExameController.java
```
Endpoint: /exame

Tipo: HTTP GET
Nome: findAll
Path: /all

Tipo: HTTP GET
Nome: findById
Tipo do ID: Integer
Path: /{id}

Tipo: HTTP POST
Nome: create
Aceita: JSON
Path: /create

Tipo: HTTP PUT
Nome: update
Tipo do ID: Integer
Aceita: JSON
Path: /update/{id}

Tipo: HTTP DELETE
Nome: delete
Tipo do ID: Integer
Path: /delete/{id}
```


#### 4.4 FuncionarioController.java
```
Endpoint: /funcionario

Tipo: HTTP GET
Nome: findAll
Path: /all

Tipo: HTTP GET
Nome: findById
Tipo do ID: Integer
Path: /{id}

Tipo: HTTP POST
Nome: create
Aceita: JSON
Path: /create

Tipo: HTTP PUT
Nome: update
Tipo do ID: Integer
Aceita: JSON
Path: /update/{id}

Tipo: HTTP DELETE
Nome: delete
Tipo do ID: Integer
Path: /delete/{id}
```

#### 4.5 LogradouroController.java
```
Endpoint: /logradouro

Tipo: HTTP GET
Nome: findAll
Path: /all

Tipo: HTTP GET
Nome: findById
Tipo do ID: Integer
Path: /{id}

Tipo: HTTP POST
Nome: create
Aceita: JSON
Path: /create

Tipo: HTTP PUT
Nome: update
Tipo do ID: Integer
Aceita: JSON
Path: /update/{id}

Tipo: HTTP DELETE
Nome: delete
Tipo do ID: Integer
Path: /delete/{id}
```

#### 4.6 MedicoController.java
```
Endpoint: /medico

Tipo: HTTP GET
Nome: findAll
Path: /all

Tipo: HTTP GET
Nome: findById
Tipo do ID: Integer
Path: /{id}

Tipo: HTTP GET
Nome: findByCrm
Tipo do CRM: String
Path: /{crm}

Tipo: HTTP POST
Nome: create
Aceita: JSON
Path: /create

Tipo: HTTP PUT
Nome: update
Tipo do ID: Integer
Aceita: JSON
Path: /update/{id}

Tipo: HTTP DELETE
Nome: delete
Tipo do ID: Integer
Path: /delete/{id}
```

#### 4.7 RiscoOcupacionalController.java
```
Endpoint: /risco-ocupacional

Tipo: HTTP GET
Nome: findAll
Path: /all

Tipo: HTTP GET
Nome: findById
Tipo do ID: Integer
Path: /{id}

Tipo: HTTP GET
Nome: findByIdExame
Tipo do ID: Integer
Path: /exame/{id}

Tipo: HTTP POST
Nome: create
Aceita: JSON
Path: /create

Tipo: HTTP PUT
Nome: update
Tipo do ID: Integer
Aceita: JSON
Path: /update/{id}

Tipo: HTTP DELETE
Nome: delete
Tipo do ID: Integer
Path: /delete/{id}
```

#### 4.8 TipoExameController.java
```
Endpoint: /tipo-exame

Tipo: HTTP GET
Nome: findAll
Path: /all

Tipo: HTTP GET
Nome: findById
Tipo do ID: Integer
Path: /{id}

Tipo: HTTP GET
Nome: findByIdExame
Tipo do ID: Integer
Path: /exame/{id}
```
