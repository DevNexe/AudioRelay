package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.hc2;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazk {
    public final Uri zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;

    public zzazk(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        zzazy.zzc(j >= 0);
        zzazy.zzc(j2 >= 0);
        if (j3 > 0) {
            z = true;
        } else if (j3 == -1) {
            j3 = -1;
            z = true;
        }
        zzazy.zzc(z);
        this.zza = uri;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = j3;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        String string = Arrays.toString((byte[]) null);
        long j = this.zzb;
        long j2 = this.zzc;
        long j3 = this.zzd;
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(string);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        return hc2.a(sb, j3, ", null, 0]");
    }
}
