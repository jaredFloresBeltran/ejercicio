module com.example.u2_ti_04 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.u2_ti_04 to javafx.fxml;
    exports com.example.u2_ti_04;
}