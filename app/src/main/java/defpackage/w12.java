package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w12 {
    public final o02 a;
    public final c02 b;
    public final xb2 c;
    public final long d;

    public w12(long j, boolean z, o02 o02Var, c02 c02Var, w02 w02Var) {
        this.a = o02Var;
        this.b = c02Var;
        this.c = w02Var;
        this.d = FWT.n(z ? g70.h(j) : Integer.MAX_VALUE, z ? Integer.MAX_VALUE : g70.g(j), 5);
    }

    public final v12 a(int i) {
        return this.c.a(i, this.a.a(i), this.b.P(i, this.d));
    }
}
