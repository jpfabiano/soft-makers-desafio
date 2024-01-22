<h1 align="center" style="font-weight: bold;">Desafio Soft Makers (Adaptado) 💻</h1>

<p align="center">
<a href="#informations">Informations</a> •
<a href="#tech">Technologies</a> • 
<a href="#routes">API Endpoints</a> •
</p>

<p align="center">
    <b>Desafio para vaga full-stack júnior SoftMakers</b>
</p>

<h2 id="informations">🎯 Informações</h2>

Para o desafio da vaga de full-stack júnior da empresa SoftMakers foi necessário desenvolver uma APIRest para um pet shop, 
implementando as operações básicas (CRUD) usando NodeJS e construindo o front-end com React.

Como não estou concorrendo a vaga, contrui apenas o back-end do desafio em Java (Spring).

<h2 id="tech">💻 Tecnologias</h2>

- Java
- MySQL
- Spring

<h2 id="routes">📍 API Endpoints</h2>


​
| route                         | description                                          
|-------------------------------|-----------------------------------------------------
| <kbd>Post/dono</kbd>          | Adiciona um dono com suas informações pessoas e endereço no bd.
| <kbd>Post/pet</kbd>           | Adiciona um pet com suas informações e o id do dono (pk key).
| <kbd>Get/pet</kbd>            | Obtém as informações de todos os pets , incluindo as informações de seu dono.
| <kbd>Get/pet/id</kbd>         | Obtém as informações do pet específico , incluindo as informações de seu dono.
| <kbd>Put/dono/id</kbd>        | Atualiza os registros do dono.
| <kbd>Put/pet/id</kbd>         | Atualiza os registros do pet.
| <kbd>Delete/dono/id</kbd>     | Deleta o registro do dono (não será possível se existir um pet com seu código).
| <kbd>Delete/pet/id</kbd>      | Deleta o registro do pet.

<h3 id="post-auth-detail">POST/dono</h3>

**ENVIO**
```json
{
    "nome": "Teste",
    "idade": 16,
    "phone": 123456789,
    "bairro": "Centro",
    "rua": "Rua Secundária",
    "numero": 123
}
```

<h3 id="post-auth-detail">POST/pet</h3>

**ENVIO**
```json
{
    "nome": "Teste",
    "idade": 10,
    "especie": "Cachorro",
    "raca": "Vira-lata",
    "dono": {
        "idDono": 5
    }
}
```

<h3 id="get-auth-detail">GET/pet</h3>

**RESPOSTA**
```json
{
        "nome": "Bolinha",
        "idade": 3,
        "especie": "Cachorro",
        "raca": "Vira-lata",
        "dono": {
            "idDono": 1,
            "nome": "Adriane",
            "idade": 46,
            "phone": 123456786,
            "bairro": "Centro",
            "rua": "Rua Principal",
            "numero": 12
        },
        "id": 1
    },
    {
        "nome": "Luke",
        "idade": 1,
        "especie": "Cachorro",
        "raca": "Shitzu",
        "dono": {
            "idDono": 1,
            "nome": "Adriane",
            "idade": 46,
            "phone": 123456786,
            "bairro": "Centro",
            "rua": "Rua Principal",
            "numero": 12
        },
        "id": 7
    },
```
<h3 id="get-auth-detail">GET/pet/id</h3>

**RESPOSTA**
```json
{
        "nome": "Bolinha",
        "idade": 3,
        "especie": "Cachorro",
        "raca": "Vira-lata",
        "dono": {
            "idDono": 1,
            "nome": "Adriane",
            "idade": 46,
            "phone": 123456786,
            "bairro": "Centro",
            "rua": "Rua Principal",
            "numero": 12
        },
        "id": 1
    }
```
<h3 id="put-auth-detail">PUT/dono/id</h3>

**ENVIO**
```json
{
    "nome": "Adriane",
    "idade": 46
}
```

**RESPOSTA**
```json
{
    "idDono": 1,
    "nome": "Adriane",
    "idade": 46,
    "phone": 123456786,
    "bairro": "Centro",
    "rua": "Rua Principal",
    "numero": 12
}
```
Caso atributos não sejam enviados na requisição eles permanecerão os mesmos.

<h3 id="put-auth-detail">PUT/pet/id</h3>

**ENVIO**
```json
{
     "nome": "Jade Maria"
}
```

**RESPOSTA**
```json
{
   "nome": "Jade Maria",
    "idade": 8,
    "especie": "Cachorro",
    "raca": "Vira-lata",
    "dono": {
        "idDono": 2,
        "nome": "João Pedro",
        "idade": 16,
        "phone": 123456789,
        "bairro": "Centro",
        "rua": "Rua Secundária",
        "numero": 123
    },
    "id": 11
}
```
Caso atributos não sejam enviados na requisição eles permanecerão os mesmos.

<h3 id="delete-auth-detail">DELETE/pet/id & DELETE/dono/id</h3> 
Irão excluir tal registro no banco de dados e retornar um status HTTP (OK ou XX_NOT_FOUND).
