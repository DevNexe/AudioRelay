package defpackage;

import com.google.android.gms.internal.ads.zzaai;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzel;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzq;
import com.google.android.gms.internal.ads.zzzr;
import com.google.android.gms.internal.ads.zzzs;

/* JADX INFO: loaded from: classes3.dex */
public final class rv5 implements aw5 {
    public final zzzs w;
    public final zzzr x;
    public long y = -1;
    public long z = -1;

    public rv5(zzzs zzzsVar, zzzr zzzrVar) {
        this.w = zzzsVar;
        this.x = zzzrVar;
    }

    @Override // defpackage.aw5
    public final long zzd(zzzg zzzgVar) {
        long j = this.z;
        if (j < 0) {
            return -1L;
        }
        this.z = -1L;
        return -(j + 2);
    }

    @Override // defpackage.aw5
    public final zzaai zze() {
        zzdd.zzf(this.y != -1);
        return new zzzq(this.w, this.y);
    }

    @Override // defpackage.aw5
    public final void zzg(long j) {
        long[] jArr = this.x.zza;
        this.z = jArr[zzel.zzd(jArr, j, true, true)];
    }
}
