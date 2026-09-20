package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wd2 implements c73 {
    public final i60 a;
    public final ud2 b;
    public final h75 c;
    public final pq2 d;

    public static final class QnHx extends cx1 implements j81<c54, qw> {
        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final qw invoke(c54 c54Var) {
            c54 c54Var2 = c54Var;
            wd2 wd2Var = wd2.this;
            return new xs2(wd2Var.a.b().u(c54Var2), new HqGb(2, wd2Var, c54Var2));
        }
    }

    public wd2(i60 i60Var, ud2 ud2Var, h75 h75Var, pq2 pq2Var) {
        this.a = i60Var;
        this.b = ud2Var;
        this.c = h75Var;
        this.d = pq2Var;
    }

    @Override // defpackage.c73
    public final qw b(e61 e61Var) {
        h75 h75Var = this.c;
        h75Var.i();
        h75Var.d();
        return this.d.j("Player:MessageSender", -1, new QnHx());
    }
}
