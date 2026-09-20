package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FJCM implements la0.CQf {
    public final la0.F1<?> w;

    public FJCM(la0.F1<?> f1) {
        this.w = f1;
    }

    @Override // la0.CQf, defpackage.la0
    public la0 e(la0.F1<?> f1) {
        return la0.CQf.QnHx.b(this, f1);
    }

    @Override // defpackage.la0
    public final la0 g0(la0 la0Var) {
        return la0.QnHx.a(this, la0Var);
    }

    @Override // la0.CQf
    public final la0.F1<?> getKey() {
        return this.w;
    }

    @Override // la0.CQf, defpackage.la0
    public final <R> R i(R r, x81<? super R, ? super la0.CQf, ? extends R> x81Var) {
        return x81Var.invoke(r, this);
    }

    @Override // la0.CQf, defpackage.la0
    public <E extends la0.CQf> E j(la0.F1<E> f1) {
        return (E) la0.CQf.QnHx.a(this, f1);
    }
}
