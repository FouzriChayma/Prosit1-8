import java.util.Scanner;

public class ZooManagement {
    //int nbrCages = 20;
    //String zooName = "myZoo";

    public static void main(String[] args) {
       /* Instruction 1
        ZooManagement zm = new ZooManagement();
        System.out.println(zm.zooName + " comporte " + zm.nbrCages);

        //Instruction 2
        /*

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

        //   System.out.println(myZoo.removeAnimal(dog));


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

//        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());
    }
}
*/
////////////////////////////////////////////////////PROSIT 3/////////////////////////////////////////////////
/////////////////////////////////////////////////////PROSIT 3/////////////////////////////////////////////////
/////////////////////////////////////////////////////PROSIT 3/////////////////////////////////////////////////
        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 8;
        lion.family = "Cats";
        lion.isMammal = true;

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        myZoo.displayAnimals();

//        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
//        System.out.println(myZoo.isZooFull());

    }

    }
