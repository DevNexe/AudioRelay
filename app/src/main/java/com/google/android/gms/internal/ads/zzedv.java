package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import defpackage.gh1;
import defpackage.pd6;
import defpackage.sg6;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzedv extends zzcar {
    public final zzctr A;

    @GuardedBy("this")
    public final ArrayDeque B;
    public final zzfje C;
    public final zzcbm D;
    public final Context w;
    public final Executor x;
    public final zzfyy y;
    public final zzcbl z;

    public zzedv(Context context, Executor executor, zzfyy zzfyyVar, zzcbm zzcbmVar, zzctr zzctrVar, zzcbl zzcblVar, ArrayDeque arrayDeque, zzeea zzeeaVar, zzfje zzfjeVar, byte[] bArr) {
        zzbiy.zzc(context);
        this.w = context;
        this.x = executor;
        this.y = zzfyyVar;
        this.D = zzcbmVar;
        this.z = zzcblVar;
        this.A = zzctrVar;
        this.B = arrayDeque;
        this.C = zzfjeVar;
    }

    public static zzfgu N0(zzfgu zzfguVar, zzfhp zzfhpVar, zzbuf zzbufVar, zzfjc zzfjcVar, zzfir zzfirVar) {
        zzbtv zzbtvVarZza = zzbufVar.zza("AFMA_getAdDictionary", zzbuc.zza, new zzbtx() { // from class: com.google.android.gms.internal.ads.zzedm
            @Override // com.google.android.gms.internal.ads.zzbtx
            public final Object zza(JSONObject jSONObject) {
                return new zzcbd(jSONObject);
            }
        });
        zzfjb.zzd(zzfguVar, zzfirVar);
        zzfgu zzfguVarZza = zzfhpVar.zzb(zzfhj.BUILD_URL, zzfguVar).zzf(zzbtvVarZza).zza();
        zzfjb.zzc(zzfguVarZza, zzfjcVar, zzfirVar);
        return zzfguVarZza;
    }

    public static zzfgu O0(zzcba zzcbaVar, zzfhp zzfhpVar, final zzevf zzevfVar) {
        zzfxv zzfxvVar = new zzfxv() { // from class: com.google.android.gms.internal.ads.zzedg
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzevfVar.zzb().zza(com.google.android.gms.ads.internal.client.zzaw.zzb().zzh((Bundle) obj));
            }
        };
        return zzfhpVar.zzb(zzfhj.GMS_SIGNALS, zzfyo.zzi(zzcbaVar.zza)).zzf(zzfxvVar).zze(new zzfgs() { // from class: com.google.android.gms.internal.ads.zzedh
            @Override // com.google.android.gms.internal.ads.zzfgs
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    public final synchronized zzeds L0(String str) {
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            zzeds zzedsVar = (zzeds) it.next();
            if (zzedsVar.zzd.equals(str)) {
                it.remove();
                return zzedsVar;
            }
        }
        return null;
    }

    public final synchronized zzeds M0(String str) {
        Iterator it = this.B.iterator();
        while (it.hasNext()) {
            zzeds zzedsVar = (zzeds) it.next();
            if (zzedsVar.zzc.equals(str)) {
                it.remove();
                return zzedsVar;
            }
        }
        return null;
    }

    public final void P0(zzfyx zzfyxVar, zzcaw zzcawVar) {
        zzfyo.zzr(zzfyo.zzn(zzfyxVar, new zzfxv() { // from class: com.google.android.gms.internal.ads.zzedp
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) throws IOException {
                final InputStream inputStream = (InputStream) obj;
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
                final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
                zzcha.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfel
                    @Override // java.lang.Runnable
                    public final void run() throws IllegalAccessException, InvocationTargetException {
                        InputStream inputStream2 = inputStream;
                        try {
                            try {
                                ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                                try {
                                    gh1.b(inputStream2, autoCloseOutputStream, false);
                                    autoCloseOutputStream.close();
                                    inputStream2.close();
                                } catch (Throwable th) {
                                    try {
                                        autoCloseOutputStream.close();
                                    } catch (Throwable th2) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (Throwable th4) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                    }
                                }
                                throw th3;
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
                return zzfyo.zzi(parcelFileDescriptor);
            }
        }, zzcha.zza), new pd6(9, zzcawVar), zzcha.zzf);
    }

    public final zzfyx zzb(final zzcba zzcbaVar, int i) {
        if (!((Boolean) zzbku.zza.zze()).booleanValue()) {
            return zzfyo.zzh(new Exception("Split request is disabled."));
        }
        zzfff zzfffVar = zzcbaVar.zzi;
        if (zzfffVar == null) {
            return zzfyo.zzh(new Exception("Pool configuration missing from request."));
        }
        if (zzfffVar.zzc == 0 || zzfffVar.zzd == 0) {
            return zzfyo.zzh(new Exception("Caching is disabled."));
        }
        zzbtw zzbtwVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
        zzcgt zzcgtVarZza = zzcgt.zza();
        Context context = this.w;
        zzbuf zzbufVarZzb = zzbtwVarZzf.zzb(context, zzcgtVarZza, this.C);
        zzevf zzevfVarZzp = this.A.zzp(zzcbaVar, i);
        zzfhp zzfhpVarZzc = zzevfVarZzp.zzc();
        final zzfgu zzfguVarO0 = O0(zzcbaVar, zzfhpVarZzc, zzevfVarZzp);
        zzfjc zzfjcVarZzd = zzevfVarZzp.zzd();
        final zzfir zzfirVarZza = zzfiq.zza(context, 9);
        final zzfgu zzfguVarN0 = N0(zzfguVarO0, zzfhpVarZzc, zzbufVarZzb, zzfjcVarZzd, zzfirVarZza);
        return zzfhpVarZzc.zza(zzfhj.GET_URL_AND_CACHE_KEY, zzfguVarO0, zzfguVarN0).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzedv zzedvVar = this.zza;
                zzfyx zzfyxVar = zzfguVarN0;
                zzfyx zzfyxVar2 = zzfguVarO0;
                zzcba zzcbaVar2 = zzcbaVar;
                zzfir zzfirVar = zzfirVarZza;
                zzedvVar.getClass();
                String strZzc = ((zzcbd) zzfyxVar.get()).zzc();
                zzeds zzedsVar = new zzeds((zzcbd) zzfyxVar.get(), (JSONObject) zzfyxVar2.get(), zzcbaVar2.zzh, strZzc, zzfirVar);
                synchronized (zzedvVar) {
                    synchronized (zzedvVar) {
                        int iIntValue = ((Long) zzbku.zzc.zze()).intValue();
                        while (zzedvVar.B.size() >= iIntValue) {
                            zzedvVar.B.removeFirst();
                        }
                    }
                    return new ByteArrayInputStream(strZzc.getBytes(zzfrs.zzc));
                }
                zzedvVar.B.addLast(zzedsVar);
                return new ByteArrayInputStream(strZzc.getBytes(zzfrs.zzc));
            }
        }).zza();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    public final zzfyx zzc(zzcba zzcbaVar, int i) {
        zzeds zzedsVarL0;
        zzfgu zzfguVarZza;
        zzbtw zzbtwVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
        zzcgt zzcgtVarZza = zzcgt.zza();
        Context context = this.w;
        zzbuf zzbufVarZzb = zzbtwVarZzf.zzb(context, zzcgtVarZza, this.C);
        zzevf zzevfVarZzp = this.A.zzp(zzcbaVar, i);
        zzbtv zzbtvVarZza = zzbufVarZzb.zza("google.afma.response.normalize", zzedu.zza, zzbuc.zzb);
        zzeds zzedsVar = null;
        if (((Boolean) zzbku.zza.zze()).booleanValue()) {
            if (((Boolean) zzbku.zzd.zze()).booleanValue()) {
                zzedsVarL0 = M0(zzcbaVar.zzh);
            } else if (!TextUtils.isEmpty(zzcbaVar.zzj)) {
                zzedsVarL0 = L0(zzcbaVar.zzj);
            } else if (zzedsVar == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
            zzedsVar = zzedsVarL0;
            if (zzedsVar == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzcbaVar.zzj;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzeds zzedsVar2 = zzedsVar;
        zzfir zzfirVarZza = zzedsVar2 == null ? zzfiq.zza(context, 9) : zzedsVar2.zze;
        zzfjc zzfjcVarZzd = zzevfVarZzp.zzd();
        zzfjcVarZzd.zzd(zzcbaVar.zza.getStringArrayList("ad_types"));
        zzeec zzeecVar = new zzeec(zzcbaVar.zzg, zzfjcVarZzd, zzfirVarZza);
        zzedz zzedzVar = new zzedz(this.w, zzcbaVar.zzb.zza, this.D, i, null);
        zzfhp zzfhpVarZzc = zzevfVarZzp.zzc();
        zzfir zzfirVarZza2 = zzfiq.zza(context, 11);
        if (zzedsVar2 == null) {
            final zzfgu zzfguVarO0 = O0(zzcbaVar, zzfhpVarZzc, zzevfVarZzp);
            final zzfgu zzfguVarN0 = N0(zzfguVarO0, zzfhpVarZzc, zzbufVarZzb, zzfjcVarZzd, zzfirVarZza);
            zzfir zzfirVarZza3 = zzfiq.zza(context, 10);
            final zzfgu zzfguVarZza2 = zzfhpVarZzc.zza(zzfhj.HTTP, zzfguVarN0, zzfguVarO0).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzeeb((JSONObject) zzfguVarO0.get(), (zzcbd) zzfguVarN0.get());
                }
            }).zze(zzeecVar).zze(new zzfix(zzfirVarZza3)).zze(zzedzVar).zza();
            zzfjb.zza(zzfguVarZza2, zzfjcVarZzd, zzfirVarZza3);
            zzfjb.zzd(zzfguVarZza2, zzfirVarZza2);
            zzfguVarZza = zzfhpVarZzc.zza(zzfhj.PRE_PROCESS, zzfguVarO0, zzfguVarN0, zzfguVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzedu((zzedy) zzfguVarZza2.get(), (JSONObject) zzfguVarO0.get(), (zzcbd) zzfguVarN0.get());
                }
            }).zzf(zzbtvVarZza).zza();
        } else {
            zzeeb zzeebVar = new zzeeb(zzedsVar2.zzb, zzedsVar2.zza);
            zzfir zzfirVarZza4 = zzfiq.zza(context, 10);
            final zzfgu zzfguVarZza3 = zzfhpVarZzc.zzb(zzfhj.HTTP, zzfyo.zzi(zzeebVar)).zze(zzeecVar).zze(new zzfix(zzfirVarZza4)).zze(zzedzVar).zza();
            zzfjb.zza(zzfguVarZza3, zzfjcVarZzd, zzfirVarZza4);
            final zzfyx zzfyxVarZzi = zzfyo.zzi(zzedsVar2);
            zzfjb.zzd(zzfguVarZza3, zzfirVarZza2);
            zzfguVarZza = zzfhpVarZzc.zza(zzfhj.PRE_PROCESS, zzfguVarZza3, zzfyxVarZzi).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzfyx zzfyxVar = zzfguVarZza3;
                    zzfyx zzfyxVar2 = zzfyxVarZzi;
                    return new zzedu((zzedy) zzfyxVar.get(), ((zzeds) zzfyxVar2.get()).zzb, ((zzeds) zzfyxVar2.get()).zza);
                }
            }).zzf(zzbtvVarZza).zza();
        }
        zzfjb.zza(zzfguVarZza, zzfjcVarZzd, zzfirVarZza2);
        return zzfguVarZza;
    }

    public final zzfyx zzd(zzcba zzcbaVar, int i) {
        zzbtw zzbtwVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
        zzcgt zzcgtVarZza = zzcgt.zza();
        zzfje zzfjeVar = this.C;
        Context context = this.w;
        zzbuf zzbufVarZzb = zzbtwVarZzf.zzb(context, zzcgtVarZza, zzfjeVar);
        if (!((Boolean) zzbkz.zza.zze()).booleanValue()) {
            return zzfyo.zzh(new Exception("Signal collection disabled."));
        }
        zzevf zzevfVarZzp = this.A.zzp(zzcbaVar, i);
        final zzeuq zzeuqVarZza = zzevfVarZzp.zza();
        zzbtv zzbtvVarZza = zzbufVarZzb.zza("google.afma.request.getSignals", zzbuc.zza, zzbuc.zzb);
        zzfir zzfirVarZza = zzfiq.zza(context, 22);
        zzfgu zzfguVarZza = zzevfVarZzp.zzc().zzb(zzfhj.GET_SIGNALS, zzfyo.zzi(zzcbaVar.zza)).zze(new zzfix(zzfirVarZza)).zzf(new zzfxv() { // from class: com.google.android.gms.internal.ads.zzedn
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                return zzeuqVarZza.zza(com.google.android.gms.ads.internal.client.zzaw.zzb().zzh((Bundle) obj));
            }
        }).zzb(zzfhj.JS_SIGNALS).zzf(zzbtvVarZza).zza();
        zzfjc zzfjcVarZzd = zzevfVarZzp.zzd();
        zzfjcVarZzd.zzd(zzcbaVar.zza.getStringArrayList("ad_types"));
        zzfjb.zzb(zzfguVarZza, zzfjcVarZzd, zzfirVarZza);
        return zzfguVarZza;
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zze(zzcba zzcbaVar, zzcaw zzcawVar) {
        P0(zzb(zzcbaVar, Binder.getCallingUid()), zzcawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzf(zzcba zzcbaVar, zzcaw zzcawVar) {
        P0(zzd(zzcbaVar, Binder.getCallingUid()), zzcawVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzg(zzcba zzcbaVar, zzcaw zzcawVar) {
        zzfyx zzfyxVarZzc = zzc(zzcbaVar, Binder.getCallingUid());
        P0(zzfyxVarZzc, zzcawVar);
        if (((Boolean) zzbkm.zzj.zze()).booleanValue()) {
            zzfyxVarZzc.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedi
                @Override // java.lang.Runnable
                public final void run() {
                    zzchd.zza(this.zza.z.zza(), "persistFlags");
                }
            }, this.y);
        } else {
            zzfyxVarZzc.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedi
                @Override // java.lang.Runnable
                public final void run() {
                    zzchd.zza(this.zza.z.zza(), "persistFlags");
                }
            }, this.x);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzh(String str, zzcaw zzcawVar) {
        P0(zzi(str), zzcawVar);
    }

    public final zzfyx zzi(String str) {
        if (!((Boolean) zzbku.zza.zze()).booleanValue()) {
            return zzfyo.zzh(new Exception("Split request is disabled."));
        }
        return (((Boolean) zzbku.zzd.zze()).booleanValue() ? M0(str) : L0(str)) == null ? zzfyo.zzh(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzfyo.zzi(new sg6());
    }
}
