package com.cps240.TermProject;

import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxAssert;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.testfx.matcher.control.LabeledMatchers;

@ExtendWith(ApplicationExtension.class)
class MainTest {
  @Start
  private void start(Stage stage) {
    Main main = new Main();
    main.start(stage);
  }

  @Test
  void has_connect_four_button() {
    FxAssert.verifyThat(".button", LabeledMatchers.hasText("Connect 4"));
  }
}
