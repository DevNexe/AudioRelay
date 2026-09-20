package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class c53 {
    public static final b53 a;

    /* JADX WARN: Code duplicated, block: B:74:0x00c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        int i;
        b53 b53Var;
        Object objNewInstance;
        String property = System.getProperty("java.specification.version");
        if (property == null) {
            i = 65542;
        } else {
            int iE = mv4.E(property, '.', 0, false, 6);
            try {
                if (iE < 0) {
                    i = Integer.parseInt(property) * 65536;
                } else {
                    int i2 = iE + 1;
                    int iE2 = mv4.E(property, '.', i2, false, 4);
                    if (iE2 < 0) {
                        iE2 = property.length();
                    }
                    String strSubstring = property.substring(0, iE);
                    i = Integer.parseInt(property.substring(i2, iE2)) + (Integer.parseInt(strSubstring) * 65536);
                }
            } catch (NumberFormatException unused) {
                i = 65542;
            }
        }
        if (i >= 65544 || i < 65536) {
            try {
                Object objNewInstance2 = is1.class.newInstance();
                try {
                    try {
                        b53Var = (b53) objNewInstance2;
                    } catch (ClassNotFoundException unused2) {
                        if (i < 65543) {
                            try {
                                objNewInstance = hs1.class.newInstance();
                                try {
                                    try {
                                        b53Var = (b53) objNewInstance;
                                    } catch (ClassCastException e) {
                                        ClassLoader classLoader = objNewInstance.getClass().getClassLoader();
                                        ClassLoader classLoader2 = b53.class.getClassLoader();
                                        if (ur1.a(classLoader, classLoader2)) {
                                            throw e;
                                        }
                                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e);
                                    }
                                } catch (ClassNotFoundException unused3) {
                                    b53Var = new b53();
                                }
                            } catch (ClassNotFoundException unused4) {
                                Object objNewInstance3 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                                try {
                                    b53Var = (b53) objNewInstance3;
                                } catch (ClassCastException e2) {
                                    ClassLoader classLoader3 = objNewInstance3.getClass().getClassLoader();
                                    ClassLoader classLoader4 = b53.class.getClassLoader();
                                    if (ur1.a(classLoader3, classLoader4)) {
                                        throw e2;
                                    }
                                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e2);
                                }
                            }
                        } else {
                            objNewInstance = hs1.class.newInstance();
                            b53Var = (b53) objNewInstance;
                        }
                    }
                } catch (ClassCastException e3) {
                    ClassLoader classLoader5 = objNewInstance2.getClass().getClassLoader();
                    ClassLoader classLoader6 = b53.class.getClassLoader();
                    if (ur1.a(classLoader5, classLoader6)) {
                        throw e3;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e3);
                }
            } catch (ClassNotFoundException unused5) {
                Object objNewInstance4 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
                try {
                    b53Var = (b53) objNewInstance4;
                } catch (ClassCastException e4) {
                    ClassLoader classLoader7 = objNewInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = b53.class.getClassLoader();
                    if (ur1.a(classLoader7, classLoader8)) {
                        throw e4;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e4);
                }
            }
        } else if (i < 65543 || i < 65536) {
            objNewInstance = hs1.class.newInstance();
            b53Var = (b53) objNewInstance;
        } else {
            b53Var = new b53();
        }
        a = b53Var;
    }
}
