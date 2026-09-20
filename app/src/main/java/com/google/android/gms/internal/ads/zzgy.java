package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.i5;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgy extends zzbw {
    public static final zzn zzd = new zzn() { // from class: com.google.android.gms.internal.ads.zzgx
    };
    public final boolean w;
    public final int zze;
    public final String zzf;
    public final int zzg;
    public final zzaf zzh;
    public final int zzi;
    public final zzbn zzj;

    public zzgy(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    public static zzgy zzb(Throwable th, String str, int i, zzaf zzafVar, int i2, boolean z, int i3) {
        return new zzgy(1, th, i3, str, i, zzafVar, zzafVar == null ? 4 : i2, z);
    }

    public static zzgy zzc(IOException iOException, int i) {
        return new zzgy(0, iOException, i);
    }

    public static zzgy zzd(RuntimeException runtimeException, int i) {
        return new zzgy(2, runtimeException, i);
    }

    public final zzgy a(zzsg zzsgVar) {
        String message = getMessage();
        int i = zzel.zza;
        return new zzgy(message, getCause(), this.zzb, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, zzsgVar, this.zzc, this.w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzgy(int i, Throwable th, int i2, String str, int i3, zzaf zzafVar, int i4, boolean z) {
        String strB;
        if (i == 0) {
            strB = "Source error";
        } else if (i != 1) {
            strB = "Unexpected runtime error";
        } else {
            String strValueOf = String.valueOf(zzafVar);
            String strZzM = zzel.zzM(i4);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(strValueOf);
            strB = i5.b(sb, ", format_supported=", strZzM);
        }
        this(TextUtils.isEmpty(null) ? strB : strB.concat(": null"), th, i2, i, str, i3, zzafVar, i4, null, SystemClock.elapsedRealtime(), z);
    }

    public zzgy(String str, Throwable th, int i, int i2, String str2, int i3, zzaf zzafVar, int i4, zzsg zzsgVar, long j, boolean z) {
        boolean z2;
        super(str, th, i, j);
        int i5 = i2;
        if (!z) {
            z2 = true;
        } else if (i5 == 1) {
            i5 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        zzdd.zzd(z2);
        zzdd.zzd(th != null);
        this.zze = i5;
        this.zzf = str2;
        this.zzg = i3;
        this.zzh = zzafVar;
        this.zzi = i4;
        this.zzj = zzsgVar;
        this.w = z;
    }
}
