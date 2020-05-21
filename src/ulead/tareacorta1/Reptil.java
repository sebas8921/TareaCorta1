package ulead.tareacorta1;

//clase concreta Reptil
public class Reptil extends Vertebrado {
	public Reptil() {
		super();
		System.out.println("Soy de la familia de los reptiles");
	}

	public Reptil(String nombre) {
		super();
		System.out.println("Soy de la familia de los reptiles y soy un " + nombre);
	}

	public String caracteristica() {
		return "Los reptiles se caracterizan por ser provistos de escamas epidérmicas ";
	}

}