package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zc1 implements qf6 {
    public static final char[] w = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final char[] x = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final /* synthetic */ zc1 y = new zc1();

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            int i2 = b & 255;
            int i3 = i + 1;
            char[] cArr2 = x;
            cArr[i] = cArr2[i2 >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static String b(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i = 0; i < length; i++) {
            char[] cArr = w;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }

    public static final void c(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", i2));
        }
    }

    public static final void d(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(Md5A.e("index: ", i, ", size: ", i2));
        }
    }

    public static final void e(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            StringBuilder sbA = a42.a("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            sbA.append(i3);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(Md5A.e("fromIndex: ", i, " > toIndex: ", i2));
        }
    }

    public static byte[] f(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i = 0;
        while (i < length) {
            int i2 = i + 2;
            bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, i2), 16);
            i = i2;
        }
        return bArr;
    }

    @Override // defpackage.qf6
    public Object zza() {
        List list = lg6.a;
        return Integer.valueOf((int) b67.x.zza().zzh());
    }
}
