package ulead.tareacorta1;

//clase concreta Artropodo
public class Molusco extends Invertebrado {
	public Molusco() {
		super();
		System.out.println("Soy de la familia de los moluscos");
	}

	public Molusco(String nombre) {
		super();
		System.out.println("Soy de la familia de los moluscos y soy un " + nombre);
	}

	public String caracteristica() {
		return "Los moluscos se caracterizan porque comparten la propiedad de ser celomados, triblasticos y protóstomos..";
	}

}