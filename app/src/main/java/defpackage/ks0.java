package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ks0 {
    public final os0 a;
    public final byte[] b;

    public ks0(os0 os0Var, byte[] bArr) {
        if (os0Var == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.a = os0Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ks0)) {
            return false;
        }
        ks0 ks0Var = (ks0) obj;
        if (this.a.equals(ks0Var.a)) {
            return Arrays.equals(this.b, ks0Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
