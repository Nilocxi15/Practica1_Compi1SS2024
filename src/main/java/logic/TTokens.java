package logic;

public class TTokens {
    private String operator, ocurrency;
    private int line, column;

    public TTokens(String operator, String ocurrency, int line, int column) {
        this.operator = operator;
        this.ocurrency = ocurrency;
        this.line = line;
        this.column = column;
    }

    public String getOperator() {
        return operator;
    }

    public String getOcurrency() {
        return ocurrency;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
    
}
