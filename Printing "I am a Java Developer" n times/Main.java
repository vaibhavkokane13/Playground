import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner in  = new Scanner(System.in);
        // Get n value from the user
	    int n = in.nextInt();
        // Initialize count as 1
	    int count = 1;
        // Repeat print statement till count value reaches the n
		while(count <= n)
		{
		    System.out.println("I am a Java Developer");
            count=count+1;
	}
}
}