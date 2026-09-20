package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzdzq;
import com.google.android.gms.internal.ads.zzfyk;
import defpackage.ag6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ag6 implements zzfyk {
    public final /* synthetic */ zzdzq w;

    public ag6(zzdzq zzdzqVar) {
        this.w = zzdzqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    public final void zza(Throwable th) {
        synchronized (this) {
            zzdzq zzdzqVar = this.w;
            zzdzqVar.c = true;
            zzdzqVar.b("com.google.android.gms.ads.MobileAds", (int) (zzt.zzB().c() - this.w.d), "Internal Error.", false);
            this.w.e.zze(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfyk
    /* JADX INFO: renamed from: zzb */
    public final /* bridge */ /* synthetic */ void mo32zzb(@Nullable Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzdzq zzdzqVar = this.w;
            zzdzqVar.c = true;
            zzdzqVar.b("com.google.android.gms.ads.MobileAds", (int) (zzt.zzB().c() - this.w.d), "", true);
            this.w.i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzn
                @Override // java.lang.Runnable
                public final void run() {
                    final zzfir zzfirVar;
                    zzdxx zzdxxVar;
                    zzdjp zzdjpVar;
                    zzfir zzfirVar2;
                    ag6 ag6Var = this.zza;
                    String str2 = str;
                    final zzdzq zzdzqVar2 = ag6Var.w;
                    Context context = zzdzqVar2.f;
                    zzdxx zzdxxVar2 = zzdzqVar2.l;
                    zzdjp zzdjpVar2 = zzdzqVar2.o;
                    int i = 5;
                    zzfir zzfirVarZza = zzfiq.zza(context, 5);
                    zzfirVarZza.zzf();
                    try {
                        ArrayList arrayList = new ArrayList();
                        JSONObject jSONObject = new JSONObject(str2).getJSONObject("initializer_settings").getJSONObject("config");
                        Iterator<String> itKeys = jSONObject.keys();
                        while (true) {
                            boolean zHasNext = itKeys.hasNext();
                            Executor executor = zzdzqVar2.i;
                            if (zHasNext) {
                                try {
                                    final String next = itKeys.next();
                                    final zzfir zzfirVarZza2 = zzfiq.zza(zzdzqVar2.f, i);
                                    zzfirVarZza2.zzf();
                                    zzfirVarZza2.zzc(next);
                                    final Object obj2 = new Object();
                                    final zzchf zzchfVar = new zzchf();
                                    zzfyx zzfyxVarZzo = zzfyo.zzo(zzchfVar, ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzbz)).longValue(), TimeUnit.SECONDS, zzdzqVar2.k);
                                    zzdxxVar2.zzc(next);
                                    zzdjpVar2.zzc(next);
                                    final long jC = com.google.android.gms.ads.internal.zzt.zzB().c();
                                    zzdxxVar = zzdxxVar2;
                                    zzdjpVar = zzdjpVar2;
                                    ArrayList arrayList2 = arrayList;
                                    zzfirVar2 = zzfirVarZza;
                                    try {
                                        zzfyxVarZzo.zzc(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzh
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                zzdzq zzdzqVar3 = zzdzqVar2;
                                                Object obj3 = obj2;
                                                zzchf zzchfVar2 = zzchfVar;
                                                String str3 = next;
                                                long j = jC;
                                                zzfir zzfirVar3 = zzfirVarZza2;
                                                zzdzqVar3.getClass();
                                                synchronized (obj3) {
                                                    if (!zzchfVar2.isDone()) {
                                                        zzdzqVar3.b(str3, (int) (com.google.android.gms.ads.internal.zzt.zzB().c() - j), "Timeout.", false);
                                                        zzdzqVar3.l.zzb(str3, "timeout");
                                                        zzdzqVar3.o.zzb(str3, "timeout");
                                                        zzfje zzfjeVar = zzdzqVar3.p;
                                                        zzfirVar3.zze(false);
                                                        zzfjeVar.zzb(zzfirVar3.zzj());
                                                        zzchfVar2.zzd(Boolean.FALSE);
                                                    }
                                                }
                                            }
                                        }, executor);
                                        arrayList2.add(zzfyxVarZzo);
                                        final zzdzp zzdzpVar = new zzdzp(zzdzqVar2, obj2, zzchfVar, next, jC, zzfirVarZza2);
                                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                                        final ArrayList arrayList3 = new ArrayList();
                                        if (jSONObjectOptJSONObject != null) {
                                            try {
                                                JSONArray jSONArray = jSONObjectOptJSONObject.getJSONArray("data");
                                                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                                                    JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                                                    String strOptString = jSONObject2.optString("format", "");
                                                    JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                                                    Bundle bundle = new Bundle();
                                                    if (jSONObjectOptJSONObject2 != null) {
                                                        Iterator<String> itKeys2 = jSONObjectOptJSONObject2.keys();
                                                        while (itKeys2.hasNext()) {
                                                            String next2 = itKeys2.next();
                                                            bundle.putString(next2, jSONObjectOptJSONObject2.optString(next2, ""));
                                                        }
                                                    }
                                                    arrayList3.add(new zzbrv(strOptString, bundle));
                                                }
                                            } catch (JSONException unused) {
                                            }
                                        }
                                        zzdzqVar2.b(next, 0, "", false);
                                        try {
                                            try {
                                                final zzfei zzfeiVarZzc = zzdzqVar2.h.zzc(next, new JSONObject());
                                                zzdzqVar2.j.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdzl
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        zzdzq zzdzqVar3 = zzdzqVar2;
                                                        zzfei zzfeiVar = zzfeiVarZzc;
                                                        zzbrp zzbrpVar = zzdzpVar;
                                                        List list = arrayList3;
                                                        String str3 = next;
                                                        zzdzqVar3.getClass();
                                                        try {
                                                            try {
                                                                Context context2 = (Context) zzdzqVar3.g.get();
                                                                if (context2 == null) {
                                                                    context2 = zzdzqVar3.f;
                                                                }
                                                                zzfeiVar.zzi(context2, zzbrpVar, list);
                                                            } catch (RemoteException e) {
                                                                zzcgn.zzh("", e);
                                                            }
                                                        } catch (zzfds unused2) {
                                                            zzbrpVar.zze("Failed to initialize adapter. " + str3 + " does not implement the initialize() method.");
                                                        }
                                                    }
                                                });
                                            } catch (zzfds unused2) {
                                                zzdzpVar.zze("Failed to create Adapter.");
                                            }
                                        } catch (RemoteException e) {
                                            zzcgn.zzh("", e);
                                        }
                                        arrayList = arrayList2;
                                        zzdxxVar2 = zzdxxVar;
                                        zzdjpVar2 = zzdjpVar;
                                        zzfirVarZza = zzfirVar2;
                                        i = 5;
                                    } catch (JSONException e2) {
                                        e = e2;
                                        zzfirVar = zzfirVar2;
                                    }
                                } catch (JSONException e3) {
                                    e = e3;
                                    zzdxxVar = zzdxxVar2;
                                    zzdjpVar = zzdjpVar2;
                                    zzfirVar = zzfirVarZza;
                                }
                            } else {
                                zzfirVar2 = zzfirVarZza;
                                zzdxxVar = zzdxxVar2;
                                zzdjpVar = zzdjpVar2;
                                zzfirVar = zzfirVar2;
                                try {
                                    zzfyo.zza(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdzi
                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            zzdzq zzdzqVar3 = zzdzqVar2;
                                            zzfir zzfirVar3 = zzfirVar;
                                            zzdzqVar3.e.zzd(Boolean.TRUE);
                                            zzfirVar3.zze(true);
                                            zzdzqVar3.p.zzb(zzfirVar3.zzj());
                                            return null;
                                        }
                                    }, executor);
                                    return;
                                } catch (JSONException e4) {
                                    e = e4;
                                }
                            }
                            e = e2;
                            zzfirVar = zzfirVar2;
                            com.google.android.gms.ads.internal.util.zze.zzb("Malformed CLD response", e);
                            zzdjpVar.zza("MalformedJson");
                            zzdxxVar.zza("MalformedJson");
                            zzdzqVar2.e.zze(e);
                            com.google.android.gms.ads.internal.zzt.zzp().zzt(e, "AdapterInitializer.updateAdapterStatus");
                            zzfirVar.zze(false);
                            zzdzqVar2.p.zzb(zzfirVar.zzj());
                            return;
                        }
                    } catch (JSONException e5) {
                        e = e5;
                        zzfirVar = zzfirVarZza;
                        zzdxxVar = zzdxxVar2;
                        zzdjpVar = zzdjpVar2;
                    }
                }
            });
        }
    }
}
