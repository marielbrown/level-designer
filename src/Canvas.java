import processing.core.PApplet;
import processing.core.PVector;

public class Canvas implements UIElement {

    float width, height;
    PVector position = new PVector(); // top left of element

    Canvas(PApplet app){
        width = app.width / 1.5f;   // 3/4 size of screen
        height = app.height / 1.5f;

        position.x = app.width / 2f - width / 2;    // positioned in centre
        position.y = app.height / 2f - height / 2;
    }

    @Override
    public boolean isMouseOver(int mouseX, int mouseY) {
        return mouseX > position.x && mouseX < position.x + width &&
                mouseY > position.y && mouseY < position.y + height;
    }

    @Override
    public void render(PApplet app) {
        app.stroke(0);
        app.fill(100, 100, 100);
        app.rect(position.x, position.y, width, height);
    }
}
