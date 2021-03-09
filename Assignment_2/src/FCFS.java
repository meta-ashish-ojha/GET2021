import java.util.Scanner;
public class FCFS {
	/* Function for the  calculation of completion time of the processes
	 * and we are printing the reesult here itself.
	 */
	public static void completionTime(int[][] array, int no_Of_Process,int[] completionTime)
	{
		for(int i=0 ; i<no_Of_Process ; i++)
		{
			if(i==0){
				completionTime[i]=array[i][0]+array[i][1];
			}
			else{
				if(array[i][0]>completionTime[i-1]){
					completionTime[i]=array[i][1]+array[i][0];
				}
				else{
					completionTime[i]=completionTime[i-1]+array[i][1];
				}
			}
			
		}
	}
	/* function for calculation of turn around time 
	 * Around Time = Completion Time – Arrival Time
	 */
	public static void turnArndTime(int[][] array, int no_Of_Process,int[] completionTime,int[] turnAroundTime)
	{
		for(int j=0 ; j<no_Of_Process;j++)
			{
			turnAroundTime[j]=completionTime[j]-array[j][0];
			}
	}
	
	/*Waiting Time(W.T): Time Difference between turn around time and burst time. 
	 * Waiting Time = Turn Around Time – Burst Time.
	 */
	public static void waitingTime(int[][] array, int no_Of_Process,int[] turnAroundTime, int[] waitingTime)
	{ for(int l=0;l<no_Of_Process;l++)
	{
		waitingTime[l]=turnAroundTime[l] - array[l][1];
	}
		
	}
	
	// Average waiting time = total_waiting_time / no_of_processes .
	public static float avgWaitingTime(int no_Of_Process, int[] waitingTime)
	{	float avg=0;
		for(int k=0;k<no_Of_Process;k++)
		{
			avg=avg+waitingTime[k];
		}
		avg=avg/no_Of_Process;
		return avg;
	}
	
	//function for calculating maximum waiting time for a process
	public static int maxWaitingTime(int no_Of_Process,int[] waitingTime)
	{	int maxWaitTime=0;
		for(int m=0;m<no_Of_Process;m++)
		{
			if(maxWaitTime<waitingTime[m])
				maxWaitTime=waitingTime[m];
		}
		return maxWaitTime;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of processes");
		int noOfProcess=sc.nextInt();
		int array[][]=new int[noOfProcess][2];
		int completionTime[]=new int[noOfProcess],turnAroundTime[]=new int[noOfProcess], waitingTime[]=new int[noOfProcess];
		
		System.out.println("every array with column arrival columns arrival and burst time :");
		enterMatrixData(sc,array,noOfProcess,2);
		sortMatrixByArrivalTime(array,noOfProcess);
		
		System.out.print("Array after sorting in order of arrival time:\n");
		printMatrix(array,noOfProcess,2);
		
		completionTime(array,noOfProcess,completionTime);
		turnArndTime(array,noOfProcess,completionTime,turnAroundTime);
		waitingTime(array,noOfProcess,turnAroundTime,waitingTime);
		System.out.printf("%20s %20s %20s %20s %20s","Arrival Time","Burst Time","Completion Time","TurnAround Time","Waiting Time");
		System.out.println();
		for(int i=0;i<noOfProcess;i++)
		{
			System.out.printf("%20d %20d %20d %20d %20d",array[i][0],array[i][1],completionTime[i],turnAroundTime[i],waitingTime[i]);
			System.out.println();
		}
		
		System.out.println("Average Waiting Time: "+avgWaitingTime(noOfProcess,waitingTime));
		System.out.println("Maximum Waiting Time: "+maxWaitingTime(noOfProcess,waitingTime));
	}
	//function to take matrix input .
	public static void enterMatrixData(Scanner sc, int[][] matrix,int matrixRow,int matrixCol)
	{
		for(int i=0;i<matrixRow;i++)
		{
			for(int j=0;j<matrixCol;j++)
				matrix[i][j]=sc.nextInt();
		}
	}
	
	//function for printing the matrix .
	public static void printMatrix(int[][] matrix , int matrixRow ,int matrixCol){
		for(int i=0;i<matrixRow;i++)
		{
			for(int j=0;j<matrixCol;j++)
			{
				System.out.print(matrix[i][j]+"\t ");
			}
			System.out.println();
		}
	}
	
	//function for arranging / sorting matrix in order of arrival time
	public static void sortMatrixByArrivalTime(int[][] matrix,int matrixRow){
		int temp;
		for(int i=0;i<matrixRow;i++){
			for(int j=0;j<matrixRow-(i+1);j++)
			{
				if(matrix[j][0]>matrix[j+1][0]){
					temp=matrix[j][0];
					matrix[j][0]=matrix[j+1][0];
					matrix[j+1][0]=temp;
					temp=matrix[j][1];
					matrix[j][1]=matrix[j+1][1];
					matrix[j+1][1]=temp;
				}
			}
		}
	}
}
