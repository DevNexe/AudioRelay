package com.facebook.ads.redexgen.X;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1044Wt implements InterfaceC0538Cf {
    public static byte[] A06;
    public static final Constructor<? extends InterfaceC0535Cc> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{4, 51, 51, 46, 51, 97, 40, 47, 50, 53, 32, 47, 53, 40, 32, 53, 40, 47, 38, 97, 7, 13, 0, 2, 97, 36, 57, 53, 36, 47, 50, 40, 46, 47, 37, 30, 21, 8, 0, 21, 19, 4, 21, 20, 80, 21, 2, 2, 31, 2, 80, 19, 2, 21, 17, 4, 25, 30, 23, 80, 54, 60, 49, 51, 80, 21, 8, 4, 2, 17, 19, 4, 31, 2, 98, 110, 108, 47, 103, 96, 98, 100, 99, 110, 110, 106, 47, 96, 101, 114, 47, 104, 111, 117, 100, 115, 111, 96, 109, 47, 100, 121, 110, 113, 109, 96, 120, 100, 115, 51, 47, 100, 121, 117, 47, 103, 109, 96, 98, 47, 71, 109, 96, 98, 68, 121, 117, 115, 96, 98, 117, 110, 115};
    }

    static {
        A01();
        Constructor<? extends InterfaceC0535Cc> constructor = null;
        try {
            constructor = Class.forName(A00(74, 59, 74)).asSubclass(InterfaceC0535Cc.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException(A00(0, 34, 10), e);
        }
        A07 = constructor;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0538Cf
    public final synchronized InterfaceC0535Cc[] A4I() {
        InterfaceC0535Cc[] interfaceC0535CcArr;
        interfaceC0535CcArr = new InterfaceC0535Cc[A07 == null ? 12 : 13];
        interfaceC0535CcArr[0] = new C1029We(this.A01);
        interfaceC0535CcArr[1] = new WU(this.A00);
        interfaceC0535CcArr[2] = new WS(this.A03);
        interfaceC0535CcArr[3] = new C1026Wb(this.A02);
        interfaceC0535CcArr[4] = new WE();
        interfaceC0535CcArr[5] = new WH();
        interfaceC0535CcArr[6] = new C1020Vv(this.A05, this.A04);
        interfaceC0535CcArr[7] = new C1036Wl();
        interfaceC0535CcArr[8] = new WM();
        interfaceC0535CcArr[9] = new W1();
        interfaceC0535CcArr[10] = new C1018Vt();
        interfaceC0535CcArr[11] = new C1039Wo();
        if (A07 != null) {
            try {
                interfaceC0535CcArr[12] = A07.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException(A00(34, 40, 59), e);
            }
        }
        return interfaceC0535CcArr;
    }
}
