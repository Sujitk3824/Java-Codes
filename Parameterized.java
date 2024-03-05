class Parameterized
{
   String name;

   Parameterized(String name)
   {
   	this.name=name;
   	
   }

	public static void main(String[] args)
	 {
		Parameterized e1= new Parameterized("ABC");
		Parameterized e2= new Parameterized("XYZ");
		System.out.println(e1.name);
		System.out.println(e2.name);

	
	}
}