package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import defpackage.p56;
import defpackage.pz5;
import defpackage.q56;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbrk implements zzajt {
    public volatile zzbqx a;
    public final Context b;

    public zzbrk(Context context) {
        this.b = context;
    }

    @Override // com.google.android.gms.internal.ads.zzajt
    public final zzajw zza(zzaka zzakaVar) {
        Parcelable.Creator<zzbqy> creator = zzbqy.CREATOR;
        Map mapZzl = zzakaVar.zzl();
        int size = mapZzl.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : mapZzl.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzbqy zzbqyVar = new zzbqy(zzakaVar.zzk(), strArr, strArr2);
        long jC = com.google.android.gms.ads.internal.zzt.zzB().c();
        try {
            zzchf zzchfVar = new zzchf();
            this.a = new zzbqx(this.b, com.google.android.gms.ads.internal.zzt.zzu().zzb(), new p56(this, zzchfVar), new q56(zzchfVar));
            this.a.checkAvailabilityAndConnect();
            QnHx qnHx = new QnHx(zzbqyVar);
            zzfyy zzfyyVar = zzcha.zza;
            zzfyx zzfyxVarZzo = zzfyo.zzo(zzfyo.zzn(zzchfVar, qnHx, zzfyyVar), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdB)).intValue(), TimeUnit.MILLISECONDS, zzcha.zzd);
            zzfyxVarZzo.zzc(new pz5(this, 4), zzfyyVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) zzfyxVarZzo.get();
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().c() - jC) + "ms");
            zzbra zzbraVar = (zzbra) new zzcay(parcelFileDescriptor).zza(zzbra.CREATOR);
            if (zzbraVar == null) {
                return null;
            }
            if (zzbraVar.zza) {
                throw new zzakj(zzbraVar.zzb);
            }
            if (zzbraVar.zze.length != zzbraVar.zzf.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = zzbraVar.zze;
                if (i >= strArr3.length) {
                    return new zzajw(zzbraVar.zzc, zzbraVar.zzd, map, zzbraVar.zzg, zzbraVar.zzh);
                }
                map.put(strArr3[i], zzbraVar.zzf[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().c() - jC) + "ms");
            return null;
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zze.zza("Http assets remote cache took " + (com.google.android.gms.ads.internal.zzt.zzB().c() - jC) + "ms");
            throw th;
        }
    }
}
