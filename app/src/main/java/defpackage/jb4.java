package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.JvmClassMappingKt;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jb4 {
    public static final Class<?> a(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return a(((ParameterizedType) type).getRawType());
        }
        if (type instanceof WildcardType) {
            return a((Type) oV9.f0(((WildcardType) type).getUpperBounds()));
        }
        if (type instanceof GenericArrayType) {
            return a(((GenericArrayType) type).getGenericComponentType());
        }
        throw new IllegalArgumentException("typeToken should be an instance of Class<?>, GenericArray, ParametrizedType or WildcardType, but actual type is " + type + ' ' + nl3.a(type.getClass()));
    }

    public static final <T> rv1<T> b(lb4 lb4Var, Class<T> cls, List<? extends rv1<Object>> list) throws IllegalAccessException, InvocationTargetException {
        rv1[] rv1VarArr = (rv1[]) list.toArray(new rv1[0]);
        rv1<T> rv1VarP = fp1.P(cls, (rv1[]) Arrays.copyOf(rv1VarArr, rv1VarArr.length));
        if (rv1VarP != null) {
            return rv1VarP;
        }
        fv1<T> kotlinClass = JvmClassMappingKt.getKotlinClass(cls);
        rv1<T> rv1Var = (rv1) he3.a.get(kotlinClass);
        return rv1Var == null ? lb4Var.b(kotlinClass, list) : rv1Var;
    }

    public static final rv1<Object> c(lb4 lb4Var, Type type, boolean z) {
        ArrayList arrayList;
        rv1<Object> rv1VarC;
        rv1<Object> rv1VarC2;
        fv1 kotlinClass;
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            if (genericComponentType instanceof WildcardType) {
                genericComponentType = (Type) oV9.f0(((WildcardType) genericComponentType).getUpperBounds());
            }
            if (z) {
                rv1VarC2 = ib4.serializer(lb4Var, genericComponentType);
            } else {
                rv1VarC2 = c(lb4Var, genericComponentType, false);
                if (rv1VarC2 == null) {
                    return null;
                }
            }
            if (genericComponentType instanceof ParameterizedType) {
                kotlinClass = JvmClassMappingKt.getKotlinClass((Class) ((ParameterizedType) genericComponentType).getRawType());
            } else {
                if (!(genericComponentType instanceof fv1)) {
                    throw new IllegalStateException("unsupported type in GenericArray: " + nl3.a(genericComponentType.getClass()));
                }
                kotlinClass = (fv1) genericComponentType;
            }
            return new ll3(kotlinClass, rv1VarC2);
        }
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!cls.isArray() || cls.getComponentType().isPrimitive()) {
                return b(lb4Var, cls, cs0.w);
            }
            Class<?> componentType = cls.getComponentType();
            if (z) {
                rv1VarC = ib4.serializer(lb4Var, componentType);
            } else {
                rv1VarC = c(lb4Var, componentType, false);
                if (rv1VarC == null) {
                    return null;
                }
            }
            return new ll3(JvmClassMappingKt.getKotlinClass(componentType), rv1VarC);
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof WildcardType) {
                return c(lb4Var, (Type) oV9.f0(((WildcardType) type).getUpperBounds()), true);
            }
            throw new IllegalArgumentException("typeToken should be an instance of Class<?>, GenericArray, ParametrizedType or WildcardType, but actual type is " + type + ' ' + nl3.a(type.getClass()));
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Class cls2 = (Class) parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (z) {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type2 : actualTypeArguments) {
                arrayList.add(ib4.serializer(lb4Var, type2));
            }
        } else {
            arrayList = new ArrayList(actualTypeArguments.length);
            for (Type type3 : actualTypeArguments) {
                rv1<Object> rv1VarC3 = c(lb4Var, type3, false);
                if (rv1VarC3 == null) {
                    return null;
                }
                arrayList.add(rv1VarC3);
            }
        }
        if (Set.class.isAssignableFrom(cls2)) {
            return new p350((rv1) arrayList.get(0), 1);
        }
        if (List.class.isAssignableFrom(cls2) || Collection.class.isAssignableFrom(cls2)) {
            return ii.a((rv1) arrayList.get(0));
        }
        if (Map.class.isAssignableFrom(cls2)) {
            return new v32((rv1) arrayList.get(0), (rv1) arrayList.get(1));
        }
        if (Map.Entry.class.isAssignableFrom(cls2)) {
            return new i92((rv1) arrayList.get(0), (rv1) arrayList.get(1));
        }
        if (uy2.class.isAssignableFrom(cls2)) {
            return new wy2((rv1) arrayList.get(0), (rv1) arrayList.get(1));
        }
        if (ib5.class.isAssignableFrom(cls2)) {
            return new jb5((rv1) arrayList.get(0), (rv1) arrayList.get(1), (rv1) arrayList.get(2));
        }
        ArrayList arrayList2 = new ArrayList(mu.w0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((rv1) it.next());
        }
        return b(lb4Var, cls2, arrayList2);
    }

    public static final rv1<Object> serializer(lb4 lb4Var, Type type) {
        rv1<Object> rv1VarC = c(lb4Var, type, true);
        if (rv1VarC != null) {
            return rv1VarC;
        }
        throw new SerializationException("Serializer for class '" + a(type).getSimpleName() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }

    public static final rv1<Object> serializer(Type type) {
        return ib4.serializer(mb4.a, type);
    }
}
