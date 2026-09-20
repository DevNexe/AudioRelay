package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class E1 implements Handler.Callback, VX, HS, FZ, AJ, InterfaceC0499Aq {
    public static byte[] A0V;
    public static String[] A0W = {"86glHvEVsTHsOarjgO3yrK", "TuAJpp7uzbfmMtpdLTRiZnKK78MiZtWb", "2J1ujHTPZohQZteX1j6kCS7zhajZ8mZI", "eCxkC7v7XtRVNueTNXvbthBaIEqCwNNl", "l3Yyub2xLFiYeWCCac", "TG0XkoHYQCfebcNj4J", "6SVWI1Jvh0Z3jrcRBB9hLc8AjjQAtTry", "lVbeqNrXIfO7zu9EZv7JtI"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public AV A04;
    public C0489Ag A05;
    public InterfaceC0594Fa A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public XG[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final XJ A0G;
    public final XH A0H;
    public final InterfaceC0484Ab A0J;
    public final C0507Az A0L;
    public final B0 A0M;
    public final HT A0N;
    public final HU A0O;
    public final IN A0P;
    public final IX A0Q;
    public final ArrayList<AT> A0R;
    public final boolean A0S;
    public final XG[] A0T;
    public final InterfaceC0503Au[] A0U;
    public final C0487Ae A0K = new C0487Ae();
    public C0506Ax A06 = C0506Ax.A03;
    public final AU A0I = new AU(null);

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0K() {
        A0V = new byte[]{40, 21, 2, 61, 1, 12, 20, 8, 31, 36, 0, 29, 1, 36, 3, 25, 8, 31, 3, 12, 1, 40, 21, 2, 61, 1, 12, 20, 8, 31, 36, 0, 29, 1, 36, 3, 25, 8, 31, 3, 12, 1, 87, 37, 12, 3, 9, 1, 8, 31, 25, 55, 62, 63, 34, 57, 62, 55, 112, 61, 53, 35, 35, 49, 55, 53, 35, 112, 35, 53, 62, 36, 112, 49, 54, 36, 53, 34, 112, 34, 53, 60, 53, 49, 35, 53, 126, 71, 96, 122, 107, 124, 96, 111, 98, 46, 124, 123, 96, 122, 103, 99, 107, 46, 107, 124, 124, 97, 124, 32, 50, 14, 3, 27, 0, 3, 1, 9, 66, 7, 16, 16, 13, 16, 76, 102, 90, 64, 71, 86, 80, 21, 80, 71, 71, 90, 71, 27, 74, 109, 118, 105, 57, 127, 120, 112, 117, 124, 125, 55, 119, 124, 64, 124, 126, 118, 68, 124, 97, 120};
    }

    static {
        A0K();
    }

    public E1(XG[] xgArr, HT ht, HU hu2, InterfaceC0484Ab interfaceC0484Ab, boolean z, int i, boolean z2, Handler handler, XH xh, IN in) {
        this.A0T = xgArr;
        this.A0N = ht;
        this.A0O = hu2;
        this.A0J = interfaceC0484Ab;
        this.A08 = z;
        this.A02 = i;
        this.A0B = z2;
        this.A0E = handler;
        this.A0H = xh;
        this.A0P = in;
        this.A0D = interfaceC0484Ab.A5m();
        this.A0S = interfaceC0484Ab.AED();
        this.A05 = new C0489Ag(B1.A01, -9223372036854775807L, TrackGroupArray.A04, hu2);
        this.A0U = new InterfaceC0503Au[xgArr.length];
        for (int i2 = 0; i2 < xgArr.length; i2++) {
            xgArr[i2].AEZ(i2);
            this.A0U[i2] = xgArr[i2].A5y();
        }
        this.A0G = new XJ(this, in);
        this.A0R = new ArrayList<>();
        this.A0C = new XG[0];
        this.A0M = new B0();
        this.A0L = new C0507Az();
        ht.A00(this);
        this.A0F = new HandlerThread(A06(21, 29, 15), -16);
        this.A0F.start();
        this.A0Q = in.A4J(this.A0F.getLooper(), this);
    }

    private int A00() {
        B1 b1 = this.A05.A03;
        if (b1.A0E()) {
            return 0;
        }
        return b1.A0B(b1.A05(this.A0B), this.A0M).A00;
    }

    private int A01(int i, B1 b1, B1 b2) {
        int maxIterations = i;
        int iA04 = -1;
        int iA00 = b1.A00();
        for (int i2 = 0; i2 < iA00 && iA04 == -1; i2++) {
            maxIterations = b1.A03(maxIterations, this.A0L, this.A0M, this.A02, this.A0B);
            if (maxIterations == -1) {
                break;
            }
            iA04 = b2.A04(b1.A0A(maxIterations, this.A0L, true).A03);
        }
        return iA04;
    }

    private long A02(FY fy, long j) throws AM {
        return A03(fy, j, this.A0K.A0G() != this.A0K.A0H());
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080  */
    /* JADX WARN: Code duplicated, block: B:24:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    private long A03(FY fy, long j, boolean z) throws AM {
        boolean z2;
        String[] strArr;
        A0H();
        this.A09 = false;
        A0N(2);
        C0485Ac c0485AcA0G = this.A0K.A0G();
        C0485Ac newPlayingPeriodHolder = c0485AcA0G;
        while (newPlayingPeriodHolder != null) {
            if (A0t(fy, j, newPlayingPeriodHolder)) {
                this.A0K.A0S(newPlayingPeriodHolder);
                break;
            }
            newPlayingPeriodHolder = this.A0K.A0C();
        }
        if (c0485AcA0G != newPlayingPeriodHolder || z) {
            XG[] xgArr = this.A0C;
            if (A0W[5].length() == 18) {
                A0W[4] = "MfZ5b0v7S5HL";
                for (XG xg : xgArr) {
                    if (A0W[6].charAt(23) != 'j') {
                        A0W[4] = "gre2iAEzIfwakAGQE6Y0w4gvRDGAgj";
                        A0b(xg);
                    }
                }
                this.A0C = new XG[0];
                c0485AcA0G = null;
                if (newPlayingPeriodHolder != null) {
                    A0V(c0485AcA0G);
                    z2 = newPlayingPeriodHolder.A05;
                    strArr = A0W;
                    if (strArr[1].charAt(27) != strArr[2].charAt(27)) {
                        A0W[5] = "xpv6IUpjcorvZnU437";
                        if (z2) {
                            j = newPlayingPeriodHolder.A08.AEP(j);
                            newPlayingPeriodHolder.A08.A4p(j - this.A0D, this.A0S);
                        }
                        A0P(j);
                        A09();
                    }
                } else {
                    this.A0K.A0O(true);
                    A0P(j);
                }
                this.A0Q.AER(2);
                return j;
            }
        } else {
            if (newPlayingPeriodHolder != null) {
                A0V(c0485AcA0G);
                z2 = newPlayingPeriodHolder.A05;
                strArr = A0W;
                if (strArr[1].charAt(27) != strArr[2].charAt(27)) {
                    A0W[5] = "xpv6IUpjcorvZnU437";
                    if (z2) {
                        j = newPlayingPeriodHolder.A08.AEP(j);
                        newPlayingPeriodHolder.A08.A4p(j - this.A0D, this.A0S);
                    }
                    A0P(j);
                    A09();
                }
            } else {
                this.A0K.A0O(true);
                A0P(j);
            }
            this.A0Q.AER(2);
            return j;
        }
        throw new RuntimeException();
    }

    private Pair<Integer, Long> A04(AV av, boolean z) {
        int iA01;
        B1 b1 = this.A05.A03;
        B1 b2 = av.A02;
        if (b1.A0E()) {
            return null;
        }
        if (b2.A0E()) {
            b2 = b1;
        }
        try {
            Pair<Integer, Long> pairA07 = b2.A07(this.A0M, this.A0L, av.A00, av.A01);
            if (b1 == b2) {
                return pairA07;
            }
            int iA04 = b1.A04(b2.A0A(((Integer) pairA07.first).intValue(), this.A0L, true).A03);
            if (iA04 != -1) {
                Integer numValueOf = Integer.valueOf(iA04);
                Object obj = pairA07.second;
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                A0W[4] = "NzmvKaw5D7qN";
                return Pair.create(numValueOf, (Long) obj);
            }
            if (!z || (iA01 = A01(((Integer) pairA07.first).intValue(), b2, b1)) == -1) {
                return null;
            }
            int i = b1.A09(iA01, this.A0L).A00;
            String[] strArr = A0W;
            if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
                return A05(b1, i, -9223372036854775807L);
            }
            A0W[4] = "Yw40DLhiFndXC7wfBusX4OUMnHZHVu";
            return A05(b1, i, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new C0483Aa(b1, av.A00, av.A01);
        }
    }

    private Pair<Integer, Long> A05(B1 b1, int i, long j) {
        return b1.A07(this.A0M, this.A0L, i, j);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0075  */
    /* JADX WARN: Code duplicated, block: B:56:0x0138  */
    /* JADX WARN: Code duplicated, block: B:63:0x014f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0155  */
    /* JADX WARN: Code duplicated, block: B:73:0x0174  */
    /* JADX WARN: Code duplicated, block: B:77:0x0198  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d9  */
    private void A07() throws AM, IOException {
        long jAFM = this.A0P.AFM();
        A0I();
        if (!this.A0K.A0P()) {
            A0B();
            A0R(jAFM, 10L);
            return;
        }
        C0485Ac c0485AcA0G = this.A0K.A0G();
        C0692Iw.A02(A06(150, 10, 113));
        A0J();
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        c0485AcA0G.A08.A4p(this.A05.A0A - this.A0D, this.A0S);
        boolean z = true;
        boolean renderersReadyOrEnded = true;
        for (XG xg : this.A0C) {
            xg.ADz(this.A03, jElapsedRealtime);
            boolean z2 = true;
            if (z) {
                boolean zA8R = xg.A8R();
                String[] strArr = A0W;
                if (strArr[0].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0W[5] = "7MZ43Mfosz2cVY7YLE";
                if (zA8R) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (A0W[5].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0W;
            strArr2[1] = "fzNe8vrGdkAB7w8Spfiah9EVMBtgHYCD";
            strArr2[2] = "yf8JTWMsX4Kj3fiI7V6gWL7AnmER89HT";
            boolean rendererReadyOrEnded = xg.A8c() || xg.A8R() || A0s(xg);
            if (!rendererReadyOrEnded) {
                xg.A9a();
            }
            if (!renderersReadyOrEnded || !rendererReadyOrEnded) {
                z2 = false;
            }
            renderersReadyOrEnded = z2;
        }
        if (!renderersReadyOrEnded) {
            A0B();
        }
        long playingPeriodDurationUs = c0485AcA0G.A02.A01;
        if (z && (playingPeriodDurationUs == -9223372036854775807L || playingPeriodDurationUs <= this.A05.A0A)) {
            C0486Ad c0486Ad = c0485AcA0G.A02;
            if (A0W[3].charAt(0) != 'c') {
                String[] strArr3 = A0W;
                strArr3[0] = "wV9HOTo1O64nuX5ISvKSbD";
                strArr3[7] = "bxDx4NmgY0h2jOwlZLjnQH";
                if (c0486Ad.A05) {
                    A0N(4);
                    A0H();
                } else if (this.A05.A00 != 2) {
                    if (this.A05.A00 == 3) {
                        this.A09 = this.A08;
                        if (A0W[4].length() == 29) {
                            throw new RuntimeException();
                        }
                        A0W[5] = "etImyFrMwyU7Uaqc08";
                        A0N(2);
                        A0H();
                    }
                } else if (this.A05.A00 == 3) {
                    this.A09 = this.A08;
                    if (A0W[4].length() == 29) {
                        throw new RuntimeException();
                    }
                    A0W[5] = "etImyFrMwyU7Uaqc08";
                    A0N(2);
                    A0H();
                }
            }
            throw new RuntimeException();
        }
        if (this.A05.A00 != 2 && A0u(renderersReadyOrEnded)) {
            A0N(3);
            if (this.A08) {
                A0G();
            }
        } else if (this.A05.A00 == 3 && (this.A0C.length != 0 ? !renderersReadyOrEnded : !A0q())) {
            this.A09 = this.A08;
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            A0W[5] = "etImyFrMwyU7Uaqc08";
            A0N(2);
            A0H();
        }
        C0489Ag c0489Ag = this.A05;
        String[] strArr4 = A0W;
        if (strArr4[1].charAt(27) == strArr4[2].charAt(27)) {
            throw new RuntimeException();
        }
        A0W[4] = "xlSDIVprGLpZzqi21Os";
        if (c0489Ag.A00 == 2) {
            for (XG xg2 : this.A0C) {
                xg2.A9a();
            }
        }
        boolean z3 = this.A08;
        String[] strArr5 = A0W;
        if (strArr5[0].length() != strArr5[7].length()) {
            if (z3) {
                if (this.A05.A00 != 3) {
                    A0R(jAFM, 10L);
                }
            }
            C0692Iw.A00();
        }
        String[] strArr6 = A0W;
        strArr6[0] = "A8R7VCW6d20zhsH9TJ0X19";
        strArr6[7] = "kPu9qHLeO477rnG8ZKl3CX";
        if (z3) {
            if (this.A05.A00 != 3) {
                A0R(jAFM, 10L);
            }
        }
        C0692Iw.A00();
        if (this.A05.A00 == 2) {
            A0R(jAFM, 10L);
        } else if (this.A0C.length != 0 && this.A05.A00 != 4) {
            A0R(jAFM, 1000L);
        } else {
            this.A0Q.ADw(2);
        }
        C0692Iw.A00();
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C0485Ac c0485AcA0F = this.A0K.A0F();
        long jA06 = c0485AcA0F.A06();
        if (jA06 == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        long bufferedDurationUs = jA06 - c0485AcA0F.A08(this.A03);
        boolean zAEl = this.A0J.AEl(bufferedDurationUs, this.A0G.A7E().A01);
        A0k(zAEl);
        if (zAEl) {
            long nextLoadPositionUs = this.A03;
            c0485AcA0F.A0F(nextLoadPositionUs);
        }
    }

    private void A0A() {
        int i;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            int i2 = this.A0I.A01;
            if (this.A0I.A03) {
                i = this.A0I.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        C0485Ac c0485AcA0F = this.A0K.A0F();
        C0485Ac c0485AcA0H = this.A0K.A0H();
        if (c0485AcA0F != null && !c0485AcA0F.A06) {
            if (c0485AcA0H != null) {
                C0485Ac readingPeriodHolder = c0485AcA0H.A01;
                if (readingPeriodHolder != c0485AcA0F) {
                    return;
                }
            }
            for (XG renderer : this.A0C) {
                if (!renderer.A84()) {
                    return;
                }
            }
            c0485AcA0F.A08.A9Y();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C0486Ad c0486AdA0I = this.A0K.A0I(this.A03, this.A05);
            if (c0486AdA0I == null) {
                this.A07.A9Z();
                return;
            }
            this.A0K.A0K(this.A0U, this.A0N, this.A0J.A5h(), this.A07, this.A05.A03.A0A(c0486AdA0I.A04.A02, this.A0L, true).A03, c0486AdA0I).ADG(this, c0486AdA0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.AC5();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0E() throws AM {
        if (!this.A0K.A0P()) {
            return;
        }
        float f = this.A0G.A7E().A01;
        C0485Ac c0485AcA0H = this.A0K.A0H();
        boolean z = true;
        for (C0485Ac c0485AcA0G = this.A0K.A0G(); c0485AcA0G != null; c0485AcA0G = c0485AcA0G.A01) {
            boolean selectionsChangedForReadPeriod = c0485AcA0G.A06;
            if (!selectionsChangedForReadPeriod) {
                return;
            }
            if (!c0485AcA0G.A0I(f)) {
                if (c0485AcA0G == c0485AcA0H) {
                    z = false;
                }
            } else {
                if (z) {
                    C0485Ac c0485AcA0G2 = this.A0K.A0G();
                    boolean zA0S = this.A0K.A0S(c0485AcA0G2);
                    boolean[] zArr = new boolean[this.A0T.length];
                    long jA0B = c0485AcA0G2.A0B(this.A05.A0A, zA0S, zArr);
                    A0i(c0485AcA0G2.A03, c0485AcA0G2.A04);
                    if (this.A05.A00 != 4 && jA0B != this.A05.A0A) {
                        C0489Ag c0489Ag = this.A05;
                        this.A05 = c0489Ag.A04(c0489Ag.A04, jA0B, this.A05.A01);
                        this.A0I.A04(4);
                        A0P(jA0B);
                    }
                    int i = 0;
                    int enabledRendererCount = this.A0T.length;
                    boolean[] zArr2 = new boolean[enabledRendererCount];
                    int i2 = 0;
                    while (true) {
                        XG[] xgArr = this.A0T;
                        if (i2 >= xgArr.length) {
                            this.A05 = this.A05.A05(c0485AcA0G2.A03, c0485AcA0G2.A04);
                            A0p(zArr2, i);
                            break;
                        }
                        XG xg = xgArr[i2];
                        zArr2[i2] = xg.A7W() != 0;
                        InterfaceC0615Fv interfaceC0615Fv = c0485AcA0G2.A0A[i2];
                        if (interfaceC0615Fv != null) {
                            i++;
                        }
                        if (zArr2[i2]) {
                            InterfaceC0615Fv interfaceC0615FvA7b = xg.A7b();
                            if (A0W[4].length() == 29) {
                                throw new RuntimeException();
                            }
                            A0W[4] = "CIOLNyaJNw";
                            if (interfaceC0615Fv != interfaceC0615FvA7b) {
                                A0b(xg);
                            } else if (zArr[i2]) {
                                xg.AEC(this.A03);
                            }
                        }
                        i2++;
                    }
                } else {
                    this.A0K.A0S(c0485AcA0G);
                    if (c0485AcA0G.A06) {
                        c0485AcA0G.A0A(Math.max(c0485AcA0G.A02.A03, c0485AcA0G.A08(this.A03)), false);
                        A0i(c0485AcA0G.A03, c0485AcA0G.A04);
                    }
                }
                if (this.A05.A00 != 4) {
                    A09();
                    A0J();
                    this.A0Q.AER(2);
                    return;
                }
                return;
            }
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws AM {
        this.A09 = false;
        this.A0G.A05();
        for (XG xg : this.A0C) {
            xg.start();
        }
    }

    private void A0H() throws AM {
        this.A0G.A06();
        for (XG xg : this.A0C) {
            A0c(xg);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:122:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:73:0x0145  */
    private void A0I() throws AM, IOException {
        boolean z;
        InterfaceC0615Fv interfaceC0615Fv;
        InterfaceC0615Fv sampleStream;
        int i;
        E1 e1 = this;
        InterfaceC0594Fa interfaceC0594Fa = e1.A07;
        if (interfaceC0594Fa == null) {
            return;
        }
        if (e1.A01 > 0) {
            interfaceC0594Fa.A9Z();
            return;
        }
        A0C();
        C0485Ac c0485AcA0F = e1.A0K.A0F();
        if (c0485AcA0F == null || c0485AcA0F.A0H()) {
            e1.A0k(false);
        } else if (!e1.A05.A08) {
            A09();
        }
        if (!e1.A0K.A0P()) {
            return;
        }
        C0485Ac c0485AcA0G = e1.A0K.A0G();
        C0485Ac c0485AcA0H = e1.A0K.A0H();
        boolean z2 = false;
        while (true) {
            boolean z3 = e1.A08;
            String[] strArr = A0W;
            if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
                throw new RuntimeException();
            }
            A0W[6] = "0oLwhKi5Kra6RCRQth8cI0tAgv4BlfMk";
            if (z3 && c0485AcA0G != c0485AcA0H && e1.A03 >= c0485AcA0G.A01.A00) {
                if (z2) {
                    A0A();
                }
                boolean advancedPlayingPeriod = c0485AcA0G.A02.A06;
                if (advancedPlayingPeriod) {
                    i = 0;
                } else {
                    i = 3;
                }
                C0485Ac c0485Ac = c0485AcA0G;
                c0485AcA0G = e1.A0K.A0C();
                e1.A0V(c0485Ac);
                e1.A05 = e1.A05.A04(c0485AcA0G.A02.A04, c0485AcA0G.A02.A03, c0485AcA0G.A02.A00);
                e1.A0I.A04(i);
                A0J();
                z2 = true;
            } else if (c0485AcA0H.A02.A05) {
                int i2 = 0;
                while (true) {
                    XG[] xgArr = e1.A0T;
                    if (i2 < xgArr.length) {
                        XG xg = xgArr[i2];
                        InterfaceC0615Fv interfaceC0615Fv2 = c0485AcA0H.A0A[i2];
                        if (interfaceC0615Fv2 != null) {
                            InterfaceC0615Fv sampleStream2 = xg.A7b();
                            if (sampleStream2 == interfaceC0615Fv2 && xg.A84()) {
                                xg.AEX();
                            }
                        }
                        i2++;
                    } else {
                        return;
                    }
                }
            } else {
                if (c0485AcA0H.A01 == null || !c0485AcA0H.A01.A06) {
                    return;
                }
                int i3 = 0;
                while (true) {
                    XG[] xgArr2 = e1.A0T;
                    int length = xgArr2.length;
                    int i4 = A0W[3].charAt(0);
                    if (i4 != 99) {
                        A0W[4] = "ghsgso7PHHKUfGJDBRDWa58h1rLx";
                        if (i3 >= length) {
                            break;
                        }
                        XG xg2 = xgArr2[i3];
                        interfaceC0615Fv = c0485AcA0H.A0A[i3];
                        sampleStream = xg2.A7b();
                        if (sampleStream != interfaceC0615Fv) {
                            if (interfaceC0615Fv == null && !xg2.A84()) {
                                return;
                            } else {
                                i3++;
                            }
                        } else {
                            return;
                        }
                    } else {
                        String[] strArr2 = A0W;
                        strArr2[1] = "W3Zxvi1uQeiwcOM1a3uIixoX4KFWrQEX";
                        strArr2[2] = "hMjrL9hJ9zdobOz7Vqnbeo3Jken9e002";
                        if (i3 >= length) {
                            break;
                        }
                        XG xg3 = xgArr2[i3];
                        interfaceC0615Fv = c0485AcA0H.A0A[i3];
                        sampleStream = xg3.A7b();
                        if (sampleStream != interfaceC0615Fv) {
                            return;
                        }
                        if (interfaceC0615Fv == null) {
                        }
                        i3++;
                    }
                }
                HU hu2 = c0485AcA0H.A04;
                C0485Ac c0485AcA0D = e1.A0K.A0D();
                HU hu3 = c0485AcA0D.A04;
                long jADb = c0485AcA0D.A08.ADb();
                if (A0W[4].length() != 29) {
                    A0W[6] = "vjt4oSs9hMr9NwWN4mwojUjVUYrN8cQ6";
                    if (jADb != -9223372036854775807L) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (jADb != -9223372036854775807L) {
                    z = true;
                } else {
                    z = false;
                }
                int i5 = 0;
                while (true) {
                    XG[] xgArr3 = e1.A0T;
                    int i6 = xgArr3.length;
                    if (i5 < i6) {
                        XG xg4 = xgArr3[i5];
                        boolean rendererWasEnabled = hu2.A00(i5);
                        if (rendererWasEnabled) {
                            if (z) {
                                xg4.AEX();
                            } else if (xg4.A8O()) {
                                continue;
                            } else {
                                HQ hqA00 = hu3.A01.A00(i5);
                                boolean zA00 = hu3.A00(i5);
                                boolean z4 = e1.A0U[i5].A7i() == 5;
                                C0504Av c0504Av = hu2.A03[i5];
                                C0504Av[] c0504AvArr = hu3.A03;
                                String[] strArr3 = A0W;
                                if (strArr3[1].charAt(27) == strArr3[2].charAt(27)) {
                                    throw new RuntimeException();
                                }
                                A0W[5] = "Ap10Ra2l8gLZ0YRne2";
                                C0504Av newConfig = c0504AvArr[i5];
                                if (zA00 && newConfig.equals(c0504Av) && !z4) {
                                    Format[] formatArrA0v = A0v(hqA00);
                                    InterfaceC0615Fv[] interfaceC0615FvArr = c0485AcA0D.A0A;
                                    if (A0W[3].charAt(0) == 'c') {
                                        throw new RuntimeException();
                                    }
                                    A0W[5] = "P6QWonkpaKbLAx4pgk";
                                    xg4.AE1(formatArrA0v, interfaceC0615FvArr[i5], c0485AcA0D.A07());
                                } else {
                                    xg4.AEX();
                                }
                            }
                        }
                        i5++;
                        e1 = this;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private void A0J() throws AM {
        long jA0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C0485Ac c0485AcA0G = this.A0K.A0G();
        long jADb = c0485AcA0G.A08.ADb();
        if (jADb != -9223372036854775807L) {
            A0P(jADb);
            long periodPositionUs = this.A05.A0A;
            if (jADb != periodPositionUs) {
                C0489Ag c0489Ag = this.A05;
                this.A05 = c0489Ag.A04(c0489Ag.A04, jADb, this.A05.A01);
                this.A0I.A04(4);
            }
        } else {
            this.A03 = this.A0G.A04();
            long jA08 = c0485AcA0G.A08(this.A03);
            A0Q(this.A05.A0A, jA08);
            this.A05.A0A = jA08;
        }
        C0489Ag c0489Ag2 = this.A05;
        if (this.A0C.length == 0) {
            jA0C = c0485AcA0G.A02.A01;
        } else {
            jA0C = c0485AcA0G.A0C(true);
        }
        c0489Ag2.A09 = jA0C;
    }

    private void A0L(float f) {
        for (C0485Ac c0485AcA0E = this.A0K.A0E(); c0485AcA0E != null; c0485AcA0E = c0485AcA0E.A01) {
            if (c0485AcA0E.A04 != null) {
                for (HQ trackSelection : c0485AcA0E.A04.A01.A01()) {
                    if (trackSelection != null) {
                        trackSelection.ABp(f);
                    }
                }
            }
        }
    }

    private void A0M(int i) throws AM {
        this.A02 = i;
        if (!this.A0K.A0R(i)) {
            A0j(true);
        }
    }

    private void A0N(int i) {
        if (this.A05.A00 != i) {
            this.A05 = this.A05.A02(i);
        }
    }

    private void A0O(int i, boolean z, int i2) throws AM {
        C0485Ac c0485AcA0G = this.A0K.A0G();
        XG xg = this.A0T[i];
        this.A0C[i2] = xg;
        if (xg.A7W() == 0) {
            C0504Av c0504Av = c0485AcA0G.A04.A03[i];
            Format[] formatArrA0v = A0v(c0485AcA0G.A04.A01.A00(i));
            boolean z2 = this.A08 && this.A05.A00 == 3;
            xg.A5A(c0504Av, formatArrA0v, c0485AcA0G.A0A[i], this.A03, !z && z2, c0485AcA0G.A07());
            this.A0G.A09(xg);
            if (z2) {
                xg.start();
            }
        }
    }

    private void A0P(long j) throws AM {
        if (this.A0K.A0P()) {
            C0485Ac c0485AcA0G = this.A0K.A0G();
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[0] = "3Dp2X759xi1gKy2gc8ykMJ";
            strArr[7] = "GcHSrS1OF4oxjH6XmPjhKR";
            j = c0485AcA0G.A09(j);
        }
        this.A03 = j;
        this.A0G.A07(this.A03);
        for (XG xg : this.A0C) {
            xg.AEC(this.A03);
        }
    }

    private void A0Q(long j, long j2) throws AM {
        AT at;
        if (this.A0R.isEmpty() || this.A05.A04.A01()) {
            return;
        }
        if (this.A05.A02 == j) {
            j--;
        }
        int i = this.A05.A04.A02;
        int i2 = this.A00;
        AT at2 = i2 > 0 ? this.A0R.get(i2 - 1) : null;
        while (at2 != null) {
            if (at2.A00 <= i) {
                int i3 = at2.A00;
                if (A0W[3].charAt(0) == 'c') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[0] = "ZbbXGQ7fBHqOH9bFx5EieA";
                strArr[7] = "wqQaVgv9yDX8FIaCovLxd4";
                if (i3 != i || at2.A01 <= j) {
                    break;
                }
            }
            this.A00--;
            int i4 = this.A00;
            at2 = i4 > 0 ? this.A0R.get(i4 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            at = this.A0R.get(this.A00);
        } else {
            at = null;
        }
        while (at != null && at.A02 != null && (at.A00 < i || (at.A00 == i && at.A01 <= j))) {
            this.A00++;
            if (this.A00 < this.A0R.size()) {
                at = this.A0R.get(this.A00);
            } else {
                at = null;
            }
        }
        while (at != null && at.A02 != null && at.A00 == i && at.A01 > j && at.A01 <= j2) {
            A0Z(at.A03);
            if (at.A03.A0B() || at.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            if (this.A00 < this.A0R.size()) {
                at = this.A0R.get(this.A00);
            } else {
                at = null;
            }
        }
    }

    private void A0R(long j, long j2) {
        this.A0Q.ADw(2);
        this.A0Q.AES(2, j + j2);
    }

    private void A0S(AS as) throws AM {
        Object playingPeriodUid;
        if (as.A01 != this.A07) {
            return;
        }
        B1 b1 = this.A05.A03;
        B1 b2 = as.A00;
        Object manifest = as.A02;
        this.A0K.A0N(b2);
        this.A05 = this.A05.A03(b2, manifest);
        A0F();
        int i = this.A01;
        if (i > 0) {
            this.A0I.A03(i);
            this.A01 = 0;
            AV av = this.A04;
            if (av != null) {
                Pair<Integer, Long> pairA04 = A04(av, true);
                this.A04 = null;
                if (pairA04 == null) {
                    A08();
                    return;
                }
                int iIntValue = ((Integer) pairA04.first).intValue();
                long jLongValue = ((Long) pairA04.second).longValue();
                FY fyA0L = this.A0K.A0L(iIntValue, jLongValue);
                this.A05 = this.A05.A04(fyA0L, fyA0L.A01() ? 0L : jLongValue, jLongValue);
                return;
            }
            if (this.A05.A02 != -9223372036854775807L) {
                return;
            }
            boolean zA0E = b2.A0E();
            String[] strArr = A0W;
            if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
                throw new RuntimeException();
            }
            A0W[4] = "lH2oXw2RUPBHBuRA0";
            if (zA0E) {
                A08();
                return;
            }
            Pair<Integer, Long> pairA05 = A05(b2, b2.A05(this.A0B), -9223372036854775807L);
            int iIntValue2 = ((Integer) pairA05.first).intValue();
            long jLongValue2 = ((Long) pairA05.second).longValue();
            FY fyA0L2 = this.A0K.A0L(iIntValue2, jLongValue2);
            this.A05 = this.A05.A04(fyA0L2, fyA0L2.A01() ? 0L : jLongValue2, jLongValue2);
            return;
        }
        int i2 = this.A05.A04.A02;
        long j = this.A05.A01;
        if (b1.A0E()) {
            if (!b2.A0E()) {
                FY fyA0L3 = this.A0K.A0L(i2, j);
                C0489Ag c0489Ag = this.A05;
                long startPositionUs = fyA0L3.A01() ? 0L : j;
                this.A05 = c0489Ag.A04(fyA0L3, startPositionUs, j);
                return;
            }
            return;
        }
        C0485Ac c0485AcA0E = this.A0K.A0E();
        if (c0485AcA0E == null) {
            C0507Az c0507Az = this.A0L;
            if (A0W[3].charAt(0) != 'c') {
                String[] strArr2 = A0W;
                strArr2[0] = "AIgzGczszMkheYOO0l2WDA";
                strArr2[7] = "AQm6fITMTu1q9a2hy8bL0W";
                playingPeriodUid = b1.A0A(i2, c0507Az, true).A03;
            } else {
                A0W[6] = "kxPd1uECtZJZCmNWUxsBgkB7loYAAl3C";
                playingPeriodUid = b1.A0A(i2, c0507Az, true).A03;
            }
        } else {
            playingPeriodUid = c0485AcA0E.A09;
        }
        int iA04 = b2.A04(playingPeriodUid);
        if (iA04 == -1) {
            int iA01 = A01(i2, b1, b2);
            if (iA01 == -1) {
                A08();
                return;
            }
            Pair<Integer, Long> pairA06 = A05(b2, b2.A09(iA01, this.A0L).A00, -9223372036854775807L);
            int iIntValue3 = ((Integer) pairA06.first).intValue();
            long jLongValue3 = ((Long) pairA06.second).longValue();
            FY fyA0L4 = this.A0K.A0L(iIntValue3, jLongValue3);
            b2.A0A(iIntValue3, this.A0L, true);
            if (c0485AcA0E != null) {
                Object obj = this.A0L.A03;
                c0485AcA0E.A02 = c0485AcA0E.A02.A00(-1);
                while (c0485AcA0E.A01 != null) {
                    c0485AcA0E = c0485AcA0E.A01;
                    if (c0485AcA0E.A09.equals(obj)) {
                        c0485AcA0E.A02 = this.A0K.A0J(c0485AcA0E.A02, iIntValue3);
                    } else {
                        c0485AcA0E.A02 = c0485AcA0E.A02.A00(-1);
                    }
                }
            }
            this.A05 = this.A05.A04(fyA0L4, A02(fyA0L4, fyA0L4.A01() ? 0L : jLongValue3), jLongValue3);
            return;
        }
        if (iA04 != i2) {
            C0489Ag c0489AgA01 = this.A05.A01(iA04);
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            A0W[4] = "bxSLNYRWzgoGTszax8Z4I";
            this.A05 = c0489AgA01;
        }
        FY fy = this.A05.A04;
        if (fy.A01()) {
            FY fyA0L5 = this.A0K.A0L(iA04, j);
            if (!fyA0L5.equals(fy)) {
                this.A05 = this.A05.A04(fyA0L5, A02(fyA0L5, fyA0L5.A01() ? 0L : j), j);
                return;
            }
        }
        if (!this.A0K.A0U(fy, this.A03)) {
            A0j(false);
        }
    }

    private void A0T(AV av) throws Throwable {
        long contentPositionUs;
        FY fyA0L;
        long jLongValue;
        boolean z;
        this.A0I.A03(1);
        Pair<Integer, Long> pairA04 = A04(av, true);
        try {
            try {
                if (pairA04 == null) {
                    fyA0L = new FY(A00());
                    jLongValue = -9223372036854775807L;
                    contentPositionUs = -9223372036854775807L;
                    z = true;
                } else {
                    int iIntValue = ((Integer) pairA04.first).intValue();
                    contentPositionUs = ((Long) pairA04.second).longValue();
                    fyA0L = this.A0K.A0L(iIntValue, contentPositionUs);
                    if (fyA0L.A01()) {
                        jLongValue = 0;
                        String[] strArr = A0W;
                        if (strArr[0].length() == strArr[7].length()) {
                            A0W[3] = "i2wx9svvSsraq7xK4Hb6P8jzWPWvECua";
                            z = true;
                        }
                        throw new RuntimeException();
                    }
                    jLongValue = ((Long) pairA04.second).longValue();
                    z = av.A01 == -9223372036854775807L;
                }
                if (this.A07 != null && this.A01 <= 0) {
                    try {
                        if (jLongValue != -9223372036854775807L) {
                            long jA5e = jLongValue;
                            if (fyA0L.equals(this.A05.A04)) {
                                C0485Ac c0485AcA0G = this.A0K.A0G();
                                String[] strArr2 = A0W;
                                if (strArr2[0].length() == strArr2[7].length()) {
                                    A0W[3] = "hQgZLd0P1yiuMRtM5yatEhywmfTa4Rur";
                                    if (c0485AcA0G != null && jA5e != 0) {
                                        jA5e = c0485AcA0G.A08.A5e(jA5e, this.A06);
                                    }
                                    if (AG.A01(jA5e) == AG.A01(this.A05.A0A)) {
                                        this.A05 = this.A05.A04(fyA0L, this.A05.A0A, contentPositionUs);
                                        if (z) {
                                            this.A0I.A04(2);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                throw new RuntimeException();
                            }
                            long jA02 = A02(fyA0L, jA5e);
                            z |= jLongValue != jA02;
                            jLongValue = jA02;
                        } else {
                            A0N(4);
                            A0o(false, true, false);
                        }
                    } catch (Throwable th) {
                        th = th;
                        this.A05 = this.A05.A04(fyA0L, jLongValue, contentPositionUs);
                        if (z) {
                            this.A0I.A04(2);
                        }
                        throw th;
                    }
                } else {
                    this.A04 = av;
                }
                this.A05 = this.A05.A04(fyA0L, jLongValue, contentPositionUs);
                if (z) {
                    this.A0I.A04(2);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void A0V(@Nullable C0485Ac c0485Ac) throws AM {
        C0485Ac c0485AcA0G = this.A0K.A0G();
        if (c0485AcA0G == null || c0485Ac == c0485AcA0G) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i2 = 0;
        while (true) {
            XG[] xgArr = this.A0T;
            if (i2 >= xgArr.length) {
                break;
            }
            XG xg = xgArr[i2];
            zArr[i2] = xg.A7W() != 0;
            if (c0485AcA0G.A04.A00(i2)) {
                i++;
            }
            if (zArr[i2] && (!c0485AcA0G.A04.A00(i2) || (xg.A8O() && xg.A7b() == c0485Ac.A0A[i2]))) {
                A0b(xg);
            }
            i2++;
        }
        C0489Ag c0489Ag = this.A05;
        if (A0W[6].charAt(23) == 'j') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[0] = "YeyTuc4hJN2cviDoFTSuVw";
        strArr[7] = "y3cCzPpceybwtUTWhAu8hu";
        this.A05 = c0489Ag.A05(c0485AcA0G.A03, c0485AcA0G.A04);
        A0p(zArr, i);
    }

    private void A0W(C0490Ah c0490Ah) {
        this.A0G.AEf(c0490Ah);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(C0501As c0501As) throws AM {
        if (c0501As.A0D()) {
            return;
        }
        try {
            c0501As.A04().A7z(c0501As.A00(), c0501As.A09());
        } finally {
            c0501As.A0A(true);
        }
    }

    private void A0Y(C0501As c0501As) throws AM {
        if (c0501As.A02() == -9223372036854775807L) {
            A0Z(c0501As);
            return;
        }
        if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new AT(c0501As));
            return;
        }
        AT at = new AT(c0501As);
        if (A0r(at)) {
            ArrayList<AT> arrayList = this.A0R;
            String[] strArr = A0W;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A0W[6] = "bdowkwDe22b4JBVUMCxt2Emm6YTTpUJh";
            arrayList.add(at);
            Collections.sort(this.A0R);
            return;
        }
        c0501As.A0A(false);
    }

    private void A0Z(C0501As c0501As) throws AM {
        if (c0501As.A03().getLooper() == this.A0Q.A6v()) {
            A0X(c0501As);
            if (this.A05.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AER(2);
                return;
            }
            return;
        }
        this.A0Q.A9m(15, c0501As).sendToTarget();
    }

    private void A0a(C0501As c0501As) {
        c0501As.A03().post(new AR(this, c0501As));
    }

    private void A0b(XG xg) throws AM {
        this.A0G.A08(xg);
        A0c(xg);
        xg.A4n();
    }

    private void A0c(XG xg) throws AM {
        if (xg.A7W() == 2) {
            xg.stop();
        }
    }

    private void A0d(C0506Ax c0506Ax) {
        this.A06 = c0506Ax;
    }

    private void A0e(VW vw) {
        if (!this.A0K.A0T(vw)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(VW vw) throws AM {
        if (!this.A0K.A0T(vw)) {
            return;
        }
        C0485Ac c0485AcA0F = this.A0K.A0F();
        c0485AcA0F.A0E(this.A0G.A7E().A01);
        A0i(c0485AcA0F.A03, c0485AcA0F.A04);
        if (!this.A0K.A0P()) {
            A0P(this.A0K.A0C().A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0616Fw
    /* JADX INFO: renamed from: A0g, reason: merged with bridge method [inline-methods] */
    public final void AAP(VW vw) {
        this.A0Q.A9m(10, vw).sendToTarget();
    }

    private void A0h(InterfaceC0594Fa interfaceC0594Fa, boolean z, boolean z2) {
        this.A01++;
        A0o(true, z, z2);
        this.A0J.onPrepared();
        this.A07 = interfaceC0594Fa;
        A0N(2);
        interfaceC0594Fa.ADJ(this.A0H, true, this);
        this.A0Q.AER(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, HU hu2) {
        this.A0J.ACZ(this.A0T, trackGroupArray, hu2.A01);
    }

    private void A0j(boolean z) throws AM {
        FY fy = this.A0K.A0G().A02.A04;
        long jA03 = A03(fy, this.A05.A0A, true);
        long newPositionUs = this.A05.A0A;
        if (jA03 != newPositionUs) {
            C0489Ag c0489Ag = this.A05;
            this.A05 = c0489Ag.A04(fy, jA03, c0489Ag.A01);
            if (z) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0k(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0l(boolean z) throws AM {
        this.A09 = false;
        this.A08 = z;
        if (!z) {
            A0H();
            A0J();
        } else {
            if (this.A05.A00 == 3) {
                A0G();
                if (A0W[4].length() == 29) {
                    throw new RuntimeException();
                }
                A0W[6] = "X2QfJ1e23pCpGilE5nvaFXYxLnWx3Vax";
                this.A0Q.AER(2);
                return;
            }
            if (this.A05.A00 != 2) {
                return;
            }
            this.A0Q.AER(2);
        }
    }

    private void A0m(boolean z) throws AM {
        this.A0B = z;
        if (!this.A0K.A0V(z)) {
            A0j(true);
        }
    }

    private void A0n(boolean z, boolean z2) {
        A0o(true, z, z);
        this.A0I.A03(this.A01 + (z2 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ACR();
        A0N(1);
    }

    private void A0o(boolean z, boolean z2, boolean z3) {
        Object obj;
        long j;
        TrackGroupArray trackGroupArray;
        HU hu2;
        InterfaceC0594Fa interfaceC0594Fa;
        this.A0Q.ADw(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (XG renderer : this.A0C) {
            try {
                A0b(renderer);
            } catch (AM | RuntimeException e) {
                Log.e(A06(0, 21, 15), A06(138, 12, 123), e);
            }
        }
        this.A0C = new XG[0];
        C0487Ae c0487Ae = this.A0K;
        String[] strArr = A0W;
        if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[0] = "2WNzaDjkqcOaPFAy0QOPwI";
        strArr2[7] = "unAKX8spYNQMyMddShLfR5";
        c0487Ae.A0O(!z2);
        A0k(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            this.A0K.A0N(B1.A01);
            for (AT at : this.A0R) {
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                A0W[6] = "oYGfQB8mGDj6jmVX6XAe4nZE0DoRm7Og";
                at.A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        B1 b1 = z3 ? B1.A01 : this.A05.A03;
        if (z3) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        FY fy = z2 ? new FY(A00()) : this.A05.A04;
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.A05.A0A;
        }
        if (!z2) {
            j2 = this.A05.A01;
        }
        int i = this.A05.A00;
        if (z3) {
            trackGroupArray = TrackGroupArray.A04;
        } else {
            C0489Ag c0489Ag = this.A05;
            if (A0W[5].length() != 18) {
                trackGroupArray = c0489Ag.A05;
            } else {
                String[] strArr3 = A0W;
                strArr3[1] = "udHBd6VluCWpjwypGpbQkm44C5lEXr7W";
                strArr3[2] = "ikIjUWR3chEMULYYaopllYxVSgtPleKx";
                trackGroupArray = c0489Ag.A05;
            }
        }
        if (z3) {
            hu2 = this.A0O;
        } else {
            hu2 = this.A05.A06;
        }
        this.A05 = new C0489Ag(b1, obj, fy, j, j2, i, false, trackGroupArray, hu2);
        if (z && (interfaceC0594Fa = this.A07) != null) {
            interfaceC0594Fa.ADt(this);
            this.A07 = null;
        }
    }

    private void A0p(boolean[] zArr, int i) throws AM {
        this.A0C = new XG[i];
        int enabledRendererCount = 0;
        C0485Ac c0485AcA0G = this.A0K.A0G();
        for (int i2 = 0; i2 < this.A0T.length; i2++) {
            if (c0485AcA0G.A04.A00(i2)) {
                A0O(i2, zArr[i2], enabledRendererCount);
                enabledRendererCount++;
            }
        }
    }

    private boolean A0q() {
        C0485Ac c0485AcA0G = this.A0K.A0G();
        long j = c0485AcA0G.A02.A01;
        return j == -9223372036854775807L || this.A05.A0A < j || (c0485AcA0G.A01 != null && (c0485AcA0G.A01.A06 || c0485AcA0G.A01.A02.A04.A01()));
    }

    private boolean A0r(AT at) {
        if (at.A02 == null) {
            Pair<Integer, Long> pairA04 = A04(new AV(at.A03.A08(), at.A03.A01(), AG.A00(at.A03.A02())), false);
            if (pairA04 == null) {
                return false;
            }
            at.A01(((Integer) pairA04.first).intValue(), ((Long) pairA04.second).longValue(), this.A05.A03.A0A(((Integer) pairA04.first).intValue(), this.A0L, true).A03);
        } else {
            int iA04 = this.A05.A03.A04(at.A02);
            if (iA04 == -1) {
                return false;
            }
            at.A00 = iA04;
        }
        return true;
    }

    private boolean A0s(XG xg) {
        C0485Ac c0485AcA0H = this.A0K.A0H();
        return c0485AcA0H.A01 != null && c0485AcA0H.A01.A06 && xg.A84();
    }

    private boolean A0t(FY fy, long j, C0485Ac c0485Ac) {
        if (fy.equals(c0485Ac.A02.A04) && c0485Ac.A06) {
            this.A05.A03.A09(c0485Ac.A02.A04.A02, this.A0L);
            int iA04 = this.A0L.A04(j);
            if (iA04 == -1 || this.A0L.A09(iA04) == c0485Ac.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006a A[PHI: r3
  0x006a: PHI (r3v2 long) = (r3v1 long), (r3v4 long) binds: [B:25:0x009e, B:19:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
    private boolean A0u(boolean z) {
        long jA0C;
        InterfaceC0484Ab interfaceC0484Ab;
        long bufferedPositionUs;
        if (this.A0C.length == 0) {
            return A0q();
        }
        String[] strArr = A0W;
        if (strArr[0].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[0] = "XitCw2lYTMNoWfZ3MNfhmS";
        strArr2[7] = "pjSmPGutCkFid20LDJR8Tk";
        if (!z) {
            return false;
        }
        if (!this.A05.A08) {
            return true;
        }
        C0485Ac c0485AcA0F = this.A0K.A0F();
        String[] strArr3 = A0W;
        if (strArr3[1].charAt(27) != strArr3[2].charAt(27)) {
            A0W[5] = "c9QtbAseiMx42ehTAZ";
            jA0C = c0485AcA0F.A0C(!c0485AcA0F.A02.A05);
            if (jA0C != Long.MIN_VALUE) {
                interfaceC0484Ab = this.A0J;
                bufferedPositionUs = this.A03;
                if (interfaceC0484Ab.AEo(jA0C - c0485AcA0F.A08(bufferedPositionUs), this.A0G.A7E().A01, this.A09)) {
                    return false;
                }
            }
        } else {
            String[] strArr4 = A0W;
            strArr4[1] = "5BPuibQqZ5NKjWZyuTION1z1lHkA3o6b";
            strArr4[2] = "lue4BzZmQF8ChJf2GK4Pk4NwU097v1o6";
            jA0C = c0485AcA0F.A0C(!c0485AcA0F.A02.A05);
            if (jA0C != Long.MIN_VALUE) {
                interfaceC0484Ab = this.A0J;
                bufferedPositionUs = this.A03;
                if (interfaceC0484Ab.AEo(jA0C - c0485AcA0F.A08(bufferedPositionUs), this.A0G.A7E().A01, this.A09)) {
                    return false;
                }
            }
        }
        return true;
    }

    @NonNull
    public static Format[] A0v(HQ hq) {
        int length = hq != null ? hq.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = hq.A6h(i);
            if (A0W[3].charAt(0) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[1] = "cHoAaTwhCyKnC5gIlgOheFkD17ImOLE4";
            strArr[2] = "NdVO49IoL7wvUQC4on3mokgCd3AJvc50";
        }
        return formatArr;
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    public final synchronized void A0x() {
        if (this.A0A) {
            return;
        }
        this.A0Q.AER(7);
        boolean z = false;
        while (!this.A0A) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void A0y(B1 b1, int i, long j) {
        this.A0Q.A9m(3, new AV(b1, i, j)).sendToTarget();
    }

    public final void A0z(InterfaceC0594Fa interfaceC0594Fa, boolean z, boolean z2) {
        this.A0Q.A9l(0, z ? 1 : 0, z2 ? 1 : 0, interfaceC0594Fa).sendToTarget();
    }

    public final void A10(boolean z) {
        this.A0Q.A9k(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.A9k(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.AJ
    public final void ABo(C0490Ah c0490Ah) {
        this.A0E.obtainMessage(1, c0490Ah).sendToTarget();
        A0L(c0490Ah.A01);
    }

    @Override // com.facebook.ads.redexgen.X.VX
    public final void ABw(VW vw) {
        this.A0Q.A9m(9, vw).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.FZ
    public final void ACM(InterfaceC0594Fa interfaceC0594Fa, B1 b1, Object obj) {
        this.A0Q.A9m(8, new AS(interfaceC0594Fa, b1, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0499Aq
    public final synchronized void AET(C0501As c0501As) {
        if (this.A0A) {
            Log.w(A06(0, 21, 15), A06(50, 37, 50));
            c0501As.A0A(false);
        } else {
            this.A0Q.A9m(14, c0501As).sendToTarget();
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        String strA06 = A06(0, 21, 15);
        try {
            switch (message.what) {
                case 0:
                    A0h((InterfaceC0594Fa) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((AV) message.obj);
                    break;
                case 4:
                    A0W((C0490Ah) message.obj);
                    break;
                case 5:
                    A0d((C0506Ax) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((AS) message.obj);
                    break;
                case 9:
                    A0f((VW) message.obj);
                    break;
                case 10:
                    A0e((VW) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((C0501As) message.obj);
                    break;
                case 15:
                    A0a((C0501As) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (AM e) {
            Log.e(strA06, A06(110, 15, 0), e);
            A0n(false, false);
            this.A0E.obtainMessage(2, e).sendToTarget();
            A0A();
        } catch (IOException e2) {
            Log.e(strA06, A06(125, 13, 87), e2);
            A0n(false, false);
            this.A0E.obtainMessage(2, AM.A00(e2)).sendToTarget();
            if (A0W[6].charAt(23) != 'j') {
                A0W[5] = "BLVAUEtDSJNWXrvjpr";
                A0A();
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException e3) {
            Log.e(strA06, A06(87, 23, 108), e3);
            A0n(false, false);
            this.A0E.obtainMessage(2, AM.A02(e3)).sendToTarget();
            A0A();
        }
        return true;
    }
}
