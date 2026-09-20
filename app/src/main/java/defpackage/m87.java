package defpackage;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class m87 implements u86<l57> {
    public final y96<Application> w;
    public final y96<z26> x;
    public final y96<gy5> y;

    public m87(a96 a96Var, j76 j76Var, y96 y96Var) {
        this.w = a96Var;
        this.x = j76Var;
        this.y = y96Var;
    }

    @Override // defpackage.y96
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l57 zzb() {
        return new l57(this.w.zzb(), ((j76) this.x).zzb(), this.y.zzb());
    }
}
