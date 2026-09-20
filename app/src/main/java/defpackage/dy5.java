package defpackage;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class dy5 implements u86<rx5> {
    public final y96<Application> w;
    public final y96<gy5> x;

    public dy5(a96 a96Var, y96 y96Var) {
        this.w = a96Var;
        this.x = y96Var;
    }

    @Override // defpackage.y96
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rx5 zzb() {
        Application applicationZzb = this.w.zzb();
        gy5 gy5VarZzb = this.x.zzb();
        t76 t76Var = w76.b;
        C0239D.L(t76Var);
        return new rx5(applicationZzb, gy5VarZzb, t76Var);
    }
}
