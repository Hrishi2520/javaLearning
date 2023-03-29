package com.example.taskexample.sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;

import javax.swing.text.html.ListView;

public class Controller {
    private Task<ObservableList<String>> task;
    @FXML
    private ListView listView;
    public void initialize() {
        task = new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                Thread.sleep(1000);
                final ObservableList<String> employees =  FXCollections.observableArrayList(
                        "Hrishikesh Shedge",
                        "Bhavesh Kadam",
                        "Ketan Shinde",
                        "Vishal zambare");
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        listView.setItems(employees);
                    }
                });
                return employees;
            }
        };
        listView.itemsProperty().bind(task.valueProperty());
    }
    @FXML
    public void buttonPressed() {
        new Thread(task).start();
    }
}
