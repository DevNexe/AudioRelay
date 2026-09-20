package defpackage;

import android.annotation.SuppressLint;
import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public final class oKn9 implements dq4 {
    @Override // defpackage.dq4
    public final boolean a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // defpackage.dq4
    public final boolean b() {
        x43 x43Var = x43.a;
        return x43.QnHx.c() && Build.VERSION.SDK_INT >= 29;
    }

    @Override // defpackage.dq4
    @SuppressLint({"NewApi"})
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : ur1.a(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.dq4
    @SuppressLint({"NewApi"})
    public final void d(SSLSocket sSLSocket, String str, List<? extends kg3> list) throws IOException {
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            x43 x43Var = x43.a;
            Object[] array = x43.QnHx.a(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            sSLParameters.setApplicationProtocols((String[]) array);
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}
