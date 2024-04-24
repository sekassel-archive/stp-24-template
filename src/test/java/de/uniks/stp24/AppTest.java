package de.uniks.stp24;

import javafx.stage.Stage;
import org.junit.jupiter.api.Test;
import org.mockito.Spy;
import org.testfx.framework.junit5.ApplicationTest;

public class AppTest extends ApplicationTest {

    @Spy
    public final App app = new App();

    @Override
    public void start(Stage stage) throws Exception {
        super.start(stage);
        app.setComponent(DaggerTestComponent.builder().mainApp(app).build());
        app.start(stage);
        stage.requestFocus();
    }

    @Test
    public void v1() {
        // TODO login, main-menu, ...
    }

}
