import java.io.*;
import java.util.*;

public class SemSym {
    private String type;
    protected boolean isFunc;
    
    public SemSym(String type) {
        this.type = type;
        isFunc = false;
    }
    
    public boolean isFunction() {
        return isFunc;
    }
    
    public String getType() {
        return type;
    }
    
    public String toString() {
        return type;
    }
}





