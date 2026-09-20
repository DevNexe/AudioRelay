package defpackage;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.baselibrary.coroutines.CoroutineExtKt$throttleLatest$1", f = "CoroutineExt.kt", l = {17}, m = "invokeSuspend")
public final class sa0 extends px4 implements x81<nz0<Object>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ mz0<Object> C;
    public final /* synthetic */ long D;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0<T> w;
        public final /* synthetic */ long x;

        /* JADX INFO: renamed from: sa0$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.baselibrary.coroutines.CoroutineExtKt$throttleLatest$1$1", f = "CoroutineExt.kt", l = {18, 19}, m = "emit")
        public static final class C0197QnHx extends b90 {
            public /* synthetic */ Object A;
            public final /* synthetic */ QnHx<T> B;
            public int C;
            public QnHx z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0197QnHx(QnHx<? super T> qnHx, z80<? super C0197QnHx> z80Var) {
                super(z80Var);
                this.B = qnHx;
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.A = obj;
                this.C |= Integer.MIN_VALUE;
                return this.B.f(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public QnHx(nz0<? super T> nz0Var, long j) {
            this.w = nz0Var;
            this.x = j;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(T t, z80<? super sd5> z80Var) throws Throwable {
            C0197QnHx c0197QnHx;
            QnHx<T> qnHx;
            if (z80Var instanceof C0197QnHx) {
                c0197QnHx = (C0197QnHx) z80Var;
                int i = c0197QnHx.C;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0197QnHx.C = i - Integer.MIN_VALUE;
                } else {
                    c0197QnHx = new C0197QnHx(this, z80Var);
                }
            } else {
                c0197QnHx = new C0197QnHx(this, z80Var);
            }
            Object obj = c0197QnHx.A;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0197QnHx.C;
            if (i2 != 0) {
                if (i2 == 1) {
                    qnHx = c0197QnHx.z;
                    C0239D.H(obj);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj);
                }
                return sd5.a;
            }
            C0239D.H(obj);
            c0197QnHx.z = this;
            c0197QnHx.C = 1;
            if (this.w.f(t, c0197QnHx) == va0Var) {
                return va0Var;
            }
            qnHx = this;
            long j = qnHx.x;
            c0197QnHx.z = null;
            c0197QnHx.C = 2;
            if (S12N.f(j, c0197QnHx) == va0Var) {
                return va0Var;
            }
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sa0(mz0<Object> mz0Var, long j, z80<? super sa0> z80Var) {
        super(2, z80Var);
        this.C = mz0Var;
        this.D = j;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        sa0 sa0Var = new sa0(this.C, this.D, z80Var);
        sa0Var.B = obj;
        return sa0Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nz0 nz0Var = (nz0) this.B;
            mz0 mz0VarB = kd.b(this.C, -1);
            QnHx qnHx = new QnHx(nz0Var, this.D);
            this.A = 1;
            if (mz0VarB.a(qnHx, this) == va0Var) {
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
    public final Object invoke(nz0<Object> nz0Var, z80<? super sd5> z80Var) {
        return ((sa0) a(nz0Var, z80Var)).i(sd5.a);
    }
}
