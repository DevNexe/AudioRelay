package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b33 {
    public final long a;

    public b33(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b33) && this.a == ((b33) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        return "PingRequest(timestamp=" + this.a + ")";
    }
}
