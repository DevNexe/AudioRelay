package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ak1<T> implements Ah<T> {
    public final hq0<T> a;
    public final int b;
    public final long c;

    public ak1() {
        throw null;
    }

    public ak1(hq0 hq0Var, int i, long j) {
        this.a = hq0Var;
        this.b = i;
        this.c = j;
    }

    @Override // defpackage.Ah
    public final <V extends z_Mm> bh5<V> a(pb5<T, V> pb5Var) {
        return new ih5(this.a.a((pb5) pb5Var), this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ak1)) {
            return false;
        }
        ak1 ak1Var = (ak1) obj;
        if (ur1.a(ak1Var.a, this.a) && ak1Var.b == this.b) {
            return (ak1Var.c > this.c ? 1 : (ak1Var.c == this.c ? 0 : -1)) == 0;
        }
        return false;
    }

    public final int hashCode() {
        int iH = (O.h(this.b) + (this.a.hashCode() * 31)) * 31;
        long j = this.c;
        return iH + ((int) (j ^ (j >>> 32)));
    }
}
