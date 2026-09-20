package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class k45 {

    public static final class CQf extends cx1 implements x81<g30, Integer, sd5> {
        public final /* synthetic */ boolean w;
        public final /* synthetic */ np3 x;
        public final /* synthetic */ j45 y;
        public final /* synthetic */ int z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CQf(boolean z, np3 np3Var, j45 j45Var, int i) {
            super(2);
            this.w = z;
            this.x = np3Var;
            this.y = j45Var;
            this.z = i;
        }

        @Override // defpackage.x81
        public final sd5 invoke(g30 g30Var, Integer num) {
            num.intValue();
            int i = this.z | 1;
            np3 np3Var = this.x;
            j45 j45Var = this.y;
            k45.a(this.w, np3Var, j45Var, g30Var, i);
            return sd5.a;
        }
    }

    public /* synthetic */ class F1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[eb1.values().length];
            iArr[0] = 1;
            iArr[1] = 2;
            iArr[2] = 3;
            a = iArr;
        }
    }

    @if0(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1", f = "TextFieldSelectionManager.kt", l = {818}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<l93, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ g25 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(g25 g25Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = g25Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                l93 l93Var = (l93) this.B;
                this.A = 1;
                if (g62.a(l93Var, this.C, this) == va0Var) {
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
        public final Object invoke(l93 l93Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(l93Var, z80Var)).i(sd5.a);
        }
    }

    public static final void a(boolean z, np3 np3Var, j45 j45Var, g30 g30Var, int i) {
        j30 j30VarQ = g30Var.q(-1344558920);
        Boolean boolValueOf = Boolean.valueOf(z);
        j30VarQ.e(511388516);
        boolean zI = j30VarQ.I(boolValueOf) | j30VarQ.I(j45Var);
        Object objB0 = j30VarQ.b0();
        if (zI || objB0 == g30.QnHx.a) {
            objB0 = new i45(j45Var, z);
            j30VarQ.F0(objB0);
        }
        j30VarQ.R(false);
        g25 g25Var = (g25) objB0;
        int i2 = i << 3;
        ukJW.c(j45Var.i(z), z, np3Var, s55.f(j45Var.j().b), tx4.a(pg2.QnHx.w, g25Var, new QnHx(g25Var, null)), null, j30VarQ, (i2 & 112) | 196608 | (i2 & 896));
        tk3 tk3VarU = j30VarQ.U();
        if (tk3VarU == null) {
            return;
        }
        tk3VarU.d = new CQf(z, np3Var, j45Var, i);
    }

    public static final boolean b(j45 j45Var, boolean z) {
        iy1 iy1Var;
        u45 u45Var = j45Var.d;
        if (u45Var == null || (iy1Var = u45Var.f) == null) {
            return false;
        }
        return j84.b(j45Var.i(z), j84.d(iy1Var));
    }
}
