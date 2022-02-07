public class FRQ9two {
  private String classification;
  private String species;
  private String name;
  
  
  public FRQ9two(String c, String s, String n) {
  classification = c;
  species = s;
  name = n;
  }


  public String toString() {
  String str = "";
  str = name + " the " + species + " is a " + classification;
  return str;
  }

  public class Herbivore extends FRQ9two {
    public Herbivore(String s, String n) {
    super("herbivore", s, n);
  }
  }

  public class Elephant extends Herbivore {
    private double tuskLength;
    
    public Elephant(String n, double t) {
    super("elephant", n);
    tuskLength = t;
    }
  
  public String toString() {
    return super.toString() + " with tusks " + tuskLength + " meters long";
    }
  }
}