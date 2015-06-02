
package t3poo;

public class Professor extends User{
    
    
    public Professor(){
        this.maxBooks = 6;
        this.maxDays = 60;
    }
    
    public Professor(String id, String name, String birthDate, String email){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.nbooks = "0";
        this.issuspended = "false";
        this.maxBooks = 6;
        this.maxDays = 60;
    }
    
}    
