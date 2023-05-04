class DogArray{
    private String name;
    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size = s;
    }



    public static void main(String[] args){

        Dog[] pets = new Dog[2];

        pets[0] = new Dog();
        pets[1] = new Dog();

        pets[0].setSize(30);

        int x = pets[0].getSize();

        pets[1].setSize(8);
        int y = pets[1].getSize();

        System.out.println(x);
        System.out.println(y);

    }

}