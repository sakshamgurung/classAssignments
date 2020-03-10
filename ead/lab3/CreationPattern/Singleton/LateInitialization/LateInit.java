public class LateInit{
  private int counter;
  private LateInit(){
    this.counter = 0;
  }
  //late initialization
  private static LateInit instance;
  public void incrementer(){
    counter = counter + 1;
  }
  public int getValue(){
    return counter;
  }
  public static LateInit getInstance(){
    if(instance == null){
      instance= new LateInit();
    }
    return instance;
  }

  public static void main(String[] args) {
    LateInit a = LateInit.getInstance();
    a.incrementer();
    System.out.print("Counter value :");
    System.out.println(a.getValue());
    LateInit b = LateInit.getInstance();
    b.incrementer();
    System.out.print("Counter value :");
    System.out.println(b.getValue());
    LateInit c = LateInit.getInstance();
    c.incrementer();
    System.out.print("Counter value :");
    System.out.println(c.getValue());
  }
}