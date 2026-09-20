package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.unity3d.ads.metadata.MediationMetaData;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemo extends zzbxa {
    public final zzbwy w;
    public final zzchf x;
    public final JSONObject y;

    @GuardedBy("this")
    public boolean z;

    public zzemo(String str, zzbwy zzbwyVar, zzchf zzchfVar) {
        JSONObject jSONObject = new JSONObject();
        this.y = jSONObject;
        this.z = false;
        this.x = zzchfVar;
        this.w = zzbwyVar;
        try {
            jSONObject.put("adapter_version", zzbwyVar.zzf().toString());
            jSONObject.put("sdk_version", zzbwyVar.zzg().toString());
            jSONObject.put(MediationMetaData.KEY_NAME, str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzchf zzchfVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(MediationMetaData.KEY_NAME, str);
            jSONObject.put("signal_error", "Adapter failed to instantiate");
            zzchfVar.zzd(jSONObject);
        } catch (JSONException unused) {
        }
    }

    public final synchronized void zzc() {
        try {
            zzf("Signal collection timeout.");
        } catch (RemoteException unused) {
        }
    }

    public final synchronized void zzd() {
        if (this.z) {
            return;
        }
        this.x.zzd(this.y);
        this.z = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zze(String str) {
        if (this.z) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.y.put("signals", str);
        } catch (JSONException unused) {
        }
        this.x.zzd(this.y);
        this.z = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zzf(String str) {
        if (this.z) {
            return;
        }
        try {
            this.y.put("signal_error", str);
        } catch (JSONException unused) {
        }
        this.x.zzd(this.y);
        this.z = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.z) {
            return;
        }
        try {
            this.y.put("signal_error", zzeVar.zzb);
        } catch (JSONException unused) {
        }
        this.x.zzd(this.y);
        this.z = true;
    }
}
