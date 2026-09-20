package defpackage;

import android.util.Log;
import com.google.firebase.abt.AbtException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class by0 implements uw4, a90 {
    public final /* synthetic */ cy0 w;

    public /* synthetic */ by0(cy0 cy0Var) {
        this.w = cy0Var;
    }

    @Override // defpackage.uw4
    public final w05 e(Object obj) {
        cy0 cy0Var = this.w;
        w05<g50> w05VarB = cy0Var.c.b();
        w05<g50> w05VarB2 = cy0Var.d.b();
        return k15.g(w05VarB, w05VarB2).i(cy0Var.b, new ar3(cy0Var, w05VarB, w05VarB2));
    }

    @Override // defpackage.a90
    public final Object then(w05 w05Var) {
        boolean z;
        cy0 cy0Var = this.w;
        cy0Var.getClass();
        if (w05Var.n()) {
            f50 f50Var = cy0Var.c;
            synchronized (f50Var) {
                f50Var.c = k15.e(null);
            }
            k50 k50Var = f50Var.b;
            synchronized (k50Var) {
                k50Var.a.deleteFile(k50Var.b);
            }
            if (w05Var.k() != null) {
                JSONArray jSONArray = ((g50) w05Var.k()).d;
                mx0 mx0Var = cy0Var.a;
                if (mx0Var != null) {
                    try {
                        mx0Var.b(cy0.a(jSONArray));
                    } catch (AbtException e) {
                        Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e);
                    } catch (JSONException e2) {
                        Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e2);
                    }
                }
            } else {
                Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            }
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
