package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgan {

    @GuardedBy("this")
    public final zzgjq a;

    public zzgan(zzgjq zzgjqVar) {
        this.a = zzgjqVar;
    }

    public static zzgan zzd() {
        return new zzgan(zzgjt.zzd());
    }

    public final synchronized int a() {
        int iZza;
        boolean z;
        iZza = zzgep.zza();
        while (true) {
            synchronized (this) {
                Iterator it = this.a.zzc().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((zzgjs) it.next()).zza() == iZza) {
                        z = true;
                        break;
                    }
                }
            }
            return iZza;
            iZza = zzgep.zza();
        }
        if (!z) {
            return iZza;
        }
        iZza = zzgep.zza();
    }

    public final synchronized zzgjs b(zzgjg zzgjgVar, int i) {
        zzgjr zzgjrVarZzd;
        int iA = a();
        if (i == 2) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        zzgjrVarZzd = zzgjs.zzd();
        zzgjrVarZzd.zza(zzgjgVar);
        zzgjrVarZzd.zzb(iA);
        zzgjrVarZzd.zzd(3);
        zzgjrVarZzd.zzc(i);
        return (zzgjs) zzgjrVarZzd.zzal();
    }

    @Deprecated
    public final synchronized int zza(zzgjl zzgjlVar, boolean z) {
        zzgjs zzgjsVarB;
        synchronized (this) {
            zzgjsVarB = b(zzgbe.zzc(zzgjlVar), zzgjlVar.zzi());
        }
        return zzgjsVarB.zza();
        this.a.zza(zzgjsVarB);
        this.a.zzb(zzgjsVarB.zza());
        return zzgjsVarB.zza();
    }

    public final synchronized zzgam zzb() {
        return zzgam.a((zzgjt) this.a.zzal());
    }

    @Deprecated
    public final synchronized zzgan zzc(zzgjl zzgjlVar) {
        zza(zzgjlVar, true);
        return this;
    }
}
