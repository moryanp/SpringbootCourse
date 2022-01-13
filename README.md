# SpringbootCourse

Projeto web service com Spring Boot e JPA/Hibernate. 
API Rest para gerenciamento de ordens de pedidos de produtos, desenvolvida no curso de [Java completo](https://www.udemy.com/course/java-curso-completo/) da Udemy. 
Desenvolvido utilizando Java 11, Spring Boot 2.6.2 e JPA/Hibernate.

## Implementação

Estrutura das camadas lógicas:

![Diagrama das camadas lógicas](https://github.com/moryanp/SpringbootCourse/blob/master/blob/logical%20layers.png?raw=true)

Estrutura da camada de modelo:

![Diagrama da camada de modelo](https://github.com/moryanp/SpringbootCourse/blob/master/blob/domain%20model.png?raw=true)

Estrutura da camada de domínio instanciada:

![Diagrama das camadas lógicas](https://github.com/moryanp/SpringbootCourse/blob/master/blob/domain%20instance.png?raw=true)

Fonte imagens: Nelio Alves

## Rotas

### Categories

- `GET`

Lista todas as categorias:

```
/categories
```

#### Response Body:
```json
[
  {
    "id": 1,
    "name": "name",
  }
]
```

Pesquisa categoria por id:

```
/categories/{id}
```

#### Response Body:
```json
{
  "id": 1,
  "name": "name",
}
```

### Orders

- `GET`:

Retorna todos os pedidos:

```
/orders
```

#### Response Body:
```json
[
  {
    "id": 1,
    "moment": "instant",
    "orderStatus": "status",
    "client: " {
      "id": 1,
      "name": "name",
      "email": "email",
      "phone": "phone",
      "password": "password"
      },
    "items": [
      {
        "quantity": 1,
        "price: "1,
        "product": {
          "id": 1,
          "name": "name",
          "description": "description",
          "price": 1,
          "imgUrl": "imgurl",
          "categories": [
            {
              "id": 1,
              "name": "Boo"
            }
          ]
        }
      }
    ],
    "payment": {
      "id": 1,
      "moment": "instant"
    },
    "total": 1
  }
]
```

Retorna pedido por id:

```
/orders/{id}
```

#### Response Body:
```json
  {
    "id": 1,
    "moment": "instant",
    "orderStatus": "status",
    "client: " {
      "id": 1,
      "name": "name",
      "email": "email",
      "phone": "phone",
      "password": "password"
      },
    "items": [
      {
        "quantity": 1,
        "price: "1,
        "product": {
          "id": 1,
          "name": "name",
          "description": "description",
          "price": 1,
          "imgUrl": "imgurl",
          "categories": [
            {
              "id": 1,
              "name": "Boo"
            }
          ]
        }
      }
    ],
    "payment": {
      "id": 1,
      "moment": "instant"
    },
    "total": 1
  }
```

### Products

- `GET`:

Lista todos os produtos: 

```
/products
```

#### Response body:
```json
[
  {
    "id": 1,
    "name": "name",
    "description": "description",
    "price": 1,
    "imgUrl": "imgurl",
    "categories": [
      {
        "id": 1,
        "name": "Boo"
      }
    ]
  }
]
```

Pesquisa produto por id:

```
/products/{id}
```

#### Response body:
```json
{
  "id": 1,
  "name": "name",
  "description": "description",
  "price": 1,
  "imgUrl": "imgurl",
  "categories": [
    {
      "id": 1,
      "name": "Boo"
    }
  ]
}
```

### Users

- `GET`:

Retorna dados de todos os usuários:

```
/users
```

#### Response Body:
```json
[
  {
    "id": 1,
    "name": "Foo",
    "email": "email@.com",
    "phone": "number",
    "password": "secret"
  }
]
```

Retorna usuário pelo id:

```
/users/{id}
```

#### Response Body:
```json
{
  "id": 1,
  "name": "Foo",
  "email": "email@.com",
  "phone": "number",
  "password": "secret"
}
```

- `POST`:

Insere novo usuário:

```
/users
```

#### Request body:
```json
{
  "name": "name",
  "email": "email",
  "phone": "phone",
  "password": "psw"
}
```

#### Response Body:
```json
{
  "id": 1,
  "name": "name",
  "email": "email",
  "phone": "phone",
  "password": "psw"
}
```

- `PUT`

Atualiza dados do usuário:

```
/users/{id}
```

#### Request body:
```json
{
  "name": "name",
  "email": "email",
  "phone": "phone",
  "password": "psw"
}
```

- `DELETE`

Deleta usuário baseado no id informado:

```
/users/{id}
```

## Deploy

Realizado o deploy da API na plataforma [Heroku](http://heroku.com/) através da URL:
```
https://course-springboot-natan.herokuapp.com/
```
