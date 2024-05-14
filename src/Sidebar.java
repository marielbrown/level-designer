import processing.core.PApplet;

public class Sidebar extends UIElement{

    Sidebar(PApplet app){
        width = app.width / 1.75f;   // 1/4 size of screen
        height = app.height;
        position.x = app.width / 1.25f;
        position.y = 0;
    }

    @Override
    void render(PApplet app) {
        app.stroke(0);
        app.fill(120, 120, 120);
        app.rect(position.x, position.y, width, height);
    }
}
