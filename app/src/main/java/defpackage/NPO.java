package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class NPO extends AY {
    public static void Z(int[] iArr, int[] iArr2, int i, int i2) {
        if ((i2 & 8) != 0) {
            i = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, 0, i - 0);
    }

    public static void a0(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    public static final byte[] b0(byte[] bArr, int i, int i2) {
        AY.t(i2, bArr.length);
        return Arrays.copyOfRange(bArr, i, i2);
    }

    public static final float[] c0(float[] fArr, int i, int i2) {
        AY.t(i2, fArr.length);
        return Arrays.copyOfRange(fArr, i, i2);
    }

    public static void d0(Object[] objArr, py4 py4Var) {
        Arrays.fill(objArr, 0, objArr.length, py4Var);
    }
}
