public class Factory {
    //Instance variables: Top of class, have public infront of them, and can be used anywhere inside if factory but not psvm
public int yearFounded;
public boolean isOpen;
public double Earnings; //Unit is in millions\
public String products;
    public static void main(String[] args) {
        System.out.println("Welcome to Niam's factory");

        new Factory();


    }


    //This method is a constructor; You can tell as it doesn't have void, and it has the same name as the class
    public Factory(){
        System.out.println("we make houses!");
        yearFounded = 2009;
        isOpen = true;
        Earnings = 24;
        products = "houses";
        int x;
        FactoryInfo();
            System.out.println("we make houses!");
            yearFounded = 2010;
            isOpen = false;
            Earnings = 28;
            products = "houses";

        //Change the value of the yearFounded and isOpen
        //call factoryInfo()

        //type variableName = value;
        //Object of type house
        House h1 = new House();
        h1.owner = "Toby Heikka";
        System.out.println("the owner is" + h1.owner);
        //todo: give all the house instance variables values
        h1.address = "1793 Canton Ave, Milton, MA, 0120186";
        h1.size = 1;
        h1.isOccupied = true;
        h1.walls = 4;


        House h2 = new House();

        System.out.println(h2.size);
        h2.size = 40.2;
        System.out.println(h2.size);
        h2.printInfo();

        //todo: make another house object called myHouse
        //call printInfo on myHouse
        House myHouse = new House();

        System.out.println(myHouse.size);
        myHouse.size = 40.2;
        System.out.println(myHouse.size);
        myHouse.printInfo();


        House customHouse = new House(200.24,8,"Gabe");
        customHouse.printInfo();

    }


  //todo: make a method called FactoryInfo
  public void FactoryInfo(){
      System.out.println("The factory info:");
      //todo: add souts to print the factory's instance variables
      System.out.println(products);
      System.out.println("The year founded: " + yearFounded);
      System.out.println("the earnings" + Earnings);
      System.out.println("it is" + isOpen + "that the factory is open");

  }

}
