public class RightTriangle {
    int a, b, c;

    public RightTriangle(int a, int b, int c) 
            throws IllegalTriangleException, IllegalRightTriangleException{
        if(a + b <= c || a + c <= b || b + c <= a) throw new IllegalTriangleException();
        if(Math.pow(a, 2) + Math.pow(b, 2) != Math.pow(c, 2) && Math.pow(a, 2) + Math.pow(c, 2) != Math.pow(b, 2) 
                && Math.pow(b, 2) + Math.pow(c, 2) != Math.pow(a, 2)) throw new IllegalRightTriangleException();
        this.a = a;
        this.b = b;
        this.c = c; 
    }
}
