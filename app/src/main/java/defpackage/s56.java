package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class s56 implements nr4 {
    public final int w;

    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    @Override // defpackage.nr4
    public final StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int i;
        boolean z;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num != null) {
                int iIntValue = num.intValue();
                int i5 = i2 - iIntValue;
                if (i2 + i5 <= stackTraceElementArr.length) {
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            z = true;
                            break;
                        }
                        if (!stackTraceElementArr[iIntValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                            z = false;
                            break;
                        }
                        i6++;
                    }
                } else {
                    z = false;
                    break;
                }
                if (z) {
                    int iIntValue2 = i2 - num.intValue();
                    if (i4 < this.w) {
                        System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, iIntValue2);
                        i3 += iIntValue2;
                        i4++;
                    }
                    i = (iIntValue2 - 1) + i2;
                } else {
                    stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                    i3++;
                    i = i2;
                    i4 = 1;
                }
            } else {
                stackTraceElementArr2[i3] = stackTraceElementArr[i2];
                i3++;
                i = i2;
                i4 = 1;
            }
            map.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        return i3 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    public final int b() {
        int i = this.w;
        if (i == 2) {
            return 10;
        }
        if (i == 5) {
            return 11;
        }
        if (i == 29) {
            return 12;
        }
        if (i == 42) {
            return 16;
        }
        if (i != 22) {
            return i != 23 ? 0 : 15;
        }
        return 1073741824;
    }
}
