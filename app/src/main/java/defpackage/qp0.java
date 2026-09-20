package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.material.DrawerKt$Scrim$dismissDrawer$1$1", f = "Drawer.kt", l = {664}, m = "invokeSuspend")
public final class qp0 extends px4 implements x81<l93, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ h81<sd5> C;

    public static final class QnHx extends cx1 implements j81<kt2, sd5> {
        public final /* synthetic */ h81<sd5> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(h81<sd5> h81Var) {
            super(1);
            this.w = h81Var;
        }

        @Override // defpackage.j81
        public final sd5 invoke(kt2 kt2Var) {
            long j = kt2Var.a;
            this.w.invoke();
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp0(h81<sd5> h81Var, z80<? super qp0> z80Var) {
        super(2, z80Var);
        this.C = h81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        qp0 qp0Var = new qp0(this.C, z80Var);
        qp0Var.B = obj;
        return qp0Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            l93 l93Var = (l93) this.B;
            QnHx qnHx = new QnHx(this.C);
            this.A = 1;
            if (p05.d(l93Var, null, qnHx, this, 7) == va0Var) {
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
        return ((qp0) a(l93Var, z80Var)).i(sd5.a);
    }
}
