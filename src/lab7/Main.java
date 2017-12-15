package lab7;

public class Main
{
    public static void main(String[] args) {

        //OutOfMemory
        long[][] error = new long[Integer.MAX_VALUE][Integer.MAX_VALUE];

        //Assert
        int x = -51;
        assert (x >= 0) : "error?";

        assert false;
    }
}
