package androidx.lifecycle;

import defpackage.d32;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class CQf {
    public static final CQf c = new CQf();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.CQf$CQf, reason: collision with other inner class name */
    @Deprecated
    public static final class C0025CQf {
        public final int a;
        public final Method b;

        public C0025CQf(int i, Method method) {
            this.a = i;
            this.b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0025CQf)) {
                return false;
            }
            C0025CQf c0025CQf = (C0025CQf) obj;
            return this.a == c0025CQf.a && this.b.getName().equals(c0025CQf.b.getName());
        }

        public final int hashCode() {
            return this.b.getName().hashCode() + (this.a * 31);
        }
    }

    @Deprecated
    public static class QnHx {
        public final HashMap a = new HashMap();
        public final Map<C0025CQf, YKK.CQf> b;

        public QnHx(HashMap map) {
            this.b = map;
            for (Map.Entry entry : map.entrySet()) {
                YKK.CQf cQf = (YKK.CQf) entry.getValue();
                List arrayList = (List) this.a.get(cQf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.a.put(cQf, arrayList);
                }
                arrayList.add((C0025CQf) entry.getKey());
            }
        }

        public static void a(List<C0025CQf> list, d32 d32Var, YKK.CQf cQf, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0025CQf c0025CQf = list.get(size);
                    c0025CQf.getClass();
                    try {
                        int i = c0025CQf.a;
                        Method method = c0025CQf.b;
                        if (i == 0) {
                            method.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            method.invoke(obj, d32Var);
                        } else if (i == 2) {
                            method.invoke(obj, d32Var, cQf);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    public static void c(HashMap map, C0025CQf c0025CQf, YKK.CQf cQf, Class cls) {
        YKK.CQf cQf2 = (YKK.CQf) map.get(c0025CQf);
        if (cQf2 == null || cQf == cQf2) {
            if (cQf2 == null) {
                map.put(c0025CQf, cQf);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0025CQf.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + cQf2 + ", new value " + cQf);
    }

    public final QnHx a(Class<?> cls, Method[] methodArr) {
        int i;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null) {
            map.putAll(b(superclass).b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0025CQf, YKK.CQf> entry : b(cls2).b.entrySet()) {
                c(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            byN byn = (byN) method.getAnnotation(byN.class);
            if (byn != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(d32.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                YKK.CQf cQfValue = byn.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(YKK.CQf.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (cQfValue != YKK.CQf.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c(map, new C0025CQf(i, method), cQfValue, cls);
                z = true;
            }
        }
        QnHx qnHx = new QnHx(map);
        this.a.put(cls, qnHx);
        this.b.put(cls, Boolean.valueOf(z));
        return qnHx;
    }

    public final QnHx b(Class<?> cls) {
        QnHx qnHx = (QnHx) this.a.get(cls);
        return qnHx != null ? qnHx : a(cls, null);
    }
}
