module org.main.module03_w4_labwork {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.main.module03_w4_labwork to javafx.fxml;
    exports org.main.module03_w4_labwork;
}