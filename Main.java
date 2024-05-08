public class Main {
    public static void main(String[] args) {
        classA a = new classB();
        //classB b = new classA(); cannot do this
        classB b = new classB();
        System.out.println(a.printHi());
        System.out.println(b.superprintHi());
    }
}
