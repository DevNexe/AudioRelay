package com.revenuecat.purchases.subscriberattributes;

import com.revenuecat.purchases.common.BackendKt;
import com.revenuecat.purchases.common.SubscriberAttributeError;
import defpackage.AY;
import defpackage.cs0;
import defpackage.lp1;
import defpackage.mu;
import defpackage.pp1;
import defpackage.t92;
import defpackage.uy2;
import defpackage.wu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class BackendHelpersKt {
    public static final List<SubscriberAttributeError> getAttributeErrors(JSONObject jSONObject) {
        cs0 cs0Var = cs0.w;
        if (jSONObject == null) {
            return cs0Var;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(BackendKt.ATTRIBUTES_ERROR_RESPONSE_KEY);
        if (jSONObjectOptJSONObject != null) {
            jSONObject = jSONObjectOptJSONObject;
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(BackendKt.ATTRIBUTE_ERRORS_KEY);
        if (jSONArrayOptJSONArray == null) {
            return cs0Var;
        }
        pp1 pp1VarV = AY.V(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList(mu.w0(pp1VarV, 10));
        Iterator<Integer> it = pp1VarV.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArrayOptJSONArray.getJSONObject(((lp1) it).nextInt()));
        }
        ArrayList<JSONObject> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            JSONObject jSONObject2 = (JSONObject) obj;
            if (jSONObject2.has("key_name") && jSONObject2.has("message")) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(mu.w0(arrayList2, 10));
        for (JSONObject jSONObject3 : arrayList2) {
            arrayList3.add(new SubscriberAttributeError(jSONObject3.getString("key_name"), jSONObject3.getString("message")));
        }
        return wu.e1(arrayList3);
    }

    public static final Map<String, Map<String, Object>> toBackendMap(Map<String, SubscriberAttribute> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            arrayList.add(new uy2(entry.getKey(), entry.getValue().toBackendMap()));
        }
        return t92.V(arrayList);
    }
}
