package OOP.labs_2_9;

public class Laba_2_9_5 {
  // TODO:  method must return true only if argument string value begin from Uppercase,
  // TODO:  then other chars in Lowercase and contains only letters.

  public static void main(String[] args) {

    String[] arr =
        {"VOVA", "Ivan", "R2d2", "ZX", "Anna", "12345", "ToAd", "TomCat", " "};
    for (String checked : arr)
      System.out.println(">" + checked + "< = " + checkPersonWithRegExp(checked));
  }

  private static boolean checkPersonWithRegExp(String userNameString) {
    if (userNameString == null || userNameString.length() < 2) return false;
    return userNameString.matches("[A-Z][a-z]+");
  }
}