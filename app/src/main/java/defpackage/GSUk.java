package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.audioconnect.network.info.AndroidNetworkInfoService$getNetworkChangesStream$1", f = "AndroidNetworkInfoService.kt", l = {58}, m = "invokeSuspend")
public final class GSUk extends px4 implements x81<te3<? super sd5>, z80<? super sd5>, Object> {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ qd C;
    public final /* synthetic */ ConnectivityManager D;

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ ConnectivityManager w;
        public final /* synthetic */ Irw6 x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(ConnectivityManager connectivityManager, Irw6 irw6) {
            super(0);
            this.w = connectivityManager;
            this.x = irw6;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            this.w.unregisterNetworkCallback(this.x);
            return sd5.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GSUk(qd qdVar, ConnectivityManager connectivityManager, z80<? super GSUk> z80Var) {
        super(2, z80Var);
        this.C = qdVar;
        this.D = connectivityManager;
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        GSUk gSUk = new GSUk(this.C, this.D, z80Var);
        gSUk.B = obj;
        return gSUk;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        va0 va0Var = va0.COROUTINE_SUSPENDED;
        int i = this.A;
        if (i == 0) {
            C0239D.H(obj);
            te3 te3Var = (te3) this.B;
            this.C.getClass();
            Irw6 irw6 = new Irw6(te3Var);
            int i2 = Build.VERSION.SDK_INT;
            ConnectivityManager connectivityManager = this.D;
            if (i2 >= 24) {
                connectivityManager.registerDefaultNetworkCallback(irw6);
            } else {
                NetworkRequest.Builder builderAddTransportType = new NetworkRequest.Builder().addTransportType(1);
                if (i2 >= 31) {
                    builderAddTransportType = builderAddTransportType.addTransportType(8);
                }
                connectivityManager.registerNetworkCallback(builderAddTransportType.addTransportType(3).build(), irw6);
            }
            QnHx qnHx = new QnHx(connectivityManager, irw6);
            this.A = 1;
            if (pe3.a(te3Var, qnHx, this) == va0Var) {
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
    public final Object invoke(te3<? super sd5> te3Var, z80<? super sd5> z80Var) {
        return ((GSUk) a(te3Var, z80Var)).i(sd5.a);
    }
}
