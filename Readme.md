# POS System Backend

This is the backend API for the Point of Sale (POS) system. The frontend has been created, and this backend is expected to function as an integration with it, virtually becoming synonymous with it, thus fostering greater security, quality, and manageability which in turn enables the business logic and data.

# Introduction

POS System is a tool for effectively handling customer orders, inventory, and sales. The backend was developed using Jakarta EE while maintaining a proper layered architecture, applying best coding practices, and ensuring secure database interactions.

# Architecture

The application consists of a multi-layered structure, including the following: 

* The presentation layer - this layer is responsible for interacting with the client-side through RESTful API calls 
* The business logic layer - which is the core of the application and ensures that business rules are properly followed
* The data access layer - this layer is responsible for performing database operations using native SQL queries that are abstracted through Data Access Objects (DAOs).

# Tech Stack

* Jakarta EE: The enterprise framework for constructing the necessary applications which are robust and scalable.
* MySQL: Database relating to persistent data storage.
* AJAX/Fetch: The tool that serves as a means of communication in between the frontend and backend, to be used under asynchronous mode.
* JNDI: Java Naming and Directory Interface, the tool for handling database configurations.

# Database Configuration

JNDI is used to manage database connectivity. The persistence.xml or relevant configuration files are set up to ensure secure and efficient access to the MySQL database.

* Database: MySQL
* JNDI Name: java:/comp/env/jdbc/posDB
* Schema: The database schema includes tables for Customers, Orders, Items, and Order Details.

# API Endpoints

The backend allows access to a collection of RESTful APIs that allow for activities such as the creation of orders, modification of customer details, and the management of inventory. You can find the detailed documentation for each of these endpoints here.

Example API Endpoints:

### *  Customer Operations

* GET /posApi/customers
* POST /posApi/customers
* PUT /posApi/customers/{customerId}
* DELETE /posApi/customers/{customerId}


### * Item Operation
* GET /posApi/item
* POST /posApi/item
* PUT /posApi/item/{id}
* DELETE /posApi/item/{id}

### * Order Operations

* GET /posApi/orders
* POST /posApi/orders

# Logging

Jakarta's built-in logging mechanisms are used to implement logging. The various logging levels INFO, DEBUG, and ERROR, are applied correctly to get the events of the application captured, thus, it assists in monitoring and troubleshooting.

# Getting Started

To set up the project locally:

Clone the repository:

sh
Copy code
git clone https://github.com/username/POS_System_API.git
cd pos-system-backend

Set up the database:

Ensure MySQL is installed and running.
Import the database schema provided in the sql directory.
Configure JNDI:

Set up the JNDI resource in your Jakarta EE server configuration (e.g.TomCat).
Build and deploy the application:

Use your preferred Jakarta EE compatible server to deploy the application.

Run the application:

Access the application via the frontend connected to the backend.
