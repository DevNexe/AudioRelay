package defpackage;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes3.dex */
public final class FnN extends B8C {
    public final X509TrustManager w;
    public final X509TrustManagerExtensions x;

    public FnN(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.w = x509TrustManager;
        this.x = x509TrustManagerExtensions;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof FnN) && ((FnN) obj).w == this.w;
    }

    public final int hashCode() {
        return System.identityHashCode(this.w);
    }

    @Override // defpackage.B8C
    public final List t0(String str, List list) throws SSLPeerUnverifiedException {
        Object[] array = list.toArray(new X509Certificate[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        try {
            return this.x.checkServerTrusted((X509Certificate[]) array, "RSA", str);
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }
}
