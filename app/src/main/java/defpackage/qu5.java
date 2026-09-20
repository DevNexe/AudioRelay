package defpackage;

import com.google.android.gms.internal.ads.zzaag;
import com.google.android.gms.internal.ads.zzaaj;
import com.google.android.gms.internal.ads.zzel;

/* JADX INFO: loaded from: classes3.dex */
public final class qu5 implements pu5 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;

    public qu5(long[] jArr, long[] jArr2, long j, long j2) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.pu5
    public final long zzb() {
        return this.d;
    }

    @Override // defpackage.pu5
    public final long zzc(long j) {
        return this.a[zzel.zzd(this.b, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final long zze() {
        return this.c;
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final zzaag zzg(long j) {
        long[] jArr = this.a;
        int iZzd = zzel.zzd(jArr, j, true, true);
        long j2 = jArr[iZzd];
        long[] jArr2 = this.b;
        zzaaj zzaajVar = new zzaaj(j2, jArr2[iZzd]);
        if (zzaajVar.zzb >= j || iZzd == jArr.length - 1) {
            return new zzaag(zzaajVar, zzaajVar);
        }
        int i = iZzd + 1;
        return new zzaag(zzaajVar, new zzaaj(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzaai
    public final boolean zzh() {
        return true;
    }
}
