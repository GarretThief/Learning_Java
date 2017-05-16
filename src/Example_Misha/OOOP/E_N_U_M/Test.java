package OOP.E_N_U_M;

import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    switch (new Scanner(System.in).nextLine()){
      case "tusa":
        System.out.println(direction.PARTY);
        break;
      case"clubTusa":
        System.out.println(direction.CLUB);
        break;
        default:
          System.out.println("Get out of here!");
    }

  }

}
