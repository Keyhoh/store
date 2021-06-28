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

以下の通り入力して `Connect`

|項目|値|
|:---|:---|
|Driver Class|org.h2.Driver|
|JDBC URL|jdbc:h2:mem:store_db|
|User Name|sa|
|Password||

## API Reference

### Get All item

全itemを取得します

| Method | Path  |
| :----- | :---- |
| GET    | /item |

```sh
curl -XGET http://localhost:8080/item
```

### Get item by id

指定されたidのitemを取得します

| Method | Path       |
| :----- | :--------- |
| GET    | /item/{id} |

```sh
curl -XGET http://localhost:8080/item/1
```

### Post item

itemを登録します

| Method | Path  |
| :----- | :---- |
| POST   | /item |

```sh
curl -XPOST http://localhost:8080/item -H "content-type: application/json" -d "{\"name\": \"Display\", \"price\": 36000}"
```

### Update item

idで指定されたitemを更新します

| Method | Path       |
| :----- | :--------- |
| PUT   | /item/{id} |

```sh
curl -XPUT http://localhost:8080/item/1 -H "content-type: application/json" -d "{\"price\": 460000}"
```

### Delete item by id

idで指定されたitemを削除します

| Method | Path       |
| :----- | :--------- |
| DELETE | /item/{id} |

```sh
curl -XDELETE http://localhost:8080/item/1
```