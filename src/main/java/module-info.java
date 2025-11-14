module org.example.culturegjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.culturegjava to javafx.fxml;
    exports org.example.culturegjava;
}