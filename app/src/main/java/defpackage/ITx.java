package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ITx extends zc4 {
    public final ad2 a;

    public ITx(ad2 ad2Var) {
        this.a = ad2Var;
    }

    @Override // defpackage.zc4
    public final ad2 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ITx) {
            return ur1.a(this.a, ((ITx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AllSessionsMessageRequest(message=" + this.a + ")";
    }
}
