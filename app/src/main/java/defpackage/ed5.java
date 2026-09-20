package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ed5 implements Comparable<ed5> {
    public static final QnHx x = new QnHx();
    public final short w;

    public static final class QnHx {
    }

    public static String a(short s) {
        return String.valueOf(s & 65535);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ed5 ed5Var) {
        return ur1.b(this.w & 65535, ed5Var.w & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ed5) {
            return this.w == ((ed5) obj).w;
        }
        return false;
    }

    public final int hashCode() {
        return this.w;
    }

    public final String toString() {
        return a(this.w);
    }
}
