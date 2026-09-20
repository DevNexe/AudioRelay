package defpackage;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class jg5 extends cg5 {
    public final xa1 b;
    public boolean c;
    public final go0 d;
    public h81<sd5> e;
    public final kz2 f;
    public float g;
    public float h;
    public long i;
    public final QnHx j;

    public static final class CQf extends cx1 implements h81<sd5> {
        public static final CQf w = new CQf();

        public CQf() {
            super(0);
        }

        @Override // defpackage.h81
        public final /* bridge */ /* synthetic */ sd5 invoke() {
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<sd5> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            jg5 jg5Var = jg5.this;
            jg5Var.c = true;
            jg5Var.e.invoke();
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<ro0, sd5> {
        public QnHx() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(ro0 ro0Var) {
            jg5.this.b.a(ro0Var);
            return sd5.a;
        }
    }

    public jg5() {
        xa1 xa1Var = new xa1();
        xa1Var.k = 0.0f;
        xa1Var.q = true;
        xa1Var.c();
        xa1Var.l = 0.0f;
        xa1Var.q = true;
        xa1Var.c();
        xa1Var.d(new F1());
        this.b = xa1Var;
        this.c = true;
        this.d = new go0();
        this.e = CQf.w;
        this.f = ps0.R(null);
        this.i = cm4.c;
        this.j = new QnHx();
    }

    @Override // defpackage.cg5
    public final void a(ro0 ro0Var) {
        e(ro0Var, 1.0f, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(ro0 ro0Var, float f, av avVar) {
        boolean z;
        go0 go0Var;
        av avVar2 = avVar != null ? avVar : (av) this.f.getValue();
        boolean z2 = this.c;
        go0 go0Var2 = this.d;
        if (z2 || !cm4.b(this.i, ro0Var.d())) {
            float fE = cm4.e(ro0Var.d()) / this.g;
            xa1 xa1Var = this.b;
            xa1Var.m = fE;
            xa1Var.q = true;
            xa1Var.c();
            xa1Var.n = cm4.c(ro0Var.d()) / this.h;
            xa1Var.q = true;
            xa1Var.c();
            long jE = C0239D.e((int) Math.ceil(cm4.e(ro0Var.d())), (int) Math.ceil(cm4.c(ro0Var.d())));
            jy1 layoutDirection = ro0Var.getLayoutDirection();
            go0Var2.c = ro0Var;
            ge geVarC = go0Var2.a;
            ZCR zcr = go0Var2.b;
            if (geVarC == null || zcr == null || ((int) (jE >> 32)) > geVarC.getWidth() || sp1.b(jE) > geVarC.getHeight()) {
                geVarC = ps0.c((int) (jE >> 32), sp1.b(jE), 0, 28);
                Canvas canvas = F6mt.a;
                zcr = new ZCR();
                zcr.a = new Canvas(fp1.C(geVarC));
                go0Var2.a = geVarC;
                go0Var2.b = zcr;
            }
            go0Var2.d = jE;
            long J = C0239D.J(jE);
            en enVar = go0Var2.e;
            en.QnHx qnHx = enVar.w;
            ij0 ij0Var = qnHx.a;
            jy1 jy1Var = qnHx.b;
            dn dnVar = qnHx.c;
            long j = qnHx.d;
            qnHx.a = ro0Var;
            qnHx.b = layoutDirection;
            qnHx.c = zcr;
            qnHx.d = J;
            zcr.e();
            qo0.i(enVar, yu.b, 0L, 0L, 0.0f, null, 62);
            this.j.invoke(enVar);
            zcr.r();
            en.QnHx qnHx2 = enVar.w;
            qnHx2.a = ij0Var;
            qnHx2.b = jy1Var;
            qnHx2.c = dnVar;
            qnHx2.d = j;
            geVarC.a.prepareToDraw();
            z = false;
            this.c = false;
            this.i = ro0Var.d();
            go0Var = go0Var2;
        } else {
            go0Var = go0Var2;
            z = false;
        }
        ge geVar = go0Var.a;
        if (geVar != null) {
            z = true;
        }
        if (!z) {
            throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
        }
        qo0.c(ro0Var, geVar, 0L, go0Var.d, 0L, f, avVar2, 0, 858);
    }

    public final String toString() {
        return "Params: \tname: " + this.b.i + "\n\tviewportWidth: " + this.g + "\n\tviewportHeight: " + this.h + "\n";
    }
}
