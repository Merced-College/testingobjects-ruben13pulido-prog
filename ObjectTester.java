public class ObjectTester {
       
        public static void main (String[] args) {

            //make a Dog object - instantiation 
            Dog dog1 = new Dog();
            System.err.println(dog1);

            //make a Dog object - use non-default constructor
            Dog dog2 = new Dog("Karl", 3, "golden retriever");
            
             System.err.println(dog2);

        } //end main 
          
          
            

}//end class