package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class X4d implements mz0<zx1> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ E3F x;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;
        public final /* synthetic */ E3F x;

        /* JADX INFO: renamed from: X4d$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.locale.AndroidLanguageStore$getSelectionStream$$inlined$map$1$2", f = "AndroidLanguageStore.kt", l = {224}, m = "emit")
        public static final class C0009QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0009QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var, E3F e3f) {
            this.w = nz0Var;
            this.x = e3f;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0009QnHx c0009QnHx;
            if (z80Var instanceof C0009QnHx) {
                c0009QnHx = (C0009QnHx) z80Var;
                int i = c0009QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0009QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0009QnHx = new C0009QnHx(z80Var);
                }
            } else {
                c0009QnHx = new C0009QnHx(z80Var);
            }
            Object obj2 = c0009QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0009QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                zx1 zx1VarC = this.x.c();
                c0009QnHx.A = 1;
                if (this.w.f(zx1VarC, c0009QnHx) == va0Var) {
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

    public X4d(nj4 nj4Var, E3F e3f) {
        this.w = nj4Var;
        this.x = e3f;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super zx1> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var, this.x), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
