package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xp4 {
    public static final Object a = new Object();

    public static final void a(int i, int i2) {
        if (i >= 0 && i < i2) {
            return;
        }
        throw new IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
    }
}
