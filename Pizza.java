// Ruben Pulido 
// 9/9/25
// Pizza class 

    public class Pizza {
        private String pizza;
        private int slices;
        private String flavor;

        // default constructor 
          public Pizza() {
            this.pizza = "cheese";
            this.flavor = "pepperoni";
            this.slices = 8;
          }

          // parameterized constructor 
            public Pizza(String pizza, String flavor, int slices) {
                this.pizza = pizza;
                this.flavor = flavor;
                this.slices = slices;
            }

         // setters
            public void setPizza(String pizza) {
                this.pizza = pizza;
            }
            public void setFlavor(String flavor) {
                this.flavor = flavor;
            }
            public void setSlices(int slices) {
                this.slices = slices;
            }

            // getters 
            public String getPizza() {
                return pizza;
            }

            public String getFlavor() {
                return flavor;
            }
            public int getSlices() {
                return slices;
            }
            @Override 
              public String toString() {
                return pizza + "," + flavor + "," + slices;
                
              }
} // end Pizza class 