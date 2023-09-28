# SoftwareDesignAssignment1

Members: Nisarg Bharucha (100820217), Shiv Patel (100818727), Joshua Cardoz (100827231)

![image](https://github.com/Vromaniac/SoftwareDesignAssignment1/assets/115129648/cf451f65-9bdb-468a-a609-0cdfda094d14)


All of the relevant code and files are located within our "src" folder. 
Firstly, the "Fruit" interface helps with the creation of new fruit classes, such as "Banana" and "Apple". These classes inherit the methods from the interface, such as getters and setters for price, and getting the name of the fruit. 

Once the fruit objects can be created, we then use the second interface, the "GroceryProductInterface" to help with creating these fruit objects. Both the "AppleFactory" and "BananaFactory" inherit this interface, and create their respective fruits. Once the fruits have been created in these factories, the factories then call a method from the "FileReader" class, to fetch the price of the fruit from the mock database (prices.txt) and sets the price of the fruit to that value.

In the "Main" class, our code is tested by creating instances of both the Apple and Banana Factory from the "GroceryProductFactory" interface, and then both factories call the "createFruit" method. This successfully creates both the "apple" and "banana" objects with the correct price found in the database, which is shown below: 

![image](https://github.com/Vromaniac/SoftwareDesignAssignment1/assets/115129648/dbfc8e71-fd14-4765-8e26-ab01376fb96f)
![image](https://github.com/Vromaniac/SoftwareDesignAssignment1/assets/115129648/7594693b-328e-4149-beef-60e28c6612ea)



