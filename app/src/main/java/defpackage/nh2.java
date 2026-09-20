package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class nh2 {
    public final int a;
    public final int b;

    public nh2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh2)) {
            return false;
        }
        nh2 nh2Var = (nh2) obj;
        return this.a == nh2Var.a && this.b == nh2Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiPayLoadFeature(maxElapsedTimeBetweenPayloads=");
        sb.append(this.a);
        sb.append(", maxPayloadSize=");
        return ex0.c(sb, this.b, ")");
    }
}
