package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzajw;
import com.google.android.gms.internal.ads.zzaka;
import com.google.android.gms.internal.ads.zzakg;
import com.google.android.gms.internal.ads.zzakx;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzchf;
import defpackage.ta2;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class zzbn extends zzaka {
    public final zzchf I;
    public final zzcgm J;

    public zzbn(String str, Map map, zzchf zzchfVar) {
        super(0, str, new ta2(zzchfVar, 8));
        this.I = zzchfVar;
        zzcgm zzcgmVar = new zzcgm(null);
        this.J = zzcgmVar;
        zzcgmVar.zzd(str, "GET", null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final zzakg a(zzajw zzajwVar) {
        return zzakg.zzb(zzajwVar, zzakx.zzb(zzajwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        zzajw zzajwVar = (zzajw) obj;
        Map map = zzajwVar.zzc;
        int i = zzajwVar.zza;
        zzcgm zzcgmVar = this.J;
        zzcgmVar.zzf(map, i);
        byte[] bArr = zzajwVar.zzb;
        if (zzcgm.zzl() && bArr != null) {
            zzcgmVar.zzh(bArr);
        }
        this.I.zzd(zzajwVar);
    }
}
