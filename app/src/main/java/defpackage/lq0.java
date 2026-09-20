package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lq0<T> extends lg3<T> {
    public final rp4<T> b;

    public lq0(rp4<T> rp4Var, h81<? extends T> h81Var) {
        super(h81Var);
        this.b = rp4Var;
    }

    @Override // defpackage.p40
    public final is4 a(Object obj, g30 g30Var) {
        g30Var.e(-84026900);
        g30Var.e(-492369756);
        Object objF = g30Var.f();
        if (objF == g30.QnHx.a) {
            objF = ps0.Q(obj, this.b);
            g30Var.B(objF);
        }
        g30Var.G();
        ri2 ri2Var = (ri2) objF;
        ri2Var.setValue(obj);
        g30Var.G();
        return ri2Var;
    }
}
