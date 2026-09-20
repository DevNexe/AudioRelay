package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c12 implements tg2<f33>, rg2, f33 {
    public static final QnHx z = new QnHx();
    public final q12 w;
    public final h02 x;
    public f33 y;

    public static final class CQf implements f33.QnHx {
        public final f33.QnHx a;
        public final h02.QnHx b;
        public final /* synthetic */ h02 d;

        public CQf(h02 h02Var) {
            this.d = h02Var;
            f33 f33Var = c12.this.y;
            this.a = f33Var != null ? f33Var.a() : null;
            h02.QnHx qnHx = new h02.QnHx(h02Var.b(), h02Var.a());
            h02Var.a.b(qnHx);
            this.b = qnHx;
        }

        @Override // f33.QnHx
        public final void a() {
            this.d.a.l(this.b);
            f33.QnHx qnHx = this.a;
            if (qnHx != null) {
                qnHx.a();
            }
            vl3 vl3Var = (vl3) c12.this.w.k.getValue();
            if (vl3Var != null) {
                vl3Var.d();
            }
        }
    }

    public static final class QnHx implements f33.QnHx {
        @Override // f33.QnHx
        public final void a() {
        }
    }

    public c12(q12 q12Var, h02 h02Var) {
        this.w = q12Var;
        this.x = h02Var;
    }

    @Override // defpackage.pg2
    public final /* synthetic */ boolean B(f30.F1 f1) {
        return dj.a(this, f1);
    }

    @Override // defpackage.f33
    public final f33.QnHx a() {
        f33.QnHx qnHxA;
        h02 h02Var = this.x;
        if (h02Var.a.k()) {
            return new CQf(h02Var);
        }
        f33 f33Var = this.y;
        return (f33Var == null || (qnHxA = f33Var.a()) == null) ? z : qnHxA;
    }

    @Override // defpackage.rg2
    public final void c(vg2 vg2Var) {
        this.y = (f33) vg2Var.a(h33.a);
    }

    @Override // defpackage.tg2
    public final mg3<f33> getKey() {
        return h33.a;
    }

    @Override // defpackage.tg2
    public final f33 getValue() {
        return this;
    }

    @Override // defpackage.pg2
    public final Object m0(Object obj, x81 x81Var) {
        return x81Var.invoke(obj, this);
    }

    @Override // defpackage.pg2
    public final /* synthetic */ pg2 y(pg2 pg2Var) {
        return hj0.b(this, pg2Var);
    }

    @Override // defpackage.pg2
    public final Object z(Object obj, x81 x81Var) {
        return x81Var.invoke(this, obj);
    }
}
