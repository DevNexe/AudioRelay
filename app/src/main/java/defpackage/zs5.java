package defpackage;

import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzt;

/* JADX INFO: loaded from: classes3.dex */
public final class zs5 extends zzzt {
    public final long b;

    public zs5(zzzg zzzgVar, long j) {
        super(zzzgVar);
        zzdd.zzd(zzzgVar.zzf() >= j);
        this.b = j;
    }

    @Override // com.google.android.gms.internal.ads.zzzt, com.google.android.gms.internal.ads.zzzg
    public final long zzd() {
        return super.zzd() - this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzzt, com.google.android.gms.internal.ads.zzzg
    public final long zze() {
        return super.zze() - this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzzt, com.google.android.gms.internal.ads.zzzg
    public final long zzf() {
        return super.zzf() - this.b;
    }
}
