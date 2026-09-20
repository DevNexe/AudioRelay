package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.44, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass44 implements Runnable {
    public static Comparator<AnonymousClass43> A04;
    public static byte[] A05;
    public static String[] A06 = {"C", "g", "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    public static final ThreadLocal<AnonymousClass44> A07;
    public long A00;
    public long A01;
    public ArrayList<F9> A02 = new ArrayList<>();
    public ArrayList<AnonymousClass43> A03 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 8);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, 42, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<AnonymousClass43>() { // from class: com.facebook.ads.redexgen.X.42
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final int compare(AnonymousClass43 anonymousClass43, AnonymousClass43 anonymousClass44) {
                if ((anonymousClass43.A03 == null) != (anonymousClass44.A03 == null)) {
                    return anonymousClass43.A03 == null ? 1 : -1;
                }
                if (anonymousClass43.A04 != anonymousClass44.A04) {
                    return anonymousClass43.A04 ? -1 : 1;
                }
                int i = anonymousClass44.A02 - anonymousClass43.A02;
                if (i != 0) {
                    return i;
                }
                int i2 = anonymousClass43.A00 - anonymousClass44.A00;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            }
        };
    }

    private AbstractC03524l A00(F9 f9, int i, long j) {
        if (A08(f9, i)) {
            return null;
        }
        C03424b c03424b = f9.A0r;
        try {
            f9.A1L();
            AbstractC03524l abstractC03524lA0I = c03424b.A0I(i, false, j);
            if (abstractC03524lA0I != null) {
                if (abstractC03524lA0I.A0a() && !abstractC03524lA0I.A0b()) {
                    c03424b.A0X(abstractC03524lA0I.A0H);
                } else {
                    c03424b.A0d(abstractC03524lA0I, false);
                }
            }
            return abstractC03524lA0I;
        } finally {
            f9.A1q(false);
        }
    }

    private void A02() {
        AnonymousClass43 task;
        int i = this.A02.size();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            F9 f9 = this.A02.get(i3);
            int totalTaskCount = f9.getWindowVisibility();
            if (totalTaskCount == 0) {
                f9.A02.A04(f9, false);
                int totalTaskCount2 = f9.A02.A00;
                i2 += totalTaskCount2;
            }
        }
        this.A03.ensureCapacity(i2);
        int i4 = 0;
        String[] strArr = A06;
        String str = strArr[3];
        String str2 = strArr[7];
        int length = str.length();
        int totalTaskCount3 = str2.length();
        if (length != totalTaskCount3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[3] = "OH";
        strArr2[7] = "7S";
        for (int i5 = 0; i5 < i; i5++) {
            F9 f10 = this.A02.get(i5);
            int totalTaskCount4 = f10.getWindowVisibility();
            if (totalTaskCount4 == 0) {
                C1264cC c1264cC = f10.A02;
                int iAbs = Math.abs(c1264cC.A01) + Math.abs(c1264cC.A02);
                for (int i6 = 0; i6 < c1264cC.A00 * 2; i6 += 2) {
                    if (i4 >= this.A03.size()) {
                        task = new AnonymousClass43();
                        this.A03.add(task);
                    } else {
                        task = this.A03.get(i4);
                    }
                    int j = i6 + 1;
                    int i7 = c1264cC.A03[j];
                    task.A04 = i7 <= iAbs;
                    task.A02 = iAbs;
                    task.A00 = i7;
                    task.A03 = f10;
                    int j2 = c1264cC.A03[i6];
                    task.A01 = j2;
                    i4++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    private void A04(long j) {
        for (int i = 0; i < this.A03.size(); i++) {
            AnonymousClass43 anonymousClass43 = this.A03.get(i);
            if (anonymousClass43.A03 == null) {
                return;
            }
            A06(anonymousClass43, j);
            anonymousClass43.A00();
        }
    }

    private final void A05(long j) {
        A02();
        A04(j);
    }

    private void A06(AnonymousClass43 anonymousClass43, long j) {
        AbstractC03524l abstractC03524lA00 = A00(anonymousClass43.A03, anonymousClass43.A01, anonymousClass43.A04 ? Long.MAX_VALUE : j);
        if (abstractC03524lA00 != null && abstractC03524lA00.A09 != null && abstractC03524lA00.A0a() && !abstractC03524lA00.A0b()) {
            A07(abstractC03524lA00.A09.get(), j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064 A[Catch: all -> 0x006e, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x006e, blocks: (B:13:0x0030, B:14:0x0043, B:19:0x0064), top: B:27:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0030 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0077 A[EDGE_INSN: B:29:0x0077->B:25:0x0077 BREAK  A[LOOP:0: B:14:0x0043->B:31:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    private void A07(@Nullable F9 f9, long j) {
        C1264cC c1264cC;
        int i;
        int i2;
        if (f9 == null) {
            return;
        }
        if (f9.A0C) {
            C03333r c03333r = f9.A01;
            if (A06[5].length() != 17) {
                A06[6] = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW";
                if (c03333r.A06() != 0) {
                    f9.A1O();
                }
                c1264cC = f9.A02;
                c1264cC.A04(f9, true);
                if (c1264cC.A00 != 0) {
                    try {
                        C2V.A01(A01(0, 18, 7));
                        f9.A0s.A05(f9.A04);
                        i = 0;
                        while (true) {
                            i2 = c1264cC.A00 * 2;
                            if (A06[6].charAt(8) != 'I') {
                                break;
                            }
                            String[] strArr = A06;
                            strArr[3] = "nG";
                            strArr[7] = "TD";
                            if (i < i2) {
                                A00(f9, c1264cC.A03[i], j);
                                i += 2;
                            } else {
                                C2V.A00();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        C2V.A00();
                        throw th;
                    }
                } else {
                    return;
                }
            }
        } else {
            c1264cC = f9.A02;
            c1264cC.A04(f9, true);
            if (c1264cC.A00 != 0) {
                C2V.A01(A01(0, 18, 7));
                f9.A0s.A05(f9.A04);
                i = 0;
                while (true) {
                    i2 = c1264cC.A00 * 2;
                    if (A06[6].charAt(8) != 'I') {
                        break;
                        break;
                    }
                    String[] strArr2 = A06;
                    strArr2[3] = "nG";
                    strArr2[7] = "TD";
                    if (i < i2) {
                        A00(f9, c1264cC.A03[i], j);
                        i += 2;
                    } else {
                        C2V.A00();
                        return;
                    }
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public static boolean A08(F9 f9, int i) {
        int iA06 = f9.A01.A06();
        for (int i2 = 0; i2 < iA06; i2++) {
            View attachedView = f9.A01.A0A(i2);
            AbstractC03524l abstractC03524lA0G = F9.A0G(attachedView);
            if (abstractC03524lA0G.A03 == i && !abstractC03524lA0G.A0b()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(F9 f9) {
        this.A02.add(f9);
    }

    public final void A0A(F9 f9) {
        this.A02.remove(f9);
    }

    public final void A0B(F9 f9, int i, int i2) {
        if (f9.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = f9.getNanoTime();
            f9.post(this);
        }
        f9.A02.A03(i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C2V.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                this.A01 = 0L;
                C2V.A00();
                return;
            }
            int size = this.A02.size();
            long jMax = 0;
            for (int i = 0; i < size; i++) {
                F9 f9 = this.A02.get(i);
                int i2 = f9.getWindowVisibility();
                if (i2 == 0) {
                    jMax = Math.max(f9.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "H4nD1dOrFb1";
                C2V.A00();
                return;
            }
            long latestFrameVsyncMs = TimeUnit.MILLISECONDS.toNanos(jMax);
            A05(latestFrameVsyncMs + this.A00);
            this.A01 = 0L;
            C2V.A00();
        } catch (Throwable th) {
            this.A01 = 0L;
            C2V.A00();
            throw th;
        }
    }
}
