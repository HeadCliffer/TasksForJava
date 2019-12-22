import java.util.ArrayList;
public class Level1 {

    public static String textAll = "";
    public static ArrayList<String> steps = new ArrayList<>();
    public static int countUndo = 0;
    public static boolean isUndo = false;

    public static void main(String[] args){

        /*System.out.println(BastShoe("1 Привет"));
        System.out.println(BastShoe("1 , Мир!"));
        System.out.println(BastShoe("1 ++"));
        System.out.println(BastShoe("2 2"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("1 *"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("4"));*/

        /*System.out.println(BastShoe("1 Привет"));
        System.out.println(BastShoe("1 , Мир!"));
        System.out.println(BastShoe("1 ++"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("5"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("5"));
        System.out.println(BastShoe("5"));
        System.out.println(BastShoe("5"));
        System.out.println(BastShoe("5"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("2 2"));
        System.out.println(BastShoe("4"));
        System.out.println(BastShoe("5"));
        System.out.println(BastShoe("5"));
        System.out.println(BastShoe("5"));*/

        System.out.println("****************************************");
        for(String s : steps) System.out.println(s);

        //System.out.println(BastShoe(""));

    }

    public static String BastShoe(String command){
        String text;
        String number = String.valueOf(command.charAt(0));
        String lastStep = "";

        if(command.length() < 2)  text = command;
        else text = command.substring(2);

        //add
        if( number.equals("1") ){
            if(isUndo){
                lastStep = textAll;
                steps.removeAll(steps);
                steps.add(lastStep);
                countUndo = 0;
                isUndo = false;
            }
                textAll += text;
                steps.add(textAll);
                return textAll;
        }
        //delete
        if( number.equals("2") ){
            if(isUndo){
                lastStep = textAll;
                steps.removeAll(steps);
                steps.add(lastStep);
                countUndo = 0;
                isUndo = false;
            }
            if( Integer.parseInt(text) >= textAll.length() ){
                steps.add(textAll);
                textAll = "";
                return textAll;
            }
            textAll = steps.get( steps.size() - 1 - countUndo ).substring( 0 , textAll.length() -  Integer.parseInt(text));
            steps.add(textAll);
            return textAll;
        }
        //get
        if( number.equals("3")){
            if( textAll.length() < Integer.parseInt(text) ) return "Error! Number bigger than length.";
            return String.valueOf( textAll.charAt(Integer.parseInt(text)) );
        }
        //Undo
        if( number.equals("4") ){
            isUndo = true;
            //System.out.println(countUndo + " countUndo");
            if(countUndo == steps.size() - 1){
                return steps.get(0);
            }
            countUndo++;
            textAll = steps.get( steps.size() - 1 - countUndo );
            return textAll;
        }
        //Redo
        if( number.equals("5") ){
            if(isUndo){
                if(countUndo == 0){
                    return steps.get( steps.size() - 1 );
                }
                countUndo--;
                textAll = steps.get( steps.size() - 1 - countUndo );
                return textAll ;
            }
        }
        return command;
    }
}

