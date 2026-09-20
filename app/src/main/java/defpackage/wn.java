package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class wn {
    public static final wn c = new wn(wu.h1(new ArrayList()), null);
    public final Set<CQf> a;
    public final B8C b;

    public static final class CQf {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CQf)) {
                return false;
            }
            CQf cQf = (CQf) obj;
            cQf.getClass();
            if (!ur1.a(null, null)) {
                return false;
            }
            cQf.getClass();
            if (!ur1.a(null, null)) {
                return false;
            }
            cQf.getClass();
            return ur1.a(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public static final class QnHx {
        public static String a(X509Certificate x509Certificate) {
            if (x509Certificate instanceof X509Certificate) {
                return ur1.d(b(x509Certificate).a(), "sha256/");
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        public static mk b(X509Certificate x509Certificate) throws NoSuchAlgorithmException {
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            int length = encoded.length;
            cp5.a(encoded.length, 0, length);
            byte[] bArrB0 = NPO.b0(encoded, 0, length + 0);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArrB0, 0, bArrB0.length);
            return new mk(messageDigest.digest());
        }
    }

    public wn(Set<CQf> set, B8C b8c) {
        this.a = set;
        this.b = b8c;
    }

    public final void a(String str, h81<? extends List<? extends X509Certificate>> h81Var) {
        Iterator<T> it = this.a.iterator();
        if (it.hasNext()) {
            ((CQf) it.next()).getClass();
            iv4.x(null, "**.", false);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wn) {
            wn wnVar = (wn) obj;
            if (ur1.a(wnVar.a, this.a) && ur1.a(wnVar.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() + 1517) * 41;
        B8C b8c = this.b;
        return iHashCode + (b8c != null ? b8c.hashCode() : 0);
    }
}
