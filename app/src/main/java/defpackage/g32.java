package defpackage;

import androidx.lifecycle.CQf;
import androidx.lifecycle.F1;
import androidx.lifecycle.byN;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class g32 {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static F1 a(Constructor<? extends F1> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    public static String b(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:70:0x0100 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0102  */
    /* JADX WARN: Code duplicated, block: B:75:0x0115  */
    /* JADX WARN: Code duplicated, block: B:86:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0110 A[SYNTHETIC] */
    public static int c(Class<?> cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int i;
        boolean z;
        HashMap map = a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r4 != null ? r4.getName() : "";
                if (!name.isEmpty()) {
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                String strB = b(canonicalName);
                if (!name.isEmpty()) {
                    strB = name + "." + strB;
                }
                declaredConstructor = Class.forName(strB).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap map2 = b;
            if (declaredConstructor != null) {
                map2.put(cls, Collections.singletonList(declaredConstructor));
            } else {
                CQf cQf = CQf.c;
                HashMap map3 = cQf.b;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((byN) declaredMethods[i3].getAnnotation(byN.class)) != null) {
                                cQf.a(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i3++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!zBooleanValue) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (!(superclass != null && c32.class.isAssignableFrom(superclass))) {
                        for (Class<?> cls2 : cls.getInterfaces()) {
                            if (cls2 == null && c32.class.isAssignableFrom(cls2)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (c(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll((Collection) map2.get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    } else if (c(superclass) != 1) {
                        arrayList = new ArrayList((Collection) map2.get(superclass));
                        while (i < r7) {
                            if (cls2 == null) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (c(cls2) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                    }
                                    arrayList.addAll((Collection) map2.get(cls2));
                                }
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i2 = 2;
        }
        map.put(cls, Integer.valueOf(i2));
        return i2;
    }
}
