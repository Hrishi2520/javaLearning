package com.example.taskexample.sample;

import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

import javax.swing.text.html.ListView;

public class Controller {
    private Task<ObservableList<String>> task;
    @FXML
    private ListView listView;
    @FXML
    private ProgressBar progressBar;
    @FXML
    private Label progressLabel;
    public void initialize() {
        task = new Task<ObservableList<String>>() {
            @Override
            protected ObservableList<String> call() throws Exception {
                String[] names = {"Hrishikesh Shedge",
                        "Bhavesh Kadam",
                        "Ketan Shinde",
                        "Vishal zambare"};
                ObservableList<String> employees =  FXCollections.observableArrayList();
                for (int i = 0; i < 6; i++) {
                    employees.add(names[i]);
                    updateMessage("Added "+names[i]+" to the list");
                    updateProgress(i + 1, 6);
                    Thread.sleep(200);
                }
                return employees;
            }
        };
        progressBar.progressProperty().bind(task.progressProperty());
        listView.itemsProperty().bind(task.valueProperty());
    }
    @FXML
    public void buttonPressed() {
        new Thread(task).start();
    }
}
