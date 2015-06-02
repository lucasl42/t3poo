package t3poo;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class Library{
    
    /**
     * Registra o student s no fim do arquivo de students, caso
     * não tenha sido registrado anteriormente.
     * @param s
     * @throws Exception 
     */
    public void addNewStudent(Student s) throws Exception{
        CSVWriter writer = new CSVWriter(new FileWriter("students.csv", true));
        
        
        String str = s.getId() + "," + s.getName() + "," +
                s.getBirthDate() + "," + s.getEmail() + "," + 
                s.getNbooks() + "," + s.getIssuspended();
        String[] toWrite = str.split(",");
        
        writer.writeNext(toWrite);
        writer.close();
    }
    
    /**
     * Registra o professor p no fim do arquivo de professores, caso
     * não tenha sido registrado anteriormente.
     * @param p
     * @throws Exception 
     */
    public void addNewProfessor(Professor p) throws Exception {
        CSVWriter writer = new CSVWriter(new FileWriter("professors.csv", true));
        
        String str = p.getId() + "," + p.getName() + "," +
                p.getBirthDate() + "," + p.getEmail() + "," + 
                p.getNbooks()+ "," + p.getIssuspended();
        String[] toWrite = str.split(",");
        
        writer.writeNext(toWrite);
        writer.close();
    }
    
    /**
     * Registra o usuário genérico gu no fim do arquivo de usuários genéricos,
     * caso não tenha sido registrado anteriormente.
     * @param gu
     * @throws Exception 
     */
    public void addNewGeneralUser(GeneralUser gu) throws Exception {
        CSVWriter writer = new CSVWriter(new FileWriter("generalusers.csv", true));
        
        String str = gu.getId() + "," + gu.getName() + "," +
                gu.getBirthDate() + "," + gu.getEmail() + "," + 
                gu.getNbooks()+ "," + gu.getIssuspended();
        String[] toWrite = str.split(",");
        
        writer.writeNext(toWrite);
        writer.close(); 
    }
    
    /**
     * Registra o livro b no arquivo de livros, caso não exista. 
     * @param b
     * @throws Exception 
     */
    public void addNewBook(Book b) throws Exception {
        CSVWriter writer = new CSVWriter(new FileWriter("books.csv", true));
        
        String str = b.getId()+ "," + b.getName() + "," + b.getGender() +
                "," + b.getPublisher() + "," + b.getAuthor() + "," +
                b.getYear() + "," + b.getType() + "," + b.getIsrented();
        
        String[] toWrite = str.split(",");
        
        writer.writeNext(toWrite);
        writer.close();
    }
    
    /**
     * Registra o aluguel de livro r no arquivo de aluguéis, caso já não
     * esteja alugo
     * @param r
     * @throws Exception 
     */
    public void addNewRent(Rent r) throws Exception {
        CSVWriter writer = new CSVWriter(new FileWriter("rents.csv", true));
        
        String str = r.getUserId() + "," + r.getBookId() + "," + 
                r.getRentDate() + "," + r.getDevolution() + "," +
                r.isLate();
        
        String[] toWrite = str.split(",");
        
        writer.writeNext(toWrite);
        writer.close();
    }
    
    /**
     * Registra a devolução d no arquivo de devoluções.
     * @param d
     * @throws Exception 
     */
    public void addNewDevolution(Devolution d) throws Exception{
        CSVWriter writer = new CSVWriter(new FileWriter("devolutions.csv", true));
        
        String str = d.getUserId() + "," + d.getBookId() + "," + 
                d.getDevolutionDate()+ "," + d.getRentDate() + "," + 
                d.getDaysLate();
        
        String[] toWrite = str.split(",");
        
        writer.writeNext(toWrite);
        writer.close(); 
    }
    
    /**
     * Registra a suspensão s no arquivo de suspensões.
     * @param s
     * @throws Exception 
     */
    public void addNewSuspension(Suspension s) throws Exception{
        CSVWriter writer = new CSVWriter(new FileWriter("suspensions.csv", true));
        
        String str = s.getUserID() + "," + s.getDuration();
        String[] toWrite = str.split(",");
        writer.writeNext(toWrite);
        writer.close();
    }
    
    /**
     * Pesquisa e retorna em uma ObservableList<Student> todos os registros de
     * estudantes.
     * @return
     * @throws Exception 
     */
    public ObservableList<Student> searchAllStudents() throws Exception{
        CSVReader reader = new CSVReader(new FileReader("students.csv"), ',');
        
        ObservableList<Student> list = FXCollections.observableArrayList();
        
        String[] readen = null;
        
        while((readen = reader.readNext()) != null){
            Student s = new Student();
            s.setId(readen[0]);
            s.setName(readen[1]);
            s.setBirthDate(readen[2]);
            s.setEmail(readen[3]);
            s.setNbooks(readen[4]);
            s.setIssuspended(readen[5]);
            list.add(s);
        }
        reader.close();
        
        return list;
    }
    
    /**
     * Pesquisa e retorna em uma ObservableList<Professor> todos os registros de
     * professores.
     * @return
     * @throws Exception 
     */
    public ObservableList<Professor> searchAllProfessors() throws Exception{
        CSVReader reader = new CSVReader(new FileReader("professors.csv"), ',');
        
        ObservableList<Professor> list2 = FXCollections.observableArrayList();
        
        String[] readen = null;
        
        while((readen = reader.readNext()) != null){
            Professor p = new Professor();
            p.setId(readen[0]);
            p.setName(readen[1]);
            p.setBirthDate(readen[2]);
            p.setEmail(readen[3]);
            p.setNbooks(readen[4]);
            p.setIssuspended(readen[5]);
            list2.add(p);
        }
        
        reader.close();
        
        return list2;
    }
    
    /**
     * Pesquisa e retorna em uma ObservableList<GeneralUser> todos os registros de
     * usuários genéricos.
     * @return
     * @throws Exception 
     */
    public ObservableList<GeneralUser> searchAllGeneralUsers() throws Exception{
        CSVReader reader = new CSVReader(new FileReader("generalusers.csv"), ',');
        
        ObservableList<GeneralUser> list3 = FXCollections.observableArrayList();
        
        String[] readen = null;
        
        while((readen = reader.readNext()) != null){
            GeneralUser gu = new GeneralUser();
            gu.setId(readen[0]);
            gu.setName(readen[1]);
            gu.setBirthDate(readen[2]);
            gu.setEmail(readen[3]);
            gu.setNbooks(readen[4]);
            gu.setIssuspended(readen[5]);
            list3.add(gu);
        }
        
        reader.close();
        
        return list3;
    }
    
    /**
     * * Pesquisa e retorna em uma ObservableList<Book> todos os registros de
     * livros.
     * @return
     * @throws Exception 
     */
    public ObservableList<Book> searchAllBooks() throws Exception{
        CSVReader reader = new CSVReader(new FileReader("books.csv"), ',');
        
        ObservableList<Book> list = FXCollections.observableArrayList();
        
        String[] readen = null;
        
        while((readen = reader.readNext()) != null){
            Book b = new Book();
            b.setId(readen[0]);
            b.setName(readen[1]);
            b.setGender(readen[2]);
            b.setPublisher(readen[3]);
            b.setAuthor(readen[4]);
            b.setYear(readen[5]);
            b.setType(readen[6]);
            b.setIsrented(readen[7]);
            list.add(b);
        }
        
        reader.close();
        
        return list;
    }
    
    /**
     * * Pesquisa e retorna em uma ObservableList<Rent> todos os registros de
     * aluguéis de livros.
     * @return
     * @throws Exception 
     */
    public ObservableList<Rent> searchAllRents() throws Exception{
        CSVReader reader = new CSVReader(new FileReader("rents.csv"), ',');
        
        ObservableList<Rent> list = FXCollections.observableArrayList();
        
        String[] readen = null;
        
        while((readen = reader.readNext()) != null){
            Rent r = new Rent();
            r.setUserId(readen[0]);
            r.setBookId(readen[1]);
            r.setRentDate(readen[2]);
            r.setDevolution(readen[3]);
            r.setLate(Boolean.parseBoolean(readen[4]));
            list.add(r);
        }
        
        reader.close();
        
        return list;
    }
    
    /**
     * * Pesquisa e retorna em uma ObservableList<Suspension> todos os registros de
     * suspensões.
     * @return
     * @throws Exception 
     */
    public ObservableList<Suspension> searchAllSuspensions() throws Exception{
        CSVReader reader = new CSVReader(new FileReader("suspensions.csv"), ',');
        ObservableList<Suspension> list = FXCollections.observableArrayList();
        String[] readen;
        
        while((readen = reader.readNext()) != null){
            Suspension s = new Suspension();
            s.setUserID(readen[0]);
            s.setDuration(Integer.parseInt(readen[1]));
            s.setEnddate(readen[2]);
            list.add(s);
        }
        
        reader.close();
        
        return list;
    }
    
    /**
     * Método responsável por verificar se existe um usuário com id "id" 
     * registrado no sistema.
     * @param id
     * @return
     * @throws Exception 
     */
    public User verifyIfUserExists(String id) throws Exception{
        CSVReader readerS = new CSVReader(new FileReader("students.csv"), ',');
        String[] readenS = null;
        while((readenS = readerS.readNext()) != null){
            Student s = new Student();
            s.setId(readenS[0]);
            s.setName(readenS[1]);
            s.setBirthDate(readenS[2]);
            s.setEmail(readenS[3]);
            s.setNbooks(readenS[4]);
            s.setIssuspended(readenS[5]);
            
            if(s.getId().equals(id))
                return s;
        }
        
        CSVReader readerP = new CSVReader(new FileReader("professors.csv"), ',');
        String[] readenP = null;
        while((readenP = readerP.readNext()) != null){
            Professor p = new Professor();
            p.setId(readenP[0]);
            p.setName(readenP[1]);
            p.setBirthDate(readenP[2]);
            p.setEmail(readenP[3]);
            p.setNbooks(readenP[4]);
            p.setIssuspended(readenP[5]);
            
            if(p.getId().equals(id))
                return p;
        }
        
        CSVReader readerGU = new CSVReader(new FileReader("generalusers.csv"), ',');
        String[] readenGU = null;
        while((readenGU = readerGU.readNext()) != null){
            GeneralUser gu = new GeneralUser();
            gu.setId(readenGU[0]);
            gu.setName(readenGU[1]);
            gu.setBirthDate(readenGU[2]);
            gu.setEmail(readenGU[3]);
            gu.setNbooks(readenGU[4]);
            gu.setIssuspended(readenGU[5]);
            
            if(gu.getId().equals(id))
                return gu;
        }
        
        return null;
    }
    
    /**
     * Método responsável por verificar se existe um livro com id "bookId" 
     * registrado no sistema.
     * @param bookId
     * @return
     * @throws Exception 
     */
    public Book verifyIfBookExists(String bookId) throws Exception{
        CSVReader reader = new CSVReader(new FileReader("books.csv"), ',');
        String [] readen;
        while((readen = reader.readNext()) != null){
            Book b = new Book();
            b.setId(readen[0]);
            b.setName(readen[1]);
            b.setGender(readen[2]);
            b.setPublisher(readen[3]);
            b.setAuthor(readen[4]);
            b.setYear(readen[5]);
            b.setType(readen[6]);
            b.setIsrented(readen[7]);
            
            if(b.getId().equals(bookId))
                return b;
        }
        
        return null;
    }
    
    /**
     * Método responsável por verificar se existe um aluguel com id de usuário
     * "userId" e id de livro "bookId" registrado no sistema.
     * @param userId
     * @param bookId
     * @return
     * @throws Exception 
     */
    public Rent verifyIfRentExists(String userId, String bookId)throws Exception{
        CSVReader reader = new CSVReader(new FileReader("rents.csv"), ',');
        String readen[];
        while((readen = reader.readNext()) != null){
            Rent r = new Rent();
            r.setUserId(readen[0]);
            r.setBookId(readen[1]);
            r.setRentDate(readen[2]);
            r.setDevolution(readen[3]);
            r.setLate(Boolean.parseBoolean(readen[4]));
            
            if(r.getUserId().equals(userId) && 
                    r.getBookId().equals(bookId)){
                return r;
            }
            
        }
        return null;
    }
    
    /**
     * Incrementa ou decrementa a quantidade de livros emprestados a um usuário,
     * atualizando no arquivo de dados.
     * @param id
     * @param userType
     * @param inc
     * @throws Exception 
     */
    public void updateNBooksUser(String id, String userType, int inc) throws Exception{
        switch (userType) {
            case "Student":
                ObservableList<Student> list = searchAllStudents();
                
                for(Student s : list){
                    if(s.getId().equals(id)){
                        int newValue = Integer.parseInt(s.getNbooks()) + inc;
                        s.setNbooks(Integer.toString(newValue));
                    }
                }
                
                CSVWriter writer = new CSVWriter(new FileWriter("students.csv", false));
                
                for(Student s: list){
                    String str = s.getId() + "," + s.getName() + "," +
                        s.getBirthDate() + "," + s.getEmail() + "," + 
                        s.getNbooks() + "," + s.getIssuspended();
                    String[] toWrite = str.split(",");
        
                    writer.writeNext(toWrite);
                }
                    
                writer.close();
                break;
                
            case "Professor":
                
                ObservableList<Professor> list2 = searchAllProfessors();
                
                for(Professor p : list2){
                    if(p.getId().equals(id)){
                        int newValue = Integer.parseInt(p.getNbooks()) + inc;
                        p.setNbooks(Integer.toString(newValue));
                    }
                }
                
                CSVWriter writer2 = new CSVWriter(new FileWriter("professors.csv", false));
                
                for(Professor p: list2){
                    String str = p.getId() + "," + p.getName() + "," +
                        p.getBirthDate() + "," + p.getEmail() + "," + 
                        p.getNbooks() + "," + p.getIssuspended();
                    String[] toWrite = str.split(",");
        
                    writer2.writeNext(toWrite);
                }
                
                writer2.close();
                break;
                
            case "General User":
                ObservableList<GeneralUser> list3 = searchAllGeneralUsers();
                
                for(GeneralUser gu : list3){
                    if(gu.getId().equals(id)){
                        int newValue = Integer.parseInt(gu.getNbooks()) + inc;
                        gu.setNbooks(Integer.toString(newValue));
                    }
                }
                
                CSVWriter writer3 = new CSVWriter(new FileWriter("generalusers.csv", false));
                
                for(GeneralUser gu: list3){
                    String str = gu.getId() + "," + gu.getName() + "," +
                        gu.getBirthDate() + "," + gu.getEmail() + "," + 
                        gu.getNbooks() + "," + gu.getIssuspended();
                    String[] toWrite = str.split(",");
        
                    writer3.writeNext(toWrite);
                }
                
                writer3.close();
                break;
        }
        
    }
    
    /**
     * Determina se o livro com id "id" está alugado ou não, com base no
     * valor boolean "value"
     * @param id
     * @param value
     * @throws Exception 
     */
    public void updateRentedBook(String id, boolean value) throws Exception{
        ObservableList<Book> list = searchAllBooks();
        
        for(Book b : list){
            if(b.getId().equals(id)){
                boolean newValue = value;
                b.setIsrented(Boolean.toString(newValue));
            }
        }
        
        CSVWriter writer = new CSVWriter(new FileWriter("books.csv", false));
        
        for(Book b : list){    
            String str = b.getId()+ "," + b.getName() + "," + b.getGender() +
                "," + b.getPublisher() + "," + b.getAuthor() + "," +
                b.getYear() + "," + b.getType() + "," + b.getIsrented();
        
            String[] toWrite = str.split(",");
        
            writer.writeNext(toWrite);
        
        }
        writer.close();
    }
    
    /**
     * Método responsável por manter atualizado a situação de livros emprestados,
     * se estão com atraso ou não.
     * @param systemDate
     * @throws Exception 
     */
    public void updateLateRents(String systemDate) throws Exception{
        ObservableList<Rent> list = searchAllRents();
        DateTimeFormatter dt = DateTimeFormat.forPattern("dd/MM/yy");
        LocalDate sd = dt.parseLocalDate(systemDate);
        
        for(Rent r : list){
            LocalDate dev = dt.parseLocalDate(r.getDevolution());
            if(sd.isAfter(dev)){
                r.setLate(true);
            } else { r.setLate(false); }
        }
        
        CSVWriter writer = new CSVWriter(new FileWriter("rents.csv", false));
        
        for(Rent r: list){
            String str = r.getUserId() + "," + r.getBookId() + "," + 
                r.getRentDate() + "," + r.getDevolution() + "," +
                r.isLate();
        
            String[] toWrite = str.split(",");
        
            writer.writeNext(toWrite);
        }
        writer.close();
        
    }
    
    /**
     * Determina se o usuário com id "id" está suspenso ou não, com base no
     * valor boolean "value"
     * @param id
     * @param userType
     * @param value
     * @throws Exception 
     */
    public void updateSuspendedUser(String id, String userType, boolean value) throws Exception{
        switch (userType) {
            case "Student":
                ObservableList<Student> list = searchAllStudents();
                
                for(Student s : list){
                    if(s.getId().equals(id)){
                        s.setIssuspended(Boolean.toString(value));
                    }
                }
                
                CSVWriter writer = new CSVWriter(new FileWriter("students.csv", false));
                
                for(Student s: list){
                    String str = s.getId() + "," + s.getName() + "," +
                        s.getBirthDate() + "," + s.getEmail() + "," + 
                        s.getNbooks() + "," + s.getIssuspended();
                    String[] toWrite = str.split(",");
        
                    writer.writeNext(toWrite);
                }
                    
                writer.close();
                break;
                
            case "Professor":
                
                ObservableList<Professor> list2 = searchAllProfessors();
                
                for(Professor p : list2){
                    if(p.getId().equals(id)){
                        
                    }
                }
                
                CSVWriter writer2 = new CSVWriter(new FileWriter("professors.csv", false));
                
                for(Professor p: list2){
                    String str = p.getId() + "," + p.getName() + "," +
                        p.getBirthDate() + "," + p.getEmail() + "," + 
                        p.getNbooks() + "," + p.getIssuspended();
                    String[] toWrite = str.split(",");
        
                    writer2.writeNext(toWrite);
                }
                
                writer2.close();
                break;
                
            case "General User":
                ObservableList<GeneralUser> list3 = searchAllGeneralUsers();
                
                for(GeneralUser gu : list3){
                    if(gu.getId().equals(id)){
                        
                    }
                }
                
                CSVWriter writer3 = new CSVWriter(new FileWriter("generalusers.csv", false));
                
                for(GeneralUser gu: list3){
                    String str = gu.getId() + "," + gu.getName() + "," +
                        gu.getBirthDate() + "," + gu.getEmail() + "," + 
                        gu.getNbooks() + "," + gu.getIssuspended();
                    String[] toWrite = str.split(",");
        
                    writer3.writeNext(toWrite);
                }
                
                writer3.close();
                break;
        }
        
    }
    
    /**
     * Remove do arquivo de dados o aluguel com id de usuário "userID", finaliza
     * o empréstimo.
     * @param userID
     * @throws Exception 
     */
    public void removeFinishedRent(String userID) throws Exception{
        ObservableList<Rent> list = searchAllRents();
        
        CSVWriter writer = new CSVWriter(new FileWriter("rents.csv", false));
        
        for(Rent r: list){
            
            if(!(r.getUserId().equals(userID))){
                String str = r.getUserId() + "," + r.getBookId() + "," + 
                    r.getRentDate() + "," + r.getDevolution() + "," +
                    r.isLate();
        
                String[] toWrite = str.split(",");
        
                writer.writeNext(toWrite);
            }
        
        }
        writer.close();
    }
    
    /**
     * Retorna o tipo de usuário (student, professor ou general user), 
     * dado o seu id.
     * @param id
     * @return
     * @throws Exception 
     */
    public String getUserType(String id) throws Exception{
        CSVReader readerS = new CSVReader(new FileReader("students.csv"), ',');
        String[] readenS = null;
        while((readenS = readerS.readNext()) != null){
            if(readenS[0].equals(id))
                return "Student";
        }
        
        CSVReader readerP = new CSVReader(new FileReader("professors.csv"), ',');
        String[] readenP = null;
        while((readenP = readerP.readNext()) != null){
                        
            if(readenP[0].equals(id))
                return "Professor";
        }
        
        CSVReader readerGU = new CSVReader(new FileReader("generalusers.csv"), ',');
        String[] readenGU = null;
        while((readenGU = readerGU.readNext()) != null){
                        
            if(readenGU[0].equals(id))
                return "General User";
        }
        
        return null;
    }
    
    /**
     * Retorna o tipo de livro (text ou generic), dado o seu id.
     * @param id
     * @return
     * @throws Exception 
     */
    public String getBookType(String id) throws Exception{
        CSVReader reader = new CSVReader(new FileReader("books.csv"), ',');
        String [] readen;
        while((readen = reader.readNext()) != null){
            if(readen[0].equals(id))
                return readen[6];
        }
        
        return null;
    }
    
    /**
     * Verifica se o usuário com id "id" está suspenso ou não.
     * @param id
     * @return
     * @throws Exception 
     */
    public Suspension itsSuspendedUser(String id) throws Exception{
        CSVReader reader = new CSVReader(new FileReader("suspensions.csv"), ',');
        String[] readen;
        while((readen = reader.readNext()) != null){
            Suspension s = new Suspension();
            s.setUserID(readen[0]);
            s.setDuration(Integer.parseInt(readen[1]));
            s.setEnddate(readen[2]);
            
            if(s.getUserID().equals(id))
                return s;
            
        }
        return null;
    }
    
    /**
     * Finaliza a suspensão de um usuário, com base no id fornecido.
     * @param id
     * @throws Exception 
     */
    public void removeFinishedSuspesion(String id) throws Exception{
        ObservableList<Suspension> list = searchAllSuspensions();
        CSVWriter writer = new CSVWriter(new FileWriter("suspensions.csv", false));
        
        for(Suspension s: list){
            if(!(s.getUserID().equals(id))){
                String str = s.getUserID() + "," + s.getDuration();
                String[] toWrite = str.split(",");
                writer.writeNext(toWrite);
            }
        }
        writer.close();
    }
}
