public class Child extends Parent {
    Child(String name){
        super(name);
    }
    
    void nagging(){
        System.out.println(name + " is nagging");
    }
}
