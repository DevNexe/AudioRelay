package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aw3 implements mz0<kc4> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ gx3 x;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;
        public final /* synthetic */ gx3 x;

        /* JADX INFO: renamed from: aw3$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$$inlined$map$13$2", f = "RunningAndroidServerInputHandler.kt", l = {224}, m = "emit")
        public static final class C0042QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0042QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var, gx3 gx3Var) {
            this.w = nz0Var;
            this.x = gx3Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0042QnHx c0042QnHx;
            if (z80Var instanceof C0042QnHx) {
                c0042QnHx = (C0042QnHx) z80Var;
                int i = c0042QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0042QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0042QnHx = new C0042QnHx(z80Var);
                }
            } else {
                c0042QnHx = new C0042QnHx(z80Var);
            }
            Object obj2 = c0042QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0042QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                uy2 uy2Var = (uy2) obj;
                String str = (String) uy2Var.w;
                hn2 hn2Var = (hn2) uy2Var.x;
                this.x.getClass();
                kc4 kc4Var = new kc4(str, new kj1(hn2Var.b));
                c0042QnHx.A = 1;
                if (this.w.f(kc4Var, c0042QnHx) == va0Var) {
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

    public aw3(am amVar, gx3 gx3Var) {
        this.w = amVar;
        this.x = gx3Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super kc4> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var, this.x), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
