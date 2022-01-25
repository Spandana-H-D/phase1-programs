
import java.util.*;
public class QueueExample {

		public static void main(String[] args) 
		{
		   Queue<String> locationsQueue = new java.util.LinkedList<>();
		locationsQueue.add("mandya");
		        		locationsQueue.add("mysore");
		        		locationsQueue.add("bangalore");
		        		locationsQueue.add("ramnagar");
		        		locationsQueue.add("madduru");
		System.out.println("Queue is : " + locationsQueue);
		        		System.out.println("Head of Queue : " + locationsQueue.peek());
		        		locationsQueue.remove();
		        		System.out.println("After removing Head of Queue : " + locationsQueue);
		        		System.out.println("Size of Queue : " + locationsQueue.size());
		    	}
		}


