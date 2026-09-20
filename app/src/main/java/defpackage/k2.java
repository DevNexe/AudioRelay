package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class k2 extends h5 {
    public final Iterable<eu0> a;
    public final byte[] b;

    public k2() {
        throw null;
    }

    public k2(Iterable iterable, byte[] bArr) {
        this.a = iterable;
        this.b = bArr;
    }

    @Override // defpackage.h5
    public final Iterable<eu0> a() {
        return this.a;
    }

    @Override // defpackage.h5
    public final byte[] b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return false;
        }
        h5 h5Var = (h5) obj;
        if (this.a.equals(h5Var.a())) {
            if (Arrays.equals(this.b, h5Var instanceof k2 ? ((k2) h5Var).b : h5Var.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "BackendRequest{events=" + this.a + ", extras=" + Arrays.toString(this.b) + "}";
    }
}
