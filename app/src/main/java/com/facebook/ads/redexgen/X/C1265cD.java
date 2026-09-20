package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.cD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1265cD implements C4B {
    public static byte[] A08;
    public static String[] A09 = {"X1JWoRd1RTsi5LXg3YfkE890Z0SkAp6s", "8cHG76lMVFwKxBGRg2kgut24eHhxfbd", "G9TzZa55JFGh4eGgvGtqHGY1m3qrW6LM", "T7A4lgHZzGr7V1uQcw7LfDSO4lerGRH7", "wT7nveBXif1G6UL4LkiEJi9kfhK", "XR1Jqmc9zxsTs7lfyBsyi3NvUHLKhP3K", "pVA6ZWYUVwE4UScIoRBBosOqE3FsfWwK", "nWmw"};
    public int A00;
    public InterfaceC02962e<C03303o> A01;
    public final InterfaceC03293n A02;
    public final C4C A03;
    public final Runnable A04;
    public final ArrayList<C03303o> A05;
    public final ArrayList<C03303o> A06;
    public final boolean A07;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-100, -75, -78, -75, -74, -66, -75, 103, -68, -73, -85, -88, -69, -84, 103, -74, -73, 103, -69, -64, -73, -84, 103, -83, -74, -71, 103, -44, -45, -47, -34, -123, -41, -54, -46, -44, -37, -54, -123, -58, -45, -55, -123, -38, -43, -55, -58, -39, -54, -123, -44, -43, -40, -123, -56, -58, -45, -123, -57, -54, -123, -55, -50, -40, -43, -58, -39, -56, -51, -54, -55, -123, -50, -45, -123, -53, -50, -41, -40, -39, -123, -43, -58, -40, -40, -24, -23, -103, -20, -31, -24, -18, -27, -35, -103, -37, -34, -103, -21, -34, -26, -24, -17, -34, -103, -24, -21, -103, -18, -23, -35, -38, -19, -34, -89, 30, 19, 26, 32, 23, 15, -53, 25, 26, 31, -53, 15, 20, 30, 27, 12, 31, 14, 19, -53, 12, 15, 15, -53, 26, 29, -53, 24, 26, 33, 16, -53, 17, 26, 29, -53, 27, 29, 16, -53, 23, 12, 36, 26, 32, 31};
    }

    static {
        A03();
    }

    public C1265cD(InterfaceC03293n interfaceC03293n) {
        this(interfaceC03293n, false);
    }

    public C1265cD(InterfaceC03293n interfaceC03293n, boolean z) {
        this.A01 = new C1278cT(30);
        this.A05 = new ArrayList<>();
        this.A06 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = interfaceC03293n;
        this.A07 = z;
        this.A03 = new C4C(this);
    }

    private int A00(int i, int start) {
        int i2;
        int i3;
        for (int end = this.A06.size() - 1; end >= 0; end--) {
            C03303o c03303o = this.A06.get(end);
            if (c03303o.A00 == 8) {
                if (c03303o.A02 < c03303o.A01) {
                    i2 = c03303o.A02;
                    i3 = c03303o.A01;
                } else {
                    i2 = c03303o.A01;
                    i3 = c03303o.A02;
                }
                if (i >= i2 && i <= i3) {
                    if (i2 == c03303o.A02) {
                        if (start == 1) {
                            c03303o.A01++;
                        } else if (start == 2) {
                            c03303o.A01--;
                        }
                        i++;
                    } else {
                        if (start == 1) {
                            c03303o.A02++;
                        } else if (start == 2) {
                            c03303o.A02--;
                        }
                        i--;
                    }
                } else if (i < c03303o.A02) {
                    if (start == 1) {
                        c03303o.A02++;
                        c03303o.A01++;
                    } else if (start == 2) {
                        c03303o.A02--;
                        c03303o.A01--;
                    }
                }
            } else if (c03303o.A02 <= i) {
                if (c03303o.A00 == 1) {
                    int i4 = c03303o.A01;
                    if (A09[7].length() != 4) {
                        throw new RuntimeException();
                    }
                    A09[7] = "N0sU";
                    i -= i4;
                } else if (c03303o.A00 == 2) {
                    i += c03303o.A01;
                }
            } else if (start == 1) {
                c03303o.A02++;
            } else if (start == 2) {
                c03303o.A02--;
            }
        }
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            C03303o c03303o2 = this.A06.get(size);
            if (c03303o2.A00 == 8) {
                if (c03303o2.A01 == c03303o2.A02 || c03303o2.A01 < 0) {
                    this.A06.remove(size);
                    ADh(c03303o2);
                }
            } else if (c03303o2.A01 <= 0) {
                this.A06.remove(size);
                ADh(c03303o2);
            }
        }
        return i;
    }

    private final int A01(int i, int i2) {
        int size = this.A06.size();
        while (i2 < size) {
            C03303o c03303o = this.A06.get(i2);
            if (c03303o.A00 == 8) {
                if (c03303o.A02 == i) {
                    i = c03303o.A01;
                } else {
                    if (c03303o.A02 < i) {
                        i--;
                    }
                    if (c03303o.A01 <= i) {
                        i++;
                    }
                }
            } else if (c03303o.A02 > i) {
                continue;
            } else if (c03303o.A00 == 2) {
                if (i < c03303o.A02 + c03303o.A01) {
                    return -1;
                }
                i -= c03303o.A01;
            } else {
                int i3 = c03303o.A00;
                String[] strArr = A09;
                if (strArr[6].charAt(31) != strArr[5].charAt(31)) {
                    throw new RuntimeException();
                }
                A09[1] = "6d2Cvy1MfGwOem3AHh21iiz4RwVuOhP";
                if (i3 == 1) {
                    i += c03303o.A01;
                }
            }
            i2++;
        }
        return i;
    }

    private void A04(C03303o c03303o) {
        A09(c03303o);
    }

    private void A05(C03303o c03303o) {
        A09(c03303o);
    }

    private void A06(C03303o c03303o) {
        int tmpEnd = c03303o.A02;
        int type = 0;
        int position = c03303o.A02 + c03303o.A01;
        byte b = -1;
        int i = c03303o.A02;
        while (i < position) {
            boolean z = false;
            if (this.A02.A5Q(i) != null || A0C(i)) {
                if (b == 0) {
                    A08(A9n(2, tmpEnd, type, null));
                    z = true;
                }
                b = 1;
            } else {
                if (b == 1) {
                    C03303o newOp = A9n(2, tmpEnd, type, null);
                    A09(newOp);
                    z = true;
                }
                b = 0;
            }
            if (z) {
                i -= type;
                position -= type;
                type = 1;
            } else {
                type++;
            }
            i++;
        }
        if (type != c03303o.A01) {
            ADh(c03303o);
            c03303o = A9n(2, tmpEnd, type, null);
        }
        if (b == 0) {
            A08(c03303o);
        } else {
            A09(c03303o);
        }
    }

    private void A07(C03303o c03303o) {
        int tmpEnd = c03303o.A02;
        int type = 0;
        int position = c03303o.A02 + c03303o.A01;
        byte b = -1;
        int i = c03303o.A02;
        while (true) {
            String[] strArr = A09;
            if (strArr[6].charAt(31) != strArr[5].charAt(31)) {
                throw new RuntimeException();
            }
            A09[0] = "QVMb2fRXyzWHiAZPpRD1aZXDVthvAAWC";
            if (i < position) {
                if (this.A02.A5Q(i) != null || A0C(i)) {
                    if (b == 0) {
                        A08(A9n(4, tmpEnd, type, c03303o.A03));
                        type = 0;
                        tmpEnd = i;
                    }
                    b = 1;
                } else {
                    if (b == 1) {
                        C03303o newOp = A9n(4, tmpEnd, type, c03303o.A03);
                        A09(newOp);
                        type = 0;
                        tmpEnd = i;
                    }
                    b = 0;
                }
                type++;
                i++;
            } else {
                if (type != c03303o.A01) {
                    Object obj = c03303o.A03;
                    ADh(c03303o);
                    c03303o = A9n(4, tmpEnd, type, obj);
                }
                if (b == 0) {
                    A08(c03303o);
                    return;
                } else {
                    A09(c03303o);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0071  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x0096  */
    /* JADX WARN: Code duplicated, block: B:33:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    private void A08(C03303o c03303o) {
        int i;
        int iA00;
        int i2;
        int updatedPos;
        int pos;
        if (c03303o.A00 != 1) {
            int i3 = c03303o.A00;
            if (A09[4].length() == 28) {
                throw new RuntimeException();
            }
            A09[7] = "fuh7";
            if (i3 != 8) {
                int iA01 = A00(c03303o.A02, c03303o.A00);
                int i4 = 1;
                int i5 = c03303o.A02;
                int offsetPositionForPartial = c03303o.A00;
                if (offsetPositionForPartial == 2) {
                    i = 0;
                } else if (offsetPositionForPartial == 4) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException(A02(85, 30, 55) + c03303o);
                }
                int positionMultiplier = 1;
                while (true) {
                    int i6 = c03303o.A01;
                    int tmpCnt = A09[1].length();
                    if (tmpCnt != 31) {
                        if (positionMultiplier >= i6) {
                            break;
                        }
                        int tmpCnt2 = c03303o.A02;
                        int p = i * positionMultiplier;
                        int pos2 = tmpCnt2 + p;
                        int p2 = c03303o.A00;
                        iA00 = A00(pos2, p2);
                        i2 = 0;
                        updatedPos = c03303o.A00;
                        if (updatedPos != 2) {
                            pos = iA00 == iA01 ? 1 : 0;
                            i2 = pos;
                        } else if (updatedPos == 4) {
                            pos = iA00 == iA01 + 1 ? 1 : 0;
                            i2 = pos;
                        }
                        if (i2 != 0) {
                            i4++;
                        } else {
                            C03303o c03303oA9n = A9n(c03303o.A00, iA01, i4, c03303o.A03);
                            A0A(c03303oA9n, i5);
                            ADh(c03303oA9n);
                            if (c03303o.A00 == 4) {
                                i5 += i4;
                            }
                            iA01 = iA00;
                            if (A09[0].charAt(28) != 'A') {
                                i4 = 1;
                            } else {
                                String[] strArr = A09;
                                strArr[3] = "EcOQEIn9Q5XvTjS6SUXoeHtz7oIrLcgt";
                                strArr[2] = "qdxRTeDYAvuRxJ3EQmMRRmoNV8wrEDZm";
                                i4 = 1;
                            }
                        }
                        positionMultiplier++;
                    } else {
                        A09[4] = "Sd1L0VSyo86shE8ew7ry1Omr";
                        if (positionMultiplier >= i6) {
                            break;
                        }
                        int tmpCnt3 = c03303o.A02;
                        int p3 = i * positionMultiplier;
                        int pos3 = tmpCnt3 + p3;
                        int p4 = c03303o.A00;
                        iA00 = A00(pos3, p4);
                        i2 = 0;
                        updatedPos = c03303o.A00;
                        if (updatedPos != 2) {
                            if (iA00 == iA01) {
                            }
                            i2 = pos;
                        } else if (updatedPos == 4) {
                            if (iA00 == iA01 + 1) {
                            }
                            i2 = pos;
                        }
                        if (i2 != 0) {
                            i4++;
                        } else {
                            C03303o c03303oA9n2 = A9n(c03303o.A00, iA01, i4, c03303o.A03);
                            A0A(c03303oA9n2, i5);
                            ADh(c03303oA9n2);
                            if (c03303o.A00 == 4) {
                                i5 += i4;
                            }
                            iA01 = iA00;
                            if (A09[0].charAt(28) != 'A') {
                                i4 = 1;
                            } else {
                                String[] strArr2 = A09;
                                strArr2[3] = "EcOQEIn9Q5XvTjS6SUXoeHtz7oIrLcgt";
                                strArr2[2] = "qdxRTeDYAvuRxJ3EQmMRRmoNV8wrEDZm";
                                i4 = 1;
                            }
                        }
                        positionMultiplier++;
                    }
                }
                Object obj = c03303o.A03;
                ADh(c03303o);
                if (i4 > 0) {
                    C03303o c03303oA9n3 = A9n(c03303o.A00, iA01, i4, obj);
                    A0A(c03303oA9n3, i5);
                    ADh(c03303oA9n3);
                    return;
                }
                return;
            }
        }
        throw new IllegalArgumentException(A02(115, 46, 105));
    }

    private void A09(C03303o c03303o) {
        this.A06.add(c03303o);
        int i = c03303o.A00;
        if (i == 1) {
            this.A02.A9o(c03303o.A02, c03303o.A01);
            return;
        }
        if (i == 2) {
            this.A02.A9r(c03303o.A02, c03303o.A01);
            return;
        }
        if (i == 4) {
            this.A02.A9U(c03303o.A02, c03303o.A01, c03303o.A03);
        } else {
            if (i == 8) {
                this.A02.A9p(c03303o.A02, c03303o.A01);
                return;
            }
            throw new IllegalArgumentException(A02(0, 27, 5) + c03303o);
        }
    }

    private final void A0A(C03303o c03303o, int i) {
        this.A02.AAV(c03303o);
        int i2 = c03303o.A00;
        if (i2 == 2) {
            this.A02.A9q(i, c03303o.A01);
        } else {
            if (i2 == 4) {
                this.A02.A9U(i, c03303o.A01, c03303o.A03);
                return;
            }
            throw new IllegalArgumentException(A02(27, 58, 35));
        }
    }

    private final void A0B(List<C03303o> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ADh(list.get(i));
        }
        list.clear();
    }

    private boolean A0C(int i) {
        int size = this.A06.size();
        for (int pos = 0; pos < size; pos++) {
            C03303o c03303o = this.A06.get(pos);
            if (c03303o.A00 == 8) {
                if (A01(c03303o.A01, pos + 1) == i) {
                    return true;
                }
            } else {
                int i2 = c03303o.A00;
                if (A09[4].length() == 28) {
                    throw new RuntimeException();
                }
                A09[7] = "h3FT";
                if (i2 == 1) {
                    int i3 = c03303o.A02 + c03303o.A01;
                    for (int i4 = c03303o.A02; i4 < i3; i4++) {
                        if (A01(i4, pos + 1) == i) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final int A0D(int i) {
        return A01(i, 0);
    }

    public final int A0E(int i) {
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            C03303o c03303o = this.A05.get(i2);
            int i3 = c03303o.A00;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (c03303o.A02 == i) {
                            i = c03303o.A01;
                        } else {
                            if (c03303o.A02 < i) {
                                i--;
                            }
                            if (c03303o.A01 <= i) {
                                i++;
                            }
                        }
                    }
                } else if (c03303o.A02 > i) {
                    continue;
                } else {
                    if (c03303o.A02 + c03303o.A01 > i) {
                        return -1;
                    }
                    i -= c03303o.A01;
                }
            } else if (c03303o.A02 <= i) {
                i += c03303o.A01;
            }
        }
        return i;
    }

    public final void A0F() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A02.AAX(this.A06.get(i));
        }
        A0B(this.A06);
        this.A00 = 0;
    }

    public final void A0G() {
        A0F();
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            C03303o c03303o = this.A05.get(i);
            int i2 = c03303o.A00;
            if (i2 == 1) {
                this.A02.AAX(c03303o);
                InterfaceC03293n interfaceC03293n = this.A02;
                int i3 = c03303o.A02;
                int i4 = c03303o.A01;
                interfaceC03293n.A9o(i3, i4);
            } else if (i2 == 2) {
                this.A02.AAX(c03303o);
                InterfaceC03293n interfaceC03293n2 = this.A02;
                int i5 = c03303o.A02;
                int i6 = c03303o.A01;
                if (A09[0].charAt(28) != 'A') {
                    A09[0] = "CM7MK7KhSxDopOj0YrHNMoPSB3hYAvlM";
                    interfaceC03293n2.A9q(i5, i6);
                } else {
                    A09[0] = "0a4GBd0juwjU6ZOPGBL8pgIRsQZTAwEC";
                    interfaceC03293n2.A9q(i5, i6);
                }
            } else if (i2 == 4) {
                this.A02.AAX(c03303o);
                InterfaceC03293n interfaceC03293n3 = this.A02;
                int i7 = c03303o.A02;
                int i8 = c03303o.A01;
                if (A09[0].charAt(28) != 'A') {
                    throw new RuntimeException();
                }
                A09[1] = "6Qpi3zwbHCTXm3nhA4JhLro11ECL3LU";
                interfaceC03293n3.A9U(i7, i8, c03303o.A03);
            } else if (i2 == 8) {
                this.A02.AAX(c03303o);
                InterfaceC03293n interfaceC03293n4 = this.A02;
                int i9 = c03303o.A02;
                int i10 = c03303o.A01;
                interfaceC03293n4.A9p(i9, i10);
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        A0B(this.A05);
        this.A00 = 0;
    }

    public final void A0H() {
        this.A03.A05(this.A05);
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            C03303o c03303o = this.A05.get(i);
            int i2 = c03303o.A00;
            String[] strArr = A09;
            String str = strArr[6];
            String str2 = strArr[5];
            int i3 = str.charAt(31);
            if (i3 != str2.charAt(31)) {
                throw new RuntimeException();
            }
            A09[1] = "1BDdKJQJlsgxETOK14Gjs1hC7fjbuKK";
            if (i2 == 1) {
                A04(c03303o);
            } else if (i2 == 2) {
                A06(c03303o);
            } else if (i2 == 4) {
                A07(c03303o);
            } else if (i2 == 8) {
                A05(c03303o);
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.A05.clear();
    }

    public final void A0I() {
        A0B(this.A05);
        A0B(this.A06);
        this.A00 = 0;
    }

    public final boolean A0J() {
        return this.A05.size() > 0;
    }

    public final boolean A0K() {
        return (this.A06.isEmpty() || this.A05.isEmpty()) ? false : true;
    }

    public final boolean A0L(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final C03303o A9n(int i, int i2, int i3, Object obj) {
        C03303o c03303oA2O = this.A01.A2O();
        if (c03303oA2O == null) {
            return new C03303o(i, i2, i3, obj);
        }
        c03303oA2O.A00 = i;
        c03303oA2O.A02 = i2;
        c03303oA2O.A01 = i3;
        c03303oA2O.A03 = obj;
        return c03303oA2O;
    }

    @Override // com.facebook.ads.redexgen.X.C4B
    public final void ADh(C03303o c03303o) {
        if (!this.A07) {
            c03303o.A03 = null;
            this.A01.ADp(c03303o);
        }
    }
}
