package defpackage;

import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes.dex */
public final class uy0 implements Comparable<uy0> {
    public static final QnHx w = new QnHx();
    public static final float x;

    public static final class QnHx {
    }

    static {
        a(1.0f);
        a(-1.0f);
        x = Float.intBitsToFloat(1056964608);
    }

    public static short a(float f) {
        int i;
        w.getClass();
        int iFloatToRawIntBits = Float.floatToRawIntBits(f);
        int i2 = iFloatToRawIntBits >>> 31;
        int i3 = (iFloatToRawIntBits >>> 23) & 255;
        int i4 = iFloatToRawIntBits & 8388607;
        int i5 = 31;
        int i6 = 0;
        if (i3 != 255) {
            int i7 = (i3 - 127) + 15;
            if (i7 >= 31) {
                i5 = 49;
            } else {
                if (i7 > 0) {
                    i6 = i4 >> 13;
                    if ((i4 & 4096) != 0) {
                        i = (((i7 << 10) | i6) + 1) | (i2 << 15);
                    } else {
                        i5 = i7;
                    }
                    return (short) i;
                }
                if (i7 >= -10) {
                    int i8 = (i4 | 8388608) >> (1 - i7);
                    if ((i8 & 4096) != 0) {
                        i8 += 8192;
                    }
                    i6 = i8 >> 13;
                }
                i5 = 0;
            }
        } else if (i4 != 0) {
            i6 = AdRequest.MAX_CONTENT_URL_LENGTH;
        }
        i = (i2 << 15) | (i5 << 10) | i6;
        return (short) i;
    }

    public static final float c(short s) {
        int i;
        int i2;
        int i3 = s & 65535;
        int i4 = 32768 & i3;
        int i5 = (i3 >>> 10) & 31;
        int i6 = i3 & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                if (i7 != 0) {
                    i7 |= 4194304;
                }
                i = i7;
                i2 = 255;
            } else {
                int i8 = (i5 - 15) + 127;
                i = i7;
                i2 = i8;
            }
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - x;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i2 = 0;
            i = 0;
        }
        return Float.intBitsToFloat((i2 << 23) | (i4 << 16) | i);
    }
}
