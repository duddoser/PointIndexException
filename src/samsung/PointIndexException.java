package samsung;

public class PointIndexException extends Exception{
    private final int index;

    public PointIndexException(int n){
        super("Incorrect dot's number");
        this.index = n;
    }

    public int getIndex(){
        return this.index;
    }

}
