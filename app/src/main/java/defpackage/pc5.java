package defpackage;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.JvmClassMappingKt;

/* JADX INFO: loaded from: classes3.dex */
public final class pc5 {

    public /* synthetic */ class QnHx {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[O.j(3).length];
            iArr[1] = 1;
            iArr[0] = 2;
            iArr[2] = 3;
            a = iArr;
        }
    }

    public static final String a(Type type) {
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (!cls.isArray()) {
            return cls.getName();
        }
        x94 x94VarG0 = ba4.G0(type, qc5.F);
        StringBuilder sb = new StringBuilder();
        sb.append(((Class) na4.J0(x94VarG0)).getName());
        Iterator it = x94VarG0.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                ps0.i0();
                throw null;
            }
        }
        sb.append(iv4.u(i, "[]"));
        return sb.toString();
    }

    public static final Type b(sv1 sv1Var, boolean z) {
        gv1 gv1VarD = sv1Var.d();
        if (gv1VarD instanceof uv1) {
            return new yb5((uv1) gv1VarD);
        }
        if (!(gv1VarD instanceof fv1)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + sv1Var);
        }
        Class javaObjectType = z ? JvmClassMappingKt.getJavaObjectType((fv1) gv1VarD) : JvmClassMappingKt.getJavaClass((fv1) gv1VarD);
        List<vv1> listC = sv1Var.c();
        if (listC.isEmpty()) {
            return javaObjectType;
        }
        if (!javaObjectType.isArray()) {
            return c(javaObjectType, listC);
        }
        if (javaObjectType.getComponentType().isPrimitive()) {
            return javaObjectType;
        }
        vv1 vv1Var = (vv1) wu.X0(listC);
        if (vv1Var == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + sv1Var);
        }
        int i = vv1Var.a;
        int i2 = i == 0 ? -1 : QnHx.a[O.h(i)];
        if (i2 == -1 || i2 == 1) {
            return javaObjectType;
        }
        if (i2 != 2 && i2 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Type typeB = b(vv1Var.b, false);
        return typeB instanceof Class ? javaObjectType : new aa1(typeB);
    }

    public static final ez2 c(Class cls, List list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List list2 = list;
            ArrayList arrayList = new ArrayList(mu.w0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(d((vv1) it.next()));
            }
            return new ez2(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            List list3 = list;
            ArrayList arrayList2 = new ArrayList(mu.w0(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList2.add(d((vv1) it2.next()));
            }
            return new ez2(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        ez2 ez2VarC = c(declaringClass, list.subList(length, list.size()));
        List listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(mu.w0(listSubList, 10));
        Iterator it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(d((vv1) it3.next()));
        }
        return new ez2(cls, ez2VarC, arrayList3);
    }

    public static final Type d(vv1 vv1Var) {
        int i = vv1Var.a;
        if (i == 0) {
            return dm5.y;
        }
        int iH = O.h(i);
        sv1 sv1Var = vv1Var.b;
        if (iH == 0) {
            return b(sv1Var, true);
        }
        if (iH == 1) {
            return new dm5(null, b(sv1Var, true));
        }
        if (iH == 2) {
            return new dm5(b(sv1Var, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Type e(xb5 xb5Var) {
        Type typeB;
        return (!(xb5Var instanceof tv1) || (typeB = ((tv1) xb5Var).b()) == null) ? b(xb5Var, false) : typeB;
    }
}
