package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class v2zj extends wnED {
    public static v2zj c;

    public v2zj(int i) {
    }

    @Override // defpackage.bm88
    public final int[] a(int i) {
        int length = d().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && d().charAt(i) == '\n' && !f(i)) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !e(i2)) {
            i2++;
        }
        return c(i, i2);
    }

    @Override // defpackage.bm88
    public final int[] b(int i) {
        int length = d().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0) {
            int i2 = i - 1;
            if (d().charAt(i2) != '\n' || e(i)) {
                break;
            }
            i = i2;
        }
        if (i <= 0) {
            return null;
        }
        int i3 = i - 1;
        while (i3 > 0 && !f(i3)) {
            i3--;
        }
        return c(i3, i);
    }

    public final boolean e(int i) {
        return i > 0 && d().charAt(i + (-1)) != '\n' && (i == d().length() || d().charAt(i) == '\n');
    }

    public final boolean f(int i) {
        return d().charAt(i) != '\n' && (i == 0 || d().charAt(i - 1) == '\n');
    }
}
