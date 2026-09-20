package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", f = "SelectionManager.kt", l = {630}, m = "invokeSuspend")
public final class i84 extends px4 implements x81<l93, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ b84 C;
    public final /* synthetic */ h81<sd5> D;

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
    public i84(b84 b84Var, h81<sd5> h81Var, z80<? super i84> z80Var) {
        super(2, z80Var);
        this.C = b84Var;
        this.D = h81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        i84 i84Var = new i84(this.C, this.D, z80Var);
        i84Var.B = obj;
        return i84Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            l93 l93Var = (l93) this.B;
            QnHx qnHx = new QnHx(this.D);
            this.A = 1;
            this.C.getClass();
            Object objB = b51.b(l93Var, new c84(qnHx, null), this);
            if (objB != obj2) {
                objB = sd5.a;
            }
            if (objB == obj2) {
                return obj2;
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
        return ((i84) a(l93Var, z80Var)).i(sd5.a);
    }
}
