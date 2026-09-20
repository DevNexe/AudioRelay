package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g57 {
    public static boolean a(byte[] bArr, int i, int i2) {
        int iA;
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            iA = 0;
            break;
        }
        while (true) {
            if (i >= i2) {
                iA = 0;
                break;
            }
            int i3 = i + 1;
            iA = bArr[i];
            if (iA < 0) {
                if (iA >= -32) {
                    if (iA >= -16) {
                        if (i3 < i2 - 2) {
                            int i4 = i3 + 1;
                            byte b = bArr[i3];
                            if (b <= -65) {
                                if ((((b + 112) + (iA << 28)) >> 30) == 0) {
                                    int i5 = i4 + 1;
                                    if (bArr[i4] <= -65) {
                                        i3 = i5 + 1;
                                        if (bArr[i5] > -65) {
                                        }
                                    }
                                }
                            }
                            iA = -1;
                            break;
                        }
                        iA = s57.a(bArr, i3, i2);
                        break;
                    }
                    if (i3 < i2 - 1) {
                        int i6 = i3 + 1;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && ((iA != -32 || b2 >= -96) && (iA != -19 || b2 < -96))) {
                            i = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                        iA = -1;
                        break;
                    }
                    iA = s57.a(bArr, i3, i2);
                    break;
                }
                if (i3 < i2) {
                    if (iA >= -62) {
                        i = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                    iA = -1;
                    break;
                }
                break;
            }
            i = i3;
        }
        return iA == 0;
    }
}
