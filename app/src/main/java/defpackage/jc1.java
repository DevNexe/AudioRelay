package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class jc1 {
    public final String a;
    public final String b;
    public final boolean c = false;

    public jc1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jc1) {
            jc1 jc1Var = (jc1) obj;
            if (iv4.r(jc1Var.a, this.a) && iv4.r(jc1Var.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        int iHashCode = this.a.toLowerCase(locale).hashCode();
        return this.b.toLowerCase(locale).hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HeaderValueParam(name=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", escapeValue=");
        return dj.c(sb, this.c, ')');
    }
}
