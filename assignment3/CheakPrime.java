import java.util.Scanner;
class CheakPrime{
             public static void main(String args[]){
                   int i=0;
                   int n=0;
                   int m=0;
                   int flag=0;
                   Scanner sc = new Scanner(System.in);
                   n=sc.nextInt();
              
                   if(n==0||n==1){
                       System.out.println(n+"is not prime number");
                   }
                   else{
                       for(i=2;i<=m;i++){
                            if(n%i==0){
                                 System.out.println(n+"is prime number");
                                 flag=1;
                                 break;
                            }
                       }
                       if(flag==0){
                            System.out.println(n+"is prime number");
                       }
                   }
                   }
}
