import processing.core.PApplet;

public class LevelDesigner extends PApplet {
    public static void main(String[] args){
        String[] processingArgs = {"Level Designer"};
        LevelDesigner app = new LevelDesigner();
        PApplet.runSketch(processingArgs, app);
    }

    @Override   
    public void settings(){
        // runs once before the processing sketch has been set up

        size(1920, 1080); // set initial window size
        noSmooth(); // turns off interpolation, must be run after size
    }

    @Override
    public void setup(){
        // runs once after the processing sketch has been set up
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
        //stub
    }
}
