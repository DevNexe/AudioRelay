package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class T9r {
    public final A$Y4 a;
    public final nj1<q1> b;
    public final nj1<jv2> c;
    public final boolean d;

    public T9r() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof T9r)) {
            return false;
        }
        T9r t9r = (T9r) obj;
        return this.a == t9r.a && ur1.a(this.b, t9r.b) && ur1.a(this.c, t9r.c);
    }

    public final int hashCode() {
        A$Y4 a$y4 = this.a;
        int iHashCode = (a$y4 == null ? 0 : a$y4.hashCode()) * 31;
        nj1<q1> nj1Var = this.b;
        int iHashCode2 = (iHashCode + (nj1Var == null ? 0 : nj1Var.hashCode())) * 31;
        nj1<jv2> nj1Var2 = this.c;
        return iHashCode2 + (nj1Var2 != null ? nj1Var2.hashCode() : 0);
    }

    public final String toString() {
        return "State(audioOutputType=" + this.a + ", audioTrackOptions=" + this.b + ", openSLOptions=" + this.c + ")";
    }

    public T9r(A$Y4 a$y4, nj1<q1> nj1Var, nj1<jv2> nj1Var2) {
        this.a = a$y4;
        this.b = nj1Var;
        this.c = nj1Var2;
        this.d = (a$y4 == null || nj1Var == null || nj1Var2 == null) ? false : true;
    }
}
