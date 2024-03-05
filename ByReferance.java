class ByReferance
{
	String name="Sujit";
	int id=01;

	public static void main(String[] args) {
		ByReferance e1= new ByReferance();
		ByReferance e2= new ByReferance();
		System.out.println(e1.name);
		System.out.println(e1.id);
	}
}