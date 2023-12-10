import java.util.Scanner;

public class ZooManagement {
    int nbrCages = 20;
    String zooName = "myZoo";

    public static void main(String[] args) {
        //Instruction 1
        ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages);

        //Instruction 2
        /*
         1/ Modifiez la variable d'environnement PATH et ajoutez le chemin du répertoire Java
         2/ Lancez l'invite de commande(cmd) et naviguer vers le chemin du fichier ZooManagement.java
         3/ Lancez l'instruction "javac ZooManagement.java"
         4/ Lancez l'instruction "java ZooManagement"
         */

        System.out.println("-------------------------------------------------------------");
        //Instruction 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le nombre de cages souhaité:");
        int nbrCagesSaisie = sc.nextInt();
        ZooManagement zm1 = new ZooManagement();
        zm1.nbrCages = nbrCagesSaisie;
        //Etape optionelle
        zm1.zooName = "notMyZoo";
        System.out.println(zm1.zooName + " comporte " + zm1.nbrCages);

        /////////////////////////////////////////////////////PROSIT 2/////////////////////////////////////////////////
        /////////////////////////////////////////////////////PROSIT 2/////////////////////////////////////////////////
        /////////////////////////////////////////////////////PROSIT 2/////////////////////////////////////////////////
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo();
        myZoo.name = "Wildlife Park";
        myZoo.city = "Ariana";
        myZoo.nbrCages = 25;
        myZoo.animals = new Animal[25];


        Animal dog = new Animal("Canine", "Snoopy", 2, true);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "Snoopy", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
    }
}