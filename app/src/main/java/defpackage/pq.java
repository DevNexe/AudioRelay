package defpackage;

import java.util.Comparator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class pq {
    public static final CQf b;
    public static final QnHx c;
    public static final LinkedHashMap d;
    public static final pq e;
    public static final pq f;
    public static final pq g;
    public static final pq h;
    public static final pq i;
    public static final pq j;
    public static final pq k;
    public static final pq l;
    public static final pq m;
    public static final pq n;
    public static final pq o;
    public static final pq p;
    public static final pq q;
    public static final pq r;
    public static final pq s;
    public static final pq t;
    public final String a;

    public static final class CQf {
        public static final pq a(CQf cQf, String str) {
            pq pqVar = new pq(str);
            pq.d.put(str, pqVar);
            return pqVar;
        }

        public final synchronized pq b(String str) {
            pq pqVar;
            String strD;
            LinkedHashMap linkedHashMap = pq.d;
            pqVar = (pq) linkedHashMap.get(str);
            if (pqVar == null) {
                if (iv4.x(str, "TLS_", false)) {
                    strD = ur1.d(str.substring(4), "SSL_");
                } else {
                    strD = iv4.x(str, "SSL_", false) ? ur1.d(str.substring(4), "TLS_") : str;
                }
                pqVar = (pq) linkedHashMap.get(strD);
                if (pqVar == null) {
                    pqVar = new pq(str);
                }
                linkedHashMap.put(str, pqVar);
            }
            return pqVar;
        }
    }

    public static final class QnHx implements Comparator<String> {
        /* JADX WARN: Code duplicated, block: B:9:0x0025 A[RETURN, SYNTHETIC] */
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            int iMin = Math.min(str3.length(), str4.length());
            for (int i = 4; i < iMin; i++) {
                char cCharAt = str3.charAt(i);
                char cCharAt2 = str4.charAt(i);
                if (cCharAt != cCharAt2) {
                    if (ur1.b(cCharAt, cCharAt2) < 0) {
                        return -1;
                    }
                    return 1;
                }
            }
            int length = str3.length();
            int length2 = str4.length();
            if (length == length2) {
                return 0;
            }
            if (length < length2) {
                return -1;
            }
            return 1;
        }
    }

    static {
        CQf cQf = new CQf();
        b = cQf;
        c = new QnHx();
        d = new LinkedHashMap();
        CQf.a(cQf, "SSL_RSA_WITH_NULL_MD5");
        CQf.a(cQf, "SSL_RSA_WITH_NULL_SHA");
        CQf.a(cQf, "SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        CQf.a(cQf, "SSL_RSA_WITH_RC4_128_MD5");
        CQf.a(cQf, "SSL_RSA_WITH_RC4_128_SHA");
        CQf.a(cQf, "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        CQf.a(cQf, "SSL_RSA_WITH_DES_CBC_SHA");
        e = CQf.a(cQf, "SSL_RSA_WITH_3DES_EDE_CBC_SHA");
        CQf.a(cQf, "SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        CQf.a(cQf, "SSL_DHE_DSS_WITH_DES_CBC_SHA");
        CQf.a(cQf, "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        CQf.a(cQf, "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        CQf.a(cQf, "SSL_DHE_RSA_WITH_DES_CBC_SHA");
        CQf.a(cQf, "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        CQf.a(cQf, "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        CQf.a(cQf, "SSL_DH_anon_WITH_RC4_128_MD5");
        CQf.a(cQf, "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        CQf.a(cQf, "SSL_DH_anon_WITH_DES_CBC_SHA");
        CQf.a(cQf, "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        CQf.a(cQf, "TLS_KRB5_WITH_DES_CBC_SHA");
        CQf.a(cQf, "TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        CQf.a(cQf, "TLS_KRB5_WITH_RC4_128_SHA");
        CQf.a(cQf, "TLS_KRB5_WITH_DES_CBC_MD5");
        CQf.a(cQf, "TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        CQf.a(cQf, "TLS_KRB5_WITH_RC4_128_MD5");
        CQf.a(cQf, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        CQf.a(cQf, "TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        CQf.a(cQf, "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        CQf.a(cQf, "TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        f = CQf.a(cQf, "TLS_RSA_WITH_AES_128_CBC_SHA");
        CQf.a(cQf, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        CQf.a(cQf, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        CQf.a(cQf, "TLS_DH_anon_WITH_AES_128_CBC_SHA");
        g = CQf.a(cQf, "TLS_RSA_WITH_AES_256_CBC_SHA");
        CQf.a(cQf, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        CQf.a(cQf, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        CQf.a(cQf, "TLS_DH_anon_WITH_AES_256_CBC_SHA");
        CQf.a(cQf, "TLS_RSA_WITH_NULL_SHA256");
        CQf.a(cQf, "TLS_RSA_WITH_AES_128_CBC_SHA256");
        CQf.a(cQf, "TLS_RSA_WITH_AES_256_CBC_SHA256");
        CQf.a(cQf, "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        CQf.a(cQf, "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        CQf.a(cQf, "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        CQf.a(cQf, "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        CQf.a(cQf, "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        CQf.a(cQf, "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        CQf.a(cQf, "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        CQf.a(cQf, "TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        CQf.a(cQf, "TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        CQf.a(cQf, "TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        CQf.a(cQf, "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        CQf.a(cQf, "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        CQf.a(cQf, "TLS_PSK_WITH_RC4_128_SHA");
        CQf.a(cQf, "TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        CQf.a(cQf, "TLS_PSK_WITH_AES_128_CBC_SHA");
        CQf.a(cQf, "TLS_PSK_WITH_AES_256_CBC_SHA");
        CQf.a(cQf, "TLS_RSA_WITH_SEED_CBC_SHA");
        h = CQf.a(cQf, "TLS_RSA_WITH_AES_128_GCM_SHA256");
        i = CQf.a(cQf, "TLS_RSA_WITH_AES_256_GCM_SHA384");
        CQf.a(cQf, "TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        CQf.a(cQf, "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        CQf.a(cQf, "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        CQf.a(cQf, "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        CQf.a(cQf, "TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        CQf.a(cQf, "TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        CQf.a(cQf, "TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        CQf.a(cQf, "TLS_FALLBACK_SCSV");
        CQf.a(cQf, "TLS_ECDH_ECDSA_WITH_NULL_SHA");
        CQf.a(cQf, "TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        CQf.a(cQf, "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        CQf.a(cQf, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        CQf.a(cQf, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        CQf.a(cQf, "TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        CQf.a(cQf, "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        CQf.a(cQf, "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        CQf.a(cQf, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        CQf.a(cQf, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        CQf.a(cQf, "TLS_ECDH_RSA_WITH_NULL_SHA");
        CQf.a(cQf, "TLS_ECDH_RSA_WITH_RC4_128_SHA");
        CQf.a(cQf, "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        CQf.a(cQf, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        CQf.a(cQf, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        CQf.a(cQf, "TLS_ECDHE_RSA_WITH_NULL_SHA");
        CQf.a(cQf, "TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        CQf.a(cQf, "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        j = CQf.a(cQf, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
        k = CQf.a(cQf, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
        CQf.a(cQf, "TLS_ECDH_anon_WITH_NULL_SHA");
        CQf.a(cQf, "TLS_ECDH_anon_WITH_RC4_128_SHA");
        CQf.a(cQf, "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        CQf.a(cQf, "TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        CQf.a(cQf, "TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        CQf.a(cQf, "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        CQf.a(cQf, "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        CQf.a(cQf, "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        CQf.a(cQf, "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        CQf.a(cQf, "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        CQf.a(cQf, "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        CQf.a(cQf, "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        CQf.a(cQf, "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        l = CQf.a(cQf, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
        m = CQf.a(cQf, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
        CQf.a(cQf, "TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        CQf.a(cQf, "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        n = CQf.a(cQf, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
        o = CQf.a(cQf, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
        CQf.a(cQf, "TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        CQf.a(cQf, "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        CQf.a(cQf, "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        CQf.a(cQf, "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        p = CQf.a(cQf, "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        q = CQf.a(cQf, "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
        CQf.a(cQf, "TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        CQf.a(cQf, "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        r = CQf.a(cQf, "TLS_AES_128_GCM_SHA256");
        s = CQf.a(cQf, "TLS_AES_256_GCM_SHA384");
        t = CQf.a(cQf, "TLS_CHACHA20_POLY1305_SHA256");
        CQf.a(cQf, "TLS_AES_128_CCM_SHA256");
        CQf.a(cQf, "TLS_AES_128_CCM_8_SHA256");
    }

    public pq(String str) {
        this.a = str;
    }

    public final String toString() {
        return this.a;
    }
}
