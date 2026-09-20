package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class pp1 extends np1 implements st<Integer> {
    public static final pp1 z = new pp1(1, 0);

    public pp1(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.st
    public final Comparable b() {
        return Integer.valueOf(this.w);
    }

    @Override // defpackage.st
    public final Comparable e() {
        return Integer.valueOf(this.x);
    }

    @Override // defpackage.np1
    public final boolean equals(Object obj) {
        if (obj instanceof pp1) {
            if (!isEmpty() || !((pp1) obj).isEmpty()) {
                pp1 pp1Var = (pp1) obj;
                if (this.w == pp1Var.w) {
                    if (this.x == pp1Var.x) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean g(int i) {
        return this.w <= i && i <= this.x;
    }

    @Override // defpackage.np1
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.w * 31) + this.x;
    }

    @Override // defpackage.np1
    public final boolean isEmpty() {
        return this.w > this.x;
    }

    @Override // defpackage.np1
    public final String toString() {
        return this.w + ".." + this.x;
    }
}
