package random;

import java.util.Random;


public class Random_Number_With_Out_Repitttion {

    
    public static void main(String[] args) {
        int array[]=new int[10];
        int count=0;
        boolean isMatch=false;
        System.out.println("Generating Random number with out repitation");
        Random random=new Random();
        int value=random.nextInt(10);
        
        // inserting random values in array
        array[count]=value;
        count++;
        while(count<array.length){
             //System.out.println("");
            value=random.nextInt(10);
            for(int i=0;i<count;i++)
            {
            if(array[i]==value)
            {
             isMatch=true;   
            }
            }
            if(isMatch==false)
            {
                array[count]=value;
                count++;
            
            }
            else
            {
                // System.out.println("");
                 isMatch=false;
            }
        
        }
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Random Number is "+array[i]);
        }
    }
}

 
   