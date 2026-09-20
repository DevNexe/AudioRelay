package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class r01 implements mz0<Object> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ x81 x;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;
        public final /* synthetic */ x81 x;

        /* JADX INFO: renamed from: r01$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {223, 224}, m = "emit")
        public static final class C0186QnHx extends b90 {
            public int A;
            public Object C;
            public nz0 D;
            public /* synthetic */ Object z;

            public C0186QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var, x81 x81Var) {
            this.w = nz0Var;
            this.x = x81Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.nz0
        public final Object f(T t, z80<? super sd5> z80Var) throws Throwable {
            C0186QnHx c0186QnHx;
            Object obj;
            nz0 nz0Var;
            if (z80Var instanceof C0186QnHx) {
                c0186QnHx = (C0186QnHx) z80Var;
                int i = c0186QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0186QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0186QnHx = new C0186QnHx(z80Var);
                }
            } else {
                c0186QnHx = new C0186QnHx(z80Var);
            }
            Object obj2 = c0186QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0186QnHx.A;
            if (i2 != 0) {
                if (i2 == 1) {
                    nz0 nz0Var2 = c0186QnHx.D;
                    obj = c0186QnHx.C;
                    C0239D.H(obj2);
                    nz0Var = nz0Var2;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C0239D.H(obj2);
                }
                return sd5.a;
            }
            C0239D.H(obj2);
            c0186QnHx.C = t;
            nz0 nz0Var3 = this.w;
            c0186QnHx.D = nz0Var3;
            c0186QnHx.A = 1;
            if (this.x.invoke(t, c0186QnHx) == va0Var) {
                return va0Var;
            }
            obj = t;
            nz0Var = nz0Var3;
            c0186QnHx.C = null;
            c0186QnHx.D = null;
            c0186QnHx.A = 2;
            if (nz0Var.f(obj, c0186QnHx) == va0Var) {
                return va0Var;
            }
            return sd5.a;
        }
    }

    public r01(x81 x81Var, mz0 mz0Var) {
        this.w = mz0Var;
        this.x = x81Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super Object> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var, this.x), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
