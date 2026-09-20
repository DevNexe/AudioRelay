package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzu;
import com.unity3d.services.core.request.metrics.AdOperationMetric;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdzw implements zzddb, zzdft, zzdeq {
    public zzdcr A;
    public com.google.android.gms.ads.internal.client.zze B;
    public String C;
    public String D;
    public final zzeai w;
    public final String x;
    public int y = 0;
    public zzdzv z = zzdzv.AD_REQUESTED;

    public zzdzw(zzeai zzeaiVar, zzfdn zzfdnVar) {
        this.w = zzeaiVar;
        this.x = zzfdnVar.zzf;
    }

    public static JSONObject a(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        jSONObject.put("underlyingError", zzeVar2 == null ? null : a(zzeVar2));
        return jSONObject;
    }

    public final JSONObject b(zzdcr zzdcrVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzdcrVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzdcrVar.zzc());
        jSONObject.put("responseId", zzdcrVar.zzh());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhQ)).booleanValue()) {
            String strZzd = zzdcrVar.zzd();
            if (!TextUtils.isEmpty(strZzd)) {
                zzcgn.zze("Bidding data: ".concat(String.valueOf(strZzd)));
                jSONObject.put("biddingData", new JSONObject(strZzd));
            }
        }
        if (!TextUtils.isEmpty(this.C)) {
            jSONObject.put("adRequestUrl", this.C);
        }
        if (!TextUtils.isEmpty(this.D)) {
            jSONObject.put("postBody", this.D);
        }
        JSONArray jSONArray = new JSONArray();
        for (zzu zzuVar : zzdcrVar.zzi()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbiy.zzhR)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzaw.zzb().zzh(zzuVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.zzc;
            jSONObject2.put("error", zzeVar == null ? null : a(zzeVar));
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzddb
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.z = zzdzv.AD_LOAD_FAILED;
        this.B = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzb(zzfde zzfdeVar) {
        if (!zzfdeVar.zzb.zza.isEmpty()) {
            this.y = ((zzfcs) zzfdeVar.zzb.zza.get(0)).zzb;
        }
        if (!TextUtils.isEmpty(zzfdeVar.zzb.zzb.zzk)) {
            this.C = zzfdeVar.zzb.zzb.zzk;
        }
        if (TextUtils.isEmpty(zzfdeVar.zzb.zzb.zzl)) {
            return;
        }
        this.D = zzfdeVar.zzb.zzb.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzdft
    public final void zzbE(zzcba zzcbaVar) {
        this.w.zze(this.x, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdeq
    public final void zzbH(zzczc zzczcVar) {
        this.A = zzczcVar.zzl();
        this.z = zzdzv.AD_LOADED;
    }

    public final JSONObject zzc() throws JSONException {
        JSONObject jSONObjectB;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AdOperationMetric.INIT_STATE, this.z);
        jSONObject.put("format", zzfcs.zza(this.y));
        zzdcr zzdcrVar = this.A;
        if (zzdcrVar != null) {
            jSONObjectB = b(zzdcrVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.B;
            JSONObject jSONObjectB2 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzdcr zzdcrVar2 = (zzdcr) iBinder;
                jSONObjectB2 = b(zzdcrVar2);
                if (zzdcrVar2.zzi().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(a(this.B));
                    jSONObjectB2.put("errors", jSONArray);
                }
            }
            jSONObjectB = jSONObjectB2;
        }
        jSONObject.put("responseInfo", jSONObjectB);
        return jSONObject;
    }

    public final boolean zzd() {
        return this.z != zzdzv.AD_REQUESTED;
    }
}
