package exam;

public class ConvertToBinary {

  public String toBinary(final int n1) {
            int n=n1;
           
          String binary="";
            while (n>=0)
            {
            	   int rem = n % 2;
            	 if(n==0)
            	 {
            	     break;
            	 }
        	     if(rem == 0)
        	     {
        	         binary=binary+0;
        	     }
    	        else
    	         {
    	              binary=binary+1;
    	         }
    	     	        n = n/2;
            }
      return new StringBuffer(binary).reverse().toString();
  }
}
