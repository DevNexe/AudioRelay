package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class vv0 {
    public static volatile vv0 b;
    public static final vv0 c = new vv0(0);
    public final Map<Object, Object> a;

    public vv0() {
        this.a = new HashMap();
    }

    public static vv0 a() {
        vv0 vv0Var = b;
        if (vv0Var == null) {
            synchronized (vv0.class) {
                vv0Var = b;
                if (vv0Var == null) {
                    Class<?> cls = uv0.a;
                    vv0 vv0Var2 = null;
                    if (cls != null) {
                        try {
                            vv0Var2 = (vv0) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (vv0Var2 == null) {
                        vv0Var2 = c;
                    }
                    b = vv0Var2;
                    vv0Var = vv0Var2;
                }
            }
        }
        return vv0Var;
    }

    public vv0(vv0 vv0Var) {
        if (vv0Var == c) {
            this.a = Collections.emptyMap();
        } else {
            this.a = Collections.unmodifiableMap(vv0Var.a);
        }
    }

    public vv0(int i) {
        this.a = Collections.emptyMap();
    }
}
