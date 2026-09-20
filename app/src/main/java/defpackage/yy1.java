package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yy1 implements ob2, vl3, xw2, a30, ww2.QnHx {
    public static final F1 p0 = new F1();
    public static final QnHx q0 = QnHx.w;
    public static final CQf r0 = new CQf();
    public static final mg3 s0 = new mg3(LPt8Fixed.w);
    public static final NUlFixed t0 = new NUlFixed();
    public boolean A;
    public yy1 B;
    public ww2 C;
    public int D;
    public int E;
    public final ui2<og2> F;
    public boolean G;
    public final ui2<yy1> H;
    public boolean I;
    public rb2 J;
    public final yr1 K;
    public ij0 L;
    public final byN M;
    public jy1 N;
    public ti5 O;
    public final dz1 P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public final pn1 Y;
    public final cw2 Z;
    public float a0;
    public gz1 b0;
    public kz1 c0;
    public boolean d0;
    public final ug2 e0;
    public ug2 f0;
    public pg2 g0;
    public j81<? super ww2, sd5> h0;
    public j81<? super ww2, sd5> i0;
    public ui2<uy2<kz1, ou2>> j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public final xy1 o0;
    public final boolean w;
    public int x;
    public final ui2<yy1> y;
    public ui2<yy1> z;

    public static final class CQf implements ti5 {
        @Override // defpackage.ti5
        public final long a() {
            return 300L;
        }

        @Override // defpackage.ti5
        public final void b() {
        }

        @Override // defpackage.ti5
        public final long c() {
            return 400L;
        }

        @Override // defpackage.ti5
        public final long d() {
            int i = zm0.d;
            return zm0.b;
        }

        @Override // defpackage.ti5
        public final float e() {
            return 16.0f;
        }
    }

    public static final class EQ extends cx1 implements x81<pg2.CQf, kz1, kz1> {
        public EQ() {
            super(2);
        }

        /* JADX WARN: Code duplicated, block: B:53:0x00c0  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final kz1 invoke(pg2.CQf cQf, kz1 kz1Var) {
            og2 og2Var;
            int i;
            pg2.CQf cQf2 = cQf;
            kz1 kz1Var2 = kz1Var;
            boolean z = cQf2 instanceof wl3;
            yy1 yy1Var = yy1.this;
            if (z) {
                ((wl3) cQf2).u(yy1Var);
            }
            boolean z2 = cQf2 instanceof mo0;
            fz1<?, ?>[] fz1VarArr = kz1Var2.O;
            if (z2) {
                lo0 lo0Var = new lo0(kz1Var2, (mo0) cQf2);
                lo0Var.y = fz1VarArr[0];
                fz1VarArr[0] = lo0Var;
            }
            if (cQf2 instanceof k93) {
                f93 f93Var = new f93(kz1Var2, (k93) cQf2);
                f93Var.y = fz1VarArr[1];
                fz1VarArr[1] = f93Var;
            }
            if (cQf2 instanceof a94) {
                z84 z84Var = new z84(kz1Var2, (a94) cQf2);
                z84Var.y = fz1VarArr[2];
                fz1VarArr[2] = z84Var;
            }
            if (cQf2 instanceof lz2) {
                pk4 pk4Var = new pk4(kz1Var2, cQf2);
                pk4Var.y = fz1VarArr[3];
                fz1VarArr[3] = pk4Var;
            }
            if (cQf2 instanceof ou2) {
                ui2<uy2<kz1, ou2>> ui2Var = yy1Var.j0;
                if (ui2Var == null) {
                    ui2Var = new ui2<>(new uy2[16]);
                    yy1Var.j0 = ui2Var;
                }
                ui2Var.b(new uy2(kz1Var2, cQf2));
            }
            kz1 kz1Var3 = kz1Var2;
            if (cQf2 instanceof uy1) {
                uy1 uy1Var = (uy1) cQf2;
                ui2<og2> ui2Var2 = yy1Var.F;
                if (ui2Var2.j()) {
                    og2Var = null;
                } else {
                    int i2 = ui2Var2.y;
                    int i3 = -1;
                    if (i2 <= 0) {
                        i = -1;
                        break;
                    }
                    i = i2 - 1;
                    og2[] og2VarArr = ui2Var2.w;
                    while (true) {
                        og2 og2Var2 = og2VarArr[i];
                        if (og2Var2.Z && og2Var2.Y == uy1Var) {
                            break;
                        }
                        i--;
                        if (i < 0) {
                            i = -1;
                            break;
                        }
                    }
                    if (i < 0) {
                        int i4 = ui2Var2.y;
                        if (i4 > 0) {
                            int i5 = i4 - 1;
                            og2[] og2VarArr2 = ui2Var2.w;
                            do {
                                if (!og2VarArr2[i5].Z) {
                                    i3 = i5;
                                    break;
                                }
                                i5--;
                            } while (i5 >= 0);
                        }
                        i = i3;
                    }
                    if (i < 0) {
                        og2Var = null;
                    } else {
                        og2Var = ui2Var2.n(i);
                        og2Var.Y = uy1Var;
                        og2Var.X = kz1Var2;
                    }
                }
                if (og2Var == null) {
                    og2Var = new og2(kz1Var2, uy1Var);
                }
                og2 og2Var3 = og2Var;
                og2Var3.g1();
                kz1Var3 = og2Var3;
            }
            boolean z3 = cQf2 instanceof qu2;
            fz1<?, ?>[] fz1VarArr2 = kz1Var3.O;
            if (z3) {
                pk4 pk4Var2 = new pk4(kz1Var3, cQf2);
                pk4Var2.y = fz1VarArr2[4];
                fz1VarArr2[4] = pk4Var2;
            }
            if (cQf2 instanceof vu2) {
                pk4 pk4Var3 = new pk4(kz1Var3, cQf2);
                pk4Var3.y = fz1VarArr2[5];
                fz1VarArr2[5] = pk4Var3;
            }
            return kz1Var3;
        }
    }

    public static final class F1 extends YKK {
        public F1() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // defpackage.rb2
        public final sb2 a(vb2 vb2Var, List list, long j) {
            throw new IllegalStateException("Undefined measure and it is required".toString());
        }
    }

    public static final class LPt8Fixed extends cx1 implements h81 {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(0);
        }

        @Override // defpackage.h81
        public final Object invoke() {
            throw new IllegalStateException("default value for sentinel shouldn't be read".toString());
        }
    }

    public static final class NUlFixed implements tg2 {
        @Override // defpackage.pg2
        public final /* synthetic */ boolean B(f30.F1 f1) {
            return dj.a(this, f1);
        }

        @Override // defpackage.tg2
        public final mg3 getKey() {
            return yy1.s0;
        }

        @Override // defpackage.tg2
        public final Object getValue() {
            throw new IllegalStateException("Sentinel ModifierLocal shouldn't be read".toString());
        }

        @Override // defpackage.pg2
        public final Object m0(Object obj, x81 x81Var) {
            return x81Var.invoke(obj, this);
        }

        @Override // defpackage.pg2
        public final /* synthetic */ pg2 y(pg2 pg2Var) {
            return hj0.b(this, pg2Var);
        }

        @Override // defpackage.pg2
        public final Object z(Object obj, x81 x81Var) {
            return x81Var.invoke(this, obj);
        }
    }

    public static final class QnHx extends cx1 implements h81<yy1> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final yy1 invoke() {
            return new yy1(false);
        }
    }

    public static final class T23 extends cx1 implements h81<sd5> {
        public T23() {
            super(0);
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            yy1 yy1Var = yy1.this;
            int i = 0;
            yy1Var.T = 0;
            ui2<yy1> ui2VarV = yy1Var.v();
            int i2 = ui2VarV.y;
            if (i2 > 0) {
                yy1[] yy1VarArr = ui2VarV.w;
                int i3 = 0;
                do {
                    yy1 yy1Var2 = yy1VarArr[i3];
                    yy1Var2.S = yy1Var2.R;
                    yy1Var2.R = Integer.MAX_VALUE;
                    yy1Var2.P.d = false;
                    if (yy1Var2.U == 2) {
                        yy1Var2.U = 3;
                    }
                    i3++;
                } while (i3 < i2);
            }
            yy1Var.Y.J0().a();
            ui2<yy1> ui2VarV2 = yy1Var.v();
            int i4 = ui2VarV2.y;
            if (i4 > 0) {
                yy1[] yy1VarArr2 = ui2VarV2.w;
                do {
                    yy1 yy1Var3 = yy1VarArr2[i];
                    if (yy1Var3.S != yy1Var3.R) {
                        yy1Var.L();
                        yy1Var.A();
                        if (yy1Var3.R == Integer.MAX_VALUE) {
                            yy1Var3.H();
                        }
                    }
                    dz1 dz1Var = yy1Var3.P;
                    dz1Var.e = dz1Var.d;
                    i++;
                } while (i < i4);
            }
            return sd5.a;
        }
    }

    public static abstract class YKK implements rb2 {
        public final String a;

        public YKK(String str) {
            this.a = str;
        }

        @Override // defpackage.rb2
        public final int b(byN byn, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.rb2
        public final int c(byN byn, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.rb2
        public final int d(byN byn, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }

        @Override // defpackage.rb2
        public final int e(byN byn, List list, int i) {
            throw new IllegalStateException(this.a.toString());
        }
    }

    public /* synthetic */ class auxFixed {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[O.j(3).length];
            iArr[2] = 1;
            a = iArr;
        }
    }

    public static final class byN implements vb2, ij0 {
        public byN() {
        }

        @Override // defpackage.vb2
        public final sb2 K(int i, int i2, Map map, j81 j81Var) {
            return new ub2(i, i2, this, map, j81Var);
        }

        @Override // defpackage.ij0
        public final float Q(float f) {
            return f / getDensity();
        }

        @Override // defpackage.ij0
        public final float U() {
            return yy1.this.L.U();
        }

        @Override // defpackage.ij0
        public final float b0(float f) {
            return getDensity() * f;
        }

        @Override // defpackage.ij0
        public final float getDensity() {
            return yy1.this.L.getDensity();
        }

        @Override // defpackage.rr1
        public final jy1 getLayoutDirection() {
            return yy1.this.N;
        }

        @Override // defpackage.ij0
        public final float j(int i) {
            return i / getDensity();
        }

        @Override // defpackage.ij0
        public final /* synthetic */ int p0(float f) {
            return hj0.a(f, this);
        }

        @Override // defpackage.ij0
        public final /* synthetic */ long v(long j) {
            return hj0.c(j, this);
        }

        @Override // defpackage.ij0
        public final /* synthetic */ long v0(long j) {
            return hj0.e(j, this);
        }

        @Override // defpackage.ij0
        public final /* synthetic */ float x0(long j) {
            return hj0.d(j, this);
        }
    }

    public yy1() {
        this(false);
    }

    public static final void i(yy1 yy1Var, rg2 rg2Var, ug2 ug2Var, ui2 ui2Var) {
        int i;
        sg2 sg2Var;
        yy1Var.getClass();
        int i2 = ui2Var.y;
        if (i2 <= 0) {
            i = -1;
            break;
        }
        Object[] objArr = ui2Var.w;
        i = 0;
        while (true) {
            if (((sg2) objArr[i]).x == rg2Var) {
                break;
            }
            i++;
            if (i >= i2) {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            sg2Var = new sg2(ug2Var, rg2Var);
        } else {
            sg2Var = (sg2) ui2Var.n(i);
            sg2Var.w = ug2Var;
        }
        ug2Var.B.b(sg2Var);
    }

    public static final ug2 j(yy1 yy1Var, tg2 tg2Var, ug2 ug2Var) {
        yy1Var.getClass();
        ug2 ug2Var2 = ug2Var.y;
        while (ug2Var2 != null && ug2Var2.x != tg2Var) {
            ug2Var2 = ug2Var2.y;
        }
        if (ug2Var2 == null) {
            ug2Var2 = new ug2(yy1Var, tg2Var);
        } else {
            ug2 ug2Var3 = ug2Var2.z;
            if (ug2Var3 != null) {
                ug2Var3.y = ug2Var2.y;
            }
            ug2 ug2Var4 = ug2Var2.y;
            if (ug2Var4 != null) {
                ug2Var4.z = ug2Var3;
            }
        }
        ug2Var2.y = ug2Var.y;
        ug2 ug2Var5 = ug2Var.y;
        if (ug2Var5 != null) {
            ug2Var5.z = ug2Var2;
        }
        ug2Var.y = ug2Var2;
        ug2Var2.z = ug2Var;
        return ug2Var2;
    }

    public final void A() {
        if (this.d0) {
            kz1 kz1Var = this.Z.B.B;
            this.c0 = null;
            kz1 kz1Var2 = this.Y;
            while (!ur1.a(kz1Var2, kz1Var)) {
                if ((kz1Var2 != null ? kz1Var2.R : null) != null) {
                    this.c0 = kz1Var2;
                    break;
                }
                kz1Var2 = kz1Var2 != null ? kz1Var2.B : null;
            }
        }
        kz1 kz1Var3 = this.c0;
        if (kz1Var3 != null && kz1Var3.R == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (kz1Var3 != null) {
            kz1Var3.S0();
            return;
        }
        yy1 yy1VarS = s();
        if (yy1VarS != null) {
            yy1VarS.A();
        }
    }

    @Override // defpackage.zq1
    public final Object B() {
        return this.Z.I;
    }

    public final void C() {
        pn1 pn1Var;
        kz1 kz1Var = this.Z.B;
        while (true) {
            pn1Var = this.Y;
            if (ur1.a(kz1Var, pn1Var)) {
                break;
            }
            og2 og2Var = (og2) kz1Var;
            uw2 uw2Var = og2Var.R;
            if (uw2Var != null) {
                uw2Var.invalidate();
            }
            kz1Var = og2Var.X;
        }
        uw2 uw2Var2 = pn1Var.R;
        if (uw2Var2 != null) {
            uw2Var2.invalidate();
        }
    }

    public final void D() {
        yy1 yy1VarS;
        if (this.x > 0) {
            this.A = true;
        }
        if (!this.w || (yy1VarS = s()) == null) {
            return;
        }
        yy1VarS.A = true;
    }

    public final boolean E() {
        return this.C != null;
    }

    public final void F() {
        pn1 pn1Var;
        ui2<yy1> ui2VarV;
        int i;
        boolean zA0;
        dz1 dz1Var = this.P;
        dz1Var.c();
        if (this.n0 && (i = (ui2VarV = v()).y) > 0) {
            yy1[] yy1VarArr = ui2VarV.w;
            int i2 = 0;
            do {
                yy1 yy1Var = yy1VarArr[i2];
                if (yy1Var.m0 && yy1Var.U == 1) {
                    cw2 cw2Var = yy1Var.Z;
                    g70 g70Var = cw2Var.C ? new g70(cw2Var.z) : null;
                    if (g70Var != null) {
                        if (yy1Var.V == 3) {
                            yy1Var.l();
                        }
                        zA0 = cw2Var.A0(g70Var.a);
                    } else {
                        zA0 = false;
                    }
                    if (zA0) {
                        P(false);
                    }
                }
                i2++;
            } while (i2 < i);
        }
        if (this.n0) {
            this.n0 = false;
            this.E = 2;
            cx2 snapshotObserver = Cz.B(this).getSnapshotObserver();
            snapshotObserver.a(this, snapshotObserver.c, new T23());
            this.E = 3;
        }
        if (dz1Var.d) {
            dz1Var.e = true;
        }
        if (dz1Var.b) {
            dz1Var.c();
            if (dz1Var.h != null) {
                HashMap map = dz1Var.i;
                map.clear();
                yy1 yy1Var2 = dz1Var.a;
                ui2<yy1> ui2VarV2 = yy1Var2.v();
                int i3 = ui2VarV2.y;
                pn1 pn1Var2 = yy1Var2.Y;
                if (i3 > 0) {
                    yy1[] yy1VarArr2 = ui2VarV2.w;
                    int i4 = 0;
                    do {
                        yy1 yy1Var3 = yy1VarArr2[i4];
                        if (yy1Var3.Q) {
                            dz1 dz1Var2 = yy1Var3.P;
                            if (dz1Var2.b) {
                                yy1Var3.F();
                            }
                            Iterator it = dz1Var2.i.entrySet().iterator();
                            while (true) {
                                boolean zHasNext = it.hasNext();
                                pn1Var = yy1Var3.Y;
                                if (!zHasNext) {
                                    break;
                                }
                                Map.Entry entry = (Map.Entry) it.next();
                                dz1.b(dz1Var, (IlK) entry.getKey(), ((Number) entry.getValue()).intValue(), pn1Var);
                            }
                            for (kz1 kz1Var = pn1Var.B; !ur1.a(kz1Var, pn1Var2); kz1Var = kz1Var.B) {
                                for (IlK ilK : kz1Var.J0().c().keySet()) {
                                    dz1.b(dz1Var, ilK, kz1Var.J(ilK), kz1Var);
                                }
                            }
                        }
                        i4++;
                    } while (i4 < i3);
                }
                map.putAll(pn1Var2.J0().c());
                dz1Var.b = false;
            }
        }
    }

    public final void G() {
        this.Q = true;
        this.Y.getClass();
        for (kz1 kz1VarN0 = this.Z.B; !ur1.a(kz1VarN0, null) && kz1VarN0 != null; kz1VarN0 = kz1VarN0.N0()) {
            if (kz1VarN0.Q) {
                kz1VarN0.S0();
            }
        }
        ui2<yy1> ui2VarV = v();
        int i = ui2VarV.y;
        if (i > 0) {
            yy1[] yy1VarArr = ui2VarV.w;
            int i2 = 0;
            do {
                yy1 yy1Var = yy1VarArr[i2];
                if (yy1Var.R != Integer.MAX_VALUE) {
                    yy1Var.G();
                    if (auxFixed.a[O.h(yy1Var.E)] != 1) {
                        throw new IllegalStateException("Unexpected state ".concat(IGp3.b(yy1Var.E)));
                    }
                    if (yy1Var.m0) {
                        yy1Var.P(true);
                    } else if (yy1Var.n0) {
                        yy1Var.O(true);
                    }
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void H() {
        if (this.Q) {
            int i = 0;
            this.Q = false;
            ui2<yy1> ui2VarV = v();
            int i2 = ui2VarV.y;
            if (i2 > 0) {
                yy1[] yy1VarArr = ui2VarV.w;
                do {
                    yy1VarArr[i].H();
                    i++;
                } while (i < i2);
            }
        }
    }

    public final void I(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            ui2<yy1> ui2Var = this.y;
            ui2Var.a(i6, ui2Var.n(i5));
        }
        L();
        D();
        P(false);
    }

    public final void J() {
        dz1 dz1Var = this.P;
        if (dz1Var.b) {
            return;
        }
        dz1Var.b = true;
        yy1 yy1VarS = s();
        if (yy1VarS == null) {
            return;
        }
        if (dz1Var.c) {
            yy1VarS.P(false);
        } else if (dz1Var.e) {
            yy1VarS.O(false);
        }
        if (dz1Var.f) {
            P(false);
        }
        if (dz1Var.g) {
            yy1VarS.O(false);
        }
        yy1VarS.J();
    }

    public final void K(yy1 yy1Var) {
        if (this.C != null) {
            yy1Var.o();
        }
        yy1Var.B = null;
        yy1Var.Z.B.B = null;
        if (yy1Var.w) {
            this.x--;
            ui2<yy1> ui2Var = yy1Var.y;
            int i = ui2Var.y;
            if (i > 0) {
                yy1[] yy1VarArr = ui2Var.w;
                int i2 = 0;
                do {
                    yy1VarArr[i2].Z.B.B = null;
                    i2++;
                } while (i2 < i);
            }
        }
        D();
        L();
    }

    public final void L() {
        if (!this.w) {
            this.I = true;
            return;
        }
        yy1 yy1VarS = s();
        if (yy1VarS != null) {
            yy1VarS.L();
        }
    }

    public final void M(int i, int i2) {
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(ex0.b("count (", i2, ") must be greater than 0").toString());
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            K(this.y.n(i3));
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void N() {
        if (this.V == 3) {
            m();
        }
        try {
            this.l0 = true;
            cw2 cw2Var = this.Z;
            if (!cw2Var.D) {
                throw new IllegalStateException("Check failed.".toString());
            }
            cw2Var.m0(cw2Var.F, cw2Var.H, cw2Var.G);
            this.l0 = false;
        } catch (Throwable th) {
            this.l0 = false;
            throw th;
        }
    }

    public final void O(boolean z) {
        ww2 ww2Var;
        if (this.w || (ww2Var = this.C) == null) {
            return;
        }
        ww2Var.r(this, z);
    }

    public final void P(boolean z) {
        ww2 ww2Var;
        yy1 yy1VarS;
        if (this.G || this.w || (ww2Var = this.C) == null) {
            return;
        }
        ww2Var.k(this, z);
        yy1 yy1Var = this.Z.A;
        yy1 yy1VarS2 = yy1Var.s();
        int i = yy1Var.V;
        if (yy1VarS2 == null || i == 3) {
            return;
        }
        while (yy1VarS2.V == i && (yy1VarS = yy1VarS2.s()) != null) {
            yy1VarS2 = yy1VarS;
        }
        int iH = O.h(i);
        if (iH == 0) {
            yy1VarS2.P(z);
        } else {
            if (iH != 1) {
                throw new IllegalStateException("Intrinsics isn't used by the parent".toString());
            }
            yy1VarS2.O(z);
        }
    }

    public final void Q() {
        ui2<yy1> ui2VarV = v();
        int i = ui2VarV.y;
        if (i > 0) {
            yy1[] yy1VarArr = ui2VarV.w;
            int i2 = 0;
            do {
                yy1 yy1Var = yy1VarArr[i2];
                int i3 = yy1Var.W;
                yy1Var.V = i3;
                if (i3 != 3) {
                    yy1Var.Q();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final boolean R() {
        this.Y.getClass();
        for (kz1 kz1VarN0 = this.Z.B; !ur1.a(kz1VarN0, null) && kz1VarN0 != null; kz1VarN0 = kz1VarN0.N0()) {
            if (kz1VarN0.R != null) {
                return false;
            }
            if (ym.d(kz1VarN0.O, 0)) {
                return true;
            }
        }
        return true;
    }

    @Override // defpackage.zq1
    public final int W(int i) {
        return this.Z.W(i);
    }

    @Override // ww2.QnHx
    public final void a() {
        pn1 pn1Var = this.Y;
        for (fz1 fz1Var = pn1Var.O[4]; fz1Var != null; fz1Var = fz1Var.y) {
            ((qu2) ((pk4) fz1Var).x).l(pn1Var);
        }
    }

    @Override // defpackage.a30
    public final void b(rb2 rb2Var) {
        if (ur1.a(this.J, rb2Var)) {
            return;
        }
        this.J = rb2Var;
        yr1 yr1Var = this.K;
        ri2<rb2> ri2Var = yr1Var.b;
        if (ri2Var != null) {
            ri2Var.setValue(rb2Var);
        } else {
            yr1Var.c = rb2Var;
        }
        P(false);
    }

    @Override // defpackage.zq1
    public final int c(int i) {
        return this.Z.c(i);
    }

    @Override // defpackage.vl3
    public final void d() {
        P(false);
        cw2 cw2Var = this.Z;
        g70 g70Var = cw2Var.C ? new g70(cw2Var.z) : null;
        if (g70Var != null) {
            ww2 ww2Var = this.C;
            if (ww2Var != null) {
                ww2Var.c(this, g70Var.a);
                return;
            }
            return;
        }
        ww2 ww2Var2 = this.C;
        if (ww2Var2 != null) {
            int i = vw2.a;
            ww2Var2.a(true);
        }
    }

    @Override // defpackage.a30
    public final void e(ij0 ij0Var) {
        if (ur1.a(this.L, ij0Var)) {
            return;
        }
        this.L = ij0Var;
        P(false);
        yy1 yy1VarS = s();
        if (yy1VarS != null) {
            yy1VarS.A();
        }
        C();
    }

    @Override // defpackage.a30
    public final void f(jy1 jy1Var) {
        if (this.N != jy1Var) {
            this.N = jy1Var;
            P(false);
            yy1 yy1VarS = s();
            if (yy1VarS != null) {
                yy1VarS.A();
            }
            C();
        }
    }

    @Override // defpackage.a30
    public final void g(pg2 pg2Var) {
        pn1 pn1Var;
        ui2<og2> ui2Var;
        yy1 yy1VarS;
        yy1 yy1VarS2;
        ww2 ww2Var;
        ug2 ug2Var;
        if (ur1.a(pg2Var, this.g0)) {
            return;
        }
        if (!ur1.a(this.g0, pg2.QnHx.w) && !(!this.w)) {
            throw new IllegalArgumentException("Modifiers are not supported on virtual LayoutNodes".toString());
        }
        this.g0 = pg2Var;
        boolean zR = R();
        cw2 cw2Var = this.Z;
        kz1 kz1Var = cw2Var.B;
        while (true) {
            pn1Var = this.Y;
            boolean zA = ur1.a(kz1Var, pn1Var);
            ui2Var = this.F;
            if (zA) {
                break;
            }
            og2 og2Var = (og2) kz1Var;
            ui2Var.b(og2Var);
            kz1Var = og2Var.X;
        }
        kz1 kz1VarN0 = cw2Var.B;
        pn1Var.getClass();
        while (true) {
            if (ur1.a(kz1VarN0, null) || kz1VarN0 == null) {
                break;
            }
            fz1[] fz1VarArr = kz1VarN0.O;
            for (fz1 fz1Var : fz1VarArr) {
                for (; fz1Var != null; fz1Var = fz1Var.y) {
                    if (fz1Var.z) {
                        fz1Var.b();
                    }
                }
            }
            int length = fz1VarArr.length;
            for (int i = 0; i < length; i++) {
                fz1VarArr[i] = null;
            }
            kz1VarN0 = kz1VarN0.N0();
        }
        int i2 = ui2Var.y;
        if (i2 > 0) {
            og2[] og2VarArr = ui2Var.w;
            int i3 = 0;
            do {
                og2VarArr[i3].Z = false;
                i3++;
            } while (i3 < i2);
        }
        pg2Var.m0(sd5.a, new az1(this));
        kz1 kz1Var2 = cw2Var.B;
        if (fp1.Z(this) != null && E()) {
            this.C.n();
        }
        boolean zBooleanValue = ((Boolean) this.g0.z(Boolean.FALSE, new zy1(this.j0))).booleanValue();
        ui2<uy2<kz1, ou2>> ui2Var2 = this.j0;
        if (ui2Var2 != null) {
            ui2Var2.e();
        }
        uw2 uw2Var = pn1Var.R;
        if (uw2Var != null) {
            uw2Var.invalidate();
        }
        kz1 kz1Var3 = (kz1) this.g0.z(pn1Var, new EQ());
        ui2 ui2Var3 = new ui2(new sg2[16]);
        ug2 ug2Var2 = this.e0;
        for (ug2 ug2Var3 = ug2Var2; ug2Var3 != null; ug2Var3 = ug2Var3.y) {
            int i4 = ui2Var3.y;
            ui2<sg2> ui2Var4 = ug2Var3.B;
            ui2Var3.c(i4, ui2Var4);
            ui2Var4.e();
        }
        ug2 ug2Var4 = (ug2) pg2Var.m0(ug2Var2, new cz1(this, ui2Var3));
        this.f0 = ug2Var4;
        ug2 ug2Var5 = ug2Var4.y;
        ug2Var4.y = null;
        if (E()) {
            int i5 = ui2Var3.y;
            if (i5 > 0) {
                Object[] objArr = ui2Var3.w;
                int i6 = 0;
                while (true) {
                    sg2 sg2Var = (sg2) objArr[i6];
                    ug2Var = ug2Var5;
                    sg2Var.x.c(sg2.B);
                    sg2Var.z = false;
                    i6++;
                    if (i6 >= i5) {
                        break;
                    } else {
                        ug2Var5 = ug2Var;
                    }
                }
            } else {
                ug2Var = ug2Var5;
            }
            for (ug2 ug2Var6 = ug2Var; ug2Var6 != null; ug2Var6 = ug2Var6.y) {
                ug2Var6.a();
            }
            while (ug2Var2 != null) {
                ug2Var2.A = true;
                ww2 ww2Var2 = ug2Var2.w.C;
                if (ww2Var2 != null) {
                    ww2Var2.i(ug2Var2);
                }
                ui2<sg2> ui2Var5 = ug2Var2.B;
                int i7 = ui2Var5.y;
                if (i7 > 0) {
                    sg2[] sg2VarArr = ui2Var5.w;
                    int i8 = 0;
                    do {
                        sg2 sg2Var2 = sg2VarArr[i8];
                        sg2Var2.z = true;
                        ww2 ww2Var3 = sg2Var2.w.w.C;
                        if (ww2Var3 != null) {
                            ww2Var3.i(sg2Var2);
                        }
                        i8++;
                    } while (i8 < i7);
                }
                ug2Var2 = ug2Var2.y;
            }
        }
        yy1 yy1VarS3 = s();
        kz1Var3.B = yy1VarS3 != null ? yy1VarS3.Y : null;
        cw2Var.B = kz1Var3;
        if (E()) {
            int i9 = ui2Var.y;
            if (i9 > 0) {
                og2[] og2VarArr2 = ui2Var.w;
                int i10 = 0;
                do {
                    og2VarArr2[i10].E0();
                    i10++;
                } while (i10 < i9);
            }
            for (kz1 kz1VarN1 = cw2Var.B; !ur1.a(kz1VarN1, null) && kz1VarN1 != null; kz1VarN1 = kz1VarN1.N0()) {
                boolean zQ = kz1VarN1.q();
                fz1[] fz1VarArr2 = kz1VarN1.O;
                if (zQ) {
                    for (fz1 fz1Var2 : fz1VarArr2) {
                        for (; fz1Var2 != null; fz1Var2 = fz1Var2.y) {
                            fz1Var2.a();
                        }
                    }
                } else {
                    kz1VarN1.H = true;
                    kz1VarN1.U0(kz1VarN1.D);
                    for (fz1 fz1Var3 : fz1VarArr2) {
                        for (; fz1Var3 != null; fz1Var3 = fz1Var3.y) {
                            fz1Var3.a();
                        }
                    }
                }
            }
        }
        ui2Var.e();
        for (kz1 kz1VarN2 = cw2Var.B; !ur1.a(kz1VarN2, null) && kz1VarN2 != null; kz1VarN2 = kz1VarN2.N0()) {
            kz1VarN2.W0();
        }
        if (!ur1.a(kz1Var2, pn1Var) || !ur1.a(kz1Var3, pn1Var)) {
            P(false);
        } else if (this.E == 3 && !this.m0 && zBooleanValue) {
            P(false);
        } else if (ym.d(pn1Var.O, 4) && (ww2Var = this.C) != null) {
            ww2Var.j(this);
        }
        Object obj = cw2Var.I;
        Object objB = cw2Var.B.B();
        cw2Var.I = objB;
        if (!ur1.a(obj, objB) && (yy1VarS2 = s()) != null) {
            yy1VarS2.P(false);
        }
        if ((zR || R()) && (yy1VarS = s()) != null) {
            yy1VarS.A();
        }
    }

    @Override // defpackage.a30
    public final void h(ti5 ti5Var) {
        this.O = ti5Var;
    }

    @Override // defpackage.xw2
    public final boolean isValid() {
        return E();
    }

    public final void k(ww2 ww2Var) {
        if (!(this.C == null)) {
            throw new IllegalStateException(("Cannot attach " + this + " as it already is attached.  Tree: " + n(0)).toString());
        }
        yy1 yy1Var = this.B;
        if (!(yy1Var == null || ur1.a(yy1Var.C, ww2Var))) {
            StringBuilder sb = new StringBuilder("Attaching to a different owner(");
            sb.append(ww2Var);
            sb.append(") than the parent's owner(");
            yy1 yy1VarS = s();
            sb.append(yy1VarS != null ? yy1VarS.C : null);
            sb.append("). This tree: ");
            sb.append(n(0));
            sb.append(" Parent tree: ");
            yy1 yy1Var2 = this.B;
            sb.append(yy1Var2 != null ? yy1Var2.n(0) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        yy1 yy1VarS2 = s();
        if (yy1VarS2 == null) {
            this.Q = true;
        }
        this.C = ww2Var;
        this.D = (yy1VarS2 != null ? yy1VarS2.D : -1) + 1;
        if (fp1.Z(this) != null) {
            ww2Var.n();
        }
        ww2Var.f();
        ui2<yy1> ui2Var = this.y;
        int i = ui2Var.y;
        if (i > 0) {
            yy1[] yy1VarArr = ui2Var.w;
            int i2 = 0;
            do {
                yy1VarArr[i2].k(ww2Var);
                i2++;
            } while (i2 < i);
        }
        P(false);
        if (yy1VarS2 != null) {
            yy1VarS2.P(false);
        }
        this.Y.getClass();
        for (kz1 kz1VarN0 = this.Z.B; !ur1.a(kz1VarN0, null) && kz1VarN0 != null; kz1VarN0 = kz1VarN0.N0()) {
            kz1VarN0.H = true;
            kz1VarN0.U0(kz1VarN0.D);
            for (fz1 fz1Var : kz1VarN0.O) {
                for (; fz1Var != null; fz1Var = fz1Var.y) {
                    fz1Var.a();
                }
            }
        }
        for (ug2 ug2Var = this.e0; ug2Var != null; ug2Var = ug2Var.y) {
            ug2Var.A = true;
            ug2Var.c(ug2Var.x.getKey(), false);
            ui2<sg2> ui2Var2 = ug2Var.B;
            int i3 = ui2Var2.y;
            if (i3 > 0) {
                sg2[] sg2VarArr = ui2Var2.w;
                int i4 = 0;
                do {
                    sg2 sg2Var = sg2VarArr[i4];
                    sg2Var.z = true;
                    sg2Var.b();
                    i4++;
                } while (i4 < i3);
            }
        }
        j81<? super ww2, sd5> j81Var = this.h0;
        if (j81Var != null) {
            j81Var.invoke(ww2Var);
        }
    }

    public final void l() {
        this.W = this.V;
        this.V = 3;
        ui2<yy1> ui2VarV = v();
        int i = ui2VarV.y;
        if (i > 0) {
            yy1[] yy1VarArr = ui2VarV.w;
            int i2 = 0;
            do {
                yy1 yy1Var = yy1VarArr[i2];
                if (yy1Var.V != 3) {
                    yy1Var.l();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final void m() {
        this.W = this.V;
        this.V = 3;
        ui2<yy1> ui2VarV = v();
        int i = ui2VarV.y;
        if (i > 0) {
            yy1[] yy1VarArr = ui2VarV.w;
            int i2 = 0;
            do {
                yy1 yy1Var = yy1VarArr[i2];
                if (yy1Var.V == 2) {
                    yy1Var.m();
                }
                i2++;
            } while (i2 < i);
        }
    }

    public final String n(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        ui2<yy1> ui2VarV = v();
        int i3 = ui2VarV.y;
        if (i3 > 0) {
            yy1[] yy1VarArr = ui2VarV.w;
            int i4 = 0;
            do {
                sb.append(yy1VarArr[i4].n(i + 1));
                i4++;
            } while (i4 < i3);
        }
        String string = sb.toString();
        return i == 0 ? string.substring(0, string.length() - 1) : string;
    }

    public final void o() {
        ww2 ww2Var = this.C;
        if (ww2Var == null) {
            StringBuilder sb = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            yy1 yy1VarS = s();
            sb.append(yy1VarS != null ? yy1VarS.n(0) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        yy1 yy1VarS2 = s();
        if (yy1VarS2 != null) {
            yy1VarS2.A();
            yy1VarS2.P(false);
        }
        dz1 dz1Var = this.P;
        dz1Var.b = true;
        dz1Var.c = false;
        dz1Var.e = false;
        dz1Var.d = false;
        dz1Var.f = false;
        dz1Var.g = false;
        dz1Var.h = null;
        j81<? super ww2, sd5> j81Var = this.i0;
        if (j81Var != null) {
            j81Var.invoke(ww2Var);
        }
        for (ug2 ug2Var = this.e0; ug2Var != null; ug2Var = ug2Var.y) {
            ug2Var.a();
        }
        this.Y.getClass();
        for (kz1 kz1VarN0 = this.Z.B; !ur1.a(kz1VarN0, null) && kz1VarN0 != null; kz1VarN0 = kz1VarN0.N0()) {
            kz1VarN0.E0();
        }
        if (fp1.Z(this) != null) {
            ww2Var.n();
        }
        ww2Var.q(this);
        this.C = null;
        this.D = 0;
        ui2<yy1> ui2Var = this.y;
        int i = ui2Var.y;
        if (i > 0) {
            yy1[] yy1VarArr = ui2Var.w;
            int i2 = 0;
            do {
                yy1VarArr[i2].o();
                i2++;
            } while (i2 < i);
        }
        this.R = Integer.MAX_VALUE;
        this.S = Integer.MAX_VALUE;
        this.Q = false;
    }

    public final void p(dn dnVar) {
        this.Z.B.G0(dnVar);
    }

    public final List<yy1> q() {
        ui2<yy1> ui2VarV = v();
        ui2.QnHx qnHx = ui2VarV.x;
        if (qnHx != null) {
            return qnHx;
        }
        ui2.QnHx qnHx2 = new ui2.QnHx(ui2VarV);
        ui2VarV.x = qnHx2;
        return qnHx2;
    }

    public final List<yy1> r() {
        ui2<yy1> ui2Var = this.y;
        ui2.QnHx qnHx = ui2Var.x;
        if (qnHx != null) {
            return qnHx;
        }
        ui2.QnHx qnHx2 = new ui2.QnHx(ui2Var);
        ui2Var.x = qnHx2;
        return qnHx2;
    }

    public final yy1 s() {
        yy1 yy1Var = this.B;
        boolean z = false;
        if (yy1Var != null && yy1Var.w) {
            z = true;
        }
        if (!z) {
            return yy1Var;
        }
        if (yy1Var != null) {
            return yy1Var.s();
        }
        return null;
    }

    public final ui2<yy1> t() {
        boolean z = this.I;
        ui2<yy1> ui2Var = this.H;
        if (z) {
            ui2Var.e();
            ui2Var.c(ui2Var.y, v());
            Arrays.sort(ui2Var.w, 0, ui2Var.y, this.o0);
            this.I = false;
        }
        return ui2Var;
    }

    public final String toString() {
        return hH.v(this) + " children: " + ((ui2.QnHx) q()).w.y + " measurePolicy: " + this.J;
    }

    @Override // defpackage.zq1
    public final int u(int i) {
        return this.Z.u(i);
    }

    public final ui2<yy1> v() {
        int i = this.x;
        ui2<yy1> ui2Var = this.y;
        if (i == 0) {
            return ui2Var;
        }
        if (this.A) {
            int i2 = 0;
            this.A = false;
            ui2<yy1> ui2Var2 = this.z;
            if (ui2Var2 == null) {
                ui2Var2 = new ui2<>(new yy1[16]);
                this.z = ui2Var2;
            }
            ui2Var2.e();
            int i3 = ui2Var.y;
            if (i3 > 0) {
                yy1[] yy1VarArr = ui2Var.w;
                do {
                    yy1 yy1Var = yy1VarArr[i2];
                    if (yy1Var.w) {
                        ui2Var2.c(ui2Var2.y, yy1Var.v());
                    } else {
                        ui2Var2.b(yy1Var);
                    }
                    i2++;
                } while (i2 < i3);
            }
        }
        return this.z;
    }

    public final void w(long j, cd1<j93> cd1Var, boolean z, boolean z2) {
        cw2 cw2Var = this.Z;
        cw2Var.B.Q0(kz1.V, cw2Var.B.I0(j), cd1Var, z, z2);
    }

    @Override // defpackage.zq1
    public final int x(int i) {
        return this.Z.x(i);
    }

    @Override // defpackage.ob2
    public final b43 y(long j) {
        if (this.V == 3) {
            l();
        }
        cw2 cw2Var = this.Z;
        cw2Var.y(j);
        return cw2Var;
    }

    public final void z(int i, yy1 yy1Var) {
        ui2<yy1> ui2Var;
        int i2;
        int i3 = 0;
        pn1 pn1Var = null;
        if (!(yy1Var.B == null)) {
            StringBuilder sb = new StringBuilder("Cannot insert ");
            sb.append(yy1Var);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(n(0));
            sb.append(" Other tree: ");
            yy1 yy1Var2 = yy1Var.B;
            sb.append(yy1Var2 != null ? yy1Var2.n(0) : null);
            throw new IllegalStateException(sb.toString().toString());
        }
        if (!(yy1Var.C == null)) {
            throw new IllegalStateException(("Cannot insert " + yy1Var + " because it already has an owner. This tree: " + n(0) + " Other tree: " + yy1Var.n(0)).toString());
        }
        yy1Var.B = this;
        this.y.a(i, yy1Var);
        L();
        boolean z = this.w;
        boolean z2 = yy1Var.w;
        if (z2) {
            if (!(!z)) {
                throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
            }
            this.x++;
        }
        D();
        kz1 kz1Var = yy1Var.Z.B;
        pn1 pn1Var2 = this.Y;
        if (z) {
            yy1 yy1Var3 = this.B;
            if (yy1Var3 != null) {
                pn1Var = yy1Var3.Y;
            }
        } else {
            pn1Var = pn1Var2;
        }
        kz1Var.B = pn1Var;
        if (z2 && (i2 = (ui2Var = yy1Var.y).y) > 0) {
            yy1[] yy1VarArr = ui2Var.w;
            do {
                yy1VarArr[i3].Z.B.B = pn1Var2;
                i3++;
            } while (i3 < i2);
        }
        ww2 ww2Var = this.C;
        if (ww2Var != null) {
            yy1Var.k(ww2Var);
        }
    }

    public yy1(boolean z) {
        this.w = z;
        this.y = new ui2<>(new yy1[16]);
        this.E = 3;
        this.F = new ui2<>(new og2[16]);
        this.H = new ui2<>(new yy1[16]);
        this.I = true;
        this.J = p0;
        this.K = new yr1(this);
        this.L = new jj0(1.0f, 1.0f);
        this.M = new byN();
        this.N = jy1.Ltr;
        this.O = r0;
        this.P = new dz1(this);
        this.R = Integer.MAX_VALUE;
        this.S = Integer.MAX_VALUE;
        this.U = 3;
        this.V = 3;
        this.W = 3;
        pn1 pn1Var = new pn1(this);
        this.Y = pn1Var;
        this.Z = new cw2(this, pn1Var);
        this.d0 = true;
        ug2 ug2Var = new ug2(this, t0);
        this.e0 = ug2Var;
        this.f0 = ug2Var;
        this.g0 = pg2.QnHx.w;
        this.o0 = new xy1(0);
    }
}
