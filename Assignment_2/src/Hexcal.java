import java.util.Scanner;
public class Hexcal {
	public static int hexadecimalToDecimal(String hexVal) 
    {    
        int len = hexVal.length(); 
       
        int base = 1; 
       
        int dec_val = 0; 
       
        for (int i=len-1; i>=0; i--) 
        {    
            if (hexVal.charAt(i) >= '0' && hexVal.charAt(i) <= '9') 
            { 
                dec_val += (hexVal.charAt(i) - 48)*base; 
                   
             
                base = base * 16; 
            } 
   
            else if (hexVal.charAt(i) >= 'A' && hexVal.charAt(i) <= 'F') 
            { 
                dec_val += (hexVal.charAt(i) - 55)*base; 
                base = base*16; 
            } 
        } 
        return dec_val; 
    } 
      
	public static String decToHexa(int decimal) 
    {    
       String hexa="";
       int remainder;
       while(decimal>0)
       {
    	   remainder=decimal%16;
    	   if(remainder<10)
    		   hexa=(char)(remainder+48)+hexa;
    	   else
    		   hexa=(char)(remainder+55)+hexa;
    	   decimal=decimal/16;
       }
       return hexa;
    } 
	
	//addition function for two hexadecimal numbers
	public static String addHexaDecimal(String hexa1,String hexa2)
	{
		return(decToHexa(hexadecimalToDecimal(hexa1)+hexadecimalToDecimal(hexa2)));
	}
	
	//substraction function for hexadecimal numbers .
	public static String subHexaDecimal(String hexa1,String hexa2)
	{
		return(decToHexa(hexadecimalToDecimal(hexa1)-hexadecimalToDecimal(hexa2)));
	}
	
	//multiplication function for hexadecimal numbers.
	public static String mulHexaDecimal(String hexa1,String hexa2)
	{
		return(decToHexa(hexadecimalToDecimal(hexa1)*hexadecimalToDecimal(hexa2)));
	}
	
	//division function for two hexadecimal numbers .
	public static String divHexaDecimal(String hexa1,String hexa2)
	{   if(hexadecimalToDecimal(hexa2)==0)
		return "error";
		return(decToHexa(hexadecimalToDecimal(hexa1)/hexadecimalToDecimal(hexa2)));
	}
	
	//for comparing equality of two hexadecimal numbers .
	public static boolean isEqualTo(String hexa1,String hexa2)
	{
		return hexa1.equals(hexa2);
	}
	
	//function for checking greater than for hexadecimal numbers .
	public static boolean isGreaterThan(String hexa1,String hexa2)
	{
		if(hexa1.length()>hexa2.length()){
			return true;
		} 
		else{
			for(int i=hexa1.length()-1;i>0;i--)
			{
				if(hexa1.charAt(i)>hexa2.charAt(i))
					return true;
				if(hexa1.charAt(i)<hexa2.charAt(i))
					return false;
				
			}
			return false;
		}
	}
	
	//function for checking less than for hexadecimal numbers .
	public static boolean isLessThan(String hexa1,String hexa2)
	{
		if(hexa1.length()<hexa2.length()){
			return true;
		} 
		else{
			for(int i=hexa1.length()-1;i>0;i--)
			{
				if(hexa1.charAt(i)<hexa2.charAt(i))
					return true;
				if(hexa1.charAt(i)>hexa2.charAt(i))
					return false;
				
			}
			return false;
		}
	}
	
	
	
	 public static void main (String[] args)  
	    { 
	       String hex1,hex2;
	       Scanner sc = new Scanner(System.in);  
	       System.out.println("enter the numbers:");
	       hex1=sc.next();
	       hex2=sc.next();
	       System.out.println("enter your choice:\n 1: + \n 2: - \n 3: * \n 4: / \n 5: == \n 6: > \n 7: <");
	       int choice=sc.nextInt();
	       switch(choice) {
	       case 1:
	    	   System.out.println(addHexaDecimal(hex1,hex2));
	         break;
	       case 2:
	    	   System.out.println(subHexaDecimal(hex1,hex2));
	         break;
	       case 3:
	    	   System.out.println(mulHexaDecimal(hex1,hex2));
		         break;
	       case 4:
	    	   System.out.println(divHexaDecimal(hex1,hex2));
		         break;
	       case 5:
	    	   System.out.println(isEqualTo(hex1,hex2));
		         break;
	       case 6:
	    	   System.out.println(isGreaterThan(hex1,hex2));
		         break;
	       case 7:
	    	   System.out.println(isLessThan(hex1,hex2));
		         break;
	       default:
	         System.out.println("enter a valid choice");
	     }
	    } 
	
	
	

}
