public class IllegalRightTriangleException extends Exception{
    private String msg;

    public IllegalRightTriangleException() {
    }
    
    public IllegalRightTriangleException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage(){
        return msg;
    }
}
