package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ig {
    public final int a;
    public final int b;

    public ig(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig)) {
            return false;
        }
        ig igVar = (ig) obj;
        return this.a == igVar.a && this.b == igVar.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Buffer(minimum=");
        sb.append(this.a);
        sb.append(", maximum=");
        return ex0.c(sb, this.b, ")");
    }
}
