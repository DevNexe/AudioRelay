package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class sb5 {
    public static Collection a(Collection collection) {
        if ((collection instanceof jv1) && !(collection instanceof kv1)) {
            f(collection, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return collection;
        } catch (ClassCastException e) {
            ur1.c(sb5.class.getName(), e);
            throw e;
        }
    }

    public static List b(Object obj) {
        if ((obj instanceof jv1) && !(obj instanceof lv1)) {
            f(obj, "kotlin.collections.MutableList");
            throw null;
        }
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            ur1.c(sb5.class.getName(), e);
            throw e;
        }
    }

    public static Map c(AbstractMap abstractMap) {
        if (!(abstractMap instanceof jv1) || (abstractMap instanceof mv1)) {
            return abstractMap;
        }
        f(abstractMap, "kotlin.collections.MutableMap");
        throw null;
    }

    public static void d(int i, Object obj) {
        if (obj == null || e(i, obj)) {
            return;
        }
        f(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static boolean e(int i, Object obj) {
        int arity;
        if (!(obj instanceof t81)) {
            return false;
        }
        if (obj instanceof j91) {
            arity = ((j91) obj).getArity();
        } else if (obj instanceof h81) {
            arity = 0;
        } else if (obj instanceof j81) {
            arity = 1;
        } else if (obj instanceof x81) {
            arity = 2;
        } else if (obj instanceof y81) {
            arity = 3;
        } else if (obj instanceof a91) {
            arity = 4;
        } else if (obj instanceof c91) {
            arity = 5;
        } else if (obj instanceof e91) {
            arity = 6;
        } else if (obj instanceof f91) {
            arity = 7;
        } else if (obj instanceof g91) {
            arity = 8;
        } else if (obj instanceof h91) {
            arity = 9;
        } else if (obj instanceof i81) {
            arity = 10;
        } else if (obj instanceof k81) {
            arity = 11;
        } else if (obj instanceof l81) {
            arity = 12;
        } else if (obj instanceof m81) {
            arity = 13;
        } else if (obj instanceof n81) {
            arity = 14;
        } else if (obj instanceof o81) {
            arity = 15;
        } else if (obj instanceof p81) {
            arity = 16;
        } else if (obj instanceof q81) {
            arity = 17;
        } else if (obj instanceof r81) {
            arity = 18;
        } else if (obj instanceof s81) {
            arity = 19;
        } else if (obj instanceof u81) {
            arity = 20;
        } else if (obj instanceof v81) {
            arity = 21;
        } else {
            arity = obj instanceof w81 ? 22 : -1;
        }
        return arity == i;
    }

    public static void f(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(LPt6Fixed.a(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        ur1.c(sb5.class.getName(), classCastException);
        throw classCastException;
    }
}
