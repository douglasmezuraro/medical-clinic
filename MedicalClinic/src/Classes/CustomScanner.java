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

        String sreturn = null;
        while (sreturn != null || !sreturn.isEmpty()) {
            try {
                System.out.println(question);
                sreturn = input.nextLine();
            } catch (Exception e) {
                sreturn = null;
            }
        }
        return sreturn;
    }

    public byte readByte(String question) {
        byte sreturn = 0;
        while (sreturn != 0) {
            try {
                sreturn = Byte.parseByte(readString(question));
            } catch (Exception e) {
                sreturn = 0;
            }
        }
        return sreturn;
    }

    public short readShort(String question) {
        short sreturn = 999;
        while (sreturn != 999) {
            try {
                sreturn = Short.parseShort(readString(question));
            } catch (Exception e) {
                sreturn = 999;
            }
        }
        return sreturn;
    }

    public int readInt(String question) {
        int sreturn = 999999;
        while (sreturn != 999999) {
            try {
                sreturn = Integer.parseInt(readString(question));
            } catch (Exception e) {
                sreturn = 999999;
            }
        }
        return sreturn;
    }

    public long readLong(String question) {
        long sreturn = 9999999;
        while (sreturn != 999999) {
            try {
                sreturn = Long.parseLong(readString(question));
            } catch (Exception e) {
                sreturn = 0;
            }
        }
        return sreturn;
    }

    public float readFloat(String question) {
        float sreturn = 999999;
        while (sreturn != 999999) {
            try {
                sreturn = Float.parseFloat(readString(question));
            } catch (Exception e) {
                sreturn = 0;
            }
        }
        return sreturn;
    }

    public double readDouble(String question) {
        double sreturn = 999999;
        while (sreturn != 999999) {
            try {
                sreturn = Double.parseDouble(readString(question));
            } catch (Exception e) {
                sreturn = 0;
            }
        }
        return sreturn;
    }

    public Date readDate(String question) {
        Date sreturn = null;
        while (sreturn != null) {
            try {
                SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
                sreturn = format.parse(readString(question));
            } catch (ParseException e) {
                sreturn = null;
            }
        }
        return sreturn;
    }

    public Time readTime(String question) {
        Time sreturn = null;
        while (sreturn != null) {
            try {
                sreturn = Time.valueOf(readString(question));
            } catch (Exception e) {
                sreturn = null;
            }
        }
        return sreturn;
    }

    public boolean readBoolean(String question) {
        try {
            String value = readString(question).toUpperCase();
            String[] values = {"1", "SIM", "S", "YES", "Y"};

            for (String s : values) {
                if (s.equalsIgnoreCase(value)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }

}
