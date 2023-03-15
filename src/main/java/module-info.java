module com.uncledavecode.simulator {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.uncledavecode.simulator to javafx.fxml;
    exports com.uncledavecode.simulator;
}