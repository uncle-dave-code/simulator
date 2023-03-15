package com.uncledavecode.simulator;

import javafx.application.Application;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.robot.Robot;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class HelloApplication extends Application {
    public static void main(String[] args) {
        launch();
    }

    Frame frame = new Frame("Simulator");
    TextArea textArea = new TextArea();

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create frame with specific title

        // Create a component to add to the frame; in this case a text area with sample text
        textArea.setText("Ctrl+Q to exit");
        textArea.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.isControlDown()&&e.getKeyCode()==KeyEvent.VK_Q){
                    System.exit(0);
                }
            }
        });
        // Add the components to the frame; by default, the frame has a border layout

        frame.add(textArea, BorderLayout.CENTER);

        // Show the frame

        int width = 300;

        int height = 300;

        frame.setSize(width, height);

        frame.setVisible(true);

        int counter = 1;
        do {
            clickOnScreen();
            Thread.sleep(10000);
            counter++;
            System.out.println("counter = " + counter);
        } while (true);
    }

    private void clickOnScreen() {

        Point point = frame.getLocationOnScreen();
        int xCoord = point.x + 50;
        int yCoord = point.y + 100;
        frame.requestFocus();
        textArea.requestFocus();

        Robot robot = new Robot();

        robot.mouseMove(xCoord, yCoord);

        // Simulate a mouse click
        robot.mousePress(MouseButton.PRIMARY);
        robot.mouseRelease(MouseButton.PRIMARY);

        // Simulate a key press
        robot.keyPress(KeyCode.END);
        robot.keyRelease(KeyCode.END);
        robot.keyPress(KeyCode.ENTER);
        robot.keyRelease(KeyCode.ENTER);

        robot.keyPress(KeyCode.U);
        robot.keyRelease(KeyCode.U);

        robot.keyPress(KeyCode.N);
        robot.keyRelease(KeyCode.N);

        robot.keyPress(KeyCode.C);
        robot.keyRelease(KeyCode.C);

        robot.keyPress(KeyCode.L);
        robot.keyRelease(KeyCode.L);

        robot.keyPress(KeyCode.E);
        robot.keyRelease(KeyCode.E);

        robot.keyPress(KeyCode.UNDERSCORE);
        robot.keyRelease(KeyCode.UNDERSCORE);

        robot.keyPress(KeyCode.D);
        robot.keyRelease(KeyCode.D);

        robot.keyPress(KeyCode.A);
        robot.keyRelease(KeyCode.A);

        robot.keyPress(KeyCode.V);
        robot.keyRelease(KeyCode.V);

        robot.keyPress(KeyCode.E);
        robot.keyRelease(KeyCode.E);

    }
}