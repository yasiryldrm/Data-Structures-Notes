package javastack3;
import java.util.*;

class JavaStack3 {
static class Queue
{	static Stack<Integer> s1 = new Stack<Integer>();
	static Stack<Integer> s2 = new Stack<Integer>();

	static void enQueue(int x)
	{
		// Move all elements from s1 to s2
		while (!s1.isEmpty())
		{
			s2.push(s1.pop());
		}

		// Push item into s1
		s1.push(x);

		// Push everything back to s1
		while (!s2.isEmpty())
		{
			s1.push(s2.pop());
		}
	}
static int deQueue()
	{
		if (s1.isEmpty())
		{
		   System.out.println("Q is Empty");
		   System.exit(0);
		}

		int x = s1.pop();
		return x;
	}
}

public static void main(String[] args)
{
	Queue q = new Queue();
	q.enQueue(1);
	q.enQueue(2);
	q.enQueue(3);

	System.out.println(q.deQueue());
	System.out.println(q.deQueue());
	System.out.println(q.deQueue());
}
}
