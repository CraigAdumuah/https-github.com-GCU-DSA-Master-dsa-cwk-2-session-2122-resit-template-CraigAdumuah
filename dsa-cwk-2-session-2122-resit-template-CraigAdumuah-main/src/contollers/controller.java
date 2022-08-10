package contollers;

import daos.bstDAOImpl;
import helpers.InputHelper;
import helpers.OutputHelper;
import helpers.TextColours;
import model.ADTTime;
import model.DisplayOrder;
import model.CountrySunriseSunsetDetails;


public class controller {
    // Add your variables here
    private final InputHelper inputHelper;

    public controller() {
        // Add your code here
        this.inputHelper = new InputHelper();
    }

    /**
     * Displays the menu and uses an InputHelper object
     * to accept valid user choice.
     * An appropriate private method is called to implement the choice.
     */
    public void run() {
        boolean finished = false;

        int iChoice;
        this.setup();

        do {
            theMenu();
            iChoice = inputHelper.readInt("Enter choice", 4,1);
            switch (iChoice) {
                // Add more cases

                case 1:
                    this.displaydaylengthASC(DisplayOrder.ASCENDING);
                    System.out.println();
                    break;
                case 2:
                    this.displayDayLengthDESC(DisplayOrder.DESCENDING);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("All done! Bye ...");
                    finished = true;
                    break;
                default: // invalid option
                    System.out.println("Oops! Something has went wrong!");
                    break;
            }
        }while(!finished);
    }
    private void theMenu() {
        System.out.println(TextColours.TEXT_GREEN + "Day length");
        System.out.println("-----------------------"  + TextColours.TEXT_RESET);
        System.out.println("1: day length ascending");
        System.out.println("2: day length descending");
        System.out.println("3: exit");
        System.out.println();
    }



    private void setup(){
        this.DAO.loadFromFile("GolfersOpen.txt");
    }

}
