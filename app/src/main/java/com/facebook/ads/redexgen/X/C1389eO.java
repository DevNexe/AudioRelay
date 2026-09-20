package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1389eO {

    @Nullable
    public InterfaceC1392eR A00;

    @Nullable
    public InterfaceC1390eP A01;
    public C1377eC A02;
    public final InterfaceC1399eY A03;

    @Nullable
    public final InterfaceC1391eQ A04;

    public C1389eO(InterfaceC1399eY interfaceC1399eY, @Nullable InterfaceC1391eQ interfaceC1391eQ) {
        this.A03 = interfaceC1399eY;
        this.A04 = interfaceC1391eQ;
    }

    public static C1389eO A00() {
        return new C1389eO(new GO(), null);
    }

    private void A01(AbstractC1393eS abstractC1393eS, InterfaceC1397eW interfaceC1397eW, GL gl) {
        this.A02 = C1377eC.A00(abstractC1393eS, interfaceC1397eW, gl);
        InterfaceC1392eR interfaceC1392eR = this.A00;
        if (interfaceC1392eR != null) {
            this.A02.A03(interfaceC1392eR);
        }
        InterfaceC1390eP interfaceC1390eP = this.A01;
        if (interfaceC1390eP != null) {
            this.A02.A04(interfaceC1390eP);
        }
    }

    public final void A02(View view) {
        this.A02.A01(view);
    }

    public final void A03(View view, C1395eU c1395eU) {
        this.A02.A02(view, c1395eU);
    }

    public final void A04(AbstractC1393eS abstractC1393eS, View view) {
        GN gn = new GN(view, this.A03);
        final InterfaceC1391eQ interfaceC1391eQ = this.A04;
        A01(abstractC1393eS, gn, new GL(interfaceC1391eQ) { // from class: com.facebook.ads.redexgen.X.3g
            public static byte[] A07;
            public static String[] A08 = {"okBgSYhQGmV0QyU32992deBLR6XrdaZQ", "E", "ZDdZ5rthnspWTI3gzSJHBR7aYCyAxUsq", "EsXM2pc2I6J3hYC1V9OQRTCtALa8wmqB", "DKA0ex9266tXplnV6PUb8C0vdYHWYjG4", "tBgdKBpc94v7LWesC8aTGIaQqZdJYwjy", "iZindrm9v6DBRttH7DMzAa7", "d9237vu9oQoOcpvZwewcjFUDz74P7MIA"};
            public static final String A09;
            public long A00;

            @Nullable
            public InterfaceC1392eR A01;

            @Nullable
            public final InterfaceC1391eQ A02;
            public final Map<String, C1381eG> A06 = new HashMap();
            public final C1382eH A04 = new C1382eH();
            public final C1382eH A03 = new C1382eH();
            public final List<Rect> A05 = new ArrayList(1);

            public static String A02(int i, int i2, int i3) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
                for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
                    bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A03() {
                A07 = new byte[]{41, 21, 20, 14, 93, 11, 20, 24, 10, 13, 18, 20, 19, 9, 93, 21, 28, 14, 93, 19, 18, 9, 93, 31, 24, 24, 19, 93, 16, 24, 28, 14, 8, 15, 24, 25, 93, 18, 15, 93, 20, 14, 93, 28, 93, 26, 15, 18, 8, 13, 93, 10, 21, 20, 30, 21, 93, 10, 20, 17, 17, 93, 19, 24, 11, 24, 15, 93, 15, 24, 9, 8, 15, 19, 93, 28, 93, 16, 24, 28, 14, 8, 15, 24, 16, 24, 19, 9, 93, 14, 20, 19, 30, 24, 93, 20, 9, 90, 14, 93, 16, 28, 25, 24, 93, 8, 13, 93, 18, 27, 93, 14, 8, 31, 11, 20, 24, 10, 14, 93, 9, 21, 28, 9, 93, 30, 18, 8, 17, 25, 93, 31, 24, 93, 18, 27, 27, 14, 30, 15, 24, 24, 19, 118, 125, 111, 75, 123, 121, 118, 63, 36, 61, 61, 113, 39, 56, 52, 38, 113, 33, 35, 62, 33, 52, 35, 37, 40, 113, 55, 62, 35, 113, 35, 52, 60, 62, 39, 52, 53, 113, 56, 37, 52, 60, 113, 125, 97, 104, 122, 92, 107, 126, 97, 124, 122};
            }

            static {
                A03();
                A09 = C03223g.class.getSimpleName();
            }

            {
                this.A02 = interfaceC1391eQ;
            }

            public static Rect A00(@Nullable C1381eG c1381eG) {
                if (c1381eG != null && c1381eG.A02.top != Integer.MIN_VALUE && c1381eG.A02.left != Integer.MIN_VALUE) {
                    Rect rect = c1381eG.A02;
                    String[] strArr = A08;
                    if (strArr[1].length() == strArr[6].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A08;
                    strArr2[1] = "p";
                    strArr2[6] = "Kr6mbDoiLKwWSgNyXDF2oJW";
                    if (rect.right != Integer.MIN_VALUE && c1381eG.A02.bottom != Integer.MIN_VALUE) {
                        return c1381eG.A02;
                    }
                }
                throw new IllegalStateException(A02(0, 143, 38));
            }

            private C1381eG A01(C1395eU c1395eU, Rect rect, Rect rect2) {
                C1381eG c1381eGA03 = this.A06.get(c1395eU.A03);
                if (this.A04.A06(c1395eU)) {
                    if (c1381eGA03 != null) {
                        c1381eGA03.A01 = EnumC1385eK.A04;
                    } else {
                        c1381eGA03 = C1381eG.A03(this.A00);
                        this.A06.put(c1395eU.A03, c1381eGA03);
                    }
                }
                c1381eGA03.A02.set(rect2);
                c1381eGA03.A03.add(new Rect(rect));
                return c1381eGA03;
            }

            private void A04(C1382eH c1382eH) {
                for (C1395eU c1395eU : c1382eH.A01()) {
                    C1381eG c1381eG = this.A06.get(c1395eU.A03);
                    if (c1381eG == null) {
                        InterfaceC1391eQ interfaceC1391eQ2 = this.A02;
                        String[] strArr = A08;
                        if (strArr[0].charAt(8) == strArr[2].charAt(8)) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A08;
                        strArr2[0] = "dCpYPRypiVOHB4OlkAqBqk8EySqTLE1k";
                        strArr2[2] = "r3sjB169HJX8vOmMpko73ANLsggTEmi2";
                        if (interfaceC1391eQ2 != null) {
                            String str = A02(150, 36, 10) + c1395eU.A03;
                            throw new NullPointerException(A02(186, 10, 85));
                        }
                    } else {
                        c1381eG.A01 = EnumC1385eK.A03;
                        c1381eG.A03.clear();
                        c1395eU.A03(this);
                    }
                }
            }

            private void A05(C1382eH c1382eH) {
                Iterator it = c1382eH.A00().iterator();
                while (it.hasNext()) {
                    ((C1395eU) it.next()).A03(this);
                }
            }

            @Override // com.facebook.ads.redexgen.X.GL
            public final void A3J(C1395eU c1395eU, Rect rect, Rect rect2) {
                A01(c1395eU, rect, rect2);
                C1395eU c1395eU2 = c1395eU.A00;
                if (c1395eU2 == C1395eU.A06) {
                    return;
                }
                boolean zA06 = this.A03.A06(c1395eU2);
                C1381eG c1381eGA03 = this.A06.get(c1395eU2.A03);
                if (zA06) {
                    if (c1381eGA03 == null) {
                        c1381eGA03 = C1381eG.A03(this.A00);
                        c1381eGA03.A02.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                        this.A06.put(c1395eU2.A03, c1381eGA03);
                    } else {
                        c1381eGA03.A03.clear();
                        c1381eGA03.A01 = EnumC1385eK.A04;
                    }
                }
                c1381eGA03.A03.add(new Rect(rect));
            }

            @Override // com.facebook.ads.redexgen.X.GL
            public final void A3q(long j, List<Rect> list) {
                this.A00 = j;
                this.A05.clear();
                Iterator<Rect> it = list.iterator();
                while (it.hasNext()) {
                    this.A05.add(new Rect(it.next()));
                }
                Iterator it2 = this.A04.A01().iterator();
                while (it2.hasNext()) {
                    this.A06.remove(((C1395eU) it2.next()).A03);
                }
                Iterator it3 = this.A03.A01().iterator();
                while (it3.hasNext()) {
                    this.A06.remove(((C1395eU) it3.next()).A03);
                }
                Iterator<C1381eG> it4 = this.A06.values().iterator();
                while (it4.hasNext()) {
                    it4.next().A03.clear();
                }
                this.A04.A04();
                this.A03.A04();
            }

            @Override // com.facebook.ads.redexgen.X.GL
            public final void A5E() {
                A05(this.A04);
                A04(this.A04);
                A05(this.A03);
                A04(this.A03);
                if (this.A01 != null) {
                    new C1380eF(toString(), this, this.A05, this.A04.A00(), this.A03.A00());
                    throw new NullPointerException(A02(143, 7, 67));
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1384eJ
            public final void A6j(C1395eU c1395eU, Rect rect) {
                rect.setEmpty();
                Iterator it = this.A06.get(c1395eU.A03).A03.iterator();
                while (it.hasNext()) {
                    rect.union((Rect) it.next());
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1384eJ
            public final EnumC1385eK A7o(C1395eU c1395eU) {
                return this.A06.get(c1395eU.A03).A01;
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1384eJ
            public final void A7q(Rect rect) {
                rect.setEmpty();
                Iterator<Rect> it = this.A05.iterator();
                while (it.hasNext()) {
                    rect.union(it.next());
                }
            }

            @Override // com.facebook.ads.redexgen.X.InterfaceC1384eJ
            public final float A7r(C1395eU c1395eU) {
                C1381eG c1381eG = this.A06.get(c1395eU.A03);
                if (c1381eG != null) {
                    Rect rectA00 = A00(c1381eG);
                    int iHeight = rectA00.height() * rectA00.width();
                    int i = 0;
                    for (Rect rect : c1381eG.A03) {
                        int totalPossibleArea = rect.height();
                        int totalVisibleArea = rect.width();
                        i += totalPossibleArea * totalVisibleArea;
                    }
                    return i / iHeight;
                }
                return 0.0f;
            }

            @Override // com.facebook.ads.redexgen.X.GL
            public final void AEk(@Nullable InterfaceC1392eR interfaceC1392eR) {
                this.A01 = interfaceC1392eR;
            }
        });
    }
}
