package defpackage;

import com.google.android.gms.measurement.internal.zzgq;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class wr6 implements Callable {
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ zzgq z;

    public wr6(zzgq zzgqVar, String str, String str2, String str3) {
        this.z = zzgqVar;
        this.w = str;
        this.x = str2;
        this.y = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zzgq zzgqVar = this.z;
        zzgqVar.w.a();
        iy5 iy5Var = zzgqVar.w.c;
        r27.E(iy5Var);
        return iy5Var.J(this.w, this.x, this.y);
    }
}
