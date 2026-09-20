package defpackage;

import android.app.Activity;
import androidx.activity.ComponentActivity;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.ads.interstitial.InterstitialBootstrapperImpl$observeActivity$1", f = "InterstitialBootstrapperImpl.kt", l = {108}, m = "invokeSuspend")
public final class jq1 extends px4 implements x81<ua0, z80<? super sd5>, Object> {
    public int A;
    public final /* synthetic */ nq1 B;

    @if0(c = "com.azefsw.audioconnect.ads.interstitial.InterstitialBootstrapperImpl$observeActivity$1$1", f = "InterstitialBootstrapperImpl.kt", l = {109}, m = "invokeSuspend")
    public static final class QnHx extends px4 implements x81<rv2<? extends ComponentActivity>, z80<? super sd5>, Object> {
        public int A;
        public /* synthetic */ Object B;
        public final /* synthetic */ nq1 C;

        /* JADX INFO: renamed from: jq1$QnHx$QnHx, reason: collision with other inner class name */
        @if0(c = "com.azefsw.audioconnect.ads.interstitial.InterstitialBootstrapperImpl$observeActivity$1$1$1", f = "InterstitialBootstrapperImpl.kt", l = {}, m = "invokeSuspend")
        public static final class C0152QnHx extends px4 implements x81<ua0, z80<? super sd5>, Object> {
            public final /* synthetic */ rv2<ComponentActivity> A;
            public final /* synthetic */ nq1 B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0152QnHx(rv2<? extends ComponentActivity> rv2Var, nq1 nq1Var, z80<? super C0152QnHx> z80Var) {
                super(2, z80Var);
                this.A = rv2Var;
                this.B = nq1Var;
            }

            @Override // defpackage.m8
            public final z80<sd5> a(Object obj, z80<?> z80Var) {
                return new C0152QnHx(this.A, this.B, z80Var);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.m8
            public final Object i(Object obj) throws Throwable {
                C0239D.H(obj);
                rv2<ComponentActivity> rv2Var = this.A;
                gp2 gp2Var = gp2.a;
                if (ur1.a(rv2Var, gp2Var)) {
                    nq1 nq1Var = this.B;
                    nq1Var.a.stop();
                    nq1Var.h = gp2Var;
                } else if (rv2Var instanceof mq4) {
                    nq1 nq1Var2 = this.B;
                    Activity activity = (Activity) ((mq4) this.A).a;
                    nq1Var2.getClass();
                    nq1Var2.h = new mq4(activity);
                    rv2<? extends Activity> rv2Var2 = nq1Var2.h;
                    if (nq1Var2.g && (rv2Var2 instanceof mq4)) {
                        nq1Var2.a.b((Activity) ((mq4) rv2Var2).a);
                    }
                }
                return sd5.a;
            }

            @Override // defpackage.x81
            public final Object invoke(ua0 ua0Var, z80<? super sd5> z80Var) {
                return ((C0152QnHx) a(ua0Var, z80Var)).i(sd5.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(nq1 nq1Var, z80<? super QnHx> z80Var) {
            super(2, z80Var);
            this.C = nq1Var;
        }

        @Override // defpackage.m8
        public final z80<sd5> a(Object obj, z80<?> z80Var) {
            QnHx qnHx = new QnHx(this.C, z80Var);
            qnHx.B = obj;
            return qnHx;
        }

        @Override // defpackage.m8
        public final Object i(Object obj) throws Throwable {
            va0 va0Var = va0.COROUTINE_SUSPENDED;
            int i = this.A;
            if (i == 0) {
                C0239D.H(obj);
                rv2 rv2Var = (rv2) this.B;
                qh0 qh0Var = rl0.a;
                j72 j72Var = n72.a;
                C0152QnHx c0152QnHx = new C0152QnHx(rv2Var, this.C, null);
                this.A = 1;
                if (fp1.D0(j72Var, c0152QnHx, this) == va0Var) {
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
        public final Object invoke(rv2<? extends ComponentActivity> rv2Var, z80<? super sd5> z80Var) {
            return ((QnHx) a(rv2Var, z80Var)).i(sd5.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jq1(nq1 nq1Var, z80<? super jq1> z80Var) {
        super(2, z80Var);
        this.B = nq1Var;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        return new jq1(this.B, z80Var);
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            nq1 nq1Var = this.B;
            ii3 ii3Var = new ii3(nq1Var.f.a, null);
            QnHx qnHx = new QnHx(nq1Var, null);
            this.A = 1;
            if (kd.e(ii3Var, qnHx, this) == va0Var) {
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
        return ((jq1) a(ua0Var, z80Var)).i(sd5.a);
    }
}
