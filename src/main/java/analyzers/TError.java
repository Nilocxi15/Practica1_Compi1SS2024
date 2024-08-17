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

    @Override
    public String toString() {
        return "TError{" + "lexeme=" + lexeme + ", type=" + type + ", description=" + description + ", line=" + line + ", column=" + column + '}';
    }

    public String getLexeme() {
        return lexeme;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }    
    
}
