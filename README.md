# Marketplace API

Marketplace API is a backend application for managing users and products in a marketplace system. The API provides endpoints for authentication, user management, and product management, including queries by ID, CPF, price, type, and product name.

# Getting Started
```

Requirements:
Node.js (version 18 or higher recommended)
npm or yarn

_______________________________________________________________

Installation:

Clone the repository:
git clone https://github.com/yourusername/marketplace-api.git

cd marketplace-api
_______________________________________________________________

Install dependencies:

npm install
or
yarn install

_______________________________________________________________

Configure environment variables:
Create a .env file in the project root with the following variables:
BASE_URL=http://localhost:8080

JWT_SECRET=your_secret_key
DATABASE_URL=your_database_connection_string

_______________________________________________________________

Run the application:
npm start
or
yarn start

_______________________________________________________________

The API will be accessible at http://localhost:8080

```
# API Endpoints
```

Authentication

Register: POST /api/auth/register
Create a new user account.

Login: POST /api/auth/login
Authenticate a user and receive a JWT token.

_______________________________________________________________

Users

Get User by ID: GET /users/{id}

Get User by CPF: GET /users/cpf?cpf={cpf}

Get All Clients: GET /users/clients

Get All Employees: GET /users/employees

Create User: POST /users

Delete User: DELETE /users/{id}

All user endpoints require a valid JWT token in the Authorization header.

_______________________________________________________________

Products

Get Product by ID: GET /products/{id}

Search Product by Name: GET /products/search?name={name}

List Products by Price: GET /products/prices?price={price}

List Products by Type: GET /products/types?type={type}

Create Product: POST /products

Delete Product: DELETE /products/{id}

All product endpoints require a valid JWT token in the Authorization header.

_______________________________________________________________

Environment Variables

BASE_URL = http://localhost:8080
JWT_SECRET = Secret key for signing JWT tokens
DATABASE_URL = Connection string to your database

_______________________________________________________________

Testing
Postman tests are available (in the tests folder) to validate all endpoints.

```

### License
This project is licensed under the MIT License. See [LICENSE](LICENSE) for details.
