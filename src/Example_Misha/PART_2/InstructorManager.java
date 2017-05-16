package Example_Misha.PART_2;
import com.sun.istack.internal.Nullable;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

class InstructorManager {
  private static InstructorManager ourInstance = new InstructorManager();

  synchronized boolean saveToFile(Instructor instructor, String fileLocation) {
    File fileWriteTo = new File(fileLocation);
    List<Instructor> fromFileList = new ArrayList<>();

    boolean exists = fileWriteTo.exists();
    if (exists) {
      fromFileList.addAll(getFromFile(fileLocation));
      System.out.println(" File already exist ! -> file size = " + fromFileList.size());
    }

    try (ObjectOutputStream objectOutputStream =
             new ObjectOutputStream(new FileOutputStream(fileLocation))) {

      if (!exists) System.out.println("creating File = " + fileWriteTo.createNewFile());

      fromFileList.add(instructor);
      List<Instructor> uniqueItemsList = setUniqueItems(fromFileList);
      objectOutputStream.writeObject(uniqueItemsList);
      objectOutputStream.flush();
      return true;

    } catch (IOException e) {
      e.printStackTrace();
    }

    return false;
  }

  @Nullable
  synchronized List<Instructor> getFromFile(String fileLocation) {

    if (!new File(fileLocation).exists()) {
      System.err.println(fileLocation + " -> NOT EXIST ! ");
      return null;
    }

    List<Instructor> fromFileList = new ArrayList<>();
    try (ObjectInputStream objectInputStream =
             new ObjectInputStream(new FileInputStream(fileLocation))) {
      ArrayList list = (ArrayList) objectInputStream.readObject();

      for (Object bject : list)
        fromFileList.add((Instructor) bject);

      return setUniqueItems(fromFileList);

    } catch (Exception e) {
      e.printStackTrace();
    }

    return null;
  }


  public static InstructorManager getInstance() {
    return ourInstance;
  }

  private InstructorManager() {
  }

  private <T> List<T> setUniqueItems(List<T> list) {
    return new LinkedHashSet<>(list).stream().collect(Collectors.toList());
  }
}
