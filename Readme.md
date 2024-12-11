# System Design Fundamentals Learning Plan

## Day-wise Schedule

---

### ✅ Day 1: Fundamentals
- **What is System Design?**
  
        Its about planning how   a software application or service should be built which works Efficiently  and fullfill user's requirment.
      basically its a blueprint for developers to build a robust,scalable and maintainable system.
        
- **System Design Fundamentals**
  
                    The fundamentals of system design involve several core principles and components that provide a foundation for creating robust, scalable, and efficient systems. Here are the key fundamentals:

      1. Scalability
      Vertical Scaling: Adding more resources (CPU, memory) to a single server to handle increased load.
      Horizontal Scaling: Adding more servers or instances to distribute load. This is usually more effective for handling high traffic.
      Design systems to be scalable from the start to accommodate growth in users, data, and transactions.
      2. Load Balancing
      Distributes incoming traffic across multiple servers to avoid overloading a single server and improve system reliability.
      Common methods include Round Robin (even distribution), Least Connections (least busy server), and IP Hashing (based on user IP address).
      3. Caching
      Caching is storing frequently accessed data temporarily in a high-speed storage layer (like memory) to speed up response times.
      Types include Client-side caching (e.g., browser), Server-side caching (storing results on server memory), and CDN caching (using a Content Delivery Network to cache content close to users).
      4. Database Design and Sharding
      Normalization and Denormalization: Ensuring efficient data storage and access.
      Indexing: Using indexes to speed up database queries.
      Sharding: Dividing a database into smaller, faster, and more manageable pieces, often based on user ID or geography.
      5. Data Consistency and Availability
      Consistency: Ensuring all users see the same data at the same time.
      Availability: Making sure the system is always up and accessible.
      The CAP Theorem explains that in a distributed system, you can only have two of the following three: Consistency, Availability, and Partition Tolerance (the ability to continue operating despite network splits).
      6. Microservices Architecture vs. Monolithic Architecture
      Monolithic Architecture: The entire system is built as a single unit.
      Microservices Architecture: The system is divided into smaller, independent services that communicate with each other, often using APIs. Microservices improve scalability, make deployment easier, and allow teams to work independently.
      7. APIs and Communication Protocols
      RESTful APIs: Use HTTP methods to interact with web services.
      GraphQL: Provides a more flexible query language for APIs.
      gRPC: A high-performance protocol, especially useful for microservices needing low-latency communication.
      8. Security and Authentication
      Encryption: Securing data in transit (e.g., TLS) and at rest.
      Authentication & Authorization: Ensuring that users are who they say they are (e.g., OAuth, JWT) and have the correct permissions.
      Rate Limiting: Preventing abuse by limiting the number of requests from a user or IP address.
      9. Reliability and Fault Tolerance
      Replication: Duplicating data across multiple nodes for high availability.
      Redundancy: Having backup components so if one fails, another can take over.
      Failover: Automatic switching to a backup server if the primary one fails.
      10. Monitoring and Logging
      Tracking system health and performance with monitoring tools (e.g., Prometheus, Grafana).
      Logging to troubleshoot issues and understand user behavior (e.g., ELK Stack - Elasticsearch, Logstash, Kibana).
      11. Event-Driven Architecture and Message Queues
      Using events and queues (e.g., Kafka, RabbitMQ) for asynchronous processing and to decouple components.
      Helps manage high loads, enables scalable systems, and improves reliability.
      12. CDNs and Global Distribution
      Content Delivery Networks (CDNs) store copies of content in multiple locations worldwide, reducing latency for users globally.
      These fundamentals form the core concepts for designing scalable, resilient, and efficient systems. Having a strong grasp of these will help in approaching more advanced system design problems.
- **System Design Strategies**
- **What is Low Level Design?**

---

### Day 2: Unified Modeling Language (UML)
- **What is Unified Modeling Language?**
- **What is Use Case Diagram?**
- **What is Class Diagram?**
- **What is Sequence Diagram?**
- **Activity Diagram in System Design**

---

### ✅ Day 3: SOLID Principles [Link](https://www.freecodecamp.org/news/solid-principles-explained-in-plain-english/)
        Solid principles are five principles to design a class.
- **What are SOLID Principles?**

         1. Single Responsibility Principle
         2. Open Closed Principle
         3. Liskov substitution principle
         4. Interfce Segregation principle
         5.  Dependency Inversion principle
- **What is Single Responsibility Principle?** [code link](https://github.com/niveditaprity/Low-Level-Designs/tree/main/src/SOLID_Principle/SingleResponsibility)

         Single Responsibility Principle states that there should be only one reason to change a class. It ensures that code is modular
         easy to maintain and less prone to bugs.

         
- **Open-Closed Principle** [code link](https://github.com/niveditaprity/Low-Level-Designs/tree/main/src/SOLID_Principle/OCP)

      Open-Closed principle states that Software entities like classes, modules, or functions should be open for extension but not for modification means we can
      add new functionality without changing the existing code.
      it is required to avoid bugs in tested code.
- **Liskov Substitution Principle** [code link](https://github.com/niveditaprity/Low-Level-Designs/tree/main/src/SOLID_Principle/LSP)

      LSP states that objects of superclass can be replacable with the objects of its child class's objects
- **Interface Segregation Principle** [code link](https://github.com/niveditaprity/Low-Level-Designs/tree/main/src/SOLID_Principle/ISP)
  
       The Interface Segregation Principle (ISP) states that a class should not be forced to implement interfaces it does not use. Instead of creating large, general-purpose interfaces, it’s better to create smaller, more specific interfaces tailored to specific client needs.
- **Dependency Inversion Principle** [Code Link](https://github.com/niveditaprity/Low-Level-Designs/tree/main/src/SOLID_Principle/DIP)

       The Dependency Inversion principle states that our classes should depend upon interfaces or abstract classes instead of concrete classes and functions.
       The Dependency Inversion Principle (DIP) is one of the key principles of SOLID. It states:
      High-level modules should not depend on low-level modules. Both should depend on abstractions.
      Abstractions should not depend on details. Details should depend on abstractions.
      This principle promotes loose coupling between high-level (business logic) and low-level (implementation details) modules by relying on interfaces or abstract classes rather than concrete implementations.

---

### ✅ Day 4: Other Principles
- **KISS (Keep It Simple, Stupid)**

       This principle emphasizes on simplicity and the solutions that are simple, easy to maintain, easy to implement, to avoid over complexity ,
        over engineering
         focus on 1. Simplified Architecture
                  2. Readable Code
                  3. Easy To Maintain,Implement
                  4.Avoid over optimization
                  5.User Centric
                
- **DRY (Don’t Repeat Yourself)**

        DRY encourages developers to write code in a way that minimizes redundancy. Instead of duplicating code,
        developers should create reusable components, functions, or modules that can be shared and applied in multiple parts of the codebase.
- **YAGNI (You Aren't Gonna Need It)**

        It is a principle in software development that suggests developers should only implement features that are
        necessary for the current requirements and not add any additional functionality that might be needed in the future.

---

### ✅ Day 5: Object-Oriented Programming (OOP) Concepts
- **What are Classes and Objects?**
- **Classes vs Objects**
- **Inheritance in OOP**
- **Advantages and Disadvantages of Inheritance**

      Use an interface when:
      You need to define a contract (set of methods) that multiple classes must follow, but the implementation of those methods will differ.
      You want to achieve multiple inheritance (a class can implement multiple interfaces).
      You want to define common behavior for unrelated classes (classes that don’t share a common superclass).
      You need to provide default method implementations while allowing overriding.
      You want to use polymorphism to allow different objects to be treated as the same type.

      What are the advantages of inheritance?
        Code Reusability: You can reuse existing code by inheriting from a parent class.
        Method Overriding: You can customize the behavior of a method in the child class.
        Polymorphism: Allows you to treat objects of different classes as objects of a common superclass, enabling flexibility in code design.
      What is the "super" keyword in Java?
        The super keyword is used to refer to the immediate parent class. It is used to:
        Access parent class constructors.
        Call parent class methods (if they are overridden).
        Access parent class fields (if they are not private).
      Key Concepts to Review for Inheritance Interviews:
        Inheritance basics: extends, method overriding, method hiding, constructors.
        Polymorphism: Method overriding and runtime polymorphism.
        Access modifiers: private, protected, public, and inheritance visibility.
        Abstract classes and interfaces: Differences, use cases, and when to use each.
        Constructor chaining: Using super() and this() to call constructors.
        Multiple inheritance: Achieved via interfaces, and how Java avoids the diamond problem.
        Default methods in interfaces: Introduced in Java 8, how they work with inheritance.


---

###  Day 6: Polymorphism in OOP
- **Introduction to Polymorphism**
- **Compile-Time Polymorphism**
- **Runtime Polymorphism**

---

### ✅ Day 7: Design Patterns Introduction
- **What are Design Patterns?**
- **What are Anti-Patterns?**

---

### ✅ Day 8: Creational Patterns Overview
- **Introduction to Creational Design Patterns**

      Craetional Design patterns focus on seperating object creation logic from business logic
      so that we can focus on only what to create than how to create an object.
      Creational design patterns provide various object creation mechanisms,
       which increase flexibility and reuse of existing code.
- **Factory Pattern** – Introduction, concept, and examples.

      The Factory Design Pattern is a creational design pattern that provides an interface or method to create objects in a super class,
      but allows subclasses to alter the type of objects that will be created.
      It abstracts the instantiation logic, making the code more flexible and easier to extend.
      When to Use Factory Pattern:
        When the exact type of object to be created is determined at runtime.
        When object creation logic is complex or subject to frequent changes.
        When you want to centralize object creation logic to ensure consistency.

-  **Abstract Factory Pattern** – Introduction, concept, and examples.


        Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.
-  **Singleton Pattern** – Definition, implementation, use cases, and examples.

        The Singleton Design Pattern ensures that a class has only one instance while providing a global point of access to that instance.
        It's commonly used to manage shared resources or global state.

        Key Characteristics
        Single Instance: Only one object of the class is created during the application's lifecycle.
        Global Access Point: The instance is accessible globally using a static method or variable.
        Controlled Access: The class itself controls how and when the single instance is created
        
---

### Day 9: Creational Design Patterns
- **Builder Pattern** – What it is, how it works, and its applications.
- **Prototype Pattern** – Concept, use cases, and implementation examples.

---

### Day 10: Structural Design Patterns Overview
- **Introduction to Structural Design Patterns**
---

### Day 11: Structural Design Patterns
- **Adapter Pattern** – Introduction, definition, and examples.
---

### Day 12: Proxy Pattern
- **Proxy Pattern** – Use cases, implementation, and scenarios.

          Proxy design pattern is used to create a representative  object which controls access to object which is expensive,remote or in need of being secured.
          The important point is that the client does not know about the proxy, the proxy acts as an original object for the client.
          There are three main variations to the Proxy Pattern:
              • A remote proxy provides a local representative for an object in a different address space.
              • A virtual proxy creates expensive objects on demand.
              • A protection proxy controls access to the original object. Protection proxies are useful when objects should have different access rights.



---

### Day 13: Composite Pattern
- **Composite Pattern** – Definition, working, and real-world examples.

---

### Day 14: 
- **Decorator Pattern** – Use cases, implementation, and examples.

---

### Day 15: 
- **Facade Pattern** – Concept, how it works, and examples.

---

### Day 16: 
- **Introduction to Behavioral Design Patterns**

---

### Day 17:
- **Chain of Responsibility Pattern** – Definition, uses, and examples.

        The Chain of Responsibility pattern is a behavioral design pattern that lets you pass requests along a chain of handlers. Each handler decides either to process the request or to pass it along to the next handler in the chain. This pattern promotes loose coupling between the sender of a request and its receivers.

      Here’s an easy explanation:
      
      Think of a Help Desk
      Imagine you have a customer support system with three levels of support:
      
      Level 1: Handles basic questions like password resets.
      Level 2: Handles more technical issues.
      Level 3: Handles the toughest problems.
      When a customer contacts support:
      
      Level 1 tries to solve the problem.
      If it can't, it forwards the issue to Level 2.
      If Level 2 also can't handle it, the issue goes to Level 3.
      This is exactly how the Chain of Responsibility works! Each "handler" in the chain either processes the request or forwards it.
      
      Why Use It?
        Flexibility: You can easily add or modify handlers in the chain.
        Decoupling: The sender of the request doesn’t need to know which handler will process it.
        Reusability: Handlers can be reused in different chains.
      Key Points
        Each handler knows only about the next handler in the chain.
        Handlers can process requests or pass them along.
        It's easy to extend or modify the chain by adding or reordering handlers.
        This pattern is widely used in logging systems, event handling, and request validation.

---

### Day 18: 
---

### Day 19: 

---

### Day 20: Behavioral Design Patterns

---

### ✅  Day 21: Observer Pattern
- **Observer Pattern** – Use cases, working, and implementation.

        The Observer Design Pattern is a behavioral design pattern used to establish a one-to-many dependency between objects. When one object (called the subject) changes its state, all its dependent objects (called observers) are automatically notified and updated.

      Key Concepts:
      Subject: Maintains a list of observers and provides methods to add, remove, or notify them.
      Observers: Objects that want to be notified of changes in the subject.
      Notification Mechanism: A way for the subject to inform observers when its state changes.
      Advantages:
        Loose coupling between subject and observers.
        Easy to add or remove observers dynamically.
        Supports broadcast communication.


---

### ✅ Day 22: Strategy Pattern
- **Strategy Pattern** – Concept, how it works, and practical applications.

       The Strategy Design Pattern is a behavioral design pattern that defines a family of algorithms, encapsulates each one,
        and makes them interchangeable. It lets the algorithm vary independently from the clients that use it.

        Advantages:
          Flexibility: Allows changing the behavior of a class by changing the strategy.
          Encapsulation: Keeps algorithms separate and promotes the Single Responsibility Principle.
          Extensibility: Adding new strategies is straightforward.
        Disadvantages:
          Complexity: Adds complexity due to the creation of multiple strategy classes.
          Context Dependency: The context must be aware of all potential strategies.
  - Question: Design a Ticket Pricing System
      You are tasked with designing a Ticket Pricing System for a travel booking platform. The system calculates ticket prices based on different pricing strategies. Each strategy           considers factors like age, travel class, and booking time.
      
      Requirements:
      The base price for a ticket is fixed but can be adjusted using different pricing strategies.
      Pricing Strategies:
      Regular Pricing: No discount or extra charges.
      Early Bird Pricing: Offers a 10% discount if the booking is made at least 30 days before the journey.
      Senior Citizen Pricing: Provides a 15% discount for passengers aged 60 or above.
      Premium Pricing: Adds a 20% surcharge for business-class travelers.
      The system should be flexible enough to allow adding more strategies in the future.
      You need to design the system such that the pricing strategy can be selected dynamically at runtime.

---

### Day 23: Command Pattern
- **Command Pattern** – Definition, real-world applications, and examples.

---

### Day 24: State Pattern
- **State Pattern** – Introduction, implementation, and use cases.

---

### Day 25: Low-Level System Design Patterns Overview
- **Introduction to Low-Level System Design Patterns**

---

### Day 26: Low-Level System Design Patterns
- **Event-Driven Architecture** – Overview, advantages, and examples.

---

### Day 27: Circuit Breaker Pattern
- **Circuit Breaker Pattern** – Definition, use cases, and examples.

---

### Day 28: API Gateway Pattern
- **API Gateway Pattern** – Concept, advantages, and use cases.

---

### Day 29: Aggregator Pattern
- **Aggregator Pattern** – Definition, working, and implementation.

---

### Day 30: Bulkhead Pattern
- **Bulkhead Pattern** – Concept, uses, and examples.

---

### Day 31: Saga Pattern
- **Saga Pattern** – What it is, use cases, and real-world applications.

---

### Day 32: Encapsulation in OOP
- **Encapsulation in OOP** – Introduction, benefits, and examples.

---

### Day 33: Abstraction in OOP
- **Abstraction in OOP** – Concept, abstract classes vs interfaces.

---

### Day 34: Relationships in OOP
- **Association, Aggregation, and Composition** – Definitions, differences, and examples.

---

### Day 35: Composition vs Aggregation
- **Composition vs Aggregation** – Understanding the differences.

---

### Day 36: Composition vs Inheritance
- **Composition vs Inheritance** – When to use each.

---

### Day 37: Dependency Injection
- **Dependency and Dependency Injection** – Concept and examples.

---

### Day 38: Cohesion and Coupling
- **Cohesion and Coupling** – Definitions, importance, and examples.

---

### Day 39: Database Modeling Introduction
- **What is Database Modeling?**
- **Importance of Database Modeling**

---

### Day 40: Relational Database Fundamentals
- **RDBMS Fundamentals**
- **ACID Properties**
- **Primary and Foreign Keys**

---

### Day 41: Normalization and Denormalization
- **Normalization in DBMS**
- **Need for Normalization**
- **Denormalization: When and Why?**
- **Normalization vs Denormalization**

---

### Day 42: NoSQL Database Overview
- **Introduction to NoSQL Databases**
- **Document Databases**
- **Key-Value Stores**

---

### Day 43: More NoSQL Database Types
- **Column-Family Stores**
- **Graph Databases**

---

### Day 44: Data Relationships and Models
- **What is Data Relationship?**
- **UML Class Diagrams**

---

### Day 45: Performance Optimization
- **Query Optimization Strategies**
- **Indexing Techniques**
- **Types of Indexes**

---

### Day 46: Indexing Best Practices
- **Indexing Best Practices**
- **Partitioning and Sharding**
- **Horizontal vs. Vertical Partitioning**

---

### Day 47: Security and Data Integrity
- **Data Integrity Constraints**
- **Access Control Mechanisms**
- **Secure Password Storage Techniques**

---

1.[Parking Lot Blog](https://medium.com/@madhankumaravelu93/low-level-system-design-parking-lot-design-part-i-7567d510da1d)


