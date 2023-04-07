package collections;
import java.util.*;//import java utility class

public class LinkedListEx 
{

	public static void main(String[] args) 
	{
		LinkedList<String> linklist=new LinkedList<String>();
		//adding object in Linkedlist
		linklist.add("mango");
		linklist.add("Apple");
		linklist.add("orange");
		linklist.add("Grapes");
		linklist.add("mango");
		//traversing list to iterator
		Iterator itr=linklist.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());	
		}
	}
}