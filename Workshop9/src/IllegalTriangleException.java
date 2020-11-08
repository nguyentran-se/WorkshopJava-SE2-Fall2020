public class IllegalTriangleException extends Exception{
    private String msg;

    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String msg) {
        this.msg = msg;
    }

    @Override
    public String getMessage(){
        return msg;
    }
}
