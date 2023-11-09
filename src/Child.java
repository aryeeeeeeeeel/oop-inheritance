public class Child extends Parent {
    Child(String name){
        super(name);
    }
    
    void bark(){
        System.out.println(name + " is barking");
    }
}
