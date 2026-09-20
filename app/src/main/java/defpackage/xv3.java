package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xv3 implements mz0<ev3.F1> {
    public final /* synthetic */ mz0 w;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: xv3$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$$inlined$map$10$2", f = "RunningAndroidServerInputHandler.kt", l = {224}, m = "emit")
        public static final class C0223QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0223QnHx(z80 z80Var) {
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
            C0223QnHx c0223QnHx;
            if (z80Var instanceof C0223QnHx) {
                c0223QnHx = (C0223QnHx) z80Var;
                int i = c0223QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0223QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0223QnHx = new C0223QnHx(z80Var);
                }
            } else {
                c0223QnHx = new C0223QnHx(z80Var);
            }
            Object obj2 = c0223QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0223QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                ev3.F1 f1 = new ev3.F1((wb4) obj);
                c0223QnHx.A = 1;
                if (this.w.f(f1, c0223QnHx) == va0Var) {
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

    public xv3(jw3 jw3Var) {
        this.w = jw3Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super ev3.F1> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
