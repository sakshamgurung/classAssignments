interface PlasticFactory{
  Manufacture makeProduct();
}
class Manufacture{
  private String product;

  public Manufacture(String product){
    this.product = product;
  }
  @Override
  public String toString(){
    return product+" is produced.";
  }
}
class PlasticDuck implements PlasticFactory{
  private Manufacture manuf;
  public PlasticDuck(String product){
    this.manuf = new Manufacture(product);
  }
  
  @Override
  public Manufacture makeProduct() {
    return manuf;
  }
}
class PlasticCar implements PlasticFactory{
  private Manufacture manuf;
  public PlasticCar(String product){
    this.manuf = new Manufacture(product);
  }
  
  @Override
  public Manufacture makeProduct() {
    return manuf;
  }
}
class Factory{
  public static void main(String[] args) {
    Manufacture mf;
    PlasticFactory factory = null;
    String product = args[0];
    switch (product) {
      case "duck":
        factory = new PlasticDuck(product);
        break;
      case "car":
        factory = new PlasticCar(product);
        break;
      default:
        break;
    }
    assert factory != null;
    mf = factory.makeProduct();
    System.out.println(mf);
  }
}

