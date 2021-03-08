import java.util.Scanner;
/* the purpose of this class is to make following functions 
 * Compare two strings and return 1 if equals else 0. Take two string inputs, compare them and return values accordingly.
Return the reverse of any string. 
Receive a string as parameter and replace lowercase characters with uppercase and vice-versa. 
Return the largest word of a string. If two words are of same length then return last word.
*/
public class StringOperations {
	
	/*this function is comparing two strings and checking that they are equal or not , if
	 * they are equal it will return 1 else 0 .
	 */
	public static int compareStrinngs(String s1, String s2)
	{
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)!=s2.charAt(i))
					return 0;
			}
			return 1;
		}
		return 0;
	}
	
	//this functin reverses the string elements and returns the reversed one .
	public static String reverseString(String s1)
	{
		int len=s1.length();
		char temp;
		char[] tempArray=s1.toCharArray();
		for(int i=0;i<(int)(len/2);i++)
		{
			temp=tempArray[i];
			tempArray[i]=tempArray[len-i-1];
			tempArray[len=i-1]=temp;
		}
		return new String(tempArray);
	}
	
	//this functins changes letters of strings to opposite case .
	public static String changeCase(String s1)
	{
		int len=s1.length();
		char[] tempArray=s1.toCharArray();
		for(int i=0;i<len;i++)
		{
			if(tempArray[i]>='a' && tempArray[i]<='z'){
				tempArray[i]=(char)(tempArray[i]-32);
			}
			else{
				if(tempArray[i]>='A' && tempArray[i]<='Z'){
				tempArray[i]=(char)(tempArray[i]+32);
				}
				
			}
				
		}
		return new String(tempArray);
		
	}
	
	//this function returns the largest word in the given string .
	public static void largestWord(String s3)
	{
		int maxLen=0;
		String maxLenWord="";
		String[] words=s3.split("\\s+");
		for(String word:words)
		{
			if(word.length()>=maxLen){
				maxLen=word.length();
				maxLenWord=word;
				
			}
		}
		System.out.println(maxLenWord);
	}
	public static void main(String[] args)
	{   
		Scanner sc=new Scanner(System.in);
		String s1 , s2 , s3;
		System.out.println("enter the strings");
		s3=sc.nextLine();
		s1=sc.next();
		s2=sc.next();
		
		// asking from the user that which operation he want to perform and will call the required function .
		System.out.println("enter your choice: \n 1: compare the strings \n 2:reverse the strings \n 3: change the case \n 4: Largest word of the string");
		int choice=sc.nextInt();
		switch(choice){
		case 1:
			System.out.println(compareStrinngs(s1,s2));	
			break;
		case 2:
			System.out.println(reverseString(s1));
			break;
		case 3:
			System.out.println(changeCase(s1));
			break;
		case 4:
			largestWord(s3);
			break;
		default:
			System.out.println("please enter a valid operation");
			break;
		}
	}

}
