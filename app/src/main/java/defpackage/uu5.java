package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class uu5 {
    public final int a;

    public uu5(int i) {
        this.a = i;
    }

    public static String a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return a(this.a);
    }
}
