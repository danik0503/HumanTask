public class Human {
    String firstName;
    String lastName;

    private int age;

    void setAge (int age){
        if(age >= 0 && age <= 100){
            this.age = age;
        }else{
            this.age = 0;
        }
    }
    int getAge (){
        return this.age;
    }
}
