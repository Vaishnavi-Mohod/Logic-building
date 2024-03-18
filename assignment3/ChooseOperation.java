import java.util.Scanner;
class ChooseOperation{
             public static void main(String args[]){
                int num1;
                int num2;
                System.out.println("enter num1:");
                Scanner a = new Scanner(System.in);
                num1 = a.nextInt();

                System.out.println("enter num2:");
                Scanner sc = new Scanner(System.in);
                num2 = sc.nextInt();
      
                int choice;
                System.out.println("choose an operation");
                System.out.println("1. Addition");
                System.out.println("2. Substraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                
                System.out.println("Enter your choice");
                Scanner b = new Scanner(System.in);
                choice = b.nextInt();

                int result;
                
                
                      switch(choice){
                           case 1:
                                 result = num1+num2;
                                 System.out.println("result :"+num1+"+"+num2+"="+result);
                                 break;
                           
                           case 2:
                                 result = num1-num2;
                                 System.out.println("result :"+num1+"-"+num2+"="+result);
                                 break;
                           
                           case 3:
                                 result = num1*num2;
                                 System.out.println("result :"+num1+"*"+num2+"="+result);
                                 break;

                           case 4:
                                 result = num1/num2;
                                 System.out.println("result :"+num1+"/"+num2+"="+result);
                                 break;
                     }
                

             }
}
                           
                           
                

                