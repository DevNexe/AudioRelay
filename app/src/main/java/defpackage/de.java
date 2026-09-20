package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class de implements dq4 {
    public static final QnHx a = new QnHx();

    public static final class QnHx implements ri0.QnHx {
        @Override // ri0.QnHx
        public final boolean a(SSLSocket sSLSocket) {
            return ce.d && (sSLSocket instanceof BCSSLSocket);
        }

        @Override // ri0.QnHx
        public final dq4 b(SSLSocket sSLSocket) {
            return new de();
        }
    }

    @Override // defpackage.dq4
    public final boolean a(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // defpackage.dq4
    public final boolean b() {
        boolean z = ce.d;
        return ce.d;
    }

    @Override // defpackage.dq4
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : ur1.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.dq4
    public final void d(SSLSocket sSLSocket, String str, List<? extends kg3> list) {
        if (a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            x43 x43Var = x43.a;
            Object[] array = x43.QnHx.a(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
