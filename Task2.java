import java.util.Scanner;

public class Task2
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        int sub;
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter No.of Subjects: ");
        sub = scanner.nextInt();
		
        
        for(i=0; i<sub; i++) { 
           System.out.print("Enter Marks of Subject "+(i+1)+": ");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        avg = total/sub;
        System.out.print("The Student Grade is: ");
        for(i=0; i<sub; i++) { 
           if(marks[i]<40){
            System.out.print("Fail, Failed in One/More Subjects"+ " His/Her % are: ");
        }
        }
        if(avg>=70)
        {
            System.out.print("Grade : Distinction, " + avg + "%");
        }
        else if(avg>=60 && avg<69)
        {
           System.out.print("Grade : First Class, " + avg + "%");
        } 
        else if(avg>=50 && avg<59)
        {
            System.out.print("Grade : Second Class, " + avg + "%");
        }
        else if(avg>=40 && avg<49)
        {
            System.out.print("Grade : Pass Class, " + avg + "%");
        }
        else{
            System.out.print("Grade : Fail, " + avg + "%");
        }
    }
}
