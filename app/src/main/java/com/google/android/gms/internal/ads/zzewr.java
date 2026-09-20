package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzewr {
    public final zzcba a;
    public final int b;

    public zzewr(zzcba zzcbaVar, int i) {
        this.a = zzcbaVar;
        this.b = i;
    }

    public final int zza() {
        return this.b;
    }

    public final PackageInfo zzb() {
        return this.a.zzf;
    }

    public final String zzc() {
        return this.a.zzd;
    }

    public final String zzd() {
        return this.a.zza.getString("ms");
    }

    public final String zze() {
        return this.a.zzh;
    }

    public final List zzf() {
        return this.a.zze;
    }
}
