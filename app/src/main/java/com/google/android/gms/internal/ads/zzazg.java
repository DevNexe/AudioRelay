package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazg implements zzazi {
    public final byte[] a;
    public Uri b;
    public int c;
    public int d;

    public zzazg(byte[] bArr) {
        bArr.getClass();
        zzazy.zzc(bArr.length > 0);
        this.a = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        System.arraycopy(this.a, this.c, bArr, i, iMin);
        this.c += iMin;
        this.d -= iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final long zzb(zzazk zzazkVar) throws IOException {
        this.b = zzazkVar.zza;
        long j = zzazkVar.zzc;
        int i = (int) j;
        this.c = i;
        long length = zzazkVar.zzd;
        byte[] bArr = this.a;
        long j2 = -1;
        if (length == -1) {
            length = ((long) bArr.length) - j;
        } else {
            j2 = length;
        }
        int i2 = (int) length;
        this.d = i2;
        if (i2 > 0 && i + i2 <= bArr.length) {
            return i2;
        }
        throw new IOException("Unsatisfiable range: [" + i + ", " + j2 + "], length: " + bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final Uri zzc() {
        return this.b;
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void zzd() {
        this.b = null;
    }
}
