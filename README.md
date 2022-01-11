# Design-Principles

## Decorator Pattern
 the decorator pattern is a design pattern where each class is decorated or covered with another class.
 
 the working principle is very simple:
 - Create a Base "interface" (abstract of an actual Java interface), add the fields and methods as appropritate
  - create concrete implementation of the inteface
    - create another "interface with will be the decorator. this decorator will be inherit and compose the Base interface
    - the reason for inheriting the Bse is to ensure that the subclasses will be of thesame type as the >Objects they will be decorating
    - the reason of composition is to ensure that objects can be decorated at runtime instead of at compile it in the case of inheritance
