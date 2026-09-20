package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3;
import androidx.lifecycle.YKK;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.copperleaf.ballast.core.AndroidViewModel$attachEventHandlerOnLifecycle$1$1", f = "AndroidViewModel.kt", l = {54}, m = "invokeSuspend")
public final class gt extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ d32 B;
    public final /* synthetic */ YKK.F1 C;
    public final /* synthetic */ ZUx<Object, Object, Object> D;
    public final /* synthetic */ bu0<Object, Object, Object> E;

    @if0(c = "com.copperleaf.ballast.core.AndroidViewModel$attachEventHandlerOnLifecycle$1$1$1", f = "AndroidViewModel.kt", l = {55}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;
        public final /* synthetic */ ZUx<Object, Object, Object> B;
        public final /* synthetic */ bu0<Object, Object, Object> C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ZUx<Object, Object, Object> zUx, bu0<Object, Object, Object> bu0Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.B = zUx;
            this.C = bu0Var;
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
                v7<Object, Object, Object> v7Var = this.B.d;
                this.A = 1;
                if (v7Var.m(this.C, this) == va0Var) {
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
    public gt(d32 d32Var, YKK.F1 f1, ZUx<Object, Object, Object> zUx, bu0<Object, Object, Object> bu0Var, z80<? super gt> z80Var) {
        super(2, z80Var);
        this.B = d32Var;
        this.C = f1;
        this.D = zUx;
        this.E = bu0Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new gt(this.B, this.C, this.D, this.E, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        Object objR;
        Object obj2 = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            YKK ykkC = this.B.c();
            QnHx qnHx = new QnHx(this.D, this.E, null);
            this.A = 1;
            YKK.F1 f1 = YKK.F1.INITIALIZED;
            YKK.F1 f2 = this.C;
            if (!(f2 != f1)) {
                throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
            }
            if (ykkC.b() == YKK.F1.DESTROYED || (objR = fp1.R(new RepeatOnLifecycleKt$repeatOnLifecycle$3(ykkC, f2, qnHx, null), this)) != obj2) {
                objR = sd5.a;
            }
            if (objR == obj2) {
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
    public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
        return ((gt) a(ua0Var, z80Var)).i(sd5.a);
    }
}
