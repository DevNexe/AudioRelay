package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import defpackage.GM;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdrb {
    public final zzfyy a;
    public final zzdro b;
    public final zzdrt c;

    public zzdrb(zzfyy zzfyyVar, zzdro zzdroVar, zzdrt zzdrtVar) {
        this.a = zzfyyVar;
        this.b = zzdroVar;
        this.c = zzdrtVar;
    }

    public final zzfyx zza(final zzfde zzfdeVar, final zzfcs zzfcsVar, final JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        zzfyx zzfyxVarZzi;
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzdqz
            @Override // java.util.concurrent.Callable
            public final Object call() throws zzeka {
                zzfde zzfdeVar2 = zzfdeVar;
                zzfcs zzfcsVar2 = zzfcsVar;
                JSONObject jSONObject2 = jSONObject;
                zzdoo zzdooVar = new zzdoo();
                zzdooVar.zzV(jSONObject2.optInt("template_id", -1));
                zzdooVar.zzI(jSONObject2.optString("custom_template_id"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("omid_settings");
                zzdooVar.zzS(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("omid_partner_name") : null);
                zzfdn zzfdnVar = zzfdeVar2.zza.zza;
                if (!zzfdnVar.zzg.contains(Integer.toString(zzdooVar.zzc()))) {
                    throw new zzeka(1, GM.a("Invalid template ID: ", zzdooVar.zzc()));
                }
                if (zzdooVar.zzc() == 3) {
                    if (zzdooVar.zzy() == null) {
                        throw new zzeka(1, "No custom template id for custom template ad response.");
                    }
                    if (!zzfdnVar.zzh.contains(zzdooVar.zzy())) {
                        throw new zzeka(1, "Unexpected custom template id in the response.");
                    }
                }
                zzdooVar.zzT(jSONObject2.optDouble("rating", -1.0d));
                String strOptString = jSONObject2.optString("headline", null);
                if (zzfcsVar2.zzN) {
                    com.google.android.gms.ads.internal.zzt.zzq();
                    strOptString = defpackage.LPt6Fixed.a(com.google.android.gms.ads.internal.util.zzs.zzv(), " : ", strOptString);
                }
                zzdooVar.zzU("headline", strOptString);
                zzdooVar.zzU("body", jSONObject2.optString("body", null));
                zzdooVar.zzU("call_to_action", jSONObject2.optString("call_to_action", null));
                zzdooVar.zzU("store", jSONObject2.optString("store", null));
                zzdooVar.zzU(InAppPurchaseMetaData.KEY_PRICE, jSONObject2.optString(InAppPurchaseMetaData.KEY_PRICE, null));
                zzdooVar.zzU("advertiser", jSONObject2.optString("advertiser", null));
                return zzdooVar;
            }
        };
        zzfyy zzfyyVar = this.a;
        final zzfyx zzfyxVarZzb = zzfyyVar.zzb(callable);
        final zzdro zzdroVar = this.b;
        final zzfyx zzfyxVarZzf = zzdroVar.zzf(jSONObject, "images");
        final zzfyx zzfyxVarZzg = zzdroVar.zzg(jSONObject, "images", zzfcsVar, zzfdeVar.zzb.zzb);
        final zzfyx zzfyxVarZze = zzdroVar.zze(jSONObject, "secondary_image");
        final zzfyx zzfyxVarZze2 = zzdroVar.zze(jSONObject, "app_icon");
        final zzfyx zzfyxVarZzd = zzdroVar.zzd(jSONObject, "attribution");
        final zzfyx zzfyxVarZzh = zzdroVar.zzh(jSONObject, zzfcsVar, zzfdeVar.zzb.zzb);
        if (jSONObject.optBoolean("enable_omid") && (jSONObjectOptJSONObject = jSONObject.optJSONObject("omid_settings")) != null) {
            final String strOptString = jSONObjectOptJSONObject.optString("omid_html");
            zzfyxVarZzi = TextUtils.isEmpty(strOptString) ? zzfyo.zzi(null) : zzfyo.zzn(zzfyo.zzi(null), new zzfxv() { // from class: com.google.android.gms.internal.ads.zzdrd
                @Override // com.google.android.gms.internal.ads.zzfxv
                public final zzfyx zza(Object obj) throws zzcmy {
                    zzdro zzdroVar2 = zzdroVar;
                    String str = strOptString;
                    zzdroVar2.getClass();
                    com.google.android.gms.ads.internal.zzt.zzA();
                    zzcmn zzcmnVarZza = zzcmz.zza(zzdroVar2.a, zzcoc.zza(), "native-omid", false, false, zzdroVar2.c, null, zzdroVar2.d, null, null, zzdroVar2.e, zzdroVar2.f, null, null);
                    final zzche zzcheVarZza = zzche.zza(zzcmnVarZza);
                    zzcmnVarZza.zzP().zzz(new zzcny() { // from class: com.google.android.gms.internal.ads.zzdre
                        @Override // com.google.android.gms.internal.ads.zzcny
                        public final void zza(boolean z) {
                            zzcheVarZza.zzb();
                        }
                    });
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzeg)).booleanValue()) {
                        zzcmnVarZza.loadData(Base64.encodeToString(str.getBytes(), 1), "text/html", "base64");
                    } else {
                        zzcmnVarZza.loadData(str, "text/html", "UTF-8");
                    }
                    return zzcheVarZza;
                }
            }, zzcha.zze);
        } else {
            zzfyxVarZzi = zzfyo.zzi(null);
        }
        final zzfyx zzfyxVar = zzfyxVarZzi;
        final zzfyx zzfyxVarZza = this.c.zza(jSONObject, "custom_assets");
        return zzfyo.zzb(zzfyxVarZzb, zzfyxVarZzf, zzfyxVarZzg, zzfyxVarZze, zzfyxVarZze2, zzfyxVarZzd, zzfyxVarZzh, zzfyxVar, zzfyxVarZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdra
            @Override // java.util.concurrent.Callable
            public final Object call() {
                zzfyx zzfyxVar2 = zzfyxVarZzb;
                zzfyx zzfyxVar3 = zzfyxVarZzf;
                zzfyx zzfyxVar4 = zzfyxVarZze2;
                zzfyx zzfyxVar5 = zzfyxVarZze;
                zzfyx zzfyxVar6 = zzfyxVarZzd;
                JSONObject jSONObject2 = jSONObject;
                zzfyx zzfyxVar7 = zzfyxVarZzh;
                zzfyx zzfyxVar8 = zzfyxVarZzg;
                zzfyx zzfyxVar9 = zzfyxVar;
                zzfyx zzfyxVar10 = zzfyxVarZza;
                zzdoo zzdooVar = (zzdoo) zzfyxVar2.get();
                zzdooVar.zzN((List) zzfyxVar3.get());
                zzdooVar.zzK((zzbma) zzfyxVar4.get());
                zzdooVar.zzO((zzbma) zzfyxVar5.get());
                zzdooVar.zzH((zzbls) zzfyxVar6.get());
                zzdooVar.zzQ(zzdro.zzj(jSONObject2));
                zzdooVar.zzJ(zzdro.zzi(jSONObject2));
                zzcmn zzcmnVar = (zzcmn) zzfyxVar7.get();
                if (zzcmnVar != null) {
                    zzdooVar.zzY(zzcmnVar);
                    zzdooVar.zzX(zzcmnVar.zzH());
                    zzdooVar.zzW(zzcmnVar.zzs());
                }
                zzcmn zzcmnVar2 = (zzcmn) zzfyxVar8.get();
                if (zzcmnVar2 != null) {
                    zzdooVar.zzM(zzcmnVar2);
                    zzdooVar.zzZ(zzcmnVar2.zzH());
                }
                zzcmn zzcmnVar3 = (zzcmn) zzfyxVar9.get();
                if (zzcmnVar3 != null) {
                    zzdooVar.zzR(zzcmnVar3);
                }
                for (zzdrs zzdrsVar : (List) zzfyxVar10.get()) {
                    if (zzdrsVar.zza != 1) {
                        zzdooVar.zzL(zzdrsVar.zzb, zzdrsVar.zzd);
                    } else {
                        zzdooVar.zzU(zzdrsVar.zzb, zzdrsVar.zzc);
                    }
                }
                return zzdooVar;
            }
        }, zzfyyVar);
    }
}
