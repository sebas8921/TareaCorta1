package ulead.tareacorta1;

//clase concreta Artropodo
public class Artropodo extends Invertebrado {
	public Artropodo() {
		super();
		System.out.println("Soy de la familia de los artropodos");
	}

	public Artropodo(String nombre) {
		super();
		System.out.println("Soy de la familia de los artropodos y soy un " + nombre);
	}

	public String caracteristica() {
		return "Los artropodos se caracterizan por tener un esqueleto externo";
	}
	
	public String caracteristicaPadre() {
		return super.caracteristica();
	}

}