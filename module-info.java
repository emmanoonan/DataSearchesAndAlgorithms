module project230 {
    requires javafx.controls;
    requires javafx.fxml;

    opens project230 to javafx.fxml;
    exports project230;
}
