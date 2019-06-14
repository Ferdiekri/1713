import java.text.DecimalFormat;

import com.ipartek.formacion.Employee;

public class HelloWorld {

	public static void main(String[] args) {

		Employee emp1 = new Employee("Jeff Bezos", 55, 'H', 131);
		Employee emp2 = new Employee("Bill Gates", 63, 'H', 96);
		Employee emp3 = new Employee("Warren Buffett", 88, 'H', 82);

		System.out.println("EMPLEADO\tEDAD\tSEXO\tSALARIO");
		System.out.println("--------\t----\t----\t-------");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());

		System.out.println("---------------------------------------------------------");

		Employee y1 = new Employee("Logan Paul", 23, 'h', 14500000f);
		Employee y2 = new Employee("PewDiePie", 23, 'h', 15500000f);
		Employee y3 = new Employee("Jacksepticeye", 23, 'h', 16000000f);

		// Sacamos el símbolo de la moneda local.
		DecimalFormat dc = new DecimalFormat("$ ##,###,###");

		Employee[] youtubers = new Employee[3];
		youtubers[0] = y1;
		youtubers[1] = y2;
		youtubers[2] = y3;
		for (int i = 0; i < youtubers.length; i++) {
			System.out.printf("\n" + (i + 1) + ". " + youtubers[i].getNombre() + " " + dc.format(youtubers[i].getSalario()));
		}
		for (Employee empleado : youtubers) {
			System.out.println(empleado);
		}

		/*
		 * String nombre = "Ander"; System.out.println("Hello " + nombre);
		 * 
		 * System.out.println("----------------------");
		 * 
		 * Person p1 = new Person(); p1.setNombre("Manolo");
		 * System.out.println(p1.getNombre());
		 * 
		 * System.out.println("----------------------");
		 * 
		 * System.out.println("Vamos con los perros:");
		 * 
		 * Perro dog1 = new Perro(); dog1.setNombre("Firulais");
		 * dog1.setRaza("Labrador"); dog1.setEdad(10); dog1.setVacunado(true);
		 * System.out.println(dog1.toString());
		 * 
		 * Perro dog2 = new Perro(); dog2.setNombre("Pulgas"); dog2.setRaza("Setter");
		 * dog2.setEdad(-5); dog2.setVacunado(false);
		 * System.out.println(dog2.toString());
		 * 
		 * Perro dog3 = new Perro(); System.out.println(dog3.toString());
		 * 
		 * PerroPresa dog4 = new PerroPresa(); System.out.println(dog4.toString());
		 * dog4.atacar();
		 * 
		 * Perro dog5 = new Perro("Rantamplan"); System.out.println(dog5.toString());
		 */
		
		int numero = 12345;
		int numero2;
		
		System.out.println("Número original: " + numero);
		
		numero2= Integer.reverse(numero);
		
		System.out.println("Número final: " + numero2);
		
		
	}

}
