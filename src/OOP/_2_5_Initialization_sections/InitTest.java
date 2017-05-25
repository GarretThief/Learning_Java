package OOP._2_5_Initialization_sections;

/**
 * Created by Garret on 13.02.2017.
 */
public class InitTest {
    private int id = nextId;
    private static int nextId = (int) (1000 * Math.random());;

    public InitTest(){
        this.id = nextId;
        nextId++;
    }
    public int getId(){
        return id;
    }
}
