package fibonachi.model;

import fibonachi.model.FiboModel;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiboModelTest {

  static FiboModel fiboModel;

  @BeforeAll
  static void getData() {
    fiboModel = FiboModel.getINSTANCE();
    System.out.println("\ngetData -> INIT...\n");

  }

  @Test
  void isFibonachi() {
// TRUE->
    assertTrue(fiboModel.isFibonachi(13));
    assertTrue(fiboModel.isFibonachi(55));
    assertTrue(fiboModel.isFibonachi(144));
    assertTrue(fiboModel.isFibonachi(610));
    assertTrue(fiboModel.isFibonachi(10946));
    assertTrue(fiboModel.isFibonachi(1836311903));

// FALSE->
    assertFalse(fiboModel.isFibonachi(-10));
    assertFalse(fiboModel.isFibonachi(333));
    assertFalse(fiboModel.isFibonachi(666));
    assertFalse(fiboModel.isFibonachi(1999999999));
    System.out.println("\nisFibonachi -> COMPLETE\n");
  }

  @Test
  void iterationToNumber() {
// TRUE->
    assertEquals(0, fiboModel.getIterationsToNumber(0));
    assertEquals(3, fiboModel.getIterationsToNumber(2));
    assertEquals(7, fiboModel.getIterationsToNumber(13));
    assertEquals(10, fiboModel.getIterationsToNumber(55));
    assertEquals(12, fiboModel.getIterationsToNumber(144));
    assertEquals(15, fiboModel.getIterationsToNumber(610));
// FALSE->
    assertNotEquals(1, fiboModel.getIterationsToNumber(0));
    assertNotEquals(2, fiboModel.getIterationsToNumber(3));
    assertNotEquals(9, fiboModel.getIterationsToNumber(144));
    assertNotEquals(12, fiboModel.getIterationsToNumber(610));
    System.out.println("\niterationToNumber -> COMPLETE\n");

  }

  @Test
  void getNearest() {
    int[] nearest = fiboModel.getNearest(666);
    int nextIteration = fiboModel.getIterationsToNumber(610) + 1;
    System.out.println("\n added number - 666;" +
        "\nnearest lower = " + nearest[0] + " -- " + "nearest upper = " + +nearest[1]);
    assertTrue(nearest[0] < nearest[1]);
    assertEquals(610, nearest[0]);
    assertEquals(fiboModel.getNumberByIteration(nextIteration), nearest[1]);
    System.out.println("\ngetNearest -> COMPLETE\n");

  }

  @Test
  void getNumberByIteration() {
    try {
      fiboModel.getNumberByIteration(999);
    } catch (Exception e) {
      assertTrue(e instanceof IllegalArgumentException);
      assertEquals(e.getLocalizedMessage(), ("Your Number Is To Big!"));
    }
    System.out.println("\ngetNearest -> COMPLETE\n");
  }
}