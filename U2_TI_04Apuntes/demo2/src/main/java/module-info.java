module mx.edu.utez.demo2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.demo2 to javafx.fxml;
    exports mx.edu.utez.demo2;
}