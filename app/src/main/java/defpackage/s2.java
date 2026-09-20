package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class s2 extends bc0.F1 {
    public final String a;
    public final String b;

    public s2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // bc0.F1
    public final String a() {
        return this.a;
    }

    @Override // bc0.F1
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bc0.F1)) {
            return false;
        }
        bc0.F1 f1 = (bc0.F1) obj;
        return this.a.equals(f1.a()) && this.b.equals(f1.b());
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        return i5.b(sb, this.b, "}");
    }
}
