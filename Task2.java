//STUDENTS GRADE CALCULATOR
import java.util.*;
class Task2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.prinln("Enter the number of subjects:");
      int subjects=sc.nextInt();
      int marks[]=new int[n];
      int total=0;
      for(int i=0;i<subjects;i++)
        {
          System.out.println("Enter the marks of subject "+(i+1)+":");
          marks[i]=sc.nextInt();
          total+=marks[i]; //for calculating total marks
        }
      System.out.println("The total marks are "+total+" out of "+(subjects*100));
      double percentage=(double) total/subjects; //for calculating percentage
      System.out.println("The percentage is "+percentage+"%");
      //Grade calculator
      if(percentage>=90)
      {
        System.out.println("Grade A");
      }
      else if(percentage>=80 && percentage<90)
      {
        System.out.println("Grade B");
      }
      else if(percentage>=70 && percentage<80)
      {
        System.out.println("Grade C");
      }
      else if(percentage>=60 && percentage<70)
      {
        System.out.println("Grade D");
      }
      else if(percentage>=50 && percentage<60)
      {
        System.out.println("Grade E");
      }
      else
      {
        System.out.println("Grade F");
      }
    }
  }
