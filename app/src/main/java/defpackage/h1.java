package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class h1 implements c73 {
    public final d7G a;
    public final ve b;
    public final ID c;
    public final Rm d;
    public final qf0 e;
    public final CWg f;
    public final XRK g;
    public final xn2 h;
    public final h75 i;
    public final pq2 j;
    public final c2 k;

    public static final class QnHx extends cx1 implements j81<c54, qw> {
        public final /* synthetic */ e61 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(e61 e61Var) {
            super(1);
            this.x = e61Var;
        }

        @Override // defpackage.j81
        public final qw invoke(c54 c54Var) {
            h1 h1Var = h1.this;
            return new xs2(h1Var.a.f().u(j54.b), new b1(h1Var, this.x, c54Var, 0));
        }
    }

    public h1(d7G d7g, ve veVar, ID id, Rm rm, qf0 qf0Var, CWg cWg, XRK xrk, xn2 xn2Var, h75 h75Var, pq2 pq2Var) {
        this.a = d7g;
        this.b = veVar;
        this.c = id;
        this.d = rm;
        this.e = qf0Var;
        this.f = cWg;
        this.g = xrk;
        this.h = xn2Var;
        this.i = h75Var;
        this.j = pq2Var;
        gq0.QnHx qnHx = gq0.x;
        this.k = new c2(ps0.o0(1, kq0.MINUTES));
    }

    @Override // defpackage.c73
    public final qw b(e61 e61Var) {
        this.i.k();
        return this.j.j("Player:Audio", -16, new QnHx(e61Var));
    }
}
