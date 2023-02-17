package Queue__1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Example_queue {

	public static void main(String[] args) {
		Queue<Character> queue1 = new PriorityQueue<Character>();
		queue1.add('a');
		queue1.add('b');
		queue1.add('c');
		queue1.add('d');
		System.out.println(queue1);
		
		Queue<Integer> que2 = new PriorityQueue<Integer>();
		que2.add(333);
		que2.add(50);
		
		
		que2.add(100);
		que2.add(10);
		que2.add(666);
		System.out.println(que2);
		System.out.println("use element() method ro fine top most element of queue2:  "+que2.element());
		System.out.println("use peek() method ro fine top most element of queue2:  "+que2.peek());
		
		System.out.println("****************************************");
		
		System.out.println("Remove top most element of queue by remove() method:  "+que2.remove());
		System.out.println("after remove()method  :  "+que2);
		System.err.println("Remove top most element of queue by poll() method :  "+que2.poll());
		System.out.println("after poll()method    :  "+que2);
		
		System.out.println("************************************");
		
		Iterator itr = que2.iterator();
		while (itr.hasNext()) {
			System.out.println("using iterator:  "+itr.next());
		}
			
		System.out.println("************************************");
		
		que2.forEach(obj ->{
			System.out.println("using for each loop :"+obj);
		});
		Queue<Integer> que3 = new PriorityQueue<Integer>();
		System.out.println("use peek() method ro fine top most element of queue3:  "+que3.peek()); //it give null value
//		System.out.println("use element() method ro fine top most element of queue3:  "+que3.element());//it give NosuchelementExeception

	}

}
