package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzbr;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.oa3;
import defpackage.vi6;
import defpackage.wi6;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzexo extends zzbr implements com.google.android.gms.ads.internal.overlay.zzad, zzbcz, zzdex {
    public final String A;
    public final zzexi B;
    public final zzeyo C;
    public final zzcgt D;
    public zzcvu F;

    @GuardedBy("this")
    public zzcwj G;
    public final zzcok w;
    public final Context x;
    public final FrameLayout y;
    public AtomicBoolean z = new AtomicBoolean();
    public long E = -1;

    public zzexo(zzcok zzcokVar, Context context, String str, zzexi zzexiVar, zzeyo zzeyoVar, zzcgt zzcgtVar) {
        this.y = new FrameLayout(context);
        this.w = zzcokVar;
        this.x = context;
        this.A = str;
        this.B = zzexiVar;
        this.C = zzeyoVar;
        zzeyoVar.zzn(this);
        this.D = zzcgtVar;
    }

    public final synchronized void L0(int i) {
        if (this.z.compareAndSet(false, true)) {
            zzcwj zzcwjVar = this.G;
            if (zzcwjVar != null && zzcwjVar.zzj() != null) {
                this.C.zzt(zzcwjVar.zzj());
            }
            this.C.zzj();
            this.y.removeAllViews();
            zzcvu zzcvuVar = this.F;
            if (zzcvuVar != null) {
                com.google.android.gms.ads.internal.zzt.zzb().zze(zzcvuVar);
            }
            if (this.G != null) {
                long jC = -1;
                if (this.E != -1) {
                    jC = com.google.android.gms.ads.internal.zzt.zzB().c() - this.E;
                }
                this.G.zzi(jC, i);
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
        this.C.zzr(zzbdiVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.B.zzl(zzwVar);
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
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.B.zza();
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
        if (this.D.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziH)).intValue() || !z) {
            oa3.d("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzq();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.x) && zzlVar.zzs == null) {
            zzcgn.zzg("Failed to load the ad because app ID is missing.");
            this.C.zza(zzfem.zzd(4, null, null));
            return false;
        }
        if (zzY()) {
            return false;
        }
        this.z = new AtomicBoolean();
        return this.B.zzb(zzlVar, this.A, new vi6(), new wi6(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzad
    public final void zzbJ() {
        L0(4);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        oa3.d("getAdSize must be called on the main UI thread.");
        zzcwj zzcwjVar = this.G;
        if (zzcwjVar == null) {
            return null;
        }
        return zzfdr.zza(this.x, Collections.singletonList(zzcwjVar.zzc()));
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zzh() {
        if (this.G == null) {
            return;
        }
        this.E = com.google.android.gms.ads.internal.zzt.zzB().c();
        int iZza = this.G.zza();
        if (iZza <= 0) {
            return;
        }
        zzcvu zzcvuVar = new zzcvu(this.w.zzB(), com.google.android.gms.ads.internal.zzt.zzB());
        this.F = zzcvuVar;
        zzcvuVar.zzd(iZza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzexl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp();
            }
        });
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
        oa3.d("getAdFrame must be called on the main UI thread.");
        return new ObjectWrapper(this.y);
    }

    public final void zzp() {
        com.google.android.gms.ads.internal.client.zzaw.zzb();
        if (zzcgg.zzt()) {
            L0(5);
        } else {
            this.w.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexk
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.L0(5);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.A;
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
        zzcwj zzcwjVar = this.G;
        if (zzcwjVar != null) {
            zzcwjVar.zzV();
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
