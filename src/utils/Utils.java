package utils;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class Utils {
    static NumberFormat numberFormat = new DecimalFormat("R$ #,##0.00",
            new DecimalFormatSymbols(new Locale("pt", "BR")));

    public static String doubleToString(String value) {
        return numberFormat.format(value);
    }
}

// Aqui criamos uma formatação dos valores para as entradas dos produtos e
// mudamos os padrões para Pt-Br//
