package defpackage;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class rn {
    public final String a;
    public final int b;

    public rn(String str) {
        this.a = str;
        this.b = str.toLowerCase(Locale.ROOT).hashCode();
    }

    public final boolean equals(Object obj) {
        String str;
        rn rnVar = obj instanceof rn ? (rn) obj : null;
        return (rnVar == null || (str = rnVar.a) == null || !iv4.r(str, this.a)) ? false : true;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a;
    }
}
