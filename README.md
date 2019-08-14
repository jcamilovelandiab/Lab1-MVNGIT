# AREM Laboratory #1

In this laboratory a generic linked list was implemented. The mean and standard deviation were calculated based on the linked list elements.

## Prerequisites

It is necessary to have installed java 1.8 and Apache Maven 3.6.0  on the computer where the program will run.

## Program description

The linked list was implemented with a Node class. The node class has the following structure:

  ![](https://github.com/jcamilovelandiab/TareaMVNGIT/blob/master/images/Node%20structure.png)

A data that is the node’s value, and next what is the neighboor on the right (The node that it is pointing at).

  ![](https://github.com/jcamilovelandiab/TareaMVNGIT/blob/master/images/LinkedList%20structure.png)

The linked list is composed of a several nodes, and each node has a data and is pointing to another node.

The following formulas were used to calculate the mean and standard deviation of the linked list.

![](https://github.com/jcamilovelandiab/TareaMVNGIT/blob/master/images/formulas.jpg)

The program takes these values from the file text1.txt.
You can change the data if you want to test the program with another values.

![](https://github.com/jcamilovelandiab/TareaMVNGIT/blob/master/images/table.PNG)


## RUNNING THE PROJECT

To download the project dependencies the following line must be executed.

```
mvn package
```
Execute this line to see the java documentation.

```
mvn javadoc:jar
```
To execute the program the following line must be executed.
```
java -cp target/TareaMVNGIT-1.0-SNAPSHOT.jar edu.escuelaing.arem.TareaMVNGIT.App
```
## RESULTS

### Mean
![](https://github.com/jcamilovelandiab/TareaMVNGIT/blob/master/images/mean_results.png)
### Standard deviation
![](https://github.com/jcamilovelandiab/TareaMVNGIT/blob/master/images/deviation_results.png)


# Author

Juan Camilo Velandia Botello - Escuela Colombiana de Ingeniería Julio Garavito
