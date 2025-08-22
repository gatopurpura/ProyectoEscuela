package Main;

import java.util.Scanner;

import Entity.Alumnos;
import Implementacion.LogicaMetodos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lectura = null;
		
		 String matricula;
		 String nombre;
		 long numCel;
		 int edad,menuPrinc;
		 
		 Alumnos alumno;
		 
		 
		 LogicaMetodos imp = new LogicaMetodos();
		 
		 do {
			System.out.println("MENU PRINCIPAL");
			System.out.println("1--ALTA");
			System.out.println("2--MOSTRAR");
			System.out.println("3--BUSCAR");
			System.out.println("4--EDITAR");
			System.out.println("5--ELIMINAR");
			System.out.println("6--SALIR");
			
			lectura = new Scanner(System.in);
			menuPrinc = lectura.nextInt();
			switch (menuPrinc) {
			case 1:
				System.out.println("Ingresa la matricula");
				lectura = new Scanner(System.in);
				matricula = lectura.nextLine();
				
				System.out.println("Ingresa el nombre");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();
				
				System.out.println("Ingresa el celular");
				lectura = new Scanner(System.in);
				numCel = lectura.nextLong();
				
				System.out.println("Ingresa la edad");
				lectura = new Scanner(System.in);
				edad = lectura.nextInt();
				
				//crear objeto
				alumno = new Alumnos(matricula, nombre, numCel, edad);
				
				//agregar hashmap
				imp.guardar(alumno);
				System.out.println("Se guardo correctamente");
				break;
			case 2:
				System.out.println(imp.mostrar());
				break;
			case 3:
				System.out.println("Ingresa la matricula a buscar");
				lectura = new Scanner(System.in);
				matricula = lectura.nextLine();
				
				//Buscar
				alumno = imp.buscar(matricula);
				System.out.println("Se encontro el registro: " + alumno);
				break;
			case 4:
				System.out.println("Ingresa la matricula a editar");
				lectura = new Scanner(System.in);
				matricula = lectura.nextLine();
				
				//Buscar
				alumno = imp.buscar(matricula);
				System.out.println("Se encontro " + alumno);
				
				System.out.println("Ingreso el numero de celular:");
				lectura = new Scanner(System.in);
				numCel = lectura.nextLong();
				
				//editar objeto
				alumno.setNumCel(numCel);
				
				//editar hashMap
				imp.editar(alumno);
				System.out.println("Se cambio correctamente");
				
				break;
			case 5:
				System.out.println("Ingresa la matricula a eliminar");
				lectura = new Scanner(System.in);
				matricula = lectura.nextLine();
				
				imp.eliminar(matricula);
				System.out.println("Se elimino");
				break;
			case 6:
				break;
			}
		} while (menuPrinc <6);
	}

}
