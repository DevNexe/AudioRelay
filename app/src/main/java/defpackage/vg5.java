package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class vg5 extends sy2 {
    public final kz2 B = ps0.R(new cm4(cm4.b));
    public final kz2 C = ps0.R(Boolean.FALSE);
    public final jg5 D;
    public k40 E;
    public final kz2 F;
    public float G;
    public av H;

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ a91<Float, Float, g30, Integer, sd5> A;
        public final /* synthetic */ int B;
        public final /* synthetic */ String x;
        public final /* synthetic */ float y;
        public final /* synthetic */ float z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(String str, float f, float f2, a91<? super Float, ? super Float, ? super g30, ? super Integer, sd5> a91Var, int i) {
            super(2);
            this.x = str;
            this.y = f;
            this.z = f2;
            this.A = a91Var;
            this.B = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            vg5.this.i(this.x, this.y, this.z, this.A, g30Var, this.B | 1);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<sd5> {
        public F1() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            vg5.this.F.setValue(Boolean.TRUE);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ k40 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(k40 k40Var) {
            super(1);
            this.w = k40Var;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            return new ug5(this.w);
        }
    }

    public vg5() {
        jg5 jg5Var = new jg5();
        jg5Var.e = new F1();
        this.D = jg5Var;
        this.F = ps0.R(Boolean.TRUE);
        this.G = 1.0f;
    }

    @Override // defpackage.sy2
    public final boolean b(float f) {
        this.G = f;
        return true;
    }

    @Override // defpackage.sy2
    public final boolean e(av avVar) {
        this.H = avVar;
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sy2
    public final long g() {
        return ((cm4) this.B.getValue()).a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.sy2
    public final void h(ro0 ro0Var) {
        av avVar = this.H;
        jg5 jg5Var = this.D;
        if (avVar == null) {
            avVar = (av) jg5Var.f.getValue();
        }
        if (((Boolean) this.C.getValue()).booleanValue() && ro0Var.getLayoutDirection() == jy1.Rtl) {
            long jT0 = ro0Var.t0();
            en.CQf cQfE0 = ro0Var.e0();
            long jD = cQfE0.d();
            cQfE0.b().e();
            cQfE0.a.e(jT0);
            jg5Var.e(ro0Var, this.G, avVar);
            cQfE0.b().r();
            cQfE0.a(jD);
        } else {
            jg5Var.e(ro0Var, this.G, avVar);
        }
        kz2 kz2Var = this.F;
        if (((Boolean) kz2Var.getValue()).booleanValue()) {
            kz2Var.setValue(Boolean.FALSE);
        }
    }

    public final void i(String str, float f, float f2, a91<? super Float, ? super Float, ? super g30, ? super Integer, sd5> a91Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1264894527);
        jg5 jg5Var = this.D;
        xa1 xa1Var = jg5Var.b;
        xa1Var.i = str;
        xa1Var.c();
        if (!(jg5Var.g == f)) {
            jg5Var.g = f;
            jg5Var.c = true;
            jg5Var.e.invoke();
        }
        if (!(jg5Var.h == f2)) {
            jg5Var.h = f2;
            jg5Var.c = true;
            jg5Var.e.invoke();
        }
        l40 l40VarR0 = fp1.r0(j30VarQ);
        k40 n40Var = this.E;
        if (n40Var == null || n40Var.e()) {
            ig5 ig5Var = new ig5(jg5Var.b);
            Object obj = o40.a;
            n40Var = new n40(l40VarR0, ig5Var);
        }
        this.E = n40Var;
        n40Var.p(X.n(-1916507005, new wg5(a91Var, this), true));
        wq0.a(n40Var, new QnHx(n40Var), j30VarQ);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(str, f, f2, a91Var, i);
    }
}
