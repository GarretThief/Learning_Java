package OOP._2_16_Method_Overload;

/**   ---Laba 1---
 * 1) Student should create class Animal and extends from him create class Dog.
 * 2) Student should create class Main which has two methods foo(Animal a) and foo(Dog d).
 *    This methods print to console “Animal” and “Dog” respectively.
 * 3) Student should create and provide all necessary code in a method main() to show how does overload
 *    resolution works when we put this reference(Animal a = new Dog();) to method (foo).
 *    ---Laba 2---
 * 1) Student should create his or her own Java class Main with methods void foo(int i)
 *    which print “int” to console and void foo(Byte b) which print “Byte”;
 * 2) In a method main() student should create variable (byte b) and put it to method (foo) and look what will be output.
 *    ---Laba 3---
 * 1) Student should create his or her own Java class Main with methods void foo(int a, int b)
 *    which print a and b to console and void foo(int … a) which print array’s content;
 * 2) In a method main() student should put two and three integers to method (foo) and look for result.
 *    ---Laba 4---
 * 1) Student should create class Animal and extends from him create class Dog and extends from him create class Puppy.
 * 2) Student should create class Main which has three methods foo(Animal a), foo(Dog d), foo(Puppy p).
 *    This methods print to console “Animal”, “Dog” or “Puppy” respectively.
 * 3) Student should create and provide all necessary code in a method main() to show how does
 *    overload resolution works when we put null to method foo. What will be print?
 *    ---Laba 5---
 * 1) Student should create his or her own Java class Main with methods void foo(int i)
 *    which print “int” to console and void foo(byte b) which print “byte”;
 * 2) In a method main() student should create variable (byte b = 5;)
 *    and put it to method (foo) and look what will be output.
 *    Then he should put simple number (for example 5) directly to method. Explain result.
 */
public class Main {
    public static void foo (Animal a){
        System.out.println("Animal");
    }
    public static void foo (Dog d){
        System.out.println("Dog");
    }
    public static void foo (int i){
        System.out.println("int");
    }
    public static void foo (Byte b){
        System.out.println("Byte");
    }
    public static void foo (int a, int b){
        System.out.println(a + " " + b);
    }
    public static void foo (int... a){
        for (int elem : a) {
            System.out.print(elem + " ");
        }
    }
    public static void foo (Puppy p){
        System.out.println("Puppy");
    }
    public static void foo (byte by){
        System.out.println("byte");
    }
    public static void main(String[] args) {
        Animal animal = new Dog();
        foo(animal);

        byte b = 5;
        foo(b);

        foo(2,5);
        foo(3,4,5);
        System.out.println();

        Puppy p = null;
        foo(p);

        byte by = 5;
        foo(by);
        foo(5);
    }
}
