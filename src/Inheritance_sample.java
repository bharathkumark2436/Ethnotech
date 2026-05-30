public class Inheritance_sample {
    public void hello(){
        System.out.print("helloo mamaaa,");
    }

}
class greet extends Inheritance_sample{
    void say(){
        System.out.print("do your work man,dont look into others");
    }

    public static void main(String[] args) {
        greet obj=new greet();
        obj.hello();
        obj.say();
    }

}
