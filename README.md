# fruit-service-engine
# Tasks
Build of a simple mobile distributed application called fruit service engine in any architecture i.e. Java. The application communicates with a fruit service engine on the server that keeps a fruit-price table to record the different kinds of fruit's prices, takes the clients' tasks, queries the fruit-price table, does the calculation and returns all results. You will create five types of client tasks for the mobile application:
1. A client task to add a new fruit-price entity into the fruit-price table.
2. A client task to update a fruit-price entity in the fruit-price table.
3. A client task to delete a fruit-price entity in the fruit-price table.
4. A client task to give a fruit quantity, query the fruit price and calculate the fruit cost.
5. A client task to print a receipt of the whole transaction indicating the cost, the amount given and the change due plus the cashier logged into the machine.

# Implementation

Implement java servlets that receive information from the mobile application and give responses to accomplish each of the tasks above. The java servlets should communicate with the classes below that implement RMI. You will need to implement the seven classes:

• FruitComputeEngine.java - this class extends UnicastRemoteObject, implements the compute interface, and creates an object in the RMI Registry. It implements a method to execute 4 types of client tasks.

• FruitComputeTaskRegistry.java - this class looks for the fruit compute engine, creates a client task, and runs the client task on the fruit compute engine.

• AddFruitPrice.java - this class implements the Task interface. It implements the execute() method to add a new fruit-price entity to the fruit-price table.

• UpdateFruitPrice.java - this class implements the Task interface. It implements the execute() method to upgrade a fruit-price entity in the fruit-price table.

• DeleteFruitPrice.java - this class implements the Task interface. It implements the execute() method to delete a fruit-price entity from the fruit-price table.

• CalFruitCost.java - this class implements the Task interface. It implements the execute() methods to query a fruit price and calculate the fruit cost.

• CalculateCost.java – this class implements the Task interface. It implements the execute() methods to create a receipt after the purchases based on logged in clerk/cashier.
