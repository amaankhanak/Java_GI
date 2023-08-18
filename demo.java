class Calculator {
  public int add(int a, int b) {
    int r = a + b;
    return r;
  }
}

public class demo {
  public static void main(String[] args) {

    Calculator calc = new Calculator();
    int a = 5;
    int b = 10;
    int result = calc.add(a, b);
    System.out.println(result);
  }
}
