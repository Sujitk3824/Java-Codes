class ByConstructor
{
	String name;
	int id;
	ByConstructor(String name,int id)
	{
		this.name=name;
		this.id=id;
	}

	public static void main(String[] args) {
		ByConstructor e1= new ByConstructor("Sujit",01);
		ByConstructor  e2= new ByConstructor("XYZ",02);
		System.out.println("Name= "+ e1.name+ "\n" + " Id= " + e1.id);
		System.out.println("Name= "+ e2.name+ "\n" +  " Id= " + e2.id);
	}
}