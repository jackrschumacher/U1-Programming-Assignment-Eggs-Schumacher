import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Create Scanner obj to get input
    Scanner input = new Scanner(System.in);
    System.out.println("How many eggs would you like to purchase?");
    int eggsPurchased = input.nextInt();
    System.out.println("You are buying " + eggsPurchased + " eggs");
    int dozenNum = eggsPurchased / 12;
    double dozenCost = dozenNum * 3.25;
    System.out.println("You have purchased: "+ dozenNum + " dozen eggs for 3.25 each. This cost: $" + dozenCost);
    int dozenRemainder = eggsPurchased % 12;
    double remainderCost = dozenRemainder * 0.45;
    System.out.println("You have:" + dozenRemainder +" lose eggs. At 45 cents each, that amounts to, $"+ remainderCost + " Dollars.");
    double total = remainderCost + dozenCost;
    System.out.println("Your total cost is: $"+total+" Dollars");




    
  }
}