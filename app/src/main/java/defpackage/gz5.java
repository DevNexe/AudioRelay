package defpackage;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzcgn;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class gz5 extends QueryInfoGenerationCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ n05 b;

    public gz5(n05 n05Var, String str) {
        this.b = n05Var;
        this.a = str;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        zzcgn.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(str)));
        this.b.b.evaluateJavascript(String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", this.a, str), null);
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        String str;
        String str2 = this.a;
        String query = queryInfo.getQuery();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("paw_id", str2);
            jSONObject.put("signal", query);
            str = String.format("window.postMessage(%1$s, '*');", jSONObject);
        } catch (JSONException unused) {
            str = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", str2, queryInfo.getQuery());
        }
        this.b.b.evaluateJavascript(str, null);
    }
}
