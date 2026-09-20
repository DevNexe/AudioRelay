package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1020Vv implements InterfaceC0535Cc {
    public static byte[] A0C;
    public static String[] A0D = {"1wQJeguTcmzEzlcqQISF6uciTtBYCHEI", "1z5HoD8RnfRsH4NGqOJrgtDb3AvWKmRf", "OZb5z3fyn7DmUcX5PD2FSiUNDYO3SJGv", "xysXnf11fptxvGLEVlqKxNXP96VBbPb9", "B9gj7Y4phCIGiISa5KNqUW4wq7x20Uai", "0XWjmjuElj7dnGBGcTqheWJCaJtkSIxV", "xem2h", "3rpnxRNe64JCaC2IexlmS1y9p5GeiPOv"};
    public static final InterfaceC0538Cf A0E;
    public static final long A0F;
    public static final long A0G;
    public static final long A0H;
    public int A00;
    public int A01;
    public InterfaceC0537Ce A02;
    public InterfaceC0569Dx A03;
    public boolean A04;
    public final int A05;
    public final SparseArray<InterfaceC0569Dx> A06;
    public final SparseBooleanArray A07;
    public final SparseIntArray A08;
    public final InterfaceC0567Dv A09;
    public final C0679Ij A0A;
    public final List<C0691Iv> A0B;

    public static String A0D(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0G() {
        A0C = new byte[]{-90, -88, -110, -104, -12, 18, 31, 31, 32, 37, -47, 23, 26, 31, 21, -47, 36, 42, 31, 20, -47, 19, 42, 37, 22, -33, -47, -2, 32, 36, 37, -47, 29, 26, 28, 22, 29, 42, -47, 31, 32, 37, -47, 18, -47, 5, 35, 18, 31, 36, 33, 32, 35, 37, -47, 4, 37, 35, 22, 18, 30, -33, -98, -102, -100, -116, -61, -64, -47, -66};
    }

    static {
        A0G();
        A0E = new C1023Vy();
        A0F = C0695Iz.A08(A0D(0, 4, 26));
        A0G = C0695Iz.A08(A0D(62, 4, 14));
        A0H = C0695Iz.A08(A0D(66, 4, 48));
    }

    public C1020Vv() {
        this(0);
    }

    public C1020Vv(int i) {
        this(1, i);
    }

    public C1020Vv(int i, int i2) {
        this(i, new C0691Iv(0L), new WC(i2));
    }

    public C1020Vv(int i, C0691Iv c0691Iv, InterfaceC0567Dv interfaceC0567Dv) {
        this.A09 = (InterfaceC0567Dv) IK.A01(interfaceC0567Dv);
        this.A05 = i;
        if (i == 1 || i == 2) {
            this.A0B = Collections.singletonList(c0691Iv);
        } else {
            this.A0B = new ArrayList();
            this.A0B.add(c0691Iv);
        }
        this.A0A = new C0679Ij(new byte[9400], 0);
        this.A07 = new SparseBooleanArray();
        this.A06 = new SparseArray<>();
        this.A08 = new SparseIntArray();
        A0F();
    }

    public static /* synthetic */ int A01(C1020Vv c1020Vv) {
        int i = c1020Vv.A01;
        c1020Vv.A01 = i + 1;
        return i;
    }

    private void A0F() {
        this.A07.clear();
        this.A06.clear();
        SparseArray<InterfaceC0569Dx> sparseArrayA4K = this.A09.A4K();
        int size = sparseArrayA4K.size();
        for (int i = 0; i < size; i++) {
            this.A06.put(sparseArrayA4K.keyAt(i), sparseArrayA4K.valueAt(i));
        }
        this.A06.put(0, new W0(new C1022Vx(this)));
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void A8I(InterfaceC0537Ce interfaceC0537Ce) {
        this.A02 = interfaceC0537Ce;
        interfaceC0537Ce.AEM(new C1041Wq(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x010d, code lost:
    
        if (r8 == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010f, code lost:
    
        r13.A0A.A0Y(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0115, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x011b, code lost:
    
        if (r8 == r9) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011e, code lost:
    
        r0 = r8 + 1;
        r8 = r0 & 15;
        r1 = com.facebook.ads.redexgen.X.C1020Vv.A0D[1].charAt(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
    
        if (r1 == 72) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0135, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0136, code lost:
    
        com.facebook.ads.redexgen.X.C1020Vv.A0D[3] = "dSZ0cSzoMmmORQANAKDw4NsHeD3mI6Jb";
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
    
        if (r9 == r8) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013f, code lost:
    
        r3.AEK();
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int ADX(com.facebook.ads.redexgen.X.InterfaceC0536Cd r14, com.facebook.ads.redexgen.X.C0540Cj r15) throws java.lang.InterruptedException, java.io.IOException {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1020Vv.ADX(com.facebook.ads.redexgen.X.Cd, com.facebook.ads.redexgen.X.Cj):int");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final void AEL(long j, long j2) {
        int size = this.A0B.size();
        for (int i = 0; i < size; i++) {
            this.A0B.get(i).A08();
        }
        this.A0A.A0V();
        this.A08.clear();
        A0F();
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0535Cc
    public final boolean AEv(InterfaceC0536Cd interfaceC0536Cd) throws InterruptedException, IOException {
        byte[] bArr = this.A0A.A00;
        interfaceC0536Cd.AD7(bArr, 0, 940);
        int i = 0;
        while (A0D[1].charAt(3) == 'H') {
            A0D[1] = "vUfHgSsJvwNFwwToyev4j8iiTP0xmLzC";
            if (i >= 188) {
                return false;
            }
            int i2 = 0;
            while (true) {
                if (i2 == 5) {
                    interfaceC0536Cd.AEt(i);
                    return true;
                }
                int j = i2 * 188;
                if (bArr[j + i] != 71) {
                    break;
                }
                i2++;
            }
            i++;
        }
        throw new RuntimeException();
    }
}
