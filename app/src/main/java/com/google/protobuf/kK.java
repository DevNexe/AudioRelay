package com.google.protobuf;

import defpackage.Md5A;
import defpackage.lk;
import defpackage.vv0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class kK {

    public static class CQf implements F1 {
        public final Xn1.QnHx<Descriptors.NUlFixed> a;

        public CQf(Xn1.QnHx<Descriptors.NUlFixed> qnHx) {
            this.a = qnHx;
        }

        @Override // com.google.protobuf.kK.F1
        public final void a(NUlFixed nUl, vv0 vv0Var, Descriptors.NUlFixed nUl2) {
            DzVS.QnHx qnHxC;
            if (nUl2.f()) {
                throw null;
            }
            Xn1.QnHx<Descriptors.NUlFixed> qnHx = this.a;
            if (!qnHx.g(nUl2)) {
                throw null;
            }
            Object objF = qnHx.f(nUl2);
            if (objF instanceof DzVS.QnHx) {
                qnHxC = (DzVS.QnHx) objF;
            } else {
                qnHxC = ((DzVS) objF).c();
                qnHx.m(nUl2, qnHxC);
            }
            nUl.n(nUl2.x.B, qnHxC, vv0Var);
        }

        @Override // com.google.protobuf.kK.F1
        public final F1 b(Descriptors.NUlFixed nUl, Object obj) {
            this.a.m(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.kK.F1
        public final int c() {
            return 2;
        }

        @Override // com.google.protobuf.kK.F1
        public final boolean d(Descriptors.NUlFixed nUl) {
            this.a.g(null);
            throw null;
        }

        @Override // com.google.protobuf.kK.F1
        public final mw0t e(lk lkVar, vv0 vv0Var) {
            throw null;
        }

        @Override // com.google.protobuf.kK.F1
        public final PRnFixed.CQf f(PRnFixed pRn, Descriptors.QnHx qnHx, int i) {
            pRn.getClass();
            return pRn.f.get(new PRnFixed.QnHx(qnHx, i));
        }

        @Override // com.google.protobuf.kK.F1
        public final F1 g(Descriptors.NUlFixed nUl, Object obj) {
            this.a.a(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.kK.F1
        public final LF.F1 h(Descriptors.NUlFixed nUl) {
            return nUl.t() ? LF.F1.x : LF.F1.w;
        }

        @Override // com.google.protobuf.kK.F1
        public final void i(NUlFixed nUl, vv0 vv0Var, Descriptors.NUlFixed nUl2) {
            DzVS.QnHx qnHxC;
            if (nUl2.f()) {
                throw null;
            }
            Xn1.QnHx<Descriptors.NUlFixed> qnHx = this.a;
            if (!qnHx.g(nUl2)) {
                throw null;
            }
            Object objF = qnHx.f(nUl2);
            if (objF instanceof DzVS.QnHx) {
                qnHxC = (DzVS.QnHx) objF;
            } else {
                qnHxC = ((DzVS) objF).c();
                qnHx.m(nUl2, qnHxC);
            }
            nUl.r(qnHxC, vv0Var);
        }
    }

    public interface F1 {
        void a(NUlFixed nUl, vv0 vv0Var, Descriptors.NUlFixed nUl2);

        F1 b(Descriptors.NUlFixed nUl, Object obj);

        int c();

        boolean d(Descriptors.NUlFixed nUl);

        mw0t e(lk lkVar, vv0 vv0Var);

        PRnFixed.CQf f(PRnFixed pRn, Descriptors.QnHx qnHx, int i);

        F1 g(Descriptors.NUlFixed nUl, Object obj);

        LF.F1 h(Descriptors.NUlFixed nUl);

        void i(NUlFixed nUl, vv0 vv0Var, Descriptors.NUlFixed nUl2);
    }

    public static class QnHx implements F1 {
        public final mw0t.QnHx a;
        public boolean b = true;

        public QnHx(mw0t.QnHx qnHx) {
            this.a = qnHx;
        }

        @Override // com.google.protobuf.kK.F1
        public final void a(NUlFixed nUl, vv0 vv0Var, Descriptors.NUlFixed nUl2) {
            mw0t.QnHx qnHxJ;
            mw0t.QnHx qnHxZ;
            boolean zF = nUl2.f();
            EQ.auxFixed auxVar = nUl2.x;
            if (zF) {
                mw0t.QnHx qnHxJ2 = j(nUl2);
                nUl.n(auxVar.B, qnHxJ2, vv0Var);
                g(nUl2, qnHxJ2.f());
                return;
            }
            if (d(nUl2)) {
                boolean z = this.b;
                mw0t.QnHx qnHx = this.a;
                if (z) {
                    try {
                        qnHxZ = qnHx.z(nUl2);
                    } catch (UnsupportedOperationException unused) {
                        this.b = false;
                        qnHxZ = null;
                    }
                } else {
                    qnHxZ = null;
                }
                if (qnHxZ != null) {
                    nUl.n(auxVar.B, qnHxZ, vv0Var);
                    return;
                } else {
                    qnHxJ = j(nUl2);
                    qnHxJ.s((mw0t) qnHx.l(nUl2));
                }
            } else {
                qnHxJ = j(nUl2);
            }
            nUl.n(auxVar.B, qnHxJ, vv0Var);
            b(nUl2, qnHxJ.f());
        }

        @Override // com.google.protobuf.kK.F1
        public final F1 b(Descriptors.NUlFixed nUl, Object obj) {
            mw0t.QnHx qnHxZ;
            boolean zF = nUl.f();
            mw0t.QnHx qnHx = this.a;
            if (zF || !(obj instanceof DzVS.QnHx)) {
                qnHx.b(nUl, obj);
                return this;
            }
            if (this.b) {
                try {
                    qnHxZ = qnHx.z(nUl);
                } catch (UnsupportedOperationException unused) {
                    this.b = false;
                    qnHxZ = null;
                }
            } else {
                qnHxZ = null;
            }
            if (obj != qnHxZ) {
                qnHx.b(nUl, ((DzVS.QnHx) obj).f());
            }
            return this;
        }

        @Override // com.google.protobuf.kK.F1
        public final int c() {
            return 1;
        }

        @Override // com.google.protobuf.kK.F1
        public final boolean d(Descriptors.NUlFixed nUl) {
            return this.a.d(nUl);
        }

        @Override // com.google.protobuf.kK.F1
        public final mw0t e(lk lkVar, vv0 vv0Var) {
            this.a.m(null);
            throw null;
        }

        @Override // com.google.protobuf.kK.F1
        public final PRnFixed.CQf f(PRnFixed pRn, Descriptors.QnHx qnHx, int i) {
            pRn.getClass();
            return pRn.f.get(new PRnFixed.QnHx(qnHx, i));
        }

        @Override // com.google.protobuf.kK.F1
        public final F1 g(Descriptors.NUlFixed nUl, Object obj) {
            if (obj instanceof DzVS.QnHx) {
                obj = ((DzVS.QnHx) obj).f();
            }
            this.a.g(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.kK.F1
        public final LF.F1 h(Descriptors.NUlFixed nUl) {
            if (nUl.t()) {
                return LF.F1.x;
            }
            nUl.f();
            return LF.F1.w;
        }

        @Override // com.google.protobuf.kK.F1
        public final void i(NUlFixed nUl, vv0 vv0Var, Descriptors.NUlFixed nUl2) {
            mw0t.QnHx qnHxJ;
            mw0t.QnHx qnHxZ;
            if (nUl2.f()) {
                mw0t.QnHx qnHxJ2 = j(nUl2);
                nUl.r(qnHxJ2, vv0Var);
                g(nUl2, qnHxJ2.f());
                return;
            }
            if (d(nUl2)) {
                boolean z = this.b;
                mw0t.QnHx qnHx = this.a;
                if (z) {
                    try {
                        qnHxZ = qnHx.z(nUl2);
                    } catch (UnsupportedOperationException unused) {
                        this.b = false;
                        qnHxZ = null;
                    }
                } else {
                    qnHxZ = null;
                }
                if (qnHxZ != null) {
                    nUl.r(qnHxZ, vv0Var);
                    return;
                } else {
                    qnHxJ = j(nUl2);
                    qnHxJ.s((mw0t) qnHx.l(nUl2));
                }
            } else {
                qnHxJ = j(nUl2);
            }
            nUl.r(qnHxJ, vv0Var);
            b(nUl2, qnHxJ.f());
        }

        public final mw0t.QnHx j(Descriptors.NUlFixed nUl) {
            return this.a.m(nUl);
        }
    }

    public static void a(roZB rozb, String str, ArrayList arrayList) {
        for (Descriptors.NUlFixed nUl : rozb.e().n()) {
            if (nUl.s() && !rozb.d(nUl)) {
                StringBuilder sbG = Md5A.g(str);
                sbG.append(nUl.d());
                arrayList.add(sbG.toString());
            }
        }
        for (Map.Entry<Descriptors.NUlFixed, Object> entry : rozb.o().entrySet()) {
            Descriptors.NUlFixed key = entry.getKey();
            Object value = entry.getValue();
            if (key.C.w == Descriptors.NUlFixed.CQf.F) {
                if (key.f()) {
                    Iterator it = ((List) value).iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        a((roZB) it.next(), d(str, key, i), arrayList);
                        i++;
                    }
                } else if (rozb.d(key)) {
                    a((roZB) value, d(str, key, -1), arrayList);
                }
            }
        }
    }

    public static int b(mw0t mw0tVar, Map<Descriptors.NUlFixed, Object> map) {
        boolean z = mw0tVar.e().q().B;
        int iI1 = 0;
        for (Map.Entry<Descriptors.NUlFixed, Object> entry : map.entrySet()) {
            Descriptors.NUlFixed key = entry.getKey();
            Object value = entry.getValue();
            iI1 += (z && key.o() && key.C == Descriptors.NUlFixed.F1.z && !key.f()) ? CodedOutputStream.i1(3, (mw0t) value) + CodedOutputStream.q1(2, key.x.B) + (CodedOutputStream.p1(1) * 2) : Xn1.f(key, value);
        }
        k kVarK = mw0tVar.k();
        return (z ? kVarK.q() : kVarK.j()) + iI1;
    }

    public static boolean c(NUlFixed nUl, k.QnHx qnHx, vv0 vv0Var, Descriptors.QnHx qnHx2, F1 f1, int i) {
        boolean z;
        boolean z2;
        Object objL;
        int iA = 0;
        Descriptors.NUlFixed nUlM = null;
        if (qnHx2.q().B && i == 11) {
            lk.YKK ykkH = null;
            PRnFixed.CQf cQfF = null;
            while (true) {
                int iZ = nUl.z();
                if (iZ == 0) {
                    break;
                }
                if (iZ == 16) {
                    iA = nUl.A();
                    if (iA != 0 && (vv0Var instanceof PRnFixed)) {
                        cQfF = f1.f((PRnFixed) vv0Var, qnHx2, iA);
                    }
                } else if (iZ == 26) {
                    if (iA != 0 && cQfF != null) {
                        vv0 vv0Var2 = vv0.b;
                    }
                    ykkH = nUl.h();
                } else if (!nUl.C(iZ)) {
                    break;
                }
            }
            nUl.a(12);
            if (ykkH != null && iA != 0) {
                if (cQfF != null) {
                    if (f1.d(null)) {
                        f1.b(null, f1.e(ykkH, vv0Var));
                    } else {
                        vv0 vv0Var3 = vv0.b;
                        f1.b(null, new Aa(vv0Var, ykkH));
                    }
                } else if (qnHx != null) {
                    int i2 = k.CQf.f;
                    k.CQf.QnHx qnHx3 = new k.CQf.QnHx();
                    qnHx3.a(ykkH);
                    qnHx.t(iA, qnHx3.c());
                }
            }
            return true;
        }
        int i3 = i & 7;
        int i4 = i >>> 3;
        int iBinarySearch = Arrays.binarySearch(qnHx2.F, i4);
        if (iBinarySearch < 0) {
            iBinarySearch = (~iBinarySearch) - 1;
        }
        if (iBinarySearch >= 0 && i4 < qnHx2.G[iBinarySearch]) {
            if ((vv0Var instanceof PRnFixed) && f1.f((PRnFixed) vv0Var, qnHx2, i4) != null) {
                throw null;
            }
        } else if (f1.c() == 1) {
            nUlM = qnHx2.m(i4);
        }
        if (nUlM == null) {
            z = true;
            z2 = false;
        } else {
            LF.QnHx qnHxH = nUlM.h();
            Xn1 xn1 = Xn1.d;
            if (i3 == qnHxH.x) {
                z = false;
                z2 = false;
            } else {
                if (nUlM.r()) {
                    nUlM.h();
                    if (i3 == 2) {
                        z = false;
                        z2 = true;
                    }
                }
                z = true;
                z2 = false;
            }
        }
        if (z) {
            return qnHx != null ? qnHx.u(i, nUl) : nUl.C(i);
        }
        if (z2) {
            int iF = nUl.f(nUl.s());
            if (nUlM.h() == LF.QnHx.z) {
                while (nUl.c() > 0) {
                    int iJ = nUl.j();
                    if (nUlM.z.m() == 3) {
                        f1.g(nUlM, nUlM.m().l(iJ));
                    } else {
                        Descriptors.LPt8Fixed lPt8G = nUlM.m().g(iJ);
                        if (lPt8G != null) {
                            f1.g(nUlM, lPt8G);
                        } else if (qnHx != null) {
                            qnHx.x(i4, iJ);
                        }
                    }
                }
            } else {
                while (nUl.c() > 0) {
                    f1.g(nUlM, LF.a(nUl, nUlM.h(), f1.h(nUlM)));
                }
            }
            nUl.e(iF);
        } else {
            int iOrdinal = nUlM.C.ordinal();
            if (iOrdinal == 9) {
                f1.a(nUl, vv0Var, nUlM);
                return true;
            }
            if (iOrdinal == 10) {
                f1.i(nUl, vv0Var, nUlM);
                return true;
            }
            if (iOrdinal != 13) {
                objL = LF.a(nUl, nUlM.h(), f1.h(nUlM));
            } else {
                int iJ2 = nUl.j();
                if ((nUlM.z.m() == 3 ? 1 : 0) != 0) {
                    objL = nUlM.m().l(iJ2);
                } else {
                    Descriptors.LPt8Fixed lPt8G2 = nUlM.m().g(iJ2);
                    if (lPt8G2 == null) {
                        if (qnHx != null) {
                            qnHx.x(i4, iJ2);
                        }
                        return true;
                    }
                    objL = lPt8G2;
                }
            }
            if (nUlM.f()) {
                f1.g(nUlM, objL);
            } else {
                f1.b(nUlM, objL);
            }
        }
        return true;
    }

    public static String d(String str, Descriptors.NUlFixed nUl, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (nUl.o()) {
            sb.append('(');
            sb.append(nUl.y);
            sb.append(')');
        } else {
            sb.append(nUl.d());
        }
        if (i != -1) {
            sb.append('[');
            sb.append(i);
            sb.append(']');
        }
        sb.append('.');
        return sb.toString();
    }

    public static void e(mw0t mw0tVar, Map map, CodedOutputStream codedOutputStream) {
        boolean z = mw0tVar.e().q().B;
        for (Map.Entry entry : map.entrySet()) {
            Descriptors.NUlFixed nUl = (Descriptors.NUlFixed) entry.getKey();
            Object value = entry.getValue();
            if (z && nUl.o() && nUl.C == Descriptors.NUlFixed.F1.z && !nUl.f()) {
                codedOutputStream.J1(nUl.x.B, (mw0t) value);
            } else {
                Xn1.w(nUl, value, codedOutputStream);
            }
        }
        k kVarK = mw0tVar.k();
        if (z) {
            kVarK.t(codedOutputStream);
        } else {
            kVarK.h(codedOutputStream);
        }
    }
}
