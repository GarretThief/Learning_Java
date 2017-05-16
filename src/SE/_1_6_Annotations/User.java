package SE._1_6_Annotations;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Garret on 15.05.2017.
 */
public class User {
    private String name;
    private List<Main.PermissionAction> permissions;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public List<Main.PermissionAction> getPermissions() {
        return permissions;
    }

    public void addPermission(Main.PermissionAction action){
        permissions.add(action);
    }
}
