package defpackage;

import android.app.Application;
import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class gc7 implements u86<yb7> {
    public final y96<l57> A;
    public final y96<e61> B;
    public final y96<mw6> C;
    public final y96<Application> w;
    public final y96<ct5> x;
    public final y96<gy5> y;
    public final y96<d36> z;

    public gc7(a96 a96Var, y96 y96Var, y96 y96Var2, y96 y96Var3, m87 m87Var, ls5 ls5Var, y96 y96Var4) {
        this.w = a96Var;
        this.x = y96Var;
        this.y = y96Var2;
        this.z = y96Var3;
        this.A = m87Var;
        this.B = ls5Var;
        this.C = y96Var4;
    }

    @Override // defpackage.y96
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final yb7 zzb() {
        Application applicationZzb = this.w.zzb();
        this.x.zzb();
        Handler handler = w76.a;
        C0239D.L(handler);
        t76 t76Var = w76.b;
        C0239D.L(t76Var);
        return new yb7(applicationZzb, handler, t76Var, this.y.zzb(), this.z.zzb(), ((m87) this.A).zzb(), ((ls5) this.B).zzb(), this.C.zzb());
    }
}
