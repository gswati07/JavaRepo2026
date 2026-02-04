public interface Animal {
    abstract void sound();

    public static void main(String[] args){
        Dog d1=new Dog();
        d1.sound();
        Cat c1=new Cat();
        c1.sound();
    }
}
class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("dog barks");
    }

}
class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("Cat meow");
    }
}
