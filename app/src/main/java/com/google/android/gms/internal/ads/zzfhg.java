package com.google.android.gms.internal.ads;

import defpackage.ss3;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfhg {
    public final Object a;
    public final String b;
    public final zzfyx c;
    public final List d;
    public final zzfyx e;
    public final /* synthetic */ zzfhh f;

    public /* synthetic */ zzfhg(zzfhh zzfhhVar, Object obj, zzfyx zzfyxVar, List list, zzfyx zzfyxVar2) {
        this(zzfhhVar, obj, null, zzfyxVar, list, zzfyxVar2);
    }

    public zzfhg(zzfhh zzfhhVar, Object obj, String str, zzfyx zzfyxVar, List list, zzfyx zzfyxVar2) {
        this.f = zzfhhVar;
        this.a = obj;
        this.b = str;
        this.c = zzfyxVar;
        this.d = list;
        this.e = zzfyxVar2;
    }

    public final zzfgu zza() {
        zzfhh zzfhhVar = this.f;
        Object obj = this.a;
        String strA = this.b;
        if (strA == null) {
            strA = zzfhhVar.a(obj);
        }
        final zzfgu zzfguVar = new zzfgu(obj, strA, this.e);
        zzfhhVar.c.zza(zzfguVar);
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzfha
            @Override // java.lang.Runnable
            public final void run() {
                zzfhg zzfhgVar = this.zza;
                zzfhgVar.f.c.zzc(zzfguVar);
            }
        };
        zzfyy zzfyyVar = zzcha.zzf;
        this.c.zzc(runnable, zzfyyVar);
        zzfyo.zzr(zzfguVar, new ss3(this, zzfguVar, 13, 0), zzfyyVar);
        return zzfguVar;
    }

    public final zzfhg zzb(Object obj) {
        return this.f.zzb(obj, zza());
    }

    public final zzfhg zzc(Class cls, zzfxv zzfxvVar) {
        Object obj = this.a;
        String str = this.b;
        zzfyx zzfyxVar = this.c;
        List list = this.d;
        zzfhh zzfhhVar = this.f;
        return new zzfhg(zzfhhVar, obj, str, zzfyxVar, list, zzfyo.zzg(this.e, cls, zzfxvVar, zzfhhVar.a));
    }

    public final zzfhg zzd(final zzfyx zzfyxVar) {
        return zzg(new zzfxv() { // from class: com.google.android.gms.internal.ads.zzfhb
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzfyxVar;
            }
        }, zzcha.zzf);
    }

    public final zzfhg zze(final zzfgs zzfgsVar) {
        return zzf(new zzfxv() { // from class: com.google.android.gms.internal.ads.zzfhd
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzfyo.zzi(zzfgsVar.zza(obj));
            }
        });
    }

    public final zzfhg zzf(zzfxv zzfxvVar) {
        return zzg(zzfxvVar, this.f.a);
    }

    public final zzfhg zzg(zzfxv zzfxvVar, Executor executor) {
        return new zzfhg(this.f, this.a, this.b, this.c, this.d, zzfyo.zzn(this.e, zzfxvVar, executor));
    }

    public final zzfhg zzh(String str) {
        return new zzfhg(this.f, this.a, str, this.c, this.d, this.e);
    }

    public final zzfhg zzi(long j, TimeUnit timeUnit) {
        Object obj = this.a;
        String str = this.b;
        zzfyx zzfyxVar = this.c;
        List list = this.d;
        zzfhh zzfhhVar = this.f;
        return new zzfhg(zzfhhVar, obj, str, zzfyxVar, list, zzfyo.zzo(this.e, j, timeUnit, zzfhhVar.b));
    }
}
