package defpackage;

import android.annotation.SuppressLint;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"TypeParameterUnusedInFormals"})
public final class cm2 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public static final class QnHx {
        public static String a(Class cls) {
            LinkedHashMap linkedHashMap = cm2.b;
            String strValue = (String) linkedHashMap.get(cls);
            if (strValue == null) {
                zl2.CQf cQf = (zl2.CQf) cls.getAnnotation(zl2.CQf.class);
                strValue = cQf != null ? cQf.value() : null;
                if (!b(strValue)) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
                }
                linkedHashMap.put(cls, strValue);
            }
            return strValue;
        }

        public static boolean b(String str) {
            if (str != null) {
                return str.length() > 0;
            }
            return false;
        }
    }

    public final void a(zl2 zl2Var) {
        String strA = QnHx.a(zl2Var.getClass());
        if (!QnHx.b(strA)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        LinkedHashMap linkedHashMap = this.a;
        zl2 zl2Var2 = (zl2) linkedHashMap.get(strA);
        if (ur1.a(zl2Var2, zl2Var)) {
            return;
        }
        if (!(!(zl2Var2 != null && zl2Var2.b))) {
            throw new IllegalStateException(("Navigator " + zl2Var + " is replacing an already attached " + zl2Var2).toString());
        }
        if (!zl2Var.b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + zl2Var + " is already attached to another NavController").toString());
    }

    public final <T extends zl2<?>> T b(String str) {
        if (!QnHx.b(str)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        T t = (T) this.a.get(str);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(fc2.a("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
