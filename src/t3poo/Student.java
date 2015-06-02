package t3poo;


public class Student extends User{
    
    
    public Student(){
        this.maxBooks = 4;
        this.maxDays = 15;
    }
    
    public Student(String id, String name, String birthDate, String email){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.nbooks = "0";
        this.issuspended = "false";
        this.maxBooks = 4;
        this.maxDays = 15;
    }

    
    
    
}