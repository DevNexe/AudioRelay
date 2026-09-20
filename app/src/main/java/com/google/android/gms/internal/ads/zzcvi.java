package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.ft;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcvi implements zzbbm, zzddt, com.google.android.gms.ads.internal.overlay.zzo, zzdds {
    public final Executor A;
    public final ft B;
    public final zzcvd w;
    public final zzcve x;
    public final zzbur z;
    public final HashSet y = new HashSet();
    public final AtomicBoolean C = new AtomicBoolean(false);

    @GuardedBy("this")
    public final zzcvh D = new zzcvh();
    public boolean E = false;
    public WeakReference F = new WeakReference(this);

    public zzcvi(zzbuo zzbuoVar, zzcve zzcveVar, Executor executor, zzcvd zzcvdVar, ft ftVar) {
        this.w = zzcvdVar;
        zzbtz zzbtzVar = zzbuc.zza;
        this.z = zzbuoVar.zza("google.afma.activeView.handleUpdate", zzbtzVar, zzbtzVar);
        this.x = zzcveVar;
        this.A = executor;
        this.B = ftVar;
    }

    public final void a() {
        Iterator it = this.y.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            zzcvd zzcvdVar = this.w;
            if (!zHasNext) {
                zzcvdVar.zze();
                return;
            }
            zzcvdVar.zzf((zzcmn) it.next());
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbK() {
        this.D.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final synchronized void zzbq(Context context) {
        this.D.zze = "u";
        zzg();
        a();
        this.E = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbr() {
        this.D.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final synchronized void zzbs(Context context) {
        this.D.zzb = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzddt
    public final synchronized void zzbt(Context context) {
        this.D.zzb = false;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbbm
    public final synchronized void zzc(zzbbl zzbblVar) {
        zzcvh zzcvhVar = this.D;
        zzcvhVar.zza = zzbblVar.zzj;
        zzcvhVar.zzf = zzbblVar;
        zzg();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
    }

    public final synchronized void zzg() {
        if (this.F.get() == null) {
            zzj();
            return;
        }
        if (this.E || !this.C.get()) {
            return;
        }
        try {
            this.D.zzd = this.B.c();
            final JSONObject jSONObjectZza = this.x.zzb(this.D);
            for (final zzcmn zzcmnVar : this.y) {
                this.A.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvg
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcmnVar.zzl("AFMA_updateActiveView", jSONObjectZza);
                    }
                });
            }
            zzchd.zzb(this.z.zzb(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
        }
    }

    public final synchronized void zzh(zzcmn zzcmnVar) {
        this.y.add(zzcmnVar);
        this.w.zzd(zzcmnVar);
    }

    public final void zzi(Object obj) {
        this.F = new WeakReference(obj);
    }

    public final synchronized void zzj() {
        a();
        this.E = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final synchronized void zzl() {
        if (this.C.compareAndSet(false, true)) {
            this.w.zzc(this);
            zzg();
        }
    }
}
