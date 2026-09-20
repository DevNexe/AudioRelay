package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class jw3 implements mz0<wb4> {
    public final /* synthetic */ mz0 w;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: jw3$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.server.ui.running.RunningAndroidServerInputHandler$getInitializationFlows$$inlined$map$9$2", f = "RunningAndroidServerInputHandler.kt", l = {224}, m = "emit")
        public static final class C0153QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0153QnHx(z80 z80Var) {
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
            C0153QnHx c0153QnHx;
            wb4 wb4Var;
            if (z80Var instanceof C0153QnHx) {
                c0153QnHx = (C0153QnHx) z80Var;
                int i = c0153QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0153QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0153QnHx = new C0153QnHx(z80Var);
                }
            } else {
                c0153QnHx = new C0153QnHx(z80Var);
            }
            Object obj2 = c0153QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0153QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                Qx0$ qx0$ = (Qx0$) obj;
                if (qx0$ instanceof Qx0$.CQf) {
                    wb4Var = wb4.Playback;
                } else {
                    if (!ur1.a(qx0$, Qx0$.QnHx.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wb4Var = wb4.Microphone;
                }
                c0153QnHx.A = 1;
                if (this.w.f(wb4Var, c0153QnHx) == va0Var) {
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

    public jw3(tv3 tv3Var) {
        this.w = tv3Var;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super wb4> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
