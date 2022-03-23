package com.mycompany.csc311_animationslab;

import java.io.IOException;
import javafx.animation.FillTransition;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.ParallelTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.Timeline;
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
                = new FillTransition(Duration.seconds(3), blueRect);
        changeToYellow.setToValue(Color.YELLOW);
        changeToYellow.setCycleCount(2);
        changeToYellow.setAutoReverse(true);
        changeToYellow.play();

    }

    @FXML
    private void stretchRect() {

        ScaleTransition stretch
                = new ScaleTransition(Duration.seconds(1), blueRect);
        stretch.setByX(2);
        stretch.play();
    }

    @FXML
    private void yellowAndDouble() {

        FillTransition changeToYellow
                = new FillTransition(Duration.seconds(3), blueRect);
        changeToYellow.setToValue(Color.YELLOW);
        changeToYellow.setCycleCount(1);

        ScaleTransition stretch
                = new ScaleTransition(Duration.seconds(1), blueRect);
        stretch.setByX(2);

        ParallelTransition parallelTransition = new ParallelTransition(changeToYellow, stretch);
        parallelTransition.play();
    }

    @FXML
    private void moveXY() {
        KeyValue moveY = new KeyValue(blueRect.translateYProperty(), 400);
        KeyFrame yFrame = new KeyFrame(Duration.seconds(3), moveY);
        Timeline yTransititon = new Timeline(yFrame);
        
        KeyValue moveX = new KeyValue(blueRect.translateXProperty(), -50);
        KeyFrame xFrame = new KeyFrame(Duration.seconds(2), moveX);
        Timeline xTransition = new Timeline(xFrame);
        
        SequentialTransition sequentialTransition
                = new SequentialTransition(yTransititon, xTransition);
        sequentialTransition.play();
    }
}
