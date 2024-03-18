class Box{
      int height;
      int width;
      int breadth;
       
      Box(int h, int w,int b){
              height = h;
              width = w;
              breadth = b;
      }
 
      void getvolume(){
              float volume = height*width*breadth;
              System.out.println("Volume of box is :"+volume);
      }
       
      void getArea(){
              float Area = width*breadth;
              System.out.println("Area of box is :"+Area);
      }
       
      public static void main(String args[]){
              Box b1 = new Box(3,5,6)
              BoX b2 = new Box(6,7,5)
              b1.getVolume();
              b1.getArea();
              b2.getVolume();
              b2.getArea();
      }
}
    

         