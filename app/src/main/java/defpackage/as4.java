package defpackage;

import android.content.res.Configuration;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class as4 {

    public static final class CQf implements mz0<l65> {
        public final /* synthetic */ mz0 w;

        public static final class QnHx<T> implements nz0 {
            public final /* synthetic */ nz0 w;

            /* JADX INFO: renamed from: as4$CQf$QnHx$QnHx, reason: collision with other inner class name */
            @if0(c = "com.azefsw.audioconnect.startup.StartupViewKt$AppTheme$lambda-2$$inlined$map$1$2", f = "StartupView.kt", l = {224}, m = "emit")
            public static final class C0038QnHx extends b90 {
                public int A;
                public /* synthetic */ Object z;

                public C0038QnHx(z80 z80Var) {
                    super(z80Var);
                }

                @Override // defpackage.m8
                public final Object i(Object obj) {
                    this.z = obj;
                    this.A |= Integer.MIN_VALUE;
                    return QnHx.this.f(null, this);
                }
            }

            public QnHx(nz0 nz0Var) {
                this.w = nz0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.nz0
            public final Object f(Object obj, z80 z80Var) throws Throwable {
                C0038QnHx c0038QnHx;
                if (z80Var instanceof C0038QnHx) {
                    c0038QnHx = (C0038QnHx) z80Var;
                    int i = c0038QnHx.A;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0038QnHx.A = i - Integer.MIN_VALUE;
                    } else {
                        c0038QnHx = new C0038QnHx(z80Var);
                    }
                } else {
                    c0038QnHx = new C0038QnHx(z80Var);
                }
                Object obj2 = c0038QnHx.z;
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i2 = c0038QnHx.A;
                if (i2 == 0) {
                    C0239D.H(obj2);
                    c0038QnHx.A = 1;
                    if (this.w.f((l65) obj, c0038QnHx) == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj2);
                }
                return sd5.a;
            }
        }

        public CQf(am amVar) {
            this.w = amVar;
        }

        @Override // defpackage.mz0
        public final Object a(nz0<? super l65> nz0Var, z80 z80Var) {
            Object objA = this.w.a(new QnHx(nz0Var), z80Var);
            return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ zr4 w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(zr4 zr4Var) {
            super(2);
            this.w = zr4Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                zr4 zr4Var = this.w;
                lKy3 lky3 = zr4Var.a;
                g30Var2.e(1157296644);
                boolean zI = g30Var2.I(lky3);
                Object objF = g30Var2.f();
                if (zI || objF == g30.QnHx.a) {
                    objF = iE.b(new cs2(new cs2(lky3.i.a(null), new k71(26)), new KnU(28)));
                    g30Var2.B(objF);
                }
                g30Var2.G();
                gp2 gp2Var = gp2.a;
                rv2 rv2Var = (rv2) ps0.s((mz0) objF, gp2Var, null, g30Var2, 2).getValue();
                if (!ur1.a(rv2Var, gp2Var) && (rv2Var instanceof mq4)) {
                    if (((Boolean) ((mq4) rv2Var).a).booleanValue()) {
                        g30Var2.e(-1673613149);
                        wq0.a(sd5.a, new cs4(zr4Var), g30Var2);
                        zr1.c(new ds4(zr4Var), g30Var2, 0);
                        g30Var2.G();
                    } else {
                        g30Var2.e(-1673612721);
                        wq0.a(sd5.a, new fs4(zr4Var), g30Var2);
                        yt3.a(g30Var2, 0);
                        g30Var2.G();
                    }
                }
            }
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            as4.b(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ lKy3 w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(lKy3 lky3, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = lky3;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            as4.a(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0067  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(lKy3 lky3, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(2110481939);
        e40.CQf cQf = e40.a;
        j30VarQ.e(1157296644);
        boolean zI = j30VarQ.I(lky3);
        Object objB0 = j30VarQ.b0();
        if (zI || objB0 == g30.QnHx.a) {
            lky3.getClass();
            objB0 = new CQf(iE.b(lky3.j("THEME_PREF", null, new dKlF(lky3))));
            j30VarQ.F0(objB0);
        }
        boolean z = false;
        j30VarQ.R(false);
        l65 l65Var = l65.Dark;
        l65 l65Var2 = (l65) ps0.s((mz0) objB0, l65Var, null, j30VarQ, 2).getValue();
        if (l65Var2 == l65Var) {
            z = true;
        } else if (l65Var2 != l65.Light) {
            if (l65Var2 != l65.System) {
                throw new NoWhenBranchMatchedException();
            }
            if ((((Configuration) j30VarQ.E(Ll.a)).uiMode & 48) == 32) {
                z = true;
            }
        }
        fi.a(z, x81Var, j30VarQ, i & 112);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new QnHx(lky3, x81Var, i);
    }

    public static final void b(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-2012922010);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            q72 q72Var = q72.c;
            if (q72Var == null) {
                ur1.e("INSTANCE");
                throw null;
            }
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(q72Var);
            Object objB0 = j30VarQ.b0();
            if (zI || objB0 == g30.QnHx.a) {
                q72 q72Var2 = q72.c;
                if (q72Var2 == null) {
                    ur1.e("INSTANCE");
                    throw null;
                }
                objB0 = q72Var2.a.d();
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            zr4 zr4Var = (zr4) objB0;
            a(zr4Var.a, X.m(j30VarQ, 1864926940, new F1(zr4Var)), j30VarQ, 56);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new LPt8Fixed(i);
    }
}
