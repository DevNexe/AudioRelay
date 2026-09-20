package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzevc implements zzeun {
    public final Context a;
    public final ScheduledExecutorService b;
    public final Executor c;
    public final int d;
    public final zzcfn e;

    public zzevc(zzcfn zzcfnVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, byte[] bArr) {
        this.e = zzcfnVar;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = executor;
        this.d = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaO)).booleanValue()) {
            return zzfyo.zzh(new Exception("Did not ad Ad ID into query param."));
        }
        zzfyf zzfyfVarZzv = zzfyf.zzv(this.e.zza(this.a, this.d));
        zzeva zzevaVar = new zzfru() { // from class: com.google.android.gms.internal.ads.zzeva
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                info.getClass();
                return new zzevd(info, null);
            }
        };
        Executor executor = this.c;
        return zzfyo.zzf((zzfyf) zzfyo.zzo(zzfyo.zzm(zzfyfVarZzv, zzevaVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzaP)).longValue(), TimeUnit.MILLISECONDS, this.b), Throwable.class, new zzfru() { // from class: com.google.android.gms.internal.ads.zzevb
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                zzevc zzevcVar = this.zza;
                zzevcVar.getClass();
                com.google.android.gms.ads.internal.client.zzaw.zzb();
                ContentResolver contentResolver = zzevcVar.a.getContentResolver();
                return new zzevd(null, contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id"));
            }
        }, executor);
    }
}
