package com.google.protobuf;

import com.google.android.gms.ads.AdRequest;
import defpackage.Xs;
import defpackage.i22;
import defpackage.lk;
import defpackage.oz2;
import defpackage.vv0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class EQ {
    public static final Descriptors.QnHx A;
    public static final lPt3Fixed.YKK B;
    public static final Descriptors.QnHx C;
    public static final lPt3Fixed.YKK D;
    public static final Descriptors.QnHx E;
    public static final lPt3Fixed.YKK F;
    public static final Descriptors.QnHx G;
    public static final lPt3Fixed.YKK H;
    public static final Descriptors.QnHx I;
    public static final lPt3Fixed.YKK J;
    public static final Descriptors.QnHx K;
    public static final lPt3Fixed.YKK L;
    public static final Descriptors.QnHx M;
    public static final lPt3Fixed.YKK N;
    public static final Descriptors.QnHx O;
    public static final lPt3Fixed.YKK P;
    public static final Descriptors.QnHx Q;
    public static final lPt3Fixed.YKK R;
    public static final Descriptors.QnHx S;
    public static final lPt3Fixed.YKK T;
    public static final Descriptors.QnHx U;
    public static final lPt3Fixed.YKK V;
    public static final Descriptors.QnHx a;
    public static final lPt3Fixed.YKK b;
    public static final Descriptors.QnHx c;
    public static final lPt3Fixed.YKK d;
    public static final Descriptors.QnHx e;
    public static final lPt3Fixed.YKK f;
    public static final Descriptors.QnHx g;
    public static final lPt3Fixed.YKK h;
    public static final Descriptors.QnHx i;
    public static final lPt3Fixed.YKK j;
    public static final Descriptors.QnHx k;
    public static final lPt3Fixed.YKK l;
    public static final Descriptors.QnHx m;
    public static final lPt3Fixed.YKK n;
    public static final Descriptors.QnHx o;
    public static final lPt3Fixed.YKK p;
    public static final Descriptors.QnHx q;
    public static final lPt3Fixed.YKK r;
    public static final Descriptors.QnHx s;
    public static final lPt3Fixed.YKK t;
    public static final Descriptors.QnHx u;
    public static final lPt3Fixed.YKK v;
    public static final Descriptors.QnHx w;
    public static final lPt3Fixed.YKK x;
    public static final Descriptors.QnHx y;
    public static final lPt3Fixed.YKK z;

    public static final class CQf extends lPt3Fixed implements roZB {
        public static final CQf G = new CQf();

        @Deprecated
        public static final QnHx H = new QnHx();
        public volatile Object A;
        public List<LPt8Fixed> B;
        public F1 C;
        public List<F1> D;
        public i22 E;
        public byte F;
        public int z;

        /* JADX INFO: renamed from: com.google.protobuf.EQ$CQf$CQf, reason: collision with other inner class name */
        public static final class C0090CQf extends lPt3Fixed.CQf<C0090CQf> implements roZB {
            public int A;
            public Object B;
            public List<LPt8Fixed> C;
            public F1 D;
            public FA4<F1, F1.CQf, Object> E;
            public List<F1> F;
            public i22 G;

            public C0090CQf() {
                this.B = "";
                this.C = Collections.emptyList();
                this.F = Collections.emptyList();
                this.G = ct.y;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (C0090CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.p;
                ykk.c(CQf.class, C0090CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final CQf f() {
                CQf cQf = new CQf(this);
                int i = this.A;
                int i2 = (i & 1) != 0 ? 1 : 0;
                cQf.A = this.B;
                if ((this.A & 2) != 0) {
                    this.C = Collections.unmodifiableList(this.C);
                    this.A &= -3;
                }
                cQf.B = this.C;
                if ((i & 4) != 0) {
                    FA4<F1, F1.CQf, Object> fa4 = this.E;
                    if (fa4 == null) {
                        cQf.C = this.D;
                    } else {
                        cQf.C = (F1) fa4.b();
                    }
                    i2 |= 2;
                }
                if ((this.A & 8) != 0) {
                    this.F = Collections.unmodifiableList(this.F);
                    this.A &= -9;
                }
                cQf.D = this.F;
                if ((this.A & 16) != 0) {
                    this.G = this.G.t();
                    this.A &= -17;
                }
                cQf.E = this.G;
                cQf.z = i2;
                L();
                return cQf;
            }

            public final void R(CQf cQf) {
                F1 f1;
                F1 f2;
                if (cQf == CQf.G) {
                    return;
                }
                if ((cQf.z & 1) != 0) {
                    this.A |= 1;
                    this.B = cQf.A;
                    M();
                }
                if (!cQf.B.isEmpty()) {
                    if (this.C.isEmpty()) {
                        this.C = cQf.B;
                        this.A &= -3;
                    } else {
                        if ((this.A & 2) == 0) {
                            this.C = new ArrayList(this.C);
                            this.A |= 2;
                        }
                        this.C.addAll(cQf.B);
                    }
                    M();
                }
                if (cQf.V()) {
                    F1 f1T = cQf.T();
                    FA4<F1, F1.CQf, Object> fa4 = this.E;
                    if (fa4 == null) {
                        if ((this.A & 4) == 0 || (f1 = this.D) == null || f1 == (f2 = F1.F)) {
                            this.D = f1T;
                        } else {
                            F1.CQf cQfC = f2.c();
                            cQfC.X(f1);
                            cQfC.X(f1T);
                            this.D = cQfC.f();
                        }
                        M();
                    } else {
                        fa4.e(f1T);
                    }
                    this.A |= 4;
                }
                if (!cQf.D.isEmpty()) {
                    if (this.F.isEmpty()) {
                        this.F = cQf.D;
                        this.A &= -9;
                    } else {
                        if ((this.A & 8) == 0) {
                            this.F = new ArrayList(this.F);
                            this.A |= 8;
                        }
                        this.F.addAll(cQf.D);
                    }
                    M();
                }
                if (!cQf.E.isEmpty()) {
                    if (this.G.isEmpty()) {
                        this.G = cQf.E;
                        this.A &= -17;
                    } else {
                        if ((this.A & 16) == 0) {
                            this.G = new ct(this.G);
                            this.A |= 16;
                        }
                        this.G.addAll(cQf.E);
                    }
                    M();
                }
                super.B(cQf.y);
                M();
            }

            public final void S(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                F1 f1;
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 10) {
                                    this.B = nUl.h();
                                    this.A |= 1;
                                } else if (iZ == 18) {
                                    LPt8Fixed lPt8 = (LPt8Fixed) nUl.q(LPt8Fixed.F, vv0Var);
                                    if ((this.A & 2) == 0) {
                                        this.C = new ArrayList(this.C);
                                        this.A |= 2;
                                    }
                                    this.C.add(lPt8);
                                } else if (iZ == 26) {
                                    FA4<F1, F1.CQf, Object> fa4 = this.E;
                                    if (fa4 == null) {
                                        if (fa4 == null) {
                                            f1 = this.D;
                                            if (f1 == null) {
                                                f1 = F1.F;
                                            }
                                        } else {
                                            f1 = (F1) fa4.d();
                                        }
                                        this.E = new FA4<>(f1, H(), this.y);
                                        this.D = null;
                                    }
                                    nUl.r(this.E.c(), vv0Var);
                                    this.A |= 4;
                                } else if (iZ == 34) {
                                    F1 f2 = (F1) nUl.q(F1.E, vv0Var);
                                    if ((this.A & 8) == 0) {
                                        this.F = new ArrayList(this.F);
                                        this.A |= 8;
                                    }
                                    this.F.add(f2);
                                } else if (iZ == 42) {
                                    lk.YKK ykkH = nUl.h();
                                    if ((this.A & 16) == 0) {
                                        this.G = new ct(this.G);
                                        this.A |= 16;
                                    }
                                    this.G.o(ykkH);
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return CQf.G;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                CQf cQfF = f();
                if (cQfF.isInitialized()) {
                    return cQfF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(cQfF);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (C0090CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.o;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                F1 f1;
                for (int i = 0; i < this.C.size(); i++) {
                    if (!this.C.get(i).isInitialized()) {
                        return false;
                    }
                }
                if ((this.A & 4) != 0) {
                    FA4<F1, F1.CQf, Object> fa4 = this.E;
                    if (fa4 == null) {
                        f1 = this.D;
                        if (f1 == null) {
                            f1 = F1.F;
                        }
                    } else {
                        f1 = (F1) fa4.d();
                    }
                    if (!f1.isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (C0090CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof CQf) {
                    R((CQf) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof CQf) {
                    R((CQf) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return CQf.G;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                CQf cQfF = f();
                if (cQfF.isInitialized()) {
                    return cQfF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(cQfF);
            }

            public C0090CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.B = "";
                this.C = Collections.emptyList();
                this.F = Collections.emptyList();
                this.G = ct.y;
            }
        }

        public static final class F1 extends lPt3Fixed implements roZB {
            public static final F1 D = new F1();

            @Deprecated
            public static final QnHx E = new QnHx();
            public int A;
            public int B;
            public byte C;
            public int z;

            /* JADX INFO: renamed from: com.google.protobuf.EQ$CQf$F1$CQf, reason: collision with other inner class name */
            public static final class C0091CQf extends lPt3Fixed.CQf<C0091CQf> implements roZB {
                public int A;
                public int B;
                public int C;

                public C0091CQf() {
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                public final void B(k kVar) {
                    super.B(kVar);
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: E */
                public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                    super.g(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: F */
                public final lPt3Fixed.CQf clone() {
                    return (C0091CQf) super.clone();
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                public final lPt3Fixed.YKK I() {
                    lPt3Fixed.YKK ykk = EQ.r;
                    ykk.c(F1.class, C0091CQf.class);
                    return ykk;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: J */
                public final lPt3Fixed.CQf B(k kVar) {
                    super.B(kVar);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: O */
                public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                    super.b(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: P */
                public final lPt3Fixed.CQf y(k kVar) {
                    this.z = kVar;
                    M();
                    return this;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
                public final F1 f() {
                    int i;
                    F1 f1 = new F1(this);
                    int i2 = this.A;
                    if ((i2 & 1) != 0) {
                        f1.A = this.B;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i2 & 2) != 0) {
                        f1.B = this.C;
                        i |= 2;
                    }
                    f1.z = i;
                    L();
                    return f1;
                }

                public final void R(F1 f1) {
                    if (f1 == F1.D) {
                        return;
                    }
                    if ((f1.z & 1) != 0) {
                        int i = f1.A;
                        this.A |= 1;
                        this.B = i;
                        M();
                    }
                    if ((f1.z & 2) != 0) {
                        int i2 = f1.B;
                        this.A |= 2;
                        this.C = i2;
                        M();
                    }
                    super.B(f1.y);
                    M();
                }

                public final void S(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    vv0Var.getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int iZ = nUl.z();
                                if (iZ != 0) {
                                    if (iZ == 8) {
                                        this.B = nUl.o();
                                        this.A |= 1;
                                    } else if (iZ == 16) {
                                        this.C = nUl.o();
                                        this.A |= 2;
                                    } else if (!N(nUl, vv0Var, iZ)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.g();
                            }
                        } catch (Throwable th) {
                            M();
                            throw th;
                        }
                    }
                    M();
                }

                @Override // defpackage.jd2
                public final mw0t a() {
                    return F1.D;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                    super.b(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                public final mw0t build() {
                    F1 f1F = f();
                    if (f1F.isInitialized()) {
                        return f1F;
                    }
                    throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(f1F);
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                public final Object clone() {
                    return (C0091CQf) super.clone();
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
                public final Descriptors.QnHx e() {
                    return EQ.q;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                    super.g(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: r */
                public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                    return (C0091CQf) super.clone();
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx s(mw0t mw0tVar) {
                    if (mw0tVar instanceof F1) {
                        R((F1) mw0tVar);
                    } else {
                        super.s(mw0tVar);
                    }
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
                public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    S(nUl, vv0Var);
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: w */
                public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    S(nUl, vv0Var);
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: x */
                public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                    if (mw0tVar instanceof F1) {
                        R((F1) mw0tVar);
                    } else {
                        super.s(mw0tVar);
                    }
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx y(k kVar) {
                    this.z = kVar;
                    M();
                    return this;
                }

                public C0091CQf(lPt3Fixed.QnHx qnHx) {
                    super(qnHx);
                }

                @Override // defpackage.jd2
                public final DzVS a() {
                    return F1.D;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                public final DzVS build() {
                    F1 f1F = f();
                    if (f1F.isInitialized()) {
                        return f1F;
                    }
                    throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(f1F);
                }
            }

            public static class QnHx extends com.google.protobuf.F1<F1> {
                @Override // defpackage.oz2
                public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                    C0091CQf c0091CQfC = F1.D.c();
                    try {
                        c0091CQfC.S(nUl, vv0Var);
                        return c0091CQfC.f();
                    } catch (InvalidProtocolBufferException e) {
                        e.w = c0091CQfC.f();
                        throw e;
                    } catch (UninitializedMessageException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                        invalidProtocolBufferExceptionA.w = c0091CQfC.f();
                        throw invalidProtocolBufferExceptionA;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                        invalidProtocolBufferException.w = c0091CQfC.f();
                        throw invalidProtocolBufferException;
                    }
                }
            }

            public F1(lPt3Fixed.CQf cQf) {
                super(cQf);
                this.C = (byte) -1;
            }

            @Override // com.google.protobuf.lPt3Fixed
            public final lPt3Fixed.YKK L() {
                lPt3Fixed.YKK ykk = EQ.r;
                ykk.c(F1.class, C0091CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed
            public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
                return new C0091CQf(qnHx);
            }

            @Override // com.google.protobuf.DzVS
            /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
            public final C0091CQf c() {
                if (this == D) {
                    return new C0091CQf();
                }
                C0091CQf c0091CQf = new C0091CQf();
                c0091CQf.R(this);
                return c0091CQf;
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return D;
            }

            @Override // com.google.protobuf.QnHx
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof F1)) {
                    return super.equals(obj);
                }
                F1 f1 = (F1) obj;
                int i = this.z;
                boolean z = (i & 1) != 0;
                int i2 = f1.z;
                if (z != ((i2 & 1) != 0)) {
                    return false;
                }
                if (((i & 1) != 0) && this.A != f1.A) {
                    return false;
                }
                if (((i & 2) != 0) != ((i2 & 2) != 0)) {
                    return false;
                }
                return (!((i & 2) != 0) || this.B == f1.B) && this.y.equals(f1.y);
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
            public final void h(CodedOutputStream codedOutputStream) {
                if ((this.z & 1) != 0) {
                    codedOutputStream.E1(1, this.A);
                }
                if ((this.z & 2) != 0) {
                    codedOutputStream.E1(2, this.B);
                }
                this.y.h(codedOutputStream);
            }

            @Override // com.google.protobuf.QnHx
            public final int hashCode() {
                int i = this.w;
                if (i != 0) {
                    return i;
                }
                int iHashCode = EQ.q.hashCode() + 779;
                int i2 = this.z;
                if ((i2 & 1) != 0) {
                    iHashCode = Xs.a(iHashCode, 37, 1, 53) + this.A;
                }
                if ((i2 & 2) != 0) {
                    iHashCode = Xs.a(iHashCode, 37, 2, 53) + this.B;
                }
                int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
                this.w = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
            public final boolean isInitialized() {
                byte b = this.C;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.C = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
            public final int j() {
                int i = this.x;
                if (i != -1) {
                    return i;
                }
                int iE1 = (this.z & 1) != 0 ? 0 + CodedOutputStream.e1(1, this.A) : 0;
                if ((this.z & 2) != 0) {
                    iE1 += CodedOutputStream.e1(2, this.B);
                }
                int iJ = this.y.j() + iE1;
                this.x = iJ;
                return iJ;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
            public final k k() {
                return this.y;
            }

            @Override // com.google.protobuf.mw0t
            public final mw0t.QnHx n() {
                return D.c();
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
            public final oz2<F1> p() {
                return E;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return D;
            }

            public F1() {
                this.C = (byte) -1;
            }
        }

        public static class QnHx extends com.google.protobuf.F1<CQf> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                C0090CQf c0090CQfC = CQf.G.c();
                try {
                    c0090CQfC.S(nUl, vv0Var);
                    return c0090CQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = c0090CQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = c0090CQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = c0090CQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public CQf(lPt3Fixed.CQf cQf) {
            super(cQf);
            this.F = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.p;
            ykk.c(CQf.class, C0090CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new C0090CQf(qnHx);
        }

        public final String S() {
            Object obj = this.A;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.A = strS;
            }
            return strS;
        }

        public final F1 T() {
            F1 f1 = this.C;
            return f1 == null ? F1.F : f1;
        }

        public final int U() {
            return this.B.size();
        }

        public final boolean V() {
            return (this.z & 2) != 0;
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public final C0090CQf c() {
            if (this == G) {
                return new C0090CQf();
            }
            C0090CQf c0090CQf = new C0090CQf();
            c0090CQf.R(this);
            return c0090CQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return G;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CQf)) {
                return super.equals(obj);
            }
            CQf cQf = (CQf) obj;
            int i = this.z;
            if (((i & 1) != 0) != ((cQf.z & 1) != 0)) {
                return false;
            }
            if ((!((i & 1) != 0) || S().equals(cQf.S())) && this.B.equals(cQf.B) && V() == cQf.V()) {
                return (!V() || T().equals(cQf.T())) && this.D.equals(cQf.D) && this.E.equals(cQf.E) && this.y.equals(cQf.y);
            }
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            if ((this.z & 1) != 0) {
                lPt3Fixed.R(codedOutputStream, 1, this.A);
            }
            for (int i = 0; i < this.B.size(); i++) {
                codedOutputStream.G1(2, this.B.get(i));
            }
            if ((this.z & 2) != 0) {
                codedOutputStream.G1(3, T());
            }
            for (int i2 = 0; i2 < this.D.size(); i2++) {
                codedOutputStream.G1(4, this.D.get(i2));
            }
            for (int i3 = 0; i3 < this.E.size(); i3++) {
                lPt3Fixed.R(codedOutputStream, 5, this.E.w(i3));
            }
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.o.hashCode() + 779;
            if ((this.z & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 1, 53) + S().hashCode();
            }
            if (U() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 2, 53) + this.B.hashCode();
            }
            if (V()) {
                iHashCode = Xs.a(iHashCode, 37, 3, 53) + T().hashCode();
            }
            if (this.D.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 4, 53) + this.D.hashCode();
            }
            if (this.E.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 5, 53) + this.E.hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.F;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < U(); i++) {
                if (!this.B.get(i).isInitialized()) {
                    this.F = (byte) 0;
                    return false;
                }
            }
            if (!V() || T().isInitialized()) {
                this.F = (byte) 1;
                return true;
            }
            this.F = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iH = (this.z & 1) != 0 ? lPt3Fixed.H(1, this.A) + 0 : 0;
            for (int i2 = 0; i2 < this.B.size(); i2++) {
                iH += CodedOutputStream.i1(2, this.B.get(i2));
            }
            if ((this.z & 2) != 0) {
                iH += CodedOutputStream.i1(3, T());
            }
            for (int i3 = 0; i3 < this.D.size(); i3++) {
                iH += CodedOutputStream.i1(4, this.D.get(i3));
            }
            int I = 0;
            for (int i4 = 0; i4 < this.E.size(); i4++) {
                I += lPt3Fixed.I(this.E.w(i4));
            }
            int iJ = this.y.j() + (this.E.size() * 1) + iH + I;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return G.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<CQf> p() {
            return H;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return G;
        }

        public CQf() {
            this.F = (byte) -1;
            this.A = "";
            this.B = Collections.emptyList();
            this.D = Collections.emptyList();
            this.E = ct.y;
        }
    }

    /* JADX INFO: renamed from: com.google.protobuf.EQ$EQ, reason: collision with other inner class name */
    public static final class C0092EQ extends lPt3Fixed.NUlFixed<C0092EQ> {
        public static final C0092EQ X = new C0092EQ();

        @Deprecated
        public static final QnHx Y = new QnHx();
        public int A;
        public volatile Object B;
        public volatile Object C;
        public boolean D;
        public boolean E;
        public boolean F;
        public int G;
        public volatile Object H;
        public boolean I;
        public boolean J;
        public boolean K;
        public boolean L;
        public boolean M;
        public boolean N;
        public volatile Object O;
        public volatile Object P;
        public volatile Object Q;
        public volatile Object R;
        public volatile Object S;
        public volatile Object T;
        public volatile Object U;
        public List<LPt9Fixed> V;
        public byte W;

        /* JADX INFO: renamed from: com.google.protobuf.EQ$EQ$CQf */
        public static final class CQf extends lPt3Fixed.LPt8Fixed<C0092EQ, CQf> {
            public int B;
            public Object C;
            public Object D;
            public boolean E;
            public boolean F;
            public boolean G;
            public int H;
            public Object I;
            public boolean J;
            public boolean K;
            public boolean L;
            public boolean M;
            public boolean N;
            public boolean O;
            public Object P;
            public Object Q;
            public Object R;
            public Object S;
            public Object T;
            public Object U;
            public Object V;
            public List<LPt9Fixed> W;

            public CQf() {
                this.C = "";
                this.D = "";
                this.H = 1;
                this.I = "";
                this.O = true;
                this.P = "";
                this.Q = "";
                this.R = "";
                this.S = "";
                this.T = "";
                this.U = "";
                this.V = "";
                this.W = Collections.emptyList();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.z;
                ykk.c(C0092EQ.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
            public final C0092EQ f() {
                C0092EQ c0092eq = new C0092EQ(this);
                int i = this.B;
                int i2 = (i & 1) != 0 ? 1 : 0;
                c0092eq.B = this.C;
                if ((i & 2) != 0) {
                    i2 |= 2;
                }
                c0092eq.C = this.D;
                if ((i & 4) != 0) {
                    c0092eq.D = this.E;
                    i2 |= 4;
                }
                if ((i & 8) != 0) {
                    c0092eq.E = this.F;
                    i2 |= 8;
                }
                if ((i & 16) != 0) {
                    c0092eq.F = this.G;
                    i2 |= 16;
                }
                if ((i & 32) != 0) {
                    i2 |= 32;
                }
                c0092eq.G = this.H;
                if ((i & 64) != 0) {
                    i2 |= 64;
                }
                c0092eq.H = this.I;
                if ((i & 128) != 0) {
                    c0092eq.I = this.J;
                    i2 |= 128;
                }
                if ((i & 256) != 0) {
                    c0092eq.J = this.K;
                    i2 |= 256;
                }
                if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                    c0092eq.K = this.L;
                    i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                }
                if ((i & 1024) != 0) {
                    c0092eq.L = this.M;
                    i2 |= 1024;
                }
                if ((i & 2048) != 0) {
                    c0092eq.M = this.N;
                    i2 |= 2048;
                }
                if ((i & 4096) != 0) {
                    i2 |= 4096;
                }
                c0092eq.N = this.O;
                if ((i & 8192) != 0) {
                    i2 |= 8192;
                }
                c0092eq.O = this.P;
                if ((i & 16384) != 0) {
                    i2 |= 16384;
                }
                c0092eq.P = this.Q;
                if ((i & 32768) != 0) {
                    i2 |= 32768;
                }
                c0092eq.Q = this.R;
                if ((i & 65536) != 0) {
                    i2 |= 65536;
                }
                c0092eq.R = this.S;
                if ((i & 131072) != 0) {
                    i2 |= 131072;
                }
                c0092eq.S = this.T;
                if ((i & 262144) != 0) {
                    i2 |= 262144;
                }
                c0092eq.T = this.U;
                if ((i & 524288) != 0) {
                    i2 |= 524288;
                }
                c0092eq.U = this.V;
                if ((this.B & 1048576) != 0) {
                    this.W = Collections.unmodifiableList(this.W);
                    this.B &= -1048577;
                }
                c0092eq.V = this.W;
                c0092eq.A = i2;
                L();
                return c0092eq;
            }

            public final void X(C0092EQ c0092eq) {
                if (c0092eq == C0092EQ.X) {
                    return;
                }
                if ((c0092eq.A & 1) != 0) {
                    this.B |= 1;
                    this.C = c0092eq.B;
                    M();
                }
                if ((c0092eq.A & 2) != 0) {
                    this.B |= 2;
                    this.D = c0092eq.C;
                    M();
                }
                if ((c0092eq.A & 4) != 0) {
                    boolean z = c0092eq.D;
                    this.B |= 4;
                    this.E = z;
                    M();
                }
                if ((c0092eq.A & 8) != 0) {
                    boolean z2 = c0092eq.E;
                    this.B |= 8;
                    this.F = z2;
                    M();
                }
                if ((c0092eq.A & 16) != 0) {
                    boolean z3 = c0092eq.F;
                    this.B |= 16;
                    this.G = z3;
                    M();
                }
                if ((c0092eq.A & 32) != 0) {
                    F1 f1A = F1.a(c0092eq.G);
                    if (f1A == null) {
                        f1A = F1.SPEED;
                    }
                    this.B |= 32;
                    this.H = f1A.w;
                    M();
                }
                if ((c0092eq.A & 64) != 0) {
                    this.B |= 64;
                    this.I = c0092eq.H;
                    M();
                }
                if ((c0092eq.A & 128) != 0) {
                    boolean z4 = c0092eq.I;
                    this.B |= 128;
                    this.J = z4;
                    M();
                }
                if ((c0092eq.A & 256) != 0) {
                    boolean z5 = c0092eq.J;
                    this.B |= 256;
                    this.K = z5;
                    M();
                }
                if ((c0092eq.A & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                    boolean z6 = c0092eq.K;
                    this.B |= AdRequest.MAX_CONTENT_URL_LENGTH;
                    this.L = z6;
                    M();
                }
                if ((c0092eq.A & 1024) != 0) {
                    boolean z7 = c0092eq.L;
                    this.B |= 1024;
                    this.M = z7;
                    M();
                }
                if ((c0092eq.A & 2048) != 0) {
                    boolean z8 = c0092eq.M;
                    this.B |= 2048;
                    this.N = z8;
                    M();
                }
                if ((c0092eq.A & 4096) != 0) {
                    boolean z9 = c0092eq.N;
                    this.B |= 4096;
                    this.O = z9;
                    M();
                }
                if ((c0092eq.A & 8192) != 0) {
                    this.B |= 8192;
                    this.P = c0092eq.O;
                    M();
                }
                if ((c0092eq.A & 16384) != 0) {
                    this.B |= 16384;
                    this.Q = c0092eq.P;
                    M();
                }
                if (c0092eq.j0()) {
                    this.B |= 32768;
                    this.R = c0092eq.Q;
                    M();
                }
                if (c0092eq.f0()) {
                    this.B |= 65536;
                    this.S = c0092eq.R;
                    M();
                }
                if (c0092eq.h0()) {
                    this.B |= 131072;
                    this.T = c0092eq.S;
                    M();
                }
                if (c0092eq.g0()) {
                    this.B |= 262144;
                    this.U = c0092eq.T;
                    M();
                }
                if (c0092eq.i0()) {
                    this.B |= 524288;
                    this.V = c0092eq.U;
                    M();
                }
                if (!c0092eq.V.isEmpty()) {
                    if (this.W.isEmpty()) {
                        this.W = c0092eq.V;
                        this.B = (-1048577) & this.B;
                    } else {
                        if ((this.B & 1048576) == 0) {
                            this.W = new ArrayList(this.W);
                            this.B |= 1048576;
                        }
                        this.W.addAll(c0092eq.V);
                    }
                    M();
                }
                T(c0092eq);
                super.B(c0092eq.y);
                M();
            }

            public final void Y(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            switch (iZ) {
                                case 0:
                                    break;
                                case 10:
                                    this.C = nUl.h();
                                    this.B |= 1;
                                    continue;
                                case 66:
                                    this.D = nUl.h();
                                    this.B |= 2;
                                    continue;
                                case 72:
                                    int iJ = nUl.j();
                                    if (F1.a(iJ) == null) {
                                        K(9, iJ);
                                    } else {
                                        this.H = iJ;
                                        this.B |= 32;
                                        continue;
                                    }
                                    break;
                                case 80:
                                    this.E = nUl.g();
                                    this.B |= 4;
                                    continue;
                                case 90:
                                    this.I = nUl.h();
                                    this.B |= 64;
                                    continue;
                                case 128:
                                    this.J = nUl.g();
                                    this.B |= 128;
                                    continue;
                                case 136:
                                    this.K = nUl.g();
                                    this.B |= 256;
                                    continue;
                                case 144:
                                    this.L = nUl.g();
                                    this.B |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    continue;
                                case 160:
                                    this.F = nUl.g();
                                    this.B |= 8;
                                    continue;
                                case 184:
                                    this.N = nUl.g();
                                    this.B |= 2048;
                                    continue;
                                case 216:
                                    this.G = nUl.g();
                                    this.B |= 16;
                                    continue;
                                case 248:
                                    this.O = nUl.g();
                                    this.B |= 4096;
                                    continue;
                                case 290:
                                    this.P = nUl.h();
                                    this.B |= 8192;
                                    continue;
                                case 298:
                                    this.Q = nUl.h();
                                    this.B |= 16384;
                                    continue;
                                case 314:
                                    this.R = nUl.h();
                                    this.B |= 32768;
                                    continue;
                                case 322:
                                    this.S = nUl.h();
                                    this.B |= 65536;
                                    continue;
                                case 330:
                                    this.T = nUl.h();
                                    this.B |= 131072;
                                    continue;
                                case 336:
                                    this.M = nUl.g();
                                    this.B |= 1024;
                                    continue;
                                case 354:
                                    this.U = nUl.h();
                                    this.B |= 262144;
                                    continue;
                                case 362:
                                    this.V = nUl.h();
                                    this.B |= 524288;
                                    continue;
                                case 7994:
                                    LPt9Fixed lPt9 = (LPt9Fixed) nUl.q(LPt9Fixed.J, vv0Var);
                                    if ((this.B & 1048576) == 0) {
                                        this.W = new ArrayList(this.W);
                                        this.B |= 1048576;
                                    }
                                    this.W.add(lPt9);
                                    continue;
                                default:
                                    if (!N(nUl, vv0Var, iZ)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return C0092EQ.X;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                C0092EQ c0092eqF = f();
                if (c0092eqF.isInitialized()) {
                    return c0092eqF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(c0092eqF);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.y;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                for (int i = 0; i < this.W.size(); i++) {
                    if (!this.W.get(i).isInitialized()) {
                        return false;
                    }
                }
                return S();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof C0092EQ) {
                    X((C0092EQ) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof C0092EQ) {
                    X((C0092EQ) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return C0092EQ.X;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                C0092EQ c0092eqF = f();
                if (c0092eqF.isInitialized()) {
                    return c0092eqF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(c0092eqF);
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.C = "";
                this.D = "";
                this.H = 1;
                this.I = "";
                this.O = true;
                this.P = "";
                this.Q = "";
                this.R = "";
                this.S = "";
                this.T = "";
                this.U = "";
                this.V = "";
                this.W = Collections.emptyList();
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.EQ$EQ$F1 */
        public enum F1 implements SjP.QnHx {
            SPEED(1),
            CODE_SIZE(2),
            LITE_RUNTIME(3);

            public final int w;

            static {
                values();
            }

            F1(int i) {
                this.w = i;
            }

            public static F1 a(int i) {
                if (i == 1) {
                    return SPEED;
                }
                if (i == 2) {
                    return CODE_SIZE;
                }
                if (i != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }

            @Override // com.google.protobuf.SjP.QnHx
            public final int b() {
                return this.w;
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.EQ$EQ$QnHx */
        public static class QnHx extends com.google.protobuf.F1<C0092EQ> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = C0092EQ.X.c();
                try {
                    cQfC.Y(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public C0092EQ(lPt3Fixed.LPt8Fixed lPt8) {
            super(lPt8);
            this.W = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.z;
            ykk.c(C0092EQ.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        public final String V() {
            Object obj = this.P;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.P = strS;
            }
            return strS;
        }

        public final String W() {
            Object obj = this.H;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.H = strS;
            }
            return strS;
        }

        public final String X() {
            Object obj = this.C;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.C = strS;
            }
            return strS;
        }

        public final String Y() {
            Object obj = this.B;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.B = strS;
            }
            return strS;
        }

        public final String Z() {
            Object obj = this.O;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.O = strS;
            }
            return strS;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return X;
        }

        public final String a0() {
            Object obj = this.R;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.R = strS;
            }
            return strS;
        }

        public final String b0() {
            Object obj = this.T;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.T = strS;
            }
            return strS;
        }

        public final String c0() {
            Object obj = this.S;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.S = strS;
            }
            return strS;
        }

        public final String d0() {
            Object obj = this.U;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.U = strS;
            }
            return strS;
        }

        public final String e0() {
            Object obj = this.Q;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.Q = strS;
            }
            return strS;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0092EQ)) {
                return super.equals(obj);
            }
            C0092EQ c0092eq = (C0092EQ) obj;
            int i = this.A;
            if (((i & 1) != 0) != ((c0092eq.A & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && !Y().equals(c0092eq.Y())) {
                return false;
            }
            int i2 = this.A;
            if (((i2 & 2) != 0) != ((c0092eq.A & 2) != 0)) {
                return false;
            }
            if (((i2 & 2) != 0) && !X().equals(c0092eq.X())) {
                return false;
            }
            int i3 = this.A;
            boolean z = (i3 & 4) != 0;
            int i4 = c0092eq.A;
            if (z != ((i4 & 4) != 0)) {
                return false;
            }
            if (((i3 & 4) != 0) && this.D != c0092eq.D) {
                return false;
            }
            if (((i3 & 8) != 0) != ((i4 & 8) != 0)) {
                return false;
            }
            if (((i3 & 8) != 0) && this.E != c0092eq.E) {
                return false;
            }
            if (((i3 & 16) != 0) != ((i4 & 16) != 0)) {
                return false;
            }
            if (((i3 & 16) != 0) && this.F != c0092eq.F) {
                return false;
            }
            if (((i3 & 32) != 0) != ((i4 & 32) != 0)) {
                return false;
            }
            if (((i3 & 32) != 0) && this.G != c0092eq.G) {
                return false;
            }
            if (((i3 & 64) != 0) != ((i4 & 64) != 0)) {
                return false;
            }
            if (((i3 & 64) != 0) && !W().equals(c0092eq.W())) {
                return false;
            }
            int i5 = this.A;
            boolean z2 = (i5 & 128) != 0;
            int i6 = c0092eq.A;
            if (z2 != ((i6 & 128) != 0)) {
                return false;
            }
            if (((i5 & 128) != 0) && this.I != c0092eq.I) {
                return false;
            }
            if (((i5 & 256) != 0) != ((i6 & 256) != 0)) {
                return false;
            }
            if (((i5 & 256) != 0) && this.J != c0092eq.J) {
                return false;
            }
            if (((i5 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) != ((i6 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0)) {
                return false;
            }
            if (((i5 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) && this.K != c0092eq.K) {
                return false;
            }
            if (((i5 & 1024) != 0) != ((i6 & 1024) != 0)) {
                return false;
            }
            if (((i5 & 1024) != 0) && this.L != c0092eq.L) {
                return false;
            }
            if (((i5 & 2048) != 0) != ((i6 & 2048) != 0)) {
                return false;
            }
            if (((i5 & 2048) != 0) && this.M != c0092eq.M) {
                return false;
            }
            if (((i5 & 4096) != 0) != ((i6 & 4096) != 0)) {
                return false;
            }
            if (((i5 & 4096) != 0) && this.N != c0092eq.N) {
                return false;
            }
            if (((i5 & 8192) != 0) != ((i6 & 8192) != 0)) {
                return false;
            }
            if (((i5 & 8192) != 0) && !Z().equals(c0092eq.Z())) {
                return false;
            }
            int i7 = this.A;
            if (((i7 & 16384) != 0) != ((c0092eq.A & 16384) != 0)) {
                return false;
            }
            if ((((i7 & 16384) != 0) && !V().equals(c0092eq.V())) || j0() != c0092eq.j0()) {
                return false;
            }
            if ((j0() && !e0().equals(c0092eq.e0())) || f0() != c0092eq.f0()) {
                return false;
            }
            if ((f0() && !a0().equals(c0092eq.a0())) || h0() != c0092eq.h0()) {
                return false;
            }
            if ((h0() && !c0().equals(c0092eq.c0())) || g0() != c0092eq.g0()) {
                return false;
            }
            if ((!g0() || b0().equals(c0092eq.b0())) && i0() == c0092eq.i0()) {
                return (!i0() || d0().equals(c0092eq.d0())) && this.V.equals(c0092eq.V) && this.y.equals(c0092eq.y) && U().equals(c0092eq.U());
            }
            return false;
        }

        public final boolean f0() {
            return (this.A & 65536) != 0;
        }

        public final boolean g0() {
            return (this.A & 262144) != 0;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            lPt3Fixed.NUlFixed.QnHx qnHx = new lPt3Fixed.NUlFixed.QnHx(this);
            if ((this.A & 1) != 0) {
                lPt3Fixed.R(codedOutputStream, 1, this.B);
            }
            if ((this.A & 2) != 0) {
                lPt3Fixed.R(codedOutputStream, 8, this.C);
            }
            if ((this.A & 32) != 0) {
                codedOutputStream.E1(9, this.G);
            }
            if ((this.A & 4) != 0) {
                codedOutputStream.w1(10, this.D);
            }
            if ((this.A & 64) != 0) {
                lPt3Fixed.R(codedOutputStream, 11, this.H);
            }
            if ((this.A & 128) != 0) {
                codedOutputStream.w1(16, this.I);
            }
            if ((this.A & 256) != 0) {
                codedOutputStream.w1(17, this.J);
            }
            if ((this.A & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                codedOutputStream.w1(18, this.K);
            }
            if ((this.A & 8) != 0) {
                codedOutputStream.w1(20, this.E);
            }
            if ((this.A & 2048) != 0) {
                codedOutputStream.w1(23, this.M);
            }
            if ((this.A & 16) != 0) {
                codedOutputStream.w1(27, this.F);
            }
            if ((this.A & 4096) != 0) {
                codedOutputStream.w1(31, this.N);
            }
            if ((this.A & 8192) != 0) {
                lPt3Fixed.R(codedOutputStream, 36, this.O);
            }
            if ((this.A & 16384) != 0) {
                lPt3Fixed.R(codedOutputStream, 37, this.P);
            }
            if ((this.A & 32768) != 0) {
                lPt3Fixed.R(codedOutputStream, 39, this.Q);
            }
            if ((this.A & 65536) != 0) {
                lPt3Fixed.R(codedOutputStream, 40, this.R);
            }
            if ((this.A & 131072) != 0) {
                lPt3Fixed.R(codedOutputStream, 41, this.S);
            }
            if ((this.A & 1024) != 0) {
                codedOutputStream.w1(42, this.L);
            }
            if ((this.A & 262144) != 0) {
                lPt3Fixed.R(codedOutputStream, 44, this.T);
            }
            if ((this.A & 524288) != 0) {
                lPt3Fixed.R(codedOutputStream, 45, this.U);
            }
            for (int i = 0; i < this.V.size(); i++) {
                codedOutputStream.G1(999, this.V.get(i));
            }
            qnHx.a(codedOutputStream);
            this.y.h(codedOutputStream);
        }

        public final boolean h0() {
            return (this.A & 131072) != 0;
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.y.hashCode() + 779;
            if ((this.A & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 1, 53) + Y().hashCode();
            }
            if ((this.A & 2) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 8, 53) + X().hashCode();
            }
            if ((this.A & 4) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 10, 53) + SjP.a(this.D);
            }
            if ((this.A & 8) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 20, 53) + SjP.a(this.E);
            }
            if ((this.A & 16) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 27, 53) + SjP.a(this.F);
            }
            int i2 = this.A;
            if ((i2 & 32) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 9, 53) + this.G;
            }
            if ((i2 & 64) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 11, 53) + W().hashCode();
            }
            if ((this.A & 128) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 16, 53) + SjP.a(this.I);
            }
            if ((this.A & 256) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 17, 53) + SjP.a(this.J);
            }
            if ((this.A & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 18, 53) + SjP.a(this.K);
            }
            if ((this.A & 1024) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 42, 53) + SjP.a(this.L);
            }
            if ((this.A & 2048) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 23, 53) + SjP.a(this.M);
            }
            if ((this.A & 4096) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 31, 53) + SjP.a(this.N);
            }
            if ((this.A & 8192) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 36, 53) + Z().hashCode();
            }
            if ((this.A & 16384) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 37, 53) + V().hashCode();
            }
            if (j0()) {
                iHashCode = Xs.a(iHashCode, 37, 39, 53) + e0().hashCode();
            }
            if (f0()) {
                iHashCode = Xs.a(iHashCode, 37, 40, 53) + a0().hashCode();
            }
            if (h0()) {
                iHashCode = Xs.a(iHashCode, 37, 41, 53) + c0().hashCode();
            }
            if (g0()) {
                iHashCode = Xs.a(iHashCode, 37, 44, 53) + b0().hashCode();
            }
            if (i0()) {
                iHashCode = Xs.a(iHashCode, 37, 45, 53) + d0().hashCode();
            }
            if (this.V.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 999, 53) + this.V.hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (com.google.protobuf.QnHx.D(iHashCode, U()) * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        public final boolean i0() {
            return (this.A & 524288) != 0;
        }

        @Override // com.google.protobuf.lPt3Fixed.NUlFixed, com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.W;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.V.size(); i++) {
                if (!this.V.get(i).isInitialized()) {
                    this.W = (byte) 0;
                    return false;
                }
            }
            if (S()) {
                this.W = (byte) 1;
                return true;
            }
            this.W = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iH = (this.A & 1) != 0 ? lPt3Fixed.H(1, this.B) + 0 : 0;
            if ((this.A & 2) != 0) {
                iH += lPt3Fixed.H(8, this.C);
            }
            if ((this.A & 32) != 0) {
                iH += CodedOutputStream.Z0(9, this.G);
            }
            if ((this.A & 4) != 0) {
                iH += CodedOutputStream.V0(10);
            }
            if ((this.A & 64) != 0) {
                iH += lPt3Fixed.H(11, this.H);
            }
            if ((this.A & 128) != 0) {
                iH += CodedOutputStream.V0(16);
            }
            if ((this.A & 256) != 0) {
                iH += CodedOutputStream.V0(17);
            }
            if ((this.A & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                iH += CodedOutputStream.V0(18);
            }
            if ((this.A & 8) != 0) {
                iH += CodedOutputStream.V0(20);
            }
            if ((this.A & 2048) != 0) {
                iH += CodedOutputStream.V0(23);
            }
            if ((this.A & 16) != 0) {
                iH += CodedOutputStream.V0(27);
            }
            if ((this.A & 4096) != 0) {
                iH += CodedOutputStream.V0(31);
            }
            if ((this.A & 8192) != 0) {
                iH += lPt3Fixed.H(36, this.O);
            }
            if ((this.A & 16384) != 0) {
                iH += lPt3Fixed.H(37, this.P);
            }
            if ((this.A & 32768) != 0) {
                iH += lPt3Fixed.H(39, this.Q);
            }
            if ((this.A & 65536) != 0) {
                iH += lPt3Fixed.H(40, this.R);
            }
            if ((this.A & 131072) != 0) {
                iH += lPt3Fixed.H(41, this.S);
            }
            if ((this.A & 1024) != 0) {
                iH += CodedOutputStream.V0(42);
            }
            if ((this.A & 262144) != 0) {
                iH += lPt3Fixed.H(44, this.T);
            }
            if ((this.A & 524288) != 0) {
                iH += lPt3Fixed.H(45, this.U);
            }
            for (int i2 = 0; i2 < this.V.size(); i2++) {
                iH += CodedOutputStream.i1(999, this.V.get(i2));
            }
            int iJ = this.y.j() + T() + iH;
            this.x = iJ;
            return iJ;
        }

        public final boolean j0() {
            return (this.A & 32768) != 0;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == X) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.X(this);
            return cQf;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return X.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<C0092EQ> p() {
            return Y;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return X;
        }

        public C0092EQ() {
            this.W = (byte) -1;
            this.B = "";
            this.C = "";
            this.G = 1;
            this.H = "";
            this.N = true;
            this.O = "";
            this.P = "";
            this.Q = "";
            this.R = "";
            this.S = "";
            this.T = "";
            this.U = "";
            this.V = Collections.emptyList();
        }
    }

    public static final class F1 extends lPt3Fixed.NUlFixed<F1> {
        public static final F1 F = new F1();

        @Deprecated
        public static final QnHx G = new QnHx();
        public int A;
        public boolean B;
        public boolean C;
        public List<LPt9Fixed> D;
        public byte E;

        public static final class CQf extends lPt3Fixed.LPt8Fixed<F1, CQf> {
            public int B;
            public boolean C;
            public boolean D;
            public List<LPt9Fixed> E;

            public CQf() {
                this.E = Collections.emptyList();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.H;
                ykk.c(F1.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
            public final F1 f() {
                int i;
                F1 f1 = new F1(this);
                int i2 = this.B;
                if ((i2 & 1) != 0) {
                    f1.B = this.C;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    f1.C = this.D;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    this.E = Collections.unmodifiableList(this.E);
                    this.B &= -5;
                }
                f1.D = this.E;
                f1.A = i;
                L();
                return f1;
            }

            public final void X(F1 f1) {
                if (f1 == F1.F) {
                    return;
                }
                if ((f1.A & 1) != 0) {
                    boolean z = f1.B;
                    this.B |= 1;
                    this.C = z;
                    M();
                }
                if ((f1.A & 2) != 0) {
                    boolean z2 = f1.C;
                    this.B |= 2;
                    this.D = z2;
                    M();
                }
                if (!f1.D.isEmpty()) {
                    if (this.E.isEmpty()) {
                        this.E = f1.D;
                        this.B &= -5;
                    } else {
                        if ((this.B & 4) == 0) {
                            this.E = new ArrayList(this.E);
                            this.B |= 4;
                        }
                        this.E.addAll(f1.D);
                    }
                    M();
                }
                T(f1);
                super.B(f1.y);
                M();
            }

            public final void Y(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 16) {
                                    this.C = nUl.g();
                                    this.B |= 1;
                                } else if (iZ == 24) {
                                    this.D = nUl.g();
                                    this.B |= 2;
                                } else if (iZ == 7994) {
                                    LPt9Fixed lPt9 = (LPt9Fixed) nUl.q(LPt9Fixed.J, vv0Var);
                                    if ((this.B & 4) == 0) {
                                        this.E = new ArrayList(this.E);
                                        this.B |= 4;
                                    }
                                    this.E.add(lPt9);
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return F1.F;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                F1 f1F = f();
                if (f1F.isInitialized()) {
                    return f1F;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(f1F);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.G;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                for (int i = 0; i < this.E.size(); i++) {
                    if (!this.E.get(i).isInitialized()) {
                        return false;
                    }
                }
                return S();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof F1) {
                    X((F1) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof F1) {
                    X((F1) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return F1.F;
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.E = Collections.emptyList();
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                F1 f1F = f();
                if (f1F.isInitialized()) {
                    return f1F;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(f1F);
            }
        }

        public static class QnHx extends com.google.protobuf.F1<F1> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = F1.F.c();
                try {
                    cQfC.Y(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public F1(lPt3Fixed.LPt8Fixed lPt8) {
            super(lPt8);
            this.E = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.H;
            ykk.c(F1.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == F) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.X(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return F;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof F1)) {
                return super.equals(obj);
            }
            F1 f1 = (F1) obj;
            int i = this.A;
            boolean z = (i & 1) != 0;
            int i2 = f1.A;
            if (z != ((i2 & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && this.B != f1.B) {
                return false;
            }
            if (((i & 2) != 0) != ((i2 & 2) != 0)) {
                return false;
            }
            return (!((i & 2) != 0) || this.C == f1.C) && this.D.equals(f1.D) && this.y.equals(f1.y) && U().equals(f1.U());
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            lPt3Fixed.NUlFixed.QnHx qnHx = new lPt3Fixed.NUlFixed.QnHx(this);
            if ((this.A & 1) != 0) {
                codedOutputStream.w1(2, this.B);
            }
            if ((this.A & 2) != 0) {
                codedOutputStream.w1(3, this.C);
            }
            for (int i = 0; i < this.D.size(); i++) {
                codedOutputStream.G1(999, this.D.get(i));
            }
            qnHx.a(codedOutputStream);
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.G.hashCode() + 779;
            if ((this.A & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 2, 53) + SjP.a(this.B);
            }
            if ((this.A & 2) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 3, 53) + SjP.a(this.C);
            }
            if (this.D.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 999, 53) + this.D.hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (com.google.protobuf.QnHx.D(iHashCode, U()) * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed.NUlFixed, com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.E;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.D.size(); i++) {
                if (!this.D.get(i).isInitialized()) {
                    this.E = (byte) 0;
                    return false;
                }
            }
            if (S()) {
                this.E = (byte) 1;
                return true;
            }
            this.E = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iV0 = (this.A & 1) != 0 ? CodedOutputStream.V0(2) + 0 : 0;
            if ((2 & this.A) != 0) {
                iV0 += CodedOutputStream.V0(3);
            }
            for (int i2 = 0; i2 < this.D.size(); i2++) {
                iV0 += CodedOutputStream.i1(999, this.D.get(i2));
            }
            int iJ = this.y.j() + T() + iV0;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return F.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<F1> p() {
            return G;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return F;
        }

        public F1() {
            this.E = (byte) -1;
            this.D = Collections.emptyList();
        }
    }

    public static final class FJCM extends lPt3Fixed.NUlFixed<FJCM> {
        public static final FJCM H = new FJCM();

        @Deprecated
        public static final QnHx I = new QnHx();
        public int A;
        public boolean B;
        public boolean C;
        public boolean D;
        public boolean E;
        public List<LPt9Fixed> F;
        public byte G;

        public static final class CQf extends lPt3Fixed.LPt8Fixed<FJCM, CQf> {
            public int B;
            public boolean C;
            public boolean D;
            public boolean E;
            public boolean F;
            public List<LPt9Fixed> G;

            public CQf() {
                this.G = Collections.emptyList();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.B;
                ykk.c(FJCM.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
            public final FJCM f() {
                int i;
                FJCM fjcm = new FJCM(this);
                int i2 = this.B;
                if ((i2 & 1) != 0) {
                    fjcm.B = this.C;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    fjcm.C = this.D;
                    i |= 2;
                }
                if ((i2 & 4) != 0) {
                    fjcm.D = this.E;
                    i |= 4;
                }
                if ((i2 & 8) != 0) {
                    fjcm.E = this.F;
                    i |= 8;
                }
                if ((i2 & 16) != 0) {
                    this.G = Collections.unmodifiableList(this.G);
                    this.B &= -17;
                }
                fjcm.F = this.G;
                fjcm.A = i;
                L();
                return fjcm;
            }

            public final void X(FJCM fjcm) {
                if (fjcm == FJCM.H) {
                    return;
                }
                if ((fjcm.A & 1) != 0) {
                    boolean z = fjcm.B;
                    this.B |= 1;
                    this.C = z;
                    M();
                }
                if ((fjcm.A & 2) != 0) {
                    boolean z2 = fjcm.C;
                    this.B |= 2;
                    this.D = z2;
                    M();
                }
                if ((fjcm.A & 4) != 0) {
                    boolean z3 = fjcm.D;
                    this.B |= 4;
                    this.E = z3;
                    M();
                }
                if ((fjcm.A & 8) != 0) {
                    boolean z4 = fjcm.E;
                    this.B |= 8;
                    this.F = z4;
                    M();
                }
                if (!fjcm.F.isEmpty()) {
                    if (this.G.isEmpty()) {
                        this.G = fjcm.F;
                        this.B &= -17;
                    } else {
                        if ((this.B & 16) == 0) {
                            this.G = new ArrayList(this.G);
                            this.B |= 16;
                        }
                        this.G.addAll(fjcm.F);
                    }
                    M();
                }
                T(fjcm);
                super.B(fjcm.y);
                M();
            }

            public final void Y(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 8) {
                                    this.C = nUl.g();
                                    this.B |= 1;
                                } else if (iZ == 16) {
                                    this.D = nUl.g();
                                    this.B |= 2;
                                } else if (iZ == 24) {
                                    this.E = nUl.g();
                                    this.B |= 4;
                                } else if (iZ == 56) {
                                    this.F = nUl.g();
                                    this.B |= 8;
                                } else if (iZ == 7994) {
                                    LPt9Fixed lPt9 = (LPt9Fixed) nUl.q(LPt9Fixed.J, vv0Var);
                                    if ((this.B & 16) == 0) {
                                        this.G = new ArrayList(this.G);
                                        this.B |= 16;
                                    }
                                    this.G.add(lPt9);
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return FJCM.H;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                FJCM fjcmF = f();
                if (fjcmF.isInitialized()) {
                    return fjcmF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(fjcmF);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.A;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                for (int i = 0; i < this.G.size(); i++) {
                    if (!this.G.get(i).isInitialized()) {
                        return false;
                    }
                }
                return S();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof FJCM) {
                    X((FJCM) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof FJCM) {
                    X((FJCM) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return FJCM.H;
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.G = Collections.emptyList();
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                FJCM fjcmF = f();
                if (fjcmF.isInitialized()) {
                    return fjcmF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(fjcmF);
            }
        }

        public static class QnHx extends com.google.protobuf.F1<FJCM> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = FJCM.H.c();
                try {
                    cQfC.Y(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public FJCM(lPt3Fixed.LPt8Fixed lPt8) {
            super(lPt8);
            this.G = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.B;
            ykk.c(FJCM.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == H) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.X(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return H;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FJCM)) {
                return super.equals(obj);
            }
            FJCM fjcm = (FJCM) obj;
            int i = this.A;
            boolean z = (i & 1) != 0;
            int i2 = fjcm.A;
            if (z != ((i2 & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && this.B != fjcm.B) {
                return false;
            }
            if (((i & 2) != 0) != ((i2 & 2) != 0)) {
                return false;
            }
            if (((i & 2) != 0) && this.C != fjcm.C) {
                return false;
            }
            if (((i & 4) != 0) != ((i2 & 4) != 0)) {
                return false;
            }
            if (((i & 4) != 0) && this.D != fjcm.D) {
                return false;
            }
            if (((i & 8) != 0) != ((i2 & 8) != 0)) {
                return false;
            }
            return (!((i & 8) != 0) || this.E == fjcm.E) && this.F.equals(fjcm.F) && this.y.equals(fjcm.y) && U().equals(fjcm.U());
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            lPt3Fixed.NUlFixed.QnHx qnHx = new lPt3Fixed.NUlFixed.QnHx(this);
            if ((this.A & 1) != 0) {
                codedOutputStream.w1(1, this.B);
            }
            if ((this.A & 2) != 0) {
                codedOutputStream.w1(2, this.C);
            }
            if ((this.A & 4) != 0) {
                codedOutputStream.w1(3, this.D);
            }
            if ((this.A & 8) != 0) {
                codedOutputStream.w1(7, this.E);
            }
            for (int i = 0; i < this.F.size(); i++) {
                codedOutputStream.G1(999, this.F.get(i));
            }
            qnHx.a(codedOutputStream);
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.A.hashCode() + 779;
            if ((this.A & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 1, 53) + SjP.a(this.B);
            }
            if ((this.A & 2) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 2, 53) + SjP.a(this.C);
            }
            if ((this.A & 4) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 3, 53) + SjP.a(this.D);
            }
            if ((this.A & 8) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 7, 53) + SjP.a(this.E);
            }
            if (this.F.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 999, 53) + this.F.hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (com.google.protobuf.QnHx.D(iHashCode, U()) * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed.NUlFixed, com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.G;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.F.size(); i++) {
                if (!this.F.get(i).isInitialized()) {
                    this.G = (byte) 0;
                    return false;
                }
            }
            if (S()) {
                this.G = (byte) 1;
                return true;
            }
            this.G = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iV0 = (this.A & 1) != 0 ? CodedOutputStream.V0(1) + 0 : 0;
            if ((this.A & 2) != 0) {
                iV0 += CodedOutputStream.V0(2);
            }
            if ((this.A & 4) != 0) {
                iV0 += CodedOutputStream.V0(3);
            }
            if ((this.A & 8) != 0) {
                iV0 += CodedOutputStream.V0(7);
            }
            for (int i2 = 0; i2 < this.F.size(); i2++) {
                iV0 += CodedOutputStream.i1(999, this.F.get(i2));
            }
            int iJ = this.y.j() + T() + iV0;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return H.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<FJCM> p() {
            return I;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return H;
        }

        public FJCM() {
            this.G = (byte) -1;
            this.F = Collections.emptyList();
        }
    }

    public static final class LPt6Fixed extends lPt3Fixed implements roZB {
        public static final LPt6Fixed E = new LPt6Fixed();

        @Deprecated
        public static final QnHx F = new QnHx();
        public volatile Object A;
        public List<PRnFixed> B;
        public Xn1 C;
        public byte D;
        public int z;

        public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
            public int A;
            public Object B;
            public List<PRnFixed> C;
            public Xn1 D;
            public FA4<Xn1, Xn1.CQf, Object> E;

            public CQf() {
                this.B = "";
                this.C = Collections.emptyList();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.v;
                ykk.c(LPt6Fixed.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final LPt6Fixed f() {
                LPt6Fixed lPt6 = new LPt6Fixed(this);
                int i = this.A;
                int i2 = (i & 1) != 0 ? 1 : 0;
                lPt6.A = this.B;
                if ((this.A & 2) != 0) {
                    this.C = Collections.unmodifiableList(this.C);
                    this.A &= -3;
                }
                lPt6.B = this.C;
                if ((i & 4) != 0) {
                    FA4<Xn1, Xn1.CQf, Object> fa4 = this.E;
                    if (fa4 == null) {
                        lPt6.C = this.D;
                    } else {
                        lPt6.C = (Xn1) fa4.b();
                    }
                    i2 |= 2;
                }
                lPt6.z = i2;
                L();
                return lPt6;
            }

            public final void R(LPt6Fixed lPt6) {
                Xn1 xn1;
                Xn1 xn2;
                if (lPt6 == LPt6Fixed.E) {
                    return;
                }
                if ((lPt6.z & 1) != 0) {
                    this.A |= 1;
                    this.B = lPt6.A;
                    M();
                }
                if (!lPt6.B.isEmpty()) {
                    if (this.C.isEmpty()) {
                        this.C = lPt6.B;
                        this.A &= -3;
                    } else {
                        if ((this.A & 2) == 0) {
                            this.C = new ArrayList(this.C);
                            this.A |= 2;
                        }
                        this.C.addAll(lPt6.B);
                    }
                    M();
                }
                if (lPt6.U()) {
                    Xn1 xn1T = lPt6.T();
                    FA4<Xn1, Xn1.CQf, Object> fa4 = this.E;
                    if (fa4 == null) {
                        if ((this.A & 4) == 0 || (xn1 = this.D) == null || xn1 == (xn2 = Xn1.E)) {
                            this.D = xn1T;
                        } else {
                            Xn1.CQf cQfC = xn2.c();
                            cQfC.X(xn1);
                            cQfC.X(xn1T);
                            this.D = cQfC.f();
                        }
                        M();
                    } else {
                        fa4.e(xn1T);
                    }
                    this.A |= 4;
                }
                super.B(lPt6.y);
                M();
            }

            public final void S(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Xn1 xn1;
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 10) {
                                    this.B = nUl.h();
                                    this.A |= 1;
                                } else if (iZ == 18) {
                                    PRnFixed pRn = (PRnFixed) nUl.q(PRnFixed.I, vv0Var);
                                    if ((this.A & 2) == 0) {
                                        this.C = new ArrayList(this.C);
                                        this.A |= 2;
                                    }
                                    this.C.add(pRn);
                                } else if (iZ == 26) {
                                    FA4<Xn1, Xn1.CQf, Object> fa4 = this.E;
                                    if (fa4 == null) {
                                        if (fa4 == null) {
                                            xn1 = this.D;
                                            if (xn1 == null) {
                                                xn1 = Xn1.E;
                                            }
                                        } else {
                                            xn1 = (Xn1) fa4.d();
                                        }
                                        this.E = new FA4<>(xn1, H(), this.y);
                                        this.D = null;
                                    }
                                    nUl.r(this.E.c(), vv0Var);
                                    this.A |= 4;
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return LPt6Fixed.E;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                LPt6Fixed lPt6F = f();
                if (lPt6F.isInitialized()) {
                    return lPt6F;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(lPt6F);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.u;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                Xn1 xn1;
                for (int i = 0; i < this.C.size(); i++) {
                    if (!this.C.get(i).isInitialized()) {
                        return false;
                    }
                }
                if ((this.A & 4) != 0) {
                    FA4<Xn1, Xn1.CQf, Object> fa4 = this.E;
                    if (fa4 == null) {
                        xn1 = this.D;
                        if (xn1 == null) {
                            xn1 = Xn1.E;
                        }
                    } else {
                        xn1 = (Xn1) fa4.d();
                    }
                    if (!xn1.isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof LPt6Fixed) {
                    R((LPt6Fixed) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof LPt6Fixed) {
                    R((LPt6Fixed) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return LPt6Fixed.E;
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.B = "";
                this.C = Collections.emptyList();
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                LPt6Fixed lPt6F = f();
                if (lPt6F.isInitialized()) {
                    return lPt6F;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(lPt6F);
            }
        }

        public static class QnHx extends com.google.protobuf.F1<LPt6Fixed> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = LPt6Fixed.E.c();
                try {
                    cQfC.S(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public LPt6Fixed(lPt3Fixed.CQf cQf) {
            super(cQf);
            this.D = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.v;
            ykk.c(LPt6Fixed.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        public final String S() {
            Object obj = this.A;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.A = strS;
            }
            return strS;
        }

        public final Xn1 T() {
            Xn1 xn1 = this.C;
            return xn1 == null ? Xn1.E : xn1;
        }

        public final boolean U() {
            return (this.z & 2) != 0;
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == E) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.R(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return E;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LPt6Fixed)) {
                return super.equals(obj);
            }
            LPt6Fixed lPt6 = (LPt6Fixed) obj;
            int i = this.z;
            if (((i & 1) != 0) != ((lPt6.z & 1) != 0)) {
                return false;
            }
            if ((!((i & 1) != 0) || S().equals(lPt6.S())) && this.B.equals(lPt6.B) && U() == lPt6.U()) {
                return (!U() || T().equals(lPt6.T())) && this.y.equals(lPt6.y);
            }
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            if ((this.z & 1) != 0) {
                lPt3Fixed.R(codedOutputStream, 1, this.A);
            }
            for (int i = 0; i < this.B.size(); i++) {
                codedOutputStream.G1(2, this.B.get(i));
            }
            if ((this.z & 2) != 0) {
                codedOutputStream.G1(3, T());
            }
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.u.hashCode() + 779;
            if ((this.z & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 1, 53) + S().hashCode();
            }
            if (this.B.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 2, 53) + this.B.hashCode();
            }
            if (U()) {
                iHashCode = Xs.a(iHashCode, 37, 3, 53) + T().hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.D;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.B.size(); i++) {
                if (!this.B.get(i).isInitialized()) {
                    this.D = (byte) 0;
                    return false;
                }
            }
            if (!U() || T().isInitialized()) {
                this.D = (byte) 1;
                return true;
            }
            this.D = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iH = (this.z & 1) != 0 ? lPt3Fixed.H(1, this.A) + 0 : 0;
            for (int i2 = 0; i2 < this.B.size(); i2++) {
                iH += CodedOutputStream.i1(2, this.B.get(i2));
            }
            if ((this.z & 2) != 0) {
                iH += CodedOutputStream.i1(3, T());
            }
            int iJ = this.y.j() + iH;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return E.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<LPt6Fixed> p() {
            return F;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return E;
        }

        public LPt6Fixed() {
            this.D = (byte) -1;
            this.A = "";
            this.B = Collections.emptyList();
        }
    }

    public static final class LPt8Fixed extends lPt3Fixed implements roZB {
        public static final LPt8Fixed E = new LPt8Fixed();

        @Deprecated
        public static final QnHx F = new QnHx();
        public volatile Object A;
        public int B;
        public NUlFixed C;
        public byte D;
        public int z;

        public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
            public int A;
            public Object B;
            public int C;
            public NUlFixed D;
            public FA4<NUlFixed, NUlFixed.CQf, Object> E;

            public CQf() {
                this.B = "";
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.t;
                ykk.c(LPt8Fixed.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final LPt8Fixed f() {
                LPt8Fixed lPt8 = new LPt8Fixed(this);
                int i = this.A;
                int i2 = (i & 1) != 0 ? 1 : 0;
                lPt8.A = this.B;
                if ((i & 2) != 0) {
                    lPt8.B = this.C;
                    i2 |= 2;
                }
                if ((i & 4) != 0) {
                    FA4<NUlFixed, NUlFixed.CQf, Object> fa4 = this.E;
                    if (fa4 == null) {
                        lPt8.C = this.D;
                    } else {
                        lPt8.C = (NUlFixed) fa4.b();
                    }
                    i2 |= 4;
                }
                lPt8.z = i2;
                L();
                return lPt8;
            }

            public final void R(LPt8Fixed lPt8) {
                NUlFixed nUl;
                NUlFixed nUl2;
                if (lPt8 == LPt8Fixed.E) {
                    return;
                }
                if ((lPt8.z & 1) != 0) {
                    this.A |= 1;
                    this.B = lPt8.A;
                    M();
                }
                if ((lPt8.z & 2) != 0) {
                    int i = lPt8.B;
                    this.A |= 2;
                    this.C = i;
                    M();
                }
                if (lPt8.U()) {
                    NUlFixed nUlT = lPt8.T();
                    FA4<NUlFixed, NUlFixed.CQf, Object> fa4 = this.E;
                    if (fa4 == null) {
                        if ((this.A & 4) == 0 || (nUl = this.D) == null || nUl == (nUl2 = NUlFixed.E)) {
                            this.D = nUlT;
                        } else {
                            NUlFixed.CQf cQfC = nUl2.c();
                            cQfC.X(nUl);
                            cQfC.X(nUlT);
                            this.D = cQfC.f();
                        }
                        M();
                    } else {
                        fa4.e(nUlT);
                    }
                    this.A |= 4;
                }
                super.B(lPt8.y);
                M();
            }

            public final void S(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                NUlFixed nUl2;
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 10) {
                                    this.B = nUl.h();
                                    this.A |= 1;
                                } else if (iZ == 16) {
                                    this.C = nUl.o();
                                    this.A |= 2;
                                } else if (iZ == 26) {
                                    FA4<NUlFixed, NUlFixed.CQf, Object> fa4 = this.E;
                                    if (fa4 == null) {
                                        if (fa4 == null) {
                                            nUl2 = this.D;
                                            if (nUl2 == null) {
                                                nUl2 = NUlFixed.E;
                                            }
                                        } else {
                                            nUl2 = (NUlFixed) fa4.d();
                                        }
                                        this.E = new FA4<>(nUl2, H(), this.y);
                                        this.D = null;
                                    }
                                    nUl.r(this.E.c(), vv0Var);
                                    this.A |= 4;
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return LPt8Fixed.E;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                LPt8Fixed lPt8F = f();
                if (lPt8F.isInitialized()) {
                    return lPt8F;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(lPt8F);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.s;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                NUlFixed nUl;
                if ((this.A & 4) != 0) {
                    FA4<NUlFixed, NUlFixed.CQf, Object> fa4 = this.E;
                    if (fa4 == null) {
                        nUl = this.D;
                        if (nUl == null) {
                            nUl = NUlFixed.E;
                        }
                    } else {
                        nUl = (NUlFixed) fa4.d();
                    }
                    if (!nUl.isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof LPt8Fixed) {
                    R((LPt8Fixed) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof LPt8Fixed) {
                    R((LPt8Fixed) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return LPt8Fixed.E;
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.B = "";
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                LPt8Fixed lPt8F = f();
                if (lPt8F.isInitialized()) {
                    return lPt8F;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(lPt8F);
            }
        }

        public static class QnHx extends com.google.protobuf.F1<LPt8Fixed> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = LPt8Fixed.E.c();
                try {
                    cQfC.S(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public LPt8Fixed(lPt3Fixed.CQf cQf) {
            super(cQf);
            this.D = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.t;
            ykk.c(LPt8Fixed.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        public final String S() {
            Object obj = this.A;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.A = strS;
            }
            return strS;
        }

        public final NUlFixed T() {
            NUlFixed nUl = this.C;
            return nUl == null ? NUlFixed.E : nUl;
        }

        public final boolean U() {
            return (this.z & 4) != 0;
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == E) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.R(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return E;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LPt8Fixed)) {
                return super.equals(obj);
            }
            LPt8Fixed lPt8 = (LPt8Fixed) obj;
            int i = this.z;
            if (((i & 1) != 0) != ((lPt8.z & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && !S().equals(lPt8.S())) {
                return false;
            }
            int i2 = this.z;
            if (((i2 & 2) != 0) != ((lPt8.z & 2) != 0)) {
                return false;
            }
            if ((!((i2 & 2) != 0) || this.B == lPt8.B) && U() == lPt8.U()) {
                return (!U() || T().equals(lPt8.T())) && this.y.equals(lPt8.y);
            }
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            if ((this.z & 1) != 0) {
                lPt3Fixed.R(codedOutputStream, 1, this.A);
            }
            if ((this.z & 2) != 0) {
                codedOutputStream.E1(2, this.B);
            }
            if ((this.z & 4) != 0) {
                codedOutputStream.G1(3, T());
            }
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.s.hashCode() + 779;
            if ((this.z & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 1, 53) + S().hashCode();
            }
            if ((this.z & 2) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 2, 53) + this.B;
            }
            if (U()) {
                iHashCode = Xs.a(iHashCode, 37, 3, 53) + T().hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.D;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!U() || T().isInitialized()) {
                this.D = (byte) 1;
                return true;
            }
            this.D = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iH = (this.z & 1) != 0 ? 0 + lPt3Fixed.H(1, this.A) : 0;
            if ((this.z & 2) != 0) {
                iH += CodedOutputStream.e1(2, this.B);
            }
            if ((this.z & 4) != 0) {
                iH += CodedOutputStream.i1(3, T());
            }
            int iJ = this.y.j() + iH;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return E.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<LPt8Fixed> p() {
            return F;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return E;
        }

        public LPt8Fixed() {
            this.D = (byte) -1;
            this.A = "";
        }
    }

    public static final class LPt9Fixed extends lPt3Fixed implements roZB {
        public static final LPt9Fixed I = new LPt9Fixed();

        @Deprecated
        public static final QnHx J = new QnHx();
        public List<F1> A;
        public volatile Object B;
        public long C;
        public long D;
        public double E;
        public lk F;
        public volatile Object G;
        public byte H;
        public int z;

        public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
            public int A;
            public List<F1> B;
            public Object C;
            public long D;
            public long E;
            public double F;
            public lk G;
            public Object H;

            public CQf() {
                this.B = Collections.emptyList();
                this.C = "";
                this.G = lk.x;
                this.H = "";
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.P;
                ykk.c(LPt9Fixed.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final LPt9Fixed f() {
                LPt9Fixed lPt9 = new LPt9Fixed(this);
                int i = this.A;
                if ((i & 1) != 0) {
                    this.B = Collections.unmodifiableList(this.B);
                    this.A &= -2;
                }
                lPt9.A = this.B;
                int i2 = (i & 2) != 0 ? 1 : 0;
                lPt9.B = this.C;
                if ((i & 4) != 0) {
                    lPt9.C = this.D;
                    i2 |= 2;
                }
                if ((i & 8) != 0) {
                    lPt9.D = this.E;
                    i2 |= 4;
                }
                if ((i & 16) != 0) {
                    lPt9.E = this.F;
                    i2 |= 8;
                }
                if ((i & 32) != 0) {
                    i2 |= 16;
                }
                lPt9.F = this.G;
                if ((i & 64) != 0) {
                    i2 |= 32;
                }
                lPt9.G = this.H;
                lPt9.z = i2;
                L();
                return lPt9;
            }

            public final void R(LPt9Fixed lPt9) {
                if (lPt9 == LPt9Fixed.I) {
                    return;
                }
                if (!lPt9.A.isEmpty()) {
                    if (this.B.isEmpty()) {
                        this.B = lPt9.A;
                        this.A &= -2;
                    } else {
                        if ((this.A & 1) == 0) {
                            this.B = new ArrayList(this.B);
                            this.A |= 1;
                        }
                        this.B.addAll(lPt9.A);
                    }
                    M();
                }
                if ((lPt9.z & 1) != 0) {
                    this.A |= 2;
                    this.C = lPt9.B;
                    M();
                }
                if ((lPt9.z & 2) != 0) {
                    long j = lPt9.C;
                    this.A |= 4;
                    this.D = j;
                    M();
                }
                if ((lPt9.z & 4) != 0) {
                    long j2 = lPt9.D;
                    this.A |= 8;
                    this.E = j2;
                    M();
                }
                if ((lPt9.z & 8) != 0) {
                    double d = lPt9.E;
                    this.A |= 16;
                    this.F = d;
                    M();
                }
                if ((lPt9.z & 16) != 0) {
                    lk lkVar = lPt9.F;
                    lkVar.getClass();
                    this.A |= 32;
                    this.G = lkVar;
                    M();
                }
                if ((lPt9.z & 32) != 0) {
                    this.A |= 64;
                    this.H = lPt9.G;
                    M();
                }
                super.B(lPt9.y);
                M();
            }

            public final void S(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 18) {
                                    F1 f1 = (F1) nUl.q(F1.E, vv0Var);
                                    if ((this.A & 1) == 0) {
                                        this.B = new ArrayList(this.B);
                                        this.A |= 1;
                                    }
                                    this.B.add(f1);
                                } else if (iZ == 26) {
                                    this.C = nUl.h();
                                    this.A |= 2;
                                } else if (iZ == 32) {
                                    this.D = nUl.B();
                                    this.A |= 4;
                                } else if (iZ == 40) {
                                    this.E = nUl.p();
                                    this.A |= 8;
                                } else if (iZ == 49) {
                                    this.F = nUl.i();
                                    this.A |= 16;
                                } else if (iZ == 58) {
                                    this.G = nUl.h();
                                    this.A |= 32;
                                } else if (iZ == 66) {
                                    this.H = nUl.h();
                                    this.A |= 64;
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return LPt9Fixed.I;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                LPt9Fixed lPt9F = f();
                if (lPt9F.isInitialized()) {
                    return lPt9F;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(lPt9F);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.O;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                for (int i = 0; i < this.B.size(); i++) {
                    if (!this.B.get(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof LPt9Fixed) {
                    R((LPt9Fixed) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof LPt9Fixed) {
                    R((LPt9Fixed) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return LPt9Fixed.I;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                LPt9Fixed lPt9F = f();
                if (lPt9F.isInitialized()) {
                    return lPt9F;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(lPt9F);
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.B = Collections.emptyList();
                this.C = "";
                this.G = lk.x;
                this.H = "";
            }
        }

        public static final class F1 extends lPt3Fixed implements roZB {
            public static final F1 D = new F1();

            @Deprecated
            public static final QnHx E = new QnHx();
            public volatile Object A;
            public boolean B;
            public byte C;
            public int z;

            public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
                public int A;
                public Object B;
                public boolean C;

                public CQf() {
                    this.B = "";
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                public final void B(k kVar) {
                    super.B(kVar);
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: E */
                public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                    super.g(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: F */
                public final lPt3Fixed.CQf clone() {
                    return (CQf) super.clone();
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                public final lPt3Fixed.YKK I() {
                    lPt3Fixed.YKK ykk = EQ.R;
                    ykk.c(F1.class, CQf.class);
                    return ykk;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: J */
                public final lPt3Fixed.CQf B(k kVar) {
                    super.B(kVar);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: O */
                public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                    super.b(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: P */
                public final lPt3Fixed.CQf y(k kVar) {
                    this.z = kVar;
                    M();
                    return this;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
                public final F1 f() {
                    F1 f1 = new F1(this);
                    int i = this.A;
                    int i2 = (i & 1) != 0 ? 1 : 0;
                    f1.A = this.B;
                    if ((i & 2) != 0) {
                        f1.B = this.C;
                        i2 |= 2;
                    }
                    f1.z = i2;
                    L();
                    return f1;
                }

                public final void R(F1 f1) {
                    if (f1 == F1.D) {
                        return;
                    }
                    if (f1.U()) {
                        this.A |= 1;
                        this.B = f1.A;
                        M();
                    }
                    if (f1.T()) {
                        boolean z = f1.B;
                        this.A |= 2;
                        this.C = z;
                        M();
                    }
                    super.B(f1.y);
                    M();
                }

                public final void S(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    vv0Var.getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int iZ = nUl.z();
                                if (iZ != 0) {
                                    if (iZ == 10) {
                                        this.B = nUl.h();
                                        this.A |= 1;
                                    } else if (iZ == 16) {
                                        this.C = nUl.g();
                                        this.A |= 2;
                                    } else if (!N(nUl, vv0Var, iZ)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.g();
                            }
                        } catch (Throwable th) {
                            M();
                            throw th;
                        }
                    }
                    M();
                }

                @Override // defpackage.jd2
                public final mw0t a() {
                    return F1.D;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                    super.b(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                public final mw0t build() {
                    F1 f1F = f();
                    if (f1F.isInitialized()) {
                        return f1F;
                    }
                    throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(f1F);
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                public final Object clone() {
                    return (CQf) super.clone();
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
                public final Descriptors.QnHx e() {
                    return EQ.Q;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                    super.g(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
                public final boolean isInitialized() {
                    int i = this.A;
                    if ((i & 1) != 0) {
                        return (i & 2) != 0;
                    }
                    return false;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: r */
                public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                    return (CQf) super.clone();
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx s(mw0t mw0tVar) {
                    if (mw0tVar instanceof F1) {
                        R((F1) mw0tVar);
                    } else {
                        super.s(mw0tVar);
                    }
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
                public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    S(nUl, vv0Var);
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: w */
                public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    S(nUl, vv0Var);
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: x */
                public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                    if (mw0tVar instanceof F1) {
                        R((F1) mw0tVar);
                    } else {
                        super.s(mw0tVar);
                    }
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx y(k kVar) {
                    this.z = kVar;
                    M();
                    return this;
                }

                @Override // defpackage.jd2
                public final DzVS a() {
                    return F1.D;
                }

                public CQf(lPt3Fixed.QnHx qnHx) {
                    super(qnHx);
                    this.B = "";
                }

                @Override // com.google.protobuf.DzVS.QnHx
                public final DzVS build() {
                    F1 f1F = f();
                    if (f1F.isInitialized()) {
                        return f1F;
                    }
                    throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(f1F);
                }
            }

            public static class QnHx extends com.google.protobuf.F1<F1> {
                @Override // defpackage.oz2
                public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                    CQf cQfC = F1.D.c();
                    try {
                        cQfC.S(nUl, vv0Var);
                        return cQfC.f();
                    } catch (InvalidProtocolBufferException e) {
                        e.w = cQfC.f();
                        throw e;
                    } catch (UninitializedMessageException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                        invalidProtocolBufferExceptionA.w = cQfC.f();
                        throw invalidProtocolBufferExceptionA;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                        invalidProtocolBufferException.w = cQfC.f();
                        throw invalidProtocolBufferException;
                    }
                }
            }

            public F1(lPt3Fixed.CQf cQf) {
                super(cQf);
                this.C = (byte) -1;
            }

            @Override // com.google.protobuf.lPt3Fixed
            public final lPt3Fixed.YKK L() {
                lPt3Fixed.YKK ykk = EQ.R;
                ykk.c(F1.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed
            public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
                return new CQf(qnHx);
            }

            public final String S() {
                Object obj = this.A;
                if (obj instanceof String) {
                    return (String) obj;
                }
                lk lkVar = (lk) obj;
                String strS = lkVar.s();
                if (lkVar.g()) {
                    this.A = strS;
                }
                return strS;
            }

            public final boolean T() {
                return (this.z & 2) != 0;
            }

            public final boolean U() {
                return (this.z & 1) != 0;
            }

            @Override // com.google.protobuf.DzVS
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final CQf c() {
                if (this == D) {
                    return new CQf();
                }
                CQf cQf = new CQf();
                cQf.R(this);
                return cQf;
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return D;
            }

            @Override // com.google.protobuf.QnHx
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof F1)) {
                    return super.equals(obj);
                }
                F1 f1 = (F1) obj;
                if (U() != f1.U()) {
                    return false;
                }
                if ((!U() || S().equals(f1.S())) && T() == f1.T()) {
                    return (!T() || this.B == f1.B) && this.y.equals(f1.y);
                }
                return false;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
            public final void h(CodedOutputStream codedOutputStream) {
                if ((this.z & 1) != 0) {
                    lPt3Fixed.R(codedOutputStream, 1, this.A);
                }
                if ((this.z & 2) != 0) {
                    codedOutputStream.w1(2, this.B);
                }
                this.y.h(codedOutputStream);
            }

            @Override // com.google.protobuf.QnHx
            public final int hashCode() {
                int i = this.w;
                if (i != 0) {
                    return i;
                }
                int iHashCode = EQ.Q.hashCode() + 779;
                if (U()) {
                    iHashCode = Xs.a(iHashCode, 37, 1, 53) + S().hashCode();
                }
                if (T()) {
                    iHashCode = Xs.a(iHashCode, 37, 2, 53) + SjP.a(this.B);
                }
                int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
                this.w = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
            public final boolean isInitialized() {
                byte b = this.C;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!U()) {
                    this.C = (byte) 0;
                    return false;
                }
                if (T()) {
                    this.C = (byte) 1;
                    return true;
                }
                this.C = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
            public final int j() {
                int i = this.x;
                if (i != -1) {
                    return i;
                }
                int iH = (this.z & 1) != 0 ? 0 + lPt3Fixed.H(1, this.A) : 0;
                if ((this.z & 2) != 0) {
                    iH += CodedOutputStream.V0(2);
                }
                int iJ = this.y.j() + iH;
                this.x = iJ;
                return iJ;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
            public final k k() {
                return this.y;
            }

            @Override // com.google.protobuf.mw0t
            public final mw0t.QnHx n() {
                return D.c();
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
            public final oz2<F1> p() {
                return E;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return D;
            }

            public F1() {
                this.C = (byte) -1;
                this.A = "";
            }
        }

        public static class QnHx extends com.google.protobuf.F1<LPt9Fixed> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = LPt9Fixed.I.c();
                try {
                    cQfC.S(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public LPt9Fixed(lPt3Fixed.CQf cQf) {
            super(cQf);
            this.H = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.P;
            ykk.c(LPt9Fixed.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        public final String S() {
            Object obj = this.G;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.G = strS;
            }
            return strS;
        }

        public final String T() {
            Object obj = this.B;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.B = strS;
            }
            return strS;
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == I) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.R(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return I;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LPt9Fixed)) {
                return super.equals(obj);
            }
            LPt9Fixed lPt9 = (LPt9Fixed) obj;
            if (!this.A.equals(lPt9.A)) {
                return false;
            }
            int i = this.z;
            if (((i & 1) != 0) != ((lPt9.z & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && !T().equals(lPt9.T())) {
                return false;
            }
            int i2 = this.z;
            boolean z = (i2 & 2) != 0;
            int i3 = lPt9.z;
            if (z != ((i3 & 2) != 0)) {
                return false;
            }
            if (((i2 & 2) != 0) && this.C != lPt9.C) {
                return false;
            }
            if (((i2 & 4) != 0) != ((i3 & 4) != 0)) {
                return false;
            }
            if (((i2 & 4) != 0) && this.D != lPt9.D) {
                return false;
            }
            if (((i2 & 8) != 0) != ((i3 & 8) != 0)) {
                return false;
            }
            if (((i2 & 8) != 0) && Double.doubleToLongBits(this.E) != Double.doubleToLongBits(lPt9.E)) {
                return false;
            }
            int i4 = this.z;
            if (((i4 & 16) != 0) != ((lPt9.z & 16) != 0)) {
                return false;
            }
            if (((i4 & 16) != 0) && !this.F.equals(lPt9.F)) {
                return false;
            }
            int i5 = this.z;
            if (((i5 & 32) != 0) != ((lPt9.z & 32) != 0)) {
                return false;
            }
            return (!((i5 & 32) != 0) || S().equals(lPt9.S())) && this.y.equals(lPt9.y);
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.A.size(); i++) {
                codedOutputStream.G1(2, this.A.get(i));
            }
            if ((this.z & 1) != 0) {
                lPt3Fixed.R(codedOutputStream, 3, this.B);
            }
            if ((this.z & 2) != 0) {
                codedOutputStream.Q1(4, this.C);
            }
            if ((this.z & 4) != 0) {
                codedOutputStream.Q1(5, this.D);
            }
            if ((this.z & 8) != 0) {
                double d = this.E;
                codedOutputStream.getClass();
                codedOutputStream.C1(6, Double.doubleToRawLongBits(d));
            }
            if ((this.z & 16) != 0) {
                codedOutputStream.y1(7, this.F);
            }
            if ((this.z & 32) != 0) {
                lPt3Fixed.R(codedOutputStream, 8, this.G);
            }
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.O.hashCode() + 779;
            if (this.A.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 2, 53) + this.A.hashCode();
            }
            if ((this.z & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 3, 53) + T().hashCode();
            }
            if ((this.z & 2) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 4, 53) + SjP.b(this.C);
            }
            if ((this.z & 4) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 5, 53) + SjP.b(this.D);
            }
            if ((this.z & 8) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 6, 53) + SjP.b(Double.doubleToLongBits(this.E));
            }
            if ((this.z & 16) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 7, 53) + this.F.hashCode();
            }
            if ((this.z & 32) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 8, 53) + S().hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.H;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.A.size(); i++) {
                if (!this.A.get(i).isInitialized()) {
                    this.H = (byte) 0;
                    return false;
                }
            }
            this.H = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iH = 0;
            for (int i2 = 0; i2 < this.A.size(); i2++) {
                iH += CodedOutputStream.i1(2, this.A.get(i2));
            }
            if ((this.z & 1) != 0) {
                iH += lPt3Fixed.H(3, this.B);
            }
            if ((this.z & 2) != 0) {
                iH += CodedOutputStream.s1(4, this.C);
            }
            if ((this.z & 4) != 0) {
                iH += CodedOutputStream.g1(5, this.D);
            }
            if ((this.z & 8) != 0) {
                iH += CodedOutputStream.Y0(6);
            }
            if ((this.z & 16) != 0) {
                iH += CodedOutputStream.W0(7, this.F);
            }
            if ((this.z & 32) != 0) {
                iH += lPt3Fixed.H(8, this.G);
            }
            int iJ = this.y.j() + iH;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return I.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<LPt9Fixed> p() {
            return J;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return I;
        }

        public LPt9Fixed() {
            this.H = (byte) -1;
            this.A = Collections.emptyList();
            this.B = "";
            this.F = lk.x;
            this.G = "";
        }
    }

    public static final class MZ extends lPt3Fixed.NUlFixed<MZ> {
        public static final MZ C = new MZ();

        @Deprecated
        public static final QnHx D = new QnHx();
        public List<LPt9Fixed> A;
        public byte B;

        public static final class CQf extends lPt3Fixed.LPt8Fixed<MZ, CQf> {
            public int B;
            public List<LPt9Fixed> C;

            public CQf() {
                this.C = Collections.emptyList();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.F;
                ykk.c(MZ.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
            public final MZ f() {
                MZ mz = new MZ(this);
                if ((this.B & 1) != 0) {
                    this.C = Collections.unmodifiableList(this.C);
                    this.B &= -2;
                }
                mz.A = this.C;
                L();
                return mz;
            }

            public final void X(MZ mz) {
                if (mz == MZ.C) {
                    return;
                }
                if (!mz.A.isEmpty()) {
                    if (this.C.isEmpty()) {
                        this.C = mz.A;
                        this.B &= -2;
                    } else {
                        if ((this.B & 1) == 0) {
                            this.C = new ArrayList(this.C);
                            this.B |= 1;
                        }
                        this.C.addAll(mz.A);
                    }
                    M();
                }
                T(mz);
                super.B(mz.y);
                M();
            }

            public final void Y(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 7994) {
                                    LPt9Fixed lPt9 = (LPt9Fixed) nUl.q(LPt9Fixed.J, vv0Var);
                                    if ((this.B & 1) == 0) {
                                        this.C = new ArrayList(this.C);
                                        this.B |= 1;
                                    }
                                    this.C.add(lPt9);
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return MZ.C;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                MZ mzF = f();
                if (mzF.isInitialized()) {
                    return mzF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(mzF);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.E;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                for (int i = 0; i < this.C.size(); i++) {
                    if (!this.C.get(i).isInitialized()) {
                        return false;
                    }
                }
                return S();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof MZ) {
                    X((MZ) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof MZ) {
                    X((MZ) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return MZ.C;
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.C = Collections.emptyList();
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                MZ mzF = f();
                if (mzF.isInitialized()) {
                    return mzF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(mzF);
            }
        }

        public static class QnHx extends com.google.protobuf.F1<MZ> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = MZ.C.c();
                try {
                    cQfC.Y(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public MZ(lPt3Fixed.LPt8Fixed lPt8) {
            super(lPt8);
            this.B = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.F;
            ykk.c(MZ.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == C) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.X(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return C;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MZ)) {
                return super.equals(obj);
            }
            MZ mz = (MZ) obj;
            return this.A.equals(mz.A) && this.y.equals(mz.y) && U().equals(mz.U());
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            lPt3Fixed.NUlFixed.QnHx qnHx = new lPt3Fixed.NUlFixed.QnHx(this);
            for (int i = 0; i < this.A.size(); i++) {
                codedOutputStream.G1(999, this.A.get(i));
            }
            qnHx.a(codedOutputStream);
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.E.hashCode() + 779;
            if (this.A.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 999, 53) + this.A.hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (com.google.protobuf.QnHx.D(iHashCode, U()) * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed.NUlFixed, com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.B;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.A.size(); i++) {
                if (!this.A.get(i).isInitialized()) {
                    this.B = (byte) 0;
                    return false;
                }
            }
            if (S()) {
                this.B = (byte) 1;
                return true;
            }
            this.B = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iI1 = 0;
            for (int i2 = 0; i2 < this.A.size(); i2++) {
                iI1 += CodedOutputStream.i1(999, this.A.get(i2));
            }
            int iJ = this.y.j() + T() + iI1;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return C.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<MZ> p() {
            return D;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return C;
        }

        public MZ() {
            this.B = (byte) -1;
            this.A = Collections.emptyList();
        }
    }

    public static final class NUlFixed extends lPt3Fixed.NUlFixed<NUlFixed> {
        public static final NUlFixed E = new NUlFixed();

        @Deprecated
        public static final QnHx F = new QnHx();
        public int A;
        public boolean B;
        public List<LPt9Fixed> C;
        public byte D;

        public static final class CQf extends lPt3Fixed.LPt8Fixed<NUlFixed, CQf> {
            public int B;
            public boolean C;
            public List<LPt9Fixed> D;

            public CQf() {
                this.D = Collections.emptyList();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.J;
                ykk.c(NUlFixed.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
            public final NUlFixed f() {
                int i;
                NUlFixed nUl = new NUlFixed(this);
                int i2 = this.B;
                if ((i2 & 1) != 0) {
                    nUl.B = this.C;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    this.D = Collections.unmodifiableList(this.D);
                    this.B &= -3;
                }
                nUl.C = this.D;
                nUl.A = i;
                L();
                return nUl;
            }

            public final void X(NUlFixed nUl) {
                if (nUl == NUlFixed.E) {
                    return;
                }
                if ((nUl.A & 1) != 0) {
                    boolean z = nUl.B;
                    this.B |= 1;
                    this.C = z;
                    M();
                }
                if (!nUl.C.isEmpty()) {
                    if (this.D.isEmpty()) {
                        this.D = nUl.C;
                        this.B &= -3;
                    } else {
                        if ((this.B & 2) == 0) {
                            this.D = new ArrayList(this.D);
                            this.B |= 2;
                        }
                        this.D.addAll(nUl.C);
                    }
                    M();
                }
                T(nUl);
                super.B(nUl.y);
                M();
            }

            public final void Y(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 8) {
                                    this.C = nUl.g();
                                    this.B |= 1;
                                } else if (iZ == 7994) {
                                    LPt9Fixed lPt9 = (LPt9Fixed) nUl.q(LPt9Fixed.J, vv0Var);
                                    if ((this.B & 2) == 0) {
                                        this.D = new ArrayList(this.D);
                                        this.B |= 2;
                                    }
                                    this.D.add(lPt9);
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return NUlFixed.E;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                NUlFixed nUlF = f();
                if (nUlF.isInitialized()) {
                    return nUlF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(nUlF);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.I;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                for (int i = 0; i < this.D.size(); i++) {
                    if (!this.D.get(i).isInitialized()) {
                        return false;
                    }
                }
                return S();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof NUlFixed) {
                    X((NUlFixed) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof NUlFixed) {
                    X((NUlFixed) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return NUlFixed.E;
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.D = Collections.emptyList();
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                NUlFixed nUlF = f();
                if (nUlF.isInitialized()) {
                    return nUlF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(nUlF);
            }
        }

        public static class QnHx extends com.google.protobuf.F1<NUlFixed> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = NUlFixed.E.c();
                try {
                    cQfC.Y(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public NUlFixed(lPt3Fixed.LPt8Fixed lPt8) {
            super(lPt8);
            this.D = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.J;
            ykk.c(NUlFixed.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == E) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.X(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return E;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof NUlFixed)) {
                return super.equals(obj);
            }
            NUlFixed nUl = (NUlFixed) obj;
            int i = this.A;
            if (((i & 1) != 0) != ((nUl.A & 1) != 0)) {
                return false;
            }
            return (!((i & 1) != 0) || this.B == nUl.B) && this.C.equals(nUl.C) && this.y.equals(nUl.y) && U().equals(nUl.U());
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            lPt3Fixed.NUlFixed.QnHx qnHx = new lPt3Fixed.NUlFixed.QnHx(this);
            if ((this.A & 1) != 0) {
                codedOutputStream.w1(1, this.B);
            }
            for (int i = 0; i < this.C.size(); i++) {
                codedOutputStream.G1(999, this.C.get(i));
            }
            qnHx.a(codedOutputStream);
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.I.hashCode() + 779;
            if ((this.A & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 1, 53) + SjP.a(this.B);
            }
            if (this.C.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 999, 53) + this.C.hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (com.google.protobuf.QnHx.D(iHashCode, U()) * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed.NUlFixed, com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.D;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.C.size(); i++) {
                if (!this.C.get(i).isInitialized()) {
                    this.D = (byte) 0;
                    return false;
                }
            }
            if (S()) {
                this.D = (byte) 1;
                return true;
            }
            this.D = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iV0 = (this.A & 1) != 0 ? CodedOutputStream.V0(1) + 0 : 0;
            for (int i2 = 0; i2 < this.C.size(); i2++) {
                iV0 += CodedOutputStream.i1(999, this.C.get(i2));
            }
            int iJ = this.y.j() + T() + iV0;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return E.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<NUlFixed> p() {
            return F;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return E;
        }

        public NUlFixed() {
            this.D = (byte) -1;
            this.C = Collections.emptyList();
        }
    }

    public static final class PRnFixed extends lPt3Fixed implements roZB {
        public static final PRnFixed H = new PRnFixed();

        @Deprecated
        public static final QnHx I = new QnHx();
        public volatile Object A;
        public volatile Object B;
        public volatile Object C;
        public y D;
        public boolean E;
        public boolean F;
        public byte G;
        public int z;

        public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
            public int A;
            public Object B;
            public Object C;
            public Object D;
            public y E;
            public FA4<y, y.CQf, Object> F;
            public boolean G;
            public boolean H;

            public CQf() {
                this.B = "";
                this.C = "";
                this.D = "";
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.x;
                ykk.c(PRnFixed.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final PRnFixed f() {
                PRnFixed pRn = new PRnFixed(this);
                int i = this.A;
                int i2 = (i & 1) != 0 ? 1 : 0;
                pRn.A = this.B;
                if ((i & 2) != 0) {
                    i2 |= 2;
                }
                pRn.B = this.C;
                if ((i & 4) != 0) {
                    i2 |= 4;
                }
                pRn.C = this.D;
                if ((i & 8) != 0) {
                    FA4<y, y.CQf, Object> fa4 = this.F;
                    if (fa4 == null) {
                        pRn.D = this.E;
                    } else {
                        pRn.D = (y) fa4.b();
                    }
                    i2 |= 8;
                }
                if ((i & 16) != 0) {
                    pRn.E = this.G;
                    i2 |= 16;
                }
                if ((i & 32) != 0) {
                    pRn.F = this.H;
                    i2 |= 32;
                }
                pRn.z = i2;
                L();
                return pRn;
            }

            public final void R(PRnFixed pRn) {
                y yVar;
                y yVar2;
                if (pRn == PRnFixed.H) {
                    return;
                }
                if ((pRn.z & 1) != 0) {
                    this.A |= 1;
                    this.B = pRn.A;
                    M();
                }
                if ((pRn.z & 2) != 0) {
                    this.A |= 2;
                    this.C = pRn.B;
                    M();
                }
                if ((pRn.z & 4) != 0) {
                    this.A |= 4;
                    this.D = pRn.C;
                    M();
                }
                if (pRn.W()) {
                    y yVarU = pRn.U();
                    FA4<y, y.CQf, Object> fa4 = this.F;
                    if (fa4 == null) {
                        if ((this.A & 8) == 0 || (yVar = this.E) == null || yVar == (yVar2 = y.F)) {
                            this.E = yVarU;
                        } else {
                            y.CQf cQfC = yVar2.c();
                            cQfC.X(yVar);
                            cQfC.X(yVarU);
                            this.E = cQfC.f();
                        }
                        M();
                    } else {
                        fa4.e(yVarU);
                    }
                    this.A |= 8;
                }
                if ((pRn.z & 16) != 0) {
                    boolean z = pRn.E;
                    this.A |= 16;
                    this.G = z;
                    M();
                }
                if ((pRn.z & 32) != 0) {
                    boolean z2 = pRn.F;
                    this.A |= 32;
                    this.H = z2;
                    M();
                }
                super.B(pRn.y);
                M();
            }

            public final void S(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                y yVar;
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 10) {
                                    this.B = nUl.h();
                                    this.A |= 1;
                                } else if (iZ == 18) {
                                    this.C = nUl.h();
                                    this.A |= 2;
                                } else if (iZ == 26) {
                                    this.D = nUl.h();
                                    this.A |= 4;
                                } else if (iZ == 34) {
                                    FA4<y, y.CQf, Object> fa4 = this.F;
                                    if (fa4 == null) {
                                        if (fa4 == null) {
                                            yVar = this.E;
                                            if (yVar == null) {
                                                yVar = y.F;
                                            }
                                        } else {
                                            yVar = (y) fa4.d();
                                        }
                                        this.F = new FA4<>(yVar, H(), this.y);
                                        this.E = null;
                                    }
                                    nUl.r(this.F.c(), vv0Var);
                                    this.A |= 8;
                                } else if (iZ == 40) {
                                    this.G = nUl.g();
                                    this.A |= 16;
                                } else if (iZ == 48) {
                                    this.H = nUl.g();
                                    this.A |= 32;
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return PRnFixed.H;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                PRnFixed pRnF = f();
                if (pRnF.isInitialized()) {
                    return pRnF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(pRnF);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.w;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                y yVar;
                if ((this.A & 8) != 0) {
                    FA4<y, y.CQf, Object> fa4 = this.F;
                    if (fa4 == null) {
                        yVar = this.E;
                        if (yVar == null) {
                            yVar = y.F;
                        }
                    } else {
                        yVar = (y) fa4.d();
                    }
                    if (!yVar.isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof PRnFixed) {
                    R((PRnFixed) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof PRnFixed) {
                    R((PRnFixed) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return PRnFixed.H;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                PRnFixed pRnF = f();
                if (pRnF.isInitialized()) {
                    return pRnF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(pRnF);
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.B = "";
                this.C = "";
                this.D = "";
            }
        }

        public static class QnHx extends com.google.protobuf.F1<PRnFixed> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = PRnFixed.H.c();
                try {
                    cQfC.S(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public PRnFixed(lPt3Fixed.CQf cQf) {
            super(cQf);
            this.G = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.x;
            ykk.c(PRnFixed.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        public final String S() {
            Object obj = this.B;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.B = strS;
            }
            return strS;
        }

        public final String T() {
            Object obj = this.A;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.A = strS;
            }
            return strS;
        }

        public final y U() {
            y yVar = this.D;
            return yVar == null ? y.F : yVar;
        }

        public final String V() {
            Object obj = this.C;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.C = strS;
            }
            return strS;
        }

        public final boolean W() {
            return (this.z & 8) != 0;
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == H) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.R(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return H;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PRnFixed)) {
                return super.equals(obj);
            }
            PRnFixed pRn = (PRnFixed) obj;
            int i = this.z;
            if (((i & 1) != 0) != ((pRn.z & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && !T().equals(pRn.T())) {
                return false;
            }
            int i2 = this.z;
            if (((i2 & 2) != 0) != ((pRn.z & 2) != 0)) {
                return false;
            }
            if (((i2 & 2) != 0) && !S().equals(pRn.S())) {
                return false;
            }
            int i3 = this.z;
            if (((i3 & 4) != 0) != ((pRn.z & 4) != 0)) {
                return false;
            }
            if ((((i3 & 4) != 0) && !V().equals(pRn.V())) || W() != pRn.W()) {
                return false;
            }
            if (W() && !U().equals(pRn.U())) {
                return false;
            }
            int i4 = this.z;
            boolean z = (i4 & 16) != 0;
            int i5 = pRn.z;
            if (z != ((i5 & 16) != 0)) {
                return false;
            }
            if (((i4 & 16) != 0) && this.E != pRn.E) {
                return false;
            }
            if (((i4 & 32) != 0) != ((i5 & 32) != 0)) {
                return false;
            }
            return (!((i4 & 32) != 0) || this.F == pRn.F) && this.y.equals(pRn.y);
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            if ((this.z & 1) != 0) {
                lPt3Fixed.R(codedOutputStream, 1, this.A);
            }
            if ((this.z & 2) != 0) {
                lPt3Fixed.R(codedOutputStream, 2, this.B);
            }
            if ((this.z & 4) != 0) {
                lPt3Fixed.R(codedOutputStream, 3, this.C);
            }
            if ((this.z & 8) != 0) {
                codedOutputStream.G1(4, U());
            }
            if ((this.z & 16) != 0) {
                codedOutputStream.w1(5, this.E);
            }
            if ((this.z & 32) != 0) {
                codedOutputStream.w1(6, this.F);
            }
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.w.hashCode() + 779;
            if ((this.z & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 1, 53) + T().hashCode();
            }
            if ((this.z & 2) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 2, 53) + S().hashCode();
            }
            if ((this.z & 4) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 3, 53) + V().hashCode();
            }
            if (W()) {
                iHashCode = Xs.a(iHashCode, 37, 4, 53) + U().hashCode();
            }
            if ((this.z & 16) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 5, 53) + SjP.a(this.E);
            }
            if ((this.z & 32) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 6, 53) + SjP.a(this.F);
            }
            int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.G;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!W() || U().isInitialized()) {
                this.G = (byte) 1;
                return true;
            }
            this.G = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iH = (this.z & 1) != 0 ? 0 + lPt3Fixed.H(1, this.A) : 0;
            if ((this.z & 2) != 0) {
                iH += lPt3Fixed.H(2, this.B);
            }
            if ((this.z & 4) != 0) {
                iH += lPt3Fixed.H(3, this.C);
            }
            if ((this.z & 8) != 0) {
                iH += CodedOutputStream.i1(4, U());
            }
            if ((this.z & 16) != 0) {
                iH += CodedOutputStream.V0(5);
            }
            if ((this.z & 32) != 0) {
                iH += CodedOutputStream.V0(6);
            }
            int iJ = this.y.j() + iH;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return H.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<PRnFixed> p() {
            return I;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return H;
        }

        public PRnFixed() {
            this.G = (byte) -1;
            this.A = "";
            this.B = "";
            this.C = "";
        }
    }

    public static final class QnHx extends lPt3Fixed implements roZB {
        public static final QnHx L = new QnHx();

        @Deprecated
        public static final C0095QnHx M = new C0095QnHx();
        public volatile Object A;
        public List<auxFixed> B;
        public List<auxFixed> C;
        public List<QnHx> D;
        public List<CQf> E;
        public List<F1> F;
        public List<RBi> G;
        public FJCM H;
        public List<LPt8Fixed> I;
        public i22 J;
        public byte K;
        public int z;

        public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
            public int A;
            public Object B;
            public List<auxFixed> C;
            public List<auxFixed> D;
            public List<QnHx> E;
            public List<CQf> F;
            public List<F1> G;
            public List<RBi> H;
            public FJCM I;
            public FA4<FJCM, FJCM.CQf, Object> J;
            public List<LPt8Fixed> K;
            public i22 L;

            public CQf() {
                this.B = "";
                this.C = Collections.emptyList();
                this.D = Collections.emptyList();
                this.E = Collections.emptyList();
                this.F = Collections.emptyList();
                this.G = Collections.emptyList();
                this.H = Collections.emptyList();
                this.K = Collections.emptyList();
                this.L = ct.y;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.d;
                ykk.c(QnHx.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final QnHx f() {
                QnHx qnHx = new QnHx(this);
                int i = this.A;
                int i2 = (i & 1) != 0 ? 1 : 0;
                qnHx.A = this.B;
                if ((this.A & 2) != 0) {
                    this.C = Collections.unmodifiableList(this.C);
                    this.A &= -3;
                }
                qnHx.B = this.C;
                if ((this.A & 4) != 0) {
                    this.D = Collections.unmodifiableList(this.D);
                    this.A &= -5;
                }
                qnHx.C = this.D;
                if ((this.A & 8) != 0) {
                    this.E = Collections.unmodifiableList(this.E);
                    this.A &= -9;
                }
                qnHx.D = this.E;
                if ((this.A & 16) != 0) {
                    this.F = Collections.unmodifiableList(this.F);
                    this.A &= -17;
                }
                qnHx.E = this.F;
                if ((this.A & 32) != 0) {
                    this.G = Collections.unmodifiableList(this.G);
                    this.A &= -33;
                }
                qnHx.F = this.G;
                if ((this.A & 64) != 0) {
                    this.H = Collections.unmodifiableList(this.H);
                    this.A &= -65;
                }
                qnHx.G = this.H;
                if ((i & 128) != 0) {
                    FA4<FJCM, FJCM.CQf, Object> fa4 = this.J;
                    if (fa4 == null) {
                        qnHx.H = this.I;
                    } else {
                        qnHx.H = (FJCM) fa4.b();
                    }
                    i2 |= 2;
                }
                if ((this.A & 256) != 0) {
                    this.K = Collections.unmodifiableList(this.K);
                    this.A &= -257;
                }
                qnHx.I = this.K;
                if ((this.A & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                    this.L = this.L.t();
                    this.A &= -513;
                }
                qnHx.J = this.L;
                qnHx.z = i2;
                L();
                return qnHx;
            }

            public final void R() {
                if ((this.A & 32) == 0) {
                    this.G = new ArrayList(this.G);
                    this.A |= 32;
                }
            }

            public final void S(QnHx qnHx) {
                FJCM fjcm;
                FJCM fjcm2;
                if (qnHx == QnHx.L) {
                    return;
                }
                if ((qnHx.z & 1) != 0) {
                    this.A |= 1;
                    this.B = qnHx.A;
                    M();
                }
                if (!qnHx.B.isEmpty()) {
                    if (this.C.isEmpty()) {
                        this.C = qnHx.B;
                        this.A &= -3;
                    } else {
                        if ((this.A & 2) == 0) {
                            this.C = new ArrayList(this.C);
                            this.A |= 2;
                        }
                        this.C.addAll(qnHx.B);
                    }
                    M();
                }
                if (!qnHx.C.isEmpty()) {
                    if (this.D.isEmpty()) {
                        this.D = qnHx.C;
                        this.A &= -5;
                    } else {
                        if ((this.A & 4) == 0) {
                            this.D = new ArrayList(this.D);
                            this.A |= 4;
                        }
                        this.D.addAll(qnHx.C);
                    }
                    M();
                }
                if (!qnHx.D.isEmpty()) {
                    if (this.E.isEmpty()) {
                        this.E = qnHx.D;
                        this.A &= -9;
                    } else {
                        if ((this.A & 8) == 0) {
                            this.E = new ArrayList(this.E);
                            this.A |= 8;
                        }
                        this.E.addAll(qnHx.D);
                    }
                    M();
                }
                if (!qnHx.E.isEmpty()) {
                    if (this.F.isEmpty()) {
                        this.F = qnHx.E;
                        this.A &= -17;
                    } else {
                        if ((this.A & 16) == 0) {
                            this.F = new ArrayList(this.F);
                            this.A |= 16;
                        }
                        this.F.addAll(qnHx.E);
                    }
                    M();
                }
                if (!qnHx.F.isEmpty()) {
                    if (this.G.isEmpty()) {
                        this.G = qnHx.F;
                        this.A &= -33;
                    } else {
                        R();
                        this.G.addAll(qnHx.F);
                    }
                    M();
                }
                if (!qnHx.G.isEmpty()) {
                    if (this.H.isEmpty()) {
                        this.H = qnHx.G;
                        this.A &= -65;
                    } else {
                        if ((this.A & 64) == 0) {
                            this.H = new ArrayList(this.H);
                            this.A |= 64;
                        }
                        this.H.addAll(qnHx.G);
                    }
                    M();
                }
                if (qnHx.W()) {
                    FJCM fjcmV = qnHx.V();
                    FA4<FJCM, FJCM.CQf, Object> fa4 = this.J;
                    if (fa4 == null) {
                        if ((this.A & 128) == 0 || (fjcm = this.I) == null || fjcm == (fjcm2 = FJCM.H)) {
                            this.I = fjcmV;
                        } else {
                            FJCM.CQf cQfC = fjcm2.c();
                            cQfC.X(fjcm);
                            cQfC.X(fjcmV);
                            this.I = cQfC.f();
                        }
                        M();
                    } else {
                        fa4.e(fjcmV);
                    }
                    this.A |= 128;
                }
                if (!qnHx.I.isEmpty()) {
                    if (this.K.isEmpty()) {
                        this.K = qnHx.I;
                        this.A &= -257;
                    } else {
                        if ((this.A & 256) == 0) {
                            this.K = new ArrayList(this.K);
                            this.A |= 256;
                        }
                        this.K.addAll(qnHx.I);
                    }
                    M();
                }
                if (!qnHx.J.isEmpty()) {
                    if (this.L.isEmpty()) {
                        this.L = qnHx.J;
                        this.A &= -513;
                    } else {
                        if ((this.A & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
                            this.L = new ct(this.L);
                            this.A |= AdRequest.MAX_CONTENT_URL_LENGTH;
                        }
                        this.L.addAll(qnHx.J);
                    }
                    M();
                }
                super.B(qnHx.y);
                M();
            }

            public final void T(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                FJCM fjcm;
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            switch (iZ) {
                                case 0:
                                    break;
                                case 10:
                                    this.B = nUl.h();
                                    this.A |= 1;
                                    continue;
                                case 18:
                                    auxFixed auxVar = (auxFixed) nUl.q(auxFixed.N, vv0Var);
                                    if ((this.A & 2) == 0) {
                                        this.C = new ArrayList(this.C);
                                        this.A |= 2;
                                    }
                                    this.C.add(auxVar);
                                    continue;
                                case 26:
                                    QnHx qnHx = (QnHx) nUl.q(QnHx.M, vv0Var);
                                    if ((this.A & 8) == 0) {
                                        this.E = new ArrayList(this.E);
                                        this.A |= 8;
                                    }
                                    this.E.add(qnHx);
                                    continue;
                                case 34:
                                    CQf cQf = (CQf) nUl.q(CQf.H, vv0Var);
                                    if ((this.A & 16) == 0) {
                                        this.F = new ArrayList(this.F);
                                        this.A |= 16;
                                    }
                                    this.F.add(cQf);
                                    continue;
                                case 42:
                                    F1 f1 = (F1) nUl.q(F1.F, vv0Var);
                                    R();
                                    this.G.add(f1);
                                    continue;
                                case 50:
                                    auxFixed auxVar2 = (auxFixed) nUl.q(auxFixed.N, vv0Var);
                                    if ((this.A & 4) == 0) {
                                        this.D = new ArrayList(this.D);
                                        this.A |= 4;
                                    }
                                    this.D.add(auxVar2);
                                    continue;
                                case 58:
                                    FA4<FJCM, FJCM.CQf, Object> fa4 = this.J;
                                    if (fa4 == null) {
                                        if (fa4 == null) {
                                            fjcm = this.I;
                                            if (fjcm == null) {
                                                fjcm = FJCM.H;
                                            }
                                        } else {
                                            fjcm = (FJCM) fa4.d();
                                        }
                                        this.J = new FA4<>(fjcm, H(), this.y);
                                        this.I = null;
                                    }
                                    nUl.r(this.J.c(), vv0Var);
                                    this.A |= 128;
                                    continue;
                                case 66:
                                    RBi rBi = (RBi) nUl.q(RBi.E, vv0Var);
                                    if ((this.A & 64) == 0) {
                                        this.H = new ArrayList(this.H);
                                        this.A |= 64;
                                    }
                                    this.H.add(rBi);
                                    continue;
                                case 74:
                                    LPt8Fixed lPt8 = (LPt8Fixed) nUl.q(LPt8Fixed.E, vv0Var);
                                    if ((this.A & 256) == 0) {
                                        this.K = new ArrayList(this.K);
                                        this.A |= 256;
                                    }
                                    this.K.add(lPt8);
                                    continue;
                                case 82:
                                    lk.YKK ykkH = nUl.h();
                                    if ((this.A & AdRequest.MAX_CONTENT_URL_LENGTH) == 0) {
                                        this.L = new ct(this.L);
                                        this.A |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    }
                                    this.L.o(ykkH);
                                    continue;
                                default:
                                    if (!N(nUl, vv0Var, iZ)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return QnHx.L;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                QnHx qnHxF = f();
                if (qnHxF.isInitialized()) {
                    return qnHxF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(qnHxF);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.c;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                FJCM fjcm;
                for (int i = 0; i < this.C.size(); i++) {
                    if (!this.C.get(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < this.D.size(); i2++) {
                    if (!this.D.get(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < this.E.size(); i3++) {
                    if (!this.E.get(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < this.F.size(); i4++) {
                    if (!this.F.get(i4).isInitialized()) {
                        return false;
                    }
                }
                for (int i5 = 0; i5 < this.G.size(); i5++) {
                    if (!this.G.get(i5).isInitialized()) {
                        return false;
                    }
                }
                for (int i6 = 0; i6 < this.H.size(); i6++) {
                    if (!this.H.get(i6).isInitialized()) {
                        return false;
                    }
                }
                if ((this.A & 128) != 0) {
                    FA4<FJCM, FJCM.CQf, Object> fa4 = this.J;
                    if (fa4 == null) {
                        fjcm = this.I;
                        if (fjcm == null) {
                            fjcm = FJCM.H;
                        }
                    } else {
                        fjcm = (FJCM) fa4.d();
                    }
                    if (!fjcm.isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof QnHx) {
                    S((QnHx) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                T(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                T(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof QnHx) {
                    S((QnHx) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return QnHx.L;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                QnHx qnHxF = f();
                if (qnHxF.isInitialized()) {
                    return qnHxF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(qnHxF);
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.B = "";
                this.C = Collections.emptyList();
                this.D = Collections.emptyList();
                this.E = Collections.emptyList();
                this.F = Collections.emptyList();
                this.G = Collections.emptyList();
                this.H = Collections.emptyList();
                this.K = Collections.emptyList();
                this.L = ct.y;
            }
        }

        public static final class F1 extends lPt3Fixed implements roZB {
            public static final F1 E = new F1();

            @Deprecated
            public static final C0093QnHx F = new C0093QnHx();
            public int A;
            public int B;
            public YKK C;
            public byte D;
            public int z;

            public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
                public int A;
                public int B;
                public int C;
                public YKK D;
                public FA4<YKK, YKK.CQf, Object> E;

                public CQf() {
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                public final void B(k kVar) {
                    super.B(kVar);
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: E */
                public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                    super.g(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: F */
                public final lPt3Fixed.CQf clone() {
                    return (CQf) super.clone();
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                public final lPt3Fixed.YKK I() {
                    lPt3Fixed.YKK ykk = EQ.f;
                    ykk.c(F1.class, CQf.class);
                    return ykk;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: J */
                public final lPt3Fixed.CQf B(k kVar) {
                    super.B(kVar);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: O */
                public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                    super.b(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: P */
                public final lPt3Fixed.CQf y(k kVar) {
                    this.z = kVar;
                    M();
                    return this;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
                public final F1 f() {
                    int i;
                    F1 f1 = new F1(this);
                    int i2 = this.A;
                    if ((i2 & 1) != 0) {
                        f1.A = this.B;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i2 & 2) != 0) {
                        f1.B = this.C;
                        i |= 2;
                    }
                    if ((i2 & 4) != 0) {
                        FA4<YKK, YKK.CQf, Object> fa4 = this.E;
                        if (fa4 == null) {
                            f1.C = this.D;
                        } else {
                            f1.C = (YKK) fa4.b();
                        }
                        i |= 4;
                    }
                    f1.z = i;
                    L();
                    return f1;
                }

                public final void R(F1 f1) {
                    YKK ykk;
                    YKK ykk2;
                    if (f1 == F1.E) {
                        return;
                    }
                    if ((f1.z & 1) != 0) {
                        int i = f1.A;
                        this.A |= 1;
                        this.B = i;
                        M();
                    }
                    if ((f1.z & 2) != 0) {
                        int i2 = f1.B;
                        this.A |= 2;
                        this.C = i2;
                        M();
                    }
                    if (f1.T()) {
                        YKK ykkS = f1.S();
                        FA4<YKK, YKK.CQf, Object> fa4 = this.E;
                        if (fa4 == null) {
                            if ((this.A & 4) == 0 || (ykk = this.D) == null || ykk == (ykk2 = YKK.C)) {
                                this.D = ykkS;
                            } else {
                                YKK.CQf cQfC = ykk2.c();
                                cQfC.X(ykk);
                                cQfC.X(ykkS);
                                this.D = cQfC.f();
                            }
                            M();
                        } else {
                            fa4.e(ykkS);
                        }
                        this.A |= 4;
                    }
                    super.B(f1.y);
                    M();
                }

                public final void S(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    YKK ykk;
                    vv0Var.getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int iZ = nUl.z();
                                if (iZ != 0) {
                                    if (iZ == 8) {
                                        this.B = nUl.o();
                                        this.A |= 1;
                                    } else if (iZ == 16) {
                                        this.C = nUl.o();
                                        this.A |= 2;
                                    } else if (iZ == 26) {
                                        FA4<YKK, YKK.CQf, Object> fa4 = this.E;
                                        if (fa4 == null) {
                                            if (fa4 == null) {
                                                ykk = this.D;
                                                if (ykk == null) {
                                                    ykk = YKK.C;
                                                }
                                            } else {
                                                ykk = (YKK) fa4.d();
                                            }
                                            this.E = new FA4<>(ykk, H(), this.y);
                                            this.D = null;
                                        }
                                        nUl.r(this.E.c(), vv0Var);
                                        this.A |= 4;
                                    } else if (!N(nUl, vv0Var, iZ)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.g();
                            }
                        } catch (Throwable th) {
                            M();
                            throw th;
                        }
                    }
                    M();
                }

                @Override // defpackage.jd2
                public final mw0t a() {
                    return F1.E;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                    super.b(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                public final mw0t build() {
                    F1 f1F = f();
                    if (f1F.isInitialized()) {
                        return f1F;
                    }
                    throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(f1F);
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                public final Object clone() {
                    return (CQf) super.clone();
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
                public final Descriptors.QnHx e() {
                    return EQ.e;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                    super.g(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
                public final boolean isInitialized() {
                    YKK ykk;
                    if ((this.A & 4) != 0) {
                        FA4<YKK, YKK.CQf, Object> fa4 = this.E;
                        if (fa4 == null) {
                            ykk = this.D;
                            if (ykk == null) {
                                ykk = YKK.C;
                            }
                        } else {
                            ykk = (YKK) fa4.d();
                        }
                        if (!ykk.isInitialized()) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: r */
                public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                    return (CQf) super.clone();
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx s(mw0t mw0tVar) {
                    if (mw0tVar instanceof F1) {
                        R((F1) mw0tVar);
                    } else {
                        super.s(mw0tVar);
                    }
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
                public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    S(nUl, vv0Var);
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: w */
                public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    S(nUl, vv0Var);
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: x */
                public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                    if (mw0tVar instanceof F1) {
                        R((F1) mw0tVar);
                    } else {
                        super.s(mw0tVar);
                    }
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx y(k kVar) {
                    this.z = kVar;
                    M();
                    return this;
                }

                public CQf(lPt3Fixed.QnHx qnHx) {
                    super(qnHx);
                }

                @Override // defpackage.jd2
                public final DzVS a() {
                    return F1.E;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                public final DzVS build() {
                    F1 f1F = f();
                    if (f1F.isInitialized()) {
                        return f1F;
                    }
                    throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(f1F);
                }
            }

            /* JADX INFO: renamed from: com.google.protobuf.EQ$QnHx$F1$QnHx, reason: collision with other inner class name */
            public static class C0093QnHx extends com.google.protobuf.F1<F1> {
                @Override // defpackage.oz2
                public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                    CQf cQfC = F1.E.c();
                    try {
                        cQfC.S(nUl, vv0Var);
                        return cQfC.f();
                    } catch (InvalidProtocolBufferException e) {
                        e.w = cQfC.f();
                        throw e;
                    } catch (UninitializedMessageException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                        invalidProtocolBufferExceptionA.w = cQfC.f();
                        throw invalidProtocolBufferExceptionA;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                        invalidProtocolBufferException.w = cQfC.f();
                        throw invalidProtocolBufferException;
                    }
                }
            }

            public F1(lPt3Fixed.CQf cQf) {
                super(cQf);
                this.D = (byte) -1;
            }

            @Override // com.google.protobuf.lPt3Fixed
            public final lPt3Fixed.YKK L() {
                lPt3Fixed.YKK ykk = EQ.f;
                ykk.c(F1.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed
            public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
                return new CQf(qnHx);
            }

            public final YKK S() {
                YKK ykk = this.C;
                return ykk == null ? YKK.C : ykk;
            }

            public final boolean T() {
                return (this.z & 4) != 0;
            }

            @Override // com.google.protobuf.DzVS
            /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
            public final CQf c() {
                if (this == E) {
                    return new CQf();
                }
                CQf cQf = new CQf();
                cQf.R(this);
                return cQf;
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return E;
            }

            @Override // com.google.protobuf.QnHx
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof F1)) {
                    return super.equals(obj);
                }
                F1 f1 = (F1) obj;
                int i = this.z;
                boolean z = (i & 1) != 0;
                int i2 = f1.z;
                if (z != ((i2 & 1) != 0)) {
                    return false;
                }
                if (((i & 1) != 0) && this.A != f1.A) {
                    return false;
                }
                if (((i & 2) != 0) != ((i2 & 2) != 0)) {
                    return false;
                }
                if ((!((i & 2) != 0) || this.B == f1.B) && T() == f1.T()) {
                    return (!T() || S().equals(f1.S())) && this.y.equals(f1.y);
                }
                return false;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
            public final void h(CodedOutputStream codedOutputStream) {
                if ((this.z & 1) != 0) {
                    codedOutputStream.E1(1, this.A);
                }
                if ((this.z & 2) != 0) {
                    codedOutputStream.E1(2, this.B);
                }
                if ((this.z & 4) != 0) {
                    codedOutputStream.G1(3, S());
                }
                this.y.h(codedOutputStream);
            }

            @Override // com.google.protobuf.QnHx
            public final int hashCode() {
                int i = this.w;
                if (i != 0) {
                    return i;
                }
                int iHashCode = EQ.e.hashCode() + 779;
                int i2 = this.z;
                if ((i2 & 1) != 0) {
                    iHashCode = Xs.a(iHashCode, 37, 1, 53) + this.A;
                }
                if ((i2 & 2) != 0) {
                    iHashCode = Xs.a(iHashCode, 37, 2, 53) + this.B;
                }
                if (T()) {
                    iHashCode = Xs.a(iHashCode, 37, 3, 53) + S().hashCode();
                }
                int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
                this.w = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
            public final boolean isInitialized() {
                byte b = this.D;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                if (!T() || S().isInitialized()) {
                    this.D = (byte) 1;
                    return true;
                }
                this.D = (byte) 0;
                return false;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
            public final int j() {
                int i = this.x;
                if (i != -1) {
                    return i;
                }
                int iE1 = (this.z & 1) != 0 ? 0 + CodedOutputStream.e1(1, this.A) : 0;
                if ((this.z & 2) != 0) {
                    iE1 += CodedOutputStream.e1(2, this.B);
                }
                if ((this.z & 4) != 0) {
                    iE1 += CodedOutputStream.i1(3, S());
                }
                int iJ = this.y.j() + iE1;
                this.x = iJ;
                return iJ;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
            public final k k() {
                return this.y;
            }

            @Override // com.google.protobuf.mw0t
            public final mw0t.QnHx n() {
                return E.c();
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
            public final oz2<F1> p() {
                return F;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return E;
            }

            public F1() {
                this.D = (byte) -1;
            }
        }

        public static final class LPt8Fixed extends lPt3Fixed implements roZB {
            public static final LPt8Fixed D = new LPt8Fixed();

            @Deprecated
            public static final C0094QnHx E = new C0094QnHx();
            public int A;
            public int B;
            public byte C;
            public int z;

            public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
                public int A;
                public int B;
                public int C;

                public CQf() {
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                public final void B(k kVar) {
                    super.B(kVar);
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: E */
                public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                    super.g(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: F */
                public final lPt3Fixed.CQf clone() {
                    return (CQf) super.clone();
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                public final lPt3Fixed.YKK I() {
                    lPt3Fixed.YKK ykk = EQ.h;
                    ykk.c(LPt8Fixed.class, CQf.class);
                    return ykk;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: J */
                public final lPt3Fixed.CQf B(k kVar) {
                    super.B(kVar);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: O */
                public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                    super.b(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: P */
                public final lPt3Fixed.CQf y(k kVar) {
                    this.z = kVar;
                    M();
                    return this;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
                public final LPt8Fixed f() {
                    int i;
                    LPt8Fixed lPt8 = new LPt8Fixed(this);
                    int i2 = this.A;
                    if ((i2 & 1) != 0) {
                        lPt8.A = this.B;
                        i = 1;
                    } else {
                        i = 0;
                    }
                    if ((i2 & 2) != 0) {
                        lPt8.B = this.C;
                        i |= 2;
                    }
                    lPt8.z = i;
                    L();
                    return lPt8;
                }

                public final void R(LPt8Fixed lPt8) {
                    if (lPt8 == LPt8Fixed.D) {
                        return;
                    }
                    if ((lPt8.z & 1) != 0) {
                        int i = lPt8.A;
                        this.A |= 1;
                        this.B = i;
                        M();
                    }
                    if ((lPt8.z & 2) != 0) {
                        int i2 = lPt8.B;
                        this.A |= 2;
                        this.C = i2;
                        M();
                    }
                    super.B(lPt8.y);
                    M();
                }

                public final void S(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    vv0Var.getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int iZ = nUl.z();
                                if (iZ != 0) {
                                    if (iZ == 8) {
                                        this.B = nUl.o();
                                        this.A |= 1;
                                    } else if (iZ == 16) {
                                        this.C = nUl.o();
                                        this.A |= 2;
                                    } else if (!N(nUl, vv0Var, iZ)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.g();
                            }
                        } catch (Throwable th) {
                            M();
                            throw th;
                        }
                    }
                    M();
                }

                @Override // defpackage.jd2
                public final mw0t a() {
                    return LPt8Fixed.D;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                    super.b(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                public final mw0t build() {
                    LPt8Fixed lPt8F = f();
                    if (lPt8F.isInitialized()) {
                        return lPt8F;
                    }
                    throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(lPt8F);
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                public final Object clone() {
                    return (CQf) super.clone();
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
                public final Descriptors.QnHx e() {
                    return EQ.g;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                    super.g(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: r */
                public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                    return (CQf) super.clone();
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx s(mw0t mw0tVar) {
                    if (mw0tVar instanceof LPt8Fixed) {
                        R((LPt8Fixed) mw0tVar);
                    } else {
                        super.s(mw0tVar);
                    }
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
                public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    S(nUl, vv0Var);
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: w */
                public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    S(nUl, vv0Var);
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: x */
                public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                    if (mw0tVar instanceof LPt8Fixed) {
                        R((LPt8Fixed) mw0tVar);
                    } else {
                        super.s(mw0tVar);
                    }
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx y(k kVar) {
                    this.z = kVar;
                    M();
                    return this;
                }

                public CQf(lPt3Fixed.QnHx qnHx) {
                    super(qnHx);
                }

                @Override // defpackage.jd2
                public final DzVS a() {
                    return LPt8Fixed.D;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                public final DzVS build() {
                    LPt8Fixed lPt8F = f();
                    if (lPt8F.isInitialized()) {
                        return lPt8F;
                    }
                    throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(lPt8F);
                }
            }

            /* JADX INFO: renamed from: com.google.protobuf.EQ$QnHx$LPt8$QnHx, reason: collision with other inner class name */
            public static class C0094QnHx extends com.google.protobuf.F1<LPt8Fixed> {
                @Override // defpackage.oz2
                public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                    CQf cQfC = LPt8Fixed.D.c();
                    try {
                        cQfC.S(nUl, vv0Var);
                        return cQfC.f();
                    } catch (InvalidProtocolBufferException e) {
                        e.w = cQfC.f();
                        throw e;
                    } catch (UninitializedMessageException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                        invalidProtocolBufferExceptionA.w = cQfC.f();
                        throw invalidProtocolBufferExceptionA;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                        invalidProtocolBufferException.w = cQfC.f();
                        throw invalidProtocolBufferException;
                    }
                }
            }

            public LPt8Fixed(lPt3Fixed.CQf cQf) {
                super(cQf);
                this.C = (byte) -1;
            }

            @Override // com.google.protobuf.lPt3Fixed
            public final lPt3Fixed.YKK L() {
                lPt3Fixed.YKK ykk = EQ.h;
                ykk.c(LPt8Fixed.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed
            public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
                return new CQf(qnHx);
            }

            @Override // com.google.protobuf.DzVS
            /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
            public final CQf c() {
                if (this == D) {
                    return new CQf();
                }
                CQf cQf = new CQf();
                cQf.R(this);
                return cQf;
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return D;
            }

            @Override // com.google.protobuf.QnHx
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof LPt8Fixed)) {
                    return super.equals(obj);
                }
                LPt8Fixed lPt8 = (LPt8Fixed) obj;
                int i = this.z;
                boolean z = (i & 1) != 0;
                int i2 = lPt8.z;
                if (z != ((i2 & 1) != 0)) {
                    return false;
                }
                if (((i & 1) != 0) && this.A != lPt8.A) {
                    return false;
                }
                if (((i & 2) != 0) != ((i2 & 2) != 0)) {
                    return false;
                }
                return (!((i & 2) != 0) || this.B == lPt8.B) && this.y.equals(lPt8.y);
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
            public final void h(CodedOutputStream codedOutputStream) {
                if ((this.z & 1) != 0) {
                    codedOutputStream.E1(1, this.A);
                }
                if ((this.z & 2) != 0) {
                    codedOutputStream.E1(2, this.B);
                }
                this.y.h(codedOutputStream);
            }

            @Override // com.google.protobuf.QnHx
            public final int hashCode() {
                int i = this.w;
                if (i != 0) {
                    return i;
                }
                int iHashCode = EQ.g.hashCode() + 779;
                int i2 = this.z;
                if ((i2 & 1) != 0) {
                    iHashCode = Xs.a(iHashCode, 37, 1, 53) + this.A;
                }
                if ((i2 & 2) != 0) {
                    iHashCode = Xs.a(iHashCode, 37, 2, 53) + this.B;
                }
                int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
                this.w = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
            public final boolean isInitialized() {
                byte b = this.C;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.C = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
            public final int j() {
                int i = this.x;
                if (i != -1) {
                    return i;
                }
                int iE1 = (this.z & 1) != 0 ? 0 + CodedOutputStream.e1(1, this.A) : 0;
                if ((this.z & 2) != 0) {
                    iE1 += CodedOutputStream.e1(2, this.B);
                }
                int iJ = this.y.j() + iE1;
                this.x = iJ;
                return iJ;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
            public final k k() {
                return this.y;
            }

            @Override // com.google.protobuf.mw0t
            public final mw0t.QnHx n() {
                return D.c();
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
            public final oz2<LPt8Fixed> p() {
                return E;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return D;
            }

            public LPt8Fixed() {
                this.C = (byte) -1;
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.EQ$QnHx$QnHx, reason: collision with other inner class name */
        public static class C0095QnHx extends com.google.protobuf.F1<QnHx> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = QnHx.L.c();
                try {
                    cQfC.T(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public QnHx(lPt3Fixed.CQf cQf) {
            super(cQf);
            this.K = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.d;
            ykk.c(QnHx.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        public final int S() {
            return this.B.size();
        }

        public final String T() {
            Object obj = this.A;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.A = strS;
            }
            return strS;
        }

        public final int U() {
            return this.G.size();
        }

        public final FJCM V() {
            FJCM fjcm = this.H;
            return fjcm == null ? FJCM.H : fjcm;
        }

        public final boolean W() {
            return (this.z & 2) != 0;
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == L) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.S(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return L;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof QnHx)) {
                return super.equals(obj);
            }
            QnHx qnHx = (QnHx) obj;
            int i = this.z;
            if (((i & 1) != 0) != ((qnHx.z & 1) != 0)) {
                return false;
            }
            if ((!((i & 1) != 0) || T().equals(qnHx.T())) && this.B.equals(qnHx.B) && this.C.equals(qnHx.C) && this.D.equals(qnHx.D) && this.E.equals(qnHx.E) && this.F.equals(qnHx.F) && this.G.equals(qnHx.G) && W() == qnHx.W()) {
                return (!W() || V().equals(qnHx.V())) && this.I.equals(qnHx.I) && this.J.equals(qnHx.J) && this.y.equals(qnHx.y);
            }
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            if ((this.z & 1) != 0) {
                lPt3Fixed.R(codedOutputStream, 1, this.A);
            }
            for (int i = 0; i < this.B.size(); i++) {
                codedOutputStream.G1(2, this.B.get(i));
            }
            for (int i2 = 0; i2 < this.D.size(); i2++) {
                codedOutputStream.G1(3, this.D.get(i2));
            }
            for (int i3 = 0; i3 < this.E.size(); i3++) {
                codedOutputStream.G1(4, this.E.get(i3));
            }
            for (int i4 = 0; i4 < this.F.size(); i4++) {
                codedOutputStream.G1(5, this.F.get(i4));
            }
            for (int i5 = 0; i5 < this.C.size(); i5++) {
                codedOutputStream.G1(6, this.C.get(i5));
            }
            if ((this.z & 2) != 0) {
                codedOutputStream.G1(7, V());
            }
            for (int i6 = 0; i6 < this.G.size(); i6++) {
                codedOutputStream.G1(8, this.G.get(i6));
            }
            for (int i7 = 0; i7 < this.I.size(); i7++) {
                codedOutputStream.G1(9, this.I.get(i7));
            }
            for (int i8 = 0; i8 < this.J.size(); i8++) {
                lPt3Fixed.R(codedOutputStream, 10, this.J.w(i8));
            }
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.c.hashCode() + 779;
            if ((this.z & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 1, 53) + T().hashCode();
            }
            if (S() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 2, 53) + this.B.hashCode();
            }
            if (this.C.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 6, 53) + this.C.hashCode();
            }
            if (this.D.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 3, 53) + this.D.hashCode();
            }
            if (this.E.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 4, 53) + this.E.hashCode();
            }
            if (this.F.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 5, 53) + this.F.hashCode();
            }
            if (U() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 8, 53) + this.G.hashCode();
            }
            if (W()) {
                iHashCode = Xs.a(iHashCode, 37, 7, 53) + V().hashCode();
            }
            if (this.I.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 9, 53) + this.I.hashCode();
            }
            if (this.J.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 10, 53) + this.J.hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.K;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < S(); i++) {
                if (!this.B.get(i).isInitialized()) {
                    this.K = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.C.size(); i2++) {
                if (!this.C.get(i2).isInitialized()) {
                    this.K = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.D.size(); i3++) {
                if (!this.D.get(i3).isInitialized()) {
                    this.K = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < this.E.size(); i4++) {
                if (!this.E.get(i4).isInitialized()) {
                    this.K = (byte) 0;
                    return false;
                }
            }
            for (int i5 = 0; i5 < this.F.size(); i5++) {
                if (!this.F.get(i5).isInitialized()) {
                    this.K = (byte) 0;
                    return false;
                }
            }
            for (int i6 = 0; i6 < U(); i6++) {
                if (!this.G.get(i6).isInitialized()) {
                    this.K = (byte) 0;
                    return false;
                }
            }
            if (!W() || V().isInitialized()) {
                this.K = (byte) 1;
                return true;
            }
            this.K = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iH = (this.z & 1) != 0 ? lPt3Fixed.H(1, this.A) + 0 : 0;
            for (int i2 = 0; i2 < this.B.size(); i2++) {
                iH += CodedOutputStream.i1(2, this.B.get(i2));
            }
            for (int i3 = 0; i3 < this.D.size(); i3++) {
                iH += CodedOutputStream.i1(3, this.D.get(i3));
            }
            for (int i4 = 0; i4 < this.E.size(); i4++) {
                iH += CodedOutputStream.i1(4, this.E.get(i4));
            }
            for (int i5 = 0; i5 < this.F.size(); i5++) {
                iH += CodedOutputStream.i1(5, this.F.get(i5));
            }
            for (int i6 = 0; i6 < this.C.size(); i6++) {
                iH += CodedOutputStream.i1(6, this.C.get(i6));
            }
            if ((this.z & 2) != 0) {
                iH += CodedOutputStream.i1(7, V());
            }
            for (int i7 = 0; i7 < this.G.size(); i7++) {
                iH += CodedOutputStream.i1(8, this.G.get(i7));
            }
            for (int i8 = 0; i8 < this.I.size(); i8++) {
                iH += CodedOutputStream.i1(9, this.I.get(i8));
            }
            int I = 0;
            for (int i9 = 0; i9 < this.J.size(); i9++) {
                I += lPt3Fixed.I(this.J.w(i9));
            }
            int iJ = this.y.j() + (this.J.size() * 1) + iH + I;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return L.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<QnHx> p() {
            return M;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return L;
        }

        public QnHx() {
            this.K = (byte) -1;
            this.A = "";
            this.B = Collections.emptyList();
            this.C = Collections.emptyList();
            this.D = Collections.emptyList();
            this.E = Collections.emptyList();
            this.F = Collections.emptyList();
            this.G = Collections.emptyList();
            this.I = Collections.emptyList();
            this.J = ct.y;
        }
    }

    public static final class RBi extends lPt3Fixed implements roZB {
        public static final RBi D = new RBi();

        @Deprecated
        public static final QnHx E = new QnHx();
        public volatile Object A;
        public MZ B;
        public byte C;
        public int z;

        public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
            public int A;
            public Object B;
            public MZ C;
            public FA4<MZ, MZ.CQf, Object> D;

            public CQf() {
                this.B = "";
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.n;
                ykk.c(RBi.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final RBi f() {
                RBi rBi = new RBi(this);
                int i = this.A;
                int i2 = (i & 1) != 0 ? 1 : 0;
                rBi.A = this.B;
                if ((i & 2) != 0) {
                    FA4<MZ, MZ.CQf, Object> fa4 = this.D;
                    if (fa4 == null) {
                        rBi.B = this.C;
                    } else {
                        rBi.B = (MZ) fa4.b();
                    }
                    i2 |= 2;
                }
                rBi.z = i2;
                L();
                return rBi;
            }

            public final void R(RBi rBi) {
                MZ mz;
                MZ mz2;
                if (rBi == RBi.D) {
                    return;
                }
                if ((rBi.z & 1) != 0) {
                    this.A |= 1;
                    this.B = rBi.A;
                    M();
                }
                if (rBi.U()) {
                    MZ mzT = rBi.T();
                    FA4<MZ, MZ.CQf, Object> fa4 = this.D;
                    if (fa4 == null) {
                        if ((this.A & 2) == 0 || (mz = this.C) == null || mz == (mz2 = MZ.C)) {
                            this.C = mzT;
                        } else {
                            MZ.CQf cQfC = mz2.c();
                            cQfC.X(mz);
                            cQfC.X(mzT);
                            this.C = cQfC.f();
                        }
                        M();
                    } else {
                        fa4.e(mzT);
                    }
                    this.A |= 2;
                }
                super.B(rBi.y);
                M();
            }

            public final void S(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                MZ mz;
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 10) {
                                    this.B = nUl.h();
                                    this.A |= 1;
                                } else if (iZ == 18) {
                                    FA4<MZ, MZ.CQf, Object> fa4 = this.D;
                                    if (fa4 == null) {
                                        if (fa4 == null) {
                                            mz = this.C;
                                            if (mz == null) {
                                                mz = MZ.C;
                                            }
                                        } else {
                                            mz = (MZ) fa4.d();
                                        }
                                        this.D = new FA4<>(mz, H(), this.y);
                                        this.C = null;
                                    }
                                    nUl.r(this.D.c(), vv0Var);
                                    this.A |= 2;
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return RBi.D;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                RBi rBiF = f();
                if (rBiF.isInitialized()) {
                    return rBiF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(rBiF);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.m;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                MZ mz;
                if ((this.A & 2) != 0) {
                    FA4<MZ, MZ.CQf, Object> fa4 = this.D;
                    if (fa4 == null) {
                        mz = this.C;
                        if (mz == null) {
                            mz = MZ.C;
                        }
                    } else {
                        mz = (MZ) fa4.d();
                    }
                    if (!mz.isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof RBi) {
                    R((RBi) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof RBi) {
                    R((RBi) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return RBi.D;
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.B = "";
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                RBi rBiF = f();
                if (rBiF.isInitialized()) {
                    return rBiF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(rBiF);
            }
        }

        public static class QnHx extends com.google.protobuf.F1<RBi> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = RBi.D.c();
                try {
                    cQfC.S(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public RBi(lPt3Fixed.CQf cQf) {
            super(cQf);
            this.C = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.n;
            ykk.c(RBi.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        public final String S() {
            Object obj = this.A;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.A = strS;
            }
            return strS;
        }

        public final MZ T() {
            MZ mz = this.B;
            return mz == null ? MZ.C : mz;
        }

        public final boolean U() {
            return (this.z & 2) != 0;
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == D) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.R(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return D;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RBi)) {
                return super.equals(obj);
            }
            RBi rBi = (RBi) obj;
            int i = this.z;
            if (((i & 1) != 0) != ((rBi.z & 1) != 0)) {
                return false;
            }
            if ((!((i & 1) != 0) || S().equals(rBi.S())) && U() == rBi.U()) {
                return (!U() || T().equals(rBi.T())) && this.y.equals(rBi.y);
            }
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            if ((this.z & 1) != 0) {
                lPt3Fixed.R(codedOutputStream, 1, this.A);
            }
            if ((this.z & 2) != 0) {
                codedOutputStream.G1(2, T());
            }
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.m.hashCode() + 779;
            if ((this.z & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 1, 53) + S().hashCode();
            }
            if (U()) {
                iHashCode = Xs.a(iHashCode, 37, 2, 53) + T().hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.C;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!U() || T().isInitialized()) {
                this.C = (byte) 1;
                return true;
            }
            this.C = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iH = (this.z & 1) != 0 ? 0 + lPt3Fixed.H(1, this.A) : 0;
            if ((this.z & 2) != 0) {
                iH += CodedOutputStream.i1(2, T());
            }
            int iJ = this.y.j() + iH;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return D.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<RBi> p() {
            return E;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return D;
        }

        public RBi() {
            this.C = (byte) -1;
            this.A = "";
        }
    }

    public static final class T23 extends lPt3Fixed.NUlFixed<T23> {
        public static final T23 K = new T23();

        @Deprecated
        public static final QnHx L = new QnHx();
        public int A;
        public int B;
        public boolean C;
        public int D;
        public boolean E;
        public boolean F;
        public boolean G;
        public boolean H;
        public List<LPt9Fixed> I;
        public byte J;

        public static final class CQf extends lPt3Fixed.LPt8Fixed<T23, CQf> {
            public int B;
            public int C;
            public boolean D;
            public int E;
            public boolean F;
            public boolean G;
            public boolean H;
            public boolean I;
            public List<LPt9Fixed> J;

            public CQf() {
                this.C = 0;
                this.E = 0;
                this.J = Collections.emptyList();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.D;
                ykk.c(T23.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
            public final T23 f() {
                T23 t23 = new T23(this);
                int i = this.B;
                int i2 = (i & 1) != 0 ? 1 : 0;
                t23.B = this.C;
                if ((i & 2) != 0) {
                    t23.C = this.D;
                    i2 |= 2;
                }
                if ((i & 4) != 0) {
                    i2 |= 4;
                }
                t23.D = this.E;
                if ((i & 8) != 0) {
                    t23.E = this.F;
                    i2 |= 8;
                }
                if ((i & 16) != 0) {
                    t23.F = this.G;
                    i2 |= 16;
                }
                if ((i & 32) != 0) {
                    t23.G = this.H;
                    i2 |= 32;
                }
                if ((i & 64) != 0) {
                    t23.H = this.I;
                    i2 |= 64;
                }
                if ((i & 128) != 0) {
                    this.J = Collections.unmodifiableList(this.J);
                    this.B &= -129;
                }
                t23.I = this.J;
                t23.A = i2;
                L();
                return t23;
            }

            public final void X(T23 t23) {
                if (t23 == T23.K) {
                    return;
                }
                if ((t23.A & 1) != 0) {
                    F1 f1A = F1.a(t23.B);
                    if (f1A == null) {
                        f1A = F1.STRING;
                    }
                    this.B |= 1;
                    this.C = f1A.w;
                    M();
                }
                if (t23.V()) {
                    boolean z = t23.C;
                    this.B |= 2;
                    this.D = z;
                    M();
                }
                if ((t23.A & 4) != 0) {
                    LPt8Fixed lPt8A = LPt8Fixed.a(t23.D);
                    if (lPt8A == null) {
                        lPt8A = LPt8Fixed.JS_NORMAL;
                    }
                    this.B |= 4;
                    this.E = lPt8A.w;
                    M();
                }
                if ((t23.A & 8) != 0) {
                    boolean z2 = t23.E;
                    this.B |= 8;
                    this.F = z2;
                    M();
                }
                if ((t23.A & 16) != 0) {
                    boolean z3 = t23.F;
                    this.B |= 16;
                    this.G = z3;
                    M();
                }
                if ((t23.A & 32) != 0) {
                    boolean z4 = t23.G;
                    this.B |= 32;
                    this.H = z4;
                    M();
                }
                if ((t23.A & 64) != 0) {
                    boolean z5 = t23.H;
                    this.B |= 64;
                    this.I = z5;
                    M();
                }
                if (!t23.I.isEmpty()) {
                    if (this.J.isEmpty()) {
                        this.J = t23.I;
                        this.B &= -129;
                    } else {
                        if ((this.B & 128) == 0) {
                            this.J = new ArrayList(this.J);
                            this.B |= 128;
                        }
                        this.J.addAll(t23.I);
                    }
                    M();
                }
                T(t23);
                super.B(t23.y);
                M();
            }

            public final void Y(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 8) {
                                    int iJ = nUl.j();
                                    if (F1.a(iJ) == null) {
                                        K(1, iJ);
                                    } else {
                                        this.C = iJ;
                                        this.B |= 1;
                                    }
                                } else if (iZ == 16) {
                                    this.D = nUl.g();
                                    this.B |= 2;
                                } else if (iZ == 24) {
                                    this.H = nUl.g();
                                    this.B |= 32;
                                } else if (iZ == 40) {
                                    this.F = nUl.g();
                                    this.B |= 8;
                                } else if (iZ == 48) {
                                    int iJ2 = nUl.j();
                                    if (LPt8Fixed.a(iJ2) == null) {
                                        K(6, iJ2);
                                    } else {
                                        this.E = iJ2;
                                        this.B |= 4;
                                    }
                                } else if (iZ == 80) {
                                    this.I = nUl.g();
                                    this.B |= 64;
                                } else if (iZ == 120) {
                                    this.G = nUl.g();
                                    this.B |= 16;
                                } else if (iZ == 7994) {
                                    LPt9Fixed lPt9 = (LPt9Fixed) nUl.q(LPt9Fixed.J, vv0Var);
                                    if ((this.B & 128) == 0) {
                                        this.J = new ArrayList(this.J);
                                        this.B |= 128;
                                    }
                                    this.J.add(lPt9);
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return T23.K;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                T23 t23F = f();
                if (t23F.isInitialized()) {
                    return t23F;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(t23F);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.C;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                for (int i = 0; i < this.J.size(); i++) {
                    if (!this.J.get(i).isInitialized()) {
                        return false;
                    }
                }
                return S();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof T23) {
                    X((T23) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof T23) {
                    X((T23) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return T23.K;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                T23 t23F = f();
                if (t23F.isInitialized()) {
                    return t23F;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(t23F);
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.C = 0;
                this.E = 0;
                this.J = Collections.emptyList();
            }
        }

        public enum F1 implements SjP.QnHx {
            STRING(0),
            CORD(1),
            STRING_PIECE(2);

            public final int w;

            static {
                values();
            }

            F1(int i) {
                this.w = i;
            }

            public static F1 a(int i) {
                if (i == 0) {
                    return STRING;
                }
                if (i == 1) {
                    return CORD;
                }
                if (i != 2) {
                    return null;
                }
                return STRING_PIECE;
            }

            @Override // com.google.protobuf.SjP.QnHx
            public final int b() {
                return this.w;
            }
        }

        public enum LPt8Fixed implements SjP.QnHx {
            JS_NORMAL(0),
            JS_STRING(1),
            JS_NUMBER(2);

            public final int w;

            static {
                values();
            }

            LPt8Fixed(int i) {
                this.w = i;
            }

            public static LPt8Fixed a(int i) {
                if (i == 0) {
                    return JS_NORMAL;
                }
                if (i == 1) {
                    return JS_STRING;
                }
                if (i != 2) {
                    return null;
                }
                return JS_NUMBER;
            }

            @Override // com.google.protobuf.SjP.QnHx
            public final int b() {
                return this.w;
            }
        }

        public static class QnHx extends com.google.protobuf.F1<T23> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = T23.K.c();
                try {
                    cQfC.Y(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public T23(lPt3Fixed.LPt8Fixed lPt8) {
            super(lPt8);
            this.J = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.D;
            ykk.c(T23.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        public final boolean V() {
            return (this.A & 2) != 0;
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == K) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.X(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return K;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof T23)) {
                return super.equals(obj);
            }
            T23 t23 = (T23) obj;
            int i = this.A;
            if (((i & 1) != 0) != ((t23.A & 1) != 0)) {
                return false;
            }
            if ((((i & 1) != 0) && this.B != t23.B) || V() != t23.V()) {
                return false;
            }
            if (V() && this.C != t23.C) {
                return false;
            }
            int i2 = this.A;
            boolean z = (i2 & 4) != 0;
            int i3 = t23.A;
            if (z != ((i3 & 4) != 0)) {
                return false;
            }
            if (((i2 & 4) != 0) && this.D != t23.D) {
                return false;
            }
            if (((i2 & 8) != 0) != ((i3 & 8) != 0)) {
                return false;
            }
            if (((i2 & 8) != 0) && this.E != t23.E) {
                return false;
            }
            if (((i2 & 16) != 0) != ((i3 & 16) != 0)) {
                return false;
            }
            if (((i2 & 16) != 0) && this.F != t23.F) {
                return false;
            }
            if (((i2 & 32) != 0) != ((i3 & 32) != 0)) {
                return false;
            }
            if (((i2 & 32) != 0) && this.G != t23.G) {
                return false;
            }
            if (((i2 & 64) != 0) != ((i3 & 64) != 0)) {
                return false;
            }
            return (!((i2 & 64) != 0) || this.H == t23.H) && this.I.equals(t23.I) && this.y.equals(t23.y) && U().equals(t23.U());
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            lPt3Fixed.NUlFixed.QnHx qnHx = new lPt3Fixed.NUlFixed.QnHx(this);
            if ((this.A & 1) != 0) {
                codedOutputStream.E1(1, this.B);
            }
            if ((this.A & 2) != 0) {
                codedOutputStream.w1(2, this.C);
            }
            if ((this.A & 32) != 0) {
                codedOutputStream.w1(3, this.G);
            }
            if ((this.A & 8) != 0) {
                codedOutputStream.w1(5, this.E);
            }
            if ((this.A & 4) != 0) {
                codedOutputStream.E1(6, this.D);
            }
            if ((this.A & 64) != 0) {
                codedOutputStream.w1(10, this.H);
            }
            if ((this.A & 16) != 0) {
                codedOutputStream.w1(15, this.F);
            }
            for (int i = 0; i < this.I.size(); i++) {
                codedOutputStream.G1(999, this.I.get(i));
            }
            qnHx.a(codedOutputStream);
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.C.hashCode() + 779;
            if ((this.A & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 1, 53) + this.B;
            }
            if (V()) {
                iHashCode = Xs.a(iHashCode, 37, 2, 53) + SjP.a(this.C);
            }
            int i2 = this.A;
            if ((i2 & 4) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 6, 53) + this.D;
            }
            if ((i2 & 8) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 5, 53) + SjP.a(this.E);
            }
            if ((this.A & 16) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 15, 53) + SjP.a(this.F);
            }
            if ((this.A & 32) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 3, 53) + SjP.a(this.G);
            }
            if ((this.A & 64) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 10, 53) + SjP.a(this.H);
            }
            if (this.I.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 999, 53) + this.I.hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (com.google.protobuf.QnHx.D(iHashCode, U()) * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed.NUlFixed, com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.J;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.I.size(); i++) {
                if (!this.I.get(i).isInitialized()) {
                    this.J = (byte) 0;
                    return false;
                }
            }
            if (S()) {
                this.J = (byte) 1;
                return true;
            }
            this.J = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iZ0 = (this.A & 1) != 0 ? CodedOutputStream.Z0(1, this.B) + 0 : 0;
            if ((this.A & 2) != 0) {
                iZ0 += CodedOutputStream.V0(2);
            }
            if ((this.A & 32) != 0) {
                iZ0 += CodedOutputStream.V0(3);
            }
            if ((this.A & 8) != 0) {
                iZ0 += CodedOutputStream.V0(5);
            }
            if ((this.A & 4) != 0) {
                iZ0 += CodedOutputStream.Z0(6, this.D);
            }
            if ((this.A & 64) != 0) {
                iZ0 += CodedOutputStream.V0(10);
            }
            if ((this.A & 16) != 0) {
                iZ0 += CodedOutputStream.V0(15);
            }
            for (int i2 = 0; i2 < this.I.size(); i2++) {
                iZ0 += CodedOutputStream.i1(999, this.I.get(i2));
            }
            int iJ = this.y.j() + T() + iZ0;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return K.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<T23> p() {
            return L;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return K;
        }

        public T23() {
            this.J = (byte) -1;
            this.B = 0;
            this.D = 0;
            this.I = Collections.emptyList();
        }
    }

    public static final class Xn1 extends lPt3Fixed.NUlFixed<Xn1> {
        public static final Xn1 E = new Xn1();

        @Deprecated
        public static final QnHx F = new QnHx();
        public int A;
        public boolean B;
        public List<LPt9Fixed> C;
        public byte D;

        public static final class CQf extends lPt3Fixed.LPt8Fixed<Xn1, CQf> {
            public int B;
            public boolean C;
            public List<LPt9Fixed> D;

            public CQf() {
                this.D = Collections.emptyList();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.L;
                ykk.c(Xn1.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
            public final Xn1 f() {
                int i;
                Xn1 xn1 = new Xn1(this);
                int i2 = this.B;
                if ((i2 & 1) != 0) {
                    xn1.B = this.C;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    this.D = Collections.unmodifiableList(this.D);
                    this.B &= -3;
                }
                xn1.C = this.D;
                xn1.A = i;
                L();
                return xn1;
            }

            public final void X(Xn1 xn1) {
                if (xn1 == Xn1.E) {
                    return;
                }
                if ((xn1.A & 1) != 0) {
                    boolean z = xn1.B;
                    this.B |= 1;
                    this.C = z;
                    M();
                }
                if (!xn1.C.isEmpty()) {
                    if (this.D.isEmpty()) {
                        this.D = xn1.C;
                        this.B &= -3;
                    } else {
                        if ((this.B & 2) == 0) {
                            this.D = new ArrayList(this.D);
                            this.B |= 2;
                        }
                        this.D.addAll(xn1.C);
                    }
                    M();
                }
                T(xn1);
                super.B(xn1.y);
                M();
            }

            public final void Y(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 264) {
                                    this.C = nUl.g();
                                    this.B |= 1;
                                } else if (iZ == 7994) {
                                    LPt9Fixed lPt9 = (LPt9Fixed) nUl.q(LPt9Fixed.J, vv0Var);
                                    if ((this.B & 2) == 0) {
                                        this.D = new ArrayList(this.D);
                                        this.B |= 2;
                                    }
                                    this.D.add(lPt9);
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return Xn1.E;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                Xn1 xn1F = f();
                if (xn1F.isInitialized()) {
                    return xn1F;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(xn1F);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.K;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                for (int i = 0; i < this.D.size(); i++) {
                    if (!this.D.get(i).isInitialized()) {
                        return false;
                    }
                }
                return S();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof Xn1) {
                    X((Xn1) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof Xn1) {
                    X((Xn1) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return Xn1.E;
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.D = Collections.emptyList();
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                Xn1 xn1F = f();
                if (xn1F.isInitialized()) {
                    return xn1F;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(xn1F);
            }
        }

        public static class QnHx extends com.google.protobuf.F1<Xn1> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = Xn1.E.c();
                try {
                    cQfC.Y(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public Xn1(lPt3Fixed.LPt8Fixed lPt8) {
            super(lPt8);
            this.D = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.L;
            ykk.c(Xn1.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == E) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.X(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return E;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Xn1)) {
                return super.equals(obj);
            }
            Xn1 xn1 = (Xn1) obj;
            int i = this.A;
            if (((i & 1) != 0) != ((xn1.A & 1) != 0)) {
                return false;
            }
            return (!((i & 1) != 0) || this.B == xn1.B) && this.C.equals(xn1.C) && this.y.equals(xn1.y) && U().equals(xn1.U());
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            lPt3Fixed.NUlFixed.QnHx qnHx = new lPt3Fixed.NUlFixed.QnHx(this);
            if ((this.A & 1) != 0) {
                codedOutputStream.w1(33, this.B);
            }
            for (int i = 0; i < this.C.size(); i++) {
                codedOutputStream.G1(999, this.C.get(i));
            }
            qnHx.a(codedOutputStream);
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.K.hashCode() + 779;
            if ((this.A & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 33, 53) + SjP.a(this.B);
            }
            if (this.C.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 999, 53) + this.C.hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (com.google.protobuf.QnHx.D(iHashCode, U()) * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed.NUlFixed, com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.D;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.C.size(); i++) {
                if (!this.C.get(i).isInitialized()) {
                    this.D = (byte) 0;
                    return false;
                }
            }
            if (S()) {
                this.D = (byte) 1;
                return true;
            }
            this.D = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iV0 = (this.A & 1) != 0 ? CodedOutputStream.V0(33) + 0 : 0;
            for (int i2 = 0; i2 < this.C.size(); i2++) {
                iV0 += CodedOutputStream.i1(999, this.C.get(i2));
            }
            int iJ = this.y.j() + T() + iV0;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return E.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<Xn1> p() {
            return F;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return E;
        }

        public Xn1() {
            this.D = (byte) -1;
            this.C = Collections.emptyList();
        }
    }

    public static final class YKK extends lPt3Fixed.NUlFixed<YKK> {
        public static final YKK C = new YKK();

        @Deprecated
        public static final QnHx D = new QnHx();
        public List<LPt9Fixed> A;
        public byte B;

        public static final class CQf extends lPt3Fixed.LPt8Fixed<YKK, CQf> {
            public int B;
            public List<LPt9Fixed> C;

            public CQf() {
                this.C = Collections.emptyList();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.j;
                ykk.c(YKK.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
            public final YKK f() {
                YKK ykk = new YKK(this);
                if ((this.B & 1) != 0) {
                    this.C = Collections.unmodifiableList(this.C);
                    this.B &= -2;
                }
                ykk.A = this.C;
                L();
                return ykk;
            }

            public final void X(YKK ykk) {
                if (ykk == YKK.C) {
                    return;
                }
                if (!ykk.A.isEmpty()) {
                    if (this.C.isEmpty()) {
                        this.C = ykk.A;
                        this.B &= -2;
                    } else {
                        if ((this.B & 1) == 0) {
                            this.C = new ArrayList(this.C);
                            this.B |= 1;
                        }
                        this.C.addAll(ykk.A);
                    }
                    M();
                }
                T(ykk);
                super.B(ykk.y);
                M();
            }

            public final void Y(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 7994) {
                                    LPt9Fixed lPt9 = (LPt9Fixed) nUl.q(LPt9Fixed.J, vv0Var);
                                    if ((this.B & 1) == 0) {
                                        this.C = new ArrayList(this.C);
                                        this.B |= 1;
                                    }
                                    this.C.add(lPt9);
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return YKK.C;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                YKK ykkF = f();
                if (ykkF.isInitialized()) {
                    return ykkF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(ykkF);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.i;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                for (int i = 0; i < this.C.size(); i++) {
                    if (!this.C.get(i).isInitialized()) {
                        return false;
                    }
                }
                return S();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof YKK) {
                    X((YKK) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof YKK) {
                    X((YKK) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return YKK.C;
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.C = Collections.emptyList();
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                YKK ykkF = f();
                if (ykkF.isInitialized()) {
                    return ykkF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(ykkF);
            }
        }

        public static class QnHx extends com.google.protobuf.F1<YKK> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = YKK.C.c();
                try {
                    cQfC.Y(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public YKK(lPt3Fixed.LPt8Fixed lPt8) {
            super(lPt8);
            this.B = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.j;
            ykk.c(YKK.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == C) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.X(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return C;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof YKK)) {
                return super.equals(obj);
            }
            YKK ykk = (YKK) obj;
            return this.A.equals(ykk.A) && this.y.equals(ykk.y) && U().equals(ykk.U());
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            lPt3Fixed.NUlFixed.QnHx qnHx = new lPt3Fixed.NUlFixed.QnHx(this);
            for (int i = 0; i < this.A.size(); i++) {
                codedOutputStream.G1(999, this.A.get(i));
            }
            qnHx.a(codedOutputStream);
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.i.hashCode() + 779;
            if (this.A.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 999, 53) + this.A.hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (com.google.protobuf.QnHx.D(iHashCode, U()) * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed.NUlFixed, com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.B;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.A.size(); i++) {
                if (!this.A.get(i).isInitialized()) {
                    this.B = (byte) 0;
                    return false;
                }
            }
            if (S()) {
                this.B = (byte) 1;
                return true;
            }
            this.B = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iI1 = 0;
            for (int i2 = 0; i2 < this.A.size(); i2++) {
                iI1 += CodedOutputStream.i1(999, this.A.get(i2));
            }
            int iJ = this.y.j() + T() + iI1;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return C.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<YKK> p() {
            return D;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return C;
        }

        public YKK() {
            this.B = (byte) -1;
            this.A = Collections.emptyList();
        }
    }

    public static final class auxFixed extends lPt3Fixed implements roZB {
        public static final auxFixed M = new auxFixed();

        @Deprecated
        public static final QnHx N = new QnHx();
        public volatile Object A;
        public int B;
        public int C;
        public int D;
        public volatile Object E;
        public volatile Object F;
        public volatile Object G;
        public int H;
        public volatile Object I;
        public T23 J;
        public boolean K;
        public byte L;
        public int z;

        public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
            public int A;
            public Object B;
            public int C;
            public int D;
            public int E;
            public Object F;
            public Object G;
            public Object H;
            public int I;
            public Object J;
            public T23 K;
            public FA4<T23, T23.CQf, Object> L;
            public boolean M;

            public CQf() {
                this.B = "";
                this.D = 1;
                this.E = 1;
                this.F = "";
                this.G = "";
                this.H = "";
                this.J = "";
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.l;
                ykk.c(auxFixed.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final auxFixed f() {
                auxFixed auxVar = new auxFixed(this);
                int i = this.A;
                int i2 = (i & 1) != 0 ? 1 : 0;
                auxVar.A = this.B;
                if ((i & 2) != 0) {
                    auxVar.B = this.C;
                    i2 |= 2;
                }
                if ((i & 4) != 0) {
                    i2 |= 4;
                }
                auxVar.C = this.D;
                if ((i & 8) != 0) {
                    i2 |= 8;
                }
                auxVar.D = this.E;
                if ((i & 16) != 0) {
                    i2 |= 16;
                }
                auxVar.E = this.F;
                if ((i & 32) != 0) {
                    i2 |= 32;
                }
                auxVar.F = this.G;
                if ((i & 64) != 0) {
                    i2 |= 64;
                }
                auxVar.G = this.H;
                if ((i & 128) != 0) {
                    auxVar.H = this.I;
                    i2 |= 128;
                }
                if ((i & 256) != 0) {
                    i2 |= 256;
                }
                auxVar.I = this.J;
                if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                    FA4<T23, T23.CQf, Object> fa4 = this.L;
                    if (fa4 == null) {
                        auxVar.J = this.K;
                    } else {
                        auxVar.J = (T23) fa4.b();
                    }
                    i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
                }
                if ((i & 1024) != 0) {
                    auxVar.K = this.M;
                    i2 |= 1024;
                }
                auxVar.z = i2;
                L();
                return auxVar;
            }

            public final void R(auxFixed auxVar) {
                T23 t23;
                T23 t24;
                if (auxVar == auxFixed.M) {
                    return;
                }
                if ((auxVar.z & 1) != 0) {
                    this.A |= 1;
                    this.B = auxVar.A;
                    M();
                }
                if ((auxVar.z & 2) != 0) {
                    int i = auxVar.B;
                    this.A |= 2;
                    this.C = i;
                    M();
                }
                if ((auxVar.z & 4) != 0) {
                    F1 f1A = F1.a(auxVar.C);
                    if (f1A == null) {
                        f1A = F1.LABEL_OPTIONAL;
                    }
                    this.A |= 4;
                    this.D = f1A.w;
                    M();
                }
                if (auxVar.c0()) {
                    LPt8Fixed lPt8A = LPt8Fixed.a(auxVar.D);
                    if (lPt8A == null) {
                        lPt8A = LPt8Fixed.TYPE_DOUBLE;
                    }
                    this.A |= 8;
                    this.E = lPt8A.w;
                    M();
                }
                if (auxVar.d0()) {
                    this.A |= 16;
                    this.F = auxVar.E;
                    M();
                }
                if (auxVar.Z()) {
                    this.A |= 32;
                    this.G = auxVar.F;
                    M();
                }
                if (auxVar.Y()) {
                    this.A |= 64;
                    this.H = auxVar.G;
                    M();
                }
                if (auxVar.a0()) {
                    int i2 = auxVar.H;
                    this.A |= 128;
                    this.I = i2;
                    M();
                }
                if ((auxVar.z & 256) != 0) {
                    this.A |= 256;
                    this.J = auxVar.I;
                    M();
                }
                if (auxVar.b0()) {
                    T23 t23W = auxVar.W();
                    FA4<T23, T23.CQf, Object> fa4 = this.L;
                    if (fa4 == null) {
                        if ((this.A & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || (t23 = this.K) == null || t23 == (t24 = T23.K)) {
                            this.K = t23W;
                        } else {
                            T23.CQf cQfC = t24.c();
                            cQfC.X(t23);
                            cQfC.X(t23W);
                            this.K = cQfC.f();
                        }
                        M();
                    } else {
                        fa4.e(t23W);
                    }
                    this.A |= AdRequest.MAX_CONTENT_URL_LENGTH;
                }
                if ((auxVar.z & 1024) != 0) {
                    boolean z = auxVar.K;
                    this.A |= 1024;
                    this.M = z;
                    M();
                }
                super.B(auxVar.y);
                M();
            }

            public final void S(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                T23 t23;
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            switch (iZ) {
                                case 0:
                                    break;
                                case 10:
                                    this.B = nUl.h();
                                    this.A |= 1;
                                    continue;
                                case 18:
                                    this.G = nUl.h();
                                    this.A |= 32;
                                    continue;
                                case 24:
                                    this.C = nUl.o();
                                    this.A |= 2;
                                    continue;
                                case 32:
                                    int iJ = nUl.j();
                                    if (F1.a(iJ) == null) {
                                        K(4, iJ);
                                    } else {
                                        this.D = iJ;
                                        this.A |= 4;
                                        continue;
                                    }
                                    break;
                                case 40:
                                    int iJ2 = nUl.j();
                                    if (LPt8Fixed.a(iJ2) == null) {
                                        K(5, iJ2);
                                    } else {
                                        this.E = iJ2;
                                        this.A |= 8;
                                        continue;
                                    }
                                    break;
                                case 50:
                                    this.F = nUl.h();
                                    this.A |= 16;
                                    continue;
                                case 58:
                                    this.H = nUl.h();
                                    this.A |= 64;
                                    continue;
                                case 66:
                                    FA4<T23, T23.CQf, Object> fa4 = this.L;
                                    if (fa4 == null) {
                                        if (fa4 == null) {
                                            t23 = this.K;
                                            if (t23 == null) {
                                                t23 = T23.K;
                                            }
                                        } else {
                                            t23 = (T23) fa4.d();
                                        }
                                        this.L = new FA4<>(t23, H(), this.y);
                                        this.K = null;
                                    }
                                    nUl.r(this.L.c(), vv0Var);
                                    this.A |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    continue;
                                case 72:
                                    this.I = nUl.o();
                                    this.A |= 128;
                                    continue;
                                case 82:
                                    this.J = nUl.h();
                                    this.A |= 256;
                                    continue;
                                case 136:
                                    this.M = nUl.g();
                                    this.A |= 1024;
                                    continue;
                                default:
                                    if (!N(nUl, vv0Var, iZ)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return auxFixed.M;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                auxFixed auxVarF = f();
                if (auxVarF.isInitialized()) {
                    return auxVarF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(auxVarF);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.k;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                T23 t23;
                if ((this.A & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                    FA4<T23, T23.CQf, Object> fa4 = this.L;
                    if (fa4 == null) {
                        t23 = this.K;
                        if (t23 == null) {
                            t23 = T23.K;
                        }
                    } else {
                        t23 = (T23) fa4.d();
                    }
                    if (!t23.isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof auxFixed) {
                    R((auxFixed) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof auxFixed) {
                    R((auxFixed) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return auxFixed.M;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                auxFixed auxVarF = f();
                if (auxVarF.isInitialized()) {
                    return auxVarF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(auxVarF);
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.B = "";
                this.D = 1;
                this.E = 1;
                this.F = "";
                this.G = "";
                this.H = "";
                this.J = "";
            }
        }

        public enum F1 implements SjP.QnHx {
            LABEL_OPTIONAL(1),
            LABEL_REQUIRED(2),
            LABEL_REPEATED(3);

            public final int w;

            static {
                values();
            }

            F1(int i) {
                this.w = i;
            }

            public static F1 a(int i) {
                if (i == 1) {
                    return LABEL_OPTIONAL;
                }
                if (i == 2) {
                    return LABEL_REQUIRED;
                }
                if (i != 3) {
                    return null;
                }
                return LABEL_REPEATED;
            }

            @Override // com.google.protobuf.SjP.QnHx
            public final int b() {
                return this.w;
            }
        }

        public enum LPt8Fixed implements SjP.QnHx {
            TYPE_DOUBLE(1),
            TYPE_FLOAT(2),
            TYPE_INT64(3),
            TYPE_UINT64(4),
            TYPE_INT32(5),
            TYPE_FIXED64(6),
            TYPE_FIXED32(7),
            TYPE_BOOL(8),
            TYPE_STRING(9),
            TYPE_GROUP(10),
            TYPE_MESSAGE(11),
            TYPE_BYTES(12),
            TYPE_UINT32(13),
            TYPE_ENUM(14),
            TYPE_SFIXED32(15),
            TYPE_SFIXED64(16),
            TYPE_SINT32(17),
            TYPE_SINT64(18);

            public final int w;

            static {
                values();
            }

            LPt8Fixed(int i) {
                this.w = i;
            }

            public static LPt8Fixed a(int i) {
                switch (i) {
                    case 1:
                        return TYPE_DOUBLE;
                    case 2:
                        return TYPE_FLOAT;
                    case 3:
                        return TYPE_INT64;
                    case 4:
                        return TYPE_UINT64;
                    case 5:
                        return TYPE_INT32;
                    case 6:
                        return TYPE_FIXED64;
                    case 7:
                        return TYPE_FIXED32;
                    case 8:
                        return TYPE_BOOL;
                    case 9:
                        return TYPE_STRING;
                    case 10:
                        return TYPE_GROUP;
                    case 11:
                        return TYPE_MESSAGE;
                    case 12:
                        return TYPE_BYTES;
                    case 13:
                        return TYPE_UINT32;
                    case 14:
                        return TYPE_ENUM;
                    case 15:
                        return TYPE_SFIXED32;
                    case 16:
                        return TYPE_SFIXED64;
                    case 17:
                        return TYPE_SINT32;
                    case 18:
                        return TYPE_SINT64;
                    default:
                        return null;
                }
            }

            @Override // com.google.protobuf.SjP.QnHx
            public final int b() {
                return this.w;
            }
        }

        public static class QnHx extends com.google.protobuf.F1<auxFixed> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = auxFixed.M.c();
                try {
                    cQfC.S(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public auxFixed(lPt3Fixed.CQf cQf) {
            super(cQf);
            this.L = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.l;
            ykk.c(auxFixed.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        public final String S() {
            Object obj = this.G;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.G = strS;
            }
            return strS;
        }

        public final String T() {
            Object obj = this.F;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.F = strS;
            }
            return strS;
        }

        public final String U() {
            Object obj = this.I;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.I = strS;
            }
            return strS;
        }

        public final String V() {
            Object obj = this.A;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.A = strS;
            }
            return strS;
        }

        public final T23 W() {
            T23 t23 = this.J;
            return t23 == null ? T23.K : t23;
        }

        public final String X() {
            Object obj = this.E;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.E = strS;
            }
            return strS;
        }

        public final boolean Y() {
            return (this.z & 64) != 0;
        }

        public final boolean Z() {
            return (this.z & 32) != 0;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return M;
        }

        public final boolean a0() {
            return (this.z & 128) != 0;
        }

        public final boolean b0() {
            return (this.z & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
        }

        public final boolean c0() {
            return (this.z & 8) != 0;
        }

        public final boolean d0() {
            return (this.z & 16) != 0;
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == M) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.R(this);
            return cQf;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof auxFixed)) {
                return super.equals(obj);
            }
            auxFixed auxVar = (auxFixed) obj;
            int i = this.z;
            if (((i & 1) != 0) != ((auxVar.z & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && !V().equals(auxVar.V())) {
                return false;
            }
            int i2 = this.z;
            boolean z = (i2 & 2) != 0;
            int i3 = auxVar.z;
            if (z != ((i3 & 2) != 0)) {
                return false;
            }
            if (((i2 & 2) != 0) && this.B != auxVar.B) {
                return false;
            }
            if (((i2 & 4) != 0) != ((i3 & 4) != 0)) {
                return false;
            }
            if ((((i2 & 4) != 0) && this.C != auxVar.C) || c0() != auxVar.c0()) {
                return false;
            }
            if ((c0() && this.D != auxVar.D) || d0() != auxVar.d0()) {
                return false;
            }
            if ((d0() && !X().equals(auxVar.X())) || Z() != auxVar.Z()) {
                return false;
            }
            if ((Z() && !T().equals(auxVar.T())) || Y() != auxVar.Y()) {
                return false;
            }
            if ((Y() && !S().equals(auxVar.S())) || a0() != auxVar.a0()) {
                return false;
            }
            if (a0() && this.H != auxVar.H) {
                return false;
            }
            int i4 = this.z;
            if (((i4 & 256) != 0) != ((auxVar.z & 256) != 0)) {
                return false;
            }
            if ((((i4 & 256) != 0) && !U().equals(auxVar.U())) || b0() != auxVar.b0()) {
                return false;
            }
            if (b0() && !W().equals(auxVar.W())) {
                return false;
            }
            int i5 = this.z;
            if (((i5 & 1024) != 0) != ((auxVar.z & 1024) != 0)) {
                return false;
            }
            return (!((i5 & 1024) != 0) || this.K == auxVar.K) && this.y.equals(auxVar.y);
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            if ((this.z & 1) != 0) {
                lPt3Fixed.R(codedOutputStream, 1, this.A);
            }
            if ((this.z & 32) != 0) {
                lPt3Fixed.R(codedOutputStream, 2, this.F);
            }
            if ((this.z & 2) != 0) {
                codedOutputStream.E1(3, this.B);
            }
            if ((this.z & 4) != 0) {
                codedOutputStream.E1(4, this.C);
            }
            if ((this.z & 8) != 0) {
                codedOutputStream.E1(5, this.D);
            }
            if ((this.z & 16) != 0) {
                lPt3Fixed.R(codedOutputStream, 6, this.E);
            }
            if ((this.z & 64) != 0) {
                lPt3Fixed.R(codedOutputStream, 7, this.G);
            }
            if ((this.z & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                codedOutputStream.G1(8, W());
            }
            if ((this.z & 128) != 0) {
                codedOutputStream.E1(9, this.H);
            }
            if ((this.z & 256) != 0) {
                lPt3Fixed.R(codedOutputStream, 10, this.I);
            }
            if ((this.z & 1024) != 0) {
                codedOutputStream.w1(17, this.K);
            }
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.k.hashCode() + 779;
            if ((this.z & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 1, 53) + V().hashCode();
            }
            int i2 = this.z;
            if ((i2 & 2) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 3, 53) + this.B;
            }
            if ((i2 & 4) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 4, 53) + this.C;
            }
            if (c0()) {
                iHashCode = Xs.a(iHashCode, 37, 5, 53) + this.D;
            }
            if (d0()) {
                iHashCode = Xs.a(iHashCode, 37, 6, 53) + X().hashCode();
            }
            if (Z()) {
                iHashCode = Xs.a(iHashCode, 37, 2, 53) + T().hashCode();
            }
            if (Y()) {
                iHashCode = Xs.a(iHashCode, 37, 7, 53) + S().hashCode();
            }
            if (a0()) {
                iHashCode = Xs.a(iHashCode, 37, 9, 53) + this.H;
            }
            if ((this.z & 256) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 10, 53) + U().hashCode();
            }
            if (b0()) {
                iHashCode = Xs.a(iHashCode, 37, 8, 53) + W().hashCode();
            }
            if ((this.z & 1024) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 17, 53) + SjP.a(this.K);
            }
            int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.L;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!b0() || W().isInitialized()) {
                this.L = (byte) 1;
                return true;
            }
            this.L = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iH = (this.z & 1) != 0 ? 0 + lPt3Fixed.H(1, this.A) : 0;
            if ((this.z & 32) != 0) {
                iH += lPt3Fixed.H(2, this.F);
            }
            if ((this.z & 2) != 0) {
                iH += CodedOutputStream.e1(3, this.B);
            }
            if ((this.z & 4) != 0) {
                iH += CodedOutputStream.Z0(4, this.C);
            }
            if ((this.z & 8) != 0) {
                iH += CodedOutputStream.Z0(5, this.D);
            }
            if ((this.z & 16) != 0) {
                iH += lPt3Fixed.H(6, this.E);
            }
            if ((this.z & 64) != 0) {
                iH += lPt3Fixed.H(7, this.G);
            }
            if ((this.z & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                iH += CodedOutputStream.i1(8, W());
            }
            if ((this.z & 128) != 0) {
                iH += CodedOutputStream.e1(9, this.H);
            }
            if ((this.z & 256) != 0) {
                iH += lPt3Fixed.H(10, this.I);
            }
            if ((this.z & 1024) != 0) {
                iH += CodedOutputStream.V0(17);
            }
            int iJ = this.y.j() + iH;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return M.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<auxFixed> p() {
            return N;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return M;
        }

        public auxFixed() {
            this.L = (byte) -1;
            this.A = "";
            this.C = 1;
            this.D = 1;
            this.E = "";
            this.F = "";
            this.G = "";
            this.I = "";
        }
    }

    public static final class byN extends lPt3Fixed implements roZB {
        public static final byN N = new byN();

        @Deprecated
        public static final QnHx O = new QnHx();
        public volatile Object A;
        public volatile Object B;
        public i22 C;
        public SjP.F1 D;
        public SjP.F1 E;
        public List<QnHx> F;
        public List<CQf> G;
        public List<LPt6Fixed> H;
        public List<auxFixed> I;
        public C0092EQ J;
        public ta K;
        public volatile Object L;
        public byte M;
        public int z;

        public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
            public int A;
            public Object B;
            public Object C;
            public i22 D;
            public SjP.F1 E;
            public SjP.F1 F;
            public List<QnHx> G;
            public List<CQf> H;
            public List<LPt6Fixed> I;
            public List<auxFixed> J;
            public C0092EQ K;
            public FA4<C0092EQ, C0092EQ.CQf, Object> L;
            public ta M;
            public FA4<ta, ta.CQf, Object> N;
            public Object O;

            public CQf() {
                this.B = "";
                this.C = "";
                this.D = ct.y;
                ck32 ck32Var = ck32.z;
                this.E = ck32Var;
                this.F = ck32Var;
                this.G = Collections.emptyList();
                this.H = Collections.emptyList();
                this.I = Collections.emptyList();
                this.J = Collections.emptyList();
                this.O = "";
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.b;
                ykk.c(byN.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final byN f() {
                byN byn = new byN(this);
                int i = this.A;
                int i2 = (i & 1) != 0 ? 1 : 0;
                byn.A = this.B;
                if ((i & 2) != 0) {
                    i2 |= 2;
                }
                byn.B = this.C;
                if ((this.A & 4) != 0) {
                    this.D = this.D.t();
                    this.A &= -5;
                }
                byn.C = this.D;
                int i3 = this.A;
                if ((i3 & 8) != 0) {
                    ((com.google.protobuf.LPt8Fixed) this.E).w = false;
                    this.A = i3 & (-9);
                }
                byn.D = this.E;
                int i4 = this.A;
                if ((i4 & 16) != 0) {
                    ((com.google.protobuf.LPt8Fixed) this.F).w = false;
                    this.A = i4 & (-17);
                }
                byn.E = this.F;
                if ((this.A & 32) != 0) {
                    this.G = Collections.unmodifiableList(this.G);
                    this.A &= -33;
                }
                byn.F = this.G;
                if ((this.A & 64) != 0) {
                    this.H = Collections.unmodifiableList(this.H);
                    this.A &= -65;
                }
                byn.G = this.H;
                if ((this.A & 128) != 0) {
                    this.I = Collections.unmodifiableList(this.I);
                    this.A &= -129;
                }
                byn.H = this.I;
                if ((this.A & 256) != 0) {
                    this.J = Collections.unmodifiableList(this.J);
                    this.A &= -257;
                }
                byn.I = this.J;
                if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                    FA4<C0092EQ, C0092EQ.CQf, Object> fa4 = this.L;
                    if (fa4 == null) {
                        byn.J = this.K;
                    } else {
                        byn.J = (C0092EQ) fa4.b();
                    }
                    i2 |= 4;
                }
                if ((i & 1024) != 0) {
                    FA4<ta, ta.CQf, Object> fa5 = this.N;
                    if (fa5 == null) {
                        byn.K = this.M;
                    } else {
                        byn.K = (ta) fa5.b();
                    }
                    i2 |= 8;
                }
                if ((i & 2048) != 0) {
                    i2 |= 16;
                }
                byn.L = this.O;
                byn.z = i2;
                L();
                return byn;
            }

            public final void R() {
                if ((this.A & 32) == 0) {
                    this.G = new ArrayList(this.G);
                    this.A |= 32;
                }
            }

            public final void S() {
                if ((this.A & 8) == 0) {
                    this.E = lPt3Fixed.N(this.E);
                    this.A |= 8;
                }
            }

            public final void T() {
                if ((this.A & 16) == 0) {
                    this.F = lPt3Fixed.N(this.F);
                    this.A |= 16;
                }
            }

            public final void U(byN byn) {
                ta taVar;
                ta taVar2;
                C0092EQ c0092eq;
                C0092EQ c0092eq2;
                if (byn == byN.N) {
                    return;
                }
                if ((byn.z & 1) != 0) {
                    this.A |= 1;
                    this.B = byn.A;
                    M();
                }
                if ((byn.z & 2) != 0) {
                    this.A |= 2;
                    this.C = byn.B;
                    M();
                }
                if (!byn.C.isEmpty()) {
                    if (this.D.isEmpty()) {
                        this.D = byn.C;
                        this.A &= -5;
                    } else {
                        if ((this.A & 4) == 0) {
                            this.D = new ct(this.D);
                            this.A |= 4;
                        }
                        this.D.addAll(byn.C);
                    }
                    M();
                }
                if (!byn.D.isEmpty()) {
                    if (this.E.isEmpty()) {
                        this.E = byn.D;
                        this.A &= -9;
                    } else {
                        S();
                        this.E.addAll(byn.D);
                    }
                    M();
                }
                if (!byn.E.isEmpty()) {
                    if (this.F.isEmpty()) {
                        this.F = byn.E;
                        this.A &= -17;
                    } else {
                        T();
                        this.F.addAll(byn.E);
                    }
                    M();
                }
                if (!byn.F.isEmpty()) {
                    if (this.G.isEmpty()) {
                        this.G = byn.F;
                        this.A &= -33;
                    } else {
                        R();
                        this.G.addAll(byn.F);
                    }
                    M();
                }
                if (!byn.G.isEmpty()) {
                    if (this.H.isEmpty()) {
                        this.H = byn.G;
                        this.A &= -65;
                    } else {
                        if ((this.A & 64) == 0) {
                            this.H = new ArrayList(this.H);
                            this.A |= 64;
                        }
                        this.H.addAll(byn.G);
                    }
                    M();
                }
                if (!byn.H.isEmpty()) {
                    if (this.I.isEmpty()) {
                        this.I = byn.H;
                        this.A &= -129;
                    } else {
                        if ((this.A & 128) == 0) {
                            this.I = new ArrayList(this.I);
                            this.A |= 128;
                        }
                        this.I.addAll(byn.H);
                    }
                    M();
                }
                if (!byn.I.isEmpty()) {
                    if (this.J.isEmpty()) {
                        this.J = byn.I;
                        this.A &= -257;
                    } else {
                        if ((this.A & 256) == 0) {
                            this.J = new ArrayList(this.J);
                            this.A |= 256;
                        }
                        this.J.addAll(byn.I);
                    }
                    M();
                }
                if (byn.X()) {
                    C0092EQ c0092eqT = byn.T();
                    FA4<C0092EQ, C0092EQ.CQf, Object> fa4 = this.L;
                    if (fa4 == null) {
                        if ((this.A & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 || (c0092eq = this.K) == null || c0092eq == (c0092eq2 = C0092EQ.X)) {
                            this.K = c0092eqT;
                        } else {
                            C0092EQ.CQf cQfC = c0092eq2.c();
                            cQfC.X(c0092eq);
                            cQfC.X(c0092eqT);
                            this.K = cQfC.f();
                        }
                        M();
                    } else {
                        fa4.e(c0092eqT);
                    }
                    this.A |= AdRequest.MAX_CONTENT_URL_LENGTH;
                }
                if ((byn.z & 8) != 0) {
                    ta taVarV = byn.V();
                    FA4<ta, ta.CQf, Object> fa5 = this.N;
                    if (fa5 == null) {
                        if ((this.A & 1024) == 0 || (taVar = this.M) == null || taVar == (taVar2 = ta.B)) {
                            this.M = taVarV;
                        } else {
                            ta.CQf cQfC2 = taVar2.c();
                            cQfC2.R(taVar);
                            cQfC2.R(taVarV);
                            this.M = cQfC2.f();
                        }
                        M();
                    } else {
                        fa5.e(taVarV);
                    }
                    this.A |= 1024;
                }
                if ((byn.z & 16) != 0) {
                    this.A |= 2048;
                    this.O = byn.L;
                    M();
                }
                super.B(byn.y);
                M();
            }

            public final void V(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                C0092EQ c0092eq;
                ta taVar;
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            switch (iZ) {
                                case 0:
                                    break;
                                case 10:
                                    this.B = nUl.h();
                                    this.A |= 1;
                                    continue;
                                case 18:
                                    this.C = nUl.h();
                                    this.A |= 2;
                                    continue;
                                case 26:
                                    lk.YKK ykkH = nUl.h();
                                    if ((this.A & 4) == 0) {
                                        this.D = new ct(this.D);
                                        this.A |= 4;
                                    }
                                    this.D.o(ykkH);
                                    continue;
                                case 34:
                                    QnHx qnHx = (QnHx) nUl.q(QnHx.M, vv0Var);
                                    R();
                                    this.G.add(qnHx);
                                    continue;
                                case 42:
                                    CQf cQf = (CQf) nUl.q(CQf.H, vv0Var);
                                    if ((this.A & 64) == 0) {
                                        this.H = new ArrayList(this.H);
                                        this.A |= 64;
                                    }
                                    this.H.add(cQf);
                                    continue;
                                case 50:
                                    LPt6Fixed lPt6 = (LPt6Fixed) nUl.q(LPt6Fixed.F, vv0Var);
                                    if ((this.A & 128) == 0) {
                                        this.I = new ArrayList(this.I);
                                        this.A |= 128;
                                    }
                                    this.I.add(lPt6);
                                    continue;
                                case 58:
                                    auxFixed auxVar = (auxFixed) nUl.q(auxFixed.N, vv0Var);
                                    if ((this.A & 256) == 0) {
                                        this.J = new ArrayList(this.J);
                                        this.A |= 256;
                                    }
                                    this.J.add(auxVar);
                                    continue;
                                case 66:
                                    FA4<C0092EQ, C0092EQ.CQf, Object> fa4 = this.L;
                                    if (fa4 == null) {
                                        if (fa4 == null) {
                                            c0092eq = this.K;
                                            if (c0092eq == null) {
                                                c0092eq = C0092EQ.X;
                                            }
                                        } else {
                                            c0092eq = (C0092EQ) fa4.d();
                                        }
                                        this.L = new FA4<>(c0092eq, H(), this.y);
                                        this.K = null;
                                    }
                                    nUl.r(this.L.c(), vv0Var);
                                    this.A |= AdRequest.MAX_CONTENT_URL_LENGTH;
                                    continue;
                                case 74:
                                    FA4<ta, ta.CQf, Object> fa5 = this.N;
                                    if (fa5 == null) {
                                        if (fa5 == null) {
                                            taVar = this.M;
                                            if (taVar == null) {
                                                taVar = ta.B;
                                            }
                                        } else {
                                            taVar = (ta) fa5.d();
                                        }
                                        this.N = new FA4<>(taVar, H(), this.y);
                                        this.M = null;
                                    }
                                    nUl.r(this.N.c(), vv0Var);
                                    this.A |= 1024;
                                    continue;
                                case 80:
                                    int iO = nUl.o();
                                    S();
                                    ((ck32) this.E).b(iO);
                                    continue;
                                case 82:
                                    int iF = nUl.f(nUl.s());
                                    S();
                                    while (nUl.c() > 0) {
                                        ((ck32) this.E).b(nUl.o());
                                    }
                                    nUl.e(iF);
                                    continue;
                                case 88:
                                    int iO2 = nUl.o();
                                    T();
                                    ((ck32) this.F).b(iO2);
                                    continue;
                                case 90:
                                    int iF2 = nUl.f(nUl.s());
                                    T();
                                    while (nUl.c() > 0) {
                                        ((ck32) this.F).b(nUl.o());
                                    }
                                    nUl.e(iF2);
                                    continue;
                                case 98:
                                    this.O = nUl.h();
                                    this.A |= 2048;
                                    continue;
                                default:
                                    if (!N(nUl, vv0Var, iZ)) {
                                        break;
                                    }
                                    break;
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return byN.N;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                byN bynF = f();
                if (bynF.isInitialized()) {
                    return bynF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(bynF);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.a;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                C0092EQ c0092eq;
                for (int i = 0; i < this.G.size(); i++) {
                    if (!this.G.get(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i2 = 0; i2 < this.H.size(); i2++) {
                    if (!this.H.get(i2).isInitialized()) {
                        return false;
                    }
                }
                for (int i3 = 0; i3 < this.I.size(); i3++) {
                    if (!this.I.get(i3).isInitialized()) {
                        return false;
                    }
                }
                for (int i4 = 0; i4 < this.J.size(); i4++) {
                    if (!this.J.get(i4).isInitialized()) {
                        return false;
                    }
                }
                if ((this.A & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                    FA4<C0092EQ, C0092EQ.CQf, Object> fa4 = this.L;
                    if (fa4 == null) {
                        c0092eq = this.K;
                        if (c0092eq == null) {
                            c0092eq = C0092EQ.X;
                        }
                    } else {
                        c0092eq = (C0092EQ) fa4.d();
                    }
                    if (!c0092eq.isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof byN) {
                    U((byN) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                V(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                V(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof byN) {
                    U((byN) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return byN.N;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                byN bynF = f();
                if (bynF.isInitialized()) {
                    return bynF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(bynF);
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.B = "";
                this.C = "";
                this.D = ct.y;
                ck32 ck32Var = ck32.z;
                this.E = ck32Var;
                this.F = ck32Var;
                this.G = Collections.emptyList();
                this.H = Collections.emptyList();
                this.I = Collections.emptyList();
                this.J = Collections.emptyList();
                this.O = "";
            }
        }

        public static class QnHx extends com.google.protobuf.F1<byN> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = byN.N.c();
                try {
                    cQfC.V(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public byN(lPt3Fixed.CQf cQf) {
            super(cQf);
            this.M = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.b;
            ykk.c(byN.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        public final String S() {
            Object obj = this.A;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.A = strS;
            }
            return strS;
        }

        public final C0092EQ T() {
            C0092EQ c0092eq = this.J;
            return c0092eq == null ? C0092EQ.X : c0092eq;
        }

        public final String U() {
            Object obj = this.B;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.B = strS;
            }
            return strS;
        }

        public final ta V() {
            ta taVar = this.K;
            return taVar == null ? ta.B : taVar;
        }

        public final String W() {
            Object obj = this.L;
            if (obj instanceof String) {
                return (String) obj;
            }
            lk lkVar = (lk) obj;
            String strS = lkVar.s();
            if (lkVar.g()) {
                this.L = strS;
            }
            return strS;
        }

        public final boolean X() {
            return (this.z & 4) != 0;
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == N) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.U(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return N;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof byN)) {
                return super.equals(obj);
            }
            byN byn = (byN) obj;
            int i = this.z;
            if (((i & 1) != 0) != ((byn.z & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && !S().equals(byn.S())) {
                return false;
            }
            int i2 = this.z;
            if (((i2 & 2) != 0) != ((byn.z & 2) != 0)) {
                return false;
            }
            if ((((i2 & 2) != 0) && !U().equals(byn.U())) || !this.C.equals(byn.C) || !this.D.equals(byn.D) || !this.E.equals(byn.E) || !this.F.equals(byn.F) || !this.G.equals(byn.G) || !this.H.equals(byn.H) || !this.I.equals(byn.I) || X() != byn.X()) {
                return false;
            }
            if (X() && !T().equals(byn.T())) {
                return false;
            }
            int i3 = this.z;
            if (((i3 & 8) != 0) != ((byn.z & 8) != 0)) {
                return false;
            }
            if (((i3 & 8) != 0) && !V().equals(byn.V())) {
                return false;
            }
            int i4 = this.z;
            if (((i4 & 16) != 0) != ((byn.z & 16) != 0)) {
                return false;
            }
            return (!((i4 & 16) != 0) || W().equals(byn.W())) && this.y.equals(byn.y);
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            if ((this.z & 1) != 0) {
                lPt3Fixed.R(codedOutputStream, 1, this.A);
            }
            if ((this.z & 2) != 0) {
                lPt3Fixed.R(codedOutputStream, 2, this.B);
            }
            for (int i = 0; i < this.C.size(); i++) {
                lPt3Fixed.R(codedOutputStream, 3, this.C.w(i));
            }
            for (int i2 = 0; i2 < this.F.size(); i2++) {
                codedOutputStream.G1(4, this.F.get(i2));
            }
            for (int i3 = 0; i3 < this.G.size(); i3++) {
                codedOutputStream.G1(5, this.G.get(i3));
            }
            for (int i4 = 0; i4 < this.H.size(); i4++) {
                codedOutputStream.G1(6, this.H.get(i4));
            }
            for (int i5 = 0; i5 < this.I.size(); i5++) {
                codedOutputStream.G1(7, this.I.get(i5));
            }
            if ((this.z & 4) != 0) {
                codedOutputStream.G1(8, T());
            }
            if ((this.z & 8) != 0) {
                codedOutputStream.G1(9, V());
            }
            for (int i6 = 0; i6 < this.D.size(); i6++) {
                codedOutputStream.E1(10, ((ck32) this.D).d(i6));
            }
            for (int i7 = 0; i7 < this.E.size(); i7++) {
                codedOutputStream.E1(11, ((ck32) this.E).d(i7));
            }
            if ((this.z & 16) != 0) {
                lPt3Fixed.R(codedOutputStream, 12, this.L);
            }
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.a.hashCode() + 779;
            if ((this.z & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 1, 53) + S().hashCode();
            }
            if ((this.z & 2) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 2, 53) + U().hashCode();
            }
            if (this.C.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 3, 53) + this.C.hashCode();
            }
            if (this.D.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 10, 53) + this.D.hashCode();
            }
            if (this.E.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 11, 53) + this.E.hashCode();
            }
            if (this.F.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 4, 53) + this.F.hashCode();
            }
            if (this.G.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 5, 53) + this.G.hashCode();
            }
            if (this.H.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 6, 53) + this.H.hashCode();
            }
            if (this.I.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 7, 53) + this.I.hashCode();
            }
            if (X()) {
                iHashCode = Xs.a(iHashCode, 37, 8, 53) + T().hashCode();
            }
            if ((this.z & 8) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 9, 53) + V().hashCode();
            }
            if ((this.z & 16) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 12, 53) + W().hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.M;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.F.size(); i++) {
                if (!this.F.get(i).isInitialized()) {
                    this.M = (byte) 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < this.G.size(); i2++) {
                if (!this.G.get(i2).isInitialized()) {
                    this.M = (byte) 0;
                    return false;
                }
            }
            for (int i3 = 0; i3 < this.H.size(); i3++) {
                if (!this.H.get(i3).isInitialized()) {
                    this.M = (byte) 0;
                    return false;
                }
            }
            for (int i4 = 0; i4 < this.I.size(); i4++) {
                if (!this.I.get(i4).isInitialized()) {
                    this.M = (byte) 0;
                    return false;
                }
            }
            if (!X() || T().isInitialized()) {
                this.M = (byte) 1;
                return true;
            }
            this.M = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iH = (this.z & 1) != 0 ? lPt3Fixed.H(1, this.A) + 0 : 0;
            if ((this.z & 2) != 0) {
                iH += lPt3Fixed.H(2, this.B);
            }
            int I = 0;
            for (int i2 = 0; i2 < this.C.size(); i2++) {
                I += lPt3Fixed.I(this.C.w(i2));
            }
            int size = (this.C.size() * 1) + iH + I;
            for (int i3 = 0; i3 < this.F.size(); i3++) {
                size += CodedOutputStream.i1(4, this.F.get(i3));
            }
            for (int i4 = 0; i4 < this.G.size(); i4++) {
                size += CodedOutputStream.i1(5, this.G.get(i4));
            }
            for (int i5 = 0; i5 < this.H.size(); i5++) {
                size += CodedOutputStream.i1(6, this.H.get(i5));
            }
            for (int i6 = 0; i6 < this.I.size(); i6++) {
                size += CodedOutputStream.i1(7, this.I.get(i6));
            }
            if ((this.z & 4) != 0) {
                size += CodedOutputStream.i1(8, T());
            }
            if ((this.z & 8) != 0) {
                size += CodedOutputStream.i1(9, V());
            }
            int iF1 = 0;
            for (int i7 = 0; i7 < this.D.size(); i7++) {
                iF1 += CodedOutputStream.f1(((ck32) this.D).d(i7));
            }
            int size2 = (this.D.size() * 1) + size + iF1;
            int iF2 = 0;
            for (int i8 = 0; i8 < this.E.size(); i8++) {
                iF2 += CodedOutputStream.f1(((ck32) this.E).d(i8));
            }
            int size3 = (this.E.size() * 1) + size2 + iF2;
            if ((this.z & 16) != 0) {
                size3 += lPt3Fixed.H(12, this.L);
            }
            int iJ = this.y.j() + size3;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return N.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<byN> p() {
            return O;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return N;
        }

        public byN() {
            this.M = (byte) -1;
            this.A = "";
            this.B = "";
            this.C = ct.y;
            ck32 ck32Var = ck32.z;
            this.D = ck32Var;
            this.E = ck32Var;
            this.F = Collections.emptyList();
            this.G = Collections.emptyList();
            this.H = Collections.emptyList();
            this.I = Collections.emptyList();
            this.L = "";
        }
    }

    public static final class ta extends lPt3Fixed implements roZB {
        public static final ta B = new ta();

        @Deprecated
        public static final QnHx C = new QnHx();
        public byte A;
        public List<F1> z;

        public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
            public int A;
            public List<F1> B;

            public CQf() {
                this.B = Collections.emptyList();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.T;
                ykk.c(ta.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
            public final ta f() {
                ta taVar = new ta(this);
                if ((this.A & 1) != 0) {
                    this.B = Collections.unmodifiableList(this.B);
                    this.A &= -2;
                }
                taVar.z = this.B;
                L();
                return taVar;
            }

            public final void R(ta taVar) {
                if (taVar == ta.B) {
                    return;
                }
                if (!taVar.z.isEmpty()) {
                    if (this.B.isEmpty()) {
                        this.B = taVar.z;
                        this.A &= -2;
                    } else {
                        if ((this.A & 1) == 0) {
                            this.B = new ArrayList(this.B);
                            this.A |= 1;
                        }
                        this.B.addAll(taVar.z);
                    }
                    M();
                }
                super.B(taVar.y);
                M();
            }

            public final void S(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 10) {
                                    F1 f1 = (F1) nUl.q(F1.J, vv0Var);
                                    if ((this.A & 1) == 0) {
                                        this.B = new ArrayList(this.B);
                                        this.A |= 1;
                                    }
                                    this.B.add(f1);
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return ta.B;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                super.b(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                ta taVarF = f();
                if (taVarF.isInitialized()) {
                    return taVarF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(taVarF);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.S;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                super.g(nUl, obj);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof ta) {
                    R((ta) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                S(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof ta) {
                    R((ta) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return ta.B;
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.B = Collections.emptyList();
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                ta taVarF = f();
                if (taVarF.isInitialized()) {
                    return taVarF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(taVarF);
            }
        }

        public static final class F1 extends lPt3Fixed implements roZB {
            public static final F1 I = new F1();

            @Deprecated
            public static final QnHx J = new QnHx();
            public SjP.F1 A;
            public int B;
            public SjP.F1 C;
            public int D;
            public volatile Object E;
            public volatile Object F;
            public i22 G;
            public byte H;
            public int z;

            public static final class CQf extends lPt3Fixed.CQf<CQf> implements roZB {
                public int A;
                public SjP.F1 B;
                public SjP.F1 C;
                public Object D;
                public Object E;
                public i22 F;

                public CQf() {
                    ck32 ck32Var = ck32.z;
                    this.B = ck32Var;
                    this.C = ck32Var;
                    this.D = "";
                    this.E = "";
                    this.F = ct.y;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                public final void B(k kVar) {
                    super.B(kVar);
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: E */
                public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                    super.g(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: F */
                public final lPt3Fixed.CQf clone() {
                    return (CQf) super.clone();
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                public final lPt3Fixed.YKK I() {
                    lPt3Fixed.YKK ykk = EQ.V;
                    ykk.c(F1.class, CQf.class);
                    return ykk;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: J */
                public final lPt3Fixed.CQf B(k kVar) {
                    super.B(kVar);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: O */
                public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                    super.b(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf
                /* JADX INFO: renamed from: P */
                public final lPt3Fixed.CQf y(k kVar) {
                    this.z = kVar;
                    M();
                    return this;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
                public final F1 f() {
                    F1 f1 = new F1(this);
                    int i = this.A;
                    if ((i & 1) != 0) {
                        ((com.google.protobuf.LPt8Fixed) this.B).w = false;
                        this.A = i & (-2);
                    }
                    f1.A = this.B;
                    int i2 = this.A;
                    if ((i2 & 2) != 0) {
                        ((com.google.protobuf.LPt8Fixed) this.C).w = false;
                        this.A = i2 & (-3);
                    }
                    f1.C = this.C;
                    int i3 = (i & 4) != 0 ? 1 : 0;
                    f1.E = this.D;
                    if ((i & 8) != 0) {
                        i3 |= 2;
                    }
                    f1.F = this.E;
                    if ((this.A & 16) != 0) {
                        this.F = this.F.t();
                        this.A &= -17;
                    }
                    f1.G = this.F;
                    f1.z = i3;
                    L();
                    return f1;
                }

                public final void R() {
                    if ((this.A & 1) == 0) {
                        this.B = lPt3Fixed.N(this.B);
                        this.A |= 1;
                    }
                }

                public final void S() {
                    if ((this.A & 2) == 0) {
                        this.C = lPt3Fixed.N(this.C);
                        this.A |= 2;
                    }
                }

                public final void T(F1 f1) {
                    if (f1 == F1.I) {
                        return;
                    }
                    if (!f1.A.isEmpty()) {
                        if (this.B.isEmpty()) {
                            this.B = f1.A;
                            this.A &= -2;
                        } else {
                            R();
                            this.B.addAll(f1.A);
                        }
                        M();
                    }
                    if (!f1.C.isEmpty()) {
                        if (this.C.isEmpty()) {
                            this.C = f1.C;
                            this.A &= -3;
                        } else {
                            S();
                            this.C.addAll(f1.C);
                        }
                        M();
                    }
                    if ((f1.z & 1) != 0) {
                        this.A |= 4;
                        this.D = f1.E;
                        M();
                    }
                    if ((f1.z & 2) != 0) {
                        this.A |= 8;
                        this.E = f1.F;
                        M();
                    }
                    if (!f1.G.isEmpty()) {
                        if (this.F.isEmpty()) {
                            this.F = f1.G;
                            this.A &= -17;
                        } else {
                            if ((this.A & 16) == 0) {
                                this.F = new ct(this.F);
                                this.A |= 16;
                            }
                            this.F.addAll(f1.G);
                        }
                        M();
                    }
                    super.B(f1.y);
                    M();
                }

                public final void U(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    vv0Var.getClass();
                    boolean z = false;
                    while (!z) {
                        try {
                            try {
                                int iZ = nUl.z();
                                if (iZ != 0) {
                                    if (iZ == 8) {
                                        int iO = nUl.o();
                                        R();
                                        ((ck32) this.B).b(iO);
                                    } else if (iZ == 10) {
                                        int iF = nUl.f(nUl.s());
                                        R();
                                        while (nUl.c() > 0) {
                                            ((ck32) this.B).b(nUl.o());
                                        }
                                        nUl.e(iF);
                                    } else if (iZ == 16) {
                                        int iO2 = nUl.o();
                                        S();
                                        ((ck32) this.C).b(iO2);
                                    } else if (iZ == 18) {
                                        int iF2 = nUl.f(nUl.s());
                                        S();
                                        while (nUl.c() > 0) {
                                            ((ck32) this.C).b(nUl.o());
                                        }
                                        nUl.e(iF2);
                                    } else if (iZ == 26) {
                                        this.D = nUl.h();
                                        this.A |= 4;
                                    } else if (iZ == 34) {
                                        this.E = nUl.h();
                                        this.A |= 8;
                                    } else if (iZ == 50) {
                                        lk.YKK ykkH = nUl.h();
                                        if ((this.A & 16) == 0) {
                                            this.F = new ct(this.F);
                                            this.A |= 16;
                                        }
                                        this.F.o(ykkH);
                                    } else if (!N(nUl, vv0Var, iZ)) {
                                    }
                                }
                                z = true;
                            } catch (InvalidProtocolBufferException e) {
                                throw e.g();
                            }
                        } catch (Throwable th) {
                            M();
                            throw th;
                        }
                    }
                    M();
                }

                @Override // defpackage.jd2
                public final mw0t a() {
                    return F1.I;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                    super.b(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                public final mw0t build() {
                    F1 f1F = f();
                    if (f1F.isInitialized()) {
                        return f1F;
                    }
                    throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(f1F);
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                public final Object clone() {
                    return (CQf) super.clone();
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
                public final Descriptors.QnHx e() {
                    return EQ.U;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                    super.g(nUl, obj);
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: r */
                public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                    return (CQf) super.clone();
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx s(mw0t mw0tVar) {
                    if (mw0tVar instanceof F1) {
                        T((F1) mw0tVar);
                    } else {
                        super.s(mw0tVar);
                    }
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
                public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    U(nUl, vv0Var);
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: w */
                public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                    U(nUl, vv0Var);
                    return this;
                }

                @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
                /* JADX INFO: renamed from: x */
                public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                    if (mw0tVar instanceof F1) {
                        T((F1) mw0tVar);
                    } else {
                        super.s(mw0tVar);
                    }
                    return this;
                }

                @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
                public final mw0t.QnHx y(k kVar) {
                    this.z = kVar;
                    M();
                    return this;
                }

                @Override // defpackage.jd2
                public final DzVS a() {
                    return F1.I;
                }

                @Override // com.google.protobuf.DzVS.QnHx
                public final DzVS build() {
                    F1 f1F = f();
                    if (f1F.isInitialized()) {
                        return f1F;
                    }
                    throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(f1F);
                }

                public CQf(lPt3Fixed.QnHx qnHx) {
                    super(qnHx);
                    ck32 ck32Var = ck32.z;
                    this.B = ck32Var;
                    this.C = ck32Var;
                    this.D = "";
                    this.E = "";
                    this.F = ct.y;
                }
            }

            public static class QnHx extends com.google.protobuf.F1<F1> {
                @Override // defpackage.oz2
                public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                    CQf cQfC = F1.I.c();
                    try {
                        cQfC.U(nUl, vv0Var);
                        return cQfC.f();
                    } catch (InvalidProtocolBufferException e) {
                        e.w = cQfC.f();
                        throw e;
                    } catch (UninitializedMessageException e2) {
                        InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                        invalidProtocolBufferExceptionA.w = cQfC.f();
                        throw invalidProtocolBufferExceptionA;
                    } catch (IOException e3) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                        invalidProtocolBufferException.w = cQfC.f();
                        throw invalidProtocolBufferException;
                    }
                }
            }

            public F1(lPt3Fixed.CQf cQf) {
                super(cQf);
                this.B = -1;
                this.D = -1;
                this.H = (byte) -1;
            }

            @Override // com.google.protobuf.lPt3Fixed
            public final lPt3Fixed.YKK L() {
                lPt3Fixed.YKK ykk = EQ.V;
                ykk.c(F1.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed
            public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
                return new CQf(qnHx);
            }

            public final String S() {
                Object obj = this.E;
                if (obj instanceof String) {
                    return (String) obj;
                }
                lk lkVar = (lk) obj;
                String strS = lkVar.s();
                if (lkVar.g()) {
                    this.E = strS;
                }
                return strS;
            }

            public final String T() {
                Object obj = this.F;
                if (obj instanceof String) {
                    return (String) obj;
                }
                lk lkVar = (lk) obj;
                String strS = lkVar.s();
                if (lkVar.g()) {
                    this.F = strS;
                }
                return strS;
            }

            @Override // com.google.protobuf.DzVS
            /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
            public final CQf c() {
                if (this == I) {
                    return new CQf();
                }
                CQf cQf = new CQf();
                cQf.T(this);
                return cQf;
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return I;
            }

            @Override // com.google.protobuf.QnHx
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof F1)) {
                    return super.equals(obj);
                }
                F1 f1 = (F1) obj;
                if (!this.A.equals(f1.A) || !this.C.equals(f1.C)) {
                    return false;
                }
                int i = this.z;
                if (((i & 1) != 0) != ((f1.z & 1) != 0)) {
                    return false;
                }
                if (((i & 1) != 0) && !S().equals(f1.S())) {
                    return false;
                }
                int i2 = this.z;
                if (((i2 & 2) != 0) != ((f1.z & 2) != 0)) {
                    return false;
                }
                return (!((i2 & 2) != 0) || T().equals(f1.T())) && this.G.equals(f1.G) && this.y.equals(f1.y);
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
            public final void h(CodedOutputStream codedOutputStream) {
                j();
                if (this.A.size() > 0) {
                    codedOutputStream.P1(10);
                    codedOutputStream.P1(this.B);
                }
                for (int i = 0; i < this.A.size(); i++) {
                    codedOutputStream.F1(((ck32) this.A).d(i));
                }
                if (this.C.size() > 0) {
                    codedOutputStream.P1(18);
                    codedOutputStream.P1(this.D);
                }
                for (int i2 = 0; i2 < this.C.size(); i2++) {
                    codedOutputStream.F1(((ck32) this.C).d(i2));
                }
                if ((this.z & 1) != 0) {
                    lPt3Fixed.R(codedOutputStream, 3, this.E);
                }
                if ((this.z & 2) != 0) {
                    lPt3Fixed.R(codedOutputStream, 4, this.F);
                }
                for (int i3 = 0; i3 < this.G.size(); i3++) {
                    lPt3Fixed.R(codedOutputStream, 6, this.G.w(i3));
                }
                this.y.h(codedOutputStream);
            }

            @Override // com.google.protobuf.QnHx
            public final int hashCode() {
                int i = this.w;
                if (i != 0) {
                    return i;
                }
                int iHashCode = EQ.U.hashCode() + 779;
                if (this.A.size() > 0) {
                    iHashCode = Xs.a(iHashCode, 37, 1, 53) + this.A.hashCode();
                }
                if (this.C.size() > 0) {
                    iHashCode = Xs.a(iHashCode, 37, 2, 53) + this.C.hashCode();
                }
                if ((this.z & 1) != 0) {
                    iHashCode = Xs.a(iHashCode, 37, 3, 53) + S().hashCode();
                }
                if ((this.z & 2) != 0) {
                    iHashCode = Xs.a(iHashCode, 37, 4, 53) + T().hashCode();
                }
                if (this.G.size() > 0) {
                    iHashCode = Xs.a(iHashCode, 37, 6, 53) + this.G.hashCode();
                }
                int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
                this.w = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
            public final boolean isInitialized() {
                byte b = this.H;
                if (b == 1) {
                    return true;
                }
                if (b == 0) {
                    return false;
                }
                this.H = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
            public final int j() {
                int i = this.x;
                if (i != -1) {
                    return i;
                }
                int iF1 = 0;
                for (int i2 = 0; i2 < this.A.size(); i2++) {
                    iF1 += CodedOutputStream.f1(((ck32) this.A).d(i2));
                }
                int iF2 = 0 + iF1;
                if (!this.A.isEmpty()) {
                    iF2 = iF2 + 1 + CodedOutputStream.f1(iF1);
                }
                this.B = iF1;
                int iF3 = 0;
                for (int i3 = 0; i3 < this.C.size(); i3++) {
                    iF3 += CodedOutputStream.f1(((ck32) this.C).d(i3));
                }
                int iH = iF2 + iF3;
                if (!this.C.isEmpty()) {
                    iH = iH + 1 + CodedOutputStream.f1(iF3);
                }
                this.D = iF3;
                if ((this.z & 1) != 0) {
                    iH += lPt3Fixed.H(3, this.E);
                }
                if ((this.z & 2) != 0) {
                    iH += lPt3Fixed.H(4, this.F);
                }
                int I2 = 0;
                for (int i4 = 0; i4 < this.G.size(); i4++) {
                    I2 += lPt3Fixed.I(this.G.w(i4));
                }
                int iJ = this.y.j() + (this.G.size() * 1) + iH + I2;
                this.x = iJ;
                return iJ;
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
            public final k k() {
                return this.y;
            }

            @Override // com.google.protobuf.mw0t
            public final mw0t.QnHx n() {
                return I.c();
            }

            @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
            public final oz2<F1> p() {
                return J;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return I;
            }

            public F1() {
                this.B = -1;
                this.D = -1;
                this.H = (byte) -1;
                ck32 ck32Var = ck32.z;
                this.A = ck32Var;
                this.C = ck32Var;
                this.E = "";
                this.F = "";
                this.G = ct.y;
            }
        }

        public static class QnHx extends com.google.protobuf.F1<ta> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = ta.B.c();
                try {
                    cQfC.S(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public ta(lPt3Fixed.CQf cQf) {
            super(cQf);
            this.A = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.T;
            ykk.c(ta.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == B) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.R(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return B;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ta)) {
                return super.equals(obj);
            }
            ta taVar = (ta) obj;
            return this.z.equals(taVar.z) && this.y.equals(taVar.y);
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            for (int i = 0; i < this.z.size(); i++) {
                codedOutputStream.G1(1, this.z.get(i));
            }
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.S.hashCode() + 779;
            if (this.z.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 1, 53) + this.z.hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (iHashCode * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.A;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            this.A = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iI1 = 0;
            for (int i2 = 0; i2 < this.z.size(); i2++) {
                iI1 += CodedOutputStream.i1(1, this.z.get(i2));
            }
            int iJ = this.y.j() + iI1;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return B.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<ta> p() {
            return C;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return B;
        }

        public ta() {
            this.A = (byte) -1;
            this.z = Collections.emptyList();
        }
    }

    public static final class y extends lPt3Fixed.NUlFixed<y> {
        public static final y F = new y();

        @Deprecated
        public static final QnHx G = new QnHx();
        public int A;
        public boolean B;
        public int C;
        public List<LPt9Fixed> D;
        public byte E;

        public static final class CQf extends lPt3Fixed.LPt8Fixed<y, CQf> {
            public int B;
            public boolean C;
            public int D;
            public List<LPt9Fixed> E;

            public CQf() {
                this.D = 0;
                this.E = Collections.emptyList();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final void B(k kVar) {
                super.B(kVar);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: E */
            public final lPt3Fixed.CQf g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: F */
            public final lPt3Fixed.CQf clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            public final lPt3Fixed.YKK I() {
                lPt3Fixed.YKK ykk = EQ.N;
                ykk.c(y.class, CQf.class);
                return ykk;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: J */
            public final lPt3Fixed.CQf B(k kVar) {
                super.B(kVar);
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: O */
            public final lPt3Fixed.CQf b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf
            /* JADX INFO: renamed from: P */
            public final lPt3Fixed.CQf y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // com.google.protobuf.DzVS.QnHx
            /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
            public final y f() {
                int i;
                y yVar = new y(this);
                int i2 = this.B;
                if ((i2 & 1) != 0) {
                    yVar.B = this.C;
                    i = 1;
                } else {
                    i = 0;
                }
                if ((i2 & 2) != 0) {
                    i |= 2;
                }
                yVar.C = this.D;
                if ((i2 & 4) != 0) {
                    this.E = Collections.unmodifiableList(this.E);
                    this.B &= -5;
                }
                yVar.D = this.E;
                yVar.A = i;
                L();
                return yVar;
            }

            public final void X(y yVar) {
                if (yVar == y.F) {
                    return;
                }
                if ((yVar.A & 1) != 0) {
                    boolean z = yVar.B;
                    this.B |= 1;
                    this.C = z;
                    M();
                }
                if ((yVar.A & 2) != 0) {
                    F1 f1A = F1.a(yVar.C);
                    if (f1A == null) {
                        f1A = F1.IDEMPOTENCY_UNKNOWN;
                    }
                    this.B |= 2;
                    this.D = f1A.w;
                    M();
                }
                if (!yVar.D.isEmpty()) {
                    if (this.E.isEmpty()) {
                        this.E = yVar.D;
                        this.B &= -5;
                    } else {
                        if ((this.B & 4) == 0) {
                            this.E = new ArrayList(this.E);
                            this.B |= 4;
                        }
                        this.E.addAll(yVar.D);
                    }
                    M();
                }
                T(yVar);
                super.B(yVar.y);
                M();
            }

            public final void Y(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                vv0Var.getClass();
                boolean z = false;
                while (!z) {
                    try {
                        try {
                            int iZ = nUl.z();
                            if (iZ != 0) {
                                if (iZ == 264) {
                                    this.C = nUl.g();
                                    this.B |= 1;
                                } else if (iZ == 272) {
                                    int iJ = nUl.j();
                                    if (F1.a(iJ) == null) {
                                        K(34, iJ);
                                    } else {
                                        this.D = iJ;
                                        this.B |= 2;
                                    }
                                } else if (iZ == 7994) {
                                    LPt9Fixed lPt9 = (LPt9Fixed) nUl.q(LPt9Fixed.J, vv0Var);
                                    if ((this.B & 4) == 0) {
                                        this.E = new ArrayList(this.E);
                                        this.B |= 4;
                                    }
                                    this.E.add(lPt9);
                                } else if (!N(nUl, vv0Var, iZ)) {
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e) {
                            throw e.g();
                        }
                    } catch (Throwable th) {
                        M();
                        throw th;
                    }
                }
                M();
            }

            @Override // defpackage.jd2
            public final mw0t a() {
                return y.F;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx b(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.U(nUl, obj);
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final mw0t build() {
                y yVarF = f();
                if (yVarF.isInitialized()) {
                    return yVarF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(yVarF);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            public final Object clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx, com.google.protobuf.roZB
            public final Descriptors.QnHx e() {
                return EQ.M;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx g(Descriptors.NUlFixed nUl, Object obj) {
                return (CQf) super.Q(nUl, obj);
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, defpackage.jd2
            public final boolean isInitialized() {
                for (int i = 0; i < this.E.size(); i++) {
                    if (!this.E.get(i).isInitialized()) {
                        return false;
                    }
                }
                return S();
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: r */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx clone() {
                return (CQf) super.clone();
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof y) {
                    X((y) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx, com.google.protobuf.DzVS.QnHx
            public final /* bridge */ /* synthetic */ DzVS.QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: w */
            public final /* bridge */ /* synthetic */ com.google.protobuf.QnHx.AbstractC0099QnHx v(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) {
                Y(nUl, vv0Var);
                return this;
            }

            @Override // com.google.protobuf.QnHx.AbstractC0099QnHx
            /* JADX INFO: renamed from: x */
            public final com.google.protobuf.QnHx.AbstractC0099QnHx s(mw0t mw0tVar) {
                if (mw0tVar instanceof y) {
                    X((y) mw0tVar);
                } else {
                    super.s(mw0tVar);
                }
                return this;
            }

            @Override // com.google.protobuf.lPt3Fixed.CQf, com.google.protobuf.mw0t.QnHx
            public final mw0t.QnHx y(k kVar) {
                this.z = kVar;
                M();
                return this;
            }

            @Override // defpackage.jd2
            public final DzVS a() {
                return y.F;
            }

            public CQf(lPt3Fixed.QnHx qnHx) {
                super(qnHx);
                this.D = 0;
                this.E = Collections.emptyList();
            }

            @Override // com.google.protobuf.DzVS.QnHx
            public final DzVS build() {
                y yVarF = f();
                if (yVarF.isInitialized()) {
                    return yVarF;
                }
                throw com.google.protobuf.QnHx.AbstractC0099QnHx.C(yVarF);
            }
        }

        public enum F1 implements SjP.QnHx {
            IDEMPOTENCY_UNKNOWN(0),
            NO_SIDE_EFFECTS(1),
            IDEMPOTENT(2);

            public final int w;

            static {
                values();
            }

            F1(int i) {
                this.w = i;
            }

            public static F1 a(int i) {
                if (i == 0) {
                    return IDEMPOTENCY_UNKNOWN;
                }
                if (i == 1) {
                    return NO_SIDE_EFFECTS;
                }
                if (i != 2) {
                    return null;
                }
                return IDEMPOTENT;
            }

            @Override // com.google.protobuf.SjP.QnHx
            public final int b() {
                return this.w;
            }
        }

        public static class QnHx extends com.google.protobuf.F1<y> {
            @Override // defpackage.oz2
            public final Object b(com.google.protobuf.NUlFixed nUl, vv0 vv0Var) throws InvalidProtocolBufferException {
                CQf cQfC = y.F.c();
                try {
                    cQfC.Y(nUl, vv0Var);
                    return cQfC.f();
                } catch (InvalidProtocolBufferException e) {
                    e.w = cQfC.f();
                    throw e;
                } catch (UninitializedMessageException e2) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionA = e2.a();
                    invalidProtocolBufferExceptionA.w = cQfC.f();
                    throw invalidProtocolBufferExceptionA;
                } catch (IOException e3) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e3);
                    invalidProtocolBufferException.w = cQfC.f();
                    throw invalidProtocolBufferException;
                }
            }
        }

        public y(lPt3Fixed.LPt8Fixed lPt8) {
            super(lPt8);
            this.E = (byte) -1;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final lPt3Fixed.YKK L() {
            lPt3Fixed.YKK ykk = EQ.N;
            ykk.c(y.class, CQf.class);
            return ykk;
        }

        @Override // com.google.protobuf.lPt3Fixed
        public final mw0t.QnHx O(lPt3Fixed.QnHx qnHx) {
            return new CQf(qnHx);
        }

        @Override // com.google.protobuf.DzVS
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final CQf c() {
            if (this == F) {
                return new CQf();
            }
            CQf cQf = new CQf();
            cQf.X(this);
            return cQf;
        }

        @Override // defpackage.jd2
        public final mw0t a() {
            return F;
        }

        @Override // com.google.protobuf.QnHx
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof y)) {
                return super.equals(obj);
            }
            y yVar = (y) obj;
            int i = this.A;
            boolean z = (i & 1) != 0;
            int i2 = yVar.A;
            if (z != ((i2 & 1) != 0)) {
                return false;
            }
            if (((i & 1) != 0) && this.B != yVar.B) {
                return false;
            }
            if (((i & 2) != 0) != ((i2 & 2) != 0)) {
                return false;
            }
            return (!((i & 2) != 0) || this.C == yVar.C) && this.D.equals(yVar.D) && this.y.equals(yVar.y) && U().equals(yVar.U());
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final void h(CodedOutputStream codedOutputStream) {
            lPt3Fixed.NUlFixed.QnHx qnHx = new lPt3Fixed.NUlFixed.QnHx(this);
            if ((this.A & 1) != 0) {
                codedOutputStream.w1(33, this.B);
            }
            if ((this.A & 2) != 0) {
                codedOutputStream.E1(34, this.C);
            }
            for (int i = 0; i < this.D.size(); i++) {
                codedOutputStream.G1(999, this.D.get(i));
            }
            qnHx.a(codedOutputStream);
            this.y.h(codedOutputStream);
        }

        @Override // com.google.protobuf.QnHx
        public final int hashCode() {
            int i = this.w;
            if (i != 0) {
                return i;
            }
            int iHashCode = EQ.M.hashCode() + 779;
            if ((this.A & 1) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 33, 53) + SjP.a(this.B);
            }
            if ((this.A & 2) != 0) {
                iHashCode = Xs.a(iHashCode, 37, 34, 53) + this.C;
            }
            if (this.D.size() > 0) {
                iHashCode = Xs.a(iHashCode, 37, 999, 53) + this.D.hashCode();
            }
            int iHashCode2 = this.y.hashCode() + (com.google.protobuf.QnHx.D(iHashCode, U()) * 29);
            this.w = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.lPt3Fixed.NUlFixed, com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, defpackage.jd2
        public final boolean isInitialized() {
            byte b = this.E;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            for (int i = 0; i < this.D.size(); i++) {
                if (!this.D.get(i).isInitialized()) {
                    this.E = (byte) 0;
                    return false;
                }
            }
            if (S()) {
                this.E = (byte) 1;
                return true;
            }
            this.E = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.QnHx, com.google.protobuf.DzVS
        public final int j() {
            int i = this.x;
            if (i != -1) {
                return i;
            }
            int iV0 = (this.A & 1) != 0 ? CodedOutputStream.V0(33) + 0 : 0;
            if ((this.A & 2) != 0) {
                iV0 += CodedOutputStream.Z0(34, this.C);
            }
            for (int i2 = 0; i2 < this.D.size(); i2++) {
                iV0 += CodedOutputStream.i1(999, this.D.get(i2));
            }
            int iJ = this.y.j() + T() + iV0;
            this.x = iJ;
            return iJ;
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.roZB
        public final k k() {
            return this.y;
        }

        @Override // com.google.protobuf.mw0t
        public final mw0t.QnHx n() {
            return F.c();
        }

        @Override // com.google.protobuf.lPt3Fixed, com.google.protobuf.DzVS
        public final oz2<y> p() {
            return G;
        }

        @Override // defpackage.jd2
        public final DzVS a() {
            return F;
        }

        public y() {
            this.E = (byte) -1;
            this.C = 0;
            this.D = Collections.emptyList();
        }
    }

    static {
        Descriptors.YKK ykkN = Descriptors.YKK.n(new String[]{"\n google/protobuf/descriptor.proto\u0012\u000fgoogle.protobuf\"G\n\u0011FileDescriptorSet\u00122\n\u0004file\u0018\u0001 \u0003(\u000b2$.google.protobuf.FileDescriptorProto\"Û\u0003\n\u0013FileDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007package\u0018\u0002 \u0001(\t\u0012\u0012\n\ndependency\u0018\u0003 \u0003(\t\u0012\u0019\n\u0011public_dependency\u0018\n \u0003(\u0005\u0012\u0017\n\u000fweak_dependency\u0018\u000b \u0003(\u0005\u00126\n\fmessage_type\u0018\u0004 \u0003(\u000b2 .google.protobuf.DescriptorProto\u00127\n\tenum_type\u0018\u0005 \u0003(\u000b2$.google.protobuf.EnumDescriptorProto\u00128\n\u0007service\u0018\u0006 \u0003(\u000b2'.google.protobuf.ServiceDescriptorProto\u00128\n\textension\u0018\u0007 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u0012-\n\u0007options\u0018\b \u0001(\u000b2\u001c.google.protobuf.FileOptions\u00129\n\u0010source_code_info\u0018\t \u0001(\u000b2\u001f.google.protobuf.SourceCodeInfo\u0012\u000e\n\u0006syntax\u0018\f \u0001(\t\"©\u0005\n\u000fDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00124\n\u0005field\u0018\u0002 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u00128\n\textension\u0018\u0006 \u0003(\u000b2%.google.protobuf.FieldDescriptorProto\u00125\n\u000bnested_type\u0018\u0003 \u0003(\u000b2 .google.protobuf.DescriptorProto\u00127\n\tenum_type\u0018\u0004 \u0003(\u000b2$.google.protobuf.EnumDescriptorProto\u0012H\n\u000fextension_range\u0018\u0005 \u0003(\u000b2/.google.protobuf.DescriptorProto.ExtensionRange\u00129\n\noneof_decl\u0018\b \u0003(\u000b2%.google.protobuf.OneofDescriptorProto\u00120\n\u0007options\u0018\u0007 \u0001(\u000b2\u001f.google.protobuf.MessageOptions\u0012F\n\u000ereserved_range\u0018\t \u0003(\u000b2..google.protobuf.DescriptorProto.ReservedRange\u0012\u0015\n\rreserved_name\u0018\n \u0003(\t\u001ae\n\u000eExtensionRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0002 \u0001(\u0005\u00127\n\u0007options\u0018\u0003 \u0001(\u000b2&.google.protobuf.ExtensionRangeOptions\u001a+\n\rReservedRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0002 \u0001(\u0005\"g\n\u0015ExtensionRangeOptions\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"Õ\u0005\n\u0014FieldDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006number\u0018\u0003 \u0001(\u0005\u0012:\n\u0005label\u0018\u0004 \u0001(\u000e2+.google.protobuf.FieldDescriptorProto.Label\u00128\n\u0004type\u0018\u0005 \u0001(\u000e2*.google.protobuf.FieldDescriptorProto.Type\u0012\u0011\n\ttype_name\u0018\u0006 \u0001(\t\u0012\u0010\n\bextendee\u0018\u0002 \u0001(\t\u0012\u0015\n\rdefault_value\u0018\u0007 \u0001(\t\u0012\u0013\n\u000boneof_index\u0018\t \u0001(\u0005\u0012\u0011\n\tjson_name\u0018\n \u0001(\t\u0012.\n\u0007options\u0018\b \u0001(\u000b2\u001d.google.protobuf.FieldOptions\u0012\u0017\n\u000fproto3_optional\u0018\u0011 \u0001(\b\"¶\u0002\n\u0004Type\u0012\u000f\n\u000bTYPE_DOUBLE\u0010\u0001\u0012\u000e\n\nTYPE_FLOAT\u0010\u0002\u0012\u000e\n\nTYPE_INT64\u0010\u0003\u0012\u000f\n\u000bTYPE_UINT64\u0010\u0004\u0012\u000e\n\nTYPE_INT32\u0010\u0005\u0012\u0010\n\fTYPE_FIXED64\u0010\u0006\u0012\u0010\n\fTYPE_FIXED32\u0010\u0007\u0012\r\n\tTYPE_BOOL\u0010\b\u0012\u000f\n\u000bTYPE_STRING\u0010\t\u0012\u000e\n\nTYPE_GROUP\u0010\n\u0012\u0010\n\fTYPE_MESSAGE\u0010\u000b\u0012\u000e\n\nTYPE_BYTES\u0010\f\u0012\u000f\n\u000bTYPE_UINT32\u0010\r\u0012\r\n\tTYPE_ENUM\u0010\u000e\u0012\u0011\n\rTYPE_SFIXED32\u0010\u000f\u0012\u0011\n\rTYPE_SFIXED64\u0010\u0010\u0012\u000f\n\u000bTYPE_SINT32\u0010\u0011\u0012\u000f\n\u000bTYPE_SINT64\u0010\u0012\"C\n\u0005Label\u0012\u0012\n\u000eLABEL_OPTIONAL\u0010\u0001\u0012\u0012\n\u000eLABEL_REQUIRED\u0010\u0002\u0012\u0012\n\u000eLABEL_REPEATED\u0010\u0003\"T\n\u0014OneofDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012.\n\u0007options\u0018\u0002 \u0001(\u000b2\u001d.google.protobuf.OneofOptions\"¤\u0002\n\u0013EnumDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00128\n\u0005value\u0018\u0002 \u0003(\u000b2).google.protobuf.EnumValueDescriptorProto\u0012-\n\u0007options\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.EnumOptions\u0012N\n\u000ereserved_range\u0018\u0004 \u0003(\u000b26.google.protobuf.EnumDescriptorProto.EnumReservedRange\u0012\u0015\n\rreserved_name\u0018\u0005 \u0003(\t\u001a/\n\u0011EnumReservedRange\u0012\r\n\u0005start\u0018\u0001 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0002 \u0001(\u0005\"l\n\u0018EnumValueDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006number\u0018\u0002 \u0001(\u0005\u00122\n\u0007options\u0018\u0003 \u0001(\u000b2!.google.protobuf.EnumValueOptions\"\u0090\u0001\n\u0016ServiceDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u00126\n\u0006method\u0018\u0002 \u0003(\u000b2&.google.protobuf.MethodDescriptorProto\u00120\n\u0007options\u0018\u0003 \u0001(\u000b2\u001f.google.protobuf.ServiceOptions\"Á\u0001\n\u0015MethodDescriptorProto\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0012\n\ninput_type\u0018\u0002 \u0001(\t\u0012\u0013\n\u000boutput_type\u0018\u0003 \u0001(\t\u0012/\n\u0007options\u0018\u0004 \u0001(\u000b2\u001e.google.protobuf.MethodOptions\u0012\u001f\n\u0010client_streaming\u0018\u0005 \u0001(\b:\u0005false\u0012\u001f\n\u0010server_streaming\u0018\u0006 \u0001(\b:\u0005false\"¥\u0006\n\u000bFileOptions\u0012\u0014\n\fjava_package\u0018\u0001 \u0001(\t\u0012\u001c\n\u0014java_outer_classname\u0018\b \u0001(\t\u0012\"\n\u0013java_multiple_files\u0018\n \u0001(\b:\u0005false\u0012)\n\u001djava_generate_equals_and_hash\u0018\u0014 \u0001(\bB\u0002\u0018\u0001\u0012%\n\u0016java_string_check_utf8\u0018\u001b \u0001(\b:\u0005false\u0012F\n\foptimize_for\u0018\t \u0001(\u000e2).google.protobuf.FileOptions.OptimizeMode:\u0005SPEED\u0012\u0012\n\ngo_package\u0018\u000b \u0001(\t\u0012\"\n\u0013cc_generic_services\u0018\u0010 \u0001(\b:\u0005false\u0012$\n\u0015java_generic_services\u0018\u0011 \u0001(\b:\u0005false\u0012\"\n\u0013py_generic_services\u0018\u0012 \u0001(\b:\u0005false\u0012#\n\u0014php_generic_services\u0018* \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0017 \u0001(\b:\u0005false\u0012\u001e\n\u0010cc_enable_arenas\u0018\u001f \u0001(\b:\u0004true\u0012\u0019\n\u0011objc_class_prefix\u0018$ \u0001(\t\u0012\u0018\n\u0010csharp_namespace\u0018% \u0001(\t\u0012\u0014\n\fswift_prefix\u0018' \u0001(\t\u0012\u0018\n\u0010php_class_prefix\u0018( \u0001(\t\u0012\u0015\n\rphp_namespace\u0018) \u0001(\t\u0012\u001e\n\u0016php_metadata_namespace\u0018, \u0001(\t\u0012\u0014\n\fruby_package\u0018- \u0001(\t\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption\":\n\fOptimizeMode\u0012\t\n\u0005SPEED\u0010\u0001\u0012\r\n\tCODE_SIZE\u0010\u0002\u0012\u0010\n\fLITE_RUNTIME\u0010\u0003*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b&\u0010'\"\u0084\u0002\n\u000eMessageOptions\u0012&\n\u0017message_set_wire_format\u0018\u0001 \u0001(\b:\u0005false\u0012.\n\u001fno_standard_descriptor_accessor\u0018\u0002 \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012\u0011\n\tmap_entry\u0018\u0007 \u0001(\b\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0004\u0010\u0005J\u0004\b\u0005\u0010\u0006J\u0004\b\u0006\u0010\u0007J\u0004\b\b\u0010\tJ\u0004\b\t\u0010\n\"¾\u0003\n\fFieldOptions\u0012:\n\u0005ctype\u0018\u0001 \u0001(\u000e2#.google.protobuf.FieldOptions.CType:\u0006STRING\u0012\u000e\n\u0006packed\u0018\u0002 \u0001(\b\u0012?\n\u0006jstype\u0018\u0006 \u0001(\u000e2$.google.protobuf.FieldOptions.JSType:\tJS_NORMAL\u0012\u0013\n\u0004lazy\u0018\u0005 \u0001(\b:\u0005false\u0012\u001e\n\u000funverified_lazy\u0018\u000f \u0001(\b:\u0005false\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012\u0013\n\u0004weak\u0018\n \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption\"/\n\u0005CType\u0012\n\n\u0006STRING\u0010\u0000\u0012\b\n\u0004CORD\u0010\u0001\u0012\u0010\n\fSTRING_PIECE\u0010\u0002\"5\n\u0006JSType\u0012\r\n\tJS_NORMAL\u0010\u0000\u0012\r\n\tJS_STRING\u0010\u0001\u0012\r\n\tJS_NUMBER\u0010\u0002*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0004\u0010\u0005\"^\n\fOneofOptions\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u0093\u0001\n\u000bEnumOptions\u0012\u0013\n\u000ballow_alias\u0018\u0002 \u0001(\b\u0012\u0019\n\ndeprecated\u0018\u0003 \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002J\u0004\b\u0005\u0010\u0006\"}\n\u0010EnumValueOptions\u0012\u0019\n\ndeprecated\u0018\u0001 \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"{\n\u000eServiceOptions\u0012\u0019\n\ndeprecated\u0018! \u0001(\b:\u0005false\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u00ad\u0002\n\rMethodOptions\u0012\u0019\n\ndeprecated\u0018! \u0001(\b:\u0005false\u0012_\n\u0011idempotency_level\u0018\" \u0001(\u000e2/.google.protobuf.MethodOptions.IdempotencyLevel:\u0013IDEMPOTENCY_UNKNOWN\u0012C\n\u0014uninterpreted_option\u0018ç\u0007 \u0003(\u000b2$.google.protobuf.UninterpretedOption\"P\n\u0010IdempotencyLevel\u0012\u0017\n\u0013IDEMPOTENCY_UNKNOWN\u0010\u0000\u0012\u0013\n\u000fNO_SIDE_EFFECTS\u0010\u0001\u0012\u000e\n\nIDEMPOTENT\u0010\u0002*\t\bè\u0007\u0010\u0080\u0080\u0080\u0080\u0002\"\u009e\u0002\n\u0013UninterpretedOption\u0012;\n\u0004name\u0018\u0002 \u0003(\u000b2-.google.protobuf.UninterpretedOption.NamePart\u0012\u0018\n\u0010identifier_value\u0018\u0003 \u0001(\t\u0012\u001a\n\u0012positive_int_value\u0018\u0004 \u0001(\u0004\u0012\u001a\n\u0012negative_int_value\u0018\u0005 \u0001(\u0003\u0012\u0014\n\fdouble_value\u0018\u0006 \u0001(\u0001\u0012\u0014\n\fstring_value\u0018\u0007 \u0001(\f\u0012\u0017\n\u000faggregate_value\u0018\b \u0001(\t\u001a3\n\bNamePart\u0012\u0011\n\tname_part\u0018\u0001 \u0002(\t\u0012\u0014\n\fis_extension\u0018\u0002 \u0002(\b\"Õ\u0001\n\u000eSourceCodeInfo\u0012:\n\blocation\u0018\u0001 \u0003(\u000b2(.google.protobuf.SourceCodeInfo.Location\u001a\u0086\u0001\n\bLocation\u0012\u0010\n\u0004path\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0010\n\u0004span\u0018\u0002 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0018\n\u0010leading_comments\u0018\u0003 \u0001(\t\u0012\u0019\n\u0011trailing_comments\u0018\u0004 \u0001(\t\u0012!\n\u0019leading_detached_comments\u0018\u0006 \u0003(\t\"§\u0001\n\u0011GeneratedCodeInfo\u0012A\n\nannotation\u0018\u0001 \u0003(\u000b2-.google.protobuf.GeneratedCodeInfo.Annotation\u001aO\n\nAnnotation\u0012\u0010\n\u0004path\u0018\u0001 \u0003(\u0005B\u0002\u0010\u0001\u0012\u0013\n\u000bsource_file\u0018\u0002 \u0001(\t\u0012\r\n\u0005begin\u0018\u0003 \u0001(\u0005\u0012\u000b\n\u0003end\u0018\u0004 \u0001(\u0005B~\n\u0013com.google.protobufB\u0010DescriptorProtosH\u0001Z-google.golang.org/protobuf/types/descriptorpbø\u0001\u0001¢\u0002\u0003GPBª\u0002\u001aGoogle.Protobuf.Reflection"}, new Descriptors.YKK[0]);
        Descriptors.QnHx qnHx = ykkN.l().get(0);
        lPt3Fixed.YKK.QnHx[] qnHxArr = new lPt3Fixed.YKK.QnHx[qnHx.n().size()];
        lPt3Fixed.YKK.F1[] f1Arr = new lPt3Fixed.YKK.F1[qnHx.p().size()];
        Descriptors.QnHx qnHx2 = ykkN.l().get(1);
        a = qnHx2;
        b = new lPt3Fixed.YKK(qnHx2, new String[]{"Name", "Package", "Dependency", "PublicDependency", "WeakDependency", "MessageType", "EnumType", "Service", "Extension", "Options", "SourceCodeInfo", "Syntax"});
        Descriptors.QnHx qnHx3 = ykkN.l().get(2);
        c = qnHx3;
        d = new lPt3Fixed.YKK(qnHx3, new String[]{"Name", "Field", "Extension", "NestedType", "EnumType", "ExtensionRange", "OneofDecl", "Options", "ReservedRange", "ReservedName"});
        Descriptors.QnHx qnHx4 = qnHx3.o().get(0);
        e = qnHx4;
        f = new lPt3Fixed.YKK(qnHx4, new String[]{"Start", "End", "Options"});
        Descriptors.QnHx qnHx5 = qnHx3.o().get(1);
        g = qnHx5;
        h = new lPt3Fixed.YKK(qnHx5, new String[]{"Start", "End"});
        Descriptors.QnHx qnHx6 = ykkN.l().get(3);
        i = qnHx6;
        j = new lPt3Fixed.YKK(qnHx6, new String[]{"UninterpretedOption"});
        Descriptors.QnHx qnHx7 = ykkN.l().get(4);
        k = qnHx7;
        l = new lPt3Fixed.YKK(qnHx7, new String[]{"Name", "Number", "Label", "Type", "TypeName", "Extendee", "DefaultValue", "OneofIndex", "JsonName", "Options", "Proto3Optional"});
        Descriptors.QnHx qnHx8 = ykkN.l().get(5);
        m = qnHx8;
        n = new lPt3Fixed.YKK(qnHx8, new String[]{"Name", "Options"});
        Descriptors.QnHx qnHx9 = ykkN.l().get(6);
        o = qnHx9;
        p = new lPt3Fixed.YKK(qnHx9, new String[]{"Name", "Value", "Options", "ReservedRange", "ReservedName"});
        Descriptors.QnHx qnHx10 = qnHx9.o().get(0);
        q = qnHx10;
        r = new lPt3Fixed.YKK(qnHx10, new String[]{"Start", "End"});
        Descriptors.QnHx qnHx11 = ykkN.l().get(7);
        s = qnHx11;
        t = new lPt3Fixed.YKK(qnHx11, new String[]{"Name", "Number", "Options"});
        Descriptors.QnHx qnHx12 = ykkN.l().get(8);
        u = qnHx12;
        v = new lPt3Fixed.YKK(qnHx12, new String[]{"Name", "Method", "Options"});
        Descriptors.QnHx qnHx13 = ykkN.l().get(9);
        w = qnHx13;
        x = new lPt3Fixed.YKK(qnHx13, new String[]{"Name", "InputType", "OutputType", "Options", "ClientStreaming", "ServerStreaming"});
        Descriptors.QnHx qnHx14 = ykkN.l().get(10);
        y = qnHx14;
        z = new lPt3Fixed.YKK(qnHx14, new String[]{"JavaPackage", "JavaOuterClassname", "JavaMultipleFiles", "JavaGenerateEqualsAndHash", "JavaStringCheckUtf8", "OptimizeFor", "GoPackage", "CcGenericServices", "JavaGenericServices", "PyGenericServices", "PhpGenericServices", "Deprecated", "CcEnableArenas", "ObjcClassPrefix", "CsharpNamespace", "SwiftPrefix", "PhpClassPrefix", "PhpNamespace", "PhpMetadataNamespace", "RubyPackage", "UninterpretedOption"});
        Descriptors.QnHx qnHx15 = ykkN.l().get(11);
        A = qnHx15;
        B = new lPt3Fixed.YKK(qnHx15, new String[]{"MessageSetWireFormat", "NoStandardDescriptorAccessor", "Deprecated", "MapEntry", "UninterpretedOption"});
        Descriptors.QnHx qnHx16 = ykkN.l().get(12);
        C = qnHx16;
        D = new lPt3Fixed.YKK(qnHx16, new String[]{"Ctype", "Packed", "Jstype", "Lazy", "UnverifiedLazy", "Deprecated", "Weak", "UninterpretedOption"});
        Descriptors.QnHx qnHx17 = ykkN.l().get(13);
        E = qnHx17;
        F = new lPt3Fixed.YKK(qnHx17, new String[]{"UninterpretedOption"});
        Descriptors.QnHx qnHx18 = ykkN.l().get(14);
        G = qnHx18;
        H = new lPt3Fixed.YKK(qnHx18, new String[]{"AllowAlias", "Deprecated", "UninterpretedOption"});
        Descriptors.QnHx qnHx19 = ykkN.l().get(15);
        I = qnHx19;
        J = new lPt3Fixed.YKK(qnHx19, new String[]{"Deprecated", "UninterpretedOption"});
        Descriptors.QnHx qnHx20 = ykkN.l().get(16);
        K = qnHx20;
        L = new lPt3Fixed.YKK(qnHx20, new String[]{"Deprecated", "UninterpretedOption"});
        Descriptors.QnHx qnHx21 = ykkN.l().get(17);
        M = qnHx21;
        N = new lPt3Fixed.YKK(qnHx21, new String[]{"Deprecated", "IdempotencyLevel", "UninterpretedOption"});
        Descriptors.QnHx qnHx22 = ykkN.l().get(18);
        O = qnHx22;
        P = new lPt3Fixed.YKK(qnHx22, new String[]{"Name", "IdentifierValue", "PositiveIntValue", "NegativeIntValue", "DoubleValue", "StringValue", "AggregateValue"});
        Descriptors.QnHx qnHx23 = qnHx22.o().get(0);
        Q = qnHx23;
        R = new lPt3Fixed.YKK(qnHx23, new String[]{"NamePart", "IsExtension"});
        Descriptors.QnHx qnHx24 = ykkN.l().get(19);
        S = qnHx24;
        T = new lPt3Fixed.YKK(qnHx24, new String[]{"Location"});
        Descriptors.QnHx qnHx25 = qnHx24.o().get(0);
        U = qnHx25;
        V = new lPt3Fixed.YKK(qnHx25, new String[]{"Path", "Span", "LeadingComments", "TrailingComments", "LeadingDetachedComments"});
        Descriptors.QnHx qnHx26 = ykkN.l().get(20);
        lPt3Fixed.YKK.QnHx[] qnHxArr2 = new lPt3Fixed.YKK.QnHx[qnHx26.n().size()];
        lPt3Fixed.YKK.F1[] f1Arr2 = new lPt3Fixed.YKK.F1[qnHx26.p().size()];
        Descriptors.QnHx qnHx27 = qnHx26.o().get(0);
        lPt3Fixed.YKK.QnHx[] qnHxArr3 = new lPt3Fixed.YKK.QnHx[qnHx27.n().size()];
        lPt3Fixed.YKK.F1[] f1Arr3 = new lPt3Fixed.YKK.F1[qnHx27.p().size()];
    }
}
