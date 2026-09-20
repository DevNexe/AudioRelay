package defpackage;

import com.google.android.gms.measurement.internal.zzgq;

/* JADX INFO: loaded from: classes3.dex */
public final class rs6 implements Runnable {
    public final /* synthetic */ int w;
    public final /* synthetic */ p97 x;
    public final /* synthetic */ zzgq y;

    public /* synthetic */ rs6(zzgq zzgqVar, p97 p97Var, int i) {
        this.w = i;
        this.y = zzgqVar;
        this.x = p97Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.w;
        p97 p97Var = this.x;
        zzgq zzgqVar = this.y;
        switch (i) {
            case 0:
                zzgqVar.w.a();
                r27 r27Var = zzgqVar.w;
                r27Var.zzaz().e();
                r27Var.d();
                oa3.e(p97Var.w);
                ww5 ww5VarB = ww5.b(p97Var.R);
                String str = p97Var.w;
                ww5 ww5VarH = r27Var.H(str);
                r27Var.zzay().n.d(str, "Setting consent, package, consent", ww5VarB);
                r27Var.o(str, ww5VarB);
                if (ww5VarB.g(ww5VarH, (hw5[]) ww5VarB.a.keySet().toArray(new hw5[0]))) {
                    r27Var.m(p97Var);
                }
                break;
            default:
                zzgqVar.w.a();
                zzgqVar.w.j(p97Var);
                break;
        }
    }
}
