
public class ButtonHandler implements EventListener {
    private int count = 0;

    public int getClickCount() { return count; }

    @Override
    public void actionPerformed() {
        count += 1;
        System.out.println("Click number "+ count);
    }
}
