public class Method_Scope {
  public static void main(String[] args){
      // code here cannot use x
      {
          // code here cannot use x
          int x = 100;
          // code here can use x
          System.out.println(x);
      }// the block ends here
      // code here cannot use
  }
}
