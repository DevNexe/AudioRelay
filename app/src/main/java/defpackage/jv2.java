package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class jv2 {
    public final kv2 a;

    public jv2(kv2 kv2Var) {
        this.a = kv2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jv2) && this.a == ((jv2) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenSLOptions(performanceMode=" + this.a + ")";
    }
}
