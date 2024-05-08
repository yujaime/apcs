public class classB extends classA{
    public classB(){
        // super();
        System.out.println("classB Constructor Called");
    }
    public String printHi(){
        return "classB Hi";
    }

    public String superprintHi(){
        return super.printHi();
    }

    public String printHi(int x){
        return "classB Hi with param";
    }
}