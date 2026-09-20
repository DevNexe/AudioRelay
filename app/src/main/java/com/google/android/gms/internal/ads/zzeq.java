package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeq extends zzep {
    public final byte[] e;
    public Uri f;
    public int g;
    public int h;
    public boolean i;

    public zzeq(byte[] bArr) {
        super(false);
        bArr.getClass();
        zzdd.zzd(bArr.length > 0);
        this.e = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(this.e, this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) throws zzew {
        this.f = zzfaVar.zza;
        b(zzfaVar);
        long j = zzfaVar.zzf;
        int length = this.e.length;
        if (j > length) {
            throw new zzew(AdError.REMOTE_ADS_SERVICE_ERROR);
        }
        int i = (int) j;
        this.g = i;
        int i2 = length - i;
        this.h = i2;
        long j2 = zzfaVar.zzg;
        if (j2 != -1) {
            this.h = (int) Math.min(i2, j2);
        }
        this.i = true;
        c(zzfaVar);
        long j3 = zzfaVar.zzg;
        return j3 != -1 ? j3 : this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        return this.f;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzd() {
        if (this.i) {
            this.i = false;
            a();
        }
        this.f = null;
    }
}
