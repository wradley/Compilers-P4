import java.io.*;
import java.util.*;

public class FunctionSym extends SemSym
{
    public List<SemSym> formals;
    
    public FunctionSym(String type) {
        super(type);
	isFunc = true;
    }
    
}
