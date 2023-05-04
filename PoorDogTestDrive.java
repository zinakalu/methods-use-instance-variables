public class PoorDogTestDrive{
    public static void main(String[] args){
        PoorDog one = new PoorDog();

        PoorDog[] sizee = new PoorDog[2];
        sizee[0] = new PoorDog();
        sizee[0].setSize(10);
        sizee[1] = new PoorDog();
        sizee[1].setName("Tim");
        one.setSize(80);
        one.setName("Max");
        // int dogSize = pets[0].getSize();

        System.out.println("Dog size is " + sizee[0].getSize());
        System.out.println("Dog name is " + sizee[1].getName()); 
        System.out.println("Dog name is " + one.getSize()); 
        System.out.println("Dog name is " + one.getName()); 
    }
}

