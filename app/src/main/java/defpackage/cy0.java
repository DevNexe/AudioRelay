package defpackage;

import com.google.firebase.remoteconfig.internal.CQf;
import com.google.firebase.remoteconfig.internal.QnHx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class cy0 {
    public final mx0 a;
    public final Executor b;
    public final f50 c;
    public final f50 d;
    public final QnHx e;
    public final j50 f;
    public final CQf g;
    public final yx0 h;

    public cy0(yx0 yx0Var, mx0 mx0Var, ExecutorService executorService, f50 f50Var, f50 f50Var2, f50 f50Var3, QnHx qnHx, j50 j50Var, CQf cQf) {
        this.h = yx0Var;
        this.a = mx0Var;
        this.b = executorService;
        this.c = f50Var;
        this.d = f50Var2;
        this.e = qnHx;
        this.f = j50Var;
        this.g = cQf;
    }

    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }
}
