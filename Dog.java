//Ruben Pulido
// 9/9 25
//Dog class 

   public class Dog {
     // Intentionally empty for now: no fields, no constructors, no methods.
    private String name;
    private int age;
    private String breed;

    //default constructor
    public Dog () {
      this.name = "Hank";
      this.age = 1;
      this.breed = "Lab";    
    }

    //default constructor
    public Dog (String name, int age, String breed) {
      this.name = name;
      this.age = age;
      this.breed = breed;   
    }
      
      //setters - acessors
      public void setName(String name) {
        this.name = name;
      }

      public void setBreed(String breed) {
        this.breed = breed;
      }

      //getters - mutators
      public String getName() {
        return name;
      }
    
        @Override
      public String toString() {
        return name + "," + age + "," + breed;
        //only print dogs name 
         
         }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }
   
  } //end Dog class


