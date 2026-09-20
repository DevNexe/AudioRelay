package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.pd6;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzebv implements zzect {
    public static final Pattern h = Pattern.compile("Received error HTTP response code: (.*)");
    public final zzeaw a;
    public final zzfyy b;
    public final zzfdn c;
    public final ScheduledExecutorService d;
    public final zzeez e;
    public final zzfjc f;
    public final Context g;

    public zzebv(Context context, zzfdn zzfdnVar, zzeaw zzeawVar, zzfyy zzfyyVar, ScheduledExecutorService scheduledExecutorService, zzeez zzeezVar, zzfjc zzfjcVar) {
        this.g = context;
        this.c = zzfdnVar;
        this.a = zzeawVar;
        this.b = zzfyyVar;
        this.d = scheduledExecutorService;
        this.e = zzeezVar;
        this.f = zzfjcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzect
    public final zzfyx zzb(zzcba zzcbaVar) {
        zzfyx zzfyxVarZzb = this.a.zzb(zzcbaVar);
        zzfir zzfirVarZza = zzfiq.zza(this.g, 11);
        zzfjb.zzd(zzfyxVarZzb, zzfirVarZza);
        zzfyx zzfyxVarZzn = zzfyo.zzn(zzfyxVarZzb, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzebs
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzfyo.zzi(new zzfde(new zzfdb(this.zza.c), zzfdd.zza(new InputStreamReader((InputStream) obj))));
            }
        }, this.b);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeA)).booleanValue()) {
            zzfyxVarZzn = zzfyo.zzg(zzfyo.zzo(zzfyxVarZzn, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeB)).intValue(), TimeUnit.SECONDS, this.d), TimeoutException.class, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzebt
                @Override // com.google.android.gms.internal.ads.zzfxv
                public final zzfyx zza(Object obj) {
                    return zzfyo.zzh(new zzeas(5));
                }
            }, zzcha.zzf);
        }
        zzfjb.zza(zzfyxVarZzn, this.f, zzfirVarZza);
        zzfyo.zzr(zzfyxVarZzn, new pd6(this, 8), zzcha.zzf);
        return zzfyxVarZzn;
    }
}
