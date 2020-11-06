public class IllegalTriangleException extends Exception{
    private String msg;

    public IllegalTriangleException(String msg) {
        this.msg = msg;
    }

    IllegalTriangleException() {
    }
    
    @Override
    public String getMessage(){
        return msg;
    }
}
