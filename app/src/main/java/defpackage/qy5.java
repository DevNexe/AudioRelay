package defpackage;

import android.app.Application;

/* JADX INFO: loaded from: classes3.dex */
public final class qy5 implements u86 {
    public final /* synthetic */ int w;
    public final y96 x;

    public /* synthetic */ qy5(y96 y96Var, int i) {
        this.w = i;
        this.x = y96Var;
    }

    @Override // defpackage.y96
    public final /* bridge */ /* synthetic */ Object zzb() {
        switch (this.w) {
            case 0:
                return new gy5((Application) this.x.zzb());
            case 1:
                return new d36();
            default:
                t76 t76Var = w76.b;
                C0239D.L(t76Var);
                return new mw6(t76Var);
        }
    }
}
