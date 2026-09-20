package defpackage;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.internal.ads.zzbiy;
import com.google.android.gms.internal.ads.zzcgn;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class yf6 {
    public Long a;
    public final String b;
    public String c;
    public Integer d;
    public String e;
    public Integer f;

    public static /* bridge */ /* synthetic */ String a(yf6 yf6Var) {
        String str = (String) zzay.zzc().zzb(zzbiy.zzic);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", yf6Var.a);
            jSONObject.put("eventCategory", yf6Var.b);
            jSONObject.putOpt("event", yf6Var.c);
            jSONObject.putOpt("errorCode", yf6Var.d);
            jSONObject.putOpt("rewardType", yf6Var.e);
            jSONObject.putOpt("rewardAmount", yf6Var.f);
        } catch (JSONException unused) {
            zzcgn.zzj("Could not convert parameters to JSON.");
        }
        return str + "(\"h5adsEvent\"," + jSONObject.toString() + ");";
    }
}
