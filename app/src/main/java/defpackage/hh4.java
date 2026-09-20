package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class hh4 implements mz0<tg4.ta> {
    public final /* synthetic */ mz0 w;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: hh4$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.settings.ui.SettingsInputHandler$initialize$$inlined$map$1$2", f = "SettingsInputHandler.kt", l = {224}, m = "emit")
        public static final class C0139QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0139QnHx(z80 z80Var) {
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
            C0139QnHx c0139QnHx;
            if (z80Var instanceof C0139QnHx) {
                c0139QnHx = (C0139QnHx) z80Var;
                int i = c0139QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0139QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0139QnHx = new C0139QnHx(z80Var);
                }
            } else {
                c0139QnHx = new C0139QnHx(z80Var);
            }
            Object obj2 = c0139QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0139QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                tg4.ta taVar = new tg4.ta((String) obj);
                c0139QnHx.A = 1;
                if (this.w.f(taVar, c0139QnHx) == va0Var) {
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

    public hh4(d24 d24Var) {
        this.w = d24Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super tg4.ta> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
