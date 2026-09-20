package defpackage;

import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: loaded from: classes3.dex */
public final class z8 extends B8C {
    public final kb5 w;

    public z8(kb5 kb5Var) {
        this.w = kb5Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof z8) && ur1.a(((z8) obj).w, this.w);
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    @Override // defpackage.B8C
    public final List t0(String str, List list) throws SSLPeerUnverifiedException {
        boolean z;
        X509Certificate x509Certificate;
        boolean z2;
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        int i = 0;
        boolean z3 = false;
        while (i < 9) {
            i++;
            X509Certificate x509Certificate2 = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateA = this.w.a(x509Certificate2);
            if (x509CertificateA != null) {
                if (arrayList.size() > 1 || !ur1.a(x509Certificate2, x509CertificateA)) {
                    arrayList.add(x509CertificateA);
                }
                if (ur1.a(x509CertificateA.getIssuerDN(), x509CertificateA.getSubjectDN())) {
                    try {
                        x509CertificateA.verify(x509CertificateA.getPublicKey());
                        z = true;
                    } catch (GeneralSecurityException unused) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                if (z) {
                    return arrayList;
                }
                z3 = true;
            } else {
                Iterator it = arrayDeque.iterator();
                do {
                    if (!it.hasNext()) {
                        if (z3) {
                            return arrayList;
                        }
                        throw new SSLPeerUnverifiedException(ur1.d(x509Certificate2, "Failed to find a trusted cert that signed "));
                    }
                    Object next = it.next();
                    if (next == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                    }
                    x509Certificate = (X509Certificate) next;
                    if (ur1.a(x509Certificate2.getIssuerDN(), x509Certificate.getSubjectDN())) {
                        try {
                            x509Certificate2.verify(x509Certificate.getPublicKey());
                            z2 = true;
                        } catch (GeneralSecurityException unused2) {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                } while (!z2);
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException(ur1.d(arrayList, "Certificate chain too long: "));
    }
}
