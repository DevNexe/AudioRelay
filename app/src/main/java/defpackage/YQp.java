package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class YQp implements mz0<VV4.MZ> {
    public final /* synthetic */ mz0 w;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: YQp$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.server.ui.AndroidServerInputHandler$loadInitialStream$$inlined$map$2$2", f = "AndroidServerInputHandler.kt", l = {224}, m = "emit")
        public static final class C0010QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0010QnHx(z80 z80Var) {
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
            C0010QnHx c0010QnHx;
            if (z80Var instanceof C0010QnHx) {
                c0010QnHx = (C0010QnHx) z80Var;
                int i = c0010QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0010QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0010QnHx = new C0010QnHx(z80Var);
                }
            } else {
                c0010QnHx = new C0010QnHx(z80Var);
            }
            Object obj2 = c0010QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0010QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                VV4.MZ mz = new VV4.MZ(((Boolean) obj).booleanValue());
                c0010QnHx.A = 1;
                if (this.w.f(mz, c0010QnHx) == va0Var) {
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

    public YQp(am amVar) {
        this.w = amVar;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super VV4.MZ> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
