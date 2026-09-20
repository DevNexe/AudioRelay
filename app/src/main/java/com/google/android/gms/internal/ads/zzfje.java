package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import defpackage.oa1;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfje implements Runnable {
    public static Boolean zza;
    public int A;
    public final zzdvg B;
    public final zzcbm D;
    public final Context w;
    public final zzcgt x;
    public String z;
    public final zzfjj y = zzfjm.zzc();
    public boolean C = false;

    public zzfje(Context context, zzcgt zzcgtVar, zzdvg zzdvgVar, zzeea zzeeaVar, zzcbm zzcbmVar, byte[] bArr) {
        this.w = context;
        this.x = zzcgtVar;
        this.B = zzdvgVar;
        this.D = zzcbmVar;
    }

    public static synchronized boolean zza() {
        if (zza == null) {
            if (((Boolean) zzbkh.zzb.zze()).booleanValue()) {
                zza = Boolean.valueOf(Math.random() < ((Double) zzbkh.zza.zze()).doubleValue());
            } else {
                zza = Boolean.FALSE;
            }
        }
        return zza.booleanValue();
    }

    public final synchronized void a() {
        if (this.C) {
            return;
        }
        this.C = true;
        if (zza()) {
            com.google.android.gms.ads.internal.zzt.zzq();
            this.z = com.google.android.gms.ads.internal.util.zzs.zzo(this.w);
            oa1 oa1Var = oa1.b;
            Context context = this.w;
            oa1Var.getClass();
            this.A = oa1.a(context);
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhs)).intValue();
            zzcha.zzd.scheduleAtFixedRate(this, jIntValue, jIntValue, TimeUnit.MILLISECONDS);
        }
    }

    public final synchronized void b() {
        try {
            new zzedz(this.w, this.x.zza, this.D, Binder.getCallingUid(), null).zza(new zzedx((String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhr), 60000, new HashMap(), ((zzfjm) this.y.zzal()).zzaw(), "application/x-protobuf"));
            this.y.zzc();
        } catch (Exception e) {
            if ((e instanceof zzeas) && ((zzeas) e).zza() == 3) {
                this.y.zzc();
            } else {
                com.google.android.gms.ads.internal.zzt.zzp().zzs(e, "CuiMonitor.sendCuiPing");
            }
        }
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        if (zza()) {
            if (this.y.zza() == 0) {
                return;
            }
            b();
        }
    }

    public final synchronized void zzb(zzfiv zzfivVar) {
        if (!this.C) {
            a();
        }
        if (zza()) {
            if (zzfivVar == null) {
                return;
            }
            if (this.y.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzht)).intValue()) {
                return;
            }
            zzfjj zzfjjVar = this.y;
            zzfjk zzfjkVarZza = zzfjl.zza();
            zzfjg zzfjgVarZza = zzfjh.zza();
            zzfjgVarZza.zzo(zzfivVar.zzh());
            zzfjgVarZza.zzl(zzfivVar.zzg());
            zzfjgVarZza.zze(zzfivVar.zzb());
            zzfjgVarZza.zzq(3);
            zzfjgVarZza.zzk(this.x.zza);
            zzfjgVarZza.zza(this.z);
            zzfjgVarZza.zzi(Build.VERSION.RELEASE);
            zzfjgVarZza.zzm(Build.VERSION.SDK_INT);
            zzfjgVarZza.zzp(zzfivVar.zzj());
            zzfjgVarZza.zzh(zzfivVar.zza());
            zzfjgVarZza.zzc(this.A);
            zzfjgVarZza.zzn(zzfivVar.zzi());
            zzfjgVarZza.zzb(zzfivVar.zzc());
            zzfjgVarZza.zzd(zzfivVar.zzd());
            zzfjgVarZza.zzf(zzfivVar.zze());
            zzfjgVarZza.zzg(this.B.zzc(zzfivVar.zze()));
            zzfjgVarZza.zzj(zzfivVar.zzf());
            zzfjkVarZza.zza(zzfjgVarZza);
            zzfjjVar.zzb(zzfjkVarZza);
        }
    }
}
