package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bh2 implements ah2 {
    public final kz2 w = ps0.R(Float.valueOf(1.0f));

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ah2
    public final float R() {
        return ((Number) this.w.getValue()).floatValue();
    }

    @Override // la0.CQf, defpackage.la0
    public final la0 e(la0.F1<?> f1) {
        return la0.CQf.QnHx.b(this, f1);
    }

    @Override // defpackage.la0
    public final la0 g0(la0 la0Var) {
        return la0.QnHx.a(this, la0Var);
    }

    @Override // la0.CQf
    public final la0.F1 getKey() {
        return ah2.QnHx.w;
    }

    @Override // la0.CQf, defpackage.la0
    public final <R> R i(R r, x81<? super R, ? super la0.CQf, ? extends R> x81Var) {
        return x81Var.invoke(r, this);
    }

    @Override // la0.CQf, defpackage.la0
    public final <E extends la0.CQf> E j(la0.F1<E> f1) {
        return (E) la0.CQf.QnHx.a(this, f1);
    }
}
