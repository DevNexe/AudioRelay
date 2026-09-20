package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.a90;
import defpackage.kc7;
import defpackage.w05;
import defpackage.z05;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmf {
    public static volatile int e = 1;
    public static final /* synthetic */ int zza = 0;
    public final Context a;
    public final Executor b;
    public final w05 c;
    public final boolean d;

    public zzfmf(Context context, Executor executor, kc7 kc7Var, boolean z) {
        this.a = context;
        this.b = executor;
        this.c = kc7Var;
        this.d = z;
    }

    public static zzfmf zza(final Context context, Executor executor, boolean z) {
        final z05 z05Var = new z05();
        if (z) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmb
                @Override // java.lang.Runnable
                public final void run() {
                    z05Var.a(zzfoh.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfmc
                @Override // java.lang.Runnable
                public final void run() {
                    z05Var.a(zzfoh.zzc());
                }
            });
        }
        return new zzfmf(context, executor, z05Var.a, z);
    }

    public final w05 a(final int i, long j, Exception exc, String str, String str2) {
        if (!this.d) {
            return this.c.f(this.b, new a90() { // from class: com.google.android.gms.internal.ads.zzfmd
                @Override // defpackage.a90
                public final Object then(w05 w05Var) {
                    return Boolean.valueOf(w05Var.n());
                }
            });
        }
        final zzalt zzaltVarZza = zzalx.zza();
        zzaltVarZza.zza(this.a.getPackageName());
        zzaltVarZza.zze(j);
        zzaltVarZza.zzg(e);
        if (exc != null) {
            zzaltVarZza.zzf(zzfsw.zza(exc));
            zzaltVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzaltVarZza.zzb(str2);
        }
        if (str != null) {
            zzaltVarZza.zzc(str);
        }
        return this.c.f(this.b, new a90() { // from class: com.google.android.gms.internal.ads.zzfme
            @Override // defpackage.a90
            public final Object then(w05 w05Var) {
                zzalt zzaltVar = zzaltVarZza;
                int i2 = i;
                if (!w05Var.n()) {
                    return Boolean.FALSE;
                }
                zzfog zzfogVarZza = ((zzfoh) w05Var.k()).zza(((zzalx) zzaltVar.zzal()).zzaw());
                zzfogVarZza.zza(i2);
                zzfogVarZza.zzc();
                return Boolean.TRUE;
            }
        });
    }

    public final w05 zzb(int i, String str) {
        return a(i, 0L, null, null, str);
    }

    public final w05 zzc(int i, long j, Exception exc) {
        return a(i, j, exc, null, null);
    }

    public final w05 zzd(int i, long j) {
        return a(i, j, null, null, null);
    }

    public final w05 zze(int i, long j, String str) {
        return a(i, j, null, null, str);
    }

    public final w05 zzf(int i, long j, String str, Map map) {
        return a(i, j, null, str, null);
    }
}
