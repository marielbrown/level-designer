import processing.core.PApplet;

public class Toolbar extends UIElement{

    Button[] buttons;

    Toolbar(PApplet app){
        width = app.width / 1.25f;   // 3/4 size of screen
        height = 35;
        position.x = 0;
        position.y = 0;

        buttons = new Button[1];
        buttons[0] = new Button(5, 5, 60, 25, "Save");
    }

    @Override
    public void render(PApplet app) {
        app.stroke(0);
        app.fill(120, 120, 120);
        app.rect(position.x, position.y, width, height);

        for (Button button: buttons){
            button.render(app);
        }
    }
}
