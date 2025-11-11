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

        //Change the value of the yearFounded and isOpen
        //call factoryinfo()

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
