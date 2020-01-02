import java.util.ArrayList;

public class Level1 {

    /*public static void main(String[] args) {
        System.out.println(BastShoe("1 asd"));
        System.out.println(BastShoe("3 1234"));
        System.out.println(BastShoe("5 -6"));
        System.out.println(BastShoe(""));

        System.out.println("*****************************");

        for(String s : steps){
            System.out.println(s);
        }
    }*/

    public static String textAll = "";
    public static ArrayList<String> steps = new ArrayList<>();
    public static int countUndo = 0;
    public static boolean isUndo = false;

    public static String BastShoe(String command){
            if (command.length() == 0) {
                if (steps.size() == 0) return textAll;
                else return steps.get(steps.size() - 1 - countUndo);
            }

            String text = "";
            String lastStep;
            String number = "";

            if (command.length() > 2) {
                number = command.substring(0, 2);
                text = command.substring(2);
            }

            //add
            if (number.equals("1 ")) {
                if (isUndo) {
                    lastStep = textAll;
                    steps.removeAll(steps);
                    steps.add(lastStep);
                    countUndo = 0;
                    isUndo = false;
                }
                if (textAll.equals("") && countUndo == 0) steps.add(textAll);
                textAll += text;
                steps.add(textAll);
                return textAll;
            }

            //delete
            if (number.equals("2 ")) {
                if (isUndo) {
                    lastStep = textAll;
                    steps.removeAll(steps);
                    steps.add(lastStep);
                    countUndo = 0;
                    isUndo = false;
                }
                if (Integer.parseInt(text) >= textAll.length()) {
                    if (textAll.length() != 0) steps.add(textAll);
                    textAll = "";
                    return textAll;
                }
                if(Integer.parseInt(text) < 0) return textAll;
                textAll = steps.get(steps.size() - 1 - countUndo).substring(0, textAll.length() - Integer.parseInt(text));
                steps.add(textAll);
                return textAll;
            }

            //get
            if (number.equals("3 ")) {
                if (textAll.length() < Integer.parseInt(text)
                || Integer.parseInt(text) < 0 ) {
                    return "";
                }
                return String.valueOf( textAll.charAt(Integer.parseInt(text)) );
            }

            //Undo
            if (command.equals("4")) {
                if(steps.size() == 0){
                    return textAll;
                }
                isUndo = true;
                if (countUndo == steps.size() - 1) {
                    return steps.get(0);
                }
                countUndo++;
                textAll = steps.get(steps.size() - 1 - countUndo);
                return textAll;
            }

            //Redo
            if (command.equals("5")) {
                if(steps.size() == 0){
                    return textAll;
                }

                if (isUndo) {
                    if (countUndo == 0) {
                        return steps.get(steps.size() - 1);
                    }
                    countUndo--;
                    textAll = steps.get(steps.size() - 1 - countUndo);
                    return textAll;
                }
            }
        if (steps.size() == 0) return textAll;
        else return steps.get(steps.size() - 1 - countUndo);
    }
}

