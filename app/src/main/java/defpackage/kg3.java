package defpackage;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public enum kg3 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public final String w;

    public static final class QnHx {
        public static kg3 a(String str) throws IOException {
            if (ur1.a(str, "http/1.0")) {
                return kg3.HTTP_1_0;
            }
            if (ur1.a(str, "http/1.1")) {
                return kg3.HTTP_1_1;
            }
            if (ur1.a(str, "h2_prior_knowledge")) {
                return kg3.H2_PRIOR_KNOWLEDGE;
            }
            if (ur1.a(str, "h2")) {
                return kg3.HTTP_2;
            }
            if (ur1.a(str, "spdy/3.1")) {
                return kg3.SPDY_3;
            }
            if (ur1.a(str, "quic")) {
                return kg3.QUIC;
            }
            throw new IOException(ur1.d(str, "Unexpected protocol: "));
        }
    }

    kg3(String str) {
        this.w = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.w;
    }
}
