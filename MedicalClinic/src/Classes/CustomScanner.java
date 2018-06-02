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
        try {
            System.out.println(question);
            return input.nextLine();
        } catch(Exception e) {
            return null;
        }
    }

    public byte readByte(String question) {
        try {
            return Byte.parseByte(readString(question));
        } catch(Exception e) {
            return 0;
        }
    }

    public short readShort(String question) {
        try {
            return Short.parseShort(readString(question));
        } catch(Exception e) {
            return 0;
        }
    }

    public int readInt(String question) {
        try {
            return Integer.parseInt(readString(question));
        } catch(Exception e) {
            return 0;
        }
    }

    public long readLong(String question) {
        try {
            return Long.parseLong(readString(question));
        } catch(Exception e) {
            return 0;
        }    
    }

    public float readFloat(String question) {
        try {
            return Float.parseFloat(readString(question));
        } catch(Exception e) {
            return 0;
        }
    }

    public double readDouble(String question) {
        try {
            return Double.parseDouble(readString(question));
        } catch(Exception e) {
            return 0;
        }
    }

    public Date readDate(String question) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            return format.parse(readString(question));
        } catch(ParseException e) {
            return null;
        }
    }

    public Time readTime(String question) {
        try {
            return Time.valueOf(readString(question));
        } catch(Exception e) {
            return null;
        }
    }
    
    public boolean readBoolean(String question) {
        try {
            String value = readString(question).toUpperCase();
            String[] values = {"1", "SIM", "S", "YES", "Y"};
            
            for(String s: values) 
                if(s.equalsIgnoreCase(value))
                    return true;
            
            return false;
        } catch(Exception e) {
            return false;
        }
    }
    
}
