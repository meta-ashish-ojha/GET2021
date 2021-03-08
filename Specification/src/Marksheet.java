import java.util.Scanner;
/* this class is made for performing some operations on the marks from the user
 * Return average of all grades. 
Return maximum of all grades.
Return minimum of all grades.
Return percentage of students passed. (Assume grade >= 40 as Pass) 

 */
public class Marksheet {
	
	//function for calculating average of marks entered by user .
	public static double averageOfMarks(int[] marks,int n)
	{
		int total=0;
		for (int j=0;j<n;j++)
			total=total+marks[j];
		return total/(double)n;
	}
	
	//function to calculating minimum of marks among n students marks.
	public static int minimumOfMarks(int[] marks,int n)
	{
		int minMarks=0;
		for(int k=0;k<n;k++)
		{
			if(marks[k]<minMarks)
				minMarks=marks[k];
		}
		return minMarks;
		
	}
	
	//function for calculating maximum marks out of n students marks .
	public static int maximumOfMarks(int[] marks,int n)
	{
		int maxMarks=100;
		for(int k=0;k<n;k++)
		{
			if(marks[k]>maxMarks)
				maxMarks=marks[k];
		}
		return maxMarks;
		
	}
	
	//function for calculating percentage of students passed.
	public static float percentagePassed(int[] marks,int n)
	{
		int counter=0;
		for(int l=0;l<n;l++)
		{
			if(marks[l]>=40)
				counter++;
		}
		return ((counter/(float)n)*100);
		
	}
	
	//in main function we are taking marks of n students and then asking user to enter his choice for operation .
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of students");
		int n=sc.nextInt();
		int marks[] = new int[n];  
		System.out.println("enter marks of n students");
		for(int i=0 ; i< n;i++)
		{  
			marks[i]=sc.nextInt();
			if(marks[i]<0 || marks[i]>100)
			{
				System.out.println("invalid input re enter ");
				i--;
			}
		}
		/* we are asked to do the following operations in the question 
		 * Return average of all grades. 
		Return maximum of all grades.
		Return minimum of all grades.
		Return percentage of students passed. (Assume grade >= 40 as Pass)
		 */
		System.out.println("enter yoiur choice : \n 1:average of all grades \n 2: maximum of all grades \n 3:minimum of all grades \n 4:percentage of students passed");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			System.out.println(averageOfMarks(marks,n));
			break;
		case 2:
			System.out.println(maximumOfMarks(marks,n));
			break;
		case 3:
			System.out.println(minimumOfMarks(marks,n));
			break;
		case 4:
			System.out.println(percentagePassed(marks,n));
			break;
		default:
			System.out.println("eneter correct choice:");
			break;	
		}
	}

}
