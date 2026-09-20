package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.ag6;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdzq {
    public final Context f;
    public final WeakReference g;
    public final zzdvj h;
    public final Executor i;
    public final Executor j;
    public final ScheduledExecutorService k;
    public final zzdxx l;
    public final zzcgt m;
    public final zzdjp o;
    public final zzfje p;
    public boolean a = false;
    public boolean b = false;
    public boolean c = false;
    public final zzchf e = new zzchf();
    public final ConcurrentHashMap n = new ConcurrentHashMap();
    public boolean q = true;
    public final long d = com.google.android.gms.ads.internal.zzt.zzB().c();

    public zzdzq(Executor executor, Context context, WeakReference weakReference, Executor executor2, zzdvj zzdvjVar, ScheduledExecutorService scheduledExecutorService, zzdxx zzdxxVar, zzcgt zzcgtVar, zzdjp zzdjpVar, zzfje zzfjeVar) {
        this.h = zzdvjVar;
        this.f = context;
        this.g = weakReference;
        this.i = executor2;
        this.k = scheduledExecutorService;
        this.j = executor;
        this.l = zzdxxVar;
        this.m = zzcgtVar;
        this.o = zzdjpVar;
        this.p = zzfjeVar;
        b("com.google.android.gms.ads.MobileAds", 0, "", false);
    }

    public final synchronized zzfyx a() {
        String strZzc = com.google.android.gms.ads.internal.zzt.zzp().zzh().zzh().zzc();
        if (!TextUtils.isEmpty(strZzc)) {
            return zzfyo.zzi(strZzc);
        }
        final zzchf zzchfVar = new zzchf();
        com.google.android.gms.ads.internal.zzt.zzp().zzh().zzq(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzm
            @Override // java.lang.Runnable
            public final void run() {
                final zzdzq zzdzqVar = this.zza;
                final zzchf zzchfVar2 = zzchfVar;
                zzdzqVar.getClass();
                zzdzqVar.i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzchf zzchfVar3 = zzchfVar2;
                        String strZzc2 = com.google.android.gms.ads.internal.zzt.zzp().zzh().zzh().zzc();
                        if (TextUtils.isEmpty(strZzc2)) {
                            zzchfVar3.zze(new Exception());
                        } else {
                            zzchfVar3.zzd(strZzc2);
                        }
                    }
                });
            }
        });
        return zzchfVar;
    }

    public final void b(String str, int i, String str2, boolean z) {
        this.n.put(str, new zzbrl(str, z, i, str2));
    }

    public final List zzg() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.n;
        for (String str : concurrentHashMap.keySet()) {
            zzbrl zzbrlVar = (zzbrl) concurrentHashMap.get(str);
            arrayList.add(new zzbrl(str, zzbrlVar.zzb, zzbrlVar.zzc, zzbrlVar.zzd));
        }
        return arrayList;
    }

    public final void zzl() {
        this.q = false;
    }

    public final void zzr() {
        if (!((Boolean) zzbkt.zza.zze()).booleanValue()) {
            if (this.m.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzby)).intValue() && this.q) {
                if (this.a) {
                    return;
                }
                synchronized (this) {
                    if (this.a) {
                        return;
                    }
                    this.l.zzf();
                    this.o.zzf();
                    this.e.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdzq zzdzqVar = this.zza;
                            zzdzqVar.l.zze();
                            zzdzqVar.o.zze();
                            zzdzqVar.b = true;
                        }
                    }, this.i);
                    this.a = true;
                    zzfyx zzfyxVarA = a();
                    this.k.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzj
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzdzq zzdzqVar = this.zza;
                            synchronized (zzdzqVar) {
                                if (zzdzqVar.c) {
                                    return;
                                }
                                zzdzqVar.b("com.google.android.gms.ads.MobileAds", (int) (com.google.android.gms.ads.internal.zzt.zzB().c() - zzdzqVar.d), "Timeout.", false);
                                zzdzqVar.l.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                                zzdzqVar.o.zzb("com.google.android.gms.ads.MobileAds", "timeout");
                                zzdzqVar.e.zze(new Exception());
                            }
                        }
                    }, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbA)).longValue(), TimeUnit.SECONDS);
                    zzfyo.zzr(zzfyxVarA, new ag6(this), this.i);
                    return;
                }
            }
        }
        if (this.a) {
            return;
        }
        b("com.google.android.gms.ads.MobileAds", 0, "", true);
        this.e.zzd(Boolean.FALSE);
        this.a = true;
        this.b = true;
    }

    public final void zzs(final zzbrs zzbrsVar) {
        this.e.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzk
            @Override // java.lang.Runnable
            public final void run() {
                zzdzq zzdzqVar = this.zza;
                try {
                    zzbrsVar.zzb(zzdzqVar.zzg());
                } catch (RemoteException e) {
                    zzcgn.zzh("", e);
                }
            }
        }, this.j);
    }

    public final boolean zzt() {
        return this.b;
    }
}
