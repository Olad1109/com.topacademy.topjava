package parammethods.pet;

public class Description {
    public static void main(String[] args) {

        // CREATING INSTANCES

        //Dog object
        Dog dog = new Dog();
        dog.setName("Тучка");
        dog.setGender("Самка");
        dog.setAge(10);
        dog.setWeight(14.5);
        dog.setBreed("Мопс");
        System.out.println("Собака [Кличка: "+dog.getName()+ ", Пол: "+dog.getGender()+ ", Возраст: "+dog.getAge()+" лет, Вес: "+dog.getWeight()+" кг, Порода: "+dog.getBreed()+", Осталось жить: "+dog.getLifespan()+"]");

        dog.setName("Рэкс");
        dog.setGender("Самец");
        dog.setAge(15);
        dog.setWeight(20);
        dog.setBreed("Овчарка");
        System.out.println("Собака [Кличка: "+dog.getName()+ ", Пол: "+dog.getGender()+ ", Возраст: "+dog.getAge()+" лет, Вес: "+dog.getWeight()+" кг, Порода: "+dog.getBreed()+", Осталось жить: "+dog.getLifespan()+"]");

    }
}
