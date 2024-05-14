import processing.core.PApplet;
import processing.core.PVector;

public abstract class UIElement {

    protected float width, height;
    protected PVector position = new PVector(); // top left of element

    boolean isMouseOver(int mouseX, int mouseY){
        return mouseX > position.x && mouseX < position.x + width &&
                mouseY > position.y && mouseY < position.y + height;
    }

    abstract void render(PApplet app);
}
