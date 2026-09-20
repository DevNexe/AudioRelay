package defpackage;

import android.content.Context;
import com.azefsw.audioconnect.R;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class yt3 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ il2 A;
        public final /* synthetic */ xv0 B;
        public final /* synthetic */ wk2 w;
        public final /* synthetic */ r34 x;
        public final /* synthetic */ ri2<ou3> y;
        public final /* synthetic */ is4<String> z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(wk2 wk2Var, r34 r34Var, ri2 ri2Var, ri2 ri2Var2, il2 il2Var, xv0 xv0Var) {
            super(2);
            this.w = wk2Var;
            this.x = r34Var;
            this.y = ri2Var;
            this.z = ri2Var2;
            this.A = il2Var;
            this.B = xv0Var;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            g30 g30Var2 = g30Var;
            if ((num.intValue() & 11) == 2 && g30Var2.t()) {
                g30Var2.x();
            } else {
                e40.CQf cQf = e40.a;
                q40.a(new ng3[]{u42.a.b(this.w)}, X.m(g30Var2, -215748869, new cu3(this.x, this.y, this.z, this.A, this.B)), g30Var2, 56);
            }
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ int w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(int i) {
            super(2);
            this.w = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            yt3.a(g30Var, this.w | 1);
            return sd5.a;
        }
    }

    @if0(c = "com.azefsw.audioconnect.root.ui.RootViewKt$RootView$1", f = "RootView.kt", l = {74}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ il2 B;
        public final /* synthetic */ qu3 C;
        public final /* synthetic */ ri2<ou3> D;

        /* JADX INFO: renamed from: yt3$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0227QnHx implements nz0<ou3> {
            public final /* synthetic */ qu3 w;
            public final /* synthetic */ ri2<ou3> x;

            public C0227QnHx(qu3 qu3Var, ri2<ou3> ri2Var) {
                this.w = qu3Var;
                this.x = ri2Var;
            }

            @Override // defpackage.nz0
            public final Object f(ou3 ou3Var, z80 z80Var) {
                ou3 ou3Var2 = ou3Var;
                if (!(ou3Var2 instanceof ou3.byN)) {
                    a62 a62Var = a62.a;
                    ac.b.b.f(ou3Var2.b);
                }
                this.w.a(ou3Var2);
                this.x.setValue(ou3Var2);
                return sd5.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(il2 il2Var, qu3 qu3Var, ri2<ou3> ri2Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = il2Var;
            this.C = qu3Var;
            this.D = ri2Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, this.D, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                am amVarB = iE.b(new dr2(new vK0u(this.B, 4)).A(j54.b));
                C0227QnHx c0227QnHx = new C0227QnHx(this.C, this.D);
                this.A = 1;
                if (amVarB.a(c0227QnHx, this) == va0Var) {
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
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final void a(g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-364374661);
        if (i == 0 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            q72 q72VarA = q72.QnHx.a();
            j30VarQ.e(1157296644);
            boolean zI = j30VarQ.I(q72VarA);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (zI || objB0 == c0132QnHx) {
                objB0 = q72.QnHx.a().b;
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            xv0 xv0Var = (xv0) objB0;
            q72 q72VarA2 = q72.QnHx.a();
            j30VarQ.e(1157296644);
            boolean zI2 = j30VarQ.I(q72VarA2);
            Object objB1 = j30VarQ.b0();
            if (zI2 || objB1 == c0132QnHx) {
                objB1 = (qu3) q72.QnHx.a().a.c().x;
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            qu3 qu3Var = (qu3) objB1;
            q72 q72VarA3 = q72.QnHx.a();
            j30VarQ.e(1157296644);
            boolean zI3 = j30VarQ.I(q72VarA3);
            Object objB2 = j30VarQ.b0();
            if (zI3 || objB2 == c0132QnHx) {
                objB2 = (ln2) q72.QnHx.a().a.c().y;
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            ln2 ln2Var = (ln2) objB2;
            il2 il2VarD = g7.d(new zl2[0], j30VarQ);
            j30VarQ.e(1157296644);
            boolean zI4 = j30VarQ.I(il2VarD);
            Object objB3 = j30VarQ.b0();
            if (zI4 || objB3 == c0132QnHx) {
                objB3 = new wk2(il2VarD);
                j30VarQ.F0(objB3);
            }
            j30VarQ.R(false);
            wk2 wk2Var = (wk2) objB3;
            j30VarQ.e(-492369756);
            Object objB4 = j30VarQ.b0();
            if (objB4 == c0132QnHx) {
                objB4 = ps0.R(null);
                j30VarQ.F0(objB4);
            }
            j30VarQ.R(false);
            ri2 ri2Var = (ri2) objB4;
            r34 r34VarC = i34.c(j30VarQ);
            j30VarQ.e(773894976);
            j30VarQ.e(-492369756);
            Object objB5 = j30VarQ.b0();
            if (objB5 == c0132QnHx) {
                s40 s40Var = new s40(wq0.i(j30VarQ));
                j30VarQ.F0(s40Var);
                objB5 = s40Var;
            }
            j30VarQ.R(false);
            ua0 ua0Var = ((s40) objB5).w;
            j30VarQ.R(false);
            j30VarQ.e(511388516);
            boolean zI5 = j30VarQ.I(r34VarC) | j30VarQ.I(ua0Var);
            Object objB6 = j30VarQ.b0();
            if (zI5 || objB6 == c0132QnHx) {
                objB6 = new do4(ua0Var, r34VarC.b);
                j30VarQ.F0(objB6);
            }
            j30VarQ.R(false);
            do4 do4Var = (do4) objB6;
            j30VarQ.e(-444562913);
            j30VarQ.e(-1262693009);
            Context context = (Context) j30VarQ.E(Ll.b);
            j30VarQ.e(1157296644);
            boolean zI6 = j30VarQ.I(context);
            Object objB7 = j30VarQ.b0();
            if (zI6 || objB7 == c0132QnHx) {
                objB7 = t92.Q(new uy2(f83.Idle, ""), new uy2(f83.Connecting, context.getString(R.string.toolbar_connecting_subtitle)), new uy2(f83.Running, context.getString(R.string.toolbar_connected_subtitle)), new uy2(f83.Retrying, context.getString(R.string.toolbar_retrying_to_connect_subtitle)), new uy2(f83.Stopping, context.getString(R.string.toolbar_stopping_subtitle)));
                j30VarQ.F0(objB7);
            }
            j30VarQ.R(false);
            Map map = (Map) objB7;
            j30VarQ.R(false);
            c54 c54Var = j54.b;
            ds2 ds2VarF = ln2Var.f(c54Var);
            ds2VarF.getClass();
            hr2 hr2Var = new hr2(ds2VarF);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            if (timeUnit == null) {
                throw new NullPointerException("unit is null");
            }
            if (c54Var == null) {
                throw new NullPointerException("scheduler is null");
            }
            ri2 ri2VarS = ps0.s(iE.b(new cs2(new fr2(hr2Var, timeUnit, c54Var), new D(map, 20))), "", null, j30VarQ, 2);
            j30VarQ.R(false);
            wq0.e(il2VarD, qu3Var, new QnHx(il2VarD, qu3Var, ri2Var, null), j30VarQ);
            q40.a(new ng3[]{tn4.a.b(do4Var)}, X.m(j30VarQ, -1730954693, new CQf(wk2Var, r34VarC, ri2Var, ri2VarS, il2VarD, xv0Var)), j30VarQ, 56);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(i);
    }

    public static final void b(pg2 pg2Var, il2 il2Var, xv0 xv0Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(1713112444);
        e40.CQf cQf = e40.a;
        ou3.byN byn = ou3.byN.e;
        j30VarQ.e(1157296644);
        boolean zI = j30VarQ.I(xv0Var);
        Object objB0 = j30VarQ.b0();
        if (zI || objB0 == g30.QnHx.a) {
            objB0 = new wt3(xv0Var, i);
            j30VarQ.F0(objB0);
        }
        j30VarQ.R(false);
        ml2.b(il2Var, "main?destinationId={destinationId}", pg2Var, null, (j81) objB0, j30VarQ, ((i << 6) & 896) | 8, 8);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new xt3(pg2Var, il2Var, xv0Var, i);
    }

    public static final void c(y81 y81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(2121262131);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(y81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            pg2 pg2VarK = ps0.k(gm4.c, ((rv) j30VarQ.E(sv.a)).a(), el3.a);
            int i3 = (i2 << 9) & 7168;
            j30VarQ.e(733328855);
            rb2 rb2VarC = fe.c(One.QnHx.a, false, j30VarQ);
            j30VarQ.e(-1323940314);
            ij0 ij0Var = (ij0) j30VarQ.E(r40.e);
            jy1 jy1Var = (jy1) j30VarQ.E(r40.k);
            ti5 ti5Var = (ti5) j30VarQ.E(r40.o);
            a30.e.getClass();
            yy1.QnHx qnHx = a30.QnHx.b;
            sz szVarJ = S12N.j(pg2VarK);
            int i4 = ((((i3 << 3) & 112) << 9) & 7168) | 6;
            if (!(j30VarQ.a instanceof jE)) {
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
            hH.u(j30VarQ, rb2VarC, a30.QnHx.e);
            hH.u(j30VarQ, ij0Var, a30.QnHx.d);
            hH.u(j30VarQ, jy1Var, a30.QnHx.f);
            szVarJ.invoke(sN.a(j30VarQ, ti5Var, a30.QnHx.g, j30VarQ), j30VarQ, Integer.valueOf((i4 >> 3) & 112));
            j30VarQ.e(2058660585);
            j30VarQ.e(-2137368960);
            if (((i4 >> 9) & 14 & 11) == 2 && j30VarQ.t()) {
                j30VarQ.x();
            } else {
                y81Var.invoke(le.a, j30VarQ, Integer.valueOf(((i3 >> 6) & 112) | 6));
            }
            O.g(j30VarQ, false, false, true, false);
            j30VarQ.R(false);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new du3(y81Var, i);
    }

    public static void d(gl2 gl2Var, ou3 ou3Var, sz szVar) {
        cs0 cs0Var = cs0.w;
        XTd3.g(gl2Var, ou3Var.a, cs0Var, cs0Var, X.n(1421328609, new fu3(szVar), true));
    }
}
