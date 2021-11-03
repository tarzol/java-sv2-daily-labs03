package day04;

public class Sultan {

    public static void main(String[] args) {
        int number = 20;
        Prison prison = new Prison();
        boolean[] openClosed = new boolean[100];
        prison.openFreeCells(openClosed);
        for ( int i=0; i<openClosed.length; i++) {
            if ( openClosed[i] == true) {
                System.out.println(i);
            }
        }
        System.out.println();
    }
}
