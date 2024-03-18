
class AverageArray{
              public static void main(String args[]){
                    int a[] = new int[]{5,4,3,9,1,7,9};
                    int sum =0;
                                                                                                  
                    for(int i=0;i<a.length;i++){
                        sum = sum + a[i];
                    }
                    int average = sum/a.length;
                    System.out.println("Average is: "+average);
              }

}
                    
               