package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmClassMappingKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ar implements fv1<Object>, zq {
    public static final Map<Class<? extends t81<?>>, Integer> b;
    public static final LinkedHashMap c;
    public final Class<?> a;

    static {
        int i = 0;
        List listM = ps0.M(h81.class, j81.class, x81.class, y81.class, a91.class, c91.class, e91.class, f91.class, g91.class, h91.class, i81.class, k81.class, l81.class, m81.class, n81.class, o81.class, p81.class, q81.class, r81.class, s81.class, u81.class, v81.class, w81.class);
        ArrayList arrayList = new ArrayList(mu.w0(listM, 10));
        for (Object obj : listM) {
            int i2 = i + 1;
            if (i < 0) {
                ps0.j0();
                throw null;
            }
            arrayList.add(new uy2((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = t92.V(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("pu4", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        for (String str : map.values()) {
            map3.put("kotlin.jvm.internal." + mv4.V(str) + "CompanionObject", str.concat(".Companion"));
        }
        for (Map.Entry<Class<? extends t81<?>>, Integer> entry : b.entrySet()) {
            Class<? extends t81<?>> key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            map3.put(key.getName(), "t81" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0239D.A(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), mv4.V((String) entry2.getValue()));
        }
        c = linkedHashMap;
    }

    public ar(Class<?> cls) {
        this.a = cls;
    }

    @Override // defpackage.fv1
    public final String a() {
        String str;
        Class<?> cls = this.a;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            boolean zIsArray = cls.isArray();
            LinkedHashMap linkedHashMap = c;
            if (!zIsArray) {
                String str2 = (String) linkedHashMap.get(cls.getName());
                return str2 == null ? cls.getSimpleName() : str2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                strConcat = str.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return mv4.U(simpleName, enclosingMethod.getName() + '$');
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return mv4.T(simpleName, '$');
        }
        return mv4.U(simpleName, enclosingConstructor.getName() + '$');
    }

    @Override // defpackage.fv1
    public final boolean b(Object obj) {
        Map<Class<? extends t81<?>>, Integer> map = b;
        Class<?> javaObjectType = this.a;
        Integer num = map.get(javaObjectType);
        if (num != null) {
            return sb5.e(num.intValue(), obj);
        }
        if (javaObjectType.isPrimitive()) {
            javaObjectType = JvmClassMappingKt.getJavaObjectType(JvmClassMappingKt.getKotlinClass(javaObjectType));
        }
        return javaObjectType.isInstance(obj);
    }

    @Override // defpackage.zq
    public final Class<?> c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ar) && ur1.a(JvmClassMappingKt.getJavaObjectType(this), JvmClassMappingKt.getJavaObjectType((fv1) obj));
    }

    public final int hashCode() {
        return JvmClassMappingKt.getJavaObjectType(this).hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
