package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class uw1 implements Comparable<uw1> {
    public static final uw1 A = new uw1();
    public final int w = 1;
    public final int x = 7;
    public final int y = 10;
    public final int z;

    public uw1() {
        if (!(new pp1(0, 255).g(1) && new pp1(0, 255).g(7) && new pp1(0, 255).g(10))) {
            throw new IllegalArgumentException("Version components are out of range: 1.7.10".toString());
        }
        this.z = 67338;
    }

    @Override // java.lang.Comparable
    public final int compareTo(uw1 uw1Var) {
        return this.z - uw1Var.z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        uw1 uw1Var = obj instanceof uw1 ? (uw1) obj : null;
        return uw1Var != null && this.z == uw1Var.z;
    }

    public final int hashCode() {
        return this.z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.w);
        sb.append('.');
        sb.append(this.x);
        sb.append('.');
        sb.append(this.y);
        return sb.toString();
    }
}
