package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaji;
import com.google.android.gms.internal.ads.zzakd;
import com.google.android.gms.internal.ads.zzalh;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcgm;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzchf;
import com.google.android.gms.internal.ads.zzfyx;
import defpackage.i46;
import defpackage.k46;
import defpackage.su4;
import defpackage.v46;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes.dex */
@ParametersAreNonnullByDefault
public final class zzbo {
    public static zzakd a;
    public static final Object b = new Object();

    @Deprecated
    public static final zzbj zza = new su4();

    public zzbo(Context context) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        synchronized (b) {
            if (a == null) {
                zzbiy.zzc(context);
                a = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdz)).booleanValue() ? zzax.zzb(context) : zzalh.zza(context, null);
            }
        }
    }

    public final zzfyx zza(String str) {
        zzchf zzchfVar = new zzchf();
        a.zza(new zzbn(str, null, zzchfVar));
        return zzchfVar;
    }

    public final zzfyx zzb(int i, String str, Map map, byte[] bArr) {
        v46 v46Var = new v46();
        i46 i46Var = new i46(str, v46Var);
        byte[] bArr2 = null;
        zzcgm zzcgmVar = new zzcgm(null);
        k46 k46Var = new k46(i, str, v46Var, i46Var, bArr, map, zzcgmVar);
        if (zzcgm.zzl()) {
            try {
                Map mapZzl = k46Var.zzl();
                if (bArr != null) {
                    bArr2 = bArr;
                }
                zzcgmVar.zzd(str, "GET", mapZzl, bArr2);
            } catch (zzaji e) {
                zzcgn.zzj(e.getMessage());
            }
        }
        a.zza(k46Var);
        return v46Var;
    }
}
