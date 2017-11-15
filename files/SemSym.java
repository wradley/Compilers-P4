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
    public StructSym(String type) {
        super(type);
    }
    
    public SymTable members;
}