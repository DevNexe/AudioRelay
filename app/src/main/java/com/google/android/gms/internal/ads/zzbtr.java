package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.va5;
import defpackage.x56;
import defpackage.xi5;
import defpackage.y56;
import defpackage.z56;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzbtr {
    public final Context b;
    public final String c;
    public final zzcgt d;
    public final zzfje e;
    public final com.google.android.gms.ads.internal.util.zzbb f;
    public final com.google.android.gms.ads.internal.util.zzbb g;
    public zzbtq h;
    public final Object a = new Object();
    public int i = 1;

    public zzbtr(Context context, zzcgt zzcgtVar, String str, com.google.android.gms.ads.internal.util.zzbb zzbbVar, com.google.android.gms.ads.internal.util.zzbb zzbbVar2, zzfje zzfjeVar) {
        this.c = str;
        this.b = context.getApplicationContext();
        this.d = zzcgtVar;
        this.e = zzfjeVar;
        this.f = zzbbVar;
        this.g = zzbbVar2;
    }

    public final zzbtq a() {
        zzfir zzfirVarZza = zzfiq.zza(this.b, 6);
        zzfirVarZza.zzf();
        final zzbtq zzbtqVar = new zzbtq(this.g);
        final zzapb zzapbVar = null;
        zzcha.zze.execute(new Runnable(zzapbVar, zzbtqVar) { // from class: com.google.android.gms.internal.ads.zzbsy
            public final /* synthetic */ zzbtq zzb;

            {
                this.zzb = zzbtqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzbtr zzbtrVar = this.zza;
                zzbtq zzbtqVar2 = this.zzb;
                zzbtrVar.getClass();
                try {
                    zzbsu zzbsuVar = new zzbsu(zzbtrVar.b, zzbtrVar.d, null, null);
                    zzbsuVar.zzk(new zzbta(zzbtrVar, zzbtqVar2, zzbsuVar));
                    zzbsuVar.zzq("/jsLoaded", new x56(zzbtrVar, zzbtqVar2, zzbsuVar));
                    com.google.android.gms.ads.internal.util.zzca zzcaVar = new com.google.android.gms.ads.internal.util.zzca();
                    y56 y56Var = new y56(zzbtrVar, zzbsuVar, zzcaVar);
                    zzcaVar.zzb(y56Var);
                    zzbsuVar.zzq("/requestReload", y56Var);
                    String str = zzbtrVar.c;
                    if (str.endsWith(".js")) {
                        zzbsuVar.zzh(str);
                    } else if (str.startsWith("<html>")) {
                        zzbsuVar.zzf(str);
                    } else {
                        zzbsuVar.zzg(str);
                    }
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new z56(zzbtrVar, zzbtqVar2, zzbsuVar), 60000L);
                } catch (Throwable th) {
                    zzcgn.zzh("Error creating webview.", th);
                    com.google.android.gms.ads.internal.zzt.zzp().zzt(th, "SdkJavascriptFactory.loadJavascriptEngine");
                    zzbtqVar2.zzg();
                }
            }
        });
        zzbtqVar.zzi(new va5(this, zzbtqVar, zzfirVarZza), new xi5(this, zzbtqVar, zzfirVarZza));
        return zzbtqVar;
    }

    public final zzbtl zzb(zzapb zzapbVar) {
        synchronized (this.a) {
            synchronized (this.a) {
                zzbtq zzbtqVar = this.h;
                if (zzbtqVar != null && this.i == 0) {
                    zzbtqVar.zzi(new zzchj() { // from class: com.google.android.gms.internal.ads.zzbsw
                        @Override // com.google.android.gms.internal.ads.zzchj
                        public final void zza(Object obj) {
                            zzbtr zzbtrVar = this.zza;
                            zzbtrVar.getClass();
                            if (((zzbsm) obj).zzi()) {
                                zzbtrVar.i = 1;
                            }
                        }
                    }, new zzchh() { // from class: com.google.android.gms.internal.ads.zzbsx
                        @Override // com.google.android.gms.internal.ads.zzchh
                        /* JADX INFO: renamed from: zza */
                        public final void mo43zza() {
                        }
                    });
                }
            }
            zzbtq zzbtqVar2 = this.h;
            if (zzbtqVar2 != null && zzbtqVar2.zze() != -1) {
                int i = this.i;
                if (i == 0) {
                    return this.h.zza();
                }
                if (i != 1) {
                    return this.h.zza();
                }
                this.i = 2;
                a();
                return this.h.zza();
            }
            this.i = 2;
            zzbtq zzbtqVarA = a();
            this.h = zzbtqVarA;
            return zzbtqVarA.zza();
        }
    }
}
