package com.cps240.TermProject;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.testfx.assertions.api.Assertions;
import org.testfx.framework.junit5.ApplicationTest;

class MainTest extends ApplicationTest {
  private Button button;

  @Override
  public void start(Stage stage) {
    button = new Button("click me!");
    button.setOnAction(ev -> button.setText("clicked!"));
    stage.setScene(new Scene(new StackPane(button), 100, 100));
    stage.show();
  }

  @Test
  void when_button_is_clicked_text_changes() {
    clickOn(".button");
    Assertions.assertThat(button).hasText("clicked!");
  }
}
