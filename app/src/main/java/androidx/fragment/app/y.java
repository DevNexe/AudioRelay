package androidx.fragment.app;

import defpackage.fc2;
import defpackage.ok4;

/* JADX INFO: loaded from: classes.dex */
public class y {
    public static final ok4<ClassLoader, ok4<String, Class<?>>> a = new ok4<>();

    public static Class<?> b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        ok4<ClassLoader, ok4<String, Class<?>>> ok4Var = a;
        ok4<String, Class<?>> orDefault = ok4Var.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new ok4<>();
            ok4Var.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 != null) {
            return orDefault2;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        orDefault.put(str, cls);
        return cls;
    }

    public static Class<? extends Fragment> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.InstantiationException(fc2.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException(fc2.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public Fragment a(String str) {
        throw null;
    }
}
