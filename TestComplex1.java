public class TestComplex1 {
  public static void main(String [] args) {
    Complex c1 = new Complex();
    Complex c2 = new Complex(3, 7);
    Complex c3;

    System.out.println("c1: " + c1.toString());
    System.out.println("c2: " + c2.toString());

    System.out.println("Real Part c2: " + c2.getRealPart());
    System.out.println("Img Part c2: " + c2.getImgPart());

    c1.setRealPart(22);
    c1.setImgPart(14);
    System.out.println("c1: " + c1.toString());

    c3 = c1.add(c2);
    System.out.println("c3: " + c3.toString());

    c3 = c1.subtract(c2);
    System.out.println("c3: " + c3.toString());
  } //end main
}//end TestComplex1
