# SDP-calculator

Strategy design pattern is a behavioral design pattern in which the behavior of the object is encapsulated with a common function name.
 
Where to use a Strategic design pattern?
 We can use strategic design pattern when a different customer has a common strategy (Common operation name) but a different action to perform.
 
Why use a Strategic design pattern?
 As discussed previously, customers have a common operation name to perform. With a strategic design pattern, we can share a common interface to all customers to perform their actions as per their need.
 
Players in this pattern
Strategy: Defines a contract with a common operation.
ConcreteStrategy: Implements contact defined by the Strategy.
Product: Fulfills customer requirements using ConcreteStrategy objects by referring Strategy contract. 

We Define a common operation to student to access different actions like Addition, subtraction, multiplication, division.
 
Players in this case:
Strategy: operator
ConcreteStrategy: AddOperator, SubtractOperator, MultiplyOperator, DivisionOperator.
Product: Calculator 
Interface is the operator contract which defines a common operation called ExecuteOperation (Interface design)
Add,Sub,Multiply,Division are the concrete operators which implement a contract as defined by the operator (Strategy gonna use)

Here is the our product calculator which is going to used by customers with the help of operator contract (Final output)
  
  

Here is the student class in where the student is using a Calculator to fulfill his/her requirement.(Real Time Application).
