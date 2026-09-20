package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeaw {
    public final zzfyy a;
    public final zzfyy b;
    public final zzecd c;
    public final zzgul d;

    public zzeaw(zzfyy zzfyyVar, zzfyy zzfyyVar2, zzecd zzecdVar, zzgul zzgulVar) {
        this.a = zzfyyVar;
        this.b = zzfyyVar2;
        this.c = zzecdVar;
        this.d = zzgulVar;
    }

    public final zzfyx zzb(final zzcba zzcbaVar) {
        zzfyx zzfyxVarZzg;
        String str = zzcbaVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzq();
        boolean zZzy = com.google.android.gms.ads.internal.util.zzs.zzy(str);
        zzfyy zzfyyVar = this.b;
        if (zZzy) {
            zzfyxVarZzg = zzfyo.zzh(new zzecu(1));
        } else {
            zzfyxVarZzg = zzfyo.zzg(this.a.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeat
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzchf zzchfVar;
                    zzeaw zzeawVar = this.zza;
                    zzcba zzcbaVar2 = zzcbaVar;
                    final zzecd zzecdVar = zzeawVar.c;
                    synchronized (zzecdVar.b) {
                        if (zzecdVar.c) {
                            zzchfVar = zzecdVar.a;
                        } else {
                            zzecdVar.c = true;
                            zzecdVar.e = zzcbaVar2;
                            zzecdVar.f.checkAvailabilityAndConnect();
                            zzecdVar.a.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzecc
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzecdVar.a();
                                }
                            }, zzcha.zzf);
                            zzchfVar = zzecdVar.a;
                        }
                    }
                    return (InputStream) zzchfVar.get(((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeB)).intValue(), TimeUnit.SECONDS);
                }
            }), ExecutionException.class, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzeau
                @Override // com.google.android.gms.internal.ads.zzfxv
                public final zzfyx zza(Object obj) {
                    return zzfyo.zzh(((ExecutionException) obj).getCause());
                }
            }, zzfyyVar);
        }
        final int callingUid = Binder.getCallingUid();
        return zzfyo.zzg(zzfyxVarZzg, zzecu.class, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzeav
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzeaw zzeawVar = this.zza;
                return ((zzedv) zzeawVar.d.zzb()).zzc(zzcbaVar, callingUid);
            }
        }, zzfyyVar);
    }
}
