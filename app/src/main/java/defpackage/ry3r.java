package defpackage;

import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public final class ry3r implements ri0.QnHx {
    public final /* synthetic */ String a = "com.google.android.gms.org.conscrypt";

    @Override // ri0.QnHx
    public final boolean a(SSLSocket sSLSocket) {
        return iv4.x(sSLSocket.getClass().getName(), ur1.d(".", this.a), false);
    }

    @Override // ri0.QnHx
    public final dq4 b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!ur1.a(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(ur1.d(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new IrK(superclass);
    }
}
