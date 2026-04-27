package inheritance;

public class MainAnimal {

	public static void main(String[] args) {
		
		Animal animalSound = new Animal();
		Cat catSound = new Cat();
		
		animalSound.makeSound();
		catSound.catSound();
		catSound.makeSound();
		System.out.println(catSound.name);
		System.out.println(animalSound.name);
		

	}

}
