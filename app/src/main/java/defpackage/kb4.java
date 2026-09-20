package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.JvmClassMappingKt;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kb4 {
    public static final rv1<Object> a(lb4 lb4Var, sv1 sv1Var, boolean z) throws IllegalAccessException, InvocationTargetException {
        ArrayList arrayList;
        rv1<? extends Object> jb5Var;
        rv1<? extends Object> rv1VarP;
        rv1<? extends Object> rv1VarB;
        fv1 fv1VarF = bx0.f(sv1Var);
        boolean zA = sv1Var.a();
        List<vv1> listC = sv1Var.c();
        ArrayList arrayList2 = new ArrayList(mu.w0(listC, 10));
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            sv1 sv1Var2 = ((vv1) it.next()).b;
            if (sv1Var2 == null) {
                throw new IllegalArgumentException(("Star projections in type arguments are not allowed, but had " + sv1Var).toString());
            }
            arrayList2.add(sv1Var2);
        }
        if (arrayList2.isEmpty()) {
            jb5Var = fp1.P(JvmClassMappingKt.getJavaClass(fv1VarF), (rv1[]) Arrays.copyOf(new rv1[0], 0));
            if (jb5Var == null) {
                jb5Var = he3.a.get(fv1VarF);
            }
            if (jb5Var == null) {
                jb5Var = lb4Var.b(fv1VarF, cs0.w);
            }
        } else {
            if (z) {
                arrayList = new ArrayList(mu.w0(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(ib4.serializer(lb4Var, (sv1) it2.next()));
                }
            } else {
                arrayList = new ArrayList(mu.w0(arrayList2, 10));
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        rv1<Object> rv1VarA = a(lb4Var, (sv1) it3.next(), false);
                        if (rv1VarA == null) {
                            jb5Var = null;
                        } else {
                            arrayList.add(rv1VarA);
                        }
                    }
                }
            }
            if (ur1.a(fv1VarF, nl3.a(Collection.class)) ? true : ur1.a(fv1VarF, nl3.a(List.class)) ? true : ur1.a(fv1VarF, nl3.a(List.class)) ? true : ur1.a(fv1VarF, nl3.a(ArrayList.class))) {
                rv1VarB = new p350((rv1) arrayList.get(0), 0);
            } else if (ur1.a(fv1VarF, nl3.a(HashSet.class))) {
                rv1VarB = new bc1<>((rv1) arrayList.get(0));
            } else {
                if (ur1.a(fv1VarF, nl3.a(Set.class)) ? true : ur1.a(fv1VarF, nl3.a(Set.class)) ? true : ur1.a(fv1VarF, nl3.a(LinkedHashSet.class))) {
                    rv1VarB = new p350((rv1) arrayList.get(0), 1);
                } else if (ur1.a(fv1VarF, nl3.a(HashMap.class))) {
                    rv1VarB = new zb1<>((rv1) arrayList.get(0), (rv1) arrayList.get(1));
                } else {
                    if (ur1.a(fv1VarF, nl3.a(Map.class)) ? true : ur1.a(fv1VarF, nl3.a(Map.class)) ? true : ur1.a(fv1VarF, nl3.a(LinkedHashMap.class))) {
                        rv1VarB = new v32<>((rv1) arrayList.get(0), (rv1) arrayList.get(1));
                    } else {
                        if (ur1.a(fv1VarF, nl3.a(Map.Entry.class))) {
                            rv1VarP = new i92<>((rv1) arrayList.get(0), (rv1) arrayList.get(1));
                        } else if (ur1.a(fv1VarF, nl3.a(uy2.class))) {
                            rv1VarP = new wy2<>((rv1) arrayList.get(0), (rv1) arrayList.get(1));
                        } else if (ur1.a(fv1VarF, nl3.a(ib5.class))) {
                            jb5Var = new jb5((rv1) arrayList.get(0), (rv1) arrayList.get(1), (rv1) arrayList.get(2));
                        } else if (JvmClassMappingKt.getJavaClass(fv1VarF).isArray()) {
                            rv1VarP = new ll3<>((fv1) ((sv1) arrayList2.get(0)).d(), (rv1) arrayList.get(0));
                        } else {
                            rv1[] rv1VarArr = (rv1[]) arrayList.toArray(new rv1[0]);
                            rv1[] rv1VarArr2 = (rv1[]) Arrays.copyOf(rv1VarArr, rv1VarArr.length);
                            rv1VarP = fp1.P(JvmClassMappingKt.getJavaClass(fv1VarF), (rv1[]) Arrays.copyOf(rv1VarArr2, rv1VarArr2.length));
                            if (rv1VarP == null) {
                                rv1VarP = fp1.P(JvmClassMappingKt.getJavaClass(fv1VarF), (rv1[]) Arrays.copyOf(new rv1[0], 0));
                                if (rv1VarP == null) {
                                    rv1VarP = he3.a.get(fv1VarF);
                                }
                                if (rv1VarP == null) {
                                    rv1VarB = lb4Var.b(fv1VarF, arrayList);
                                }
                            }
                        }
                        jb5Var = rv1VarP;
                    }
                }
            }
            jb5Var = rv1VarB;
        }
        if (jb5Var == null) {
            jb5Var = null;
        }
        if (jb5Var != null) {
            return zA ? ii.b(jb5Var) : jb5Var;
        }
        return null;
    }

    public static final <T> rv1<T> serializer(fv1<T> fv1Var) throws IllegalAccessException, InvocationTargetException {
        rv1<T> rv1VarP = fp1.P(JvmClassMappingKt.getJavaClass((fv1) fv1Var), (rv1[]) Arrays.copyOf(new rv1[0], 0));
        if (rv1VarP == null) {
            rv1VarP = (rv1) he3.a.get(fv1Var);
        }
        if (rv1VarP != null) {
            return rv1VarP;
        }
        bx0.g(fv1Var);
        throw null;
    }

    public static final rv1<Object> serializer(lb4 lb4Var, sv1 sv1Var) throws IllegalAccessException, InvocationTargetException {
        rv1<Object> rv1VarA = a(lb4Var, sv1Var, true);
        if (rv1VarA != null) {
            return rv1VarA;
        }
        bx0.g(bx0.f(sv1Var));
        throw null;
    }

    public static final rv1<Object> serializer(sv1 sv1Var) {
        return ib4.serializer(mb4.a, sv1Var);
    }

    public static final <T> rv1<T> serializer() {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static final <T> rv1<T> serializer(lb4 lb4Var) {
        throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }
}
