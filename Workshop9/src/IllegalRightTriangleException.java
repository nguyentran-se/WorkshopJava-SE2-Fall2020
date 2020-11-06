public class IllegalRightTriangleException extends Exception{
    private String msg;

    public IllegalRightTriangleException(String msg) {
        this.msg = msg;
    }

    IllegalRightTriangleException() {
    }
    
    @Override
    public String getMessage(){
        return msg;
    }
}
