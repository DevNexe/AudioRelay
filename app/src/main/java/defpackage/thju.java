package defpackage;

import android.view.View;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class thju {
    public static final lq0 a = q40.b(QnHx.w);

    public static final class CQf extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ jy1 A;
        public final /* synthetic */ ba3 w;
        public final /* synthetic */ h81<sd5> x;
        public final /* synthetic */ ha3 y;
        public final /* synthetic */ String z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(ba3 ba3Var, h81<sd5> h81Var, ha3 ha3Var, String str, jy1 jy1Var) {
            super(1);
            this.w = ba3Var;
            this.x = h81Var;
            this.y = ha3Var;
            this.z = str;
            this.A = jy1Var;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            ba3 ba3Var = this.w;
            ba3Var.I.addView(ba3Var, ba3Var.J);
            ba3Var.k(this.x, this.y, this.z, this.A);
            return new Ky(ba3Var);
        }
    }

    public static final class EQ extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ ba3 w;
        public final /* synthetic */ is4<x81<g30, Integer, sd5>> x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EQ(ba3 ba3Var, ri2 ri2Var) {
            super(2);
            this.w = ba3Var;
            this.x = ri2Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                pg2 pg2VarA = c94.a(pg2.QnHx.w, false, Pk.w);
                ba3 ba3Var = this.w;
                Xzh xzh = new Xzh(ba3Var);
                wo1.QnHx qnHx = wo1.a;
                pg2 pg2VarK = hH.k(pg2VarA.y(new xu2(xzh)), ba3Var.getCanCalculatePosition() ? 1.0f : 0.0f);
                sz szVarM = X.m(g30Var2, 606497925, new UqBn(this.x));
                g30Var2.e(1406149896);
                t2z t2zVar = t2z.a;
                g30Var2.e(-1323940314);
                ij0 ij0Var = (ij0) g30Var2.E(r40.e);
                jy1 jy1Var = (jy1) g30Var2.E(r40.k);
                ti5 ti5Var = (ti5) g30Var2.E(r40.o);
                a30.e.getClass();
                yy1.QnHx qnHx2 = a30.QnHx.b;
                sz szVarJ = S12N.j(pg2VarK);
                if (!(g30Var2.v() instanceof jE)) {
                    fp1.c0();
                    throw null;
                }
                g30Var2.s();
                if (g30Var2.m()) {
                    g30Var2.l(qnHx2);
                } else {
                    g30Var2.A();
                }
                g30Var2.u();
                hH.u(g30Var2, t2zVar, a30.QnHx.e);
                hH.u(g30Var2, ij0Var, a30.QnHx.d);
                hH.u(g30Var2, jy1Var, a30.QnHx.f);
                szVarJ.invoke(bl2.b(g30Var2, ti5Var, a30.QnHx.g, g30Var2), g30Var2, 0);
                g30Var2.e(2058660585);
                szVarM.invoke(g30Var2, 6);
                g30Var2.G();
                g30Var2.H();
                g30Var2.G();
                g30Var2.G();
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements h81<sd5> {
        public final /* synthetic */ jy1 A;
        public final /* synthetic */ ba3 w;
        public final /* synthetic */ h81<sd5> x;
        public final /* synthetic */ ha3 y;
        public final /* synthetic */ String z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(ba3 ba3Var, h81<sd5> h81Var, ha3 ha3Var, String str, jy1 jy1Var) {
            super(0);
            this.w = ba3Var;
            this.x = h81Var;
            this.y = ha3Var;
            this.z = str;
            this.A = jy1Var;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.k(this.x, this.y, this.z, this.A);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ ba3 w;
        public final /* synthetic */ ga3 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(ba3 ba3Var, ga3 ga3Var) {
            super(1);
            this.w = ba3Var;
            this.x = ga3Var;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            ba3 ba3Var = this.w;
            ba3Var.setPositionProvider(this.x);
            ba3Var.n();
            return new n1b();
        }
    }

    @if0(c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", f = "AndroidPopup.android.kt", l = {299}, m = "invokeSuspend")
    public static final class NUlFixed extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ ba3 C;

        public static final class QnHx extends cx1 implements j81<Long, sd5> {
            public static final QnHx w = new QnHx();

            public QnHx() {
                super(1);
            }

            @Override // defpackage.j81
            public final /* bridge */ /* synthetic */ sd5 invoke(Long l) {
                l.longValue();
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(ba3 ba3Var, z80<? super NUlFixed> z80Var) {
            super(2, z80Var);
            this.C = ba3Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            NUlFixed nUl = new NUlFixed(this.C, z80Var);
            nUl.B = obj;
            return nUl;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0029  */
        /* JADX WARN: Code duplicated, block: B:13:0x003b  */
        /* JADX WARN: Code duplicated, block: B:14:0x0040  */
        /* JADX WARN: Code duplicated, block: B:16:0x0046 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0059  */
        /* JADX WARN: Code duplicated, block: B:21:0x005d  */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.m8
        public final java.lang.Object i(java.lang.Object r10) {
            /*
                r9 = this;
                va0 r0 = defpackage.va0.COROUTINE_SUSPENDED
                int r1 = r9.A
                r2 = 1
                if (r1 == 0) goto L1a
                if (r1 != r2) goto L12
                java.lang.Object r1 = r9.B
                ua0 r1 = (defpackage.ua0) r1
                defpackage.C0239D.H(r10)
                r10 = r9
                goto L47
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1a:
                defpackage.C0239D.H(r10)
                java.lang.Object r10 = r9.B
                ua0 r10 = (defpackage.ua0) r10
                r1 = r10
                r10 = r9
            L23:
                boolean r3 = defpackage.fp1.e0(r1)
                if (r3 == 0) goto L61
                thju$NUl$QnHx r3 = thju.NUlFixed.QnHx.w
                r10.B = r1
                r10.A = r2
                la0 r4 = r10.x
                zj1$QnHx r5 = zj1.QnHx.w
                la0$CQf r4 = r4.j(r5)
                zj1 r4 = (defpackage.zj1) r4
                if (r4 != 0) goto L40
                java.lang.Object r3 = defpackage.fp1.E0(r3, r10)
                goto L44
            L40:
                java.lang.Object r3 = r4.a0()
            L44:
                if (r3 != r0) goto L47
                return r0
            L47:
                ba3 r3 = r10.C
                int[] r4 = r3.T
                r5 = 0
                r6 = r4[r5]
                r7 = r4[r2]
                android.view.View r8 = r3.G
                r8.getLocationOnScreen(r4)
                r5 = r4[r5]
                if (r6 != r5) goto L5d
                r4 = r4[r2]
                if (r7 == r4) goto L23
            L5d:
                r3.l()
                goto L23
            L61:
                sd5 r10 = defpackage.sd5.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: thju.NUlFixed.i(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((NUlFixed) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class QnHx extends cx1 implements h81<String> {
        public static final QnHx w = new QnHx();

        public QnHx() {
            super(0);
        }

        @Override // defpackage.h81
        public final /* bridge */ /* synthetic */ String invoke() {
            return "DEFAULT_TEST_TAG";
        }
    }

    public static final class T23 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int A;
        public final /* synthetic */ int B;
        public final /* synthetic */ ga3 w;
        public final /* synthetic */ h81<sd5> x;
        public final /* synthetic */ ha3 y;
        public final /* synthetic */ x81<g30, Integer, sd5> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public T23(ga3 ga3Var, h81<sd5> h81Var, ha3 ha3Var, x81<? super g30, ? super Integer, sd5> x81Var, int i, int i2) {
            super(2);
            this.w = ga3Var;
            this.x = h81Var;
            this.y = ha3Var;
            this.z = x81Var;
            this.A = i;
            this.B = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            thju.a(this.w, this.x, this.y, this.z, g30Var, this.A | 1, this.B);
            return sd5.a;
        }
    }

    public static final class YKK extends cx1 implements j81<iy1, sd5> {
        public final /* synthetic */ ba3 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(ba3 ba3Var) {
            super(1);
            this.w = ba3Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(iy1 iy1Var) {
            this.w.m(iy1Var.G());
            return sd5.a;
        }
    }

    public static final class auxFixed implements rb2 {
        public final /* synthetic */ ba3 a;
        public final /* synthetic */ jy1 b;

        public static final class QnHx extends cx1 implements j81<b43.QnHx, sd5> {
            public static final QnHx w = new QnHx();

            public QnHx() {
                super(1);
            }

            @Override // defpackage.j81
            public final /* bridge */ /* synthetic */ sd5 invoke(b43.QnHx qnHx) {
                return sd5.a;
            }
        }

        public auxFixed(ba3 ba3Var, jy1 jy1Var) {
            this.a = ba3Var;
            this.b = jy1Var;
        }

        @Override // defpackage.rb2
        public final sb2 a(vb2 vb2Var, List<? extends ob2> list, long j) {
            this.a.setParentLayoutDirection(this.b);
            return vb2Var.K(0, 0, ds0.w, QnHx.w);
        }

        @Override // defpackage.rb2
        public final /* synthetic */ int b(yy1.byN byn, List list, int i) {
            return qb2.c(this, byn, list, i);
        }

        @Override // defpackage.rb2
        public final /* synthetic */ int c(yy1.byN byn, List list, int i) {
            return qb2.d(this, byn, list, i);
        }

        @Override // defpackage.rb2
        public final /* synthetic */ int d(yy1.byN byn, List list, int i) {
            return qb2.b(this, byn, list, i);
        }

        @Override // defpackage.rb2
        public final /* synthetic */ int e(yy1.byN byn, List list, int i) {
            return qb2.a(this, byn, list, i);
        }
    }

    public static final class byN extends cx1 implements h81<UUID> {
        public static final byN w = new byN();

        public byN() {
            super(0);
        }

        @Override // defpackage.h81
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af A[PHI: r0
  0x00af: PHI (r0v32 h81<sd5>) = (r0v18 h81<sd5>), (r0v34 h81<sd5>) binds: [B:61:0x00a1, B:56:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:67:0x0130  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    public static final void a(ga3 ga3Var, h81<sd5> h81Var, ha3 ha3Var, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i, int i2) {
        int i3;
        h81<sd5> h81Var2;
        ha3 ha3Var2;
        int i4;
        h81<sd5> h81Var3;
        h81<sd5> h81Var4;
        ha3 ha3Var3;
        View view;
        ij0 ij0Var;
        String str;
        l40 l40VarR0;
        ri2 ri2VarF0;
        UUID uuid;
        Object objB0;
        auxFixed auxVar;
        ij0 ij0Var2;
        jy1 jy1Var;
        ti5 ti5Var;
        yy1.QnHx qnHx;
        sz szVarJ;
        tk3 tk3VarU;
        j30 j30VarQ = g30Var.q(-830247068);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.I(ga3Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                h81Var2 = h81Var;
                i3 |= j30VarQ.I(h81Var2) ? 32 : 16;
            }
            if ((i & 896) == 0) {
                if ((i2 & 4) == 0) {
                    ha3Var2 = ha3Var;
                    int i6 = j30VarQ.I(ha3Var2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    ha3Var2 = ha3Var;
                }
                i3 |= i6;
            } else {
                ha3Var2 = ha3Var;
            }
            if ((i2 & 8) != 0) {
                i3 |= 3072;
            } else if ((i & 7168) == 0) {
                if (j30VarQ.I(x81Var)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 5851) == 1170 || !j30VarQ.t()) {
                j30VarQ.t0();
                if ((i & 1) != 0 || j30VarQ.Y()) {
                    if (i5 != 0) {
                        h81Var3 = null;
                    } else {
                        h81Var3 = h81Var2;
                    }
                    if ((i2 & 4) != 0) {
                        h81Var4 = h81Var3;
                        ha3Var3 = new ha3(false, 63);
                    }
                    j30VarQ.S();
                    view = (View) j30VarQ.E(Ll.f);
                    jt4 jt4Var = r40.e;
                    ij0Var = (ij0) j30VarQ.E(jt4Var);
                    str = (String) j30VarQ.E(a);
                    jt4 jt4Var2 = r40.k;
                    jy1 jy1Var2 = (jy1) j30VarQ.E(jt4Var2);
                    l40VarR0 = fp1.r0(j30VarQ);
                    ri2VarF0 = ps0.f0(x81Var, j30VarQ);
                    uuid = (UUID) g7.f(new Object[0], null, null, byN.w, j30VarQ, 6);
                    j30VarQ.e(-492369756);
                    objB0 = j30VarQ.b0();
                    if (objB0 == g30.QnHx.a) {
                        ba3 ba3Var = new ba3(h81Var4, ha3Var3, str, view, ij0Var, ga3Var, uuid);
                        ba3Var.j(l40VarR0, X.n(1302892335, new EQ(ba3Var, ri2VarF0), true));
                        j30VarQ.F0(ba3Var);
                        objB0 = ba3Var;
                    }
                    j30VarQ.R(false);
                    ba3 ba3Var2 = (ba3) objB0;
                    h81<sd5> h81Var5 = h81Var4;
                    ha3 ha3Var4 = ha3Var3;
                    wq0.a(ba3Var2, new CQf(ba3Var2, h81Var5, ha3Var4, str, jy1Var2), j30VarQ);
                    wq0.h(new F1(ba3Var2, h81Var5, ha3Var4, str, jy1Var2), j30VarQ);
                    wq0.a(ga3Var, new LPt8Fixed(ba3Var2, ga3Var), j30VarQ);
                    wq0.d(ba3Var2, new NUlFixed(ba3Var2, null), j30VarQ);
                    YKK ykk = new YKK(ba3Var2);
                    wo1.QnHx qnHx2 = wo1.a;
                    pu2 pu2Var = new pu2(ykk);
                    auxVar = new auxFixed(ba3Var2, jy1Var2);
                    j30VarQ.e(-1323940314);
                    ij0Var2 = (ij0) j30VarQ.E(jt4Var);
                    jy1Var = (jy1) j30VarQ.E(jt4Var2);
                    ti5Var = (ti5) j30VarQ.E(r40.o);
                    a30.e.getClass();
                    qnHx = a30.QnHx.b;
                    szVarJ = S12N.j(pu2Var);
                    if (j30VarQ.a instanceof jE) {
                        fp1.c0();
                        throw null;
                    }
                    j30VarQ.s();
                    if (j30VarQ.K) {
                        j30VarQ.l(qnHx);
                    } else {
                        j30VarQ.A();
                    }
                    j30VarQ.x = false;
                    hH.u(j30VarQ, auxVar, a30.QnHx.e);
                    hH.u(j30VarQ, ij0Var2, a30.QnHx.d);
                    hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                    Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, 2085825549);
                    O.g(j30VarQ, false, false, true, false);
                    h81Var2 = h81Var4;
                    ha3Var2 = ha3Var3;
                } else {
                    j30VarQ.x();
                    h81Var3 = h81Var2;
                }
                h81Var4 = h81Var3;
                ha3Var3 = ha3Var2;
                j30VarQ.S();
                view = (View) j30VarQ.E(Ll.f);
                jt4 jt4Var3 = r40.e;
                ij0Var = (ij0) j30VarQ.E(jt4Var3);
                str = (String) j30VarQ.E(a);
                jt4 jt4Var4 = r40.k;
                jy1 jy1Var3 = (jy1) j30VarQ.E(jt4Var4);
                l40VarR0 = fp1.r0(j30VarQ);
                ri2VarF0 = ps0.f0(x81Var, j30VarQ);
                uuid = (UUID) g7.f(new Object[0], null, null, byN.w, j30VarQ, 6);
                j30VarQ.e(-492369756);
                objB0 = j30VarQ.b0();
                if (objB0 == g30.QnHx.a) {
                    ba3 ba3Var3 = new ba3(h81Var4, ha3Var3, str, view, ij0Var, ga3Var, uuid);
                    ba3Var3.j(l40VarR0, X.n(1302892335, new EQ(ba3Var3, ri2VarF0), true));
                    j30VarQ.F0(ba3Var3);
                    objB0 = ba3Var3;
                }
                j30VarQ.R(false);
                ba3 ba3Var4 = (ba3) objB0;
                h81<sd5> h81Var6 = h81Var4;
                ha3 ha3Var5 = ha3Var3;
                wq0.a(ba3Var4, new CQf(ba3Var4, h81Var6, ha3Var5, str, jy1Var3), j30VarQ);
                wq0.h(new F1(ba3Var4, h81Var6, ha3Var5, str, jy1Var3), j30VarQ);
                wq0.a(ga3Var, new LPt8Fixed(ba3Var4, ga3Var), j30VarQ);
                wq0.d(ba3Var4, new NUlFixed(ba3Var4, null), j30VarQ);
                YKK ykk2 = new YKK(ba3Var4);
                wo1.QnHx qnHx3 = wo1.a;
                pu2 pu2Var2 = new pu2(ykk2);
                auxVar = new auxFixed(ba3Var4, jy1Var3);
                j30VarQ.e(-1323940314);
                ij0Var2 = (ij0) j30VarQ.E(jt4Var3);
                jy1Var = (jy1) j30VarQ.E(jt4Var4);
                ti5Var = (ti5) j30VarQ.E(r40.o);
                a30.e.getClass();
                qnHx = a30.QnHx.b;
                szVarJ = S12N.j(pu2Var2);
                if (j30VarQ.a instanceof jE) {
                    fp1.c0();
                    throw null;
                }
                j30VarQ.s();
                if (j30VarQ.K) {
                    j30VarQ.l(qnHx);
                } else {
                    j30VarQ.A();
                }
                j30VarQ.x = false;
                hH.u(j30VarQ, auxVar, a30.QnHx.e);
                hH.u(j30VarQ, ij0Var2, a30.QnHx.d);
                hH.u(j30VarQ, jy1Var, a30.QnHx.f);
                Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, 2085825549);
                O.g(j30VarQ, false, false, true, false);
                h81Var2 = h81Var4;
                ha3Var2 = ha3Var3;
            } else {
                j30VarQ.x();
            }
            tk3VarU = j30VarQ.U();
            if (tk3VarU == null) {
                return;
            }
            tk3VarU.d = new T23(ga3Var, h81Var2, ha3Var2, x81Var, i, i2);
        }
        i3 |= 48;
        h81Var2 = h81Var;
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                ha3Var2 = ha3Var;
                if (j30VarQ.I(ha3Var2)) {
                }
                i3 |= i6;
            } else {
                ha3Var2 = ha3Var;
            }
            i3 |= i6;
        } else {
            ha3Var2 = ha3Var;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            if (j30VarQ.I(x81Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 5851) == 1170) {
            j30VarQ.t0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    h81Var3 = null;
                } else {
                    h81Var3 = h81Var2;
                }
                if ((i2 & 4) != 0) {
                    h81Var4 = h81Var3;
                    ha3Var3 = new ha3(false, 63);
                } else {
                    h81Var4 = h81Var3;
                    ha3Var3 = ha3Var2;
                }
            } else {
                if (i5 != 0) {
                    h81Var3 = null;
                } else {
                    h81Var3 = h81Var2;
                }
                if ((i2 & 4) != 0) {
                    h81Var4 = h81Var3;
                    ha3Var3 = new ha3(false, 63);
                } else {
                    h81Var4 = h81Var3;
                    ha3Var3 = ha3Var2;
                }
            }
            j30VarQ.S();
            view = (View) j30VarQ.E(Ll.f);
            jt4 jt4Var5 = r40.e;
            ij0Var = (ij0) j30VarQ.E(jt4Var5);
            str = (String) j30VarQ.E(a);
            jt4 jt4Var6 = r40.k;
            jy1 jy1Var4 = (jy1) j30VarQ.E(jt4Var6);
            l40VarR0 = fp1.r0(j30VarQ);
            ri2VarF0 = ps0.f0(x81Var, j30VarQ);
            uuid = (UUID) g7.f(new Object[0], null, null, byN.w, j30VarQ, 6);
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            if (objB0 == g30.QnHx.a) {
                ba3 ba3Var5 = new ba3(h81Var4, ha3Var3, str, view, ij0Var, ga3Var, uuid);
                ba3Var5.j(l40VarR0, X.n(1302892335, new EQ(ba3Var5, ri2VarF0), true));
                j30VarQ.F0(ba3Var5);
                objB0 = ba3Var5;
            }
            j30VarQ.R(false);
            ba3 ba3Var6 = (ba3) objB0;
            h81<sd5> h81Var7 = h81Var4;
            ha3 ha3Var6 = ha3Var3;
            wq0.a(ba3Var6, new CQf(ba3Var6, h81Var7, ha3Var6, str, jy1Var4), j30VarQ);
            wq0.h(new F1(ba3Var6, h81Var7, ha3Var6, str, jy1Var4), j30VarQ);
            wq0.a(ga3Var, new LPt8Fixed(ba3Var6, ga3Var), j30VarQ);
            wq0.d(ba3Var6, new NUlFixed(ba3Var6, null), j30VarQ);
            YKK ykk3 = new YKK(ba3Var6);
            wo1.QnHx qnHx4 = wo1.a;
            pu2 pu2Var3 = new pu2(ykk3);
            auxVar = new auxFixed(ba3Var6, jy1Var4);
            j30VarQ.e(-1323940314);
            ij0Var2 = (ij0) j30VarQ.E(jt4Var5);
            jy1Var = (jy1) j30VarQ.E(jt4Var6);
            ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            qnHx = a30.QnHx.b;
            szVarJ = S12N.j(pu2Var3);
            if (j30VarQ.a instanceof jE) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, auxVar, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var2, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, 2085825549);
            O.g(j30VarQ, false, false, true, false);
            h81Var2 = h81Var4;
            ha3Var2 = ha3Var3;
        } else {
            j30VarQ.t0();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    h81Var3 = null;
                } else {
                    h81Var3 = h81Var2;
                }
                if ((i2 & 4) != 0) {
                    h81Var4 = h81Var3;
                    ha3Var3 = new ha3(false, 63);
                } else {
                    h81Var4 = h81Var3;
                    ha3Var3 = ha3Var2;
                }
            } else {
                if (i5 != 0) {
                    h81Var3 = null;
                } else {
                    h81Var3 = h81Var2;
                }
                if ((i2 & 4) != 0) {
                    h81Var4 = h81Var3;
                    ha3Var3 = new ha3(false, 63);
                } else {
                    h81Var4 = h81Var3;
                    ha3Var3 = ha3Var2;
                }
            }
            j30VarQ.S();
            view = (View) j30VarQ.E(Ll.f);
            jt4 jt4Var7 = r40.e;
            ij0Var = (ij0) j30VarQ.E(jt4Var7);
            str = (String) j30VarQ.E(a);
            jt4 jt4Var8 = r40.k;
            jy1 jy1Var5 = (jy1) j30VarQ.E(jt4Var8);
            l40VarR0 = fp1.r0(j30VarQ);
            ri2VarF0 = ps0.f0(x81Var, j30VarQ);
            uuid = (UUID) g7.f(new Object[0], null, null, byN.w, j30VarQ, 6);
            j30VarQ.e(-492369756);
            objB0 = j30VarQ.b0();
            if (objB0 == g30.QnHx.a) {
                ba3 ba3Var7 = new ba3(h81Var4, ha3Var3, str, view, ij0Var, ga3Var, uuid);
                ba3Var7.j(l40VarR0, X.n(1302892335, new EQ(ba3Var7, ri2VarF0), true));
                j30VarQ.F0(ba3Var7);
                objB0 = ba3Var7;
            }
            j30VarQ.R(false);
            ba3 ba3Var8 = (ba3) objB0;
            h81<sd5> h81Var8 = h81Var4;
            ha3 ha3Var7 = ha3Var3;
            wq0.a(ba3Var8, new CQf(ba3Var8, h81Var8, ha3Var7, str, jy1Var5), j30VarQ);
            wq0.h(new F1(ba3Var8, h81Var8, ha3Var7, str, jy1Var5), j30VarQ);
            wq0.a(ga3Var, new LPt8Fixed(ba3Var8, ga3Var), j30VarQ);
            wq0.d(ba3Var8, new NUlFixed(ba3Var8, null), j30VarQ);
            YKK ykk4 = new YKK(ba3Var8);
            wo1.QnHx qnHx5 = wo1.a;
            pu2 pu2Var4 = new pu2(ykk4);
            auxVar = new auxFixed(ba3Var8, jy1Var5);
            j30VarQ.e(-1323940314);
            ij0Var2 = (ij0) j30VarQ.E(jt4Var7);
            jy1Var = (jy1) j30VarQ.E(jt4Var8);
            ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            qnHx = a30.QnHx.b;
            szVarJ = S12N.j(pu2Var4);
            if (j30VarQ.a instanceof jE) {
                fp1.c0();
                throw null;
            }
            j30VarQ.s();
            if (j30VarQ.K) {
                j30VarQ.l(qnHx);
            } else {
                j30VarQ.A();
            }
            j30VarQ.x = false;
            hH.u(j30VarQ, auxVar, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var2, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            Xs.c(0, szVarJ, sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, 2058660585, 2085825549);
            O.g(j30VarQ, false, false, true, false);
            h81Var2 = h81Var4;
            ha3Var2 = ha3Var3;
        }
        tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new T23(ga3Var, h81Var2, ha3Var2, x81Var, i, i2);
    }
}
