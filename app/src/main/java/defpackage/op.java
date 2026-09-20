package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class op extends mp implements st<Character> {
    static {
        new op((char) 1, (char) 0);
    }

    public op(char c, char c2) {
        super(c, c2);
    }

    @Override // defpackage.st
    public final Comparable b() {
        return Character.valueOf(this.w);
    }

    @Override // defpackage.st
    public final Comparable e() {
        return Character.valueOf(this.x);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof op) {
            if (!isEmpty() || !((op) obj).isEmpty()) {
                op opVar = (op) obj;
                if (this.w == opVar.w) {
                    if (this.x == opVar.x) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final boolean f(char c) {
        return ur1.b(this.w, c) <= 0 && ur1.b(c, this.x) <= 0;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.w * 31) + this.x;
    }

    public final boolean isEmpty() {
        return ur1.b(this.w, this.x) > 0;
    }

    public final String toString() {
        return this.w + ".." + this.x;
    }
}
