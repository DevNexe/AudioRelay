package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1", f = "FloatingActionButton.kt", l = {273}, m = "invokeSuspend")
public final class ug0 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ wp1 B;
    public final /* synthetic */ wp4<vp1> C;

    public static final class QnHx implements nz0<vp1> {
        public final /* synthetic */ wp4<vp1> w;

        public QnHx(wp4<vp1> wp4Var) {
            this.w = wp4Var;
        }

        @Override // defpackage.nz0
        public final Object f(vp1 vp1Var, z80 z80Var) {
            vp1 vp1Var2 = vp1Var;
            boolean z = vp1Var2 instanceof hd1;
            wp4<vp1> wp4Var = this.w;
            if (z) {
                wp4Var.add(vp1Var2);
            } else if (vp1Var2 instanceof id1) {
                wp4Var.remove(((id1) vp1Var2).a);
            } else if (vp1Var2 instanceof j21) {
                wp4Var.add(vp1Var2);
            } else if (vp1Var2 instanceof k21) {
                wp4Var.remove(((k21) vp1Var2).a);
            } else if (vp1Var2 instanceof qd3) {
                wp4Var.add(vp1Var2);
            } else if (vp1Var2 instanceof rd3) {
                wp4Var.remove(((rd3) vp1Var2).a);
            } else if (vp1Var2 instanceof pd3) {
                wp4Var.remove(((pd3) vp1Var2).a);
            }
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ug0(wp1 wp1Var, wp4<vp1> wp4Var, z80<? super ug0> z80Var) {
        super(2, z80Var);
        this.B = wp1Var;
        this.C = wp4Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new ug0(this.B, this.C, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nj4 nj4VarA = this.B.a();
            QnHx qnHx = new QnHx(this.C);
            this.A = 1;
            nj4VarA.getClass();
            if (nj4.n(nj4VarA, qnHx, this) == va0Var) {
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
        return ((ug0) a(ua0Var, z80Var)).i(sd5.a);
    }
}
