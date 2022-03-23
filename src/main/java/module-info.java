module com.mycompany.csc311_animationslab {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.csc311_animationslab to javafx.fxml;
    exports com.mycompany.csc311_animationslab;
}
