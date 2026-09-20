package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfw implements zzev {
    public final zzev a;
    public long b;
    public Uri c;
    public Map d;

    public zzfw(zzev zzevVar) {
        zzevVar.getClass();
        this.a = zzevVar;
        this.c = Uri.EMPTY;
        this.d = Collections.emptyMap();
    }

    @Override // com.google.android.gms.internal.ads.zzr
    public final int zza(byte[] bArr, int i, int i2) {
        int iZza = this.a.zza(bArr, i, i2);
        if (iZza != -1) {
            this.b += (long) iZza;
        }
        return iZza;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final long zzb(zzfa zzfaVar) {
        this.c = zzfaVar.zza;
        this.d = Collections.emptyMap();
        long jZzb = this.a.zzb(zzfaVar);
        Uri uriZzc = zzc();
        uriZzc.getClass();
        this.c = uriZzc;
        this.d = zze();
        return jZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final Uri zzc() {
        return this.a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzd() {
        this.a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzev, com.google.android.gms.internal.ads.zzfs
    public final Map zze() {
        return this.a.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzev
    public final void zzf(zzfx zzfxVar) {
        zzfxVar.getClass();
        this.a.zzf(zzfxVar);
    }

    public final long zzg() {
        return this.b;
    }

    public final Uri zzh() {
        return this.c;
    }

    public final Map zzi() {
        return this.d;
    }
}
