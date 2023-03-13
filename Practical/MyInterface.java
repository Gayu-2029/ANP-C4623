package corejava;
interface MyInterface 
{
	public void doSomething();//Interface method() without body...
}
	class Myclass implements MyInterface//Creating class Myclass 
	{
		public void doSomething()//Body of interface method doSomething
		{
			System.out.println("Doing Something...");
		}
	}
	class MyMain//Creating class with main method()
	{
		public static void main(String[] args)
		{
			Myclass mc= new Myclass();//Creating object of class Myclass
			mc.doSomething();//Calling method() of interface		
		}
	}

