package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.oa3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcsu extends com.google.android.gms.ads.internal.client.zzcl {
    public final zzeml A;
    public final zzdzq B;
    public final zzces C;
    public final zzdvo D;
    public final zzeai E;
    public final zzblh F;
    public final zzfje G;
    public final zzfeg H;

    @GuardedBy("this")
    public boolean I = false;
    public final Context w;
    public final zzcgt x;
    public final zzdvj y;
    public final zzegm z;

    public zzcsu(Context context, zzcgt zzcgtVar, zzdvj zzdvjVar, zzegm zzegmVar, zzeml zzemlVar, zzdzq zzdzqVar, zzces zzcesVar, zzdvo zzdvoVar, zzeai zzeaiVar, zzblh zzblhVar, zzfje zzfjeVar, zzfeg zzfegVar) {
        this.w = context;
        this.x = zzcgtVar;
        this.y = zzdvjVar;
        this.z = zzegmVar;
        this.A = zzemlVar;
        this.B = zzdzqVar;
        this.C = zzcesVar;
        this.D = zzdvoVar;
        this.E = zzeaiVar;
        this.F = zzblhVar;
        this.G = zzfjeVar;
        this.H = zzfegVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzt.zzs().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final String zzf() {
        return this.x.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final List zzg() {
        return this.B.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzh(String str) {
        this.A.zzf(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzi() {
        this.B.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzj() {
        if (this.I) {
            zzcgn.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbiy.zzc(this.w);
        com.google.android.gms.ads.internal.zzt.zzp().zzr(this.w, this.x);
        com.google.android.gms.ads.internal.zzt.zzc().zzi(this.w);
        this.I = true;
        this.B.zzr();
        this.A.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdc)).booleanValue()) {
            this.D.zzc();
        }
        this.E.zzf();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhO)).booleanValue()) {
            zzcha.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsq
                @Override // java.lang.Runnable
                public final void run() {
                    zzcsu zzcsuVar = this.zza;
                    zzcsuVar.getClass();
                    if (com.google.android.gms.ads.internal.zzt.zzp().zzh().zzO()) {
                        String strZzl = com.google.android.gms.ads.internal.zzt.zzp().zzh().zzl();
                        if (com.google.android.gms.ads.internal.zzt.zzt().zzj(zzcsuVar.w, strZzl, zzcsuVar.x.zza)) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.zzp().zzh().zzB(false);
                        com.google.android.gms.ads.internal.zzt.zzp().zzh().zzA("");
                    }
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zziv)).booleanValue()) {
            zzcha.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsp
                @Override // java.lang.Runnable
                public final void run() {
                    zzcsu zzcsuVar = this.zza;
                    zzcsuVar.getClass();
                    zzcsuVar.F.zza(new zzcai());
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzco)).booleanValue()) {
            zzcha.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcsr
                @Override // java.lang.Runnable
                public final void run() {
                    zzfep.zzb(this.zza.w, true);
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzk(String str, IObjectWrapper iObjectWrapper) {
        String strZzo;
        Runnable runnable;
        Context context = this.w;
        zzbiy.zzc(context);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzde)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzq();
            strZzo = com.google.android.gms.ads.internal.util.zzs.zzo(context);
        } else {
            strZzo = "";
        }
        boolean z = true;
        String str2 = true != TextUtils.isEmpty(strZzo) ? strZzo : str;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdb)).booleanValue();
        zzbiq zzbiqVar = zzbiy.zzaK;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).booleanValue();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiqVar)).booleanValue()) {
            final Runnable runnable2 = (Runnable) ObjectWrapper.M0(iObjectWrapper);
            runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzcss
                @Override // java.lang.Runnable
                public final void run() {
                    final zzcsu zzcsuVar = this.zza;
                    final Runnable runnable3 = runnable2;
                    zzcha.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcst
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcsu zzcsuVar2 = zzcsuVar;
                            Runnable runnable4 = runnable3;
                            zzcsuVar2.getClass();
                            oa3.d("Adapters must be initialized on the main thread.");
                            Map mapZze = com.google.android.gms.ads.internal.zzt.zzp().zzh().zzh().zze();
                            if (mapZze.isEmpty()) {
                                return;
                            }
                            if (runnable4 != null) {
                                try {
                                    runnable4.run();
                                } catch (Throwable th) {
                                    zzcgn.zzk("Could not initialize rewarded ads.", th);
                                    return;
                                }
                            }
                            if (zzcsuVar2.y.zzd()) {
                                HashMap map = new HashMap();
                                Iterator it = mapZze.values().iterator();
                                while (it.hasNext()) {
                                    for (zzbuz zzbuzVar : ((zzbva) it.next()).zza) {
                                        String str3 = zzbuzVar.zzk;
                                        for (String str4 : zzbuzVar.zzc) {
                                            if (!map.containsKey(str4)) {
                                                map.put(str4, new ArrayList());
                                            }
                                            if (str3 != null) {
                                                ((Collection) map.get(str4)).add(str3);
                                            }
                                        }
                                    }
                                }
                                JSONObject jSONObject = new JSONObject();
                                for (Map.Entry entry : map.entrySet()) {
                                    String str5 = (String) entry.getKey();
                                    try {
                                        zzegn zzegnVarZza = zzcsuVar2.z.zza(str5, jSONObject);
                                        if (zzegnVarZza != null) {
                                            zzfei zzfeiVar = (zzfei) zzegnVarZza.zzb;
                                            if (!zzfeiVar.zzA() && zzfeiVar.zzz()) {
                                                zzfeiVar.zzj(zzcsuVar2.w, (zzeih) zzegnVarZza.zzc, (List) entry.getValue());
                                                zzcgn.zze("Initialized rewarded video mediation adapter " + str5);
                                            }
                                        }
                                    } catch (zzfds e) {
                                        zzcgn.zzk("Failed to initialize rewarded video mediation adapter \"" + str5 + "\"", e);
                                    }
                                }
                            }
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z) {
            com.google.android.gms.ads.internal.zzt.zza().zza(this.w, this.x, str2, runnable3, this.G);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzl(com.google.android.gms.ads.internal.client.zzcy zzcyVar) {
        this.E.zzg(zzcyVar, zzeah.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzm(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            zzcgn.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.M0(iObjectWrapper);
        if (context == null) {
            zzcgn.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzas zzasVar = new com.google.android.gms.ads.internal.util.zzas(context);
        zzasVar.zzn(str);
        zzasVar.zzo(this.x.zza);
        zzasVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzn(zzbvf zzbvfVar) {
        this.H.zze(zzbvfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzo(boolean z) {
        com.google.android.gms.ads.internal.zzt.zzs().zzc(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzp(float f) {
        com.google.android.gms.ads.internal.zzt.zzs().zzd(f);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized void zzq(String str) {
        zzbiy.zzc(this.w);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzdb)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zza().zza(this.w, this.x, str, null, this.G);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzr(zzbrs zzbrsVar) {
        this.B.zzs(zzbrsVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzs(com.google.android.gms.ads.internal.client.zzez zzezVar) {
        this.C.zzq(this.w, zzezVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final synchronized boolean zzt() {
        return com.google.android.gms.ads.internal.zzt.zzs().zze();
    }
}
