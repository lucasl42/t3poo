
package t3poo;



import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import org.joda.time.DateTime;
import static org.joda.time.Days.daysBetween;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class LibraryWindow extends Application implements EventHandler<ActionEvent>{
    
    /**
     * Declaração de todos os combonentes usados
     * na interface do aplicativo.
     */
    
    public Button b1 = new Button("Users Register");
    public Button b2 = new Button("List Data");
    public Button b3 = new Button("Books Register");
    public Button b4 = new Button("Rents");
    public Button b5 = new Button("Devolutions");
    public Label lb1 = new Label("Library\nSystem \n ICMC");
    public Label warningLabel = new Label();
    public Label lbTime = new Label();
    public Button exitButton = new Button("Exit");
    
    public Button registerUserButton = new Button("Register");
    public ComboBox cbRegister = new ComboBox();
    public TextField userID = new TextField();
    public TextField userName = new TextField();
    public TextField userBirthDate = new TextField();
    public TextField userEmail = new TextField();
    public Button returnButton1 = new Button("Back");
    public Label lbID = new Label("ID:");
    public Label lbUserName = new Label("Name:");
    public Label lbBirthDate = new Label("Birth Date:");
    public Label lbEmail = new Label("Email:");
    public Label lbUserType = new Label("User Type:");
    
    
    
    public Button registerBook = new Button("Register");
    public TextField bookID = new TextField();
    public TextField bookName = new TextField();
    public TextField bookPublisher = new TextField();
    public TextField bookAuthor = new TextField();
    public TextField bookYear = new TextField();
    public TextField bookGender = new TextField();
    public ComboBox cbBookType = new ComboBox();
    public Button returnButton2 = new Button("Back");
    public Label lbBookID = new Label("ID: ");
    public Label lbBookName = new Label("Name: ");
    public Label lbPublisher = new Label("Publisher: ");
    public Label lbAuthor = new Label("Author: ");
    public Label lbGender = new Label("Gender:");
    public Label lbYear = new Label("Year:");
    public Label lbBookType = new Label("Book Type:");
    
    
    public ComboBox cbList = new ComboBox();
    public Button bList = new Button("List");
    public TableView<Student> tbStudents = new TableView<>();
    public TableView<Professor> tbProfessors = new TableView<>();
    public TableView<GeneralUser> tbGUsers = new TableView<>();
    public TableView<Book> tbBook = new TableView<>();
    public TableView<Rent> tbRents = new TableView<>();
    public Button returnButton3 = new Button("Back");
    public Label lbListType = new Label("List type:");
    
    public TextField rentUserID = new TextField();
    public TextField rentBookID = new TextField();
    public TextField rentDP = new TextField();
    public Button registerRent = new Button("Rent");
    public Button returnButton4 = new Button("Back");
    public Label lbRentUserID = new Label("User ID:");
    public Label lbRentBookID = new Label("Book ID:");
    public Label lbRentDate = new Label("Rent Date:");
    
    public TextField devUserID = new TextField();
    public TextField devBookID = new TextField();
    public TextField devDate = new TextField();
    public Button registerDevolution = new Button("Devolute");
    public Button returnButton5 = new Button("Back");
    public Label lbDevUserID = new Label("User ID:");
    public Label lbDevBookID = new Label("Book ID:");
    public Label lbDevDate = new Label("Devolution\n   Date:");
    
    DateTimeFormatter dt = DateTimeFormat.forPattern("dd/MM/yy");
    LocalDate date = new LocalDate();
    
    Library lb = new Library();
    
    public static void main(String[] args){
        launch(args);
    }
    
    /**
     * Método responsável por atribuir características aos elementos
     * da interface do aplicativo. Temos como exemplos de elementos: 
     * caixas de texto, botões, labels.
     * @param stage
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Library System");
        
        b1.setTranslateY(-80);
        b1.setTranslateX(-140);
        b1.setMaxSize(140, 30);
        b1.setOnAction(this);
        
        b2.setMaxSize(140, 30);
        b2.setTranslateX(-140);
        b2.setOnAction(this);
        
        b3.setMaxSize(140, 30);
        b3.setTranslateX(-140);
        b3.setTranslateY(-40);
        b3.setOnAction(this);
        
        b4.setMaxSize(140, 30);
        b4.setTranslateX(-140);
        b4.setTranslateY(40);
        b4.setOnAction(this);
        
        b5.setMaxSize(140, 30);
        b5.setTranslateX(-140);
        b5.setTranslateY(80);
        b5.setOnAction(this);
        
        lb1.setVisible(true);
        lb1.setTranslateY(0);
        lb1.setTranslateX(130);
        lb1.setFont(Font.font("Tahoma", FontWeight.BOLD, 30));
        
        lbTime.setTranslateX(100);
        lbTime.setTranslateY(180);
        lbTime.setText(date.toString("dd/MM/YY"));
        lbTime.setFont(Font.font("Tahoma", FontWeight.BOLD, 15));
        
        warningLabel.setVisible(false);
        warningLabel.setTranslateX(-200);
        warningLabel.setTranslateY(150);
        warningLabel.setMaxSize(200, 100);
        warningLabel.setText("");
        warningLabel.setFont(Font.font("Tahoma", FontWeight.BOLD, 12));
                
        exitButton.setTranslateY(180);
        exitButton.setTranslateX(200);
        exitButton.setOnAction(this);
        
        cbRegister.setVisible(false);
        cbRegister.setTranslateX(-120);
        cbRegister.setTranslateY(-120);
        cbRegister.setMaxWidth(150);
        cbRegister.getItems().addAll(
                "Student",
                "Professor",
                "General User");
        lbUserType.setVisible(false);
        lbUserType.setTranslateY(-120);
        lbUserType.setTranslateX(-200);
        lbUserType.setMaxWidth(100);
        
        userID.setVisible(false);
        userID.setTranslateY(-80);
        userID.setMaxWidth(200);
        userID.setTranslateX(-90);
        lbID.setVisible(false);
        lbID.setTranslateY(-80);
        lbID.setTranslateX(-200);
        lbID.setMaxWidth(100);
        
        userName.setVisible(false);
        userName.setMaxWidth(200);
        userName.setTranslateX(-90);
        userName.setTranslateY(-40);
        lbUserName.setVisible(false);
        lbUserName.setTranslateY(-40);
        lbUserName.setTranslateX(-200);
        lbUserName.setMaxWidth(100);
        
        userBirthDate.setVisible(false);
        userBirthDate.setTranslateX(-90);
        userBirthDate.setMaxWidth(200);
        lbBirthDate.setVisible(false);
        lbBirthDate.setTranslateY(0);
        lbBirthDate.setTranslateX(-200);
        lbBirthDate.setMaxWidth(100);
        
        userEmail.setVisible(false);
        userEmail.setMaxWidth(200);
        userEmail.setTranslateX(-90);
        userEmail.setTranslateY(40);
        lbEmail.setVisible(false);
        lbEmail.setTranslateY(40);
        lbEmail.setTranslateX(-200);
        lbEmail.setMaxWidth(100);
        
        registerUserButton.setVisible(false);
        registerUserButton.setTranslateX(-50);
        registerUserButton.setTranslateY(80);
        registerUserButton.setOnAction(this);
        
        returnButton1.setVisible(false);
        returnButton1.setTranslateX(-170);
        returnButton1.setTranslateY(80);
        returnButton1.setOnAction(this);
        
        bookID.setVisible(false);
        bookID.setTranslateX(-160);
        bookID.setTranslateY(-80);
        bookID.setMaxWidth(80);
        lbBookID.setVisible(false);
        lbBookID.setTranslateX(-240);
        lbBookID.setTranslateY(-80);
        
        bookName.setVisible(false);
        bookName.setTranslateX(-100);
        bookName.setTranslateY(-40);
        bookName.setMaxWidth(200);
        lbBookName.setVisible(false);
        lbBookName.setTranslateX(-240);
        lbBookName.setTranslateY(-40);
        
        bookGender.setVisible(false);
        bookGender.setTranslateX(-100);
        bookGender.setTranslateY(-0);
        bookGender.setMaxWidth(200);
        lbGender.setVisible(false);
        lbGender.setTranslateX(-240);
        lbGender.setTranslateY(-00);
        
        bookAuthor.setVisible(false);
        bookAuthor.setTranslateX(-100);
        bookAuthor.setTranslateY(40);
        bookAuthor.setMaxWidth(200);
        lbAuthor.setVisible(false);
        lbAuthor.setTranslateX(-240);
        lbAuthor.setTranslateY(40);
        
        bookPublisher.setVisible(false);
        bookPublisher.setTranslateX(-100);
        bookPublisher.setTranslateY(80);
        bookPublisher.setMaxWidth(200);
        lbPublisher.setVisible(false);
        lbPublisher.setTranslateX(-240);
        lbPublisher.setTranslateY(80);
        
        bookYear.setVisible(false);
        bookYear.setTranslateX(-40);
        bookYear.setTranslateY(-80);
        bookYear.setMaxWidth(80);
        lbYear.setVisible(false);
        lbYear.setTranslateX(-100);
        lbYear.setTranslateY(-80);
        
        cbBookType.setVisible(false);
        cbBookType.setTranslateX(-120);
        cbBookType.setTranslateY(-120);
        cbBookType.setMaxWidth(150);
        cbBookType.getItems().addAll("Text", "General");
        lbBookType.setVisible(false);
        lbBookType.setTranslateX(-240);
        lbBookType.setTranslateY(-120);
        
        registerBook.setVisible(false);
        registerBook.setTranslateX(-50);
        registerBook.setTranslateY(120);
        registerBook.setOnAction(this);
        
        returnButton2.setVisible(false);
        returnButton2.setTranslateX(-180);
        returnButton2.setTranslateY(120);
        returnButton2.setOnAction(this);
        
        tbStudents.setVisible(false);
        tbStudents.setEditable(false);
        tbStudents.setMaxHeight(330);
        tbStudents.setTranslateY(20);
        
        TableColumn studentID = new TableColumn("ID");
        studentID.setCellValueFactory(new PropertyValueFactory<>("id"));
        
        TableColumn studentName = new TableColumn("Name");
        studentName.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        TableColumn studentBirthDate = new TableColumn("BirthDate");
        studentBirthDate.setCellValueFactory(
                new PropertyValueFactory<>("birthDate"));
        
        TableColumn studentEmail = new TableColumn("Email");
        studentEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        
        TableColumn booksRented1 = new TableColumn("Books Rented");
        booksRented1.setCellValueFactory(
                new PropertyValueFactory<>("nbooks"));
        
        TableColumn studentSuspended = new TableColumn("Is Suspended?");
        studentSuspended.setCellValueFactory(
                new PropertyValueFactory<>("issuspended"));
        
        tbStudents.getColumns().addAll(studentID, studentName, studentBirthDate,
                studentEmail, booksRented1, studentSuspended);
        
        tbProfessors.setVisible(false);
        tbProfessors.setEditable(false);
        tbProfessors.setMaxHeight(330);
        tbProfessors.setTranslateY(20);
        
        TableColumn professorID = new TableColumn("ID");
        professorID.setCellValueFactory(new PropertyValueFactory<>("id"));
        
        TableColumn professorName = new TableColumn("Name");
        professorName.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        TableColumn professorBirthDate = new TableColumn("Birth Date");
        professorBirthDate.setCellValueFactory(
                new PropertyValueFactory<>("birthDate"));
        
        TableColumn professorEmail = new TableColumn("Email");
        professorEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        
        TableColumn booksRented2 = new TableColumn("Books Rented");
        booksRented2.setCellValueFactory(
                new PropertyValueFactory<>("nbooks"));
        
        TableColumn professorSuspended = new TableColumn("Is Suspended?");
        professorSuspended.setCellValueFactory(
                new PropertyValueFactory<>("issuspended"));
        
        tbProfessors.getColumns().addAll(professorID, professorName, professorBirthDate,
                professorEmail, booksRented2, professorSuspended);
        
        tbGUsers.setVisible(false);
        tbGUsers.setEditable(false);
        tbGUsers.setMaxHeight(330);
        tbGUsers.setTranslateY(20);
        
        TableColumn guID = new TableColumn("ID");
        guID.setCellValueFactory(new PropertyValueFactory<>("id"));
        TableColumn guName = new TableColumn("Name");
        guName.setCellValueFactory(new PropertyValueFactory<>("name"));
        TableColumn guBirthDate = new TableColumn("Birth Date");
        guBirthDate.setCellValueFactory(
                new PropertyValueFactory<>("birthDate"));
        TableColumn guEmail = new TableColumn("Email");
        guEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        TableColumn booksRented3 = new TableColumn("Books Rented");
        booksRented3.setCellValueFactory(
                new PropertyValueFactory<>("nbooks"));
        TableColumn guSuspended = new TableColumn("Is Suspended?");
        guSuspended.setCellValueFactory(
                new PropertyValueFactory<>("issuspended"));
        
        tbGUsers.getColumns().addAll(guID, guName, guBirthDate,
                guEmail, booksRented3, guSuspended);
        
        tbBook.setVisible(false);
        tbBook.setEditable(false);
        tbBook.setMaxHeight(330);
        tbBook.setTranslateY(20);
        
        TableColumn bID = new TableColumn("ID");
        bID.setCellValueFactory(new PropertyValueFactory<>("id"));
        
        TableColumn bName = new TableColumn("Name");
        bName.setCellValueFactory(new PropertyValueFactory<>("name"));
        
        TableColumn bGender = new TableColumn("Gender");
        bGender.setCellValueFactory(
                new PropertyValueFactory<>("gender"));
        
        TableColumn bAuthor = new TableColumn("Author");
        bAuthor.setCellValueFactory(new PropertyValueFactory<>("author"));
        
        TableColumn bPublisher = new TableColumn("Publisher");
        bPublisher.setCellValueFactory(
                new PropertyValueFactory<>("publisher"));
        
        TableColumn bYear = new TableColumn("Year");
        bYear.setCellValueFactory(
                new PropertyValueFactory<>("year"));
        
        TableColumn bType = new TableColumn("Type");
        bType.setCellValueFactory(
                new PropertyValueFactory<>("type"));
        
        TableColumn bRented = new TableColumn("Is Rented?");
        bRented.setCellValueFactory(
                new PropertyValueFactory<>("isrented"));
        
        tbBook.getColumns().addAll(bID, bName, bGender,
                bAuthor, bPublisher, bYear, bType, bRented);
        
        tbRents.setVisible(false);
        tbRents.setEditable(false);
        tbRents.setMaxHeight(330);
        tbRents.setTranslateY(20);
        
        TableColumn rUserID = new TableColumn("User ID");
        rUserID.setCellValueFactory(new PropertyValueFactory<>("userId"));
        
        TableColumn rBookID = new TableColumn("Book ID");
        rBookID.setCellValueFactory(new PropertyValueFactory<>("bookId"));
       
        TableColumn rRentDate = new TableColumn("Rent Date");
        rRentDate.setCellValueFactory(
                new PropertyValueFactory<>("rentDate"));
        
        TableColumn rDevolutionDate = new TableColumn("Devolution Date");
        rDevolutionDate.setCellValueFactory(
                new PropertyValueFactory<>("devolution"));
        
        TableColumn rLate = new TableColumn("Is late?");
        rLate.setCellValueFactory(
                new PropertyValueFactory<>("late"));
        
        
        tbRents.getColumns().addAll(rUserID, rBookID, rRentDate, 
                rDevolutionDate, rLate);
        
        bList.setVisible(false);
        bList.setTranslateX(-50);
        bList.setTranslateY(-180);
        bList.setOnAction(this);
        
        cbList.setVisible(false);
        cbList.setTranslateX(-150);
        cbList.setTranslateY(-180);
        cbList.getItems().addAll("Students", "Professors", "General Users",
                "Books", "Rents");
        lbListType.setVisible(false);
        lbListType.setTranslateX(-245);
        lbListType.setTranslateY(-180);
        
        returnButton3.setVisible(false);
        returnButton3.setTranslateX(180);
        returnButton3.setTranslateY(-180);
        returnButton3.setOnAction(this);
        
        registerDevolution.setVisible(false);
        registerDevolution.setTranslateX(-20);
        registerDevolution.setTranslateY(40);
        registerDevolution.setOnAction(this);
        
        
        returnButton5.setVisible(false);
        returnButton5.setTranslateX(-180);
        returnButton5.setTranslateY(40);
        returnButton5.setOnAction(this);
        
        devUserID.setVisible(false);
        devUserID.setTranslateX(-100);
        devUserID.setTranslateY(-80);
        devUserID.setMaxWidth(200);
        lbDevUserID.setVisible(false);
        lbDevUserID.setTranslateX(-240);
        lbDevUserID.setTranslateY(-80);
        
        devBookID.setVisible(false);
        devBookID.setTranslateX(-100);
        devBookID.setTranslateY(-40);
        devBookID.setMaxWidth(200);
        lbDevBookID.setVisible(false);
        lbDevBookID.setTranslateX(-240);
        lbDevBookID.setTranslateY(-40);
        
        devDate.setVisible(false);
        devDate.setTranslateX(-100);
        devDate.setTranslateY(0);
        devDate.setMaxWidth(200);
        lbDevDate.setVisible(false);
        lbDevDate.setTranslateX(-240);
        lbDevDate.setTranslateY(-0);
        lbDevDate.setMinHeight(300);
        
        registerRent.setVisible(false);
        registerRent.setTranslateX(-20);
        registerRent.setTranslateY(40);
        registerRent.setOnAction(this);
        
        
        returnButton4.setVisible(false);
        returnButton4.setTranslateX(-180);
        returnButton4.setTranslateY(40);
        returnButton4.setOnAction(this);
        
        rentUserID.setVisible(false);
        rentUserID.setTranslateX(-100);
        rentUserID.setTranslateY(-80);
        rentUserID.setMaxWidth(200);
        lbRentUserID.setVisible(false);
        lbRentUserID.setTranslateX(-240);
        lbRentUserID.setTranslateY(-80);
        
        rentBookID.setVisible(false);
        rentBookID.setTranslateX(-100);
        rentBookID.setTranslateY(-40);
        rentBookID.setMaxWidth(200);
        lbRentBookID.setVisible(false);
        lbRentBookID.setTranslateX(-240);
        lbRentBookID.setTranslateY(-40);
        
        rentDP.setVisible(false);
        rentDP.setTranslateX(-100);
        rentDP.setTranslateY(0);
        rentDP.setMaxWidth(200);
        lbRentDate.setVisible(false);
        lbRentDate.setTranslateX(-240);
        lbRentDate.setTranslateY(-0);
        
        StackPane layout = new StackPane();
        layout.getChildren().addAll(b1, b2, b3, b4, b5, lbTime, exitButton,
                userID, userName, userEmail, userBirthDate, registerUserButton,
                returnButton1, cbRegister, returnButton2, registerBook,
                cbBookType, bookID, bookName, bookGender, bookAuthor, bookYear,
                bookPublisher, tbStudents, tbProfessors, tbBook, tbGUsers, tbRents,
                cbList, bList, returnButton3, rentDP, rentBookID, rentUserID,
                returnButton4, registerRent, lbUserType, lbID, lbUserName,
                lbEmail, lbBirthDate, lbBookID, lbBookName, lbPublisher,
                lbAuthor, lbYear, lbGender, lbBookType, lbListType, lbRentDate,
                lbRentBookID, lbRentUserID, devUserID, devBookID, returnButton5,
                registerDevolution, lbDevUserID, lbDevBookID, lbDevDate,
                devDate, lb1, warningLabel);
        
        Scene scene = new Scene(layout, 550, 400);
        stage.setScene(scene);
        stage.show();
    }
    
    /**
     * Método responsável por atribuir ações aos botões do aplicativo.
     * @param event 
     */
    @Override
    public void handle(ActionEvent event){
        if(event.getSource() == exitButton){
            System.exit(0);
        } else if(event.getSource() == b1){
            setMainMenuInvisible();
            setUserMenuVisible();
        } else if(event.getSource() == returnButton1){
            setMainMenuVisible();
            setUserMenuInvisible();
            warningLabel.setVisible(false);
        } else if(event.getSource() == b3){
            setMainMenuInvisible();
            setBookMenuVisible();
        } else if(event.getSource() == returnButton2){
            setBookMenuInvisible();
            setMainMenuVisible();
            warningLabel.setVisible(false);
        } else if(event.getSource() == b2){
            setMainMenuInvisible();
            setListMenuVisible();
        } else if(event.getSource() == returnButton3){
            setListMenuInvisible();
            setMainMenuVisible();
            warningLabel.setVisible(false);
        } else if(event.getSource() == b4){
            setMainMenuInvisible();
            setRentMenuVisible();
        } else if(event.getSource() == returnButton4){
            setRentMenuInvisible();
            setMainMenuVisible();
            warningLabel.setVisible(false);
        } else if(event.getSource() == b5) {
            setMainMenuInvisible();
            setDevolutionMenuVisible();
        } else if(event.getSource() == returnButton5) {
            setDevolutionMenuInvisible();
            setMainMenuVisible();
            warningLabel.setVisible(false);
        } else if(event.getSource() == bList){
            switch (cbList.getValue().toString()) {
                case "Students":
                    setListMenuInvisible();
                    lb1.setVisible(false);
                    setListMenuVisible();
            
                try {
                    tbStudents.setItems(lb.searchAllStudents());
                } catch (Exception ex) {
                    System.out.printf("erro1");
                }
            
                    tbStudents.setVisible(true);
                    break;
                case "Professors":
                    setListMenuInvisible();
                    lb1.setVisible(false);
                    setListMenuVisible();
                
                try {
                    tbProfessors.setItems(lb.searchAllProfessors());
                } catch (Exception ex) {
                    System.out.printf("erro2");
                }
                    
                    tbProfessors.setVisible(true);
                    break;
                case "General Users":
                    setListMenuInvisible();
                    lb1.setVisible(false);
                    setListMenuVisible();
                    
                try {
                    tbGUsers.setItems(lb.searchAllGeneralUsers());
                } catch (Exception ex) {
                    System.out.printf("erro3");
                }
                    
                    tbGUsers.setVisible(true);
                    break;
                case "Books":
                    setListMenuInvisible();
                    lb1.setVisible(false);
                    setListMenuVisible();
                
                try {
                    tbBook.setItems(lb.searchAllBooks());
                } catch (Exception ex) {
                
                }
                
                    tbBook.setVisible(true);
                    break;
                    
                case "Rents":
                    setListMenuInvisible();
                    lb1.setVisible(false);
                    setListMenuVisible();
                
                try {
                    lb.updateLateRents(lbTime.getText());
                    tbRents.setItems(lb.searchAllRents());
                } catch (Exception ex) {
                
                }
                
                    tbRents.setVisible(true);
                    break;
                default:
                    warningLabel.setVisible(true);
                    warningLabel.setText("Invalid user type!");
            }
        } else if(event.getSource() == registerUserButton){
            switch(cbRegister.getValue().toString()){
                case "Student":
            
                try {if(lb.verifyIfUserExists(userID.getText()) == null){
                        lb.addNewStudent(new Student(userID.getText(),
                            userName.getText(), userBirthDate.getText(),
                            userEmail.getText()));
                    } else {  }
                } catch (Exception ex) {
                    System.out.printf("Erro");
                } finally {
                    cleanUserFields();
                }
            
                    break;
                case "Professor":
                    
                try { 
                    if(lb.verifyIfUserExists(userID.getText()) == null){
                        lb.addNewProfessor(new Professor(userID.getText(),
                            userName.getText(), userBirthDate.getText(),
                            userEmail.getText()));
                    } else {  }
                } catch (Exception ex) {
                    System.out.printf("Erro");
                } finally {
                    cleanUserFields();
                }
                
                    break;
                    
                case "General User":
                    
                try { 
                    if(lb.verifyIfUserExists(userID.getText()) == null){
                        lb.addNewGeneralUser(new GeneralUser(userID.getText(),
                            userName.getText(), userBirthDate.getText(),
                            userEmail.getText()));
                    } else {  }
                } catch (Exception ex) {
                    System.out.printf("Erro");
                } finally {
                    cleanUserFields();
                }
                    break;
                default:
                    warningLabel.setVisible(true);
                    warningLabel.setText("Invalid user type!");
                    break;
            }
            
        } else if(event.getSource() == registerBook){
            try {
                if(lb.verifyIfBookExists(bookID.getText()) == null){
                    lb.addNewBook(new Book(bookID.getText(), bookName.getText(),
                        bookGender.getText(), bookPublisher.getText(),
                        bookAuthor.getText(), bookYear.getText(),
                        cbBookType.getValue().toString()));
                } else { warningLabel.setVisible(true);
                        warningLabel.setText("This book already exists!");
                }
            } catch (Exception ex) {
                
            }
            cleanBookFields();
        } else if(event.getSource() == registerRent){
            try {
                User u;
                Book b;
                Suspension s;
                if((s = lb.itsSuspendedUser(rentUserID.getText())) != null){
                    LocalDate sd = dt.parseLocalDate(lbTime.getText());
                    LocalDate end = dt.parseLocalDate(s.getEnddate());
                    
                    if(sd.isAfter(end)){
                        lb.updateSuspendedUser(rentUserID.getText(), 
                                lb.getUserType(rentUserID.getText()), false);
                    }
                }
                
                if((u = lb.verifyIfUserExists(rentUserID.getText())) != null &&
                        (b = lb.verifyIfBookExists(rentBookID.getText())) != null &&
                        Integer.parseInt(u.getNbooks()) < (u.getMaxBooks()) &&
                        !(Boolean.parseBoolean(b.getIsrented())) &&
                        !(Boolean.parseBoolean(u.getIssuspended()))){
                    
                                          
                        
                        DateTime date2 = dt.parseDateTime(rentDP.getText());
                    
                        date2 = date2.plusDays(u.getMaxDays());
                    
                        lb.addNewRent(new Rent(rentDP.getText(), 
                            date2.toString(("dd/MM/yy")), rentUserID.getText(),
                            rentBookID.getText()));
                        lb.updateNBooksUser(rentUserID.getText(),
                            lb.getUserType(rentUserID.getText()), 1);
                        lb.updateRentedBook(rentBookID.getText(), true);
                      
                } else {
                    warningLabel.setVisible(true);
                    warningLabel.setText("Rent already exists / Rented book / \n"
                            + "Suspended user / max books reached");
                }
                
            } catch(Exception ex){
                
            }
            cleanRentFields();
        } else if (event.getSource() == registerDevolution){
            Rent r;
            
            try {
                if((r = lb.verifyIfRentExists(devUserID.getText(),
                        devBookID.getText())) != null){
                
                    lb.updateRentedBook(devBookID.getText(), false);
                    lb.removeFinishedRent(devUserID.getText());
                    
                    DateTimeFormatter dt2 = DateTimeFormat.forPattern("dd/MM/yy");
                    
                    LocalDate sd = dt2.parseLocalDate(lbTime.getText());
                    LocalDate dev = dt2.parseLocalDate(r.getDevolution());
                    
                    if(sd.isAfter(dev)){
                        int duration = daysBetween(dev, sd).getDays();
                        lb.addNewSuspension(new Suspension(devUserID.getText(),
                            duration, sd.plusDays(duration).toString("dd/MM/yy")));
                        lb.updateSuspendedUser(devUserID.getText(), 
                                lb.getUserType(devUserID.getText()), true);
                    }
                    
                    
                } else {
                  warningLabel.setVisible(true);
                    warningLabel.setText("Rent does not exist!");  
                }
            } catch (Exception ex) {
                /*não existe aluguel*/
            }
            cleanDevolutionFields();
            
        }
    }
    
    public void setMainMenuVisible(){
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
        b4.setVisible(true);
        b5.setVisible(true);
        exitButton.setVisible(true);
        lb1.setVisible(true);
    }
    
    public void setMainMenuInvisible(){
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        b5.setVisible(false);
        exitButton.setVisible(false);
    }
    
    public void setUserMenuVisible(){
        userID.setVisible(true);
        userName.setVisible(true);
        userBirthDate.setVisible(true);
        userEmail.setVisible(true);
        registerUserButton.setVisible(true);
        returnButton1.setVisible(true);
        cbRegister.setVisible(true);
        lbID.setVisible(true);
        lbUserType.setVisible(true);
        lbUserName.setVisible(true);
        lbEmail.setVisible(true);
        lbBirthDate.setVisible(true);
        cleanUserFields();
    }
    
    public void setUserMenuInvisible(){
        userID.setVisible(false);
        userName.setVisible(false);
        userBirthDate.setVisible(false);
        userEmail.setVisible(false);
        registerUserButton.setVisible(false);
        returnButton1.setVisible(false);
        cbRegister.setVisible(false);
        lbID.setVisible(false);
        lbUserType.setVisible(false);
        lbUserName.setVisible(false);
        lbEmail.setVisible(false);
        lbBirthDate.setVisible(false);
    }
    
    public void setBookMenuVisible(){
        cbBookType.setVisible(true);
        bookID.setVisible(true);
        bookName.setVisible(true);
        bookGender.setVisible(true);
        bookAuthor.setVisible(true);
        bookYear.setVisible(true);
        bookPublisher.setVisible(true);
        returnButton2.setVisible(true);
        registerBook.setVisible(true);
        lbBookType.setVisible(true);
        lbBookName.setVisible(true);
        lbBookID.setVisible(true);
        lbPublisher.setVisible(true);
        lbAuthor.setVisible(true);
        lbYear.setVisible(true);
        lbGender.setVisible(true);
        cleanBookFields();
    }
    
    public void setBookMenuInvisible(){
        cbBookType.setVisible(false);
        bookID.setVisible(false);
        bookName.setVisible(false);
        bookGender.setVisible(false);
        bookAuthor.setVisible(false);
        bookYear.setVisible(false);
        bookPublisher.setVisible(false);
        returnButton2.setVisible(false);
        registerBook.setVisible(false);
        lbBookType.setVisible(false);
        lbBookName.setVisible(false);
        lbBookID.setVisible(false);
        lbPublisher.setVisible(false);
        lbAuthor.setVisible(false);
        lbYear.setVisible(false);
        lbGender.setVisible(false);
    }
    
    public void setListMenuVisible(){
        returnButton3.setVisible(true);
        cbList.setVisible(true);
        bList.setVisible(true);
        cbList.setValue(null);
        lbListType.setVisible(true);
    }
    
    public void setListMenuInvisible(){
        tbStudents.setVisible(false);
        tbBook.setVisible(false);
        tbProfessors.setVisible(false);
        tbGUsers.setVisible(false);
        tbRents.setVisible(false);
        cbList.setVisible(false);
        bList.setVisible(false);
        returnButton3.setVisible(false);
        lbListType.setVisible(false);
    }
    
    public void setRentMenuVisible(){
        returnButton4.setVisible(true);
        registerRent.setVisible(true);
        rentUserID.setVisible(true);
        rentBookID.setVisible(true);
        rentDP.setVisible(true);
        rentUserID.setText("");
        rentBookID.setText("");
        rentDP.setText(lbTime.getText());
        lbRentUserID.setVisible(true);
        lbRentBookID.setVisible(true);
        lbRentDate.setVisible(true);
    }
    
    public void setRentMenuInvisible(){
        returnButton4.setVisible(false);
        registerRent.setVisible(false);
        rentUserID.setVisible(false);
        rentBookID.setVisible(false);
        rentDP.setVisible(false);
        lbRentUserID.setVisible(false);
        lbRentBookID.setVisible(false);
        lbRentDate.setVisible(false);
    }
    
    public void setDevolutionMenuVisible(){
        returnButton5.setVisible(true);
        registerDevolution.setVisible(true);
        devUserID.setVisible(true);
        devBookID.setVisible(true);
        devDate.setVisible(true);
        devUserID.setText("");
        devBookID.setText("");
        devDate.setText(lbTime.getText());
        lbDevUserID.setVisible(true);
        lbDevBookID.setVisible(true);
        lbDevDate.setVisible(true);
    }
    
    public void setDevolutionMenuInvisible(){
        returnButton5.setVisible(false);
        registerDevolution.setVisible(false);
        devUserID.setVisible(false);
        devBookID.setVisible(false);
        devDate.setVisible(false);
        lbDevUserID.setVisible(false);
        lbDevBookID.setVisible(false);
        lbDevDate.setVisible(false);
    }
    
    public void cleanUserFields(){
        userID.setText("");
        userName.setText("");
        userBirthDate.setText("");
        userEmail.setText("");
        cbRegister.setValue(null);
    }
    
    public void cleanBookFields(){
        bookID.setText("");
        bookName.setText("");
        bookPublisher.setText("");
        bookAuthor.setText("");
        bookYear.setText("");
        bookGender.setText("");
        cbBookType.setValue(null);
    }
    
    public void cleanRentFields(){
        rentUserID.setText("");
        rentBookID.setText("");
        rentDP.setText("");
    }
    
    public void cleanDevolutionFields(){
        devUserID.setText("");
        devBookID.setText("");
        devDate.setText("");
    }
}
