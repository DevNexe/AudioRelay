package defpackage;

import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class ls1 extends x43 {
    public static final boolean c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numO = property == null ? null : hv4.o(property);
        boolean z = false;
        if (numO == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                z = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numO.intValue() >= 9) {
            z = true;
        }
        c = z;
    }

    @Override // defpackage.x43
    public final void d(SSLSocket sSLSocket, String str, List<kg3> list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        Object[] array = x43.QnHx.a(list).toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // defpackage.x43
    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : ur1.a(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
        }
    }
}
