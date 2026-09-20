package com.google.android.gms.internal.ads;

import defpackage.az6;
import defpackage.cz6;
import defpackage.d17;
import defpackage.v07;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzhv implements Runnable {
    public final /* synthetic */ cz6 zza;
    public final /* synthetic */ zziz zzb;

    public /* synthetic */ zzhv(cz6 cz6Var, zziz zzizVar) {
        this.zza = cz6Var;
        this.zzb = zzizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        boolean z;
        cz6 cz6Var = this.zza;
        zziz zzizVar = this.zzb;
        int i = cz6Var.v - zzizVar.zzb;
        cz6Var.v = i;
        boolean z2 = true;
        if (zzizVar.zzc) {
            cz6Var.w = zzizVar.zzd;
            cz6Var.x = true;
        }
        if (zzizVar.zze) {
            cz6Var.y = zzizVar.zzf;
        }
        if (i == 0) {
            zzcn zzcnVar = zzizVar.zza.a;
            if (!cz6Var.N.a.zzo() && zzcnVar.zzo()) {
                cz6Var.O = -1;
                cz6Var.P = 0L;
            }
            if (!zzcnVar.zzo()) {
                List listAsList = Arrays.asList(((d17) zzcnVar).g);
                zzdd.zzf(listAsList.size() == cz6Var.m.size());
                for (int i2 = 0; i2 < listAsList.size(); i2++) {
                    ((az6) cz6Var.m.get(i2)).b = (zzcn) listAsList.get(i2);
                }
            }
            long j2 = -9223372036854775807L;
            if (cz6Var.x) {
                if (zzizVar.zza.b.equals(cz6Var.N.b) && zzizVar.zza.d == cz6Var.N.s) {
                    z2 = false;
                }
                if (z2) {
                    if (zzcnVar.zzo() || zzizVar.zza.b.zzb()) {
                        j2 = zzizVar.zza.d;
                    } else {
                        v07 v07Var = zzizVar.zza;
                        zzsg zzsgVar = v07Var.b;
                        long j3 = v07Var.d;
                        zzcnVar.zzn(zzsgVar.zza, cz6Var.l);
                        j2 = j3;
                    }
                }
                j = j2;
                z = z2;
            } else {
                j = -9223372036854775807L;
                z = false;
            }
            cz6Var.x = false;
            cz6Var.m(zzizVar.zza, 1, cz6Var.y, false, z, cz6Var.w, j, -1);
        }
    }
}
