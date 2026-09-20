package defpackage;

import androidx.activity.ComponentActivity;

/* JADX INFO: loaded from: classes.dex */
public final class Pp implements mz0<rv2<? extends ComponentActivity>> {
    public final /* synthetic */ mz0 w;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: Pp$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.ads.AdsInitializer$getActivity$$inlined$filter$1$2", f = "AdsInitializer.kt", l = {224}, m = "emit")
        public static final class C0006QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0006QnHx(z80 z80Var) {
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
            C0006QnHx c0006QnHx;
            if (z80Var instanceof C0006QnHx) {
                c0006QnHx = (C0006QnHx) z80Var;
                int i = c0006QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0006QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0006QnHx = new C0006QnHx(z80Var);
                }
            } else {
                c0006QnHx = new C0006QnHx(z80Var);
            }
            Object obj2 = c0006QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0006QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                if (!((rv2) obj).a()) {
                    c0006QnHx.A = 1;
                    if (this.w.f(obj, c0006QnHx) == va0Var) {
                        return va0Var;
                    }
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

    public Pp(ii3 ii3Var) {
        this.w = ii3Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super rv2<? extends ComponentActivity>> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
