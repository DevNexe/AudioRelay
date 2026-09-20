package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class j4 extends ua5 {
    public final String a;
    public final byte[] b;
    public final ie3 c;

    public static final class QnHx extends ua5.QnHx {
        public String a;
        public byte[] b;
        public ie3 c;

        public final j4 a() {
            String strConcat = this.a == null ? " backendName" : "";
            if (this.c == null) {
                strConcat = strConcat.concat(" priority");
            }
            if (strConcat.isEmpty()) {
                return new j4(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Missing required properties:".concat(strConcat));
        }

        public final QnHx b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.a = str;
            return this;
        }

        public final QnHx c(ie3 ie3Var) {
            if (ie3Var == null) {
                throw new NullPointerException("Null priority");
            }
            this.c = ie3Var;
            return this;
        }
    }

    public j4(String str, byte[] bArr, ie3 ie3Var) {
        this.a = str;
        this.b = bArr;
        this.c = ie3Var;
    }

    @Override // defpackage.ua5
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ua5
    public final byte[] c() {
        return this.b;
    }

    @Override // defpackage.ua5
    public final ie3 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ua5)) {
            return false;
        }
        ua5 ua5Var = (ua5) obj;
        if (this.a.equals(ua5Var.b())) {
            if (Arrays.equals(this.b, ua5Var instanceof j4 ? ((j4) ua5Var).b : ua5Var.c()) && this.c.equals(ua5Var.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
