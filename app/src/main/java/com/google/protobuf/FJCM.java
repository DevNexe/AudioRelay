package com.google.protobuf;

import defpackage.oz2;
import defpackage.vv0;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class FJCM extends com.google.protobuf.QnHx {
    public final Descriptors.NUlFixed[] A;
    public final k B;
    public int C = -1;
    public final Descriptors.QnHx y;
    public final Xn1<Descriptors.NUlFixed> z;

    public static final class CQf extends com.google.protobuf.QnHx.AbstractC0099QnHx<CQf> {
        public final Descriptors.QnHx w;
        public final Xn1.QnHx<Descriptors.NUlFixed> x;
        public final Descriptors.NUlFixed[] y;
        public k z;

        public CQf(Descriptors.QnHx qnHx) {
            this.w = qnHx;
            Xn1 xn1 = Xn1.d;
            this.x = new Xn1.QnHx<>(0);
            this.z = k.x;
            this.y = new Descriptors.NUlFixed[qnHx.w.U()];
        }

        public static void J(Descriptors.NUlFixed nUl, Object obj) {
            int iOrdinal = nUl.C.ordinal();
            if (iOrdinal == 10) {
                if (obj instanceof mw0t.QnHx) {
                    throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(nUl.x.B), nUl.h().w, obj.getClass().getName()));
                }
            } else {
                if (iOrdinal != 13) {
                    return;
                }
                obj.getClass();
                if (!(obj instanceof Descriptors.LPt8Fixed)) {
                    throw new IllegalArgumentException("DynamicMessage should use EnumValueDescriptor to set Enum Value.");
                }
            }
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        public final void B(k kVar) {
            k kVar2 = this.z;
            k kVar3 = k.x;
            k.QnHx qnHx = new k.QnHx();
            qnHx.w(kVar2);
            qnHx.w(kVar);
            this.z = qnHx.build();
        }

        @Override // com.google.protobuf.DzVS.QnHx
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final FJCM build() {
            if (isInitialized()) {
                return f();
            }
            Xn1<T> xn1B = this.x.b(false);
            Descriptors.NUlFixed[] nUlArr = this.y;
            throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(new FJCM(this.w, xn1B, (Descriptors.NUlFixed[]) Arrays.copyOf(nUlArr, nUlArr.length), this.z));
        }

        @Override // com.google.protobuf.DzVS.QnHx
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public final FJCM f() {
            Descriptors.QnHx qnHx = this.w;
            boolean z = qnHx.q().E;
            Xn1.QnHx<Descriptors.NUlFixed> qnHx2 = this.x;
            if (z) {
                for (Descriptors.NUlFixed nUl : qnHx.n()) {
                    if (nUl.q() && !qnHx2.g(nUl)) {
                        if (nUl.C.w == Descriptors.NUlFixed.CQf.F) {
                            qnHx2.m(nUl, FJCM.F(nUl.n()));
                        } else {
                            qnHx2.m(nUl, nUl.l());
                        }
                    }
                }
            }
            Xn1<T> xn1B = qnHx2.b(true);
            Descriptors.NUlFixed[] nUlArr = this.y;
            return new FJCM(qnHx, xn1B, (Descriptors.NUlFixed[]) Arrays.copyOf(nUlArr, nUlArr.length), this.z);
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public final CQf clone() {
            CQf cQf = new CQf(this.w);
            cQf.x.i(this.x.b(false));
            k kVar = this.z;
            k kVar2 = cQf.z;
            k kVar3 = k.x;
            k.QnHx qnHx = new k.QnHx();
            qnHx.w(kVar2);
            qnHx.w(kVar);
            cQf.z = qnHx.build();
            Descriptors.NUlFixed[] nUlArr = this.y;
            System.arraycopy(nUlArr, 0, cQf.y, 0, nUlArr.length);
            return cQf;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public final CQf s(mw0t mw0tVar) {
            if (!(mw0tVar instanceof FJCM)) {
                super.s(mw0tVar);
                return this;
            }
            FJCM fjcm = (FJCM) mw0tVar;
            if (fjcm.y != this.w) {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
            Xn1<Descriptors.NUlFixed> xn1 = fjcm.z;
            Xn1.QnHx<Descriptors.NUlFixed> qnHx = this.x;
            qnHx.i(xn1);
            k kVar = this.z;
            k kVar2 = k.x;
            k.QnHx qnHx2 = new k.QnHx();
            qnHx2.w(kVar);
            qnHx2.w(fjcm.B);
            this.z = qnHx2.build();
            int i = 0;
            while (true) {
                Descriptors.NUlFixed[] nUlArr = this.y;
                if (i >= nUlArr.length) {
                    return this;
                }
                Descriptors.NUlFixed nUl = nUlArr[i];
                Descriptors.NUlFixed[] nUlArr2 = fjcm.A;
                if (nUl == null) {
                    nUlArr[i] = nUlArr2[i];
                } else {
                    Descriptors.NUlFixed nUl2 = nUlArr2[i];
                    if (nUl2 != null && nUl != nUl2) {
                        qnHx.c(nUl);
                        nUlArr[i] = nUlArr2[i];
                    }
                }
                i++;
            }
        }

        public final void I(Descriptors.NUlFixed nUl) {
            if (nUl.D != this.w) {
                throw new IllegalArgumentException("FieldDescriptor does not match message type.");
            }
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return FJCM.F(this.w);
        }

        @Override // com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
            I(nUl);
            if (nUl.f()) {
                Iterator it = ((List) obj).iterator();
                while (it.hasNext()) {
                    J(nUl, it.next());
                }
            } else {
                J(nUl, obj);
            }
            Xn1.QnHx<Descriptors.NUlFixed> qnHx = this.x;
            Descriptors.byN byn = nUl.F;
            if (byn == null) {
                if (nUl.z.m() == 3 && !nUl.f() && nUl.C.w != Descriptors.NUlFixed.CQf.F && obj.equals(nUl.l())) {
                    qnHx.c(nUl);
                }
                return this;
            }
            Descriptors.NUlFixed[] nUlArr = this.y;
            int i = byn.w;
            Descriptors.NUlFixed nUl2 = nUlArr[i];
            if (nUl2 != null && nUl2 != nUl) {
                qnHx.c(nUl2);
            }
            nUlArr[i] = nUl;
            qnHx.m(nUl, obj);
            return this;
        }

        @Override // com.google.protobuf.roZB
        public final boolean d(Descriptors.NUlFixed nUl) {
            I(nUl);
            return this.x.g(nUl);
        }

        @Override // com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
        public final Descriptors.QnHx e() {
            return this.w;
        }

        @Override // com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
            I(nUl);
            J(nUl, obj);
            this.x.a(nUl, obj);
            return this;
        }

        @Override // defpackage.jd2
        public final boolean isInitialized() {
            Iterator<Descriptors.NUlFixed> it = this.w.n().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                Xn1.QnHx<Descriptors.NUlFixed> qnHx = this.x;
                if (!zHasNext) {
                    return qnHx.h();
                }
                Descriptors.NUlFixed next = it.next();
                if (next.s() && !qnHx.g(next)) {
                    return false;
                }
            }
        }

        @Override // com.google.protobuf.roZB
        public final k k() {
            return this.z;
        }

        @Override // com.google.protobuf.roZB
        public final Object l(Descriptors.NUlFixed nUl) {
            I(nUl);
            Object objK = Xn1.QnHx.k(nUl, this.x.f(nUl), true);
            if (objK != null) {
                return objK;
            }
            if (nUl.f()) {
                return Collections.emptyList();
            }
            return nUl.C.w == Descriptors.NUlFixed.CQf.F ? FJCM.F(nUl.n()) : nUl.l();
        }

        @Override // com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx m(Descriptors.NUlFixed nUl) {
            I(nUl);
            if (nUl.C.w == Descriptors.NUlFixed.CQf.F) {
                return new CQf(nUl.n());
            }
            throw new IllegalArgumentException("newBuilderForField is only valid for fields with message type.");
        }

        @Override // com.google.protobuf.roZB
        public final Map<Descriptors.NUlFixed, Object> o() {
            return this.x.e();
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
        public final /* bridge */ /* synthetic */ mw0t.QnHx s(mw0t mw0tVar) {
            s(mw0tVar);
            return this;
        }

        @Override // com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx y(k kVar) {
            this.z = kVar;
            return this;
        }

        @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
        public final mw0t.QnHx z(Descriptors.NUlFixed nUl) {
            mw0t.QnHx qnHxC;
            I(nUl);
            if (nUl.p()) {
                throw new UnsupportedOperationException("Nested builder not supported for map fields.");
            }
            if (nUl.C.w != Descriptors.NUlFixed.CQf.F) {
                throw new UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
            }
            Xn1.QnHx<Descriptors.NUlFixed> qnHx = this.x;
            Object objF = qnHx.f(nUl);
            if (objF == null) {
                qnHxC = new CQf(nUl.n());
            } else if (objF instanceof mw0t.QnHx) {
                qnHxC = (mw0t.QnHx) objF;
            } else {
                if (objF instanceof Aa) {
                    objF = ((Aa) objF).c();
                }
                if (!(objF instanceof mw0t)) {
                    throw new IllegalArgumentException(String.format("Cannot convert %s to Message.Builder", objF.getClass()));
                }
                qnHxC = ((mw0t) objF).c();
            }
            qnHx.m(nUl, qnHxC);
            return qnHxC;
        }
    }

    public class QnHx extends F1<FJCM> {
        public QnHx() {
        }

        @Override // defpackage.oz2
        public final Object b(NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
            CQf cQf = new CQf(FJCM.this.y);
            try {
                cQf.v(nUl, vv0Var);
                return cQf.f();
            } catch (InvalidProtocolBufferException e) {
                e.w = cQf.f();
                throw e;
            } catch (IOException e2) {
                InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2);
                invalidProtocolBufferException.w = cQf.f();
                throw invalidProtocolBufferException;
            }
        }
    }

    public FJCM(Descriptors.QnHx qnHx, Xn1<Descriptors.NUlFixed> xn1, Descriptors.NUlFixed[] nUlArr, k kVar) {
        this.y = qnHx;
        this.z = xn1;
        this.A = nUlArr;
        this.B = kVar;
    }

    public static FJCM F(Descriptors.QnHx qnHx) {
        return new FJCM(qnHx, Xn1.d, new Descriptors.NUlFixed[qnHx.w.U()], k.x);
    }

    @Override // defpackage.jd2
    public final mw0t a() {
        return F(this.y);
    }

    @Override // com.google.protobuf.DzVS
    public final mw0t.QnHx c() {
        CQf cQf = new CQf(this.y);
        cQf.s(this);
        return cQf;
    }

    @Override // com.google.protobuf.roZB
    public final boolean d(Descriptors.NUlFixed nUl) {
        if (nUl.D == this.y) {
            return this.z.l(nUl);
        }
        throw new IllegalArgumentException("FieldDescriptor does not match message type.");
    }

    @Override // com.google.protobuf.roZB
    public final Descriptors.QnHx e() {
        return this.y;
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
    @Override // com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final void h(CodedOutputStream codedOutputStream) {
        d_OZ<T, Object> d_oz;
        d_OZ<T, Object> d_oz2;
        boolean z = this.y.q().B;
        k kVar = this.B;
        int i = 0;
        Xn1<Descriptors.NUlFixed> xn1 = this.z;
        if (z) {
            while (true) {
                d_oz2 = xn1.a;
                if (i >= d_oz2.e()) {
                    break;
                }
                Xn1.x(d_oz2.c(i), codedOutputStream);
                i++;
            }
            Iterator it = d_oz2.f().iterator();
            while (it.hasNext()) {
                Xn1.x((Map.Entry) it.next(), codedOutputStream);
            }
            kVar.t(codedOutputStream);
            return;
        }
        while (true) {
            d_oz = xn1.a;
            if (i >= d_oz.e()) {
                break;
            }
            Map.Entry entryC = d_oz.c(i);
            Xn1.w((Xn1.CQf) entryC.getKey(), entryC.getValue(), codedOutputStream);
            i++;
        }
        for (Map.Entry entry : d_oz.f()) {
            Xn1.w((Xn1.CQf) entry.getKey(), entry.getValue(), codedOutputStream);
        }
        kVar.h(codedOutputStream);
    }

    @Override // com.google.protobuf.QnHx, defpackage.jd2
    public final boolean isInitialized() {
        Iterator<Descriptors.NUlFixed> it = this.y.n().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            Xn1<Descriptors.NUlFixed> xn1 = this.z;
            if (!zHasNext) {
                return xn1.n();
            }
            Descriptors.NUlFixed next = it.next();
            if (next.s() && !xn1.l(next)) {
                return false;
            }
        }
    }

    @Override // com.google.protobuf.QnHx, com.google.protobuf.DzVS
    public final int j() {
        int iK;
        int iJ;
        int i = this.C;
        if (i != -1) {
            return i;
        }
        boolean z = this.y.q().B;
        k kVar = this.B;
        Xn1<Descriptors.NUlFixed> xn1 = this.z;
        if (z) {
            iK = xn1.i();
            iJ = kVar.q();
        } else {
            iK = xn1.k();
            iJ = kVar.j();
        }
        int i2 = iJ + iK;
        this.C = i2;
        return i2;
    }

    @Override // com.google.protobuf.roZB
    public final k k() {
        return this.B;
    }

    @Override // com.google.protobuf.roZB
    public final Object l(Descriptors.NUlFixed nUl) {
        if (nUl.D != this.y) {
            throw new IllegalArgumentException("FieldDescriptor does not match message type.");
        }
        Object objH = this.z.h(nUl);
        if (objH != null) {
            return objH;
        }
        if (nUl.f()) {
            return Collections.emptyList();
        }
        return nUl.C.w == Descriptors.NUlFixed.CQf.F ? F(nUl.n()) : nUl.l();
    }

    @Override // com.google.protobuf.mw0t
    public final mw0t.QnHx n() {
        return new CQf(this.y);
    }

    @Override // com.google.protobuf.roZB
    public final Map<Descriptors.NUlFixed, Object> o() {
        return this.z.g();
    }

    @Override // com.google.protobuf.DzVS
    public final oz2<FJCM> p() {
        return new QnHx();
    }

    @Override // defpackage.jd2
    public final DzVS a() {
        return F(this.y);
    }

    @Override // com.google.protobuf.DzVS
    public final DzVS.QnHx c() {
        CQf cQf = new CQf(this.y);
        cQf.s(this);
        return cQf;
    }
}
