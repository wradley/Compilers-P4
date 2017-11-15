public class SemSym {
    private String type;
    
    public SemSym(String type) {
        this.type = type;
    }
    
    public String getType() {
        return type;
    }
    
    public String toString() {
        return type;
    }
}

public class FunctionSym extends SemSym
{
}


public class StructSym extends SemSym
{
    public SymTable members;
    private structName; // If struct var is created, will keep track of structs name
    
    public StructSym(String type, String sName) {
        super(type);
        structName = sName;
    }
    
    public String getStructName() {
        return structName;
    }
}
