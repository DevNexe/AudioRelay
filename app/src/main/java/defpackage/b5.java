package defpackage;

import androidx.activity.OnBackPressedDispatcher;

/* JADX INFO: loaded from: classes.dex */
public final class b5 {

    public static final class CQf extends cx1 implements j81<zl0, yl0> {
        public final /* synthetic */ OnBackPressedDispatcher w;
        public final /* synthetic */ d32 x;
        public final /* synthetic */ LPt8Fixed y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(OnBackPressedDispatcher onBackPressedDispatcher, d32 d32Var, LPt8Fixed lPt8) {
            super(1);
            this.w = onBackPressedDispatcher;
            this.x = d32Var;
            this.y = lPt8;
        }

        @Override // defpackage.j81
        public final yl0 invoke(zl0 zl0Var) {
            OnBackPressedDispatcher onBackPressedDispatcher = this.w;
            d32 d32Var = this.x;
            LPt8Fixed lPt8 = this.y;
            onBackPressedDispatcher.a(d32Var, lPt8);
            return new d5(lPt8);
        }
    }

    public static final class F1 extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ h81<sd5> x;
        public final /* synthetic */ int y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F1(boolean z, h81<sd5> h81Var, int i, int i2) {
            super(2);
            this.w = z;
            this.x = h81Var;
            this.y = i;
            this.z = i2;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.y | 1;
            b5.a(this.w, this.x, g30Var, i, this.z);
            return sd5.a;
        }
    }

    public static final class LPt8Fixed extends hu2 {
        public final /* synthetic */ is4<h81<sd5>> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LPt8Fixed(ri2 ri2Var, boolean z) {
            super(z);
            this.c = ri2Var;
        }

        @Override // defpackage.hu2
        public final void a() {
            this.c.getValue().invoke();
        }
    }

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ LPt8Fixed w;
        public final /* synthetic */ boolean x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(LPt8Fixed lPt8, boolean z) {
            super(0);
            this.w = lPt8;
            this.x = z;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.a = this.x;
            return sd5.a;
        }
    }

    public static final void a(boolean z, h81<sd5> h81Var, g30 g30Var, int i, int i2) {
        int i3;
        j30 j30VarQ = g30Var.q(-361453782);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (j30VarQ.c(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= j30VarQ.I(h81Var) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && j30VarQ.t()) {
            j30VarQ.x();
        } else {
            if (i4 != 0) {
                z = true;
            }
            ri2 ri2VarF0 = ps0.f0(h81Var, j30VarQ);
            j30VarQ.e(-3687241);
            Object objB0 = j30VarQ.b0();
            g30.QnHx.C0132QnHx c0132QnHx = g30.QnHx.a;
            if (objB0 == c0132QnHx) {
                objB0 = new LPt8Fixed(ri2VarF0, z);
                j30VarQ.F0(objB0);
            }
            j30VarQ.R(false);
            LPt8Fixed lPt8 = (LPt8Fixed) objB0;
            Boolean boolValueOf = Boolean.valueOf(z);
            j30VarQ.e(-3686552);
            boolean zI = j30VarQ.I(boolValueOf) | j30VarQ.I(lPt8);
            Object objB1 = j30VarQ.b0();
            if (zI || objB1 == c0132QnHx) {
                objB1 = new QnHx(lPt8, z);
                j30VarQ.F0(objB1);
            }
            j30VarQ.R(false);
            wq0.h((h81) objB1, j30VarQ);
            iu2 iu2VarA = v42.a(j30VarQ);
            if (iu2VarA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
            OnBackPressedDispatcher onBackPressedDispatcherE = iu2VarA.e();
            d32 d32Var = (d32) j30VarQ.E(Ll.d);
            wq0.b(d32Var, onBackPressedDispatcherE, new CQf(onBackPressedDispatcherE, d32Var, lPt8), j30VarQ);
        }
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new F1(z, h81Var, i, i2);
    }
}
