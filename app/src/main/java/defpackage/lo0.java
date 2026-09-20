package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lo0 extends fz1<lo0, mo0> implements xw2 {
    public static final QnHx E = QnHx.w;
    public ho0 A;
    public final CQf B;
    public boolean C;
    public final F1 D;

    public static final class CQf implements bi {
        public final ij0 a;
        public final /* synthetic */ kz1 c;

        public CQf(kz1 kz1Var) {
            this.c = kz1Var;
            this.a = lo0.this.w.A.L;
        }

        @Override // defpackage.bi
        public final long d() {
            return C0239D.J(this.c.y);
        }

        @Override // defpackage.bi
        public final ij0 getDensity() {
            return this.a;
        }

        @Override // defpackage.bi
        public final jy1 getLayoutDirection() {
            return lo0.this.w.A.N;
        }
    }

    public static final class F1 extends cx1 implements h81<sd5> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            lo0 lo0Var = lo0.this;
            ho0 ho0Var = lo0Var.A;
            if (ho0Var != null) {
                ho0Var.g0(lo0Var.B);
            }
            lo0Var.C = false;
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<lo0, sd5> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(lo0 lo0Var) {
            lo0 lo0Var2 = lo0Var;
            if (lo0Var2.isValid()) {
                lo0Var2.C = true;
                lo0Var2.w.S0();
            }
            return sd5.a;
        }
    }

    public lo0(kz1 kz1Var, mo0 mo0Var) {
        super(kz1Var, mo0Var);
        mo0 mo0Var2 = mo0Var;
        this.A = mo0Var2 instanceof ho0 ? (ho0) mo0Var2 : null;
        this.B = new CQf(kz1Var);
        this.C = true;
        this.D = new F1();
    }

    @Override // defpackage.fz1
    public final void a() {
        mo0 mo0Var = (mo0) this.x;
        this.A = mo0Var instanceof ho0 ? (ho0) mo0Var : null;
        this.C = true;
        this.z = true;
    }

    public final void c(dn dnVar) {
        kz1 kz1Var = this.w;
        long J = C0239D.J(kz1Var.y);
        ho0 ho0Var = this.A;
        yy1 yy1Var = kz1Var.A;
        if (ho0Var != null && this.C) {
            Cz.B(yy1Var).getSnapshotObserver().a(this, E, this.D);
        }
        yy1Var.getClass();
        ez1 sharedDrawScope = Cz.B(yy1Var).getSharedDrawScope();
        lo0 lo0Var = sharedDrawScope.x;
        sharedDrawScope.x = this;
        vb2 vb2VarK0 = kz1Var.K0();
        jy1 layoutDirection = kz1Var.K0().getLayoutDirection();
        en enVar = sharedDrawScope.w;
        en.QnHx qnHx = enVar.w;
        ij0 ij0Var = qnHx.a;
        jy1 jy1Var = qnHx.b;
        dn dnVar2 = qnHx.c;
        long j = qnHx.d;
        qnHx.a = vb2VarK0;
        qnHx.b = layoutDirection;
        qnHx.c = dnVar;
        qnHx.d = J;
        dnVar.e();
        ((mo0) this.x).o0(sharedDrawScope);
        dnVar.r();
        en.QnHx qnHx2 = enVar.w;
        qnHx2.a = ij0Var;
        qnHx2.b = jy1Var;
        qnHx2.c = dnVar2;
        qnHx2.d = j;
        sharedDrawScope.x = lo0Var;
    }

    @Override // defpackage.xw2
    public final boolean isValid() {
        return this.w.q();
    }
}
