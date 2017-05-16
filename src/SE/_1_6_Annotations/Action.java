package SE._1_6_Annotations;

/**
 * Created by Garret on 15.05.2017.
 */
public class Action {
    User user;

    public Action(String name, Main.PermissionAction action) {
        User user = new User(name);
        user.addPermission(action);
    }

    public void readFile(){
        System.out.println();
    }

    public void writeFile(Main.PermissionAction action){
        user.addPermission(action);
    }
}
