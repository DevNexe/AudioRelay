package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import defpackage.pd6;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzduv {
    public final zzdcw a;
    public final zzdkj b;
    public final zzdef c;
    public final zzdes d;
    public final zzdfe e;
    public final zzdhr f;
    public final Executor g;
    public final zzdkg h;
    public final zzcvi i;
    public final com.google.android.gms.ads.internal.zzb j;
    public final zzcdo k;
    public final zzapb l;
    public final zzdhi m;
    public final zzefz n;
    public final zzfju o;
    public final zzdxo p;
    public final zzfhz q;

    public zzduv(zzdcw zzdcwVar, zzdef zzdefVar, zzdes zzdesVar, zzdfe zzdfeVar, zzdhr zzdhrVar, Executor executor, zzdkg zzdkgVar, zzcvi zzcviVar, com.google.android.gms.ads.internal.zzb zzbVar, zzcdo zzcdoVar, zzapb zzapbVar, zzdhi zzdhiVar, zzefz zzefzVar, zzfju zzfjuVar, zzdxo zzdxoVar, zzfhz zzfhzVar, zzdkj zzdkjVar) {
        this.a = zzdcwVar;
        this.c = zzdefVar;
        this.d = zzdesVar;
        this.e = zzdfeVar;
        this.f = zzdhrVar;
        this.g = executor;
        this.h = zzdkgVar;
        this.i = zzcviVar;
        this.j = zzbVar;
        this.k = zzcdoVar;
        this.l = zzapbVar;
        this.m = zzdhiVar;
        this.n = zzefzVar;
        this.o = zzfjuVar;
        this.p = zzdxoVar;
        this.q = zzfhzVar;
        this.b = zzdkjVar;
    }

    public static final zzfyx zzj(zzcmn zzcmnVar, String str, String str2) {
        final zzchf zzchfVar = new zzchf();
        zzcmnVar.zzP().zzz(new zzcny() { // from class: com.google.android.gms.internal.ads.zzdut
            @Override // com.google.android.gms.internal.ads.zzcny
            public final void zza(boolean z) {
                zzchf zzchfVar2 = zzchfVar;
                if (z) {
                    zzchfVar2.zzd(null);
                } else {
                    zzchfVar2.zze(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zzcmnVar.zzad(str, str2, null);
        return zzchfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzi(final zzcmn zzcmnVar, boolean z, zzbpt zzbptVar) {
        zzaox zzaoxVarZzc;
        zzcmnVar.zzP().zzL(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdum
            @Override // com.google.android.gms.ads.internal.client.zza
            public final void onAdClicked() {
                this.zza.a.onAdClicked();
            }
        }, this.d, this.e, new zzbon() { // from class: com.google.android.gms.internal.ads.zzdun
            @Override // com.google.android.gms.internal.ads.zzbon
            public final void zzbD(String str, String str2) {
                this.zza.f.zzbD(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzz() { // from class: com.google.android.gms.internal.ads.zzduo
            @Override // com.google.android.gms.ads.internal.overlay.zzz
            public final void zzg() {
                this.zza.c.zzb();
            }
        }, z, zzbptVar, this.j, new pd6(this, 7), this.k, this.n, this.o, this.p, this.q, null, this.b, null);
        zzcmnVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdup
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.j.zza();
                if (view == null) {
                    return false;
                }
                view.performClick();
                return false;
            }
        });
        zzcmnVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzduq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.zza.j.zza();
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcf)).booleanValue() && (zzaoxVarZzc = this.l.zzc()) != null) {
            zzaoxVarZzc.zzn((View) zzcmnVar);
        }
        zzdkg zzdkgVar = this.h;
        Executor executor = this.g;
        zzdkgVar.zzj(zzcmnVar, executor);
        zzdkgVar.zzj(new zzbbm() { // from class: com.google.android.gms.internal.ads.zzdur
            @Override // com.google.android.gms.internal.ads.zzbbm
            public final void zzc(zzbbl zzbblVar) {
                zzcoa zzcoaVarZzP = zzcmnVar.zzP();
                Rect rect = zzbblVar.zzd;
                zzcoaVarZzP.zzo(rect.left, rect.top, false);
            }
        }, executor);
        zzdkgVar.zza((View) zzcmnVar);
        zzcmnVar.zzaf("/trackActiveViewUnit", new zzbpq() { // from class: com.google.android.gms.internal.ads.zzdus
            @Override // com.google.android.gms.internal.ads.zzbpq
            public final void zza(Object obj, Map map) {
                zzduv zzduvVar = this.zza;
                zzduvVar.i.zzh(zzcmnVar);
            }
        });
        this.i.zzi(zzcmnVar);
    }
}
