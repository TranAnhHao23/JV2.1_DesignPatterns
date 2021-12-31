package factory_method;

public class AnimalFactory {
    public Animal getAnimal(String animal) {
        if (animal.equals("Dog")) {
            return new Dog();
        } else {
            return new Cat();
        }
    }
}
