package ulead.tareacorta1;
//clase concreta Mamifero
public class Mamifero extends Vertebrado {
public Mamifero() {
	super();
	System.out.println("Soy de la familia de los mamiferos");
}
public Mamifero(String nombre) {
	super();
	System.out.println("Soy de la familia de los mamiferos y soy un " + nombre);
}
public String caracteristica() {
	return "Los mamiferos se caracterizan por poseer glandulas mamarias";
}

public String caracteristicaPadre() {
	return super.caracteristica();
}

}