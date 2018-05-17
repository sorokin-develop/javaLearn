// Everything Is an Object.Exercise 6: (2)

public class Storage {
  
  String s = "TEST";

  int storage(String s) {
    return s.length() * 2;
  }

  void print() {
    System.out.println(storage(s));
  }

  public static void main(String[] args) {
    Storage st = new Storage();

    st.print();
  }
}