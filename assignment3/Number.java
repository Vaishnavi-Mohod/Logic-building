class Number{

       public static void main(String args[]){
       int i = 1;
       
       while(i<10){
            i++;
            int j = 2;
            if(j==0)
                 break;
            else if (j==1)
                 continue;
            System.out.println(i);

        }
     System.out.println("finished");
     }
}

//q5 : if we give i =1 ,j=1 it will print finished. if we give value of i=1,j = 2 it will print no 2,3,4,5,6,7,8,9 finished.