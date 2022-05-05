
public class HelloWorld{
    public static void main(String[] args) {
        Mouse m1=new Mouse("鼠鼠", 1);
        m1.eat();
        m1.sleep();
        m1.introduction();
    }

    public static class Animal{
        private String name;
        private int id;
        public Animal(String myname,int myid){
            name=myname;
            id=myid;
        }
        public void eat(){
            System.out.println(name+"正在吃");
        }
        public void sleep(){
            System.out.println(name+"正在睡觉");
        }
        public void introduction(){
            System.out.println("你好，我是"+name+"，我是"+id+"号。");
        }
    }
    public  static class Mouse extends Animal{
        public Mouse(String myName, int myid){
            super(myName, myid);
        }
    }
}
