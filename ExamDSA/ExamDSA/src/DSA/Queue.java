package DSA;

public class Queue {
	private String person[];
	
	 private int rear;
	 private int size ;

	    public Queue() {
	       person = new String[50];
	       this.size = 50;
	       rear = -1;
	    }

	    public void push(String data) {
	        rear = (rear+1) % size;
	        person[rear] = data;
	    }

	    public void displayQueue() {
	       
	    	for(int i =0 ; i<rear+1;i++) {
	    		System.out.print(" "+person[i]);
	    	}
	        System.out.println();
	    }

}
