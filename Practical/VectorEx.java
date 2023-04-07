package collections;
import java.util.*;//import java utility class

public class VectorEx 
{

	public static void main(String[] args) 
	{
		Vector<String> vct=new Vector<String>();
		//adding object in Vector
		vct.add("mango");
		vct.add("Apple");
		vct.add("orange");
		vct.add("Grapes");
		vct.add("mango");
		//traversing list to iterator
		Iterator itr=vct.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());	
		}
	}
}