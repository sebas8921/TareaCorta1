package ulead.tareacorta1;

public abstract class Vertebrado extends Animal {
public Vertebrado() {
	super();
	System.out.println("Soy de la familia de los vertebrados");
}
public String caracteristica() {
	return "Los vertebrados se identifican por poseer espina dorsal o columna vertebral";
}
}
