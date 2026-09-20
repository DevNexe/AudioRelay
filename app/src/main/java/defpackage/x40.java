package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class x40 {
    public final int a;

    public x40(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x40) && this.a == ((x40) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return ex0.c(new StringBuilder("CompressionFeature(bitrate="), this.a, ")");
    }
}
