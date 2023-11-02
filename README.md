# CHALLENGE 1

## OBJECT ORIENTATION IN JAVA

Object orientation is a programming paradigm widely used to develop complex and modularized systems. One of the fundamental characteristics of this paradigm is the capacity to establish hierarchical relations between classes, through the concept of inheritance. In Java, a robust and popular object-oriented programming language, inheritance is a powerful tool that allows you to create new classes based on existing classes, sharing resources and behavioral.

Inheritance allows a class, called a child class or subclass, to inherit attributes and methods of a parent class or superclass. This inheritance relationship establishes an authority, where subclasses can add new attributes and methods or modify existing ones. In this way, it is possible to create an organized and reusable class structure, facilitating the maintenance of the code and promoting the modularity.

In addition to inheritance, another important object-oriented concept is polymorphism. Polymorphism allows objects of different classes to be treated uniformly, being able to respond to method calls in a specific way for each class. This means that an object can take various forms, depending on the context in which it is used. In Java, polymorphism is usually implemented through interfaces or abstract classes, which define a set of methods that must be implemented by the classes that implement or inherit them.

The combination of inheritance and polymorphism in Java offers great flexibility in creating object-oriented systems. Inheritance lets you structure classes hierarchically and reuse code, while polymorphism makes it possible to treat objects in a generic way, but with behavior specific. These concepts are essential to create more flexible, extensible, and easy-to-use systems.

**Question**

Consider the development of a vehicle control system, where it is necessary to model different types of vehicles and their characteristics. Your task is to implement a base class "Vehicle" that has the following attributes:

- Engine (Yes/No)
- Handwheel (Yes/No)
- Number of passengers
- Number of ports
- Quantity of wheels
- Is it load (Yes/No)
- Load capacity (KG)

In addition to these attributes, the "Vehicle" class must contain an attribute called "Fuel", which will be represented by another class with the following attributes:

- Gasoline
- Alcohol
- Diesel
- Electricity
- Human
- Animal

Your task is to write the "Vehicle" class using concession and polymorphism, making the most of the features offered by the Java language. Remember that inheritance allows a child class to inherit attributes and methods from a parent class, while polymorphism allows treating objects of different classes uniformly. Use these concepts to create a hierarchical structure of classes that represent the different types of vehicles and their characteristics.

To help, you can create child classes of the "Vehicle" class to represent different categories of vehicles, such as "Car", "Motorcycle" and "Truck". Each of these child classes can add attributes specific class and/or override methods of the parent class, if necessary. Don't forget to define the constructors, getters and setters to access and manipulate the class attributes "Vehicle" and its subclasses, as needed.

In addition to the “Vehicle” base class, you must implement the following child classes:

- **Motorcycle**

  - Additional attribute:
    - Electric start

- **Bicycle**

  - Additional attributes:
    - It's electric
    - Has a luggage rack

- **Chariot**

- **Truck**

  - Additional attribute:
    - Number of axles

- **Car**

  - Additional attributes:
    - It has air conditioning
    - It has a radio

Tip: Use the keyword "extends" to establish the inheritance relationship between classes.

Help on how to use the "Fuel" class:

![Fuel Class](https://github.com/ualaci/ChallengeVeiculos/blob/3d21cf069b031db3a31ddf1a9adae8b78366b292/challenge1.png)
