
class MinMax{
          public static void main(String args[]){
               int array[] = new int[]{5,4,3,9,1,7,9};
               int min=array[0];
               int max=array[0];
       
               for(int i=0;i<array.length;i++){
                    if(array[i]<min){
                         min = array[i];
                    }
               }
               System.out.println("Minimum number is :"+min);

               for(int i=0;i<array.length;i++){
                    if(array[i]>max){
                         max = array[i];
                    }
               }
               System.out.println("Maximum number is :"+max);

               
          }
}