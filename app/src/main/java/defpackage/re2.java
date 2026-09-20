package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class re2 {
    public final kj1<qe2> a;

    public re2(kj1<qe2> kj1Var) {
        this.a = kj1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof re2) && ur1.a(this.a, ((re2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MicModeSettings(modes=" + this.a + ")";
    }
}
