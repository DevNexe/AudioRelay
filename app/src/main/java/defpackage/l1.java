package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class l1 {
    public final int a;
    public final int b;

    public l1(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return this.a == l1Var.a && this.b == l1Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioTrackBufferConfig(sizeInMs=");
        sb.append(this.a);
        sb.append(", sizeInBytes=");
        return ex0.c(sb, this.b, ")");
    }
}
