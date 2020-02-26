package five.com.project.spring.exception;

public class NotFoundException extends RuntimeException {

    public NotFoundException(int id, String className) {
        super(className + " with id:" + id + "not found : ");
    }

}
