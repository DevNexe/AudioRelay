package defpackage;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x41 implements Comparable<x41> {
    public static final x41 A;
    public static final x41 B;
    public static final List<x41> C;
    public static final x41 x;
    public static final x41 y;
    public static final x41 z;
    public final int w;

    static {
        x41 x41Var = new x41(100);
        x41 x41Var2 = new x41(RCHTTPStatusCodes.SUCCESS);
        x41 x41Var3 = new x41(RCHTTPStatusCodes.UNSUCCESSFUL);
        x41 x41Var4 = new x41(400);
        x41 x41Var5 = new x41(RCHTTPStatusCodes.ERROR);
        x41 x41Var6 = new x41(600);
        x = x41Var6;
        x41 x41Var7 = new x41(700);
        x41 x41Var8 = new x41(800);
        x41 x41Var9 = new x41(900);
        y = x41Var3;
        z = x41Var4;
        A = x41Var5;
        B = x41Var7;
        C = ps0.M(x41Var, x41Var2, x41Var3, x41Var4, x41Var5, x41Var6, x41Var7, x41Var8, x41Var9);
    }

    public x41(int i) {
        this.w = i;
        boolean z2 = false;
        if (1 <= i && i < 1001) {
            z2 = true;
        }
        if (!z2) {
            throw new IllegalArgumentException(GM.a("Font weight can be in range [1, 1000]. Current value: ", i).toString());
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(x41 x41Var) {
        return ur1.b(this.w, x41Var.w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x41) {
            return this.w == ((x41) obj).w;
        }
        return false;
    }

    public final int hashCode() {
        return this.w;
    }

    public final String toString() {
        return qc0.a(new StringBuilder("FontWeight(weight="), this.w, ')');
    }
}
