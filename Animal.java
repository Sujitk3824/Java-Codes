class Animal {

//     // Creating methid/ behaviour "eat()".
//     public void eat() {
//         System.out.println("I Am Eating");
//     }

//     public static void main(String[] arr) {
//         System.out.println("1");
//         Animal buzo = new Animal();
//         buzo.eat();
//         buzo.run();
//         // Create new object for Bird Class "Sparrow".
//         Bird Sparrow = new Bird();
//         Sparrow.fly();

//     }

//     public void run() {
//         System.out.println("I am Running");
//     }

// }

// // Create New Class Bird
// class Bird {

//     public void fly() {
//         System.out.println("I Am Flying.");
//     }

String color;
int age;
void initObj(String c, int a)
{
    color = c;
    age = a;
}
void display()
{
    System.out.println(color+"\n"+age);
}
public static void main (String[] arr){

    Animal buzo = new Animal();
    buzo.initObj("black",20);
    buzo.display();
}

}