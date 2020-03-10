public class Singleton{
  private int counter;
  private Singleton(){
    this.counter = 0;
  }
  //early initialization
  private static class SingleHolder{
    private static final Singleton instance = new Singleton();
  }
  public void incrementer(){
    counter = counter + 1;
  }
  public int getValue(){
    return counter;
  }
  public static Singleton getInstance(){
    return SingleHolder.instance;
  }

  public static void main(String[] args) {
    Singleton a = Singleton.getInstance();
    a.incrementer();
    System.out.print("Counter value :");
    System.out.println(a.getValue());
    Singleton b = Singleton.getInstance();
    b.incrementer();
    System.out.print("Counter value :");
    System.out.println(b.getValue());
    Singleton c = Singleton.getInstance();
    c.incrementer();
    System.out.print("Counter value :");
    System.out.println(c.getValue());
  }
}