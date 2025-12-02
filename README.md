# inventory-management-system

This is a mini student project to learn different concepts of backend API using java, docker, postgresql.

Basically we want to create an inventory managament system of a business that is essentially a storage that keeps their data.

The data is stored using Docker with PostgreSQL, the code with Java/Spring Boot to create a main controller that communicates with the frontend.

Basic idea of the project is to create simple functions Create, Delete, Update, Delete in order to create the "skeleton" of an application management. 

!##!Development steps:!##!

Started with installing and creating a PostgreSQL container using Docker Desktop

Project config:

Implemented spring boot so it can connect with the docker to create automatically the DB.

So far the database has
Product.java which is the entity with the Id(Primary key) and the fields name,quantity and price.
p
