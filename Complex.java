public class Complex {
  private double realPart = 0;
  private double imgPart = 0;

  public Complex() {}; // default constructor

  public Complex(double r, double i) {
    realPart = r;
    imgPart = i;
  }
  //setters
  public void setRealPart(double value) {
    realPart = value;
  }

  public void setImgPart(double value) {
    imgPart = value;
  }
  //getters
  public double getRealPart() {
    return realPart;
  }

  public double getImgPart() {
    return imgPart;
  }
  //For formatting output, overload the toString function
  //given by Java Base Class "Template"
  public string toString () {
    return "" + realPart + " + " + imgPart + " i ";
  }

  public Complex add(Complex rhs) {
    return new Complex(realPart + rhs.getRealPart(),
                        imgPart + rhs.getImgPart());
  }
} //end class
