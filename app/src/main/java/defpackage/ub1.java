package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes3.dex */
public final class ub1 {
    public final i85 a;
    public final pq b;
    public final List<Certificate> c;
    public final ry4 d;

    public static final class CQf extends cx1 implements h81<List<? extends Certificate>> {
        public final /* synthetic */ h81<List<Certificate>> w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public CQf(h81<? extends List<? extends Certificate>> h81Var) {
            super(0);
            this.w = h81Var;
        }

        @Override // defpackage.h81
        public final List<? extends Certificate> invoke() {
            try {
                return this.w.invoke();
            } catch (SSLPeerUnverifiedException unused) {
                return cs0.w;
            }
        }
    }

    public static final class QnHx {

        /* JADX INFO: renamed from: ub1$QnHx$QnHx, reason: collision with other inner class name */
        public static final class C0207QnHx extends cx1 implements h81<List<? extends Certificate>> {
            public final /* synthetic */ List<Certificate> w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0207QnHx(List<? extends Certificate> list) {
                super(0);
                this.w = list;
            }

            @Override // defpackage.h81
            public final List<? extends Certificate> invoke() {
                return this.w;
            }
        }

        public static ub1 a(SSLSession sSLSession) throws IOException {
            List listL;
            List listL2 = cs0.w;
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            if (ur1.a(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : ur1.a(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
                throw new IOException(ur1.d(cipherSuite, "cipherSuite == "));
            }
            pq pqVarB = pq.b.b(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (ur1.a("NONE", protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            i85 i85VarA = i85.QnHx.a(protocol);
            try {
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                listL = peerCertificates != null ? qf5.l(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listL2;
            } catch (SSLPeerUnverifiedException unused) {
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                listL2 = qf5.l(Arrays.copyOf(localCertificates, localCertificates.length));
            }
            return new ub1(i85VarA, pqVarB, listL2, new C0207QnHx(listL));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ub1(i85 i85Var, pq pqVar, List<? extends Certificate> list, h81<? extends List<? extends Certificate>> h81Var) {
        this.a = i85Var;
        this.b = pqVar;
        this.c = list;
        this.d = new ry4(new CQf(h81Var));
    }

    public final List<Certificate> a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ub1) {
            ub1 ub1Var = (ub1) obj;
            if (ub1Var.a == this.a && ur1.a(ub1Var.b, this.b) && ur1.a(ub1Var.a(), a()) && ur1.a(ub1Var.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(mu.w0(listA, 10));
        for (Certificate certificate : listA) {
            arrayList.add(certificate instanceof X509Certificate ? ((X509Certificate) certificate).getSubjectDN().toString() : certificate.getType());
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(mu.w0(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(certificate2 instanceof X509Certificate ? ((X509Certificate) certificate2).getSubjectDN().toString() : certificate2.getType());
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
