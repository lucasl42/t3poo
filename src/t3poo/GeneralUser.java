package t3poo;


public class GeneralUser extends User{
    
    
    public GeneralUser(){
        this.maxBooks = 2;
        this.maxDays = 15;
    }
    
    public GeneralUser(String id, String name, String birthDate, String email){
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
        this.nbooks = "0";
        this.issuspended = "false";
        this.maxBooks = 2;
        this.maxDays = 15;
    }
   
}
