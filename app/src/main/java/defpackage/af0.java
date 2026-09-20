package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class af0 implements c73 {
    public static final byte[] j = new byte[1500];
    public final i60 a;
    public final qx2 b;
    public final px2 c;
    public final gq4 d;
    public final xx2 e;
    public final h75 f;
    public final pq2 g;
    public final c2 h;
    public final c2 i;

    public af0(i60 i60Var, qx2 qx2Var, px2 px2Var, gq4 gq4Var, xx2 xx2Var, h75 h75Var, pq2 pq2Var) {
        this.a = i60Var;
        this.b = qx2Var;
        this.c = px2Var;
        this.d = gq4Var;
        this.e = xx2Var;
        this.f = h75Var;
        this.g = pq2Var;
        gq0.QnHx qnHx = gq0.x;
        this.h = new c2(ps0.o0(30, kq0.SECONDS));
        this.i = new c2(ps0.o0(10, kq0.MINUTES));
    }

    @Override // defpackage.c73
    public final qw b(e61 e61Var) {
        return new xs2(new jr2(this.a.b().u(j54.b), new J(this, 8), m91.d, m91.c), new D(this, 15));
    }
}
