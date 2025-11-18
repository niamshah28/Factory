import java.security.acl.Owner;

public class House {

    //Instance variables
    //1. at the top of class
    //2. they can be used anywhere, but psvm
    //3. have the word public before
    public int walls;
    public double size;
    public String address;
    public String owner;
    public boolean isOccupied;

    //constructor
    //1. no void
    //2. same name as class
    //3. special method
    public House(){
        walls = 4;
        size = 3200.7;
        owner = "Bobby";
        address = "362 centre st.";
        isOccupied = true;
    }

    //hw: add 2 more parmeters to the house constructor, 1 for isOccupied, 1 for address
    //set the insatnce variables value to the parameter
    //fix the realated problems by adding them to the code in the factory class

    public House(double pSize, int pWalls, String pOwner){
        size = pSize;
        walls = pWalls;
        owner = pOwner;

    }

    //todo: make a printInfo() method that prints all the house instance vars
    public void printInfo(){
        System.out.println(walls); //not a readable way
        System.out.println(size); // not readable
        System.out.println("name of owner: " + owner); //readable
        System.out.println("address:" + address);
        System.out.println("It is" + isOccupied + "that the house is occupied."); //fancy readable
    }



}
