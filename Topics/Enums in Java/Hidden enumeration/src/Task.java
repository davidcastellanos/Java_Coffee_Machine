// write your answer here 

public class Task {
  public static void main(String[] args) {
    // put your code here
    int counter = 0;
    for (Secret theSecret : Secret.values()) {
      if (theSecret.toString().startsWith("STAR")){
        counter++;
      }
    }

    System.out.println(counter);
  }
}

enum Secret {
  STAR, CRASH, START
}