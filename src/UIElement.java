import processing.core.PApplet;

public interface UIElement {

    boolean isMouseOver(int mouseX, int mouseY);

    void render(PApplet app);
}
