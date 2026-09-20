package com.google.protobuf;

import defpackage.b70;
import defpackage.fc2;
import defpackage.jd2;
import defpackage.lk;
import defpackage.oz2;
import defpackage.vv0;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lPt3Fixed extends com.google.protobuf.QnHx implements Serializable {
    public k y;

    public static abstract class CQf<BuilderType extends CQf<BuilderType>> extends com.google.protobuf.QnHx.AbstractC0099QnHx<BuilderType> {
        public F1 w;
        public CQf<BuilderType>.QnHx x;
        public boolean y;
        public jd2 z;

        public class QnHx implements F1 {
            public QnHx() {
            }

            @Override // com.google.protobuf.QnHx.CQf
            public final void a() {
                CQf.this.M();
            }
        }

        public CQf() {
            this(null);
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        public final void D(k.QnHx qnHx) {
            this.z = qnHx;
            M();
        }

        @Override // com.google.protobuf.mw0t.QnHx
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public BuilderType g(Descriptors.NUlFixed nUl, Object obj) {
            YKK.b(I(), nUl).a(this, obj);
            return this;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) a().n();
            buildertype.s(f());
            return buildertype;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0079  */
        public final TreeMap G() {
            boolean zD;
            TreeMap treeMap = new TreeMap();
            List<Descriptors.NUlFixed> listN = I().a.n();
            int i = 0;
            while (i < listN.size()) {
                Descriptors.NUlFixed nUlM = listN.get(i);
                Descriptors.byN byn = nUlM.F;
                if (byn != null) {
                    i += byn.B - 1;
                    YKK.F1 f1A = YKK.a(I(), byn);
                    Descriptors.NUlFixed nUl = f1A.d;
                    if (nUl != null) {
                        zD = d(nUl);
                    } else {
                        zD = ((SjP.QnHx) lPt3Fixed.G(this, f1A.c, new Object[0])).b() != 0;
                    }
                    if (zD) {
                        YKK.F1 f1A2 = YKK.a(I(), byn);
                        Descriptors.NUlFixed nUl2 = f1A2.d;
                        if (nUl2 == null) {
                            int iB = ((SjP.QnHx) lPt3Fixed.G(this, f1A2.c, new Object[0])).b();
                            if (iB > 0) {
                                nUlM = f1A2.a.m(iB);
                            } else {
                                nUlM = null;
                            }
                        } else if (d(nUl2)) {
                            nUlM = nUl2;
                        } else {
                            nUlM = null;
                        }
                        treeMap.put(nUlM, l(nUlM));
                    }
                } else if (nUlM.f()) {
                    List list = (List) l(nUlM);
                    if (!list.isEmpty()) {
                        treeMap.put(nUlM, list);
                    }
                } else if (d(nUlM)) {
                    treeMap.put(nUlM, l(nUlM));
                }
                i++;
            }
            return treeMap;
        }

        public final QnHx H() {
            if (this.x == null) {
                this.x = new QnHx();
            }
            return this.x;
        }

        public abstract YKK I();

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public BuilderType B(k kVar) {
            k kVar2 = k.x;
            if (kVar2.equals(kVar)) {
                return this;
            }
            if (kVar2.equals(this.z)) {
                this.z = kVar;
                M();
                return this;
            }
            t().w(kVar);
            M();
            return this;
        }

        public final void K(int i, int i2) {
            t().x(i, i2);
        }

        public final void L() {
            if (this.w != null) {
                this.y = true;
            }
        }

        public final void M() {
            F1 f1;
            if (!this.y || (f1 = this.w) == null) {
                return;
            }
            f1.a();
            this.y = false;
        }

        public boolean N(com.google.protobuf.NUlFixed nUl, vv0 vv0Var, int i) {
            nUl.getClass();
            return t().u(i, nUl);
        }

        @Override // com.google.protobuf.mw0t.QnHx
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public BuilderType b(Descriptors.NUlFixed nUl, Object obj) {
            YKK.b(I(), nUl).f(this, obj);
            return this;
        }

        @Override // com.google.protobuf.mw0t.QnHx
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public BuilderType y(k kVar) {
            this.z = kVar;
            M();
            return this;
        }

        @Override // com.google.protobuf.roZB
        public boolean d(Descriptors.NUlFixed nUl) {
            return YKK.b(I(), nUl).i(this);
        }

        public Descriptors.QnHx e() {
            return I().a;
        }

        @Override // defpackage.jd2
        public boolean isInitialized() {
            for (Descriptors.NUlFixed nUl : e().n()) {
                if (nUl.s() && !d(nUl)) {
                    return false;
                }
                if (nUl.C.w == Descriptors.NUlFixed.CQf.F) {
                    if (nUl.f()) {
                        Iterator it = ((List) l(nUl)).iterator();
                        while (it.hasNext()) {
                            if (!((mw0t) it.next()).isInitialized()) {
                                return false;
                            }
                        }
                    } else if (d(nUl) && !((mw0t) l(nUl)).isInitialized()) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.google.protobuf.roZB
        public final k k() {
            jd2 jd2Var = this.z;
            return jd2Var instanceof k ? (k) jd2Var : ((k.QnHx) jd2Var).build();
        }

        @Override // com.google.protobuf.roZB
        public Object l(Descriptors.NUlFixed nUl) {
            Object objH = YKK.b(I(), nUl).h(this);
            return nUl.f() ? Collections.unmodifiableList((List) objH) : objH;
        }

        @Override // com.google.protobuf.mw0t.QnHx
        public mw0t.QnHx m(Descriptors.NUlFixed nUl) {
            return YKK.b(I(), nUl).b();
        }

        @Override // com.google.protobuf.roZB
        public Map<Descriptors.NUlFixed, Object> o() {
            return Collections.unmodifiableMap(G());
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        public final k.QnHx t() {
            jd2 jd2Var = this.z;
            if (jd2Var instanceof k) {
                k kVar = (k) jd2Var;
                kVar.getClass();
                k.QnHx qnHx = new k.QnHx();
                qnHx.w(kVar);
                this.z = qnHx;
            }
            M();
            return (k.QnHx) this.z;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        public final void u() {
            this.y = true;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
        public mw0t.QnHx z(Descriptors.NUlFixed nUl) {
            return YKK.b(I(), nUl).g(this);
        }

        public CQf(F1 f1) {
            this.z = k.x;
            this.w = f1;
        }
    }

    public interface F1 extends com.google.protobuf.QnHx.CQf {
    }

    public static abstract class LPt8Fixed<MessageType extends NUlFixed, BuilderType extends LPt8Fixed<MessageType, BuilderType>> extends CQf<BuilderType> implements roZB {
        public Xn1.QnHx<Descriptors.NUlFixed> A;

        public LPt8Fixed() {
        }

        private void V(Descriptors.NUlFixed nUl) {
            if (nUl.D != e()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf
        public final boolean N(com.google.protobuf.NUlFixed nUl, vv0 vv0Var, int i) {
            R();
            nUl.getClass();
            return kK.c(nUl, t(), vv0Var, e(), new kK.CQf(this.A), i);
        }

        public BuilderType Q(Descriptors.NUlFixed nUl, Object obj) {
            if (!nUl.o()) {
                super.g(nUl, obj);
                return this;
            }
            V(nUl);
            R();
            this.A.a(nUl, obj);
            M();
            return this;
        }

        public final void R() {
            if (this.A == null) {
                Xn1 xn1 = Xn1.d;
                this.A = new Xn1.QnHx<>(0);
            }
        }

        public final boolean S() {
            Xn1.QnHx<Descriptors.NUlFixed> qnHx = this.A;
            if (qnHx == null) {
                return true;
            }
            return qnHx.h();
        }

        public final void T(NUlFixed nUl) {
            if (nUl.z != null) {
                R();
                this.A.i(nUl.z);
                M();
            }
        }

        public BuilderType U(Descriptors.NUlFixed nUl, Object obj) {
            if (!nUl.o()) {
                super.b(nUl, obj);
                return this;
            }
            V(nUl);
            R();
            this.A.m(nUl, obj);
            M();
            return this;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.roZB
        public final boolean d(Descriptors.NUlFixed nUl) {
            if (!nUl.o()) {
                return super.d(nUl);
            }
            V(nUl);
            Xn1.QnHx<Descriptors.NUlFixed> qnHx = this.A;
            if (qnHx == null) {
                return false;
            }
            return qnHx.g(nUl);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.roZB
        public final Object l(Descriptors.NUlFixed nUl) {
            if (!nUl.o()) {
                return super.l(nUl);
            }
            V(nUl);
            Xn1.QnHx<Descriptors.NUlFixed> qnHx = this.A;
            Object objK = qnHx == null ? null : Xn1.QnHx.k(nUl, qnHx.f(nUl), true);
            if (objK == null) {
                return nUl.C.w == Descriptors.NUlFixed.CQf.F ? FJCM.F(nUl.n()) : nUl.l();
            }
            return objK;
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx m(Descriptors.NUlFixed nUl) {
            return nUl.o() ? new FJCM.CQf(nUl.n()) : super.m(nUl);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.roZB
        public final Map<Descriptors.NUlFixed, Object> o() {
            TreeMap treeMapG = G();
            Xn1.QnHx<Descriptors.NUlFixed> qnHx = this.A;
            if (qnHx != null) {
                treeMapG.putAll(qnHx.e());
            }
            return Collections.unmodifiableMap(treeMapG);
        }

        @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx z(Descriptors.NUlFixed nUl) {
            if (!nUl.o()) {
                return super.z(nUl);
            }
            V(nUl);
            if (nUl.C.w != Descriptors.NUlFixed.CQf.F) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
            R();
            Object objF = this.A.f(nUl);
            if (objF == null) {
                FJCM.CQf cQf = new FJCM.CQf(nUl.n());
                this.A.m(nUl, cQf);
                M();
                return cQf;
            }
            if (objF instanceof mw0t.QnHx) {
                return (mw0t.QnHx) objF;
            }
            if (!(objF instanceof mw0t)) {
                throw new UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
            }
            mw0t.QnHx qnHxC = ((mw0t) objF).c();
            this.A.m(nUl, qnHxC);
            M();
            return qnHxC;
        }

        public LPt8Fixed(F1 f1) {
            super(f1);
        }
    }

    public class QnHx implements F1 {
        public final /* synthetic */ com.google.protobuf.QnHx.CQf a;

        public QnHx(com.google.protobuf.QnHx.CQf cQf) {
            this.a = cQf;
        }

        @Override // com.google.protobuf.QnHx.CQf
        public final void a() {
            this.a.a();
        }
    }

    public static final class YKK {
        public final Descriptors.QnHx a;
        public final QnHx[] b;
        public String[] c;
        public final F1[] d;
        public volatile boolean e = false;

        public static class CQf implements QnHx {
            public final Descriptors.NUlFixed a;

            public CQf(Descriptors.NUlFixed nUl, Class cls) {
                this.a = nUl;
                k((lPt3Fixed) lPt3Fixed.G(null, lPt3Fixed.F(cls, "getDefaultInstance", new Class[0]), new Object[0]));
                throw null;
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final void a(CQf cQf, Object obj) {
                l(cQf);
                throw null;
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final mw0t.QnHx b() {
                throw null;
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final Object c(lPt3Fixed lpt3) {
                d(lpt3);
                throw null;
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final Object d(lPt3Fixed lpt3) {
                new ArrayList();
                k(lpt3);
                throw null;
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final boolean e(lPt3Fixed lpt3) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final void f(CQf cQf, Object obj) {
                l(cQf);
                throw null;
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final mw0t.QnHx g(CQf cQf) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final Object h(CQf cQf) {
                new ArrayList();
                j(cQf);
                throw null;
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final boolean i(CQf cQf) {
                throw new UnsupportedOperationException("hasField() is not supported for repeated fields.");
            }

            public final void j(CQf cQf) {
                int i = this.a.x.B;
                cQf.getClass();
                throw new RuntimeException("No map fields found in ".concat(cQf.getClass().getName()));
            }

            public final void k(lPt3Fixed lpt3) {
                int i = this.a.x.B;
                lpt3.getClass();
                throw new RuntimeException("No map fields found in ".concat(lpt3.getClass().getName()));
            }

            public final void l(CQf cQf) {
                int i = this.a.x.B;
                cQf.getClass();
                throw new RuntimeException("No map fields found in ".concat(cQf.getClass().getName()));
            }
        }

        public static final class EQ extends T23 {
            public final Method f;
            public final Method g;

            public EQ(Descriptors.NUlFixed nUl, String str, Class<? extends lPt3Fixed> cls, Class<? extends CQf> cls2, String str2) {
                super(nUl, str, cls, cls2, str2);
                this.f = lPt3Fixed.F(cls, fc2.a("get", str, "Bytes"), new Class[0]);
                lPt3Fixed.F(cls2, fc2.a("get", str, "Bytes"), new Class[0]);
                this.g = lPt3Fixed.F(cls2, fc2.a("set", str, "Bytes"), new Class[]{lk.class});
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.T23, com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final Object c(lPt3Fixed lpt3) {
                return lPt3Fixed.G(lpt3, this.f, new Object[0]);
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.T23, com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final void f(CQf cQf, Object obj) {
                if (obj instanceof lk) {
                    lPt3Fixed.G(cQf, this.g, new Object[]{obj});
                } else {
                    super.f(cQf, obj);
                }
            }
        }

        public static class F1 {
            public final Descriptors.QnHx a;
            public final Method b;
            public final Method c;
            public final Descriptors.NUlFixed d;

            public F1(Descriptors.QnHx qnHx, int i, String str, Class<? extends lPt3Fixed> cls, Class<? extends CQf> cls2) {
                this.a = qnHx;
                Descriptors.byN byn = qnHx.p().get(i);
                if (byn.g()) {
                    this.b = null;
                    this.c = null;
                    this.d = (Descriptors.NUlFixed) Collections.unmodifiableList(Arrays.asList(byn.C)).get(0);
                } else {
                    this.b = lPt3Fixed.F(cls, fc2.a("get", str, "Case"), new Class[0]);
                    this.c = lPt3Fixed.F(cls2, fc2.a("get", str, "Case"), new Class[0]);
                    this.d = null;
                }
                lPt3Fixed.F(cls2, b70.a("clear", str), new Class[0]);
            }
        }

        public static final class LPt8Fixed extends NUlFixed {
            public final Descriptors.F1 c;
            public final Method d;
            public final Method e;
            public final boolean f;
            public final Method g;
            public final Method h;
            public final Method i;

            public LPt8Fixed(Descriptors.NUlFixed nUl, String str, Class<? extends lPt3Fixed> cls, Class<? extends CQf> cls2) {
                super(str, cls, cls2);
                this.c = nUl.m();
                this.d = lPt3Fixed.F(this.a, "valueOf", new Class[]{Descriptors.LPt8Fixed.class});
                this.e = lPt3Fixed.F(this.a, "getValueDescriptor", new Class[0]);
                boolean z = nUl.z.m() == 3;
                this.f = z;
                if (z) {
                    String strA = fc2.a("get", str, "Value");
                    Class cls3 = Integer.TYPE;
                    this.g = lPt3Fixed.F(cls, strA, new Class[]{cls3});
                    this.h = lPt3Fixed.F(cls2, fc2.a("get", str, "Value"), new Class[]{cls3});
                    lPt3Fixed.F(cls2, fc2.a("set", str, "Value"), new Class[]{cls3, cls3});
                    this.i = lPt3Fixed.F(cls2, fc2.a("add", str, "Value"), new Class[]{cls3});
                }
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.NUlFixed, com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final void a(CQf cQf, Object obj) {
                if (this.f) {
                    lPt3Fixed.G(cQf, this.i, new Object[]{Integer.valueOf(((Descriptors.LPt8Fixed) obj).w.B)});
                } else {
                    super.a(cQf, lPt3Fixed.G(null, this.d, new Object[]{obj}));
                }
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.NUlFixed, com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final Object d(lPt3Fixed lpt3) {
                Object objG;
                ArrayList arrayList = new ArrayList();
                NUlFixed.QnHx qnHx = this.b;
                int iIntValue = ((Integer) lPt3Fixed.G(lpt3, qnHx.f, new Object[0])).intValue();
                for (int i = 0; i < iIntValue; i++) {
                    if (this.f) {
                        objG = this.c.l(((Integer) lPt3Fixed.G(lpt3, this.g, new Object[]{Integer.valueOf(i)})).intValue());
                    } else {
                        qnHx.getClass();
                        objG = lPt3Fixed.G(lPt3Fixed.G(lpt3, qnHx.c, new Object[]{Integer.valueOf(i)}), this.e, new Object[0]);
                    }
                    arrayList.add(objG);
                }
                return Collections.unmodifiableList(arrayList);
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.NUlFixed, com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final Object h(CQf cQf) {
                Object objG;
                ArrayList arrayList = new ArrayList();
                NUlFixed.QnHx qnHx = this.b;
                int iIntValue = ((Integer) lPt3Fixed.G(cQf, qnHx.g, new Object[0])).intValue();
                for (int i = 0; i < iIntValue; i++) {
                    if (this.f) {
                        objG = this.c.l(((Integer) lPt3Fixed.G(cQf, this.h, new Object[]{Integer.valueOf(i)})).intValue());
                    } else {
                        qnHx.getClass();
                        objG = lPt3Fixed.G(lPt3Fixed.G(cQf, qnHx.d, new Object[]{Integer.valueOf(i)}), this.e, new Object[0]);
                    }
                    arrayList.add(objG);
                }
                return Collections.unmodifiableList(arrayList);
            }
        }

        public static class NUlFixed implements QnHx {
            public final Class a;
            public final QnHx b;

            public static final class QnHx {
                public final Method a;
                public final Method b;
                public final Method c;
                public final Method d;
                public final Method e;
                public final Method f;
                public final Method g;
                public final Method h;

                public QnHx(String str, Class cls, Class cls2) {
                    this.a = lPt3Fixed.F(cls, fc2.a("get", str, "List"), new Class[0]);
                    this.b = lPt3Fixed.F(cls2, fc2.a("get", str, "List"), new Class[0]);
                    String strA = b70.a("get", str);
                    Class cls3 = Integer.TYPE;
                    Method methodF = lPt3Fixed.F(cls, strA, new Class[]{cls3});
                    this.c = methodF;
                    this.d = lPt3Fixed.F(cls2, b70.a("get", str), new Class[]{cls3});
                    Class<?> returnType = methodF.getReturnType();
                    lPt3Fixed.F(cls2, b70.a("set", str), new Class[]{cls3, returnType});
                    this.e = lPt3Fixed.F(cls2, b70.a("add", str), new Class[]{returnType});
                    this.f = lPt3Fixed.F(cls, fc2.a("get", str, "Count"), new Class[0]);
                    this.g = lPt3Fixed.F(cls2, fc2.a("get", str, "Count"), new Class[0]);
                    this.h = lPt3Fixed.F(cls2, b70.a("clear", str), new Class[0]);
                }
            }

            public NUlFixed(String str, Class cls, Class cls2) {
                QnHx qnHx = new QnHx(str, cls, cls2);
                this.a = qnHx.c.getReturnType();
                this.b = qnHx;
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public void a(CQf cQf, Object obj) {
                QnHx qnHx = this.b;
                qnHx.getClass();
                lPt3Fixed.G(cQf, qnHx.e, new Object[]{obj});
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public mw0t.QnHx b() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final Object c(lPt3Fixed lpt3) {
                return d(lpt3);
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public Object d(lPt3Fixed lpt3) {
                return lPt3Fixed.G(lpt3, this.b.a, new Object[0]);
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final boolean e(lPt3Fixed lpt3) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final void f(CQf cQf, Object obj) {
                lPt3Fixed.G(cQf, this.b.h, new Object[0]);
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    a(cQf, it.next());
                }
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final mw0t.QnHx g(CQf cQf) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public Object h(CQf cQf) {
                return lPt3Fixed.G(cQf, this.b.b, new Object[0]);
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final boolean i(CQf cQf) {
                throw new UnsupportedOperationException("hasField() called on a repeated field.");
            }
        }

        public interface QnHx {
            void a(CQf cQf, Object obj);

            mw0t.QnHx b();

            Object c(lPt3Fixed lpt3);

            Object d(lPt3Fixed lpt3);

            boolean e(lPt3Fixed lpt3);

            void f(CQf cQf, Object obj);

            mw0t.QnHx g(CQf cQf);

            Object h(CQf cQf);

            boolean i(CQf cQf);
        }

        public static class T23 implements QnHx {
            public final Class<?> a;
            public final Descriptors.NUlFixed b;
            public final boolean c;
            public final boolean d;
            public final QnHx e;

            public static final class QnHx {
                public final Method a;
                public final Method b;
                public final Method c;
                public final Method d;
                public final Method e;
                public final Method f;
                public final Method g;

                public QnHx(String str, Class cls, Class cls2, String str2, boolean z, boolean z2) {
                    Method methodF = lPt3Fixed.F(cls, b70.a("get", str), new Class[0]);
                    this.a = methodF;
                    this.b = lPt3Fixed.F(cls2, b70.a("get", str), new Class[0]);
                    this.c = lPt3Fixed.F(cls2, b70.a("set", str), new Class[]{methodF.getReturnType()});
                    this.d = z2 ? lPt3Fixed.F(cls, b70.a("has", str), new Class[0]) : null;
                    this.e = z2 ? lPt3Fixed.F(cls2, b70.a("has", str), new Class[0]) : null;
                    lPt3Fixed.F(cls2, b70.a("clear", str), new Class[0]);
                    this.f = z ? lPt3Fixed.F(cls, fc2.a("get", str2, "Case"), new Class[0]) : null;
                    this.g = z ? lPt3Fixed.F(cls2, fc2.a("get", str2, "Case"), new Class[0]) : null;
                }
            }

            /* JADX WARN: Code duplicated, block: B:26:0x0044  */
            public T23(Descriptors.NUlFixed nUl, String str, Class<? extends lPt3Fixed> cls, Class<? extends CQf> cls2, String str2) {
                boolean z;
                Descriptors.byN byn = nUl.F;
                boolean z2 = (byn == null || byn.g()) ? false : true;
                this.c = z2;
                Descriptors.YKK ykk = nUl.z;
                if (ykk.m() == 2) {
                    z = true;
                } else {
                    if ((nUl.B || (ykk.m() == 2 && nUl.q() && byn == null)) || (!z2 && nUl.C.w == Descriptors.NUlFixed.CQf.F)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
                this.d = z;
                QnHx qnHx = new QnHx(str, cls, cls2, str2, z2, z);
                this.b = nUl;
                this.a = qnHx.a.getReturnType();
                this.e = qnHx;
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final void a(CQf cQf, Object obj) {
                throw new UnsupportedOperationException("addRepeatedField() called on a singular field.");
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public mw0t.QnHx b() {
                throw new UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public Object c(lPt3Fixed lpt3) {
                return d(lpt3);
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public Object d(lPt3Fixed lpt3) {
                return lPt3Fixed.G(lpt3, this.e.a, new Object[0]);
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final boolean e(lPt3Fixed lpt3) {
                boolean z = this.d;
                QnHx qnHx = this.e;
                if (z) {
                    return ((Boolean) lPt3Fixed.G(lpt3, qnHx.d, new Object[0])).booleanValue();
                }
                boolean z2 = this.c;
                Descriptors.NUlFixed nUl = this.b;
                if (z2) {
                    return ((SjP.QnHx) lPt3Fixed.G(lpt3, qnHx.f, new Object[0])).b() == nUl.x.B;
                }
                return !d(lpt3).equals(nUl.l());
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public void f(CQf cQf, Object obj) {
                QnHx qnHx = this.e;
                qnHx.getClass();
                lPt3Fixed.G(cQf, qnHx.c, new Object[]{obj});
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public mw0t.QnHx g(CQf cQf) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public Object h(CQf cQf) {
                return lPt3Fixed.G(cQf, this.e.b, new Object[0]);
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final boolean i(CQf cQf) {
                boolean z = this.d;
                QnHx qnHx = this.e;
                if (z) {
                    return ((Boolean) lPt3Fixed.G(cQf, qnHx.e, new Object[0])).booleanValue();
                }
                boolean z2 = this.c;
                Descriptors.NUlFixed nUl = this.b;
                if (z2) {
                    return ((SjP.QnHx) lPt3Fixed.G(cQf, qnHx.g, new Object[0])).b() == nUl.x.B;
                }
                return !h(cQf).equals(nUl.l());
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.lPt3$YKK$YKK, reason: collision with other inner class name */
        public static final class C0103YKK extends NUlFixed {
            public final Method c;

            public C0103YKK(String str, Class cls, Class cls2) {
                super(str, cls, cls2);
                this.c = lPt3Fixed.F(this.a, "newBuilder", new Class[0]);
                lPt3Fixed.F(cls2, fc2.a("get", str, "Builder"), new Class[]{Integer.TYPE});
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.NUlFixed, com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final void a(CQf cQf, Object obj) {
                if (!this.a.isInstance(obj)) {
                    obj = ((mw0t.QnHx) lPt3Fixed.G(null, this.c, new Object[0])).s((mw0t) obj).build();
                }
                super.a(cQf, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.NUlFixed, com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final mw0t.QnHx b() {
                return (mw0t.QnHx) lPt3Fixed.G(null, this.c, new Object[0]);
            }
        }

        public static final class auxFixed extends T23 {
            public final Descriptors.F1 f;
            public final Method g;
            public final Method h;
            public final boolean i;
            public final Method j;
            public final Method k;
            public final Method l;

            public auxFixed(Descriptors.NUlFixed nUl, String str, Class<? extends lPt3Fixed> cls, Class<? extends CQf> cls2, String str2) {
                super(nUl, str, cls, cls2, str2);
                this.f = nUl.m();
                this.g = lPt3Fixed.F(this.a, "valueOf", new Class[]{Descriptors.LPt8Fixed.class});
                this.h = lPt3Fixed.F(this.a, "getValueDescriptor", new Class[0]);
                boolean z = nUl.z.m() == 3;
                this.i = z;
                if (z) {
                    this.j = lPt3Fixed.F(cls, fc2.a("get", str, "Value"), new Class[0]);
                    this.k = lPt3Fixed.F(cls2, fc2.a("get", str, "Value"), new Class[0]);
                    this.l = lPt3Fixed.F(cls2, fc2.a("set", str, "Value"), new Class[]{Integer.TYPE});
                }
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.T23, com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final Object d(lPt3Fixed lpt3) {
                if (this.i) {
                    return this.f.l(((Integer) lPt3Fixed.G(lpt3, this.j, new Object[0])).intValue());
                }
                return lPt3Fixed.G(super.d(lpt3), this.h, new Object[0]);
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.T23, com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final void f(CQf cQf, Object obj) {
                if (this.i) {
                    lPt3Fixed.G(cQf, this.l, new Object[]{Integer.valueOf(((Descriptors.LPt8Fixed) obj).w.B)});
                } else {
                    super.f(cQf, lPt3Fixed.G(null, this.g, new Object[]{obj}));
                }
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.T23, com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final Object h(CQf cQf) {
                if (this.i) {
                    return this.f.l(((Integer) lPt3Fixed.G(cQf, this.k, new Object[0])).intValue());
                }
                return lPt3Fixed.G(super.h(cQf), this.h, new Object[0]);
            }
        }

        public static final class byN extends T23 {
            public final Method f;
            public final Method g;

            public byN(Descriptors.NUlFixed nUl, String str, Class<? extends lPt3Fixed> cls, Class<? extends CQf> cls2, String str2) {
                super(nUl, str, cls, cls2, str2);
                this.f = lPt3Fixed.F(this.a, "newBuilder", new Class[0]);
                this.g = lPt3Fixed.F(cls2, fc2.a("get", str, "Builder"), new Class[0]);
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.T23, com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final mw0t.QnHx b() {
                return (mw0t.QnHx) lPt3Fixed.G(null, this.f, new Object[0]);
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.T23, com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final void f(CQf cQf, Object obj) {
                if (!this.a.isInstance(obj)) {
                    obj = ((mw0t.QnHx) lPt3Fixed.G(null, this.f, new Object[0])).s((mw0t) obj).f();
                }
                super.f(cQf, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.YKK.T23, com.google.protobuf.lPt3Fixed.YKK.QnHx
            public final mw0t.QnHx g(CQf cQf) {
                return (mw0t.QnHx) lPt3Fixed.G(cQf, this.g, new Object[0]);
            }
        }

        public YKK(Descriptors.QnHx qnHx, String[] strArr) {
            this.a = qnHx;
            this.c = strArr;
            this.b = new QnHx[qnHx.n().size()];
            this.d = new F1[qnHx.p().size()];
        }

        public static F1 a(YKK ykk, Descriptors.byN byn) {
            ykk.getClass();
            if (byn.A == ykk.a) {
                return ykk.d[byn.w];
            }
            throw new IllegalArgumentException("OneofDescriptor does not match message type.");
        }

        public static QnHx b(YKK ykk, Descriptors.NUlFixed nUl) {
            ykk.getClass();
            if (nUl.D != ykk.a) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
            if (nUl.o()) {
                throw new IllegalArgumentException("This type does not have extensions.");
            }
            return ykk.b[nUl.w];
        }

        public final void c(Class cls, Class cls2) {
            if (this.e) {
                return;
            }
            synchronized (this) {
                if (this.e) {
                    return;
                }
                int length = this.b.length;
                for (int i = 0; i < length; i++) {
                    Descriptors.NUlFixed nUl = this.a.n().get(i);
                    Descriptors.byN byn = nUl.F;
                    String str = byn != null ? this.c[byn.w + length] : null;
                    if (nUl.f()) {
                        Descriptors.NUlFixed.CQf cQf = nUl.C.w;
                        if (cQf == Descriptors.NUlFixed.CQf.F) {
                            if (nUl.p()) {
                                String str2 = this.c[i];
                                new CQf(nUl, cls);
                                throw null;
                            }
                            this.b[i] = new C0103YKK(this.c[i], cls, cls2);
                        } else if (cQf == Descriptors.NUlFixed.CQf.E) {
                            this.b[i] = new LPt8Fixed(nUl, this.c[i], cls, cls2);
                        } else {
                            this.b[i] = new NUlFixed(this.c[i], cls, cls2);
                        }
                    } else {
                        Descriptors.NUlFixed.CQf cQf2 = nUl.C.w;
                        if (cQf2 == Descriptors.NUlFixed.CQf.F) {
                            this.b[i] = new byN(nUl, this.c[i], cls, cls2, str);
                        } else if (cQf2 == Descriptors.NUlFixed.CQf.E) {
                            this.b[i] = new auxFixed(nUl, this.c[i], cls, cls2, str);
                        } else if (cQf2 == Descriptors.NUlFixed.CQf.C) {
                            this.b[i] = new EQ(nUl, this.c[i], cls, cls2, str);
                        } else {
                            this.b[i] = new T23(nUl, this.c[i], cls, cls2, str);
                        }
                    }
                }
                int length2 = this.d.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    this.d[i2] = new F1(this.a, i2, this.c[i2 + length], cls, cls2);
                }
                this.e = true;
                this.c = null;
            }
        }
    }

    public lPt3Fixed() {
        this.y = k.x;
    }

    public static Method F(Class cls, String str, Class[] clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object G(Object obj, Method method, Object[] objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static int H(int i, Object obj) {
        return obj instanceof String ? CodedOutputStream.n1(i, (String) obj) : CodedOutputStream.W0(i, (lk) obj);
    }

    public static int I(Object obj) {
        return obj instanceof String ? CodedOutputStream.o1((String) obj) : CodedOutputStream.X0((lk) obj);
    }

    public static boolean M(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).isEmpty();
        }
        return ((lk) obj).size() == 0;
    }

    public static ck32 N(SjP.F1 f1) {
        int size = f1.size();
        int i = size == 0 ? 10 : size * 2;
        ck32 ck32Var = (ck32) f1;
        if (i >= ck32Var.y) {
            return new ck32(Arrays.copyOf(ck32Var.x, i), ck32Var.y);
        }
        throw new IllegalArgumentException();
    }

    public static mw0t P(com.google.protobuf.F1 f1, InputStream inputStream) throws IOException {
        try {
            return (mw0t) f1.d(inputStream);
        } catch (InvalidProtocolBufferException e) {
            throw e.g();
        }
    }

    public static boolean Q(com.google.protobuf.NUlFixed nUl, k.QnHx qnHx, int i) {
        nUl.getClass();
        return qnHx.u(i, nUl);
    }

    public static void R(CodedOutputStream codedOutputStream, int i, Object obj) {
        if (obj instanceof String) {
            codedOutputStream.L1(i, (String) obj);
        } else {
            codedOutputStream.y1(i, (lk) obj);
        }
    }

    @Override // com.google.protobuf.QnHx
    public final mw0t.QnHx E(com.google.protobuf.QnHx.CQf cQf) {
        return O(new QnHx(cQf));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    public final TreeMap J(boolean z) {
        boolean zD;
        TreeMap treeMap = new TreeMap();
        List<Descriptors.NUlFixed> listN = L().a.n();
        int i = 0;
        while (i < listN.size()) {
            Descriptors.NUlFixed nUlM = listN.get(i);
            Descriptors.byN byn = nUlM.F;
            if (byn != null) {
                i += byn.B - 1;
                YKK.F1 f1A = YKK.a(L(), byn);
                Descriptors.NUlFixed nUl = f1A.d;
                if (nUl != null) {
                    zD = d(nUl);
                } else {
                    zD = ((SjP.QnHx) G(this, f1A.b, new Object[0])).b() != 0;
                }
                if (zD) {
                    YKK.F1 f1A2 = YKK.a(L(), byn);
                    Descriptors.NUlFixed nUl2 = f1A2.d;
                    if (nUl2 == null) {
                        int iB = ((SjP.QnHx) G(this, f1A2.b, new Object[0])).b();
                        if (iB > 0) {
                            nUlM = f1A2.a.m(iB);
                        } else {
                            nUlM = null;
                        }
                    } else if (d(nUl2)) {
                        nUlM = nUl2;
                    } else {
                        nUlM = null;
                    }
                    if (z || nUlM.C.w != Descriptors.NUlFixed.CQf.C) {
                        treeMap.put(nUlM, l(nUlM));
                    } else {
                        treeMap.put(nUlM, YKK.b(L(), nUlM).c(this));
                    }
                }
            } else if (nUlM.f()) {
                List list = (List) l(nUlM);
                if (!list.isEmpty()) {
                    treeMap.put(nUlM, list);
                }
            } else if (d(nUlM)) {
                if (z) {
                    treeMap.put(nUlM, l(nUlM));
                } else {
                    treeMap.put(nUlM, l(nUlM));
                }
            }
            i++;
        }
        return treeMap;
    }

    public Map<Descriptors.NUlFixed, Object> K() {
        return Collections.unmodifiableMap(J(true));
    }

    public abstract YKK L();

    public abstract mw0t.QnHx O(QnHx qnHx);

    @Override // com.google.protobuf.roZB
    public boolean d(Descriptors.NUlFixed nUl) {
        return YKK.b(L(), nUl).e(this);
    }

    @Override // com.google.protobuf.roZB
    public final Descriptors.QnHx e() {
        return L().a;
    }

    @Override // com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public void h(CodedOutputStream codedOutputStream) {
        kK.e(this, K(), codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx, defpackage.jd2
    public boolean isInitialized() {
        for (Descriptors.NUlFixed nUl : e().n()) {
            if (nUl.s() && !d(nUl)) {
                return false;
            }
            if (nUl.C.w == Descriptors.NUlFixed.CQf.F) {
                if (nUl.f()) {
                    Iterator it = ((List) l(nUl)).iterator();
                    while (it.hasNext()) {
                        if (!((mw0t) it.next()).isInitialized()) {
                            return false;
                        }
                    }
                } else if (d(nUl) && !((mw0t) l(nUl)).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public int j() {
        int i = this.x;
        if (i != -1) {
            return i;
        }
        int iB = kK.b(this, K());
        this.x = iB;
        return iB;
    }

    public k k() {
        return this.y;
    }

    @Override // com.google.protobuf.roZB
    public Object l(Descriptors.NUlFixed nUl) {
        return YKK.b(L(), nUl).d(this);
    }

    @Override // com.google.protobuf.roZB
    public Map<Descriptors.NUlFixed, Object> o() {
        return Collections.unmodifiableMap(J(false));
    }

    @Override // com.google.protobuf.DzVS
    public oz2<? extends lPt3Fixed> p() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public static abstract class NUlFixed<MessageType extends NUlFixed> extends lPt3Fixed implements roZB {
        public final Xn1<Descriptors.NUlFixed> z;

        public class QnHx {
            public final Iterator<Map.Entry<Descriptors.NUlFixed, Object>> a;
            public Map.Entry<Descriptors.NUlFixed, Object> b;
            public final boolean c;

            public QnHx(NUlFixed nUl) {
                Iterator itQ = nUl.z.q();
                this.a = itQ;
                if (itQ.hasNext()) {
                    this.b = (Map.Entry) itQ.next();
                }
                this.c = false;
            }

            public final void a(CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry<Descriptors.NUlFixed, Object> entry = this.b;
                    if (entry == null || entry.getKey().x.B >= 536870912) {
                        return;
                    }
                    Descriptors.NUlFixed key = this.b.getKey();
                    if (this.c && key.j() == LF.CQf.F && !key.f()) {
                        Map.Entry<Descriptors.NUlFixed, Object> entry2 = this.b;
                        boolean z = entry2 instanceof Aa.QnHx;
                        EQ.auxFixed auxVar = key.x;
                        if (z) {
                            codedOutputStream.K1(auxVar.B, ((Aa.QnHx) entry2).w.getValue().b());
                        } else {
                            codedOutputStream.J1(auxVar.B, (mw0t) entry2.getValue());
                        }
                    } else {
                        Xn1.w(key, this.b.getValue(), codedOutputStream);
                    }
                    Iterator<Map.Entry<Descriptors.NUlFixed, Object>> it = this.a;
                    if (it.hasNext()) {
                        this.b = it.next();
                    } else {
                        this.b = null;
                    }
                }
            }
        }

        public NUlFixed() {
            this.z = new Xn1<>();
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final Map<Descriptors.NUlFixed, Object> K() {
            TreeMap treeMapJ = J(false);
            treeMapJ.putAll(U());
            return Collections.unmodifiableMap(treeMapJ);
        }

        public final boolean S() {
            return this.z.n();
        }

        public final int T() {
            return this.z.k();
        }

        public final Map<Descriptors.NUlFixed, Object> U() {
            return this.z.g();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final boolean d(Descriptors.NUlFixed nUl) {
            if (!nUl.o()) {
                return super.d(nUl);
            }
            if (nUl.D == e()) {
                return this.z.l(nUl);
            }
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public boolean isInitialized() {
            return super.isInitialized() && S();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final Object l(Descriptors.NUlFixed nUl) {
            if (!nUl.o()) {
                return super.l(nUl);
            }
            if (nUl.D != e()) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
            Object objH = this.z.h(nUl);
            if (objH != null) {
                return objH;
            }
            if (nUl.f()) {
                return Collections.emptyList();
            }
            return nUl.C.w == Descriptors.NUlFixed.CQf.F ? FJCM.F(nUl.n()) : nUl.l();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final Map<Descriptors.NUlFixed, Object> o() {
            TreeMap treeMapJ = J(false);
            treeMapJ.putAll(U());
            return Collections.unmodifiableMap(treeMapJ);
        }

        public NUlFixed(LPt8Fixed<MessageType, ?> lPt8) {
            Xn1 xn1B;
            super(lPt8);
            Xn1.QnHx<Descriptors.NUlFixed> qnHx = lPt8.A;
            if (qnHx == null) {
                xn1B = Xn1.d;
            } else {
                xn1B = qnHx.b(true);
            }
            this.z = xn1B;
        }
    }

    public lPt3Fixed(CQf<?> cQf) {
        this.y = cQf.k();
    }
}
