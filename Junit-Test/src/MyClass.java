public class MyClass {
    public int quotient(int x, int y){
        if( y ==0){
            throw new IllegalArgumentException("Y cannot be zero");
        }
        return x  / y;
    }
}
