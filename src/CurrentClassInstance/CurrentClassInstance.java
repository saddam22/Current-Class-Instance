
package CurrentClassInstance;

public class CurrentClassInstance {
    
    CurrentClassInstance getCurrentClassInstance(){
    return this;
    }
    void msg(){
        System.out.println("Hello Wanbahjahkas");
    }
    }
class Test1{
    public static void main(String[] args) {
     new CurrentClassInstance().getCurrentClassInstance().msg();
    }
}   
