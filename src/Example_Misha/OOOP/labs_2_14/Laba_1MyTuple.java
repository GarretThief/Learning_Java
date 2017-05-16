package OOP.labs_2_14;

public class Laba_1MyTuple<A, B, C> {
  private A typeA;
  private B typeB;
  private C typeC;

  public Laba_1MyTuple(A typeA, B typeB, C typeC) {
    this.typeA = typeA;
    this.typeB = typeB;
    this.typeC = typeC;
  }

  public A getTypeA() {
    return typeA;
  }

  public void setTypeA(A typeA) {
    this.typeA = typeA;
  }

  public B getTypeB() {
    return typeB;
  }

  public void setTypeB(B typeB) {
    this.typeB = typeB;
  }

  public C getTypeC() {
    return typeC;
  }

  public void setTypeC(C typeC) {
    this.typeC = typeC;
  }

  @Override
  public String toString() {
    return "\nTuple: \n" +
        "typeA = " + typeA.getClass().getSimpleName() +
        " \nvalue =" + typeA +
        ",\ntypeB = " + typeB.getClass().getSimpleName() +
        "\nvalue = " + typeB +
        ", \ntypeC = " + typeC.getClass().getSimpleName() +
        "\nvalue = " + typeC + "\n";
  }

  public static void main(String[] args) {
    Laba_1MyTuple test1 =
        new Laba_1MyTuple<>("this is STRING, bro", 100, 1000L);
    System.out.println(test1);
  }
}
