package samsung;

public class Main {

    public static void main(String[] args){

        Figure f = new Figure(3);
        try {
            f.setCoord(0, 0, 0);
            f.setCoord(1, 10, 10);
            f.setCoord(2, 4, 7);
            f.setCoord(3, 30,30);
        } catch (PointIndexException e){
            System.out.println(e.getMessage() + ": " + e.getIndex());
        }

    }
}
