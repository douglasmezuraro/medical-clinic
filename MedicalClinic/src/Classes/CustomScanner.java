package Classes;

import java.sql.Date;
import java.sql.Time;
import java.util.Scanner;

public class CustomScanner {
    
    private Scanner input;
    
    public CustomScanner() {
        input = new Scanner(System.in);
    }
    
    public String readString(String question) {
        System.out.println(question);
        return input.nextLine();
    }
    
    public byte readByte(String question) {
        return Byte.parseByte(readString(question));
    }
    
    public short readShort(String question) {
        return Short.parseShort(readString(question));
    }   
    
    public int readInt(String question) {
        return Integer.parseInt(readString(question));
    }
    
    public long readLong(String question) {
        return Long.parseLong(readString(question));
    }
    
    public float readFloat(String question) {
        return Float.parseFloat(readString(question));
    }
    
    public double readDouble(String question) {
        return Double.parseDouble(readString(question));
    }
    
    public Date readDate(String question) {
        return Date.valueOf(readString(question));
    }
    
    public Time readTime(String question) {
        return Time.valueOf(readString(question));
    }
    
}
