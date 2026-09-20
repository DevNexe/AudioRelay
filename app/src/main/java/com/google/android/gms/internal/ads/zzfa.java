package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.ex0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfa {
    public final Uri zza;
    public final int zzb;
    public final byte[] zzc;
    public final Map zzd;

    @Deprecated
    public final long zze;
    public final long zzf;
    public final long zzg;
    public final String zzh;
    public final int zzi;

    static {
        zzbh.zzb("media3.datasource");
    }

    public zzfa(Uri uri, long j, Map map, long j2, long j3, int i) {
        long j4 = j + j2;
        boolean z = false;
        zzdd.zzd(j4 >= 0);
        zzdd.zzd(j2 >= 0);
        if (j3 > 0) {
            z = true;
        } else if (j3 == -1) {
            j3 = -1;
            z = true;
        }
        zzdd.zzd(z);
        this.zza = uri;
        this.zzb = 1;
        this.zzc = null;
        this.zzd = Collections.unmodifiableMap(new HashMap(map));
        this.zzf = j2;
        this.zze = j4;
        this.zzg = j3;
        this.zzh = null;
        this.zzi = i;
    }

    public static String zza(int i) {
        return "GET";
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        long j = this.zzf;
        long j2 = this.zzg;
        int i = this.zzi;
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(zza(1));
        sb.append(" ");
        sb.append(strValueOf);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", null, ");
        return ex0.c(sb, i, "]");
    }

    public final boolean zzb(int i) {
        return (this.zzi & i) == i;
    }

    @Deprecated
    public zzfa(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        this(uri, j - j2, Collections.emptyMap(), j2, j3, i);
    }
}
