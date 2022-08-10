package daos;

import app.DayLengthBST;
import datastructures.BinarySearchTree;
import helpers.Sorts;
import helpers.TextColours;
import model.ADTTime;
import model.DisplayOrder;
import model.CountrySunriseSunsetDetails;
import view.aView;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class bstDAOImpl<E> extends DAO<E>{

    private BinarySearchTree<CountrySunriseSunsetDetails> theBST;
    private aView theView;
    public static final char DELIMITER = ',';
    public static final char EOLN='\n';
    public static final String QUOTE="\"";
    public static final String USERDIRECTORY = System.getProperty("user.dir");

    private String stripQuotes(String str) {
        return str.substring(1, str.length()-1);
    }

    public bstDAOImpl() {
        this.theBST = new BinarySearchTree<>();
        this.theView = new aView();
    }

    public BinarySearchTree<CountrySunriseSunsetDetails> getTheBST() {
        return theBST;
    }

    public void setTheBST(BinarySearchTree<CountrySunriseSunsetDetails> theBST) {
        this.theBST = theBST;
    }

    @Override
    public void loadFromFile(String filename) {
        String transactionFile = USERDIRECTORY +"\\" + filename;
        BinarySearchTree<CountrySunriseSunsetDetails> dataSet = new BinarySearchTree<>();
        Sorts<CountrySunriseSunsetDetails> sort = new Sorts<>();

        try (BufferedReader br = new BufferedReader(new FileReader(transactionFile))) {
             String theCountry;
             String theCapital;
             int theSunrise;
             int theSunset;
             int theDayLength;

            String[] temp;
            String line = br.readLine();
            while(line!=null){

                    temp=line.split(Character.toString(DELIMITER));
                    theCountry = temp[0];
                    theCapital = temp[1];
                    theSunrise = Integer.parseInt(temp[2]);
                    theSunset = Integer.parseInt(temp[3]);
                    theDayLength = Integer.parseInt(temp[4]);

                    CountrySunriseSunsetDetails anEntry = new CountrySunriseSunsetDetails();
                    anEntry.setCountry(theCountry);
                    anEntry.setCapital(theCapital);
                    anEntry.setSunrise(String.valueOf(theSunrise));
                    anEntry.setSunset(String.valueOf(theSunset));
                    anEntry.setDayLength(theDayLength);

                    //this.theBST.addNode(anEntry);
                    dataSet.add(anEntry);
                    line = br.readLine();

            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(DayLengthBST.class.getDayLength()).log(Level.INFO, null, ex);
        }
        sort.BSort(dataSet);
        this.theBST.createBalancedTree(dataSet,0, dataSet.size() - 1);


    }

    @Override
    public void writeToFile(String filename) {
        try {
            File myFile = new File(USERDIRECTORY + "\\" + filename);

            if (myFile.exists()) {
                myFile.delete();
                System.out.println("File deleted: " + myFile.getName());
            } else if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        try {
            File myFile = new File(USERDIRECTORY +"\\" + filename);
            FileWriter myWriter = new FileWriter(myFile.getName());
            listNode<theData> tmp = this.theBST.front();
            while (tmp != null) {
                if(tmp.getNextNode() == null){
                    myWriter.write(tmp.getNodeData().CSVFormat());
                }
                else {
                    myWriter.write(tmp.getNodeData().CSVFormat() + "\n");
                }
                tmp = tmp.getNextNode();
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @Override
    public void add(E theData) {
        this.theBST.addNode((CountrySunriseSunsetDetails) theData);
    }

    @Override
    public void update(E theData) {

    }

    @Override
    public void findData(ADTTime theData) {
        CountrySunriseSunsetDetails dataToFind = new CountrySunriseSunsetDetails("","",0,0,Integer.parseInt(theData));
        CountrySunriseSunsetDetails found = theBST.findItem(dataToFind);
        if(found != null){
            this.theView.displayABSTItem(found);
        }
        else{
            System.out.format("The entry %s was %s found!\n", theData, TextColours.TEXT_RED + "not" + TextColours.TEXT_RESET);
        }
    }

    @Override
    public E getData(String theData) {
        return null;
    }

    @Override
    public void removeData(ADTTime theData) {
        listNode<> theData= this.theBST.remove(pos);
        words newWords  = new words();

    }

    public void displayBST(DisplayOrder order){
        this.theView.displayBST(this.theBST, order);
    }

    public void displayBSTChart(DisplayOrder order){
        this.theView.displayBST(this.theBST, order);
    }

}
