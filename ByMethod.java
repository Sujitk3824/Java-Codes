class ByMethod
{
	String name;
	int id;

	public static void main(String[] args) {
		ByMethod e1= new ByMethod();
		e1.name = "Sujit";
		e1.id = 01;
		ByMethod  e2= new ByMethod();
		e2.name="ABC";
		e2.id=02;
		System.out.println("Name= "+ e1.name+ "\n" + " Id= " + e1.id);
		System.out.println("Name= "+ e2.name+ "\n" +  " Id= " + e2.id);
	}
}