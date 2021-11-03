package day04;

public class Prison {

    public void openFreeCells(boolean[] openClosed) {

        for ( int i=0; i<openClosed.length; i++) {
            for ( int j=1; j<openClosed.length; j++) {
                if ((j)%(i+1) == 0) {
                    openClosed[j] = !openClosed[j];
                }
            }
        }
    }
}
