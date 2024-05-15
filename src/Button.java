import processing.core.PApplet;

public class Button extends UIElement{
    private String text;
    private int textSize = 18;
    private EventListener listener;

    Button(float x, float y, int width, int height, String labelText){
        position.x = x;
        position.y = y;

        this.width = width;
        this.height = height;

        text = labelText;
    }

    @Override
    void render(PApplet app) {
        app.noStroke();
        app.fill(120, 120, 120);
        app.rect(position.x, position.y, width, height);

        app.textSize(textSize);
        app.fill(0);
        app.text(text, position.x + 9, position.y + 20);
    }

    public void addEventListener(EventListener listener){
        this.listener = listener;
    }

    public void click(){
        listener.actionPerformed();
    }

}
