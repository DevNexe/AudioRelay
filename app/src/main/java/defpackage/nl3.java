package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class nl3 {
    public static final ol3 a;
    public static final fv1[] b;

    static {
        ol3 ol3Var = null;
        try {
            ol3Var = (ol3) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (ol3Var == null) {
            ol3Var = new ol3();
        }
        a = ol3Var;
        b = new fv1[0];
    }

    public static ar a(Class cls) {
        a.getClass();
        return new ar(cls);
    }

    public static xb5 b(Class cls) {
        ar arVarA = a(cls);
        List listEmptyList = Collections.emptyList();
        a.getClass();
        return new xb5(arVarA, listEmptyList, true);
    }

    public static xb5 c(Class cls) {
        ar arVarA = a(cls);
        List listEmptyList = Collections.emptyList();
        a.getClass();
        return new xb5(arVarA, listEmptyList, false);
    }
}
