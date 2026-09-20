package defpackage;

import com.google.android.gms.internal.ads.zzfir;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfyk;

/* JADX INFO: loaded from: classes3.dex */
public final class dl6 implements zzfyk {
    public final /* synthetic */ zzfjc w;
    public final /* synthetic */ zzfir x;
    public final /* synthetic */ boolean y;

    public dl6(zzfjc zzfjcVar, zzfir zzfirVar, boolean z) {
        this.w = zzfjcVar;
        this.x = zzfirVar;
        this.y = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        zzfir zzfirVar = this.x;
        if (zzfirVar.zzh()) {
            zzfirVar.zze(false);
            zzfjc zzfjcVar = this.w;
            zzfjcVar.zza(zzfirVar);
            if (this.y) {
                zzfjcVar.zzg();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final void mo32zzb(Object obj) {
        zzfir zzfirVar = this.x;
        zzfirVar.zze(true);
        zzfjc zzfjcVar = this.w;
        zzfjcVar.zza(zzfirVar);
        if (this.y) {
            zzfjcVar.zzg();
        }
    }
}
