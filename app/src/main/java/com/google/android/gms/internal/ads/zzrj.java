package com.google.android.gms.internal.ads;

import android.net.Uri;
import defpackage.fc2;
import java.io.EOFException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrj implements zzsz {
    public final zzzm a;
    public zzzf b;
    public zzyv c;

    public zzrj(zzzm zzzmVar) {
        this.a = zzzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final int zza(zzaaf zzaafVar) {
        zzzf zzzfVar = this.b;
        zzzfVar.getClass();
        zzyv zzyvVar = this.c;
        zzyvVar.getClass();
        return zzzfVar.zza(zzyvVar, zzaafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final long zzb() {
        zzyv zzyvVar = this.c;
        if (zzyvVar != null) {
            return zzyvVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzc() {
        zzzf zzzfVar = this.b;
        if (zzzfVar instanceof zzaen) {
            ((zzaen) zzzfVar).zze();
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0066  */
    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzd(zzr zzrVar, Uri uri, Map map, long j, long j2, zzzi zzziVar) throws zzuf {
        zzyv zzyvVar = new zzyv(zzrVar, j, j2);
        this.c = zzyvVar;
        if (this.b != null) {
            return;
        }
        zzzf[] zzzfVarArrZzb = this.a.zzb(uri, map);
        if (zzzfVarArrZzb.length == 1) {
            this.b = zzzfVarArrZzb[0];
        } else {
            for (zzzf zzzfVar : zzzfVarArrZzb) {
                try {
                    if (zzzfVar.zzd(zzyvVar)) {
                        this.b = zzzfVar;
                        zzdd.zzf(true);
                        zzyvVar.zzj();
                        break;
                    } else {
                        boolean z = this.b != null || zzyvVar.zzf() == j;
                        zzdd.zzf(z);
                        zzyvVar.zzj();
                    }
                } catch (EOFException unused) {
                    if (this.b != null || zzyvVar.zzf() == j) {
                    }
                } catch (Throwable th) {
                    zzdd.zzf(this.b != null || zzyvVar.zzf() == j);
                    zzyvVar.zzj();
                    throw th;
                }
                zzdd.zzf(z);
                zzyvVar.zzj();
            }
            if (this.b == null) {
                throw new zzuf(fc2.a("None of the available extractors (", zzel.zzK(zzzfVarArrZzb), ") could read the stream."), uri);
            }
        }
        this.b.zzb(zzziVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zze() {
        if (this.b != null) {
            this.b = null;
        }
        this.c = null;
    }

    @Override // com.google.android.gms.internal.ads.zzsz
    public final void zzf(long j, long j2) {
        zzzf zzzfVar = this.b;
        zzzfVar.getClass();
        zzzfVar.zzc(j, j2);
    }
}
