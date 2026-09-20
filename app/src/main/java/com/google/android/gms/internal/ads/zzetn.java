package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetn implements zzeun {
    public final zzfyy a;
    public final ScheduledExecutorService b;
    public final zzeml c;
    public final Context d;
    public final zzfdn e;
    public final zzemh f;
    public final zzdvj g;
    public final String h;

    public zzetn(zzfyy zzfyyVar, ScheduledExecutorService scheduledExecutorService, String str, zzeml zzemlVar, Context context, zzfdn zzfdnVar, zzemh zzemhVar, zzdvj zzdvjVar) {
        this.a = zzfyyVar;
        this.b = scheduledExecutorService;
        this.h = str;
        this.c = zzemlVar;
        this.d = context;
        this.e = zzfdnVar;
        this.f = zzemhVar;
        this.g = zzdvjVar;
    }

    public static /* synthetic */ zzfyx zzc(zzetn zzetnVar) {
        zzfdn zzfdnVar;
        Map mapZza = zzetnVar.c.zza(zzetnVar.h, ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzit)).booleanValue() ? zzetnVar.e.zzf.toLowerCase(Locale.ROOT) : zzetnVar.e.zzf);
        final ArrayList arrayList = new ArrayList();
        Iterator it = ((zzfuy) mapZza).entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Bundle bundle = null;
            zzfdnVar = zzetnVar.e;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            Bundle bundle2 = zzfdnVar.zzd.zzm;
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            }
            arrayList.add(zzetnVar.a(str, list, bundle, true, true));
        }
        Iterator it2 = ((zzfuy) zzetnVar.c.zzb()).entrySet().iterator();
        while (it2.hasNext()) {
            zzemp zzempVar = (zzemp) ((Map.Entry) it2.next()).getValue();
            String str2 = zzempVar.zza;
            Bundle bundle3 = zzfdnVar.zzd.zzm;
            arrayList.add(zzetnVar.a(str2, Collections.singletonList(zzempVar.zzd), bundle3 != null ? bundle3.getBundle(str2) : null, zzempVar.zzb, zzempVar.zzc));
        }
        return zzfyo.zzc(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzetk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                List<zzfyx> list2 = arrayList;
                JSONArray jSONArray = new JSONArray();
                for (zzfyx zzfyxVar : list2) {
                    if (((JSONObject) zzfyxVar.get()) != null) {
                        jSONArray.put(zzfyxVar.get());
                    }
                }
                if (jSONArray.length() == 0) {
                    return null;
                }
                return new zzeto(jSONArray.toString());
            }
        }, zzetnVar.a);
    }

    public final zzfyf a(final String str, final List list, final Bundle bundle, final boolean z, final boolean z2) {
        zzfxu zzfxuVar = new zzfxu() { // from class: com.google.android.gms.internal.ads.zzetl
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final zzfyx zza() {
                zzbwy zzbwyVarZzb;
                zzetn zzetnVar = this.zza;
                String str2 = str;
                List list2 = list;
                Bundle bundle2 = bundle;
                boolean z3 = z;
                boolean z4 = z2;
                zzetnVar.getClass();
                zzchf zzchfVar = new zzchf();
                if (z4) {
                    zzemh zzemhVar = zzetnVar.f;
                    zzemhVar.zzb(str2);
                    zzbwyVarZzb = zzemhVar.zza(str2);
                } else {
                    try {
                        zzbwyVarZzb = zzetnVar.g.zzb(str2);
                    } catch (RemoteException e) {
                        zzcgn.zzh("Couldn't create RTB adapter : ", e);
                        zzbwyVarZzb = null;
                    }
                }
                if (zzbwyVarZzb == null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbn)).booleanValue()) {
                        throw null;
                    }
                    zzemo.zzb(str2, zzchfVar);
                } else {
                    final zzemo zzemoVar = new zzemo(str2, zzbwyVarZzb, zzchfVar);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbs)).booleanValue()) {
                        zzetnVar.b.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzetj
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzemoVar.zzc();
                            }
                        }, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbl)).longValue(), TimeUnit.MILLISECONDS);
                    }
                    if (z3) {
                        zzbwyVarZzb.zzh(new ObjectWrapper(zzetnVar.d), zzetnVar.h, bundle2, (Bundle) list2.get(0), zzetnVar.e.zze, zzemoVar);
                    } else {
                        zzemoVar.zzd();
                    }
                }
                return zzchfVar;
            }
        };
        zzfyy zzfyyVar = this.a;
        zzfyf zzfyfVarZzv = zzfyf.zzv(zzfyo.zzl(zzfxuVar, zzfyyVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbs)).booleanValue()) {
            zzfyfVarZzv = (zzfyf) zzfyo.zzo(zzfyfVarZzv, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbl)).longValue(), TimeUnit.MILLISECONDS, this.b);
        }
        return (zzfyf) zzfyo.zzf(zzfyfVarZzv, Throwable.class, new zzfru() { // from class: com.google.android.gms.internal.ads.zzetm
            @Override // com.google.android.gms.internal.ads.zzfru
            public final Object apply(Object obj) {
                zzcgn.zzg("Error calling adapter: ".concat(String.valueOf(str)));
                return null;
            }
        }, zzfyyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final zzfyx zzb() {
        return zzfyo.zzl(new zzfxu() { // from class: com.google.android.gms.internal.ads.zzeti
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final zzfyx zza() {
                return zzetn.zzc(this.zza);
            }
        }, this.a);
    }
}
