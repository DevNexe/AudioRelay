package defpackage;

import androidx.activity.ComponentActivity;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class yXfX implements mz0<ComponentActivity> {
    public final /* synthetic */ mz0 w;

    public static final class QnHx<T> implements nz0 {
        public final /* synthetic */ nz0 w;

        /* JADX INFO: renamed from: yXfX$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.ads.AdsInitializer$getActivity$$inlined$map$1$2", f = "AdsInitializer.kt", l = {224}, m = "emit")
        public static final class C0225QnHx extends b90 {
            public int A;
            public /* synthetic */ Object z;

            public C0225QnHx(z80 z80Var) {
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
            C0225QnHx c0225QnHx;
            T t;
            if (z80Var instanceof C0225QnHx) {
                c0225QnHx = (C0225QnHx) z80Var;
                int i = c0225QnHx.A;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0225QnHx.A = i - Integer.MIN_VALUE;
                } else {
                    c0225QnHx = new C0225QnHx(z80Var);
                }
            } else {
                c0225QnHx = new C0225QnHx(z80Var);
            }
            Object obj2 = c0225QnHx.z;
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i2 = c0225QnHx.A;
            if (i2 == 0) {
                C0239D.H(obj2);
                rv2 rv2Var = (rv2) obj;
                rv2Var.getClass();
                if (rv2Var instanceof gp2) {
                    t = null;
                } else {
                    if (!(rv2Var instanceof mq4)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t = ((mq4) rv2Var).a;
                }
                c0225QnHx.A = 1;
                if (this.w.f(t, c0225QnHx) == va0Var) {
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

    public yXfX(Pp pp) {
        this.w = pp;
    }

    @Override // defpackage.mz0
    public final Object a(nz0<? super ComponentActivity> nz0Var, z80 z80Var) {
        Object objA = this.w.a(new QnHx(nz0Var), z80Var);
        return objA == va0.COROUTINE_SUSPENDED ? objA : sd5.a;
    }
}
