package view;

import datastructures.BinarySearchTree;
import datastructures.Node;
import helpers.OutputHelper;
import model.DisplayOrder;
import model.CountrySunriseSunsetDetails;

public class aView {
    public void displayBSTItemAsc(Node<CountrySunriseSunsetDetails> root){
        if (root.leftNode != null) {
            displayBSTItemAsc(root.leftNode);
        }
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %2d |\n", root.getNodeData().getCountry(), root.getNodeData().getCapital(), root.getNodeData().getSunset(), root.getNodeData().getSunrise(),  root.getNodeData().getDayLength());
        if (root.rightNode != null) {
            displayBSTItemAsc(root.rightNode);
        }
    }

    public void displayBSTItemDesc(Node<CountrySunriseSunsetDetails> root){
        if (root.rightNode != null) {
            displayBSTItemDesc(root.rightNode);
        }
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %2d |\n", root.getNodeData().getCountry(), root.getNodeData().getCapital(), root.getNodeData().getSunset(), root.getNodeData().getSunrise(),  root.getNodeData().getDayLength());
        if (root.leftNode != null) {
            displayBSTItemDesc(root.leftNode);
        }
    }

    public void displayBSTItemPreorder(Node<CountrySunriseSunsetDetails> root){
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %2d |\n", root.getNodeData().getCountry(), root.getNodeData().getCapital(), root.getNodeData().getSunset(), root.getNodeData().getSunrise(),  root.getNodeData().getDayLength());
        if (root.rightNode != null) {
            displayBSTItemDesc(root.rightNode);
        }
        if (root.leftNode != null) {
            displayBSTItemDesc(root.leftNode);
        }
    }

    public void displayBSTItemPostorder(Node<CountrySunriseSunsetDetails> root){
        if (root.rightNode != null) {
            displayBSTItemDesc(root.rightNode);
        }
        if (root.leftNode != null) {
            displayBSTItemDesc(root.leftNode);
        }
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %2d |\n", root.getNodeData().getCountry(), root.getNodeData().getCapital(), root.getNodeData().getSunset(), root.getNodeData().getSunrise(),  root.getNodeData().getDayLength());
    }


    public void displayBST(BinarySearchTree<CountrySunriseSunsetDetails> theBST, DisplayOrder order){
        System.out.println(OutputHelper.repeat("-",55));
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %-5s |\n", "Country", "Capital", "Sunrise", "Sunset", "Day Length");
        System.out.println(OutputHelper.repeat("-",55));

        switch(order){
            case ASCENDING:
                displayBSTItemAsc(theBST.getRoot());
                break;
            case DESCENDING:
                displayBSTItemDesc(theBST.getRoot());
                break;
            case PREORDER:
                displayBSTItemPreorder(theBST.getRoot());
                break;
            case POSTORDER:
                displayBSTItemPostorder(theBST.getRoot());
                break;
            default:
                System.out.println("Oops! Something has went wrong!");
                break;
        }
        System.out.println(OutputHelper.repeat("-",55));

    }

    public void displayABSTItem(CountrySunriseSunsetDetails anItem){
        System.out.println(OutputHelper.repeat("-",55));
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %-5s |\n", "Country", "Capital", "Sunrise", "Sunset", "Day Length");
        System.out.println(OutputHelper.repeat("-",55));
        System.out.format("| %-20s | %-20s | %-20s | %-20s | %2d |\n", anItem.getCountry(), anItem.getCapital(), anItem.getSunrise(), anItem.getSunset(), anItem.getDayLength());
        System.out.println(OutputHelper.repeat("-",55));
    }


    public void displayStudentScores(Node<CountrySunriseSunsetDetails> root){

    }

    public void displayAsChart(BinarySearchTree<CountrySunriseSunsetDetails> theBST){
    }
}
