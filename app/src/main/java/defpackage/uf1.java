package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class uf1 {
    public static final uf1 b;
    public static final uf1 c;
    public static final List<uf1> d;
    public final String a;

    static {
        uf1 uf1Var = new uf1("GET");
        b = uf1Var;
        uf1 uf1Var2 = new uf1("POST");
        uf1 uf1Var3 = new uf1("PUT");
        uf1 uf1Var4 = new uf1("PATCH");
        uf1 uf1Var5 = new uf1("DELETE");
        uf1 uf1Var6 = new uf1("HEAD");
        c = uf1Var6;
        d = ps0.M(uf1Var, uf1Var2, uf1Var3, uf1Var4, uf1Var5, uf1Var6, new uf1("OPTIONS"));
    }

    public uf1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uf1) && ur1.a(this.a, ((uf1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return bl2.c(new StringBuilder("HttpMethod(value="), this.a, ')');
    }
}
