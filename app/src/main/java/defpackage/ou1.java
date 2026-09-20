package defpackage;

import kotlinx.serialization.json.internal.JsonDecodingException;

/* JADX INFO: loaded from: classes3.dex */
public final class ou1 implements rv1<nu1> {
    public static final ou1 a = new ou1();
    public static final ra4 b = FWT.r("nu1", xa4.CQf.a, new pa4[0], ua4.w);

    @Override // defpackage.rv1, defpackage.db4, defpackage.zj0
    public final pa4 a() {
        return b;
    }

    @Override // defpackage.zj0
    public final Object c(pf0 pf0Var) {
        qe0.c(pf0Var);
        if (pf0Var.X()) {
            throw new JsonDecodingException("Expected 'null' literal");
        }
        pf0Var.L();
        return nu1.INSTANCE;
    }

    @Override // defpackage.db4
    public final void e(ls0 ls0Var, Object obj) {
        qe0.b(ls0Var);
        ls0Var.h();
    }
}
