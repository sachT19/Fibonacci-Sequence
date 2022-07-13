public class Fibonacci 
{
    public static void main(String[] args) 
    {
      
        //number of elements to generate in the sequence
		int max = 15;
		
		// create the array to hold the sequence of Fibonacci numbers
		int[] sequence = new int[max];
		
		//create the first 2 Fibonacci sequence elements
		sequence[0] = 0;
		sequence[1] = 1;
		
		//create the Fibonacci sequence and store it in int[] sequence
		for (int i = 2; i < sequence.length; i++){
		    sequence[i] = sequence[i-1] + sequence[i-2]; 
		}
	
		
		//print the Fibonacci sequence numbers
		System.out.println("Fibonacci sequence up to 15 terms:");
		for (int j = 2; j < sequence.length; j++){
		    System.out.print(sequence[j] + " ");
		}
      
    
        System.out.println("\nIndex position of 55 is: " + findIndex(sequence, 55));
    
    }
      
    // This method finds the index of an element in an array 
      
    public static int findIndex (int[] arr, int n) 
    {
            
               // your code goes here
               int i = 0;
               while (i < arr.length - 1){
                   if (arr[i] == n){
                       return i;
                   }
                   i++;
               }
               return i;
    }
}
