package com.google.android.gms.internal.ads;

import com.unity3d.services.core.request.metrics.AdOperationMetric;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class zzbya {
    public final zzcmn a;
    public final String b;

    public zzbya(zzcmn zzcmnVar, String str) {
        this.a = zzcmnVar;
        this.b = str;
    }

    public final void zzf(int i, int i2, int i3, int i4) {
        try {
            this.a.zze("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzcgn.zzh("Error occurred while dispatching default position.", e);
        }
    }

    public final void zzg(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.b);
            zzcmn zzcmnVar = this.a;
            if (zzcmnVar != null) {
                zzcmnVar.zze("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            zzcgn.zzh("Error occurred while dispatching error event.", e);
        }
    }

    public final void zzh(String str) {
        try {
            this.a.zze("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            zzcgn.zzh("Error occurred while dispatching ready Event.", e);
        }
    }

    public final void zzi(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.a.zze("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put("rotation", i5));
        } catch (JSONException e) {
            zzcgn.zzh("Error occurred while obtaining screen information.", e);
        }
    }

    public final void zzj(int i, int i2, int i3, int i4) {
        try {
            this.a.zze("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            zzcgn.zzh("Error occurred while dispatching size change.", e);
        }
    }

    public final void zzk(String str) {
        try {
            this.a.zze("onStateChanged", new JSONObject().put(AdOperationMetric.INIT_STATE, str));
        } catch (JSONException e) {
            zzcgn.zzh("Error occurred while dispatching state change.", e);
        }
    }
}
