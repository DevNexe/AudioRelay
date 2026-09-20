package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class tc5 implements Comparable<tc5> {
    public static final QnHx x = new QnHx();
    public final byte w;

    public static final class QnHx {
    }

    public static String a(byte b) {
        return String.valueOf(b & 255);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(tc5 tc5Var) {
        return ur1.b(this.w & 255, tc5Var.w & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tc5) {
            return this.w == ((tc5) obj).w;
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
