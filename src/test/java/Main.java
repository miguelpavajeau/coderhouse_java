import com.coderhouse.clase05.Animal;
import com.coderhouse.clase05.Gato;
import com.coderhouse.clase05.Perro;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal otroAnimal = new Animal();

        animal.setClase("Mamifero");
        animal.setExtinto(false);
        animal.setGenero("Macho");
        animal.setEdad(10);
        animal.dormir();
        animal.comer();


        otroAnimal.setClase("Ave");
        otroAnimal.setExtinto(false);
        otroAnimal.setGenero("Hembra");
        otroAnimal.setEdad(5);
        otroAnimal.dormir();
        otroAnimal.comer();


//        animal.setEdad(animal.getEdad() + 1);
//        otroAnimal.setEdad(otroAnimal.getEdad() + 1);
//
//        animal.setEdad(animal.getEdad() + 1);
//        otroAnimal.setEdad(otroAnimal.getEdad() + 1);
//
//        animal.setEdad(animal.getEdad() + 1);
//        otroAnimal.setEdad(otroAnimal.getEdad() + 1);

        System.out.println("unAnimal = " + animal);
        System.out.println("otroAnimal = " + otroAnimal);

        Perro perro = new Perro();

        perro.setEdad(10);
        perro.setGenero("Macho");
        perro.setExtinto(false);
        perro.setClase("Mamifero");
        perro.setNombre("Firulais");
        perro.setRaza("Labrador");

        perro.dormir();
        perro.comer();

        System.out.println("perro = " + perro);

        Gato gato = new Gato();
        gato.hacerRuido();
        gato.comer();
        gato.dormir();

        if (animal.equals(otroAnimal)) {
            System.out.println("unAnimal es igual a otroAnimal");
        }else {
            System.out.println("unAnimal es diferente a otroAnimal");
        }
    }
}
