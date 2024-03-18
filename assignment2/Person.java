class Person{
        int age;
        int height;
        int weight;

        Person(){
            age = 10;
            height = 67;
            weight = 25;
            }
 
        Person(int a, int h, int w){
            age = a;
            height = h;
            weight = w;
        }

        void displayDetails(){
            System.out.println("age :"+age);
            System.out.println("height :"+height);
            System.out.println("weight :"+weight);
            }

        public static void main(String args[]){
            Person p1 = new Person();
            p1.displayDetails();
            p1 = new Person(34,99,78);
            p1.displayDetails();
            Person p2 = new Person(12,77,45);
            p2.displayDetails();
            }
}
            
            
  