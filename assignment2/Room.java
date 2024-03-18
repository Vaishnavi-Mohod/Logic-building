
class Room{
         int height;
         int width; 
         int breadth;
         
         void getVolume(int h,int w,int b){
              height = h;
              width = w;
              breadth =b;
              int volume = height*width*breadth;
              System.out.println(volume);
         }
         
         public static void main(String args[]){
              Room obj = new Room();
              obj.getVolume(8,9,4);
              }
}
              
