package ulead.tareacorta1;
//la clase abstracta padre - animal
public abstract class Animal {
	
	//variable que indicara que todos los animales poseen edad
	protected double edad;
	
	public Animal() {
		System.out.println("Soy del parentesco de los animales");
	}
	//acontinuacion el metodo abstracto de la clase animal
	public abstract String caracteristica();
}
