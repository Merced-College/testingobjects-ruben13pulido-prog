 1. Before toString, what printed when you printed your object? Why?

When I printed toString, it gaves me the class name "pizza: cheese:, slices 8" the method is stored to value in the fields that the constructor initlaized. The toString print stores the value at the end after default constructor and parameterized constructor is placed. 

2. List your class three fields, and their default values before you set anything. 

Dog class
name (String), default is null

breed (String), default is null

age (int), default 0


Pizza class 
pizza (String) default is null 

flavor (String), default is null

slices (int), default 0 


Album class 
album (String) default is null

boolean (explicit) default is null

songs (int) default is null

artists (String) default is null

rating (double) default is null


3. What changed after you added the default constructor? After adding the parameterized constructor?
  
  After adding the default constructor, my object fields are no longer in java default 0/null. The values I added in the default constructor gives me ("cheese", "pepperoni", 8). The parameterized constructor now creates objects with the values stored with each different pizza. 

  4. Why @Override to toString()?

  When @Override to toString() is used, it's to replace the default method from the Object class, which prints the class name and memory location. By overriding it, printing my pizza object shows the values of its fields such as ("Pizza": "Cheese", Flavor:Pepperoni, Slices:8") instead of a memory address. 

  5. Why is encapsulation (private fields + getters/setters) preferred over public fields? Give one concrete validation rule you could add to a setter. 

I believe encapsulation is preferred because it protects private fields like getters/setters to give more control over how values are changed. In my Album class, I could add a validation rule in setSongs to be sure the number of songs is always greater than 0, which prevents invalid values like -5


