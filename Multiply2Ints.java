class Multiply2Ints {
  public static void main (String [] args) {
    int num1, num2;
    if (args.length == 2) {
      num1 = Integer.parseInt(args[0]);
      num2 = Integer.parseInt(args[1]);
      System.out.println("Product of: " + num1 + " * " + num2 + " = " + (num1 * num2));
    } else {
      System.out.println("ERROR: Need two integer arguments on command line");
    }
  } // end main
} //end class
