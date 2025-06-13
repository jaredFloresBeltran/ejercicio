package mx.edu.utez.u2_ti_05formulario;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage){
        Label labelNombre = new Label("Nombre: ");
        TextField textFieldNombre = new TextField();
        Label labelApellido = new Label("Apellido: ");
        TextField textFieldApellido = new TextField();
        Label labelEdad = new Label("Edad: ");
        TextField textFieldEdad = new TextField();
        Label labelTipoUsuario = new Label("Escoge un tipo de usuario: ");
        ComboBox<String> comboBoxTipoUsuario = new ComboBox<>();
        comboBoxTipoUsuario.getItems().addAll("Estudiante*","Profesor*","Admin*");
        Button BtnCrear = new Button("Crear");
        Button BtnEliminar = new Button("Eliminar");
        Label labelResultado = new Label("Resultado: ");

        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setStyle("-fx-padding: 30;");

        grid.add(labelNombre, 0, 0);
        grid.add(textFieldNombre, 1, 0);
        grid.add(labelApellido, 0, 1);
        grid.add(textFieldApellido, 1, 1);
        grid.add(labelEdad, 0, 2);
        grid.add(textFieldEdad, 1, 2);
        grid.add(labelTipoUsuario, 0, 3);
        grid.add(comboBoxTipoUsuario, 1, 3);
        grid.add(BtnCrear, 1, 4);
        grid.add(BtnEliminar, 3, 6);
        grid.add(labelResultado, 4, 6);

        BtnCrear.setOnAction(e -> {
            String nombre = textFieldNombre.getText().trim();
            String apellido = textFieldApellido.getText().trim();
            String edad = textFieldEdad.getText().trim();
            String tipoUsuario = comboBoxTipoUsuario.getValue();

            if (nombre.isEmpty() || apellido.isEmpty() || edad.isEmpty() || tipoUsuario.isEmpty()) {
                grid.setStyle("-fx-background-color: lightgreen; -fx-padding: 30;");
                labelResultado.setStyle("-fx-background-color: rgba(173,216,230,0.99); -fx-padding: 30;");
                labelResultado.setText("Nombre" + nombre + "Apellido" + apellido + "Edad" + edad + "TipoUsuario" + tipoUsuario);
            }else {
                labelResultado.setText("Tienes que llena todos los campos.");
                labelResultado.setStyle("-fx-background-color: red; -fx-padding: 30;");
            }

        });

        BtnEliminar.setOnAction(e -> {
            textFieldNombre.clear();
            textFieldApellido.clear();
            textFieldEdad.clear();
            comboBoxTipoUsuario.getSelectionModel().clearSelection();
            labelResultado.setText("");
            labelResultado.setStyle("");
            grid.setStyle("-fx-padding: 30;");

        });

        Scene scene = new Scene(grid, 500, 350);
        primaryStage.setTitle("Formulario");
        primaryStage.setScene(scene);
        primaryStage.show();



    }
    public static void main(String[] args) {launch();}

}