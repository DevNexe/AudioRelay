package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class pd4 {
    public final long a;
    public final jf4 b;

    public pd4(long j, jf4 jf4Var) {
        this.a = j;
        this.b = jf4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ur1.a(pd4.class, obj != null ? obj.getClass() : null) && ur1.a(this.b, ((pd4) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
