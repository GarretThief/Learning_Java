package SE._1_6_Annotations;


public class Main {
    @Deprecated static int findMax (int[] mass){
        int max = 0;
        for (int i = 0; i < mass.length -1; i++){
            if (mass[i]> max)
                max = mass[i];
        }
        return max;
    }

    //@SafeVarargs
//    static <T> int findMax (T[] mass){
//        int max = 0;
//        for (int i = 0; i < mass.length -1; i++){
//            if ((int)mass[i]> max)
//                max = (int)mass[i];
//        }
//        return max;
//    }

    enum PermissionAction {
        USER_READ,
        USER_CHANGE,
        USER_DELETE,
        USER_CREATE;
    }


    public static void initAction(){
        Action action1 = new Action("Sasha", PermissionAction.USER_CHANGE);
        Action action2 = new Action("Valera", PermissionAction.USER_CREATE);
        Action action3 = new Action("Vasya", PermissionAction.USER_DELETE);
        Action action4 = new Action("Vova", PermissionAction.USER_READ);
    }

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        int[] arr = {23,17,98,45,103,2,-5};
        System.out.println(findMax(arr));

        initAction();
    }
}
