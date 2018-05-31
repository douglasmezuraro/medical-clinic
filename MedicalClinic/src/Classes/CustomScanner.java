package Classes;

import java.util.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/mm/yyyy");
            return format.parse(readString(question));
        } catch(ParseException e) {
            return null;
        }
    }
    
    public Time readTime(String question) {
        return Time.valueOf(readString(question));
    }
    
}
