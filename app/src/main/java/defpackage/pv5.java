package defpackage;

import com.google.android.gms.internal.ads.zzaag;
import com.google.android.gms.internal.ads.zzaai;
import com.google.android.gms.internal.ads.zzaaj;
import com.google.android.gms.internal.ads.zzel;

/* JADX INFO: loaded from: classes3.dex */
public final class pv5 implements zzaai {
    public final /* synthetic */ qv5 a;

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        qv5 qv5Var = this.a;
        return (qv5Var.B * 1000000) / ((long) qv5Var.z.i);
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        qv5 qv5Var = this.a;
        long j2 = (((long) qv5Var.z.i) * j) / 1000000;
        long j3 = qv5Var.x;
        long j4 = qv5Var.B;
        long j5 = qv5Var.y;
        zzaaj zzaajVar = new zzaaj(j, zzel.zzr(((((j5 - j3) * j2) / j4) + j3) - 30000, j3, j5 - 1));
        return new zzaag(zzaajVar, zzaajVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return true;
    }
}
