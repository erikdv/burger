package net.eriknet.burger.utils;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class PriceFormatter {

    public static String getPriceAsString(BigDecimal bdPrice) {
        var nfPrice = NumberFormat.getCurrencyInstance(new Locale("NL", "nl"));
        nfPrice.setMinimumFractionDigits(2);
        nfPrice.setMaximumFractionDigits(2);
        return nfPrice.format(bdPrice);
    }
}
