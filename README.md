# Basic Spring Boot Project
This is an example of a basic Spring Boot project using an H2 in-memory database.
The project has just one entity named [Product](src/main/java/com/example/basic_structure/model/Product.java) which is then handled by the following abstracted components:
- [ProductController](src/main/java/com/example/basic_structure/controller/ProductController.java)
- [ProductRepository](src/main/java/com/example/basic_structure/repository/ProductRepository.java)
- [ProductService](src/main/java/com/example/basic_structure/service/ProductService.java)

## Interaction
Running the program will expose the following endpoints:
### 1. Add a new product 
[POST] http://localhost:8080/products
```json lines
//Request body example
{
  "name": "Shoes",
  "price": 59.99
}
```

### 2. Add multiple new products
[POST] http://localhost:8080/products/all
```json lines
//Request body example
[
  {
    "name": "Shoes",
    "price": 59.99
  },
  {
    "name": "Hat",
    "price": 19.95
  }
]
```

### 3. Find a product by id
[GET] http://localhost:8080/products/{id}
```json lines
//Response body example for http://localhost:8080/products/2
{
  "id": 2,
  "name": "Shoes",
  "price": 59.99
}
```

### 4. Find all products
[GET] http://localhost:8080/products
```json lines
//Response body example
[
  {
    "id": 1,
    "name": "Shoes",
    "price": 59.99
  },
  {
    "id": 2,
    "name": "Hat",
    "price": 19.95
  }
]
```

### 5. Update a product
[PUT] http://localhost:8080/products
```json lines
//Request body example
{
  "id": 1,
  "name": "Shoes",
  "price": 129.99
}
```

### 6. Delete a product by id
[DELETE] http://localhost:8080/products/{id}
```text
http://localhost:8080/products/2
```

### 7. Delete multiple products
[DELETE] http://localhost:8080/products/all
```json lines
// Request body example
[
  {
    "id": 1
  },
  {
    "id": 2
  }
]
```

### 8. Delete all products
[DELETE] http://localhost:8080/products