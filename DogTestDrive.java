class DogTestDrive{
    public static void main(String[] args){
        Dog one = new Dog();
        one.size = 70;

        Dog two = new Dog();
        two.size = 8;

        Dog three = new Dog();
        three.size = 35;

        one.bark(3);
        two.bark(5);
        three.bark(0);
    }
}