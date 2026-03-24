# 🛒 E-Commerce System (Java OOP + UML)

A mini E-commerce system designed using Object-Oriented Programming concepts in Java.

This project demonstrates:
- Abstraction
- Inheritance (IS-A)
- Composition (HAS-A)
- Interfaces
- Polymorphism
- UML Design

---


## 🖼️ UML Class Diagram

<img width="1041" height="818" alt="image" src="https://github.com/user-attachments/assets/dec7dbbf-57a3-432a-bbaf-38a2de3a980b" />


## 📌 Project Overview

This system simulates a basic E-commerce platform where:

- Customers can add products to a cart
- Orders are created from the cart
- Payments are processed through different payment methods
- Admin can manage products

The focus of this project is on **clean OOP architecture and UML modeling**, not UI.

---

## 🏗️ UML Design Concepts Used

### 🔹 Abstract Classes
- `User` (Base abstract class for Customer and Admin)
- `Product` (Base abstract class for different product types)

### 🔹 Interfaces
- `Payment` (Implemented by CreditCardPayment, UPI, PayPal etc.)
- `Shippable` (For physical products)

### 🔹 IS-A Relationships (Inheritance)
- `Customer` IS-A `User`
- `Admin` IS-A `User`
- `PhysicalProduct` IS-A `Product`
- `DigitalProduct` IS-A `Product`

### 🔹 HAS-A Relationships (Composition)
- `Customer` HAS-A `Cart`
- `Cart` HAS-A `Product`
- `Order` HAS-A `Payment`
- `Order` HAS-A `Customer`

### 🔹 Multiplicity Examples
- One Customer → Many Orders
- One Cart → Many Products
- One Order → One Payment

---

## 📂 Project Structure

```
ECommerceProject/
│
├── ECommerceApp.java
├── model/
│   ├── User.java
│   ├── Customer.java
│   ├── Admin.java
│   ├── Product.java
│   ├── PhysicalProduct.java
│   ├── DigitalProduct.java
│   ├── Cart.java
│   ├── Order.java
│
├── payment/
│   ├── Payment.java
│   ├── CreditCardPayment.java
│   ├── UPIPayment.java
│
└── README.md
```

## 🎯 Learning Objectives

This project was built to practice:

- Designing systems using UML
- Applying OOP principles in Java
- Understanding abstraction vs interface
- Modeling real-world systems

---
