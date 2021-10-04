package testarray;

import com.ceep.domain.Persona;
import java.util.Scanner;

public class TestArray {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

//        Persona personas[] = new Persona[3];
//        personas[0] = new Persona("Santi");
//        personas[1] = new Persona("Iker");
//        personas[2] = new Persona("Maria");
        Persona personas[] = {new Persona("Santi"), new Persona("Iker"), new Persona("Maria")};

//        System.out.println("personas = " + personas[0].toString());
        for (int i = 0; i < personas.length; i++) {
//            System.out.println("Introduce un nombre de persona:");
//            personas[i].setNombre(lectura.nextLine());
            System.out.println("Mostrando nombre almacenado en el array Persona");
            System.out.println("Persona {" + i + "} ->" + personas[i].getNombre());

        }

    }

}
