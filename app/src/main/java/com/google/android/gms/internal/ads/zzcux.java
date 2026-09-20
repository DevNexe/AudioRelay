package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import defpackage.d7G;
import defpackage.pd6;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcux implements zzdcy, zzdem, zzdds, com.google.android.gms.ads.internal.client.zza, zzddo {
    public final zzfde A;
    public final zzfcs B;
    public final zzfjq C;
    public final zzfdw D;
    public final zzapb E;
    public final zzbjx F;
    public final WeakReference G;
    public final WeakReference H;

    @GuardedBy("this")
    public boolean I;
    public final AtomicBoolean J = new AtomicBoolean();
    public final Context w;
    public final Executor x;
    public final Executor y;
    public final ScheduledExecutorService z;

    public zzcux(Context context, zzfyy zzfyyVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzfde zzfdeVar, zzfcs zzfcsVar, zzfjq zzfjqVar, zzfdw zzfdwVar, View view, zzcmn zzcmnVar, zzapb zzapbVar, zzbjx zzbjxVar) {
        this.w = context;
        this.x = zzfyyVar;
        this.y = executor;
        this.z = scheduledExecutorService;
        this.A = zzfdeVar;
        this.B = zzfcsVar;
        this.C = zzfjqVar;
        this.D = zzfdwVar;
        this.E = zzapbVar;
        this.G = new WeakReference(view);
        this.H = new WeakReference(zzcmnVar);
        this.F = zzbjxVar;
    }

    public final void a() {
        int i;
        String strZzh = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcF)).booleanValue() ? this.E.zzc().zzh(this.w, (View) this.G.get(), null) : null;
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzal)).booleanValue();
        zzfcs zzfcsVar = this.B;
        if ((zBooleanValue && this.A.zzb.zzb.zzg) || !((Boolean) zzbkn.zzh.zze()).booleanValue()) {
            this.D.zza(this.C.zzd(this.A, zzfcsVar, false, strZzh, null, zzfcsVar.zzd));
            return;
        }
        if (((Boolean) zzbkn.zzg.zze()).booleanValue() && ((i = zzfcsVar.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzfyo.zzr((zzfyf) zzfyo.zzo(zzfyf.zzv(zzfyo.zzi(null)), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.z), new d7G(this, strZzh, 14), this.x);
    }

    public final void b(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.G.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            a();
        } else {
            this.z.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuq
                @Override // java.lang.Runnable
                public final void run() {
                    final zzcux zzcuxVar = this.zza;
                    final int i3 = i;
                    final int i4 = i2;
                    zzcuxVar.getClass();
                    zzcuxVar.x.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcus
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcuxVar.b(i3 - 1, i4);
                        }
                    });
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzal)).booleanValue();
        zzfde zzfdeVar = this.A;
        if (!(zBooleanValue && zzfdeVar.zzb.zzb.zzg) && ((Boolean) zzbkn.zzd.zze()).booleanValue()) {
            zzfyo.zzr(zzfyo.zzf(zzfyf.zzv(this.F.zza()), Throwable.class, new zzfru() { // from class: com.google.android.gms.internal.ads.zzcur
                @Override // com.google.android.gms.internal.ads.zzfru
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzcha.zzf), new pd6(this, 5), this.x);
        } else {
            zzfcs zzfcsVar = this.B;
            this.D.zzc(this.C.zzc(zzfdeVar, zzfcsVar, zzfcsVar.zzc), true == com.google.android.gms.ads.internal.zzt.zzp().zzv(this.w) ? 2 : 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzbv() {
        zzfcs zzfcsVar = this.B;
        this.D.zza(this.C.zzc(this.A, zzfcsVar, zzfcsVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.zzddo
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbo)).booleanValue()) {
            int i = zzeVar.zza;
            zzfcs zzfcsVar = this.B;
            this.D.zza(this.C.zzc(this.A, zzfcsVar, zzfjq.zzf(2, i, zzfcsVar.zzp)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdds
    public final void zzl() {
        if (this.J.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcJ)).intValue();
            if (iIntValue > 0) {
                b(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcK)).intValue());
                return;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcI)).booleanValue()) {
                a();
            } else {
                this.y.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcut
                    @Override // java.lang.Runnable
                    public final void run() {
                        final zzcux zzcuxVar = this.zza;
                        zzcuxVar.getClass();
                        zzcuxVar.x.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcuu
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcuxVar.a();
                            }
                        });
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzdem
    public final synchronized void zzn() {
        if (this.I) {
            ArrayList arrayList = new ArrayList(this.B.zzd);
            arrayList.addAll(this.B.zzg);
            this.D.zza(this.C.zzd(this.A, this.B, true, null, null, arrayList));
        } else {
            zzfdw zzfdwVar = this.D;
            zzfjq zzfjqVar = this.C;
            zzfde zzfdeVar = this.A;
            zzfcs zzfcsVar = this.B;
            zzfdwVar.zza(zzfjqVar.zzc(zzfdeVar, zzfcsVar, zzfcsVar.zzn));
            zzfdw zzfdwVar2 = this.D;
            zzfjq zzfjqVar2 = this.C;
            zzfde zzfdeVar2 = this.A;
            zzfcs zzfcsVar2 = this.B;
            zzfdwVar2.zza(zzfjqVar2.zzc(zzfdeVar2, zzfcsVar2, zzfcsVar2.zzg));
        }
        this.I = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzp(zzcbq zzcbqVar, String str, String str2) {
        zzfcs zzfcsVar = this.B;
        this.D.zza(this.C.zze(zzfcsVar, zzfcsVar.zzi, zzcbqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdcy
    public final void zzr() {
        zzfcs zzfcsVar = this.B;
        this.D.zza(this.C.zzc(this.A, zzfcsVar, zzfcsVar.zzh));
    }
}
