package OOP.labs_2_15;

import java.util.*;

public class Laba_1_and_2 {

  private static <T> void printElements(Collection<T> cloneCopy) {
    System.out.println("printElements method:\n");
    Iterator<T> iterator = cloneCopy.iterator();
    while (iterator.hasNext()) System.out.println(iterator.next());
  }

  private static Set<Integer> generateDistinct(
      List<Integer> integers) {
    return new HashSet<>(integers);
  }

  private static List<Integer> printNumbersGenerator(int maxElements, int randeOfRandom) {
    Random random = new Random();
    List<Integer> simpleList = new ArrayList<>();
    while (simpleList.size() < maxElements)
      simpleList.add(random.nextInt(randeOfRandom));
    simpleList.forEach(System.out::println);
    return simpleList;
  }

  public static void main(String[] args) {
    int count = 0;
    List<String> someList = new ArrayList<>(10);    // <- set LENGTH !?

    for (Object aSomeList : someList) someList.add("number_" + count++);  // <- initial data
    //System.out.println(someList.toString()); // WHERE is DATA ??! <which one data???>

    for (String item : someList) item = "number_" + count++;  // <- initial data
    // System.out.println(someList.toString()); // WHERE is DATA ??! <which one data???>

    // Iterator<String> iterator = someList.iterator();  // by iterator mode >
    // while (iterator.hasNext()) someList.add("number_" + count++);
    // System.out.println(someList.toString()); // WHERE is DATA ??! <which one data???>

//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    for (int i = 0; i < 10; i++)
      someList.add("number_" + i);

    // someList.forEach(System.out::println);
    // System.out.println(someList);


//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//---------------------------------- <  LABA 2  > ---------------------------------------------
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
/*    System.out.println("\n\n");
    Random ranadom = new Random();
    List<String> linkedList = new LinkedList<>();
    Set<String> mySet = new HashSet<>();

    while (mySet.size() < 10) mySet.add("num_" + ranadom.nextInt(10));
    linkedList.addAll(mySet);
     System.out.println(linkedList);*/

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//---------------------------------- <  LABA 3  > ---------------------------------------------
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
   /* someList.clear();
    for (int i = 0; i < 10; i++)
      someList.add("number_" + i);

    Iterator<String> newIterator = someList.iterator();
    System.out.println("while -> newIterator.hasNext: ");
    while (newIterator.hasNext()) System.out.println(newIterator.next());
    System.out.println("\n\n");

    // System.out.println("cloneCopy -> List<String>:");
    ListIterator<String> stringListIterator =
        someList.listIterator(someList.size());
    List<String> cloneCopy = new ArrayList<>(someList);
    while (stringListIterator.hasPrevious())
      cloneCopy.add(stringListIterator.previous());

    printElements(cloneCopy);*/

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//---------------------------------- <  LABA 4  & LAba 5 > ---------------------------------------------
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

/*    List<Integer> integers1List = printNumbersGenerator(15, 64);
    Set<Integer> integersSet = generateDistinct(integers1List);
    System.out.println(integersSet);*/

    //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//---------------------------------- <  LABA 6  > ---------------------------------------------
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    String strFromConsole = getStringFromConsole();
    printTrunslation(strFromConsole);
  }

  private static void printTrunslation(String strFromConsole) {
    String[] splitedStrings = strFromConsole.split(" ");
    Map<String, String> languageMap = new HashMap<>();
    languageMap.put("cat", "кот");
    languageMap.put("caught", "поймал");
    languageMap.put("mouse", "мышь");
    for (String string : splitedStrings)
      System.out.print((
          languageMap.get(string) == null ?
              string : languageMap.get(string)) + " ");
  }


  private static String getStringFromConsole() {
    return new Scanner(System.in).nextLine();
  }
}