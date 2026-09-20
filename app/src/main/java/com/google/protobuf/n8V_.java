package com.google.protobuf;

import defpackage.de5;
import defpackage.i22;
import defpackage.lk;
import defpackage.n54;
import defpackage.ud5;
import java.lang.reflect.Field;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class n8V_ {
    public static final Class<?> a = lPt3Fixed.class;
    public static final lpT2Fixed<?, ?> b = A(false);
    public static final lpT2Fixed<?, ?> c = A(true);
    public static final ud5 d = new ud5();

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public static lpT2Fixed<?, ?> A(boolean z) {
        if (v2zj.class == 0) {
            return null;
        }
        try {
            return (lpT2Fixed) v2zj.class.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void C(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ykk.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.w1(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            Logger logger = CodedOutputStream.x;
            i3++;
        }
        codedOutputStream.P1(i3);
        while (i2 < list.size()) {
            codedOutputStream.v1(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void D(int i, List list, YKK ykk) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ykk.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ykk.a.y1(i, (lk) list.get(i2));
        }
    }

    public static void E(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ykk.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                double dDoubleValue = ((Double) list.get(i2)).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.C1(i, Double.doubleToRawLongBits(dDoubleValue));
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            Logger logger = CodedOutputStream.x;
            i3 += 8;
        }
        codedOutputStream.P1(i3);
        while (i2 < list.size()) {
            codedOutputStream.D1(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void F(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ykk.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.E1(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int iF1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF1 += CodedOutputStream.f1(((Integer) list.get(i3)).intValue());
        }
        codedOutputStream.P1(iF1);
        while (i2 < list.size()) {
            codedOutputStream.F1(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void G(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ykk.f(i, list, z);
    }

    public static void H(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ykk.h(i, list, z);
    }

    public static void I(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ykk.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                float fFloatValue = ((Float) list.get(i2)).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.A1(i, Float.floatToRawIntBits(fFloatValue));
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            Logger logger = CodedOutputStream.x;
            i3 += 4;
        }
        codedOutputStream.P1(i3);
        while (i2 < list.size()) {
            codedOutputStream.B1(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void J(int i, List list, YKK ykk, n54 n54Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ykk.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ykk.j(i, n54Var, list.get(i2));
        }
    }

    public static void K(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ykk.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.E1(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int iF1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iF1 += CodedOutputStream.f1(((Integer) list.get(i3)).intValue());
        }
        codedOutputStream.P1(iF1);
        while (i2 < list.size()) {
            codedOutputStream.F1(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void L(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ykk.m(i, list, z);
    }

    public static void M(int i, List list, YKK ykk, n54 n54Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ykk.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            ykk.n(i, n54Var, list.get(i2));
        }
    }

    public static void N(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ykk.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.A1(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            Logger logger = CodedOutputStream.x;
            i3 += 4;
        }
        codedOutputStream.P1(i3);
        while (i2 < list.size()) {
            codedOutputStream.B1(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void O(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ykk.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.C1(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            Logger logger = CodedOutputStream.x;
            i3 += 8;
        }
        codedOutputStream.P1(i3);
        while (i2 < list.size()) {
            codedOutputStream.D1(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void P(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ykk.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                int iIntValue = ((Integer) list.get(i2)).intValue();
                codedOutputStream.O1(i, (iIntValue >> 31) ^ (iIntValue << 1));
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int iR1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            int iIntValue2 = ((Integer) list.get(i3)).intValue();
            iR1 += CodedOutputStream.r1((iIntValue2 >> 31) ^ (iIntValue2 << 1));
        }
        codedOutputStream.P1(iR1);
        while (i2 < list.size()) {
            int iIntValue3 = ((Integer) list.get(i2)).intValue();
            codedOutputStream.P1((iIntValue3 >> 31) ^ (iIntValue3 << 1));
            i2++;
        }
    }

    public static void Q(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ykk.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long jLongValue = ((Long) list.get(i2)).longValue();
                codedOutputStream.Q1(i, (jLongValue >> 63) ^ (jLongValue << 1));
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int iT1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            long jLongValue2 = ((Long) list.get(i3)).longValue();
            iT1 += CodedOutputStream.t1((jLongValue2 >> 63) ^ (jLongValue2 << 1));
        }
        codedOutputStream.P1(iT1);
        while (i2 < list.size()) {
            long jLongValue3 = ((Long) list.get(i2)).longValue();
            codedOutputStream.R1((jLongValue3 >> 63) ^ (jLongValue3 << 1));
            i2++;
        }
    }

    public static void R(int i, List list, YKK ykk) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ykk.getClass();
        boolean z = list instanceof i22;
        CodedOutputStream codedOutputStream = ykk.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.L1(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        i22 i22Var = (i22) list;
        while (i2 < list.size()) {
            Object objW = i22Var.w(i2);
            if (objW instanceof String) {
                codedOutputStream.L1(i, (String) objW);
            } else {
                codedOutputStream.y1(i, (lk) objW);
            }
            i2++;
        }
    }

    public static void S(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ykk.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.O1(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int iR1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iR1 += CodedOutputStream.r1(((Integer) list.get(i3)).intValue());
        }
        codedOutputStream.P1(iR1);
        while (i2 < list.size()) {
            codedOutputStream.P1(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public static void T(int i, List list, YKK ykk, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        CodedOutputStream codedOutputStream = ykk.a;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                codedOutputStream.Q1(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        codedOutputStream.N1(i, 2);
        int iT1 = 0;
        for (int i3 = 0; i3 < list.size(); i3++) {
            iT1 += CodedOutputStream.t1(((Long) list.get(i3)).longValue());
        }
        codedOutputStream.P1(iT1);
        while (i2 < list.size()) {
            codedOutputStream.R1(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static int a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.V0(i) * size;
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static int c(List list, int i) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP1 = CodedOutputStream.p1(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iP1 += CodedOutputStream.X0((lk) list.get(i2));
        }
        return iP1;
    }

    public static int d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.p1(i) * size) + e(list);
    }

    public static int e(List<Integer> list) {
        int iF1;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ck32) {
            ck32 ck32Var = (ck32) list;
            iF1 = 0;
            while (i < size) {
                iF1 += CodedOutputStream.f1(ck32Var.d(i));
                i++;
            }
        } else {
            iF1 = 0;
            while (i < size) {
                iF1 += CodedOutputStream.f1(list.get(i).intValue());
                i++;
            }
        }
        return iF1;
    }

    public static int f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.a1(i) * size;
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return CodedOutputStream.b1(i) * size;
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i, List<DzVS> list, n54 n54Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iD1 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iD1 += CodedOutputStream.d1(i, list.get(i2), n54Var);
        }
        return iD1;
    }

    public static int k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.p1(i) * size) + l(list);
    }

    public static int l(List<Integer> list) {
        int iF1;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ck32) {
            ck32 ck32Var = (ck32) list;
            iF1 = 0;
            while (i < size) {
                iF1 += CodedOutputStream.f1(ck32Var.d(i));
                i++;
            }
        } else {
            iF1 = 0;
            while (i < size) {
                iF1 += CodedOutputStream.f1(list.get(i).intValue());
                i++;
            }
        }
        return iF1;
    }

    public static int m(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (CodedOutputStream.p1(i) * list.size()) + n(list);
    }

    public static int n(List<Long> list) {
        int iT1;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Z) {
            Z z = (Z) list;
            iT1 = 0;
            while (i < size) {
                z.c(i);
                iT1 += CodedOutputStream.t1(z.x[i]);
                i++;
            }
        } else {
            iT1 = 0;
            while (i < size) {
                iT1 += CodedOutputStream.t1(list.get(i).longValue());
                i++;
            }
        }
        return iT1;
    }

    public static int o(int i, n54 n54Var, Object obj) {
        if (obj instanceof WE) {
            return CodedOutputStream.h1((WE) obj) + CodedOutputStream.p1(i);
        }
        int iP1 = CodedOutputStream.p1(i);
        int iR = ((CQf) ((DzVS) obj)).r(n54Var);
        return CodedOutputStream.r1(iR) + iR + iP1;
    }

    public static int p(int i, List<?> list, n54 n54Var) {
        int iR1;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iP1 = CodedOutputStream.p1(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof WE) {
                iR1 = CodedOutputStream.h1((WE) obj);
            } else {
                int iR = ((CQf) ((DzVS) obj)).r(n54Var);
                iR1 = iR + CodedOutputStream.r1(iR);
            }
            iP1 += iR1;
        }
        return iP1;
    }

    public static int q(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.p1(i) * size) + r(list);
    }

    public static int r(List<Integer> list) {
        int iR1;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ck32) {
            ck32 ck32Var = (ck32) list;
            iR1 = 0;
            while (i < size) {
                int iD = ck32Var.d(i);
                iR1 += CodedOutputStream.r1((iD >> 31) ^ (iD << 1));
                i++;
            }
        } else {
            iR1 = 0;
            while (i < size) {
                int iIntValue = list.get(i).intValue();
                iR1 += CodedOutputStream.r1((iIntValue >> 31) ^ (iIntValue << 1));
                i++;
            }
        }
        return iR1;
    }

    public static int s(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.p1(i) * size) + t(list);
    }

    public static int t(List<Long> list) {
        int iT1;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Z) {
            Z z = (Z) list;
            iT1 = 0;
            while (i < size) {
                z.c(i);
                long j = z.x[i];
                iT1 += CodedOutputStream.t1((j >> 63) ^ (j << 1));
                i++;
            }
        } else {
            iT1 = 0;
            while (i < size) {
                long jLongValue = list.get(i).longValue();
                iT1 += CodedOutputStream.t1((jLongValue >> 63) ^ (jLongValue << 1));
                i++;
            }
        }
        return iT1;
    }

    public static int u(List list, int i) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iP1 = CodedOutputStream.p1(i) * size;
        if (list instanceof i22) {
            i22 i22Var = (i22) list;
            while (i2 < size) {
                Object objW = i22Var.w(i2);
                iP1 = (objW instanceof lk ? CodedOutputStream.X0((lk) objW) : CodedOutputStream.o1((String) objW)) + iP1;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iP1 = (obj instanceof lk ? CodedOutputStream.X0((lk) obj) : CodedOutputStream.o1((String) obj)) + iP1;
                i2++;
            }
        }
        return iP1;
    }

    public static int v(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.p1(i) * size) + w(list);
    }

    public static int w(List<Integer> list) {
        int iR1;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof ck32) {
            ck32 ck32Var = (ck32) list;
            iR1 = 0;
            while (i < size) {
                iR1 += CodedOutputStream.r1(ck32Var.d(i));
                i++;
            }
        } else {
            iR1 = 0;
            while (i < size) {
                iR1 += CodedOutputStream.r1(list.get(i).intValue());
                i++;
            }
        }
        return iR1;
    }

    public static int x(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.p1(i) * size) + y(list);
    }

    public static int y(List<Long> list) {
        int iT1;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof Z) {
            Z z = (Z) list;
            iT1 = 0;
            while (i < size) {
                z.c(i);
                iT1 += CodedOutputStream.t1(z.x[i]);
                i++;
            }
        } else {
            iT1 = 0;
            while (i < size) {
                iT1 += CodedOutputStream.t1(list.get(i).longValue());
                i++;
            }
        }
        return iT1;
    }

    public static Object z(Class<?> cls, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append("$");
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if ('a' > cCharAt || cCharAt > 'z') {
                    if ('A' > cCharAt || cCharAt > 'Z') {
                        if ('0' <= cCharAt && cCharAt <= '9') {
                            sb2.append(cCharAt);
                        }
                        z = true;
                    } else if (i != 0 || z) {
                        sb2.append(cCharAt);
                    } else {
                        sb2.append((char) (cCharAt + ' '));
                    }
                } else if (z) {
                    sb2.append((char) (cCharAt - ' '));
                } else {
                    sb2.append(cCharAt);
                }
                z = false;
            }
            sb.append(sb2.toString());
            sb.append("DefaultEntryHolder");
            Field[] declaredFields = Class.forName(sb.toString()).getDeclaredFields();
            if (declaredFields.length == 1) {
                return de5.c.j(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }
}
