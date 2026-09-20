package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class th4 implements qh4 {
    @Override // defpackage.qh4
    public final qg4 a(m57 m57Var, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        qg4.CQf cQf = jSONObject.has("session") ? new qg4.CQf(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new qg4.CQf(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        qg4.QnHx qnHx = new qg4.QnHx(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false));
        long j = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            m57Var.getClass();
            jCurrentTimeMillis = (j * 1000) + System.currentTimeMillis();
        }
        return new qg4(jCurrentTimeMillis, cQf, qnHx, dOptDouble, dOptDouble2, iOptInt2);
    }
}
