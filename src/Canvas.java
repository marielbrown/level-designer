import processing.core.PApplet;
public class Canvas extends UIElement {

    Canvas(PApplet app){
        width = app.width / 1.5f;   // 3/4 size of screen
        height = app.height / 1.5f;

        position.x = app.width * 0.75f / 2f - width / 2;    // positioned in centre
        position.y = (app.height - 35) / 2f - height / 2 + 35;
    }

    @Override
    public void render(PApplet app) {
        app.stroke(0);
        app.fill(100, 100, 100);
        app.rect(position.x, position.y, width, height);
    }
}
