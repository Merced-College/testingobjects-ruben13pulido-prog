public class ObjectTester {
       
       public static void main(String[] args) {

        // create album object 
        
        Album album1 = new Album();
        System.err.println(album1);

        Album album2 = new Album("The Lost Planet", true, 10, "Bruno Mars", 4.5);
        System.err.println(album2);


        Album album3 = new Album("Chainsmokers", false, 12, "The Chainsmokers", 4.8);
        System.err.println(album3);

        Album album4 = new Album ("After hours", true, 12, "The Weeknd", 3.6);
        System.err.println(album4);
     
       }


   } // end main

