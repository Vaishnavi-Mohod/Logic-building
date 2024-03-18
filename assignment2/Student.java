class Student{
          String name;
          int mark1;
          int mark2;
          int mark3;
          int total;
           
          void infoStudent(String n, int m1, int m2, int m3){
                   name = n;
                   mark1 = m1;
                   mark2 = m2;
                   mark3 = m3;
                   total = m1+m2+m3;
          }

          void getAvgMarks(){
                   float average = total/3;
                   System.out.println("Average marks of student:"+average);
          }

          void getStudentDetails(){
                    System.out.println("student name:"+name);
                    System.out.println("totalmarks obtain:"+total);
          }

          public static void main(String args[]){
                     Student obj = new Student();
                     obj.infoStudent("Vaishnavi",89,87,77);
                     obj.getAvgMarks();
                     obj.getStudentDetails();
}          }


                   
           
          

            