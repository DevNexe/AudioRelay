package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.aj6;
import defpackage.oa3;
import defpackage.sd6;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeyw extends zzbr implements com.google.android.gms.ads.internal.overlay.zzo, zzbcz {
    public final zzeyq A;
    public final zzeyo B;
    public final zzcgt C;

    @GuardedBy("this")
    public zzcvu E;

    @GuardedBy("this")
    public zzcwt F;
    public final zzcok w;
    public final Context x;
    public final String z;
    public AtomicBoolean y = new AtomicBoolean();

    @GuardedBy("this")
    public long D = -1;

    public zzeyw(zzcok zzcokVar, Context context, String str, zzeyq zzeyqVar, zzeyo zzeyoVar, zzcgt zzcgtVar) {
        this.w = zzcokVar;
        this.x = context;
        this.z = str;
        this.A = zzeyqVar;
        this.B = zzeyoVar;
        this.C = zzcgtVar;
        zzeyoVar.zzo(this);
    }

    public final synchronized void L0(int i) {
        if (this.y.compareAndSet(false, true)) {
            this.B.zzj();
            zzcvu zzcvuVar = this.E;
            if (zzcvuVar != null) {
                com.google.android.gms.ads.internal.zzt.zzb().zze(zzcvuVar);
            }
            if (this.F != null) {
                long jC = -1;
                if (this.D != -1) {
                    jC = com.google.android.gms.ads.internal.zzt.zzB().c() - this.D;
                }
                this.F.zze(jC, i);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzB() {
        oa3.d("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        oa3.d("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbdi zzbdiVar) {
        this.B.zzr(zzbdiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.A.zzl(zzwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbzj zzbzjVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzO(zzbjt zzbjtVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbzm zzbzmVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcbw zzcbwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzff zzffVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.A.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbcz
    public final void zza() {
        L0(3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        boolean z;
        if (((Boolean) zzbkm.zzd.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziG)).booleanValue()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (this.C.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziH)).intValue() || !z) {
            oa3.d("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.x) && zzlVar.zzs == null) {
            zzcgn.zzg("Failed to load the ad because app ID is missing.");
            this.B.zza(zzfem.zzd(4, null, null));
            return false;
        }
        if (zzY()) {
            return false;
        }
        this.y = new AtomicBoolean();
        return this.A.zzb(zzlVar, this.z, new aj6(), new sd6(this, 11));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        if (this.F == null) {
            return;
        }
        this.D = com.google.android.gms.ads.internal.zzt.zzB().c();
        int iZza = this.F.zza();
        if (iZza <= 0) {
            return;
        }
        zzcvu zzcvuVar = new zzcvu(this.w.zzB(), com.google.android.gms.ads.internal.zzt.zzB());
        this.E = zzcvuVar;
        zzcvuVar.zzd(iZza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzeyt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        zzcwt zzcwtVar = this.F;
        if (zzcwtVar != null) {
            zzcwtVar.zze(com.google.android.gms.ads.internal.zzt.zzB().c() - this.D, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            L0(2);
            return;
        }
        if (i2 == 1) {
            L0(4);
        } else if (i2 == 2) {
            L0(3);
        } else {
            if (i2 != 3) {
                return;
            }
            L0(6);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbf zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbz zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        return null;
    }

    public final void zzo() {
        this.w.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeys
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.L0(5);
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzx() {
        oa3.d("destroy must be called on the main UI thread.");
        zzcwt zzcwtVar = this.F;
        if (zzcwtVar != null) {
            zzcwtVar.zzV();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzz() {
        oa3.d("pause must be called on the main UI thread.");
    }
}
