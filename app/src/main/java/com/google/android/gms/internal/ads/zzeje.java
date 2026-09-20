package com.google.android.gms.internal.ads;

import defpackage.x53;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeje implements zzeiy {
    public final zzdnb a;
    public final zzfyy b;
    public final zzdrb c;
    public final zzfej d;
    public final zzdtr e;

    public zzeje(zzdnb zzdnbVar, zzfyy zzfyyVar, zzdrb zzdrbVar, zzfej zzfejVar, zzdtr zzdtrVar) {
        this.a = zzdnbVar;
        this.b = zzfyyVar;
        this.c = zzdrbVar;
        this.d = zzfejVar;
        this.e = zzdtrVar;
    }

    public final zzfyx a(final zzfde zzfdeVar, final zzfcs zzfcsVar, final JSONObject jSONObject) {
        final zzfyx zzfyxVarZza = this.d.zza();
        final zzfyx zzfyxVarZza2 = this.c.zza(zzfdeVar, zzfcsVar, jSONObject);
        return zzfyo.zzd(zzfyxVarZza, zzfyxVarZza2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeiz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzeje zzejeVar = this.zza;
                zzfyx zzfyxVar = zzfyxVarZza2;
                zzfyx zzfyxVar2 = zzfyxVarZza;
                zzfde zzfdeVar2 = zzfdeVar;
                zzfcs zzfcsVar2 = zzfcsVar;
                JSONObject jSONObject2 = jSONObject;
                zzejeVar.getClass();
                zzdoo zzdooVar = (zzdoo) zzfyxVar.get();
                zzdtl zzdtlVar = (zzdtl) zzfyxVar2.get();
                zzdop zzdopVarZzd = zzejeVar.a.zzd(new zzczr(zzfdeVar2, zzfcsVar2, null), new zzdpa(zzdooVar), new zzdnq(jSONObject2, zzdtlVar));
                zzdopVarZzd.zzj().zzb();
                zzdopVarZzd.zzk().zza(zzdtlVar);
                zzdopVarZzd.zzg().zza(zzdooVar.zzr());
                zzdopVarZzd.zzl().zza(zzejeVar.e);
                return zzdopVarZzd.zza();
            }
        }, this.b);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final zzfyx zza(final zzfde zzfdeVar, final zzfcs zzfcsVar) {
        zzfyx zzfyxVarZza = this.d.zza();
        zzfxv zzfxvVar = new zzfxv() { // from class: com.google.android.gms.internal.ads.zzejb
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) throws JSONException {
                final zzeje zzejeVar = this.zza;
                zzfcs zzfcsVar2 = zzfcsVar;
                final zzdtl zzdtlVar = (zzdtl) obj;
                zzejeVar.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isNonagon", true);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhk)).booleanValue() && x53.b()) {
                    jSONObject.put("skipDeepLinkValidation", true);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("response", zzfcsVar2.zzt.zzc);
                jSONObject2.put("sdk_params", jSONObject);
                return zzfyo.zzn(zzdtlVar.zzd("google.afma.nativeAds.preProcessJson", jSONObject2), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzeja
                    @Override // com.google.android.gms.internal.ads.zzfxv
                    public final zzfyx zza(Object obj2) throws zzbtu {
                        JSONObject jSONObject3 = (JSONObject) obj2;
                        zzejeVar.d.zzb(zzfyo.zzi(zzdtlVar));
                        if (jSONObject3.optBoolean("success")) {
                            return zzfyo.zzi(jSONObject3.getJSONObject("json").getJSONArray("ads"));
                        }
                        throw new zzbtu("process json failed");
                    }
                }, zzejeVar.b);
            }
        };
        zzfyy zzfyyVar = this.b;
        return zzfyo.zzn(zzfyo.zzn(zzfyxVarZza, zzfxvVar, zzfyyVar), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzejc
            @Override // com.google.android.gms.internal.ads.zzfxv
            public final zzfyx zza(Object obj) {
                zzeje zzejeVar = this.zza;
                zzfde zzfdeVar2 = zzfdeVar;
                zzfcs zzfcsVar2 = zzfcsVar;
                JSONArray jSONArray = (JSONArray) obj;
                zzejeVar.getClass();
                if (jSONArray.length() == 0) {
                    return zzfyo.zzh(new zzeas(3));
                }
                if (zzfdeVar2.zza.zza.zzk <= 1) {
                    return zzfyo.zzm(zzejeVar.a(zzfdeVar2, zzfcsVar2, jSONArray.getJSONObject(0)), new zzfru() { // from class: com.google.android.gms.internal.ads.zzejd
                        @Override // com.google.android.gms.internal.ads.zzfru
                        public final Object apply(Object obj2) {
                            return Collections.singletonList(zzfyo.zzi((zzdoj) obj2));
                        }
                    }, zzejeVar.b);
                }
                int length = jSONArray.length();
                zzejeVar.d.zzc(Math.min(length, zzfdeVar2.zza.zza.zzk));
                ArrayList arrayList = new ArrayList(zzfdeVar2.zza.zza.zzk);
                for (int i = 0; i < zzfdeVar2.zza.zza.zzk; i++) {
                    if (i < length) {
                        arrayList.add(zzejeVar.a(zzfdeVar2, zzfcsVar2, jSONArray.getJSONObject(i)));
                    } else {
                        arrayList.add(zzfyo.zzh(new zzeas(3)));
                    }
                }
                return zzfyo.zzi(arrayList);
            }
        }, zzfyyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzegk
    public final boolean zzb(zzfde zzfdeVar, zzfcs zzfcsVar) {
        zzfcx zzfcxVar = zzfcsVar.zzt;
        return (zzfcxVar == null || zzfcxVar.zzc == null) ? false : true;
    }
}
