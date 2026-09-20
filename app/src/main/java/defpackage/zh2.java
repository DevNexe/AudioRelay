package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes.dex */
public final class zh2 implements xr4 {
    public final Context a;
    public final mc4 b;
    public final ry4 c = new ry4(new yh2(this));

    @if0(c = "com.azefsw.audioconnect.network.MulticastLocker$start$1", f = "MulticastLocker.kt", l = {33}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
        public int A;

        public static final class CQf<T> implements nz0 {
            public final /* synthetic */ zh2 w;

            public CQf(zh2 zh2Var) {
                this.w = zh2Var;
            }

            @Override // defpackage.nz0
            public final Object f(Object obj, z80 z80Var) {
                int iOrdinal = ((mc4.F1) obj).ordinal();
                zh2 zh2Var = this.w;
                if (iOrdinal == 0) {
                    zh2Var.getClass();
                    try {
                        ((WifiManager.MulticastLock) zh2Var.c.getValue()).release();
                    } catch (Throwable th) {
                        a62 a62Var = a62.a;
                        a62.a.d(th, true);
                        throw th;
                    }
                } else if (iOrdinal == 1) {
                    zh2Var.getClass();
                    try {
                        ((WifiManager.MulticastLock) zh2Var.c.getValue()).acquire();
                    } catch (Throwable th2) {
                        a62 a62Var2 = a62.a;
                        a62.a.d(th2, true);
                        throw th2;
                    }
                }
                return sd5.a;
            }
        }

        /* JADX INFO: renamed from: zh2$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.network.MulticastLocker$start$1$1", f = "MulticastLocker.kt", l = {}, m = "invokeSuspend")
        public static final class C0233QnHx extends px4 implements x81<mc4.F1, z80<? super Boolean>, Object> {
            public /* synthetic */ Object A;

            public C0233QnHx(z80<? super C0233QnHx> z80Var) {
                super(2, z80Var);
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                C0233QnHx c0233QnHx = new C0233QnHx(z80Var);
                c0233QnHx.A = obj;
                return c0233QnHx;
            }

            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                C0239D.H(obj);
                return Boolean.valueOf(((mc4.F1) this.A) == mc4.F1.Paused);
            }

            @Override // defpackage.x81
            public final Object invoke(mc4.F1 f1, z80<? super Boolean> z80Var) {
                return ((C0233QnHx) a(f1, z80Var)).i(sd5.a);
            }
        }

        public QnHx(z80<? super QnHx> z80Var) {
            super(2, z80Var);
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            return zh2.this.new QnHx(z80Var);
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                zh2 zh2Var = zh2.this;
                am state = zh2Var.b.getState();
                C0233QnHx c0233QnHx = new C0233QnHx(null);
                CQf cQf = new CQf(zh2Var);
                this.A = 1;
                Object objA = state.a(new c01(new fl3(), cQf, c0233QnHx), this);
                if (objA != va0Var) {
                    objA = sd5.a;
                }
                if (objA == va0Var) {
                    return va0Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C0239D.H(obj);
            }
            return sd5.a;
        }

        @Override // defpackage.x81
        public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(ua0Var, z80Var)).i(sd5.a);
        }
    }

    public zh2(Context context, qc4 qc4Var) {
        this.a = context;
        this.b = qc4Var;
    }

    @Override // defpackage.xr4
    public final qw start() {
        return kd.x(new QnHx(null));
    }
}
