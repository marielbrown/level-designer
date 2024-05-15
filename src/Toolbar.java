import processing.core.PApplet;

public class Toolbar extends UIElement{

    public Button[] buttons;
    EventListener buttonHandler;

    Toolbar(PApplet app, EventListener buttonHandler){
        width = app.width / 1.25f;   // 3/4 size of screen
        height = 35;
        position.x = 0;
        position.y = 0;

        this.buttonHandler = buttonHandler;
        buildButtons();
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

    private void buildButtons(){
        buttons = new Button[3];
        String[] labels = {"New", "Load", "Save"};
        int offset = 5;
        int width = 60;

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button(i * width + offset, 5, width, 25, labels[i]);
            buttons[i].addEventListener(buttonHandler);
        }
    }
}
