package lab08;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class demonstrates how to achieve a FIFO queue in Java.
 * 
 * @author Erin Parker
 * @version March 3, 2022
 */
public class QueueDemo {

	public static void main(String[] args) {
		// Create a queue to represent students (string names) waiting to be 
		// helped by a TA.
		Queue<String> students = new LinkedList<String>();
		
		/* Notice the Queue interface is used to enforce that the underlying 
		 * linked list is only accessed in ways valid for (and guaranteed 
		 * constant-time for) a FIFO queue.
		 * Valid queue methods:  offer (AKA enqueue, add to back of queue)
		 *                       poll (AKA dequeue, remove from front of queue)
		 *                       peek
		 */
		students.offer("Jonathan");
		students.offer("Alex");
		students.offer("Anna");
		
		// Student waiting, front to back:  Jonathan, Alex, Anna
		System.out.println(students);
		
		students.poll();
		students.poll();
		students.offer("Bailey");
		students.offer("Kenzie");
		students.offer("David");
		students.offer("Courtney");
		students.offer("Matt");
		
		// People in line, front to back:  Anna, Bailey, Kenzie, David, Courtney, Matt
		System.out.println(students);
		
		students.poll();
		students.poll();
		students.poll();
		students.poll();
		students.offer("Luciano");
		students.offer("Sam");
		students.offer("Ryan");
		students.offer("Adriana");
		
		// People in line, front to back:  Courtney, Matt, Luciano, Sam, Ryan, Adriana
		System.out.println(students);		
	}
}