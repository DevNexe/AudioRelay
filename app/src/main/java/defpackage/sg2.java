package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class sg2 implements h81<sd5>, xw2, vg2 {
    public static final CQf A = CQf.w;
    public static final QnHx B = new QnHx();
    public ug2 w;
    public final rg2 x;
    public final ui2<qg2<?>> y = new ui2<>(new qg2[16]);
    public boolean z;

    public static final class CQf extends cx1 implements j81<sg2, sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(sg2 sg2Var) {
            sg2Var.b();
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<sd5> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            sg2 sg2Var = sg2.this;
            sg2Var.x.c(sg2Var);
            return sd5.a;
        }
    }

    public static final class QnHx implements vg2 {
        @Override // defpackage.vg2
        public final Object a(mg3 mg3Var) {
            return mg3Var.a.invoke();
        }
    }

    public sg2(ug2 ug2Var, rg2 rg2Var) {
        this.w = ug2Var;
        this.x = rg2Var;
    }

    @Override // defpackage.vg2
    public final Object a(mg3 mg3Var) {
        this.y.b(mg3Var);
        tg2 tg2VarB = this.w.b(mg3Var);
        return tg2VarB == null ? mg3Var.a.invoke() : tg2VarB.getValue();
    }

    public final void b() {
        if (this.z) {
            this.y.e();
            Cz.B(this.w.w).getSnapshotObserver().a(this, A, new F1());
        }
    }

    @Override // defpackage.h81
    public final sd5 invoke() {
        b();
        return sd5.a;
    }

    @Override // defpackage.xw2
    public final boolean isValid() {
        return this.z;
    }
}
