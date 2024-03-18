class Vehicle{
        int price;
        String color;
        String model;
        
        Vehicle(int p,String c,String m){
              price = p;
              color = c;
              model = m;
        }

        void displayDetails(){
              System.out.println("Price of vehicle:"+price);
              System.out.println("Color of vehicle:"+color);
              System.out.println("model of vehicle:"+model);
        }

        public static void main(String args[]){
               Vehicle obj = new Vehicle(50000,"white","activa");
               obj.displayDetails();
        }
}   