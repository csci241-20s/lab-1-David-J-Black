package lab1;

public class Hello {
  public static void main(String[] args) {
      if(args == null)
	  System.out.println("Hello, world!");
      else
	  System.out.println("Hello, " + args[0] + "!");
  }
}
