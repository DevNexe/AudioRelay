package defpackage;

import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes3.dex */
public final class bi3 {
    public static final u80[] a;

    static {
        Object[] array = na4.L0(ba4.F0(ServiceLoader.load(u80.class, u80.class.getClassLoader()).iterator())).toArray(new u80[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        a = (u80[]) array;
    }
}
