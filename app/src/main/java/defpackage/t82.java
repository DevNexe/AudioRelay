package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class t82 implements eo1<k82, j82, l82> {
    public final F7 a;
    public final y50 b;

    @if0(c = "com.azefsw.audioconnect.player.ui.manualconnection.ManualConnectionInputHandler$validateThenConnect$2$1", f = "ManualConnectionInputHandler.kt", l = {61}, m = "invokeSuspend")
    public static final class CQf extends px4 implements x81<gk4<k82, j82, l82>, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ String D;

        @if0(c = "com.azefsw.audioconnect.player.ui.manualconnection.ManualConnectionInputHandler$validateThenConnect$2$1$1", f = "ManualConnectionInputHandler.kt", l = {65, 68}, m = "invokeSuspend")
        public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
            public int A;
            public final /* synthetic */ t82 B;
            public final /* synthetic */ String C;
            public final /* synthetic */ gk4<k82, j82, l82> D;

            /* JADX INFO: renamed from: t82$CQf$QnHx$QnHx, reason: collision with other inner class name */
            public static final class C0203QnHx extends cx1 implements j81<n52, sd5> {
                public static final C0203QnHx w = new C0203QnHx();

                public C0203QnHx() {
                    super(1);
                }

                @Override // defpackage.j81
                public final sd5 invoke(n52 n52Var) {
                    n52Var.b("label", "valid_address");
                    return sd5.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public QnHx(t82 t82Var, String str, gk4<k82, j82, l82> gk4Var, z80<? super QnHx> z80Var) {
                super(2, z80Var);
                this.B = t82Var;
                this.C = str;
                this.D = gk4Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                return new QnHx(this.B, this.C, this.D, z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                Object obj2 = va0.COROUTINE_SUSPENDED;
                int i = this.A;
                String str = this.C;
                t82 t82Var = this.B;
                if (i != 0) {
                    if (i == 1) {
                        C0239D.H(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C0239D.H(obj);
                    }
                    return sd5.a;
                }
                C0239D.H(obj);
                a62.a.f("clicked_on_connect", C0203QnHx.w);
                F7 f7 = t82Var.a;
                this.A = 1;
                X1GO x1go = f7.a;
                Object objE = kd.e(new dm(new sKP(new e01(new US(x1go.b.e("prefs_custom_connections", ""), x1go)), x1go, str), x1go), new et(x1go, null), this);
                if (objE != obj2) {
                    objE = sd5.a;
                }
                if (objE != obj2) {
                    objE = sd5.a;
                }
                if (objE == obj2) {
                    return obj2;
                }
                a62.a.j("last_connection_attempt", "ip_address");
                t82Var.b.a(new t50(str));
                j82.QnHx qnHx = j82.QnHx.a;
                this.A = 2;
                if (this.D.o(qnHx, this) == obj2) {
                    return obj2;
                }
                return sd5.a;
            }

            @Override // defpackage.x81
            public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(String str, z80<? super CQf> z80Var) {
            super(2, z80Var);
            this.D = str;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            CQf cQf = t82.this.new CQf(this.D, z80Var);
            cQf.B = obj;
            return cQf;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                gk4 gk4Var = (gk4) this.B;
                fh0 fh0Var = sl0.a;
                QnHx qnHx = new QnHx(t82.this, this.D, gk4Var, null);
                this.A = 1;
                if (fp1.D0(fh0Var, qnHx, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(gk4<k82, j82, l82> gk4Var, z80<? super sd5> z80Var) {
            return ((CQf) a(gk4Var, z80Var)).i(sd5.a);
        }
    }

    public static final class F1 extends cx1 implements j81<n52, sd5> {
        public static final F1 w = new F1();

        public F1() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(n52 n52Var) {
            n52Var.b("label", "empty_address");
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements j81<n52, sd5> {
        public static final LPt8Fixed w = new LPt8Fixed();

        public LPt8Fixed() {
            super(1);
        }

        @Override // defpackage.j81
        public final sd5 invoke(n52 n52Var) {
            n52Var.b("label", "invalid_address");
            return sd5.a;
        }
    }

    @if0(c = "com.copperleaf.ballast.UtilsKt$postInput$1", f = "utils.kt", l = {80}, m = "invokeSuspend")
    public static final class NUlFixed extends px4 implements x81<gk4<k82, j82, l82>, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ Object C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NUlFixed(Object obj, z80 z80Var) {
            super(2, z80Var);
            this.C = obj;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            NUlFixed nUl = new NUlFixed(this.C, z80Var);
            nUl.B = obj;
            return nUl;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                gk4 gk4Var = (gk4) this.B;
                this.A = 1;
                if (gk4Var.n(this.C, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(gk4<k82, j82, l82> gk4Var, z80<? super sd5> z80Var) {
            return ((NUlFixed) a(gk4Var, z80Var)).i(sd5.a);
        }
    }

    @if0(c = "com.azefsw.audioconnect.player.ui.manualconnection.ManualConnectionInputHandler", f = "ManualConnectionInputHandler.kt", l = {57}, m = "validateThenConnect")
    public static final class QnHx extends b90 {
        public fo1 A;
        public String B;
        public /* synthetic */ Object C;
        public int E;
        public t82 z;

        public QnHx(z80<? super QnHx> z80Var) {
            super(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) {
            this.C = obj;
            this.E |= Integer.MIN_VALUE;
            return t82.this.c(null, null, this);
        }
    }

    @if0(c = "com.copperleaf.ballast.UtilsKt$postInput$1", f = "utils.kt", l = {80}, m = "invokeSuspend")
    public static final class YKK extends px4 implements x81<gk4<k82, j82, l82>, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ Object C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public YKK(Object obj, z80 z80Var) {
            super(2, z80Var);
            this.C = obj;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            YKK ykk = new YKK(this.C, z80Var);
            ykk.B = obj;
            return ykk;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                gk4 gk4Var = (gk4) this.B;
                this.A = 1;
                if (gk4Var.n(this.C, this) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(gk4<k82, j82, l82> gk4Var, z80<? super sd5> z80Var) {
            return ((YKK) a(gk4Var, z80Var)).i(sd5.a);
        }
    }

    public t82(F7 f7, y50 y50Var) {
        this.a = f7;
        this.b = y50Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:53:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.eo1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(go1 go1Var, k82 k82Var, z80 z80Var) throws Throwable {
        m82 m82Var;
        String string;
        t82 t82Var;
        fo1<k82, j82, l82> fo1Var;
        i82 i82Var;
        Object objC;
        if (z80Var instanceof m82) {
            m82Var = (m82) z80Var;
            int i = m82Var.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                m82Var.E = i - Integer.MIN_VALUE;
            } else {
                m82Var = new m82(this, z80Var);
            }
        } else {
            m82Var = new m82(this, z80Var);
        }
        Object objR = m82Var.C;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        switch (m82Var.E) {
            case 0:
                C0239D.H(objR);
                if (k82Var instanceof k82.LPt8Fixed) {
                    go1Var.p("initialize", new r82(this, null));
                    return sd5.a;
                }
                if (k82Var instanceof k82.NUlFixed) {
                    n82 n82Var = new n82(k82Var);
                    m82Var.E = 1;
                    if (go1Var.s(n82Var) == va0Var) {
                        return va0Var;
                    }
                    return sd5.a;
                }
                if (!(k82Var instanceof k82.F1)) {
                    if (ur1.a(k82Var, k82.CQf.a)) {
                        m82Var.E = 4;
                        if (go1Var.s(o82.w) == va0Var) {
                            return va0Var;
                        }
                        return sd5.a;
                    }
                    if (ur1.a(k82Var, k82.QnHx.a)) {
                        m82Var.E = 5;
                        if (go1Var.s(p82.w) == va0Var) {
                            return va0Var;
                        }
                        return sd5.a;
                    }
                    if (!(k82Var instanceof k82.YKK)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    m82Var.E = 6;
                    if (go1Var.s(q82.w) == va0Var) {
                        return va0Var;
                    }
                    return sd5.a;
                }
                string = mv4.W(((k82.F1) k82Var).a).toString();
                m82Var.z = this;
                m82Var.A = go1Var;
                m82Var.B = string;
                m82Var.E = 2;
                objR = go1Var.r();
                if (objR == va0Var) {
                    return va0Var;
                }
                t82Var = this;
                fo1Var = go1Var;
                i82Var = ((l82) objR).c;
                m82Var.z = null;
                m82Var.A = null;
                m82Var.B = null;
                m82Var.E = 3;
                t82Var.getClass();
                if (!ur1.a(i82Var, i82.QnHx.a)) {
                    objC = sd5.a;
                } else if (ur1.a(i82Var, i82.CQf.a)) {
                    objC = t82Var.c(fo1Var, string, m82Var);
                    if (objC != va0Var) {
                        objC = sd5.a;
                    }
                } else {
                    if (ur1.a(i82Var, i82.F1.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objC = t82Var.c(fo1Var, string, m82Var);
                    if (objC != va0Var) {
                        objC = sd5.a;
                    }
                }
                if (objC == va0Var) {
                    return va0Var;
                }
                return sd5.a;
            case 1:
                C0239D.H(objR);
                return sd5.a;
            case 2:
                String str = m82Var.B;
                fo1<k82, j82, l82> fo1Var2 = m82Var.A;
                t82 t82Var2 = m82Var.z;
                C0239D.H(objR);
                string = str;
                fo1Var = fo1Var2;
                t82Var = t82Var2;
                i82Var = ((l82) objR).c;
                m82Var.z = null;
                m82Var.A = null;
                m82Var.B = null;
                m82Var.E = 3;
                t82Var.getClass();
                if (!ur1.a(i82Var, i82.QnHx.a)) {
                    objC = sd5.a;
                } else if (ur1.a(i82Var, i82.CQf.a)) {
                    objC = t82Var.c(fo1Var, string, m82Var);
                    if (objC != va0Var) {
                        objC = sd5.a;
                    }
                } else {
                    if (ur1.a(i82Var, i82.F1.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    objC = t82Var.c(fo1Var, string, m82Var);
                    if (objC != va0Var) {
                        objC = sd5.a;
                    }
                }
                if (objC == va0Var) {
                    return va0Var;
                }
                return sd5.a;
            case 3:
                C0239D.H(objR);
                return sd5.a;
            case 4:
                C0239D.H(objR);
                return sd5.a;
            case 5:
                C0239D.H(objR);
                return sd5.a;
            case 6:
                C0239D.H(objR);
                return sd5.a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(fo1<k82, j82, l82> fo1Var, String str, z80<? super sd5> z80Var) throws Throwable {
        QnHx qnHx;
        t82 t82Var;
        if (z80Var instanceof QnHx) {
            qnHx = (QnHx) z80Var;
            int i = qnHx.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                qnHx.E = i - Integer.MIN_VALUE;
            } else {
                qnHx = new QnHx(z80Var);
            }
        } else {
            qnHx = new QnHx(z80Var);
        }
        Object objA = qnHx.C;
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i2 = qnHx.E;
        if (i2 == 0) {
            C0239D.H(objA);
            qnHx.z = this;
            qnHx.A = fo1Var;
            qnHx.B = str;
            qnHx.E = 1;
            objA = this.a.a(str, qnHx);
            if (objA == va0Var) {
                return va0Var;
            }
            t82Var = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = qnHx.B;
            fo1Var = qnHx.A;
            t82Var = qnHx.z;
            C0239D.H(objA);
        }
        F7.QnHx qnHx2 = (F7.QnHx) objA;
        if (ur1.a(qnHx2, F7.QnHx.CQf.a)) {
            fo1Var.p("connect", t82Var.new CQf(str, null));
        } else if (ur1.a(qnHx2, F7.QnHx.C0003QnHx.a)) {
            a62.a.f("clicked_on_connect", F1.w);
            k82.QnHx qnHx3 = k82.QnHx.a;
            fo1Var.p(qnHx3.toString(), new NUlFixed(qnHx3, null));
        } else if (ur1.a(qnHx2, F7.QnHx.F1.a)) {
            a62.a.f("clicked_on_connect", LPt8Fixed.w);
            k82.CQf cQf = k82.CQf.a;
            fo1Var.p(cQf.toString(), new YKK(cQf, null));
        }
        return sd5.a;
    }
}
