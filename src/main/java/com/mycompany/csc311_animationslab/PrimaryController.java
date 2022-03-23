package com.mycompany.csc311_animationslab;

import java.io.IOException;
import javafx.animation.FillTransition;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private Rectangle blueRect;

    @FXML
    private void yellowTransition() {

        FillTransition changeToYellow
                = new FillTransition(Duration.seconds(2), blueRect);
        changeToYellow.setToValue(Color.YELLOW);        
        changeToYellow.setCycleCount(1);
        changeToYellow.play();

    }

}
