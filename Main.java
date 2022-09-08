import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //Create Scanner obj to get input
    Scanner input = new Scanner(System.in);
    System.out.println("How many eggs would you like to purchase?");
    int eggsPurchased = input.nextInt();
    System.out.println("You are buying " + eggsPurchased + " eggs");
    int dozenNum = eggsPurchased / 12;
    System.out.println(dozenNum);
    int dozenRemainder = eggsPurchased % 12;
    System.out.println(dozenRemainder);






    
  }
}