package OOP.E_N_U_M;

public enum direction {
    PARTY {
      @Override
      public String toString() {
        return "Its nosy party over here...";
      }
    }, CLUB {
      @Override
      public String toString() {
        return "Nice music & cocktails here, сome on, will be fun)!";
      }
    }
  }