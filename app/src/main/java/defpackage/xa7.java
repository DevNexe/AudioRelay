package defpackage;

import com.google.android.gms.internal.ads.zzgg;
import com.google.android.gms.internal.ads.zzje;
import com.google.android.gms.internal.ads.zztw;

/* JADX INFO: loaded from: classes3.dex */
public final class xa7 implements zztw {
    public final zztw a;
    public final long b;

    public xa7(zztw zztwVar, long j) {
        this.a = zztwVar;
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final int zza(zzje zzjeVar, zzgg zzggVar, int i) {
        int iZza = this.a.zza(zzjeVar, zzggVar, i);
        if (iZza != -4) {
            return iZza;
        }
        zzggVar.zzd = Math.max(0L, zzggVar.zzd + this.b);
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final int zzb(long j) {
        return this.a.zzb(j - this.b);
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final void zzd() {
        this.a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztw
    public final boolean zze() {
        return this.a.zze();
    }
}
