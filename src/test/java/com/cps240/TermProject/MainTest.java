package com.cps240.TermProject;

import javafx.stage.Stage;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationExtension;
import org.testfx.framework.junit5.Start;
import org.testfx.service.query.NodeQuery;

@ExtendWith(ApplicationExtension.class)
class MainTest {
  @Start
  private void start(Stage stage) {
    Main main = new Main();
    main.start(stage);
  }

  @Test
  void has_a_button_for_each_game(FxRobot robot) {
    NodeQuery query = robot.lookup(".button");
    Assertions.assertThat(query.queryAll().size()).isEqualTo(4);
  }
}
