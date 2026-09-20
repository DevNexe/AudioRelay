package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class l8 {
    public static final /* synthetic */ int a = 0;

    static {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[i] = mv4.E("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i, 0, false, 6);
        }
    }
}
