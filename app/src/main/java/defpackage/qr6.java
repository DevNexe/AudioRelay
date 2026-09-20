package defpackage;

import com.google.android.gms.measurement.internal.zzgq;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class qr6 implements Callable {
    public final /* synthetic */ zzgq A;
    public final /* synthetic */ int w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public /* synthetic */ qr6(zzgq zzgqVar, String str, String str2, String str3, int i) {
        this.w = i;
        this.A = zzgqVar;
        this.x = str;
        this.y = str2;
        this.z = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.w;
        String str = this.x;
        String str2 = this.z;
        String str3 = this.y;
        zzgq zzgqVar = this.A;
        switch (i) {
            case 0:
                zzgqVar.w.a();
                iy5 iy5Var = zzgqVar.w.c;
                r27.E(iy5Var);
                return iy5Var.J(str, str3, str2);
            default:
                zzgqVar.w.a();
                iy5 iy5Var2 = zzgqVar.w.c;
                r27.E(iy5Var2);
                return iy5Var2.G(str, str3, str2);
        }
    }
}
