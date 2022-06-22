package eclipse_test;

import java.util.Objects;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class AnotherEclipseTestClass {

  private static final double PI = 3.14;

  public static void main(String[] args) {

    System.out.println("Hello from eclipse test class");

    int[] numbers = {1, 3, 5, 7, 8};
    int sum = calculateSumforNumber(numbers);
    System.out.println("The sum is " + sum);

    int radius = 5;
    double area = PI * radius * radius;
  }

  private static int calculateSumforNumber(int[] numbers) {
    int sum = 0;
    for (int number : numbers) {
      sum = number;
      System.out.println("The sum is equal to " + sum);
    }
    return sum;
  }

  class Bean {

    private int var1;
    private int var2;

    public Bean() {
      // default
    }

    public int getVar1() {
      return var1;
    }

    public void setVar1(int var1) {
      this.var1 = var1;
    }

    public int getVar2() {
      return var2;
    }

    public void setVar2(int var2) {
      this.var2 = var2;
    }

    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + getEnclosingInstance().hashCode();
      result = prime * result + Objects.hash(var1, var2);
      return result;
    }

    @Override
    public boolean equals(Object obj) {
      if (!(obj instanceof Bean)) {
        return false;
      }

      Bean that = obj;

      return new EqualsBuilder()
          .append(this.var1, that.var1)
          .append(this.var2, that.var2)
          .isEquals();
    }

    @Override
    public String toString() {
      return new ToStringBuilder(this)
          .append("var1", var1)
          .append("var2", var2)
          .toString();
    }

  }

}
