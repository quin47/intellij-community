// "Wrap using 'Collections.singletonList()'" "true"
import java.util.*;

class Test {

  void m() {
    List<Object> list = Collections.singletonList(new Object() {
    });
  }

}