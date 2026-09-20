package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class uf4 extends zc4 {
    public final je4 a;
    public final ad2 b;

    public uf4(je4 je4Var, ad2 ad2Var) {
        this.a = je4Var;
        this.b = ad2Var;
    }

    @Override // defpackage.zc4
    public final ad2 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf4)) {
            return false;
        }
        uf4 uf4Var = (uf4) obj;
        return ur1.a(this.a, uf4Var.a) && ur1.a(this.b, uf4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SessionMessageRequest(session=" + this.a + ", message=" + this.b + ")";
    }
}
