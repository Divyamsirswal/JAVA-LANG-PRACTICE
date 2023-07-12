public class recursion {
    public static void main(String[] args) {
        sayHello(8);
    }

    static void sayHello(int a){

        if(a==0){
            return;
        }

        System.out.println("Hello");
        sayHello(a-1);
    }
}
