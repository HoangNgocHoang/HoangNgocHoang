
package Lec8_ObjectAndClass.Ex2;

public class Dog {
    private String Name;
    private String Sex;
    
    private int age ;
    //contractor
    public Dog(String Name,String Sex , int age){
        this.Name = Name;
        this.Sex = Sex;
        this.age = age;
    }
    public void displayDetails(){
        System.out.println("Dog Name :" +Name+" Sex :"+ Sex+" age :"+age);
}
}