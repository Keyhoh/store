# Store

**Table of Contents**

- [Store](#store)
    - [Required](#required)
    - [Run App](#run-app)
    - [Show Database](#show-database)
    - [Api Reference](#api-reference)
        - [Get All item](#get-all-item)
        - [Get item by Id](#get-item-by-id)
        - [Post item](#post-item)
        - [Update item](#update-item)
        - [Delete item](#delete-item)

## Required

java >= 11

```sh
java -version
```

## Run App

```sh
./gradlew bootRun
```

## Show Database

次のページにアクセス

http://localhost:8080/h2-console

以下の通り入力して `Connecet`

|項目|値|
|:---|:---|
|Driver Class|org.h2.Driver|
|JDBC URL|jdbc:h2:mem:store_db|
|User Name|sa|
|Password||

## Api Reference

### Get All item

| Method | Path  |
| :----- | :---- |
| GET    | /item |

example

```sh
curl -x GET http://localhost:8080/item
```

### Get item by Id

| Method | Path       |
| :----- | :--------- |
| GET    | /item/{id} |

example

```sh
curl -x GET http://localhost:8080/item/1
```

### Post item

| Method | Path  |
| :----- | :---- |
| POSt   | /item |

```sh
curl -x POSt http://localhost:8080/item \
 -h `content-type: application/json` \
 -d '{"name": "Display", "price": 36000}'
```

### Update item

| Method | Path       |
| :----- | :--------- |
| PUT   | /item/{id} |

```sh
curl -x PUT http://localhost:8080/item/1 \
 -h `content-type: application/json` \
 -d '{"price": 460000}'
```

### Delete item

| Method | Path       |
| :----- | :--------- |
| DELETE | /item/{id} |

```sh
curl -x DELETE http://localhost:8080/item/1
```