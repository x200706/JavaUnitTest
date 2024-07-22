import java.util.ArrayList;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> testList = new ArrayList<>();
    testList.remove("apple"); // 這樣不會引發錯誤啊@@
    System.out.println("done!");
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}