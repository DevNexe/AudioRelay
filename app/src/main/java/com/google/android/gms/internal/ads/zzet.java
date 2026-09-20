package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Base64;
import com.facebook.ads.AdError;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes3.dex */
public final class zzet extends zzep {
    public zzfa e;
    public byte[] f;
    public int g;
    public int h;

    public zzet() {
        super(false);
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
        System.arraycopy(zzel.zzH(this.f), this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) throws zzbu, zzew {
        b(zzfaVar);
        this.e = zzfaVar;
        Uri uri = zzfaVar.zza;
        String scheme = uri.getScheme();
        zzdd.zze("data".equals(scheme), "Unsupported scheme: ".concat(String.valueOf(scheme)));
        String[] strArrZzag = zzel.zzag(uri.getSchemeSpecificPart(), ",");
        if (strArrZzag.length != 2) {
            throw zzbu.zzb("Unexpected URI format: ".concat(String.valueOf(uri)), null);
        }
        String str = strArrZzag[1];
        if (strArrZzag[0].contains(";base64")) {
            try {
                this.f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e) {
                throw zzbu.zzb("Error while parsing Base64 encoded string: ".concat(String.valueOf(str)), e);
            }
        } else {
            this.f = zzel.zzaa(URLDecoder.decode(str, zzfrs.zza.name()));
        }
        long j = zzfaVar.zzf;
        int length = this.f.length;
        if (j > length) {
            this.f = null;
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
        c(zzfaVar);
        long j3 = zzfaVar.zzg;
        return j3 != -1 ? j3 : this.h;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        zzfa zzfaVar = this.e;
        if (zzfaVar != null) {
            return zzfaVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzd() {
        if (this.f != null) {
            this.f = null;
            a();
        }
        this.e = null;
    }
}
