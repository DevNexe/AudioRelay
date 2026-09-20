package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.util.zzg;
import defpackage.h86;
import defpackage.i86;
import defpackage.j86;
import defpackage.so5;
import defpackage.x53;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzcfw {
    public final Object a = new Object();
    public final com.google.android.gms.ads.internal.util.zzj b;
    public final zzcga c;
    public boolean d;
    public Context e;
    public zzcgt f;
    public zzbjd g;
    public Boolean h;
    public final AtomicInteger i;
    public final j86 j;
    public final Object k;
    public zzfyx l;
    public final AtomicBoolean m;

    public zzcfw() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.b = zzjVar;
        this.c = new zzcga(com.google.android.gms.ads.internal.client.zzaw.zzd(), zzjVar);
        this.d = false;
        this.g = null;
        this.h = null;
        this.i = new AtomicInteger(0);
        this.j = new j86();
        this.k = new Object();
        this.m = new AtomicBoolean();
    }

    public final int zza() {
        return this.i.get();
    }

    public final Context zzc() {
        return this.e;
    }

    public final Resources zzd() {
        if (this.f.zzd) {
            return this.e.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzis)).booleanValue()) {
                return zzcgr.zza(this.e).getResources();
            }
            zzcgr.zza(this.e).getResources();
            return null;
        } catch (zzcgq e) {
            zzcgn.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final zzbjd zzf() {
        zzbjd zzbjdVar;
        synchronized (this.a) {
            zzbjdVar = this.g;
        }
        return zzbjdVar;
    }

    public final zzcga zzg() {
        return this.c;
    }

    public final zzg zzh() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.a) {
            zzjVar = this.b;
        }
        return zzjVar;
    }

    public final zzfyx zzj() {
        if (this.e != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzcj)).booleanValue()) {
                synchronized (this.k) {
                    zzfyx zzfyxVar = this.l;
                    if (zzfyxVar != null) {
                        return zzfyxVar;
                    }
                    zzfyx zzfyxVarZzb = zzcha.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzcfr
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            Context contextZza = zzcbo.zza(this.zza.e);
                            ArrayList arrayList = new ArrayList();
                            try {
                                PackageInfo packageInfoB = so5.a(contextZza).b(4096, contextZza.getApplicationInfo().packageName);
                                if (packageInfoB.requestedPermissions != null && packageInfoB.requestedPermissionsFlags != null) {
                                    int i = 0;
                                    while (true) {
                                        String[] strArr = packageInfoB.requestedPermissions;
                                        if (i >= strArr.length) {
                                            break;
                                        }
                                        if ((packageInfoB.requestedPermissionsFlags[i] & 2) != 0) {
                                            arrayList.add(strArr[i]);
                                        }
                                        i++;
                                    }
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                            return arrayList;
                        }
                    });
                    this.l = zzfyxVarZzb;
                    return zzfyxVarZzb;
                }
            }
        }
        return zzfyo.zzi(new ArrayList());
    }

    public final Boolean zzk() {
        Boolean bool;
        synchronized (this.a) {
            bool = this.h;
        }
        return bool;
    }

    public final void zzo() {
        j86 j86Var = this.j;
        j86Var.getClass();
        long jB = com.google.android.gms.ads.internal.zzt.zzB().b();
        synchronized (j86Var.a) {
            if (j86Var.c == 3) {
                if (j86Var.b + ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeX)).longValue() <= jB) {
                    j86Var.c = 1;
                }
            }
        }
        long jB2 = com.google.android.gms.ads.internal.zzt.zzB().b();
        synchronized (j86Var.a) {
            if (j86Var.c != 2) {
                return;
            }
            j86Var.c = 3;
            if (j86Var.c == 3) {
                j86Var.b = jB2;
            }
        }
    }

    public final void zzp() {
        this.i.decrementAndGet();
    }

    public final void zzq() {
        this.i.incrementAndGet();
    }

    @TargetApi(23)
    public final void zzr(Context context, zzcgt zzcgtVar) {
        zzbjd zzbjdVar;
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.e = context.getApplicationContext();
                    this.f = zzcgtVar;
                    com.google.android.gms.ads.internal.zzt.zzb().zzc(this.c);
                    this.b.zzr(this.e);
                    zzcad.zzb(this.e, this.f);
                    com.google.android.gms.ads.internal.zzt.zze();
                    if (((Boolean) zzbki.zzc.zze()).booleanValue()) {
                        zzbjdVar = new zzbjd();
                    } else {
                        com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbjdVar = null;
                    }
                    this.g = zzbjdVar;
                    if (zzbjdVar != null) {
                        zzchd.zza(new h86(this).zzb(), "AppState.registerCsiReporter");
                    }
                    if (x53.a()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhg)).booleanValue()) {
                            ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new i86(this));
                        }
                    }
                    this.d = true;
                    zzj();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzq().zzc(context, zzcgtVar.zza);
    }

    public final void zzs(Throwable th, String str) {
        zzcad.zzb(this.e, this.f).zze(th, str, ((Double) zzbkw.zzg.zze()).floatValue());
    }

    public final void zzt(Throwable th, String str) {
        zzcad.zzb(this.e, this.f).zzd(th, str);
    }

    public final void zzu(Boolean bool) {
        synchronized (this.a) {
            this.h = bool;
        }
    }

    public final boolean zzv(Context context) {
        if (x53.a()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhg)).booleanValue()) {
                return this.m.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
