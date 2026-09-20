package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class np1 implements Iterable<Integer>, jv1 {
    public final int w;
    public final int x;
    public final int y;

    public np1(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.w = i;
        this.x = ddf.i(i, i2, i3);
        this.y = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof np1) {
            if (!isEmpty() || !((np1) obj).isEmpty()) {
                np1 np1Var = (np1) obj;
                if (this.w != np1Var.w || this.x != np1Var.x || this.y != np1Var.y) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final op1 iterator() {
        return new op1(this.w, this.x, this.y);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.w * 31) + this.x) * 31) + this.y;
    }

    public boolean isEmpty() {
        int i = this.y;
        int i2 = this.x;
        int i3 = this.w;
        if (i > 0) {
            if (i3 > i2) {
                return true;
            }
        } else if (i3 < i2) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i = this.x;
        int i2 = this.w;
        int i3 = this.y;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
