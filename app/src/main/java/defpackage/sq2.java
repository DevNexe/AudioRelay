package defpackage;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final class sq2<T> implements rv1<T> {
    public final T a;
    public final oz1 b = qLd.h(2, new rq2(this));

    /* JADX WARN: Multi-variable type inference failed */
    public sq2(sd5 sd5Var) {
        this.a = sd5Var;
    }

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return (pa4) this.b.getValue();
    }

    @Override // defpackage.zj0
    public final T c(pf0 pf0Var) {
        pa4 pa4VarA = a();
        g40 g40VarB = pf0Var.b(pa4VarA);
        int iP = g40VarB.p(a());
        if (iP != -1) {
            throw new SerializationException(GM.a("Unexpected index ", iP));
        }
        sd5 sd5Var = sd5.a;
        g40VarB.G(pa4VarA);
        return this.a;
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, T t) {
        eu1 eu1VarB = ls0Var.b(a());
        a();
        eu1VarB.k();
    }
}
