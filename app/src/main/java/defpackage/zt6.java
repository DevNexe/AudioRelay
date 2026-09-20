package defpackage;

import com.google.android.gms.measurement.internal.zzgq;

/* JADX INFO: loaded from: classes3.dex */
public final class zt6 implements Runnable {
    public final /* synthetic */ zzgq A;
    public final /* synthetic */ String w;
    public final /* synthetic */ String x;
    public final /* synthetic */ String y;
    public final /* synthetic */ long z;

    public zt6(zzgq zzgqVar, String str, String str2, String str3, long j) {
        this.A = zzgqVar;
        this.w = str;
        this.x = str2;
        this.y = str3;
        this.z = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.x;
        zzgq zzgqVar = this.A;
        String str2 = this.w;
        if (str2 == null) {
            r27 r27Var = zzgqVar.w;
            r27Var.zzaz().e();
            String str3 = r27Var.D;
            if (str3 == null || str3.equals(str)) {
                r27Var.D = str;
                r27Var.C = null;
                return;
            }
            return;
        }
        qy6 qy6Var = new qy6(this.y, str2, this.z);
        r27 r27Var2 = zzgqVar.w;
        r27Var2.zzaz().e();
        String str4 = r27Var2.D;
        if (str4 != null) {
            str4.equals(str);
        }
        r27Var2.D = str;
        r27Var2.C = qy6Var;
    }
}
