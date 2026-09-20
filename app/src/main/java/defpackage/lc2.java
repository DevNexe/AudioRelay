package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class lc2 {
    public final String a;
    public final int b;
    public final int c;

    public lc2(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc2)) {
            return false;
        }
        lc2 lc2Var = (lc2) obj;
        int i = this.c;
        String str = this.a;
        int i2 = this.b;
        if (i2 < 0 || lc2Var.b < 0) {
            return TextUtils.equals(str, lc2Var.a) && i == lc2Var.c;
        }
        return TextUtils.equals(str, lc2Var.a) && i2 == lc2Var.b && i == lc2Var.c;
    }

    public final int hashCode() {
        return uq2.b(this.a, Integer.valueOf(this.c));
    }
}
