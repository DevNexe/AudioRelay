package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lv3 implements mz0<le2> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ me2 x;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;
        public final /* synthetic */ me2 x;

        /* JADX INFO: renamed from: lv3$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$createMicEffectStream$$inlined$map$1$2", f = "RunningAndroidServerInputHandler.kt", l = {224}, m = "emit")
        public static final class C0165QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0165QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var, me2 me2Var) {
            this.w = nz0Var;
            this.x = me2Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0165QnHx c0165QnHx;
            if (z80Var instanceof C0165QnHx) {
                c0165QnHx = (C0165QnHx) z80Var;
                int i = c0165QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0165QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0165QnHx = new C0165QnHx(z80Var);
                }
            } else {
                c0165QnHx = new C0165QnHx(z80Var);
            }
            Object obj2 = c0165QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0165QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                me2 me2Var = this.x;
                le2 le2Var = new le2(me2Var.a, ((Boolean) obj).booleanValue(), me2Var.c);
                c0165QnHx.A = 1;
                if (this.w.f(le2Var, c0165QnHx) == va0Var) {
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

    public lv3(am amVar, me2 me2Var) {
        this.w = amVar;
        this.x = me2Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super le2> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var, this.x), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
