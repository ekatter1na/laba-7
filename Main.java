package com.metanit;

public class Main {
    public static class Animal{
        Animal animal;
        public String Name;
        private String food;
        public String location;
        public String setFood(){
            return food;
        }

        Animal(String Name,String food,String location){
            this.Name = Name;
            this.food=food;
            this.location=location;
        }
        public void eat(){
            System.out.println("*звуки поедания пищи* \n ест ");
        }
        public void makeNoise(){
            System.out.println("шумит");
        }
        public void sleep(){
            System.out.println("спит");
        }
        public void displayInfo(){
            System.out.println("location: " + location);
            System.out.println("food: " + food);
        }
    }

    static class Cat extends Animal{
        private String dost = "не даёт грустить:) очень милая и забавная:)";

        Cat(String Name,String food,String location) {
            super(Name, food, location);
        }

        @Override
        public void eat() {
            System.out.println("Кошка ест " + setFood());
        }

        @Override
        public void makeNoise() {
            System.out.println("Кошка мяукает");
        }

        @Override
        public void sleep() {
            System.out.println("Кошка спит ");
        }

        @Override
        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println("плюс: " + dost);
        }
    }
    static class Dog extends Animal{
        private String plus = "верный друг и хороший помощник";
        Dog(String Name,String food,String location) {
            super(Name, food, location);
        }
        @Override
        public void eat() {
            System.out.println("Собака ест " + setFood());
        }

        @Override
        public void makeNoise() {
            System.out.println("Собака лает");
        }

        @Override
        public void sleep() {
            System.out.println("Собака спит");
        }

        @Override
        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println("плюс: " + plus);
        }
    }
    static class Hourse extends Animal{
        private String plus = "можно покататься";
        Hourse(String Name,String food,String location) {
            super(Name, food, location);
        }

        @Override
        public void eat() {
            System.out.println("Лошадка кушает " + setFood());
        }

        @Override
        public void makeNoise() {
            System.out.println("Лошадка игогокает");
        }

        @Override
        public void sleep() {
            System.out.println("Лошадка спит");
        }

        @Override
        public void displayInfo() {
            eat();
            makeNoise();
            sleep();
            System.out.println("плюс: " + plus);
        }
    }
    static class Veterinarian{

        void treatAnimal(Animal animal) {
            System.out.print(" food :" + animal.food);
            System.out.println("\n location: " + animal.location);
            System.out.println( animal.Name + " на приеме у ветеринара");
        }
    }


    public static void main(String[] args) {
        Veterinarian vet = new Veterinarian();
        Animal cat = new Cat("Изабель", "мясо и молочко", "дома");
        Animal dog = new Dog("Грей","все мясные продуты, крупы", "будка");
        Animal hourse = new Hourse ("Буцефал","морковь и яблоки", "конюшня");
        cat.displayInfo();
        vet.treatAnimal(cat);
        dog.displayInfo();
        vet.treatAnimal(dog);
        hourse.displayInfo();
        vet.treatAnimal(hourse);
    }
}
