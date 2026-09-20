package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.cf6;
import defpackage.cq4;
import defpackage.d7G;
import defpackage.df6;
import defpackage.fj6;
import defpackage.ss3;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdtl {
    public final com.google.android.gms.ads.internal.zza b;
    public final Context c;
    public final zzdxo d;
    public final zzfhz e;
    public final Executor f;
    public final zzapb g;
    public final zzcgt h;
    public final zzefz j;
    public final zzfju k;
    public zzfyx l;
    public final cf6 a = new cf6();
    public final zzbqe i = new zzbqe();

    public zzdtl(zzdti zzdtiVar) {
        this.c = zzdtiVar.x;
        this.f = zzdtiVar.B;
        this.g = zzdtiVar.C;
        this.h = zzdtiVar.D;
        this.b = zzdtiVar.w;
        this.j = zzdtiVar.A;
        this.k = zzdtiVar.E;
        this.d = zzdtiVar.y;
        this.e = zzdtiVar.z;
    }

    public final synchronized zzfyx zzd(final String str, final JSONObject jSONObject) {
        zzfyx zzfyxVar = this.l;
        if (zzfyxVar == null) {
            return zzfyo.zzi(null);
        }
        return zzfyo.zzn(zzfyxVar, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzdsx
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzdtl zzdtlVar = this.zza;
                String str2 = str;
                JSONObject jSONObject2 = jSONObject;
                return zzdtlVar.i.zzb((zzcmn) obj, str2, jSONObject2);
            }
        }, this.f);
    }

    public final synchronized void zze(zzfcs zzfcsVar, zzfcv zzfcvVar) {
        zzfyx zzfyxVar = this.l;
        if (zzfyxVar == null) {
            return;
        }
        zzfyo.zzr(zzfyxVar, new ss3(zzfcsVar, zzfcvVar, 12), this.f);
    }

    public final synchronized void zzf() {
        zzfyx zzfyxVar = this.l;
        if (zzfyxVar == null) {
            return;
        }
        zzfyo.zzr(zzfyxVar, new fj6(6), this.f);
        this.l = null;
    }

    public final synchronized void zzg(String str, Map map) {
        zzfyx zzfyxVar = this.l;
        if (zzfyxVar == null) {
            return;
        }
        zzfyo.zzr(zzfyxVar, new d7G(map), this.f);
    }

    public final synchronized void zzh() {
        final Context context = this.c;
        final zzcgt zzcgtVar = this.h;
        final String str = (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcO);
        final zzapb zzapbVar = this.g;
        final com.google.android.gms.ads.internal.zza zzaVar = this.b;
        zzfyx zzfyxVarZzm = zzfyo.zzm(zzfyo.zzl(new zzfxu() { // from class: com.google.android.gms.internal.ads.zzcmw
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final zzfyx zza() throws zzcmy {
                Context context2 = context;
                zzapb zzapbVar2 = zzapbVar;
                zzcgt zzcgtVar2 = zzcgtVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                String str2 = str;
                com.google.android.gms.ads.internal.zzt.zzA();
                zzcmn zzcmnVarZza = zzcmz.zza(context2, zzcoc.zza(), "", false, false, zzapbVar2, null, zzcgtVar2, null, null, zzaVar2, zzbel.zza(), null, null);
                final zzche zzcheVarZza = zzche.zza(zzcmnVarZza);
                zzcmnVarZza.zzP().zzz(new zzcny() { // from class: com.google.android.gms.internal.ads.zzcmx
                    @Override // com.google.android.gms.internal.ads.zzcny
                    public final void zza(boolean z) {
                        zzcheVarZza.zzb();
                    }
                });
                zzcmnVarZza.loadUrl(str2);
                return zzcheVarZza;
            }
        }, zzcha.zze), new zzfru() { // from class: com.google.android.gms.internal.ads.zzdsy
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                zzdtl zzdtlVar = this.zza;
                zzcmn zzcmnVar = (zzcmn) obj;
                zzcmnVar.zzaf("/result", zzdtlVar.i);
                zzcoa zzcoaVarZzP = zzcmnVar.zzP();
                cf6 cf6Var = zzdtlVar.a;
                zzcoaVarZzP.zzL(null, cf6Var, cf6Var, cf6Var, cf6Var, false, null, new com.google.android.gms.ads.internal.zzb(zzdtlVar.c, null, null), null, null, zzdtlVar.j, zzdtlVar.k, zzdtlVar.d, zzdtlVar.e, null, null, null);
                return zzcmnVar;
            }
        }, this.f);
        this.l = zzfyxVarZzm;
        zzchd.zza(zzfyxVarZzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbpq zzbpqVar) {
        zzfyx zzfyxVar = this.l;
        if (zzfyxVar == null) {
            return;
        }
        zzfyo.zzr(zzfyxVar, new ss3(str, zzbpqVar, 11), this.f);
    }

    public final void zzj(WeakReference weakReference, String str, zzbpq zzbpqVar) {
        zzi(str, new df6(this, weakReference, str, zzbpqVar));
    }

    public final synchronized void zzk(String str, zzbpq zzbpqVar) {
        zzfyx zzfyxVar = this.l;
        if (zzfyxVar == null) {
            return;
        }
        zzfyo.zzr(zzfyxVar, new cq4(str, zzbpqVar, 20, 0), this.f);
    }
}
