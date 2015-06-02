
package t3poo;


public class Devolution {
    String userId;
    String bookId;
    String devolutionDate;
    String rentDate;
    int daysLate;
    
    public Devolution(){
        
    }
    
    public Devolution(String userId, String bookId, String devolutionDate,
            String rentDate, int daysLate){
        this.userId = userId;
        this.bookId = bookId;
        this.devolutionDate = devolutionDate;
        this.rentDate = rentDate;
        this.daysLate = daysLate;
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
     * @return the devolutionDate
     */
    public String getDevolutionDate() {
        return devolutionDate;
    }

    /**
     * @param devolutionDate the devolutionDate to set
     */
    public void setDevolutionDate(String devolutionDate) {
        this.devolutionDate = devolutionDate;
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
     * @return the daysLate
     */
    public int getDaysLate() {
        return daysLate;
    }

    /**
     * @param daysLate the daysLate to set
     */
    public void setDaysLate(int daysLate) {
        this.daysLate = daysLate;
    }
}
