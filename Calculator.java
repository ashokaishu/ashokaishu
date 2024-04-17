// Source code is decompiled from a .class file using FernFlower decompiler.
import java.io.PrintStream;

public class Calculator {
   public Calculator() {
   }

   public int add(int var1, int var2) {
      return var1 + var2;
   }

   public int subtract(int var1, int var2) {
      return var1 - var2;
   }

   public int multiply(int var1, int var2) {
      return var1 * var2;
   }

   public int divide(int var1, int var2) {
      if (var2 == 0) {
         throw new IllegalArgumentException("Cannot divide by zero");
      } else {
         return var1 / var2;
      }
   }

   public static void main(String[] var0) {
      Calculator var1 = new Calculator();
      byte var2 = 10;
      byte var3 = 5;
      PrintStream var10000 = System.out;
      int var10001 = var1.add(var2, var3);
      var10000.println("Addition: " + var10001);
      var10000 = System.out;
      var10001 = var1.subtract(var2, var3);
      var10000.println("Subtraction: " + var10001);
      var10000 = System.out;
      var10001 = var1.multiply(var2, var3);
      var10000.println("Multiplication: " + var10001);
      var10000 = System.out;
      var10001 = var1.divide(var2, var3);
      var10000.println("Division: " + var10001);
   }
}
