package fibonachi.model;

import java.util.ArrayList;
import java.util.List;

public class FiboModel {
  private static FiboModel INSTANCE = new FiboModel();
  private List<Integer> fibonachiNumbers;
  private Thread dataTaskThread;

  private FiboModel() {// ну, я типа КОНСТРУКТОР (типа приватный).
    this.init();
  }

  public static FiboModel getINSTANCE() {//  -> типа синглетон я короч!
    return INSTANCE;
  }

  public boolean isFibonachi(int number) { //  Фибонатор метод проверятор ->

// ану пЕрЕверь, чЫ всЁ нАрмуль c 'ниткой' ->
    checkForValidThread();

    if (fibonachiNumbers == null || fibonachiNumbers.isEmpty()) // just for safe-
      getMainData(); // -> Якшо Шось пАшло не так...
    return fibonachiNumbers.contains(getPositiveNumber(number)); // <- magic here!
  }

  private void checkForValidThread() {
    if (dataTaskThread.isAlive() && !dataTaskThread.isInterrupted())

      try {//ШотА може слчиЦЦО...
        dataTaskThread.join(); // пАдАжДи, бро, я счИтаю...
      } catch (InterruptedException e) {
        e.printStackTrace(); // пАкаж, Шо стряслось то>
        fibonachiNumbers = null; // пАлож всё как было, Шоб не пАлАмалось!
      }
  }


  private void getMainData() { // MAIN LOGIC HERE !
    fibonachiNumbers = new ArrayList<>();
    fibonachiNumbers.add(0);
    fibonachiNumbers.add(1);
    for (int i = 0; i < 46; ) { // ДЕТА посля 46-й выхолит за рамки Integer !
      Integer first = fibonachiNumbers.get(i);
      Integer second = fibonachiNumbers.get(++i);

      System.out.print(second + " -> "); // простА выводим У кАнсоль...

      fibonachiNumbers.add(first + second);
    }
  }

  private int getPositiveNumber(int number) {
    return Math.abs(number); // из пустого в пАрожнее,
  }                         //  или с минуса на + ?!)

  private void init() {
    dataTaskThread = new Thread(new Runnable() {
      @Override
      public void run() {
        getMainData();
      }
    });
    dataTaskThread.start(); // вычисляй сам...я слищком 'STAR' для этого дерьма !)
  }

  public int getIterationsToNumber(int fibonachiNumber) { // <- итерация до числа
    return fibonachiNumbers.indexOf(fibonachiNumber);
  }

  public int[] getNearest(int numb) { // <- ближайшие 'фибАначи'к числу.
    int downNum = 0;
    int upperNum = 0;
    for (int i = 0; i < fibonachiNumbers.size() - 1; i++) {
      if (fibonachiNumbers.get(i + 1) < numb) continue; // нет времени объяснять -
      downNum = fibonachiNumbers.get(i);               //-> фигач дальше!
      upperNum = fibonachiNumbers.get(i + 1);
      break; // пАлеХче, луп, мы нашли Шо искали!
    }
    if (downNum == 0 & upperNum == 0) // 'LOGGING' here->
      System.err.println("ALERT (class 'FiboModel', method 'getNearest') ->  {( downNum == 0 & upperNum == 0 )}");
    return new int[]{downNum, upperNum};
  }

  public int getNumberByIteration(int iteration) throws IllegalArgumentException {
    checkForValidThread();// ану пЕрЕверь, чЫ всЁ нАрмуль c 'ниткой' ->
    if (getPositiveNumber(iteration) > fibonachiNumbers.size() - 1) // <- не 'пАлАмай' мою прогу!
      throw new IllegalArgumentException("Your Number Is To Big!");// отхвати 'Exception', sucker!)
    return fibonachiNumbers.get(iteration);
  }
}