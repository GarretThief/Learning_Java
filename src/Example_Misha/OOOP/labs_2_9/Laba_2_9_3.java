package OOP.labs_2_9;

public class Laba_2_9_3 {
  public static void main(String[] args) {

    String firstOne = "Using methods of class String";

    String resultOne = getUniqueCharsFromString(firstOne);
    System.out.println(">" + resultOne + "<");

  }

  private static String getUniqueCharsFromString(String inputStr) {

    String inputStrInLowerCase = inputStr.toLowerCase();
    char[] charsArr = inputStrInLowerCase.toCharArray();
    StringBuilder builder = new StringBuilder(inputStr.length());

    for (int i = 0; i < charsArr.length; i++) {
      char currentChar = charsArr[i];
      String substring = inputStrInLowerCase.substring(0, i)
          + inputStrInLowerCase.substring(i + 1);
      if (!substring.contains(currentChar + ""))
        builder.append(inputStr.charAt(i));
    }
    return builder.toString();
  }
}