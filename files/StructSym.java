import java.io.*;
import java.util.*;

public class StructSym extends SemSym
{
    public SymTable members;
    private String structName; // If struct var is created, will keep track of structs name
    
    public StructSym(String type, String sName) {
        super(type);
        structName = sName;
    }
    
    public String getStructName() {
        return structName;
    }

    public void setStructName(String s) {
        structName = s;
    }
}
