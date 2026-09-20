package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class wnED implements bm88 {
    public String a;
    public final int[] b = new int[2];

    public final int[] c(int i, int i2) {
        if (i < 0 || i2 < 0 || i == i2) {
            return null;
        }
        int[] iArr = this.b;
        iArr[0] = i;
        iArr[1] = i2;
        return iArr;
    }

    public final String d() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        ur1.e("text");
        throw null;
    }
}
