package gui;

import controller.taskManager;
import utils.taskFormatter;
import model.task;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class App extends Application {
    private taskManager manager = new taskManager();
    private ListView<String> listView = new ListView<>();

    private TextField inputNama = new TextField();
    private DatePicker inputDeadline = new DatePicker();

    @Override
    public void start(Stage stage) {
        stage.setTitle("To Do List - JavaFX");

        // INPUT PANEL
        VBox inputBox = new VBox(10);
        inputBox.setPadding(new Insets(10));

        inputNama.setPromptText("Nama Tugas");
        inputDeadline.setPromptText("Deadline");

        Button btnTambah = new Button("Tambah");

        inputBox.getChildren().addAll(
                new Label("Nama Tugas:"), inputNama,
                new Label("Deadline:"), inputDeadline,
                btnTambah
        );

        
        HBox aksiBox = new HBox(10);
        aksiBox.setPadding(new Insets(10));
        aksiBox.setAlignment(Pos.CENTER);

        Button btnSelesai = new Button("Tandai Selesai");
        Button btnHapus = new Button("Hapus");

        aksiBox.getChildren().addAll(btnSelesai, btnHapus);

        
        BorderPane root = new BorderPane();
        root.setTop(inputBox);
        root.setCenter(listView);
        root.setBottom(aksiBox);

        
        btnTambah.setOnAction(e -> tambah());
        btnHapus.setOnAction(e -> hapus());
        btnSelesai.setOnAction(e -> tandaiSelesai());

        stage.setScene(new Scene(root, 400, 500));
        stage.show();
    }

    private void tambah() {
        String nama = inputNama.getText();
        String deadline = (inputDeadline.getValue() == null) ? task.DEFAULT_DEADLINE
                          : inputDeadline.getValue().toString();

        if (!nama.isEmpty()) {
            manager.tambahTugas(nama, deadline);
            updateList();
            inputNama.clear();
            inputDeadline.setValue(null);
        }
    }

    private void hapus() {
        int index = listView.getSelectionModel().getSelectedIndex();
        manager.hapusTugas(index);
        updateList();
    }

    private void tandaiSelesai() {
        int index = listView.getSelectionModel().getSelectedIndex();
        manager.tandaiSelesai(index);
        updateList();
    }

    private void updateList() {
        listView.getItems().clear();
        for (task t : manager.getSemuaTugas()) {
            listView.getItems().add(taskFormatter.format(t));
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}