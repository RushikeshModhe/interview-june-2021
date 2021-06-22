package exam;

     public class ConvertToBinary {

         int binary[] = new int[40];
         int index = 0;
        while(n> 0){
         binary[index++] = n%2;
         n = n/2;
     }
     for(int i = index-1;i >= 0;i--)
     {
       System.out.print(binary[i]);
     }
    
return "";
  }
}
