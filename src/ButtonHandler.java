
public class ButtonHandler implements EventListener {
    @Override
    public void actionPerformed(int subjectID) {
        switch (subjectID){
            case Constants.NEW_BUTTON:
                System.out.println("New clicked");
                break;
            case Constants.LOAD_BUTTON:
                System.out.println("Load clicked");
                break;
            case Constants.SAVE_BUTTON:
                System.out.println("Save clicked");
        }
    }
}
