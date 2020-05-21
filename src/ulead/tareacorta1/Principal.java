package ulead.tareacorta1;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Acontinuacion un programa simple en Java para explicar el comportamiento de herencias");
		System.out.println("y clases abstractas:");
		System.out.println("-------------------------------------");
		Mamifero leon = new Mamifero("Leon");
		System.out.println(leon.caracteristica());
		System.out.println("-------------------------------------");
		Reptil serpiente = new Reptil("Serpiente");
		System.out.println(serpiente.caracteristica());
		System.out.println("-------------------------------------");
		Artropodo escorpion = new Artropodo("Escorpion");
		System.out.println(escorpion.caracteristica());
		System.out.println("-------------------------------------");
		Molusco pulpo = new Molusco("Pulpo");
		System.out.println(pulpo.caracteristica());
		System.out.println("-------------------------------------");
		System.out.println("Ademas unos cuantos datos importantes:");
		System.out.println(leon.caracteristicaPadre());
		System.out.println(escorpion.caracteristicaPadre());
	}

}
