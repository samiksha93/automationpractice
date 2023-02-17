package throw_statement;

public class Thred_sleep {

	
		//function to check if person is eligible to vote or not   
	    public static void signalTimeout(long time) throws InterruptedException   { 
	    	System.out.println("Signal started");
	        if(time>1000) {  
	              Thread.sleep(time);
	        }  
	        else {  
	            System.out.println("Person is eligible to vote!!");  
	        }  
	        System.out.println("Signal ends...");
	    }  
	    //main method  
	    public static void main(String args[]) throws InterruptedException {  
	        //calling the function  
	    	System.out.println("I am main....");
	    	signalTimeout(5000);
	        System.out.println("rest of the code...");    
	  }    
	}    