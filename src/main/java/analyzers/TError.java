package analyzers;

public class TError {
    String lexeme, type, description;
    int line, column;

    public TError(String lexeme, int line, int column, String type, String description) {
        this.lexeme = lexeme;
        this.type = type;
        this.description = description;
        this.line = line;
        this.column = column;
    }
    
    
}
