package defpackage;

import com.google.android.gms.internal.measurement.com5Fixed;
import com.google.android.gms.internal.measurement.tN;
import com.google.android.gms.internal.measurement.zzjj;
import com.google.protobuf.ta;
import com.google.protobuf.v2zj;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class z37 {
    public static final Class a = ta.class;
    public static final m47 b = v(false);
    public static final m47 c = v(true);
    public static final tN d = new tN();

    public static int A(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j07.e(i << 3) + 4) * size;
    }

    public static int B(List list) {
        return list.size() * 4;
    }

    public static int C(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j07.e(i << 3) + 8) * size;
    }

    public static int D(List list) {
        return list.size() * 8;
    }

    public static int E(int i, List list, y37 y37Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iV = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iV += j07.v(i, (q37) list.get(i2), y37Var);
        }
        return iV;
    }

    public static int F(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j07.y(i) * size) + G(list);
    }

    public static int G(List list) {
        int iW;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s17) {
            s17 s17Var = (s17) list;
            iW = 0;
            while (i < size) {
                s17Var.b(i);
                iW += j07.w(s17Var.x[i]);
                i++;
            }
        } else {
            iW = 0;
            while (i < size) {
                iW += j07.w(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iW;
    }

    public static int H(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (j07.y(i) * list.size()) + I(list);
    }

    public static int I(List list) {
        int iF;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a37) {
            a37 a37Var = (a37) list;
            iF = 0;
            while (i < size) {
                a37Var.c(i);
                iF += j07.f(a37Var.x[i]);
                i++;
            }
        } else {
            iF = 0;
            while (i < size) {
                iF += j07.f(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iF;
    }

    public static int J(int i, y37 y37Var, Object obj) {
        int i2;
        if (obj instanceof k27) {
            k27 k27Var = (k27) obj;
            int iE = j07.e(i << 3);
            if (k27Var.b != null) {
                i2 = ((vz6) k27Var.b).y.length;
            } else {
                i2 = k27Var.a != null ? k27Var.a.i() : 0;
            }
            return j07.e(i2) + i2 + iE;
        }
        int iE2 = j07.e(i << 3);
        com5Fixed com5Var = (com5Fixed) ((q37) obj);
        int iB = com5Var.b();
        if (iB == -1) {
            iB = y37Var.zza(com5Var);
            com5Var.f(iB);
        }
        return j07.e(iB) + iB + iE2;
    }

    public static int K(int i, List list, y37 y37Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = j07.y(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof k27) {
                k27 k27Var = (k27) obj;
                int length = k27Var.b != null ? ((vz6) k27Var.b).y.length : k27Var.a != null ? k27Var.a.i() : 0;
                iY = j07.e(length) + length + iY;
            } else {
                com5Fixed com5Var = (com5Fixed) ((q37) obj);
                int iB = com5Var.b();
                if (iB == -1) {
                    iB = y37Var.zza(com5Var);
                    com5Var.f(iB);
                }
                iY = j07.e(iB) + iB + iY;
            }
        }
        return iY;
    }

    public static int L(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j07.y(i) * size) + M(list);
    }

    public static int M(List list) {
        int iE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s17) {
            s17 s17Var = (s17) list;
            iE = 0;
            while (i < size) {
                s17Var.b(i);
                int i2 = s17Var.x[i];
                iE += j07.e((i2 >> 31) ^ (i2 + i2));
                i++;
            }
        } else {
            iE = 0;
            while (i < size) {
                int iIntValue = ((Integer) list.get(i)).intValue();
                iE += j07.e((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i++;
            }
        }
        return iE;
    }

    public static int N(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j07.y(i) * size) + O(list);
    }

    public static int O(List list) {
        int iF;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a37) {
            a37 a37Var = (a37) list;
            iF = 0;
            while (i < size) {
                a37Var.c(i);
                long j = a37Var.x[i];
                iF += j07.f((j >> 63) ^ (j + j));
                i++;
            }
        } else {
            iF = 0;
            while (i < size) {
                long jLongValue = ((Long) list.get(i)).longValue();
                iF += j07.f((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i++;
            }
        }
        return iF;
    }

    public static int P(List list, int i) {
        int iX;
        int iX2;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iY = j07.y(i) * size;
        if (list instanceof m27) {
            m27 m27Var = (m27) list;
            while (i2 < size) {
                Object objZzf = m27Var.zzf(i2);
                if (objZzf instanceof a07) {
                    int iC = ((a07) objZzf).c();
                    iX2 = j07.e(iC) + iC;
                } else {
                    iX2 = j07.x((String) objZzf);
                }
                iY += iX2;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof a07) {
                    int iC2 = ((a07) obj).c();
                    iX = j07.e(iC2) + iC2;
                } else {
                    iX = j07.x((String) obj);
                }
                iY += iX;
                i2++;
            }
        }
        return iY;
    }

    public static int Q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j07.y(i) * size) + R(list);
    }

    public static int R(List list) {
        int iE;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s17) {
            s17 s17Var = (s17) list;
            iE = 0;
            while (i < size) {
                s17Var.b(i);
                iE += j07.e(s17Var.x[i]);
                i++;
            }
        } else {
            iE = 0;
            while (i < size) {
                iE += j07.e(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iE;
    }

    public static int S(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j07.y(i) * size) + T(list);
    }

    public static int T(List list) {
        int iF;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a37) {
            a37 a37Var = (a37) list;
            iF = 0;
            while (i < size) {
                a37Var.c(i);
                iF += j07.f(a37Var.x[i]);
                i++;
            }
        } else {
            iF = 0;
            while (i < size) {
                iF += j07.f(((Long) list.get(i)).longValue());
                i++;
            }
        }
        return iF;
    }

    public static Object a(int i, d27 d27Var, v17 v17Var, n47 n47Var, m47 m47Var) {
        if (v17Var == null) {
            return n47Var;
        }
        if (d27Var instanceof RandomAccess) {
            int size = d27Var.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int iIntValue = ((Integer) d27Var.get(i3)).intValue();
                if (v17Var.zza(iIntValue)) {
                    if (i3 != i2) {
                        d27Var.set(i2, Integer.valueOf(iIntValue));
                    }
                    i2++;
                } else {
                    if (n47Var == null) {
                        n47Var = m47Var.e();
                    }
                    m47Var.f(n47Var, iIntValue, i);
                }
            }
            if (i2 != size) {
                d27Var.subList(i2, size).clear();
                return n47Var;
            }
        } else {
            Iterator it = d27Var.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!v17Var.zza(iIntValue2)) {
                    if (n47Var == null) {
                        n47Var = m47Var.e();
                    }
                    m47Var.f(n47Var, iIntValue2, i);
                    it.remove();
                }
            }
        }
        return n47Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void b(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                j07Var.h(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        j07Var.s(i3);
        while (i2 < list.size()) {
            j07Var.g(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void c(int i, List list, l07 l07Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l07Var.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            l07Var.a.i(i, (a07) list.get(i2));
        }
    }

    public static void d(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                j07Var.l(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        j07Var.s(i3);
        while (i2 < list.size()) {
            j07Var.m(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void e(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                j07Var.n(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int iW = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iW += j07.w(((Integer) list.get(i3)).intValue());
        }
        j07Var.s(iW);
        while (i2 < list.size()) {
            j07Var.o(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void f(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                j07Var.j(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        j07Var.s(i3);
        while (i2 < list.size()) {
            j07Var.k(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void g(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                j07Var.l(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        j07Var.s(i3);
        while (i2 < list.size()) {
            j07Var.m(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void h(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                j07Var.j(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        j07Var.s(i3);
        while (i2 < list.size()) {
            j07Var.k(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void i(int i, List list, l07 l07Var, y37 y37Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            l07Var.l(i, y37Var, list.get(i2));
        }
    }

    public static void j(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                j07Var.n(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int iW = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iW += j07.w(((Integer) list.get(i3)).intValue());
        }
        j07Var.s(iW);
        while (i2 < list.size()) {
            j07Var.o(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void k(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                j07Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += j07.f(((Long) list.get(i3)).longValue());
        }
        j07Var.s(iF);
        while (i2 < list.size()) {
            j07Var.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void l(int i, List list, l07 l07Var, y37 y37Var) throws zzjj {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            l07Var.o(i, y37Var, list.get(i2));
        }
    }

    public static void m(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                j07Var.j(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        j07Var.s(i3);
        while (i2 < list.size()) {
            j07Var.k(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void n(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                j07Var.l(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        j07Var.s(i3);
        while (i2 < list.size()) {
            j07Var.m(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void o(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                j07Var.r(i, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iE += j07.e((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        j07Var.s(iE);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            j07Var.s((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i2++;
        }
    }

    public static void p(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                j07Var.t(i, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iF += j07.f((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        j07Var.s(iF);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            j07Var.u((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i2++;
        }
    }

    public static void q(int i, List list, l07 l07Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        l07Var.getClass();
        boolean z = list instanceof m27;
        int i2 = 0;
        j07 j07Var = l07Var.a;
        if (!z) {
            while (i2 < list.size()) {
                j07Var.p(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        m27 m27Var = (m27) list;
        while (i2 < list.size()) {
            Object objZzf = m27Var.zzf(i2);
            if (objZzf instanceof String) {
                j07Var.p(i, (String) objZzf);
            } else {
                j07Var.i(i, (a07) objZzf);
            }
            i2++;
        }
    }

    public static void r(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                j07Var.r(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int iE = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iE += j07.e(((Integer) list.get(i3)).intValue());
        }
        j07Var.s(iE);
        while (i2 < list.size()) {
            j07Var.s(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void s(int i, List list, l07 l07Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        j07 j07Var = l07Var.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                j07Var.t(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        j07Var.q(i, 2);
        int iF = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF += j07.f(((Long) list.get(i3)).longValue());
        }
        j07Var.s(iF);
        while (i2 < list.size()) {
            j07Var.u(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean t(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int u(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j07.e(i << 3) + 1) * size;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    public static m47 v(boolean z) {
        if (v2zj.class == 0) {
            return null;
        }
        try {
            return (m47) v2zj.class.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int w(List list) {
        return list.size();
    }

    public static int x(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = j07.y(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int iC = ((a07) list.get(i2)).c();
            iY += j07.e(iC) + iC;
        }
        return iY;
    }

    public static int y(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (j07.y(i) * size) + z(list);
    }

    public static int z(List list) {
        int iW;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof s17) {
            s17 s17Var = (s17) list;
            iW = 0;
            while (i < size) {
                s17Var.b(i);
                iW += j07.w(s17Var.x[i]);
                i++;
            }
        } else {
            iW = 0;
            while (i < size) {
                iW += j07.w(((Integer) list.get(i)).intValue());
                i++;
            }
        }
        return iW;
    }
}
