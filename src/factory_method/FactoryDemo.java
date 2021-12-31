package factory_method;

public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();

        Animal animal1 = animalFactory.getAnimal("Dog");
        System.out.println("Sound 1 = "+animal1.makeSound());
        Animal animal2 = animalFactory.getAnimal("Cat");
        System.out.println("Sound 2 = "+animal2.makeSound());

        Animal animal3 = new Dog();
        System.out.println("Sound 3 = " + animal3.makeSound());


    }
}
