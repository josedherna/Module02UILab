module org.csc311.module02uilab {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.csc311.module02uilab to javafx.fxml;
    exports org.csc311.module02uilab;
}