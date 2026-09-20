package defpackage;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class gw5 implements ez5 {
    public final Double w;

    public gw5(Double d) {
        if (d == null) {
            this.w = Double.valueOf(Double.NaN);
        } else {
            this.w = d;
        }
    }

    @Override // defpackage.ez5
    public final ez5 c(String str, ma5 ma5Var, ArrayList arrayList) {
        if ("toString".equals(str)) {
            return new f06(zzi());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", zzi(), str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gw5) {
            return this.w.equals(((gw5) obj).w);
        }
        return false;
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return zzi();
    }

    @Override // defpackage.ez5
    public final ez5 zzd() {
        return new gw5(this.w);
    }

    @Override // defpackage.ez5
    public final Boolean zzg() {
        Double d = this.w;
        boolean z = false;
        if (!Double.isNaN(d.doubleValue()) && d.doubleValue() != 0.0d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ez5
    public final Double zzh() {
        return this.w;
    }

    @Override // defpackage.ez5
    public final String zzi() {
        Double d = this.w;
        if (Double.isNaN(d.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d.doubleValue())) {
            return d.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalStripTrailingZeros = BigDecimal.valueOf(d.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalStripTrailingZeros.scale() > 0 ? bigDecimalStripTrailingZeros.precision() : bigDecimalStripTrailingZeros.scale()) - 1);
        String str = decimalFormat.format(bigDecimalStripTrailingZeros);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i >= 0 || i <= -7) && (i < 0 || i >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalStripTrailingZeros.toPlainString();
    }

    @Override // defpackage.ez5
    public final Iterator zzl() {
        return null;
    }
}
