package t3poo;


public class Rent {
    String rentDate;
    String devolution;
    String userId;
    String bookId;
    boolean late;
    
    public Rent(){
        
    }
    
    public Rent(String rentDate, String devolution, String userId,
            String bookId){
        this.rentDate = rentDate;
        this.devolution = devolution;
        this.userId = userId;
        this.bookId = bookId;
        this.late = false;
    }

    /**
     * @return the rentDate
     */
    public String getRentDate() {
        return rentDate;
    }

    /**
     * @param rentDate the rentDate to set
     */
    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    /**
     * @return the devolution
     */
    public String getDevolution() {
        return devolution;
    }

    /**
     * @param devolution the devolution to set
     */
    public void setDevolution(String devolution) {
        this.devolution = devolution;
    }

    /**
     * @return the userId
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * @return the bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the late
     */
    public boolean isLate() {
        return late;
    }

    /**
     * @param late the late to set
     */
    public void setLate(boolean late) {
        this.late = late;
    }
    
}
