package OOP.labs_2_9;

public class Laba_2_9_2 {
  /*                            Write code to display all of the letters,
                                which are present in the first word,
                                but absent in the second one.
  */
  public static void main(String[] args) {

    String firstOne = "Cartoon";
    String secondOne = "ToRat";

    String result = getUnique(firstOne, secondOne);

    System.out.println("result -> \t>" + result+"<");
  }

  private static String getUnique(String firstOne, String secondOne) {

    StringBuilder builder = new StringBuilder(firstOne.length());
    char[] chars = firstOne.toLowerCase().toCharArray();

    for (int i = 0; i < chars.length; i++)
      if (!secondOne.toLowerCase().contains(chars[i] + ""))
        builder.append(firstOne.charAt(i));

    return builder.toString();
  }
}