module org.openjfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.openjfx to javafx.fxml;
    exports org.openjfx;

    opens org.openjfx.Controller;
    exports org.openjfx.Controller to javafx.fxml;
}