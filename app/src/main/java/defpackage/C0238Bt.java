package defpackage;

/* JADX INFO: renamed from: B€t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0238Bt implements mz0<VV4.RBi> {
    public final /* synthetic */ mz0 w;

    /* JADX INFO: renamed from: B€t$QnHx */
    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: B€t$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.server.ui.AndroidServerInputHandler$loadInitialStream$$inlined$map$1$2", f = "AndroidServerInputHandler.kt", l = {224}, m = "emit")
        public static final class C0000QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0000QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var) {
            this.w = nz0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0000QnHx c0000QnHx;
            if (z80Var instanceof C0000QnHx) {
                c0000QnHx = (C0000QnHx) z80Var;
                int i = c0000QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0000QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0000QnHx = new C0000QnHx(z80Var);
                }
            } else {
                c0000QnHx = new C0000QnHx(z80Var);
            }
            Object obj2 = c0000QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0000QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                VV4.RBi rBi = new VV4.RBi((df4) obj);
                c0000QnHx.A = 1;
                if (this.w.f(rBi, c0000QnHx) == va0Var) {
                    return va0Var;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj2);
            }
            return sd5.a;
        }
    }

    public C0238Bt(am amVar) {
        this.w = amVar;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super VV4.RBi> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
