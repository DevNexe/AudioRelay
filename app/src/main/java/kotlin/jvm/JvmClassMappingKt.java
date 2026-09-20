package kotlin.jvm;

import defpackage.fv1;
import defpackage.nl3;
import defpackage.zq;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes3.dex */
public final class JvmClassMappingKt {
    public static final <T extends Annotation> fv1<? extends T> getAnnotationClass(T t) {
        return getKotlinClass(t.annotationType());
    }

    private static final <E extends Enum<E>> Class<E> getDeclaringJavaClass(E e) {
        return e.getDeclaringClass();
    }

    public static /* synthetic */ void getDeclaringJavaClass$annotations(Enum r0) {
    }

    public static final <T> Class<T> getJavaClass(fv1<T> fv1Var) {
        return (Class<T>) ((zq) fv1Var).c();
    }

    public static /* synthetic */ void getJavaClass$annotations(fv1 fv1Var) {
    }

    public static final <T> Class<T> getJavaObjectType(fv1<T> fv1Var) {
        Class<T> cls = (Class<T>) ((zq) fv1Var).c();
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? cls : Double.class;
            case 104431:
                return !name.equals("int") ? cls : Integer.class;
            case 3039496:
                return !name.equals("byte") ? cls : Byte.class;
            case 3052374:
                return !name.equals("char") ? cls : Character.class;
            case 3327612:
                return !name.equals("long") ? cls : Long.class;
            case 3625364:
                return !name.equals("void") ? cls : Void.class;
            case 64711720:
                return !name.equals("boolean") ? cls : Boolean.class;
            case 97526364:
                return !name.equals("float") ? cls : Float.class;
            case 109413500:
                return !name.equals("short") ? cls : Short.class;
            default:
                return cls;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final <T> Class<T> getJavaPrimitiveType(fv1<T> fv1Var) {
        Class<T> cls = (Class<T>) ((zq) fv1Var).c();
        if (cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final <T> fv1<T> getKotlinClass(Class<T> cls) {
        return nl3.a(cls);
    }

    public static final <T> Class<fv1<T>> getRuntimeClassOfKClassInstance(fv1<T> fv1Var) {
        return (Class<fv1<T>>) fv1Var.getClass();
    }

    public static /* synthetic */ void getRuntimeClassOfKClassInstance$annotations(fv1 fv1Var) {
    }

    public static final boolean isArrayOf(Object[] objArr) {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final <T> Class<T> getJavaClass(T t) {
        return (Class<T>) t.getClass();
    }
}
