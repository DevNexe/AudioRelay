package com.google.protobuf;

import defpackage.GM;
import defpackage.N;
import defpackage.O;
import defpackage.ev2;
import defpackage.hd2;
import defpackage.id2;
import defpackage.lk;
import defpackage.rz;
import defpackage.yj0;
import defpackage.zw0;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
public final class byN implements id2 {
    public static final HashSet a;
    public static final QnHx b;

    public static final class CQf {
        public ev2[] a = new ev2[2];
    }

    public static class QnHx {
        public final ConcurrentHashMap a = new ConcurrentHashMap();
        public int b = 0;
        public final Stack<C0101QnHx> c = new Stack<>();
        public final HashMap d = new HashMap();

        public static class CQf {
            public final ArrayList a = new ArrayList();
            public boolean b = false;
        }

        /* JADX INFO: renamed from: com.google.protobuf.byN$QnHx$QnHx, reason: collision with other inner class name */
        public static class C0101QnHx {
            public final Descriptors.QnHx a;
            public final int b;
            public int c;
            public CQf d = null;

            public C0101QnHx(Descriptors.QnHx qnHx, int i) {
                this.a = qnHx;
                this.b = i;
                this.c = i;
            }
        }

        public final C0101QnHx a(Descriptors.QnHx qnHx) {
            C0101QnHx c0101QnHxPop;
            ArrayList arrayList;
            boolean z;
            CQf cQf;
            int i = this.b;
            this.b = i + 1;
            C0101QnHx c0101QnHx = new C0101QnHx(qnHx, i);
            Stack<C0101QnHx> stack = this.c;
            stack.push(c0101QnHx);
            HashMap map = this.d;
            map.put(qnHx, c0101QnHx);
            for (Descriptors.NUlFixed nUl : qnHx.n()) {
                if (nUl.C.w == Descriptors.NUlFixed.CQf.F) {
                    C0101QnHx c0101QnHx2 = (C0101QnHx) map.get(nUl.n());
                    if (c0101QnHx2 == null) {
                        c0101QnHx.c = Math.min(c0101QnHx.c, a(nUl.n()).c);
                    } else if (c0101QnHx2.d == null) {
                        c0101QnHx.c = Math.min(c0101QnHx.c, c0101QnHx2.c);
                    }
                }
            }
            if (c0101QnHx.b == c0101QnHx.c) {
                CQf cQf2 = new CQf();
                do {
                    c0101QnHxPop = stack.pop();
                    c0101QnHxPop.d = cQf2;
                    arrayList = cQf2.a;
                    arrayList.add(c0101QnHxPop.a);
                } while (c0101QnHxPop != c0101QnHx);
                Iterator it = arrayList.iterator();
                loop2: while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    Descriptors.QnHx qnHx2 = (Descriptors.QnHx) it.next();
                    z = true;
                    if (!qnHx2.w.F.isEmpty()) {
                        break;
                    }
                    for (Descriptors.NUlFixed nUl2 : qnHx2.n()) {
                        if (nUl2.s() || (nUl2.C.w == Descriptors.NUlFixed.CQf.F && (cQf = ((C0101QnHx) map.get(nUl2.n())).d) != cQf2 && cQf.b)) {
                            break loop2;
                        }
                    }
                }
                cQf2.b = z;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    this.a.put((Descriptors.QnHx) it2.next(), Boolean.valueOf(cQf2.b));
                }
            }
            return c0101QnHx;
        }
    }

    static {
        new byN();
        a = new HashSet(Arrays.asList("Class", "DefaultInstanceForType", "ParserForType", "SerializedSize", "AllFields", "DescriptorForType", "InitializationErrorString", "UnknownFields", "CachedSize"));
        b = new QnHx();
    }

    public static LPt6Fixed c(Class cls, Descriptors.NUlFixed nUl, CQf cQf, boolean z, auxFixed auxVar) {
        ev2 ev2Var;
        Class<?> returnType;
        Descriptors.byN byn = nUl.F;
        int i = byn.w;
        ev2[] ev2VarArr = cQf.a;
        if (i >= ev2VarArr.length) {
            cQf.a = (ev2[]) Arrays.copyOf(ev2VarArr, i * 2);
        }
        ev2 ev2Var2 = cQf.a[i];
        if (ev2Var2 == null) {
            String strK = k(byn.d(), false);
            ev2 ev2Var3 = new ev2(f(cls, rz.a(strK, "Case_")), f(cls, rz.a(strK, "_")));
            cQf.a[i] = ev2Var3;
            ev2Var = ev2Var3;
        } else {
            ev2Var = ev2Var2;
        }
        zw0 zw0VarH = h(nUl);
        switch (zw0VarH.w.ordinal()) {
            case 1:
            case 8:
                returnType = Integer.class;
                break;
            case 2:
                returnType = Long.class;
                break;
            case 3:
                returnType = Float.class;
                break;
            case 4:
                returnType = Double.class;
                break;
            case 5:
                returnType = Boolean.class;
                break;
            case 6:
                returnType = String.class;
                break;
            case 7:
                returnType = lk.class;
                break;
            case 9:
                try {
                    returnType = cls.getDeclaredMethod(j(nUl.C == Descriptors.NUlFixed.F1.y ? nUl.n().d() : nUl.d()), new Class[0]).getReturnType();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid type for oneof: " + zw0VarH);
        }
        Class<?> cls2 = returnType;
        int i2 = nUl.x.B;
        LPt6Fixed.a(i2);
        Charset charset = SjP.a;
        if (cls2 == null) {
            throw new NullPointerException("oneofStoredType");
        }
        if (zw0VarH.y == 1) {
            return new LPt6Fixed(null, i2, zw0VarH, null, null, 0, false, z, ev2Var, cls2, null, auxVar, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i2 + " is of type " + zw0VarH);
    }

    public static Field d(Class<?> cls, Descriptors.NUlFixed nUl) {
        return f(cls, k(nUl.d(), false) + "MemoizedSerializedSize");
    }

    public static Field e(Class<?> cls, Descriptors.NUlFixed nUl) {
        String strD = nUl.C == Descriptors.NUlFixed.F1.y ? nUl.n().d() : nUl.d();
        return f(cls, k(strD, false) + (a.contains(k(strD, true)) ? "__" : "_"));
    }

    public static Field f(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            StringBuilder sbA = N.a("Unable to find field ", str, " in message class ");
            sbA.append(cls.getName());
            throw new IllegalArgumentException(sbA.toString());
        }
    }

    public static mw0t g(Class<?> cls) {
        try {
            return (mw0t) cls.getDeclaredMethod("getDefaultInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to get default instance for message class ".concat(cls.getName()), e);
        }
    }

    public static zw0 h(Descriptors.NUlFixed nUl) {
        switch (nUl.C.ordinal()) {
            case 0:
                if (nUl.f()) {
                    return nUl.k() ? zw0.i0 : zw0.R;
                }
                return zw0.z;
            case 1:
                if (nUl.f()) {
                    return nUl.k() ? zw0.j0 : zw0.S;
                }
                return zw0.A;
            case 2:
                if (nUl.f()) {
                    return nUl.k() ? zw0.k0 : zw0.T;
                }
                return zw0.B;
            case 3:
                if (nUl.f()) {
                    return nUl.k() ? zw0.l0 : zw0.U;
                }
                return zw0.C;
            case 4:
                if (nUl.f()) {
                    return nUl.k() ? zw0.m0 : zw0.V;
                }
                return zw0.D;
            case 5:
                if (nUl.f()) {
                    return nUl.k() ? zw0.n0 : zw0.W;
                }
                return zw0.E;
            case 6:
                if (nUl.f()) {
                    return nUl.k() ? zw0.o0 : zw0.X;
                }
                return zw0.F;
            case 7:
                if (nUl.f()) {
                    return nUl.k() ? zw0.p0 : zw0.Y;
                }
                return zw0.G;
            case 8:
                return nUl.f() ? zw0.Z : zw0.H;
            case 9:
                return nUl.f() ? zw0.w0 : zw0.Q;
            case 10:
                if (nUl.p()) {
                    return zw0.x0;
                }
                return nUl.f() ? zw0.a0 : zw0.I;
            case 11:
                return nUl.f() ? zw0.b0 : zw0.J;
            case 12:
                if (nUl.f()) {
                    return nUl.k() ? zw0.q0 : zw0.c0;
                }
                return zw0.K;
            case 13:
                if (nUl.f()) {
                    return nUl.k() ? zw0.r0 : zw0.d0;
                }
                return zw0.L;
            case 14:
                if (nUl.f()) {
                    return nUl.k() ? zw0.s0 : zw0.e0;
                }
                return zw0.M;
            case 15:
                if (nUl.f()) {
                    return nUl.k() ? zw0.t0 : zw0.f0;
                }
                return zw0.N;
            case 16:
                if (nUl.f()) {
                    return nUl.k() ? zw0.u0 : zw0.g0;
                }
                return zw0.O;
            case 17:
                if (nUl.f()) {
                    return nUl.k() ? zw0.v0 : zw0.h0;
                }
                return zw0.P;
            default:
                StringBuilder sb = new StringBuilder("Unsupported field type: ");
                sb.append(nUl.C);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    public static Class<?> i(Class<?> cls, Descriptors.NUlFixed nUl) {
        try {
            return cls.getDeclaredMethod(j(nUl.C == Descriptors.NUlFixed.F1.y ? nUl.n().d() : nUl.d()), Integer.TYPE).getReturnType();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static String j(String str) {
        String strK = k(str, false);
        return "get" + Character.toUpperCase(strK.charAt(0)) + strK.substring(1, strK.length());
    }

    public static String k(String str, boolean z) {
        StringBuilder sb = new StringBuilder(str.length() + 1);
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '_') {
                z = true;
            } else if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
                z = true;
            } else if (z) {
                sb.append(Character.toUpperCase(cCharAt));
                z = false;
            } else if (i == 0) {
                sb.append(Character.toLowerCase(cCharAt));
            } else {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    @Override // defpackage.id2
    public final hd2 a(Class<?> cls) {
        boolean zBooleanValue;
        auxFixed auxVar;
        int i;
        SjP.CQf t23;
        if (!lPt3Fixed.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        Descriptors.QnHx qnHxE = g(cls).e();
        int iH = O.h(qnHxE.y.m());
        int i2 = 2;
        auxFixed auxVar2 = null;
        if (iH != 1) {
            if (iH != 2) {
                throw new IllegalArgumentException("Unsupported syntax: ".concat(yj0.a(qnHxE.y.m())));
            }
            List<Descriptors.NUlFixed> listN = qnHxE.n();
            F.QnHx qnHx = new F.QnHx(listN.size());
            qnHx.f = g(cls);
            Charset charset = SjP.a;
            qnHx.b = 2;
            CQf cQf = new CQf();
            for (int i3 = 0; i3 < listN.size(); i3++) {
                Descriptors.NUlFixed nUl = listN.get(i3);
                Descriptors.byN byn = nUl.F;
                if (byn == null || byn.g()) {
                    boolean zP = nUl.p();
                    EQ.auxFixed auxVar3 = nUl.x;
                    if (zP) {
                        qnHx.b(LPt6Fixed.d(e(cls, nUl), auxVar3.B, n8V_.z(cls, nUl.d()), null));
                    } else if (nUl.f() && nUl.C.w == Descriptors.NUlFixed.CQf.F) {
                        qnHx.b(LPt6Fixed.g(e(cls, nUl), auxVar3.B, h(nUl), i(cls, nUl)));
                    } else if (nUl.k()) {
                        qnHx.b(LPt6Fixed.e(e(cls, nUl), auxVar3.B, h(nUl), d(cls, nUl)));
                    } else {
                        qnHx.b(LPt6Fixed.c(e(cls, nUl), auxVar3.B, h(nUl), true));
                    }
                } else {
                    qnHx.b(c(cls, nUl, cQf, true, null));
                }
            }
            return qnHx.a();
        }
        List<Descriptors.NUlFixed> listN2 = qnHxE.n();
        F.QnHx qnHx2 = new F.QnHx(listN2.size());
        qnHx2.f = g(cls);
        Charset charset2 = SjP.a;
        qnHx2.b = 1;
        qnHx2.d = qnHxE.q().B;
        CQf cQf2 = new CQf();
        Field fieldF = null;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1;
        while (i4 < listN2.size()) {
            Descriptors.NUlFixed nUl2 = listN2.get(i4);
            boolean z = nUl2.z.w.T().F;
            Descriptors.NUlFixed.CQf cQf3 = nUl2.C.w;
            Descriptors.NUlFixed.CQf cQf4 = Descriptors.NUlFixed.CQf.E;
            if (cQf3 == cQf4) {
                auxVar = auxVar2;
                auxVar = new auxFixed(nUl2);
            }
            auxVar = auxVar2;
            if (nUl2.F != null) {
                qnHx2.b(c(cls, nUl2, cQf2, z, auxVar));
                i = i6;
            } else {
                Field fieldE = e(cls, nUl2);
                int i7 = nUl2.x.B;
                zw0 zw0VarH = h(nUl2);
                if (nUl2.p()) {
                    Descriptors.NUlFixed nUlM = nUl2.n().m(i2);
                    if (nUlM.C.w == cQf4) {
                        t23 = auxVar;
                        t23 = new T23(nUlM);
                    }
                    t23 = auxVar;
                    qnHx2.b(LPt6Fixed.d(fieldE, i7, n8V_.z(cls, nUl2.d()), t23));
                } else if (!nUl2.f()) {
                    if (fieldF == null) {
                        fieldF = f(cls, "bitField" + i5 + "_");
                    }
                    if (nUl2.s()) {
                        LPt6Fixed.a(i7);
                        Charset charset3 = SjP.a;
                        if (fieldE == null) {
                            throw new NullPointerException("field");
                        }
                        if (zw0VarH == null) {
                            throw new NullPointerException("fieldType");
                        }
                        if (fieldF == null) {
                            throw new NullPointerException("presenceField");
                        }
                        if (!(i6 != 0 && ((i6 + (-1)) & i6) == 0)) {
                            throw new IllegalArgumentException(GM.a("presenceMask must have exactly one bit set: ", i6));
                        }
                        qnHx2.b(new LPt6Fixed(fieldE, i7, zw0VarH, null, fieldF, i6, true, z, null, null, null, auxVar, null));
                        i = i6;
                    } else {
                        i = i6;
                        LPt6Fixed.a(i7);
                        Charset charset4 = SjP.a;
                        if (fieldE == null) {
                            throw new NullPointerException("field");
                        }
                        if (zw0VarH == null) {
                            throw new NullPointerException("fieldType");
                        }
                        if (fieldF == null) {
                            throw new NullPointerException("presenceField");
                        }
                        if (!(i != 0 && ((i + (-1)) & i) == 0)) {
                            throw new IllegalArgumentException(GM.a("presenceMask must have exactly one bit set: ", i));
                        }
                        qnHx2.b(new LPt6Fixed(fieldE, i7, zw0VarH, null, fieldF, i, false, z, null, null, null, auxVar, null));
                    }
                } else if (auxVar != null) {
                    if (nUl2.k()) {
                        Field fieldD = d(cls, nUl2);
                        LPt6Fixed.a(i7);
                        Charset charset5 = SjP.a;
                        if (fieldE == null) {
                            throw new NullPointerException("field");
                        }
                        qnHx2.b(new LPt6Fixed(fieldE, i7, zw0VarH, null, null, 0, false, false, null, null, null, auxVar, fieldD));
                    } else {
                        LPt6Fixed.a(i7);
                        Charset charset6 = SjP.a;
                        if (fieldE == null) {
                            throw new NullPointerException("field");
                        }
                        qnHx2.b(new LPt6Fixed(fieldE, i7, zw0VarH, null, null, 0, false, false, null, null, null, auxVar, null));
                    }
                } else if (nUl2.C.w == Descriptors.NUlFixed.CQf.F) {
                    qnHx2.b(LPt6Fixed.g(fieldE, i7, zw0VarH, i(cls, nUl2)));
                } else if (nUl2.k()) {
                    qnHx2.b(LPt6Fixed.e(fieldE, i7, zw0VarH, d(cls, nUl2)));
                } else {
                    qnHx2.b(LPt6Fixed.c(fieldE, i7, zw0VarH, z));
                }
                i4++;
                auxVar2 = null;
                i2 = 2;
            }
            int i8 = i << 1;
            if (i8 == 0) {
                i5++;
                fieldF = null;
                i6 = 1;
            } else {
                i6 = i8;
            }
            i4++;
            auxVar2 = null;
            i2 = 2;
        }
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < listN2.size(); i9++) {
            Descriptors.NUlFixed nUl3 = listN2.get(i9);
            if (nUl3.s()) {
                arrayList.add(Integer.valueOf(nUl3.x.B));
            } else if (nUl3.C.w == Descriptors.NUlFixed.CQf.F) {
                Descriptors.QnHx qnHxN = nUl3.n();
                QnHx qnHx3 = b;
                Boolean bool = (Boolean) qnHx3.a.get(qnHxN);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    synchronized (qnHx3) {
                        Boolean bool2 = (Boolean) qnHx3.a.get(qnHxN);
                        zBooleanValue = bool2 != null ? bool2.booleanValue() : qnHx3.a(qnHxN).d.b;
                    }
                }
                if (zBooleanValue) {
                    arrayList.add(Integer.valueOf(nUl3.x.B));
                }
            } else {
                continue;
            }
        }
        int[] iArr = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            iArr[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        qnHx2.e = iArr;
        return qnHx2.a();
    }

    @Override // defpackage.id2
    public final boolean b(Class<?> cls) {
        return lPt3Fixed.class.isAssignableFrom(cls);
    }
}
