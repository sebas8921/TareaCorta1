package ulead.tareacorta1;

public abstract class Invertebrado extends Animal {
	public Invertebrado() {
		super();
		System.out.println("Soy de la familia de los invertebrados");
	}
	public String caracteristica() {
		return "Los invertebrados se identifican porque no poseen espina dorsal o columna vertebral";
	}
}
