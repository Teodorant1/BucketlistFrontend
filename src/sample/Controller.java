package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;



public class Controller {

String placeholder = "placeholder";

    @FXML public Button insertCLT;

    @FXML private void InsertCLT (ActionEvent actionEvent)
        throws Exception
    {

        Courier task1 = new Courier("InsertCLT",  placeholder,clttext.getText(), placeholder,3334);
        Thread thread1 = new Thread(task1);
        cltstatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {cltstatus.textProperty().unbind();});
        thread1.start();


    }

    @FXML public Button pullCLTnoITEMS;

    @FXML private void pullCLTnoITEMS (ActionEvent actionEvent) throws Exception
    { Courier task1 = new Courier("pullCLTnoITEMS", cltid.getText(), placeholder, placeholder,3335);
        Thread thread1 = new Thread(task1);
        cltstatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {cltstatus.textProperty().unbind();});
        thread1.start();  }

    @FXML public Button updateClt;

    @FXML private void updateClt (ActionEvent actionEvent) throws Exception
    {

        Courier task1 = new Courier("updateClt", cltid.getText() , clttext.getText(), placeholder,3334);
        Thread thread1 = new Thread(task1);
        cltstatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {cltstatus.textProperty().unbind();});
        thread1.start();}


    @FXML public Button deleteCLT;

    @FXML private void deleteCLT(ActionEvent actionEvent) throws Exception
    {Courier task1 = new Courier("deleteCLT", cltid.getText() , placeholder, placeholder,3334);
        Thread thread1 = new Thread(task1);
        cltstatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {cltstatus.textProperty().unbind();});
        thread1.start();}

    @FXML public Button insertCLIT;

    @FXML private void insertCLIT(ActionEvent actionEvent) throws Exception
    {
        Courier task1 = new Courier("insertCLIT", placeholder,itemclttext.getText() ,  placeholder,3334);
        Thread thread1 = new Thread(task1);
        ItemCLTstatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {ItemCLTstatus.textProperty().unbind();});
        thread1.start();}


    @FXML public Button pullCLIT;
    @FXML private void pullCLIT(ActionEvent actionEvent) throws Exception
    { Courier task1 = new Courier("pullCLIT", itemcltid.getText() , placeholder, placeholder,3334);
        Thread thread1 = new Thread(task1);
        ItemCLTstatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {ItemCLTstatus.textProperty().unbind();});
        thread1.start();}

    @FXML public Button updateCLIT;
    @FXML private void updateCLIT ( ActionEvent actionEvent) throws Exception
    { {

        Courier task1 = new Courier("updateCLIT", itemcltid.getText() ,itemclttext.getText(),placeholder,  3334);
        Thread thread1 = new Thread(task1);
        ItemCLTstatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {ItemCLTstatus.textProperty().unbind();});
        thread1.start();} }
    @FXML public Button deleteCLIT;
    @FXML private void deleteCLIT (ActionEvent actionEvent) throws Exception
    { Courier task1 = new Courier("deleteCLIT", itemcltid.getText() , placeholder, placeholder,3334);
        Thread thread1 = new Thread(task1);
        ItemCLTstatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {ItemCLTstatus.textProperty().unbind();});
        thread1.start();  }

    @FXML public Button insertTF;
    @FXML private void insertTF (ActionEvent actionEvent) throws Exception
    {
        Courier task1 = new Courier("insertTF",  placeholder,timeframetext.getText() , placeholder,3334);
        Thread thread1 = new Thread(task1);
        timeframestatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {timeframestatus.textProperty().unbind();});
        thread1.start(); }

    @FXML public Button pullTimeFrameTF;
    @FXML private void  pullTimeFrameTF (ActionEvent actionEvent) throws Exception
    { Courier task1 = new Courier("pullTimeFrameTF", timeframeid.getText() , placeholder, placeholder,3334);
        Thread thread1 = new Thread(task1);
        timeframestatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {timeframestatus.textProperty().unbind();});
        thread1.start(); }

    @FXML public Button updateTF;
    @FXML private void updateTF (ActionEvent actionEvent) throws Exception
    {
        {

            Courier task1 = new Courier("updateTF", timeframeid.getText() , timeframetext.getText(),placeholder, 3334);
            Thread thread1 = new Thread(task1);
            timeframestatus.textProperty().bind(task1.valueProperty());
            task1.setOnSucceeded( e -> {timeframestatus.textProperty().unbind();});
            thread1.start();}
    }
    @FXML public Button deleteTF ;
    @FXML private void deleteTF (ActionEvent actionEvent) throws Exception
    { Courier task1 = new Courier("deleteTF", timeframeid.getText() , placeholder, placeholder,3334);
        Thread thread1 = new Thread(task1);
        timeframestatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {timeframestatus.textProperty().unbind();});
        thread1.start(); }

    @FXML public Button insertEmployee;
    @FXML private void insertEmployee (ActionEvent actionEvent) throws Exception
    {
        {

            Courier task1 = new Courier("insertEmployee", placeholder,employeetext.getText() ,  placeholder,3334);
            Thread thread1 = new Thread(task1);
            employeestatus.textProperty().bind(task1.valueProperty());
            task1.setOnSucceeded( e -> {employeestatus.textProperty().unbind();});
            thread1.start();}
    }


    @FXML public Button pullEmployee;
    @FXML private void  pullEmployee (ActionEvent actionEvent) throws Exception
    {   Courier task1 = new Courier("pullEmployee", employeeid.getText() , placeholder, placeholder,3334);
        Thread thread1 = new Thread(task1);
        employeestatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {employeestatus.textProperty().unbind();});
        thread1.start(); }
    @FXML public Button updateEmployee;
    @FXML private void updateEmployee(ActionEvent actionEvent) throws Exception
    {   Courier task1 = new Courier("updateEmployee", employeeid.getText() , employeetext.getText(), placeholder,3334);
        Thread thread1 = new Thread(task1);
        employeestatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {employeestatus.textProperty().unbind();});
        thread1.start();}
    @FXML public Button deleteEMP;
    @FXML private void deleteEMP (ActionEvent actionEvent) throws Exception
    { Courier task1 = new Courier("deleteEMP", employeeid.getText() , placeholder, placeholder,3334);
        Thread thread1 = new Thread(task1);
        employeestatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {employeestatus.textProperty().unbind();});
        thread1.start(); }
    @FXML public Button insertEmployeeChecklist;
    @FXML private void  insertEmployeeChecklist(ActionEvent actionEvent) throws Exception
    {Courier task1 = new Courier("insertEmployeeChecklist", employeeid.getText() , ecltext.getText(), placeholder,3334);
        Thread thread1 = new Thread(task1);
        eclstatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {eclstatus.textProperty().unbind();});
        thread1.start();}
    @FXML public Button pullEmployeeCheckListECL;
    @FXML private void  pullEmployeeCheckListECL(ActionEvent actionEvent) throws Exception
    {
        Courier task1 = new Courier("pullEmployeeCheckListECL", employeeid.getText() , placeholder, placeholder,3334);
        Thread thread1 = new Thread(task1);
        eclstatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {eclstatus.textProperty().unbind();});
        thread1.start();}
    @FXML public Button updateEmployeeChecklist;
    @FXML private void  updateEmployeeChecklist(ActionEvent actionEvent) throws Exception
    {   Courier task1 = new Courier("updateEmployeeChecklist", employeeid.getText() , ecltext.getText(), placeholder,3334);
        Thread thread1 = new Thread(task1);
        eclstatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {eclstatus.textProperty().unbind();});
        thread1.start();}
    @FXML public Button deleteECL;
    @FXML private void  deleteECL(ActionEvent actionEvent) throws Exception
    {
        Courier task1 = new Courier("deleteECL", employeeid.getText() , placeholder, placeholder,3334);
        Thread thread1 = new Thread(task1);
        eclstatus.textProperty().bind(task1.valueProperty());
        task1.setOnSucceeded( e -> {eclstatus.textProperty().unbind();});
        thread1.start();}

    @FXML public TextArea cltid;
    @FXML public TextArea clttext;
    @FXML public TextArea itemcltid;
    @FXML public TextArea itemclttext;
    @FXML public TextArea timeframeid;
    @FXML public TextArea timeframetext;
    @FXML public TextArea employeeid;
    @FXML public TextArea employeetext;
    @FXML public TextArea eclid;
    @FXML public TextArea ecltext;

    @FXML public Label cltstatus;
    @FXML public Label ItemCLTstatus;
    @FXML public Label timeframestatus;
    @FXML public Label employeestatus;
    @FXML public Label eclstatus;



}
