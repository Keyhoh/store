# Store

**Table of Contents**

- [Store](#store)
    - [Required](#required)
    - [Run App](#run-app)
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
./gradlew bootrun
```

## Api Reference

### Get All item

| method | path  |
| :----- | :---- |
| get    | /item |

example

```sh
curl -x get http://localhost:8080/item
```

### Get item by Id

| method | path       |
| :----- | :--------- |
| get    | /item/{id} |

example

```sh
curl -x get http://localhost:8080/item/1
```

### Post item

| method | path  |
| :----- | :---- |
| post   | /item |

```sh
curl -x post http://localhost:8080/item \
 -h `content-type: application/json` \
 -d '{"name": "new item"}'
```

### Update item

| method | path       |
| :----- | :--------- |
| post   | /item/{id} |

```sh
curl -x put http://localhost:8080/item/1 \
 -h `content-type: application/json` \
 -d '{"name": "new name"}'
```

### Delete item

| method | path       |
| :----- | :--------- |
| delete | /item/{id} |

```sh
curl -x delete http://localhost:8080/item/1
```