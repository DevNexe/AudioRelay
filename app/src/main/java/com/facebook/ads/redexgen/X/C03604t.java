package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03604t {
    public static byte[] A02;
    public static String[] A03 = {"WXpxlTya5H7kpLIT7UUfzIgXOYds4Vfk", "JVDNa5tAOP", "C1CZfaM4quGDjTOWU4x6KBGTC5pPu33J", "VymAVHyd", "K8p7KG0zsDoAf7GmBTiUCUpdPzk9iS4o", "MydLOSuorekD0WEADrXIrTB2aFx1Ufvf", "1zIVUT6Fxq52O6VZbnoN9TsXnO1jN3fj", "z9Q03TMU5lxkReREt3I6AE4mCa6N3G46"};

    @VisibleForTesting
    public final C1279cU<AbstractC03524l, C03584r> A00 = new C1279cU<>();

    @VisibleForTesting
    public final C2X<AbstractC03524l> A01 = new C2X<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 71);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{-99, -59, -61, -60, 112, -64, -62, -65, -58, -71, -76, -75, 112, -74, -68, -79, -73, 112, -96, -94, -107, 112, -65, -62, 112, -96, -97, -93, -92};
    }

    static {
        A02();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        r3.A00 &= r9 ^ (-1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        if (r9 != 4) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r5 = r3.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
    
        r6 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (com.facebook.ads.redexgen.X.C03604t.A03[5].charAt(20) == 'R') goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C03604t.A03;
        r2[0] = "LDlhycQGZBtlD6IMRSONBH11SqKxQWfy";
        r2[6] = "DCgYh9gvbnrpKHe96mnmPCff01xTtOfJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006e, code lost:
    
        if ((r6 & 12) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0070, code lost:
    
        r7.A00.A0A(r4);
        com.facebook.ads.redexgen.X.C03584r.A02(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C03604t.A03;
        r2[7] = "9mfdPnfY5V3FVy8Q2gQ6uDsmmOIXndsz";
        r2[2] = "ekMjHGebRREBiMI4gT56rHDvbCCByAvd";
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if ((r6 & 12) != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C03604t.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
    
        if (r2[7].charAt(19) == r2[2].charAt(19)) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a5, code lost:
    
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a6, code lost:
    
        r2 = com.facebook.ads.redexgen.X.C03604t.A03;
        r2[1] = "AZoo0ocwP6";
        r2[3] = "Mxzo3dXJ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b2, code lost:
    
        if (r9 != 8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b4, code lost:
    
        r5 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c3, code lost:
    
        if (r5 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        throw new java.lang.IllegalArgumentException(A01(0, 29, 9));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.X.C4O A00(com.facebook.ads.redexgen.X.AbstractC03524l r8, int r9) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C03604t.A00(com.facebook.ads.redexgen.X.4l, int):com.facebook.ads.redexgen.X.4O");
    }

    @Nullable
    public final C4O A03(AbstractC03524l abstractC03524l) {
        return A00(abstractC03524l, 8);
    }

    @Nullable
    public final C4O A04(AbstractC03524l abstractC03524l) {
        return A00(abstractC03524l, 4);
    }

    public final AbstractC03524l A05(long j) {
        return this.A01.A08(j);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C03584r.A01();
    }

    public final void A08(long j, AbstractC03524l abstractC03524l) {
        this.A01.A0B(j, abstractC03524l);
    }

    public final void A09(AbstractC03524l abstractC03524l) {
        C03584r c03584rA00 = this.A00.get(abstractC03524l);
        if (c03584rA00 == null) {
            c03584rA00 = C03584r.A00();
            this.A00.put(abstractC03524l, c03584rA00);
        }
        c03584rA00.A00 |= 1;
    }

    public final void A0A(AbstractC03524l abstractC03524l) {
        C03584r c03584r = this.A00.get(abstractC03524l);
        if (c03584r == null) {
            return;
        }
        c03584r.A00 &= -2;
    }

    public final void A0B(AbstractC03524l abstractC03524l) {
        for (int iA06 = this.A01.A06() - 1; iA06 >= 0; iA06--) {
            if (abstractC03524l == this.A01.A07(iA06)) {
                this.A01.A0A(iA06);
                break;
            }
        }
        C03584r c03584rRemove = this.A00.remove(abstractC03524l);
        if (c03584rRemove != null) {
            C03584r.A02(c03584rRemove);
        }
    }

    public final void A0C(AbstractC03524l abstractC03524l) {
        A0A(abstractC03524l);
    }

    public final void A0D(AbstractC03524l abstractC03524l, C4O c4o) {
        C03584r c03584rA00 = this.A00.get(abstractC03524l);
        if (c03584rA00 == null) {
            c03584rA00 = C03584r.A00();
            this.A00.put(abstractC03524l, c03584rA00);
        }
        c03584rA00.A00 |= 2;
        c03584rA00.A02 = c4o;
    }

    public final void A0E(AbstractC03524l abstractC03524l, C4O c4o) {
        C03584r c03584rA00 = this.A00.get(abstractC03524l);
        if (c03584rA00 == null) {
            c03584rA00 = C03584r.A00();
            this.A00.put(abstractC03524l, c03584rA00);
        }
        c03584rA00.A01 = c4o;
        c03584rA00.A00 |= 8;
    }

    public final void A0F(AbstractC03524l abstractC03524l, C4O c4o) {
        C03584r c03584rA00 = this.A00.get(abstractC03524l);
        if (c03584rA00 == null) {
            c03584rA00 = C03584r.A00();
            this.A00.put(abstractC03524l, c03584rA00);
        }
        c03584rA00.A02 = c4o;
        c03584rA00.A00 |= 4;
    }

    public final void A0G(InterfaceC03594s interfaceC03594s) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC03524l abstractC03524lA09 = this.A00.A09(size);
            C03584r c03584rA0A = this.A00.A0A(size);
            if ((c03584rA0A.A00 & 3) == 3) {
                interfaceC03594s.AFJ(abstractC03524lA09);
            } else if ((c03584rA0A.A00 & 1) != 0) {
                if (c03584rA0A.A02 == null) {
                    interfaceC03594s.AFJ(abstractC03524lA09);
                } else {
                    C4O c4o = c03584rA0A.A02;
                    C4O c4o2 = c03584rA0A.A01;
                    if (A03[5].charAt(20) == 'R') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A03;
                    strArr[1] = "fJVAe19tdP";
                    strArr[3] = "3fJsXDGb";
                    interfaceC03594s.ADN(abstractC03524lA09, c4o, c4o2);
                }
            } else if ((c03584rA0A.A00 & 14) == 14) {
                interfaceC03594s.ADL(abstractC03524lA09, c03584rA0A.A02, c03584rA0A.A01);
            } else if ((c03584rA0A.A00 & 12) == 12) {
                interfaceC03594s.ADP(abstractC03524lA09, c03584rA0A.A02, c03584rA0A.A01);
            } else if ((c03584rA0A.A00 & 4) != 0) {
                interfaceC03594s.ADN(abstractC03524lA09, c03584rA0A.A02, null);
            } else if ((c03584rA0A.A00 & 8) != 0) {
                interfaceC03594s.ADL(abstractC03524lA09, c03584rA0A.A02, c03584rA0A.A01);
            }
            C03584r.A02(c03584rA0A);
        }
    }

    public final boolean A0H(AbstractC03524l abstractC03524l) {
        C03584r c03584r = this.A00.get(abstractC03524l);
        return (c03584r == null || (c03584r.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC03524l abstractC03524l) {
        C03584r c03584r = this.A00.get(abstractC03524l);
        return (c03584r == null || (c03584r.A00 & 4) == 0) ? false : true;
    }
}
