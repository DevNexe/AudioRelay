package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C03424b {
    public static byte[] A09;
    public static String[] A0A = {"ulA9tMpXJ0Fgz3L6", "kmBp6JcSqPlb9eogqvbvj6g5ppHVaWSS", "klPqAM4BpBJNr6xIOjiQhoS6UO4TrOHS", "7VyM9GgXJuu8YzSYQI3HrMroeBYRJajD", "jF2bnw6E6wYHKm8plX11kYiLrSAbSJmD", "6pBnRch9VxXRPJwtqH0gd323b09mKXXU", "Clk2oRExhn8z5HC1wWkAqM8aEwWEfAA8", "Myq33IQdIYqIzBMhSJhfspyke76FBM0c"};
    public C4a A01;
    public AbstractC03504j A04;
    public final /* synthetic */ F9 A08;
    public final ArrayList<AbstractC03524l> A05 = new ArrayList<>();
    public ArrayList<AbstractC03524l> A02 = null;
    public final ArrayList<AbstractC03524l> A06 = new ArrayList<>();
    public final List<AbstractC03524l> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 58);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{-91, -18, -8, -58, -7, -7, -26, -24, -19, -22, -23, -65, -59, -32, 39, 30, 30, 43, 29, 44, -14, -53, -48, -62, -21, 22, 7, 15, -62, 5, 17, 23, 16, 22, -36, -38, -33, 36, 37, 18, 37, 22, -21, -99, -69, -58, -58, -65, -66, 122, -51, -67, -52, -69, -54, 122, -48, -61, -65, -47, 122, -47, -61, -50, -62, 122, -69, -56, 122, -61, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -120, 122, -93, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -51, 122, -67, -69, -56, -56, -55, -50, 122, -68, -65, 122, -52, -65, -49, -51, -65, -66, 122, -64, -52, -55, -57, 122, -51, -67, -52, -69, -54, -122, 122, -50, -62, -65, -45, 122, -51, -62, -55, -49, -58, -66, 122, -52, -65, -68, -55, -49, -56, -66, 122, -64, -52, -55, -57, 122, -52, -65, -67, -45, -67, -58, -65, -52, 122, -54, -55, -55, -58, -120, -7, 30, 19, 31, 30, 35, 25, 35, 36, 21, 30, 19, 41, -48, 20, 21, 36, 21, 19, 36, 21, 20, -34, -48, -7, 30, 38, 17, 28, 25, 20, -48, 25, 36, 21, 29, -48, 32, 31, 35, 25, 36, 25, 31, 30, -48, -13, 24, 13, 25, 24, 29, 19, 29, 30, 15, 24, 13, 35, -54, 14, 15, 30, 15, 13, 30, 15, 14, -40, -54, -13, 24, 32, 11, 22, 19, 14, -54, 32, 19, 15, 33, -54, 18, 25, 22, 14, 15, 28, -54, 11, 14, 11, 26, 30, 15, 28, -54, 26, 25, 29, 19, 30, 19, 25, 24, -125, -88, -80, -101, -90, -93, -98, 90, -93, -82, -97, -89, 90, -86, -87, -83, -93, -82, -93, -87, -88, 90, -63, -47, -32, -49, -34, -34, -45, -46, -114, -35, -32, -114, -49, -30, -30, -49, -47, -42, -45, -46, -114, -28, -41, -45, -27, -31, -114, -37, -49, -25, -114, -36, -35, -30, -114, -48, -45, -114, -32, -45, -47, -25, -47, -38, -45, -46, -100, -114, -41, -31, -63, -47, -32, -49, -34, -88, -35, -10, -7, -87, -19, -18, -3, -22, -20, -15, -18, -19, -87, -1, -14, -18, 0, -87, -4, -15, -8, -2, -11, -19, -87, -21, -18, -87, -5, -18, -10, -8, -1, -18, -19, -87, -17, -5, -8, -10, -87, -37, -18, -20, 2, -20, -11, -18, -5, -33, -14, -18, 0, -87, -21, -18, -17, -8, -5, -18, -87, -14, -3, -87, -20, -22, -9, -87, -21, -18, -87, -5, -18, -20, 2, -20, -11, -18, -19, -61, -87, -102, -72, -65, -81, -76, -83, 102, -70, -75, 102, -72, -85, -87, -65, -87, -78, -85, 102, -89, -76, 102, -81, -83, -76, -75, -72, -85, -86, 102, -68, -81, -85, -67, 102, -82, -75, -78, -86, -85, -72, 116, 102, -97, -75, -69, 102, -71, -82, -75, -69, -78, -86, 102, -84, -81, -72, -71, -70, 102, -87, -89, -78, -78, 102, -71, -70, -75, -74, -113, -83, -76, -75, -72, -81, -76, -83, -100, -81, -85, -67, 110, -68, -81, -85, -67, 111, 102, -88, -85, -84, -75, -72, -85, 102, -87, -89, -78, -78, -81, -76, -83, 102, -72, -85, -87, -65, -87, -78, -85, 116, -19, -21, -6, -36, -17, -21, -3, -52, -11, -8, -42, -11, -7, -17, -6, -17, -11, -12, -57, -12, -22, -38, -1, -10, -21, -90, -8, -21, -6, -5, -8, -12, -21, -22, -90, -25, -90, -4, -17, -21, -3, -90, -6, -18, -25, -6, -90, -17, -7, -90, -17, -19, -12, -11, -8, -21, -22, -76, -90, -33, -11, -5, -90, -13, -5, -7, -6, -90, -23, -25, -14, -14, -90, -7, -6, -11, -10, -49, -19, -12, -11, -8, -17, -12, -19, -90, -24, -21, -20, -11, -8, -21, -90, -8, -21, -6, -5, -8, -12, -17, -12, -19, -90, -6, -18, -17, -7, -90, -4, -17, -21, -3, -76, -78, -80, -65, -95, -76, -80, -62, -111, -70, -67, -101, -70, -66, -76, -65, -76, -70, -71, -116, -71, -81, -97, -60, -69, -80, 107, -67, -80, -65, -64, -67, -71, -80, -81, 107, -84, 107, -63, -76, -80, -62, 107, -62, -77, -76, -82, -77, 107, -81, -70, -80, -66, 107, -71, -70, -65, 107, -77, -84, -63, -80, 107, -84, 107, -95, -76, -80, -62, -109, -70, -73, -81, -80, -67, -63, -74, -50, -60, -54, -55, 117, -66, -61, -71, -70, -51, 117, -56, -67, -60, -54, -63, -71, 117, -61, -60, -55, 117, -73, -70, 117, -126, -122, 117, -74, -69, -55, -70, -57, 117, -54, -61, -67, -66, -71, -66, -61, -68, 117, -74, 117, -53, -66, -70, -52, -113, -25, -26, -50, -31, -35, -17, -54, -35, -37, -15, -37, -28, -35, -36};
    }

    static {
        A05();
    }

    public C03424b(F9 f9) {
        this.A08 = f9;
    }

    private final View A00(int i, boolean z) {
        return A0I(i, z, Long.MAX_VALUE).A0H;
    }

    private final AbstractC03524l A01(int i) {
        int size;
        int iA0D;
        ArrayList<AbstractC03524l> arrayList = this.A02;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC03524l abstractC03524l = this.A02.get(i2);
            if (!abstractC03524l.A0i() && abstractC03524l.A0I() == i) {
                abstractC03524l.A0T(32);
                return abstractC03524l;
            }
        }
        if (this.A08.A04.A0B() && (iA0D = this.A08.A00.A0D(i)) > 0 && iA0D < this.A08.A04.A0D()) {
            long jA04 = this.A08.A04.A04(iA0D);
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC03524l abstractC03524l2 = this.A02.get(i3);
                if (!abstractC03524l2.A0i() && abstractC03524l2.A0K() == jA04) {
                    abstractC03524l2.A0T(32);
                    return abstractC03524l2;
                }
            }
        }
        return null;
    }

    private final AbstractC03524l A02(int cacheSize, boolean z) {
        View viewA08;
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            AbstractC03524l abstractC03524l = this.A05.get(i);
            if (!abstractC03524l.A0i() && abstractC03524l.A0I() == cacheSize && !abstractC03524l.A0b() && (this.A08.A0s.A09 || !abstractC03524l.A0c())) {
                abstractC03524l.A0T(32);
                return abstractC03524l;
            }
        }
        if (!z && (viewA08 = this.A08.A01.A08(cacheSize)) != null) {
            AbstractC03524l abstractC03524lA0G = F9.A0G(viewA08);
            this.A08.A01.A0G(viewA08);
            int iA07 = this.A08.A01.A07(viewA08);
            if (iA07 != -1) {
                this.A08.A01.A0C(iA07);
                A0W(viewA08);
                abstractC03524lA0G.A0T(8224);
                return abstractC03524lA0G;
            }
            throw new IllegalStateException(A04(727, 52, 27) + abstractC03524lA0G + this.A08.A1I());
        }
        int size2 = this.A06.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractC03524l abstractC03524l2 = this.A06.get(i2);
            if (!abstractC03524l2.A0b() && abstractC03524l2.A0I() == cacheSize) {
                if (!z) {
                    this.A06.remove(i2);
                }
                return abstractC03524l2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:31:0x00af  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:49:0x0130  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec A[SYNTHETIC] */
    private final AbstractC03524l A03(long j, int i, boolean z) {
        ArrayList<AbstractC03524l> arrayList;
        String[] strArr;
        String[] strArr2;
        for (int size = this.A05.size() - 1; size >= 0; size--) {
            AbstractC03524l abstractC03524l = this.A05.get(size);
            if (abstractC03524l.A0K() == j && !abstractC03524l.A0i()) {
                if (i == abstractC03524l.A0H()) {
                    abstractC03524l.A0T(32);
                    if (abstractC03524l.A0c()) {
                        F9 f9 = this.A08;
                        if (A0A[4].charAt(3) == 'b') {
                            A0A[0] = "q3aWXTgT7NsVf007";
                            if (!f9.A0s.A07()) {
                                String[] strArr3 = A0A;
                                if (strArr3[2].charAt(0) != strArr3[1].charAt(0)) {
                                    A0A[4] = "NC6bFXUosLdTEwJsXrsHGkbXBsQUMG7q";
                                    abstractC03524l.A0U(2, 14);
                                } else {
                                    String[] strArr4 = A0A;
                                    strArr4[2] = "kBSMDIkt47Rx4hHhTamY1xnSrMWRxYxp";
                                    strArr4[1] = "kToZLwND7zKVFlbtf8XZb6UwHA5zPLAu";
                                    abstractC03524l.A0U(2, 14);
                                }
                            }
                        }
                        throw new RuntimeException();
                    }
                    return abstractC03524l;
                }
                if (!z) {
                    this.A05.remove(size);
                    this.A08.removeDetachedView(abstractC03524l.A0H, false);
                    A0V(abstractC03524l.A0H);
                }
            }
        }
        for (int size2 = this.A06.size() - 1; size2 >= 0; size2--) {
            AbstractC03524l abstractC03524l2 = this.A06.get(size2);
            if (abstractC03524l2.A0K() == j) {
                int iA0H = abstractC03524l2.A0H();
                if (A0A[0].length() != 16) {
                    String[] strArr5 = A0A;
                    strArr5[7] = "lrD7iCy3KBiO8gA6PsFToJiVZrW1xMAl";
                    strArr5[6] = "amz9CZtibeJcU8bEqG7a4ZYgRNeZgxWk";
                    if (i == iA0H) {
                        if (!z) {
                            arrayList = this.A06;
                            strArr = A0A;
                            if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                                String[] strArr6 = A0A;
                                strArr6[5] = "or4YmCu0ppqzW1VFAnuQtpcwvOCNSyKL";
                                strArr6[3] = "x7G8xrEgau2heO3LEdjWfX9qC3RDyC0d";
                                arrayList.remove(size2);
                            } else {
                                arrayList.remove(size2);
                            }
                        }
                        return abstractC03524l2;
                    }
                    if (!z) {
                        A07(size2);
                        strArr2 = A0A;
                        if (strArr2[2].charAt(0) == strArr2[1].charAt(0)) {
                            A0A[4] = "2lrbY7WLbUziAPe6QkcwvBQ2VEr9QFta";
                            return null;
                        }
                        throw new RuntimeException();
                    }
                } else {
                    String[] strArr7 = A0A;
                    strArr7[2] = "kYzWBiiTSiU3KogqfJ4EJctPAodLTQqF";
                    strArr7[1] = "kIBKgO4naDZyukeXVXxcwMENrZxoY36q";
                    if (i == iA0H) {
                        if (!z) {
                            arrayList = this.A06;
                            strArr = A0A;
                            if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                                String[] strArr8 = A0A;
                                strArr8[5] = "or4YmCu0ppqzW1VFAnuQtpcwvOCNSyKL";
                                strArr8[3] = "x7G8xrEgau2heO3LEdjWfX9qC3RDyC0d";
                                arrayList.remove(size2);
                            } else {
                                arrayList.remove(size2);
                            }
                        }
                        return abstractC03524l2;
                    }
                    if (!z) {
                        A07(size2);
                        strArr2 = A0A;
                        if (strArr2[2].charAt(0) == strArr2[1].charAt(0)) {
                            A0A[4] = "2lrbY7WLbUziAPe6QkcwvBQ2VEr9QFta";
                            return null;
                        }
                        throw new RuntimeException();
                    }
                }
            }
        }
        return null;
    }

    private final void A06() {
        for (int i = this.A06.size() - 1; i >= 0; i--) {
            A07(i);
        }
        this.A06.clear();
        if (F9.A1E) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i) {
        A0d(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A08(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                String[] strArr = A0A;
                if (strArr[7].charAt(8) == strArr[6].charAt(8)) {
                    throw new RuntimeException();
                }
                A0A[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A09(AbstractC03524l abstractC03524l) {
        if (this.A08.A1s()) {
            View view = abstractC03524l.A0H;
            if (AnonymousClass38.A00(view) == 0) {
                AnonymousClass38.A09(view, 1);
            }
            if (!AnonymousClass38.A0F(view)) {
                abstractC03524l.A0T(16384);
                AnonymousClass38.A0B(view, this.A08.A09.A0A());
            }
        }
    }

    private void A0A(AbstractC03524l abstractC03524l) {
        if (abstractC03524l.A0H instanceof ViewGroup) {
            A08((ViewGroup) abstractC03524l.A0H, false);
        }
    }

    private final void A0B(AbstractC03524l abstractC03524l) {
        if (this.A08.A07 != null) {
            throw new NullPointerException(A04(779, 14, 62));
        }
        C4H c4h = this.A08.A04;
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(abstractC03524l);
        }
    }

    private final boolean A0C(AbstractC03524l abstractC03524l) {
        if (abstractC03524l.A0c()) {
            return this.A08.A0s.A07();
        }
        if (abstractC03524l.A03 >= 0 && abstractC03524l.A03 < this.A08.A04.A0D()) {
            if (this.A08.A0s.A07() || this.A08.A04.A03(abstractC03524l.A03) == abstractC03524l.A0H()) {
                return !this.A08.A04.A0B() || abstractC03524l.A0K() == this.A08.A04.A04(abstractC03524l.A03);
            }
            return false;
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 112) + abstractC03524l + this.A08.A1I());
    }

    private boolean A0D(AbstractC03524l abstractC03524l, int i, int i2, long j) {
        abstractC03524l.A08 = this.A08;
        int iA0H = abstractC03524l.A0H();
        long nanoTime = this.A08.getNanoTime();
        if (j != Long.MAX_VALUE) {
            C4a c4a = this.A01;
            String[] strArr = A0A;
            if (strArr[5].charAt(0) == strArr[3].charAt(0)) {
                throw new RuntimeException();
            }
            A0A[0] = "We3abAYlnqMpJzTP";
            if (!c4a.A0A(iA0H, nanoTime, j)) {
                return false;
            }
        }
        this.A08.A04.A0A(abstractC03524l, i);
        this.A01.A05(abstractC03524l.A0H(), this.A08.getNanoTime() - nanoTime);
        A09(abstractC03524l);
        if (this.A08.A0s.A07()) {
            abstractC03524l.A04 = i2;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i) {
        return this.A05.get(i).A0H;
    }

    public final View A0G(int i) {
        return A00(i, false);
    }

    public final C4a A0H() {
        if (this.A01 == null) {
            this.A01 = new C4a();
        }
        return this.A01;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025b  */
    /* JADX WARN: Code duplicated, block: B:102:0x025d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0265  */
    /* JADX WARN: Code duplicated, block: B:105:0x0273  */
    /* JADX WARN: Code duplicated, block: B:109:0x0286  */
    /* JADX WARN: Code duplicated, block: B:110:0x0290  */
    /* JADX WARN: Code duplicated, block: B:112:0x0296  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:87:0x020f  */
    /* JADX WARN: Code duplicated, block: B:90:0x0235  */
    /* JADX WARN: Code duplicated, block: B:92:0x023b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0245  */
    @Nullable
    public final AbstractC03524l A0I(int i, boolean z, long j) {
        boolean zA0D;
        boolean bound;
        ViewGroup.LayoutParams layoutParams;
        C4U c4u;
        boolean bound2;
        F9 f9A0I;
        AbstractC03504j abstractC03504j;
        View viewA00;
        if (i >= 0 && i < this.A08.A0s.A03()) {
            boolean fromScrapOrHiddenOrCache = false;
            AbstractC03524l holder = null;
            if (this.A08.A0s.A07()) {
                holder = A01(i);
                fromScrapOrHiddenOrCache = holder != null;
            }
            if (holder == null && (holder = A02(i, z)) != null) {
                if (!A0C(holder)) {
                    if (!z) {
                        holder.A0T(4);
                        if (holder.A0d()) {
                            this.A08.removeDetachedView(holder.A0H, false);
                            holder.A0S();
                        } else if (holder.A0i()) {
                            holder.A0O();
                        }
                        A0b(holder);
                    }
                    holder = null;
                } else {
                    fromScrapOrHiddenOrCache = true;
                }
            }
            if (holder == null) {
                int iA0D = this.A08.A00.A0D(i);
                if (iA0D >= 0 && iA0D < this.A08.A04.A0D()) {
                    int iA03 = this.A08.A04.A03(iA0D);
                    if (this.A08.A04.A0B() && (holder = A03(this.A08.A04.A04(iA0D), iA03, z)) != null) {
                        holder.A03 = iA0D;
                        fromScrapOrHiddenOrCache = true;
                    }
                    if (holder == null && (abstractC03504j = this.A04) != null && (viewA00 = abstractC03504j.A00(this, i, iA03)) != null) {
                        holder = this.A08.A1H(viewA00);
                        if (holder != null) {
                            if (holder.A0h()) {
                                throw new IllegalArgumentException(A04(540, 113, 76) + this.A08.A1I());
                            }
                        } else {
                            throw new IllegalArgumentException(A04(653, 74, 17) + this.A08.A1I());
                        }
                    }
                    if (holder == null) {
                        C4a c4aA0H = A0H();
                        String[] strArr = A0A;
                        if (strArr[5].charAt(0) != strArr[3].charAt(0)) {
                            A0A[4] = "3K2bfdY4Lns5cH4Uqi6qZhk44zURNmgZ";
                            holder = c4aA0H.A03(iA03);
                            if (holder != null) {
                                holder.A0Q();
                                if (F9.A1C) {
                                    A0A(holder);
                                }
                            }
                        }
                    }
                    if (holder == null) {
                        long nanoTime = this.A08.getNanoTime();
                        if (j == Long.MAX_VALUE || this.A01.A0B(iA03, nanoTime, j)) {
                            holder = this.A08.A04.A05(this.A08, iA03);
                            if (F9.A1E && (f9A0I = F9.A0I(holder.A0H)) != null) {
                                holder.A09 = new WeakReference<>(f9A0I);
                            }
                            this.A01.A06(iA03, this.A08.getNanoTime() - nanoTime);
                        } else {
                            return null;
                        }
                    } else {
                        String[] strArr2 = A0A;
                        if (strArr2[5].charAt(0) == strArr2[3].charAt(0)) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A0A;
                        strArr3[5] = "ofPrqBOY4KV1O5mmTOXtQojU6rRVoJMb";
                        strArr3[3] = "dfUBDtyf096LhSCdUEMmmzbvfUZbBbNe";
                    }
                    if (fromScrapOrHiddenOrCache) {
                        holder.A0U(0, 8192);
                        if (this.A08.A0s.A0C) {
                            this.A08.A1m(holder, this.A08.A05.A09(this.A08.A0s, holder, C4P.A00(holder) | 4096, holder.A0L()));
                        }
                    }
                    zA0D = false;
                    bound = this.A08.A0s.A07();
                    if (bound) {
                        bound2 = holder.A0a();
                        if (bound2) {
                            holder.A04 = i;
                        } else if (holder.A0a()) {
                            zA0D = A0D(holder, this.A08.A00.A0D(i), i, j);
                        } else {
                            zA0D = A0D(holder, this.A08.A00.A0D(i), i, j);
                        }
                    } else if (holder.A0a()) {
                        zA0D = A0D(holder, this.A08.A00.A0D(i), i, j);
                    } else {
                        zA0D = A0D(holder, this.A08.A00.A0D(i), i, j);
                    }
                    layoutParams = holder.A0H.getLayoutParams();
                    if (layoutParams == null) {
                        c4u = (C4U) this.A08.generateDefaultLayoutParams();
                        holder.A0H.setLayoutParams(c4u);
                    } else if (!this.A08.checkLayoutParams(layoutParams)) {
                        c4u = (C4U) this.A08.generateLayoutParams(layoutParams);
                        holder.A0H.setLayoutParams(c4u);
                    } else if (A0A[0].length() == 16) {
                        A0A[4] = "WeHbAL2DpvJL4iRMn0O7hIhaGbvumhB7";
                        c4u = (C4U) layoutParams;
                    }
                    c4u.A00 = holder;
                    c4u.A02 = !fromScrapOrHiddenOrCache && zA0D;
                    return holder;
                }
                throw new IndexOutOfBoundsException(A04(165, 46, 118) + i + A04(13, 8, 126) + iA0D + A04(35, 8, 119) + this.A08.A0s.A03() + this.A08.A1I());
            }
            if (fromScrapOrHiddenOrCache && !this.A08.A0s.A07() && holder.A0k(8192)) {
                holder.A0U(0, 8192);
                if (this.A08.A0s.A0C) {
                    this.A08.A1m(holder, this.A08.A05.A09(this.A08.A0s, holder, C4P.A00(holder) | 4096, holder.A0L()));
                }
            }
            zA0D = false;
            bound = this.A08.A0s.A07();
            if (bound) {
                bound2 = holder.A0a();
                if (bound2) {
                    holder.A04 = i;
                } else if (holder.A0a() || holder.A0g() || holder.A0b()) {
                    zA0D = A0D(holder, this.A08.A00.A0D(i), i, j);
                }
            } else if (holder.A0a()) {
                zA0D = A0D(holder, this.A08.A00.A0D(i), i, j);
            } else {
                zA0D = A0D(holder, this.A08.A00.A0D(i), i, j);
            }
            layoutParams = holder.A0H.getLayoutParams();
            if (layoutParams == null) {
                c4u = (C4U) this.A08.generateDefaultLayoutParams();
                holder.A0H.setLayoutParams(c4u);
            } else if (!this.A08.checkLayoutParams(layoutParams)) {
                c4u = (C4U) this.A08.generateLayoutParams(layoutParams);
                holder.A0H.setLayoutParams(c4u);
            } else if (A0A[0].length() == 16) {
                A0A[4] = "WeHbAL2DpvJL4iRMn0O7hIhaGbvumhB7";
                c4u = (C4U) layoutParams;
            }
            c4u.A00 = holder;
            c4u.A02 = !fromScrapOrHiddenOrCache && zA0D;
            return holder;
            throw new RuntimeException();
        }
        throw new IndexOutOfBoundsException(A04(271, 22, 0) + i + A04(12, 1, 99) + i + A04(21, 14, 104) + this.A08.A0s.A03() + this.A08.A1I());
    }

    public final List<AbstractC03524l> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A0M();
        }
        int i2 = this.A05.size();
        for (int i3 = 0; i3 < i2; i3++) {
            this.A05.get(i3).A0M();
        }
        ArrayList<AbstractC03524l> arrayList = this.A02;
        String[] strArr = A0A;
        String str = strArr[2];
        String str2 = strArr[1];
        int iCharAt = str.charAt(0);
        int scrapCount = str2.charAt(0);
        if (iCharAt != scrapCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[7] = "w7WcMXH384MQxArKBWq9tfOfmOANhXYh";
        strArr2[6] = "ji6HgViVTGyvfONq8Vqt8Uaju4D1iJHU";
        if (arrayList != null) {
            int changedScrapCount = arrayList.size();
            for (int i4 = 0; i4 < changedScrapCount; i4++) {
                this.A02.get(i4).A0M();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        ArrayList<AbstractC03524l> arrayList = this.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            C4U c4u = (C4U) this.A06.get(i).A0H.getLayoutParams();
            if (c4u != null) {
                c4u.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0B()) {
            int size = this.A06.size();
            for (int i = 0; i < size; i++) {
                AbstractC03524l abstractC03524l = this.A06.get(i);
                if (A0A[0].length() != 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0A;
                strArr[2] = "kx9etu5Uswf3mlSSd54JM5SDJxoMGNTv";
                strArr[1] = "kxxNK4Rys8aPJuu822sP3fs8sDM7v1G0";
                if (abstractC03524l != null) {
                    abstractC03524l.A0T(6);
                    abstractC03524l.A0Y(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i;
        if (this.A08.A06 != null) {
            C4T c4t = this.A08.A06;
            if (A0A[0].length() == 16) {
                String[] strArr = A0A;
                strArr[2] = "kSelswvDf1EbxUzrii1mBr6dHJR0d4zj";
                strArr[1] = "kcuGN1lunmBh6z5P1vsNJWvgiUTpOK0Q";
                i = c4t.A00;
            }
            throw new RuntimeException();
        }
        i = 0;
        this.A00 = this.A03 + i;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            int size2 = this.A06.size();
            String[] strArr2 = A0A;
            String str = strArr2[2];
            String str2 = strArr2[1];
            int iCharAt = str.charAt(0);
            int i2 = str2.charAt(0);
            if (iCharAt != i2) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0A;
            strArr3[2] = "kpxxdOz3cEfo3MLV8RPQuR2Jasv2n6jF";
            strArr3[1] = "kgO1H2GjmHeLX2ZusVi9gFRUJKE1zGI0";
            int i3 = this.A00;
            if (size2 > i3) {
                A07(size);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i) {
        this.A03 = i;
        A0O();
    }

    public final void A0R(int i, int i2) {
        int size = this.A06.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC03524l abstractC03524l = this.A06.get(i3);
            if (abstractC03524l != null && abstractC03524l.A03 >= i) {
                abstractC03524l.A0W(i2, true);
            }
        }
    }

    public final void A0S(int end, int inBetweenOffset) {
        int cachedCount;
        int i;
        int i2;
        if (end < inBetweenOffset) {
            cachedCount = end;
            i = inBetweenOffset;
            i2 = -1;
        } else {
            cachedCount = inBetweenOffset;
            i = end;
            i2 = 1;
        }
        int size = this.A06.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC03524l abstractC03524l = this.A06.get(i3);
            if (abstractC03524l != null && abstractC03524l.A03 >= cachedCount && abstractC03524l.A03 <= i) {
                int i4 = abstractC03524l.A03;
                String[] strArr = A0A;
                if (strArr[5].charAt(0) == strArr[3].charAt(0)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0A;
                strArr2[2] = "kvvW4F2OCwdEIl1qwIuxYVFpmp0ugJY5";
                strArr2[1] = "kzcCp2wTfEGQm2KGuN32b5oIYABnQWPG";
                if (i4 == end) {
                    abstractC03524l.A0W(inBetweenOffset - end, false);
                } else {
                    abstractC03524l.A0W(i2, false);
                }
            }
        }
    }

    public final void A0T(int cachedCount, int i) {
        int pos;
        int i2 = cachedCount + i;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            AbstractC03524l abstractC03524l = this.A06.get(size);
            if (abstractC03524l != null && (pos = abstractC03524l.A03) >= cachedCount && pos < i2) {
                abstractC03524l.A0T(2);
                A07(size);
            }
        }
    }

    public final void A0U(int cachedCount, int i, boolean z) {
        int i2 = cachedCount + i;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            AbstractC03524l abstractC03524l = this.A06.get(size);
            if (abstractC03524l != null) {
                if (abstractC03524l.A03 >= i2) {
                    abstractC03524l.A0W(-i, z);
                } else if (abstractC03524l.A03 >= cachedCount) {
                    abstractC03524l.A0T(8);
                    A07(size);
                }
            }
        }
    }

    public final void A0V(View view) {
        AbstractC03524l abstractC03524lA0G = F9.A0G(view);
        abstractC03524lA0G.A0F = null;
        abstractC03524lA0G.A0G = false;
        abstractC03524lA0G.A0O();
        A0b(abstractC03524lA0G);
    }

    public final void A0W(View view) {
        AbstractC03524l abstractC03524lA0G = F9.A0G(view);
        if (abstractC03524lA0G.A0k(12) || !abstractC03524lA0G.A0f() || this.A08.A20(abstractC03524lA0G)) {
            boolean zA0b = abstractC03524lA0G.A0b();
            if (A0A[0].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "cscHAR4ImnAFzAxZJ9yqjMNa91RcN8Vb";
            strArr[3] = "pspTzLDNU823NSI2ymIgIumCpfqVQlal";
            if (!zA0b || abstractC03524lA0G.A0c() || this.A08.A04.A0B()) {
                abstractC03524lA0G.A0X(this, false);
                this.A05.add(abstractC03524lA0G);
                return;
            } else {
                throw new IllegalArgumentException(A04(43, 122, 32) + this.A08.A1I());
            }
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        abstractC03524lA0G.A0X(this, true);
        this.A02.add(abstractC03524lA0G);
    }

    public final void A0X(View view) {
        AbstractC03524l abstractC03524lA0G = F9.A0G(view);
        if (abstractC03524lA0G.A0e()) {
            this.A08.removeDetachedView(view, false);
        }
        if (abstractC03524lA0G.A0d()) {
            abstractC03524lA0G.A0S();
        } else if (abstractC03524lA0G.A0i()) {
            abstractC03524lA0G.A0O();
        }
        A0b(abstractC03524lA0G);
    }

    public final void A0Y(C4H c4h, C4H c4h2, boolean z) {
        A0P();
        A0H().A08(c4h, c4h2, z);
    }

    public final void A0Z(C4a c4a) {
        C4a c4a2 = this.A01;
        if (c4a2 != null) {
            c4a2.A04();
        }
        this.A01 = c4a;
        if (c4a != null) {
            this.A01.A07(this.A08.getAdapter());
        }
    }

    public final void A0a(AbstractC03504j abstractC03504j) {
        this.A04 = abstractC03504j;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:41:0x00de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:51:0x010e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0123 A[LOOP:0: B:45:0x00ee->B:58:0x0123, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0126  */
    /* JADX WARN: Code duplicated, block: B:68:0x0104 A[EDGE_INSN: B:68:0x0104->B:48:0x0104 BREAK  A[LOOP:0: B:45:0x00ee->B:58:0x0123], SYNTHETIC] */
    public final void A0b(AbstractC03524l abstractC03524l) {
        int i;
        String[] strArr;
        boolean recycled;
        int cachedPos;
        int cachedViewSize;
        C1264cC c1264cC;
        int cachedViewSize2;
        int cachedPos2;
        if (abstractC03524l.A0d() || abstractC03524l.A0H.getParent() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(A04(293, 56, 52));
            sb.append(abstractC03524l.A0d());
            sb.append(A04(0, 12, 75));
            sb.append(abstractC03524l.A0H.getParent() != null);
            sb.append(this.A08.A1I());
            throw new IllegalArgumentException(sb.toString());
        }
        boolean zA0e = abstractC03524l.A0e();
        String[] strArr2 = A0A;
        if (strArr2[2].charAt(0) != strArr2[1].charAt(0)) {
            throw new RuntimeException();
        }
        A0A[4] = "QZZbfikyhDCMiV1imXgamooHNWBI4VfH";
        if (!zA0e) {
            if (abstractC03524l.A0h()) {
                throw new IllegalArgumentException(A04(430, 110, 12) + this.A08.A1I());
            }
            boolean zA09 = abstractC03524l.A09();
            boolean recycled2 = this.A08.A04 != null && zA09 && this.A08.A04.A0C(abstractC03524l);
            boolean z = false;
            boolean z2 = false;
            if (recycled2) {
                i = this.A00;
                strArr = A0A;
                if (strArr[2].charAt(0) != strArr[1].charAt(0)) {
                    A0A[4] = "JXkbPmQXP2BcwiEI3FqqjfiGok6rwhAB";
                    if (i > 0) {
                        recycled = abstractC03524l.A0k(526);
                        if (!recycled) {
                            cachedPos = this.A06.size();
                            cachedViewSize = this.A00;
                            if (cachedPos >= cachedViewSize) {
                                A07(0);
                                cachedPos--;
                            }
                            if (F9.A1E) {
                                c1264cC = this.A08.A02;
                                cachedViewSize2 = abstractC03524l.A03;
                                if (!c1264cC.A05(cachedViewSize2)) {
                                    cachedPos2 = cachedPos - 1;
                                    while (cachedPos2 >= 0) {
                                        if (!this.A08.A02.A05(this.A06.get(cachedPos2).A03)) {
                                            break;
                                            break;
                                        }
                                        cachedPos2--;
                                    }
                                    cachedPos = cachedPos2 + 1;
                                }
                            }
                            this.A06.add(cachedPos, abstractC03524l);
                            z = true;
                        }
                    }
                } else {
                    A0A[4] = "iMRb6lH7bzEtCSJD4TfZYArDATXy6kqw";
                    if (i > 0) {
                        recycled = abstractC03524l.A0k(526);
                        if (!recycled) {
                            cachedPos = this.A06.size();
                            cachedViewSize = this.A00;
                            if (cachedPos >= cachedViewSize) {
                                A07(0);
                                cachedPos--;
                            }
                            if (F9.A1E) {
                                c1264cC = this.A08.A02;
                                cachedViewSize2 = abstractC03524l.A03;
                                if (!c1264cC.A05(cachedViewSize2)) {
                                    cachedPos2 = cachedPos - 1;
                                    while (cachedPos2 >= 0) {
                                        if (!this.A08.A02.A05(this.A06.get(cachedPos2).A03)) {
                                            break;
                                            break;
                                        }
                                        cachedPos2--;
                                    }
                                    cachedPos = cachedPos2 + 1;
                                }
                            }
                            this.A06.add(cachedPos, abstractC03524l);
                            z = true;
                        }
                    }
                }
                if (!z) {
                    A0d(abstractC03524l, true);
                    z2 = true;
                }
            } else {
                boolean recycled3 = abstractC03524l.A0j();
                if (recycled3) {
                    i = this.A00;
                    strArr = A0A;
                    if (strArr[2].charAt(0) != strArr[1].charAt(0)) {
                        A0A[4] = "JXkbPmQXP2BcwiEI3FqqjfiGok6rwhAB";
                        if (i > 0) {
                            recycled = abstractC03524l.A0k(526);
                            if (!recycled) {
                                cachedPos = this.A06.size();
                                cachedViewSize = this.A00;
                                if (cachedPos >= cachedViewSize && cachedPos > 0) {
                                    A07(0);
                                    cachedPos--;
                                }
                                if (F9.A1E && cachedPos > 0) {
                                    c1264cC = this.A08.A02;
                                    cachedViewSize2 = abstractC03524l.A03;
                                    if (!c1264cC.A05(cachedViewSize2)) {
                                        cachedPos2 = cachedPos - 1;
                                        while (cachedPos2 >= 0) {
                                            if (!this.A08.A02.A05(this.A06.get(cachedPos2).A03)) {
                                                break;
                                            } else {
                                                cachedPos2--;
                                            }
                                        }
                                        cachedPos = cachedPos2 + 1;
                                    }
                                }
                                this.A06.add(cachedPos, abstractC03524l);
                                z = true;
                            }
                        }
                    } else {
                        A0A[4] = "iMRb6lH7bzEtCSJD4TfZYArDATXy6kqw";
                        if (i > 0) {
                            recycled = abstractC03524l.A0k(526);
                            if (!recycled) {
                                cachedPos = this.A06.size();
                                cachedViewSize = this.A00;
                                if (cachedPos >= cachedViewSize) {
                                    A07(0);
                                    cachedPos--;
                                }
                                if (F9.A1E) {
                                    c1264cC = this.A08.A02;
                                    cachedViewSize2 = abstractC03524l.A03;
                                    if (!c1264cC.A05(cachedViewSize2)) {
                                        cachedPos2 = cachedPos - 1;
                                        while (cachedPos2 >= 0) {
                                            if (!this.A08.A02.A05(this.A06.get(cachedPos2).A03)) {
                                                break;
                                                break;
                                            }
                                            cachedPos2--;
                                        }
                                        cachedPos = cachedPos2 + 1;
                                    }
                                }
                                this.A06.add(cachedPos, abstractC03524l);
                                z = true;
                            }
                        }
                    }
                    if (!z) {
                        A0d(abstractC03524l, true);
                        z2 = true;
                    }
                }
            }
            this.A08.A0t.A0B(abstractC03524l);
            if (!z && !z2 && zA09) {
                abstractC03524l.A08 = null;
                return;
            }
            return;
        }
        throw new IllegalArgumentException(A04(349, 81, 79) + abstractC03524l + this.A08.A1I());
    }

    public final void A0c(AbstractC03524l abstractC03524l) {
        if (abstractC03524l.A0G) {
            this.A02.remove(abstractC03524l);
        } else {
            this.A05.remove(abstractC03524l);
        }
        abstractC03524l.A0F = null;
        abstractC03524l.A0G = false;
        abstractC03524l.A0O();
    }

    public final void A0d(AbstractC03524l abstractC03524l, boolean z) {
        F9.A0t(abstractC03524l);
        if (abstractC03524l.A0k(16384)) {
            abstractC03524l.A0U(0, 16384);
            AnonymousClass38.A0B(abstractC03524l.A0H, null);
        }
        if (z) {
            A0B(abstractC03524l);
        }
        abstractC03524l.A08 = null;
        A0H().A09(abstractC03524l);
    }
}
