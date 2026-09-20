package defpackage;

import androidx.lifecycle.auxFixed;

/* JADX INFO: loaded from: classes.dex */
public final class w22 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ auxFixed w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(auxFixed auxVar, int i) {
            super(2);
            this.w = auxVar;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            w22.a(this.w, g30Var, i);
            return sd5.a;
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ h81<sd5> w;
        public final /* synthetic */ int x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(h81<sd5> h81Var, int i) {
            super(2);
            this.w = h81Var;
            this.x = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.x | 1;
            w22.b(this.w, g30Var, i);
            return sd5.a;
        }
    }

    @if0(c = "com.azefsw.audioconnect.compose.LifeCycleKt$ResumedOnly$1$1", f = "LifeCycle.kt", l = {46}, m = "invokeSuspend")
    public static final class LPt8Fixed extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ boolean B;
        public final /* synthetic */ long C;
        public final /* synthetic */ ri2<Boolean> D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(boolean z, long j, ri2<Boolean> ri2Var, z80<? super LPt8Fixed> z80Var) {
            super(2, z80Var);
            this.B = z;
            this.C = j;
            this.D = ri2Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new LPt8Fixed(this.B, this.C, this.D, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            boolean z = this.B;
            if (i == 0) {
                C0239D.H(obj);
                if (z) {
                    this.A = 1;
                    if (S12N.e(this.C, this) == va0Var) {
                        return va0Var;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            this.D.setValue(Boolean.valueOf(z));
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((LPt8Fixed) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public static final class NUlFixed extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ long w;
        public final /* synthetic */ x81<g30, Integer, sd5> x;
        public final /* synthetic */ int y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public NUlFixed(long j, x81<? super g30, ? super Integer, sd5> x81Var, int i) {
            super(2);
            this.w = j;
            this.x = x81Var;
            this.y = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            w22.c(this.w, this.x, g30Var, i);
            return sd5.a;
        }
    }

    public static final class QnHx extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ d32 w;
        public final /* synthetic */ auxFixed x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(d32 d32Var, auxFixed auxVar) {
            super(1);
            this.w = d32Var;
            this.x = auxVar;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            d32 d32Var = this.w;
            androidx.lifecycle.YKK ykkC = d32Var.c();
            auxFixed auxVar = this.x;
            ykkC.a(auxVar);
            return new v22(d32Var, auxVar);
        }
    }

    public /* synthetic */ class YKK {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[androidx.lifecycle.YKK.CQf.values().length];
            iArr[androidx.lifecycle.YKK.CQf.ON_RESUME.ordinal()] = 1;
            iArr[androidx.lifecycle.YKK.CQf.ON_PAUSE.ordinal()] = 2;
            a = iArr;
        }
    }

    public static final void a(auxFixed auxVar, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-1289053626);
        e40.CQf cQf = e40.a;
        d32 d32Var = (d32) j30VarQ.E(Ll.d);
        wq0.a(d32Var, new QnHx(d32Var, auxVar), j30VarQ);
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(auxVar, i);
    }

    public static final void b(h81<sd5> h81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(-1747300963);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.I(h81Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            ri2 ri2VarF0 = ps0.f0(h81Var, j30VarQ);
            j30VarQ.e(-492369756);
            Object objB0 = j30VarQ.b0();
            if (objB0 == g30.QnHx.a) {
                objB0 = new y24(ri2VarF0, 1);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            a((auxFixed) objB0, j30VarQ, 8);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(h81Var, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(long j, x81<? super g30, ? super Integer, sd5> x81Var, g30 g30Var, int i) {
        int i2;
        j30 j30VarQ = g30Var.q(261880300);
        if ((i & 14) == 0) {
            i2 = (j30VarQ.j(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= j30VarQ.I(x81Var) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            e40.CQf cQf = e40.a;
            j30VarQ.e(1653039663);
            j30VarQ.e(-492369756);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = ps0.R(Boolean.FALSE);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            ri2 ri2Var = (ri2) objB0;
            j30VarQ.e(-492369756);
            Object objB1 = j30VarQ.b0();
            if (objB1 == c0132QnHx) {
                objB1 = new qk2(ri2Var, 1);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            a((auxFixed) objB1, j30VarQ, 8);
            boolean zBooleanValue = ((Boolean) ri2Var.getValue()).booleanValue();
            j30VarQ.R(false);
            j30VarQ.e(-492369756);
            Object objB2 = j30VarQ.b0();
            if (objB2 == c0132QnHx) {
                objB2 = ps0.R(Boolean.FALSE);
                j30VarQ.F0(objB2);
            }
            j30VarQ.R(false);
            ri2 ri2Var2 = (ri2) objB2;
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
            Long lValueOf = Long.valueOf(j);
            j30VarQ.e(1618982084);
            boolean zI = j30VarQ.I(boolValueOf2) | j30VarQ.I(lValueOf) | j30VarQ.I(ri2Var2);
            Object objB3 = j30VarQ.b0();
            if (zI || objB3 == c0132QnHx) {
                LPt8Fixed lPt8 = new LPt8Fixed(zBooleanValue, j, ri2Var2, null);
                j30VarQ.F0(lPt8);
                objB3 = lPt8;
            }
            j30VarQ.R(false);
            wq0.d(boolValueOf, (x81) objB3, j30VarQ);
            if (((Boolean) ri2Var2.getValue()).booleanValue()) {
                x81Var.invoke(j30VarQ, Integer.valueOf((i2 >> 3) & 14));
            }
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new NUlFixed(j, x81Var, i);
    }
}
