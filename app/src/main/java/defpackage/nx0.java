package defpackage;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.CQf;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class nx0 implements ku0 {
    public final FirebaseAnalytics w;
    public final pl3 x = new pl3("[^a-zA-Z0-9_]");

    public nx0(FirebaseAnalytics firebaseAnalytics) {
        this.w = firebaseAnalytics;
    }

    @Override // defpackage.ku0
    public final void a(String str, String str2) {
        CQf cQf = this.w.a;
        cQf.getClass();
        cQf.c(new we6(cQf, null, str, str2, false));
    }

    @Override // defpackage.ku0
    public final void b(String str, String str2) {
        c(str, str2, null);
    }

    public final void c(String str, String str2, Integer num) {
        String strZ = pv4.Z(40, this.x.w.matcher(str).replaceAll("_"));
        Bundle bundle = new Bundle();
        if (str2 != null) {
            bundle.putString("label", str2);
        }
        if (num != null) {
            num.intValue();
            bundle.putInt("value", num.intValue());
        }
        CQf cQf = this.w.a;
        cQf.getClass();
        cQf.c(new ve6(cQf, null, strZ, bundle, false));
    }

    @Override // defpackage.ku0
    public final void f(String str) {
        ny1 ny1Var = new ny1(10);
        ((Bundle) ny1Var.w).putString("screen_name", str);
        Bundle bundle = (Bundle) ny1Var.w;
        CQf cQf = this.w.a;
        cQf.getClass();
        cQf.c(new ve6(cQf, null, "screen_view", bundle, false));
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    @Override // defpackage.ku0
    public final void g(String str, n52 n52Var) {
        Bundle bundle;
        if (n52Var == null) {
            bundle = null;
        } else if (n52Var.a == null && n52Var.b == null && n52Var.c == null) {
            bundle = null;
        } else {
            bundle = new Bundle();
            Map map = n52Var.a;
            Map map2 = ds0.w;
            if (map == null) {
                map = map2;
            }
            for (Map.Entry entry : map.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            Map map3 = n52Var.b;
            if (map3 == null) {
                map3 = map2;
            }
            for (Map.Entry entry2 : map3.entrySet()) {
                bundle.putBoolean((String) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue());
            }
            LinkedHashMap linkedHashMap = n52Var.c;
            if (linkedHashMap != null) {
                map2 = linkedHashMap;
            }
            for (Map.Entry entry3 : map2.entrySet()) {
                bundle.putInt((String) entry3.getKey(), ((Number) entry3.getValue()).intValue());
            }
        }
        CQf cQf = this.w.a;
        cQf.getClass();
        cQf.c(new ve6(cQf, null, str, bundle, false));
    }

    @Override // defpackage.ku0
    public final void h(int i, String str, String str2) {
        c(str, str2, Integer.valueOf(i));
    }
}
