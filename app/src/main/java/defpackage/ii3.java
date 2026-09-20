package defpackage;

import kotlinx.coroutines.flow.QnHx;

/* JADX INFO: loaded from: classes3.dex */
public final class ii3<T> implements js4<T>, mz0, q91<T> {
    public final ms1 w;
    public final /* synthetic */ js4<T> x;

    public ii3(QnHx qnHx, qr4 qr4Var) {
        this.w = qr4Var;
        this.x = qnHx;
    }

    @Override // defpackage.mj4, defpackage.mz0
    public final Object a(nz0<? super T> nz0Var, z80<?> z80Var) {
        return this.x.a(nz0Var, z80Var);
    }

    @Override // defpackage.q91
    public final mz0<T> c(la0 la0Var, int i, lg lgVar) {
        return ((((i >= 0 && i < 2) || i == -2) && lgVar == lg.DROP_OLDEST) || ((i == 0 || i == -3) && lgVar == lg.SUSPEND)) ? this : new uo(i, la0Var, lgVar, this);
    }

    @Override // defpackage.js4
    public final T getValue() {
        return this.x.getValue();
    }
}
