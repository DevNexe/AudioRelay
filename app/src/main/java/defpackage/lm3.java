package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.remoteconfig.internal.CQf;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.QnHx;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class lm3 {
    public static final Random j = new Random();
    public final HashMap a;
    public final Context b;
    public final ExecutorService c;
    public final qx0 d;
    public final yx0 e;
    public final mx0 f;
    public final pg3<CSv> g;
    public final String h;
    public final HashMap i;

    public lm3() {
        throw null;
    }

    public lm3(Context context, qx0 qx0Var, yx0 yx0Var, mx0 mx0Var, pg3<CSv> pg3Var) {
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.a = new HashMap();
        this.i = new HashMap();
        this.b = context;
        this.c = executorServiceNewCachedThreadPool;
        this.d = qx0Var;
        this.e = yx0Var;
        this.f = mx0Var;
        this.g = pg3Var;
        qx0Var.a();
        this.h = qx0Var.c.b;
        k15.c(new r23(this, 8), executorServiceNewCachedThreadPool);
    }

    public final synchronized cy0 a(qx0 qx0Var, yx0 yx0Var, mx0 mx0Var, ExecutorService executorService, f50 f50Var, f50 f50Var2, f50 f50Var3, QnHx qnHx, j50 j50Var, CQf cQf) {
        if (!this.a.containsKey("firebase")) {
            qx0Var.a();
            cy0 cy0Var = new cy0(yx0Var, qx0Var.b.equals("[DEFAULT]") ? mx0Var : null, executorService, f50Var, f50Var2, f50Var3, qnHx, j50Var, cQf);
            f50Var2.b();
            f50Var3.b();
            f50Var.b();
            this.a.put("firebase", cy0Var);
        }
        return (cy0) this.a.get("firebase");
    }

    public final f50 b(String str) {
        k50 k50Var;
        f50 f50Var;
        String str2 = String.format("%s_%s_%s_%s.json", "frc", this.h, "firebase", str);
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        Context context = this.b;
        HashMap map = k50.c;
        synchronized (k50.class) {
            HashMap map2 = k50.c;
            if (!map2.containsKey(str2)) {
                map2.put(str2, new k50(context, str2));
            }
            k50Var = (k50) map2.get(str2);
        }
        HashMap map3 = f50.d;
        synchronized (f50.class) {
            String str3 = k50Var.b;
            HashMap map4 = f50.d;
            if (!map4.containsKey(str3)) {
                map4.put(str3, new f50(executorServiceNewCachedThreadPool, k50Var));
            }
            f50Var = (f50) map4.get(str3);
        }
        return f50Var;
    }

    public final cy0 c() {
        cy0 cy0VarA;
        synchronized (this) {
            f50 f50VarB = b("fetch");
            f50 f50VarB2 = b("activate");
            f50 f50VarB3 = b("defaults");
            CQf cQf = new CQf(this.b.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", this.h, "firebase", "settings"), 0));
            j50 j50Var = new j50(this.c, f50VarB2, f50VarB3);
            qx0 qx0Var = this.d;
            pg3<CSv> pg3Var = this.g;
            qx0Var.a();
            final cq4 cq4Var = qx0Var.b.equals("[DEFAULT]") ? new cq4(pg3Var) : null;
            if (cq4Var != null) {
                z9 z9Var = new z9() { // from class: jm3
                    @Override // defpackage.z9
                    public final void a(String str, g50 g50Var) {
                        JSONObject jSONObjectOptJSONObject;
                        cq4 cq4Var2 = cq4Var;
                        CSv cSv = (CSv) ((pg3) cq4Var2.x).get();
                        if (cSv == null) {
                            return;
                        }
                        JSONObject jSONObject = g50Var.e;
                        if (jSONObject.length() < 1) {
                            return;
                        }
                        JSONObject jSONObject2 = g50Var.b;
                        if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
                            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                            if (strOptString.isEmpty()) {
                                return;
                            }
                            synchronized (((Map) cq4Var2.y)) {
                                if (!strOptString.equals(((Map) cq4Var2.y).get(str))) {
                                    ((Map) cq4Var2.y).put(str, strOptString);
                                    Bundle bundle = new Bundle();
                                    bundle.putString("arm_key", str);
                                    bundle.putString("arm_value", jSONObject2.optString(str));
                                    bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                    bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                    bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                                    cSv.b(bundle, "fp", "personalization_assignment");
                                    Bundle bundle2 = new Bundle();
                                    bundle2.putString("_fpid", strOptString);
                                    cSv.b(bundle2, "fp", "_fpc");
                                }
                            }
                        }
                    }
                };
                synchronized (j50Var.a) {
                    j50Var.a.add(z9Var);
                }
            }
            cy0VarA = a(this.d, this.e, this.f, this.c, f50VarB, f50VarB2, f50VarB3, d(f50VarB, cQf), j50Var, cQf);
        }
        return cy0VarA;
    }

    public final synchronized QnHx d(f50 f50Var, CQf cQf) {
        yx0 yx0Var;
        pg3<CSv> pg3Var;
        ExecutorService executorService;
        Random random;
        String str;
        qx0 qx0Var;
        yx0Var = this.e;
        qx0 qx0Var2 = this.d;
        qx0Var2.a();
        pg3Var = qx0Var2.b.equals("[DEFAULT]") ? this.g : new pg3() { // from class: km3
            @Override // defpackage.pg3
            public final Object get() {
                Random random2 = lm3.j;
                return null;
            }
        };
        executorService = this.c;
        random = j;
        qx0 qx0Var3 = this.d;
        qx0Var3.a();
        str = qx0Var3.c.a;
        qx0Var = this.d;
        qx0Var.a();
        return new QnHx(yx0Var, pg3Var, executorService, random, f50Var, new ConfigFetchHttpClient(this.b, qx0Var.c.b, str, cQf.a.getLong("fetch_timeout_in_seconds", 60L), cQf.a.getLong("fetch_timeout_in_seconds", 60L)), cQf, this.i);
    }
}
