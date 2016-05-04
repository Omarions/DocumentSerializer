/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Controller.BankController;
import Controller.LetterController;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import model.Bank;
import org.omg.CORBA.BAD_CONTEXT;

/**
 * FXML Controller class
 *
 * @author Omar
 */
public class MainController implements Initializable {

    @FXML
    private Button btnSearch;
    @FXML
    private TextField tfSearch;
    @FXML
    private TableView tblAccounts;
    @FXML
    private TableColumn<Bank, Integer> colID;
    @FXML
    private TableColumn<Bank, String> colName;
    @FXML
    private TableColumn<Bank, String> colAccNo;
    @FXML
    private TableColumn<Bank, String> colCurrency;
    @FXML
    private TableColumn<Bank, String> colSwiftCode;
    @FXML
    private TableColumn<Bank, String> colComments;

    private List<Bank> accountList;
    private BankController bankController;

    private ObservableList<Bank> accounts;

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            bankController = new BankController();
        } catch (Exception ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }
        accountList = bankController.getAccounts();
        accounts = FXCollections.observableArrayList(accountList);
        colID.setCellValueFactory(new PropertyValueFactory<>("Id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colCurrency.setCellValueFactory(new PropertyValueFactory<>("Currency"));
        colAccNo.setCellValueFactory(new PropertyValueFactory<>("AccountNo"));
        colSwiftCode.setCellValueFactory(new PropertyValueFactory<>("SwiftCode"));
        colComments.setCellValueFactory(new PropertyValueFactory<>("Comments"));

        tblAccounts.setItems(accounts);

        //btnSearch.backgroundProperty().set(new Background(new BackgroundImage(new Image(getClass().getResource("/images/b_search.png").toExternalForm()), BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, BackgroundSize.DEFAULT)));
    }

    public void search(ActionEvent event) {
        String searchKey = tfSearch.getText();
        if (searchKey.isEmpty()) {
            accountList = bankController.getAccounts();
            accounts = FXCollections.observableArrayList(accountList);
            tblAccounts.setItems(accounts);
        } else {
            accountList = bankController.getBankByName(searchKey);
            accounts = FXCollections.observableArrayList(accountList);
            tblAccounts.setItems(accounts);
        }
    }

}
