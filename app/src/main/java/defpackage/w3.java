package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class w3 extends p52 {
    public final long a;

    public w3(long j) {
        this.a = j;
    }

    @Override // defpackage.p52
    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof p52) && this.a == ((p52) obj).b();
    }

    public final int hashCode() {
        long j = this.a;
        return 1000003 ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return hc2.a(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
