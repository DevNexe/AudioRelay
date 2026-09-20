package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class na5 {
    public final gx1 a;
    public final List<String> b;

    public na5(gx1 gx1Var, List<String> list) {
        this.a = gx1Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na5)) {
            return false;
        }
        na5 na5Var = (na5) obj;
        return ur1.a(this.a, na5Var.a) && ur1.a(this.b, na5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TranslatorGroup(language=" + this.a + ", translators=" + this.b + ")";
    }
}
