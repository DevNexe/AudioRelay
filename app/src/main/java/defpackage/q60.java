package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: loaded from: classes3.dex */
public final class q60 implements dq4 {
    public static final QnHx a = new QnHx();

    public static final class QnHx implements ri0.QnHx {
        @Override // ri0.QnHx
        public final boolean a(SSLSocket sSLSocket) {
            boolean z = p60.d;
            return p60.QnHx.b() && Conscrypt.isConscrypt(sSLSocket);
        }

        @Override // ri0.QnHx
        public final dq4 b(SSLSocket sSLSocket) {
            return new q60();
        }
    }

    @Override // defpackage.dq4
    public final boolean a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.dq4
    public final boolean b() {
        boolean z = p60.d;
        return p60.d;
    }

    @Override // defpackage.dq4
    public final String c(SSLSocket sSLSocket) {
        if (a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.dq4
    public final void d(SSLSocket sSLSocket, String str, List<? extends kg3> list) {
        if (a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            x43 x43Var = x43.a;
            Object[] array = x43.QnHx.a(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
        }
    }
}
