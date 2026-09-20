package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import defpackage.Bt7j;
import defpackage.fc2;
import defpackage.qh5;
import defpackage.rh5;
import defpackage.sh5;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class VersionedParcel {
    public final Bt7j<String, Method> a;
    public final Bt7j<String, Method> b;
    public final Bt7j<String, Class> c;

    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(Bt7j<String, Method> bt7j, Bt7j<String, Method> bt7j2, Bt7j<String, Class> bt7j3) {
        this.a = bt7j;
        this.b = bt7j2;
        this.c = bt7j3;
    }

    public abstract void A(boolean z);

    public final void B(int i, Bundle bundle) {
        y(i);
        C(bundle);
    }

    public abstract void C(Bundle bundle);

    public abstract void D(byte[] bArr);

    public abstract void E(CharSequence charSequence);

    public final void F(int i, Collection collection) {
        int i2;
        y(i);
        if (collection == null) {
            H(-1);
            return;
        }
        int size = collection.size();
        H(size);
        if (size > 0) {
            Object next = collection.iterator().next();
            if (next instanceof String) {
                i2 = 4;
            } else if (next instanceof Parcelable) {
                i2 = 2;
            } else if (next instanceof sh5) {
                i2 = 1;
            } else if (next instanceof Serializable) {
                i2 = 3;
            } else if (next instanceof IBinder) {
                i2 = 5;
            } else if (next instanceof Integer) {
                i2 = 7;
            } else {
                if (!(next instanceof Float)) {
                    throw new IllegalArgumentException(next.getClass().getName().concat(" cannot be VersionedParcelled"));
                }
                i2 = 8;
            }
            H(i2);
            switch (i2) {
                case 1:
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        Q((sh5) it.next());
                    }
                    return;
                case 2:
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        L((Parcelable) it2.next());
                    }
                    return;
                case 3:
                    Iterator it3 = collection.iterator();
                    while (it3.hasNext()) {
                        Serializable serializable = (Serializable) it3.next();
                        if (serializable == null) {
                            O(null);
                        } else {
                            String name = serializable.getClass().getName();
                            O(name);
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                objectOutputStream.writeObject(serializable);
                                objectOutputStream.close();
                                D(byteArrayOutputStream.toByteArray());
                            } catch (IOException e) {
                                throw new RuntimeException(fc2.a("VersionedParcelable encountered IOException writing serializable object (name = ", name, ")"), e);
                            }
                        }
                    }
                    return;
                case 4:
                    Iterator it4 = collection.iterator();
                    while (it4.hasNext()) {
                        O((String) it4.next());
                    }
                    return;
                case 5:
                    Iterator it5 = collection.iterator();
                    while (it5.hasNext()) {
                        P((IBinder) it5.next());
                    }
                    return;
                case 6:
                default:
                    return;
                case 7:
                    Iterator it6 = collection.iterator();
                    while (it6.hasNext()) {
                        H(((Integer) it6.next()).intValue());
                    }
                    return;
                case 8:
                    Iterator it7 = collection.iterator();
                    while (it7.hasNext()) {
                        G(((Float) it7.next()).floatValue());
                    }
                    return;
            }
        }
    }

    public abstract void G(float f);

    public abstract void H(int i);

    public final void I(int i, int i2) {
        y(i2);
        H(i);
    }

    public final void J(int i, long j) {
        y(i);
        K(j);
    }

    public abstract void K(long j);

    public abstract void L(Parcelable parcelable);

    public final void M(Parcelable parcelable, int i) {
        y(i);
        L(parcelable);
    }

    public final void N(int i, String str) {
        y(i);
        O(str);
    }

    public abstract void O(String str);

    public abstract void P(IBinder iBinder);

    /* JADX WARN: Multi-variable type inference failed */
    public final void Q(sh5 sh5Var) {
        if (sh5Var == null) {
            O(null);
            return;
        }
        try {
            O(b(sh5Var.getClass()).getName());
            rh5 rh5VarA = a();
            try {
                d(sh5Var.getClass()).invoke(null, sh5Var, rh5VarA);
                rh5VarA.S();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(sh5Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public final void R(sh5 sh5Var, int i) {
        y(i);
        Q(sh5Var);
    }

    public abstract rh5 a();

    public final Class b(Class<? extends sh5> cls) throws ClassNotFoundException {
        String name = cls.getName();
        Bt7j<String, Class> bt7j = this.c;
        Class orDefault = bt7j.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        bt7j.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method c(String str) throws NoSuchMethodException {
        Bt7j<String, Method> bt7j = this.a;
        Method orDefault = bt7j.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        bt7j.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        String name = cls.getName();
        Bt7j<String, Method> bt7j = this.b;
        Method orDefault = bt7j.getOrDefault(name, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, VersionedParcel.class);
        bt7j.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e();

    public final boolean f(int i, boolean z) {
        return !l(i) ? z : e();
    }

    public abstract Bundle g();

    public final Bundle h(int i, Bundle bundle) {
        return !l(i) ? bundle : g();
    }

    public abstract byte[] i();

    public abstract CharSequence j();

    public final <T, S extends Collection<T>> S k(S s) {
        Serializable serializable;
        int iN = n();
        if (iN < 0) {
            return null;
        }
        if (iN != 0) {
            int iN2 = n();
            if (iN < 0) {
                return null;
            }
            if (iN2 == 1) {
                while (iN > 0) {
                    s.add(w());
                    iN--;
                }
            } else if (iN2 == 2) {
                while (iN > 0) {
                    s.add(r());
                    iN--;
                }
            } else if (iN2 == 3) {
                while (iN > 0) {
                    String strT = t();
                    if (strT == null) {
                        serializable = null;
                    } else {
                        try {
                            serializable = (Serializable) new qh5(new ByteArrayInputStream(i())).readObject();
                        } catch (IOException e) {
                            throw new RuntimeException(fc2.a("VersionedParcelable encountered IOException reading a Serializable object (name = ", strT, ")"), e);
                        } catch (ClassNotFoundException e2) {
                            throw new RuntimeException(fc2.a("VersionedParcelable encountered ClassNotFoundException reading a Serializable object (name = ", strT, ")"), e2);
                        }
                    }
                    s.add(serializable);
                    iN--;
                }
            } else if (iN2 == 4) {
                while (iN > 0) {
                    s.add(t());
                    iN--;
                }
            } else if (iN2 == 5) {
                while (iN > 0) {
                    s.add(v());
                    iN--;
                }
            }
        }
        return s;
    }

    public abstract boolean l(int i);

    public abstract float m();

    public abstract int n();

    public final int o(int i, int i2) {
        return !l(i2) ? i : n();
    }

    public abstract long p();

    public final long q(int i, long j) {
        return !l(i) ? j : p();
    }

    public abstract <T extends Parcelable> T r();

    public final <T extends Parcelable> T s(T t, int i) {
        return !l(i) ? t : (T) r();
    }

    public abstract String t();

    public final String u(int i, String str) {
        return !l(i) ? str : t();
    }

    public abstract IBinder v();

    public final <T extends sh5> T w() {
        String strT = t();
        if (strT == null) {
            return null;
        }
        try {
            return (T) c(strT).invoke(null, a());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public final <T extends sh5> T x(T t, int i) {
        return !l(i) ? t : (T) w();
    }

    public abstract void y(int i);

    public final void z(int i, boolean z) {
        y(i);
        A(z);
    }
}
