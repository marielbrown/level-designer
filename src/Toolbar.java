import processing.core.PApplet;

public class Toolbar extends UIElement{

    Toolbar(PApplet app){
        width = app.width / 1.25f;   // 3/4 size of screen
        height = 35;
        position.x = 0;
        position.y = 0;
    }

    @Override
    public void render(PApplet app) {
        app.stroke(0);
        app.fill(120, 120, 120);
        app.rect(position.x, position.y, width, height);
    }
}
