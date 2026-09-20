package defpackage;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@if0(c = "com.azefsw.baselibrary.network.NetUtils$findNetworkInterfaces$1", f = "NetUtils.kt", l = {76}, m = "invokeSuspend")
public final class wm2 extends eq3 implements x81<z94<? super NetworkInterface>, z80<? super sd5>, Object> {
    public /* synthetic */ Object A;
    public Iterator y;
    public int z;

    public static final class QnHx extends cx1 implements h81<sd5> {
        public final /* synthetic */ SocketException w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QnHx(SocketException socketException) {
            super(0);
            this.w = socketException;
        }

        @Override // defpackage.h81
        public final sd5 invoke() {
            a62.a.b("Failed to check network interface", this.w);
            return sd5.a;
        }
    }

    public wm2(z80<? super wm2> z80Var) {
        super(2, z80Var);
    }

    @Override // defpackage.m8
    public final z80<sd5> a(Object obj, z80<?> z80Var) {
        wm2 wm2Var = new wm2(z80Var);
        wm2Var.A = obj;
        return wm2Var;
    }

    @Override // defpackage.m8
    public final Object i(Object obj) throws Throwable {
        z94 z94Var;
        Iterator nuVar;
        wm2 wm2Var;
        va0 va0Var;
        va0 va0Var2 = va0.COROUTINE_SUSPENDED;
        int i = this.z;
        if (i == 0) {
            C0239D.H(obj);
            z94Var = (z94) this.A;
            nuVar = new nu(NetworkInterface.getNetworkInterfaces());
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nuVar = this.y;
            z94Var = (z94) this.A;
            try {
                C0239D.H(obj);
            } catch (SocketException e) {
                en2.a.a(new QnHx(e));
                wm2Var = this;
                nuVar = nuVar;
                z94Var = z94Var;
                va0Var = va0Var2;
            }
        }
        wm2Var = this;
        va0Var = va0Var2;
        while (nuVar.hasNext()) {
            NetworkInterface networkInterface = (NetworkInterface) nuVar.next();
            try {
                if (networkInterface.isUp() && !networkInterface.isLoopback() && !networkInterface.isVirtual()) {
                    wm2Var.A = z94Var;
                    wm2Var.y = nuVar;
                    wm2Var.z = 1;
                    z94Var.a(networkInterface, wm2Var);
                    if (va0Var2 == va0Var) {
                        return va0Var;
                    }
                }
            } catch (SocketException e2) {
                Iterator it = nuVar;
                wm2 wm2Var2 = wm2Var;
                va0 va0Var3 = va0Var;
                z94 z94Var2 = z94Var;
                en2.a.a(new QnHx(e2));
                wm2Var = wm2Var2;
                nuVar = it;
                z94Var = z94Var2;
                va0Var = va0Var3;
            }
        }
        return sd5.a;
    }

    @Override // defpackage.x81
    public final Object invoke(z94<? super NetworkInterface> z94Var, z80<? super sd5> z80Var) {
        return ((wm2) a(z94Var, z80Var)).i(sd5.a);
    }
}
