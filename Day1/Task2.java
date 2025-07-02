package Day1;

public class Task2 {

    void add(int a,int b){
        System.out.println(a+b);
    }
    void sub(int a,int b){
        System.out.println(a-b);
    }
    void mul(int a,int b){
        System.out.println(a*b);
    }
    void div(int a,int b){
        System.out.println(a/b);
    }
    public static void main(String args[]){
        Task2 cal=new Task2();
        cal.add(10,20);
        cal.sub(12,2);
        cal.mul(2,6);
        cal.div(10 ,5);
    }
}
