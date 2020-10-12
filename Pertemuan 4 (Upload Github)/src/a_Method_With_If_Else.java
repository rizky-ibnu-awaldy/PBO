public class a_Method_With_If_Else {
    static void myMethod(int age){
        if(age < 18){
            System.out.println("Acces denied - You are not old enough!");

        }else{
            System.out.println("Acces granted - You are old enough!");
        }
    }
    public static void main(String[] args){
        myMethod(20);
    }
}
