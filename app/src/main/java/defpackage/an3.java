package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class an3 implements mz0<x8W.LPt8Fixed> {
    public final /* synthetic */ mz0 w;
    public final /* synthetic */ rv2 x;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;
        public final /* synthetic */ rv2 x;

        /* JADX INFO: renamed from: an3$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.ads.ui.banner.AdBannerContainerInputHandler$initialize$lambda-2$$inlined$map$1$2", f = "AdBannerContainerInputHandler.kt", l = {224}, m = "emit")
        public static final class C0014QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0014QnHx(z80 z80Var) {
                super(z80Var);
            }

            @Override // defpackage.m8
            public final Object i(Object obj) {
                this.z = obj;
                this.A |= Integer.MIN_VALUE;
                return QnHx.this.f(null, this);
            }
        }

        public QnHx(nz0 nz0Var, rv2 rv2Var) {
            this.w = nz0Var;
            this.x = rv2Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.nz0
        public final Object f(Object obj, z80 z80Var) throws Throwable {
            C0014QnHx c0014QnHx;
            if (z80Var instanceof C0014QnHx) {
                c0014QnHx = (C0014QnHx) z80Var;
                int i = c0014QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0014QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0014QnHx = new C0014QnHx(z80Var);
                }
            } else {
                c0014QnHx = new C0014QnHx(z80Var);
            }
            Object obj2 = c0014QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0014QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                x8W.LPt8Fixed lPt8 = new x8W.LPt8Fixed(this.x, (Kgd) obj);
                c0014QnHx.A = 1;
                if (this.w.f(lPt8, c0014QnHx) == va0Var) {
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

    public an3(r01 r01Var, rv2 rv2Var) {
        this.w = r01Var;
        this.x = rv2Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super x8W.LPt8Fixed> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var, this.x), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
