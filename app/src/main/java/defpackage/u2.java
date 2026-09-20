package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class u2 extends bc0.LPt8Fixed.QnHx {
    public final String a;
    public final byte[] b;

    public u2(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    @Override // bc0.LPt8Fixed.QnHx
    public final byte[] a() {
        return this.b;
    }

    @Override // bc0.LPt8Fixed.QnHx
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.LPt8Fixed.QnHx)) {
            return false;
        }
        bc0.LPt8Fixed.QnHx qnHx = (bc0.LPt8Fixed.QnHx) obj;
        if (this.a.equals(qnHx.b())) {
            if (Arrays.equals(this.b, qnHx instanceof u2 ? ((u2) qnHx).b : qnHx.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "File{filename=" + this.a + ", contents=" + Arrays.toString(this.b) + "}";
    }
}
