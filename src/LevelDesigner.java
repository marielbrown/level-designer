import processing.core.PApplet;

import java.awt.*;

public class LevelDesigner extends PApplet {

    Canvas canvas;
    Toolbar toolbar;
    Sidebar sidebar;
    ButtonHandler buttonHandler = new ButtonHandler();

    public static void main(String[] args){
        String[] processingArgs = {"Level Designer"};
        LevelDesigner app = new LevelDesigner();
        PApplet.runSketch(processingArgs, app);
    }

    @Override   
    public void settings(){
        // runs once before the processing sketch has been set up

        size(1920 - 70, 1080 - 70); // set initial window size
        noSmooth(); // turns off interpolation, must be run after size
    }

    @Override
    public void setup(){
        // runs once after the processing sketch has been set up
        canvas = new Canvas(this);
        toolbar = new Toolbar(this, buttonHandler);
        sidebar = new Sidebar(this);
    }

    @Override
    public void draw(){
        // called every frame
        update();
        render();
    }

    private void update(){
        //stub
    }

    private void render(){
        background(50, 50, 50);
        canvas.render(this);
        toolbar.render(this);
        sidebar.render(this);
    }

    @Override
    public void mouseClicked() {
        for (Button button: toolbar.buttons){
            if(button.isMouseOver(mouseX, mouseY)){
                button.click();
            }
        }
    }
}
