package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefl implements zzfhq {
    public final zzeez w;
    public final zzefd x;

    public zzefl(zzeez zzeezVar, zzefd zzefdVar) {
        this.w = zzeezVar;
        this.x = zzefdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzbF(zzfhj zzfhjVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzbG(zzfhj zzfhjVar, String str, Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfj)).booleanValue() && zzfhj.RENDERER == zzfhjVar) {
            zzeez zzeezVar = this.w;
            if (zzeezVar.zzc() != 0) {
                zzeezVar.zzf(com.google.android.gms.ads.internal.zzt.zzB().c() - zzeezVar.zzc());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzc(zzfhj zzfhjVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfj)).booleanValue()) {
            zzfhj zzfhjVar2 = zzfhj.RENDERER;
            zzeez zzeezVar = this.w;
            if (zzfhjVar2 == zzfhjVar) {
                zzeezVar.zzg(com.google.android.gms.ads.internal.zzt.zzB().c());
                return;
            }
            if (zzfhj.PRELOADED_LOADER == zzfhjVar || zzfhj.SERVER_TRANSACTION == zzfhjVar) {
                zzeezVar.zzh(com.google.android.gms.ads.internal.zzt.zzB().c());
                final long jZzd = zzeezVar.zzd();
                final zzefd zzefdVar = this.x;
                zzefdVar.b.zza(new zzfgs() { // from class: com.google.android.gms.internal.ads.zzefc
                    @Override // com.google.android.gms.internal.ads.zzfgs
                    public final Object zza(Object obj) {
                        zzefd zzefdVar2 = zzefdVar;
                        long j = jZzd;
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                        if (zzefdVar2.a.zzP()) {
                            return null;
                        }
                        zzbgt zzbgtVarZzg = zzbgu.zzg();
                        zzbgtVarZzg.zzh(j);
                        byte[] bArrZzaw = ((zzbgu) zzbgtVarZzg.zzal()).zzaw();
                        zzefk.zzg(sQLiteDatabase, false, false);
                        zzefk.zzd(sQLiteDatabase, j, bArrZzaw);
                        return null;
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhq
    public final void zzd(zzfhj zzfhjVar, String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzfj)).booleanValue() && zzfhj.RENDERER == zzfhjVar) {
            zzeez zzeezVar = this.w;
            if (zzeezVar.zzc() != 0) {
                zzeezVar.zzf(com.google.android.gms.ads.internal.zzt.zzB().c() - zzeezVar.zzc());
            }
        }
    }
}
