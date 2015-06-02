
package t3poo;


public class Book {
    private String id;
    private String name;
    private String gender;
    private String publisher;
    private String author;
    private String year;
    private String type;
    private String isrented;
   
    
    public Book(){
        
    }
    
    public Book(String id, String name, String gender,
            String publisher, String author, String year, String bookType){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.publisher = publisher;
        this.author = author;
        this.year = year;
        this.type = bookType;
        this.isrented = "false";
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the publisher
     */
    public String getPublisher() {
        return publisher;
    }

    /**
     * @param publisher the publisher to set
     */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the isRented
     */
    public String getIsrented() {
        return isrented;
    }

    /**
     * @param isRented the isRented to set
     */
    public void setIsrented(String isRented) {
        this.isrented = isRented;
    }
    
    
}
