import java.util.Scanner;

public class Quiz1 {
	public static void main(String Args[])
	{
		System.out.println("Enter the number of weeks for which you want to calculate the infection rate.");
		Scanner Keyboard= new Scanner(System.in);
		int weeks= Keyboard.nextInt();
		int total=0;
		for(int i=1; i<= weeks; i++)
		{
			total=total+35;
			System.out.println("Number of Instructors effected at the end of week "+i+" is: "+total);
		}
		System.out.println("Number of Instructors effected in total: "+total);
		
	}

}
