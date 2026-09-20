package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class vc5 implements Comparable<vc5> {
    public static final QnHx x = new QnHx();
    public final int w;

    public static final class QnHx {
    }

    public /* synthetic */ vc5(int i) {
        this.w = i;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(vc5 vc5Var) {
        return ac.l(this.w, vc5Var.w);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vc5) {
            return this.w == ((vc5) obj).w;
        }
        return false;
    }

    public final int hashCode() {
        return this.w;
    }

    public final String toString() {
        return String.valueOf(((long) this.w) & 4294967295L);
    }
}
