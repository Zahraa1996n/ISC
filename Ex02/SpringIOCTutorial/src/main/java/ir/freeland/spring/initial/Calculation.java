package ir.freeland.spring.initial;

public class Calculation {
  public void complexCalculation() {
    Calculator calculator = new Calculator();

    int result = calculator.plus(2, 3);

    Display display = new Display();
    
    Print print = new Print();
    
    display.output(String.format("2 + 3 = %d", result));
    print.DoPrint();
  }
}
