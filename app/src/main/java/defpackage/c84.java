package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2", f = "SelectionManager.kt", l = {619}, m = "invokeSuspend")
public final class c84 extends px4 implements x81<l93, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ j81<kt2, sd5> C;

    @if0(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2$1", f = "SelectionManager.kt", l = {620}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ l93 B;
        public final /* synthetic */ j81<kt2, sd5> C;

        /* JADX INFO: renamed from: c84$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "androidx.compose.foundation.text.selection.SelectionManager$detectNonConsumingTap$2$1$1", f = "SelectionManager.kt", l = {621}, m = "invokeSuspend")
        public static final class C0063QnHx extends eq3 implements x81<a5, z80<? super sd5>, Object> {
            public final /* synthetic */ j81<kt2, sd5> A;
            public int y;
            public /* synthetic */ Object z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0063QnHx(j81<? super kt2, sd5> j81Var, z80<? super C0063QnHx> z80Var) {
                super(2, z80Var);
                this.A = j81Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                C0063QnHx c0063QnHx = new C0063QnHx(this.A, z80Var);
                c0063QnHx.z = obj;
                return c0063QnHx;
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                va0 va0Var = va0.COROUTINE_SUSPENDED;
                int i = this.y;
                if (i == 0) {
                    C0239D.H(obj);
                    a5 a5Var = (a5) this.z;
                    this.y = 1;
                    obj = p05.e(a5Var, this);
                    if (obj == va0Var) {
                        return va0Var;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                d93 d93Var = (d93) obj;
                if (d93Var != null) {
                    this.A.invoke(new kt2(d93Var.c));
                }
                return sd5.a;
            }

            @Override // defpackage.x81
            public final Object invoke(a5 a5Var, z80<? super sd5> z80Var) {
                return ((C0063QnHx) a(a5Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(l93 l93Var, j81<? super kt2, sd5> j81Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = l93Var;
            this.C = j81Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return new QnHx(this.B, this.C, z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                C0063QnHx c0063QnHx = new C0063QnHx(this.C, null);
                this.A = 1;
                if (this.B.i0(c0063QnHx, this) == va0Var) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c84(j81<? super kt2, sd5> j81Var, z80<? super c84> z80Var) {
        super(2, z80Var);
        this.C = j81Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        c84 c84Var = new c84(this.C, z80Var);
        c84Var.B = obj;
        return c84Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            QnHx qnHx = new QnHx((l93) this.B, this.C, null);
            this.A = 1;
            if (fp1.R(qnHx, this) == va0Var) {
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
        return ((c84) a(l93Var, z80Var)).i(sd5.a);
    }
}
