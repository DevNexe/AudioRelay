package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.facebook.ads.AdError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC03514k implements Runnable {
    public static byte[] A07;
    public static String[] A08 = {"c4xSVVt4fNiIZ9aJ0ftrOCVpKy2EJW", "bj77oS7wYHzhrY124YppwtIfPTuDoAHL", "mRmZUQV2DMpprRsDQaH8Mtbq5JuQtR14", "UXM5", "qfxFRQLCBxpF20va4RNO9ygLlTXV5cTV", "Bw29gSSAA0erG37CQVEqOkFPeCj6ZZr8", "KVIri1u0fbW7r5jnncTGzAnirlJcKx", "TA0EOfT3Z02jNldii3VIEnkki3"};
    public OverScroller A01;
    public int A02;
    public int A03;
    public final /* synthetic */ F9 A06;
    public Interpolator A00 = F9.A1A;
    public boolean A04 = false;
    public boolean A05 = false;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-46, -42, -96, -45, -29, -14, -17, -20, -20};
    }

    static {
        A03();
    }

    public RunnableC03514k(F9 f9) {
        this.A06 = f9;
        this.A01 = new OverScroller(f9.getContext(), F9.A1A);
    }

    private float A00(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    private int A01(int absDx, int absDy, int i, int i2) {
        int iRound;
        int containerSize = Math.abs(absDx);
        int halfContainerSize = Math.abs(absDy);
        boolean z = containerSize > halfContainerSize;
        int iSqrt = (int) Math.sqrt((i * i) + (i2 * i2));
        int iSqrt2 = (int) Math.sqrt((absDx * absDx) + (absDy * absDy));
        F9 f9 = this.A06;
        int width = z ? f9.getWidth() : f9.getHeight();
        int delta = width / 2;
        float fA00 = delta + (delta * A00(Math.min(1.0f, (iSqrt2 * 1.0f) / width)));
        if (iSqrt > 0) {
            iRound = Math.round(Math.abs(fA00 / iSqrt) * 1000.0f) * 4;
        } else {
            if (!z) {
                containerSize = halfContainerSize;
            }
            iRound = (int) (((containerSize / width) + 1.0f) * 300.0f);
        }
        return Math.min(iRound, AdError.SERVER_ERROR_CODE);
    }

    private final void A04() {
        this.A05 = false;
        this.A04 = true;
    }

    private final void A05() {
        this.A04 = false;
        if (this.A05) {
            A07();
        }
    }

    private final void A06(int i, int i2, int i3, int i4) {
        A0B(i, i2, A01(i, i2, i3, i4));
    }

    public final void A07() {
        if (this.A04) {
            this.A05 = true;
            return;
        }
        this.A06.removeCallbacks(this);
        if (A08[4].charAt(10) == 'o') {
            throw new RuntimeException();
        }
        A08[2] = "DBTzn4opHB64KJUt1kyQdTPFEm6jko5S";
        AnonymousClass38.A0D(this.A06, this);
    }

    public final void A08() {
        this.A06.removeCallbacks(this);
        this.A01.abortAnimation();
    }

    public final void A09(int i, int i2) {
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        A07();
    }

    public final void A0A(int i, int i2) {
        A06(i, i2, 0, 0);
    }

    public final void A0B(int i, int i2, int i3) {
        A0C(i, i2, i3, F9.A1A);
    }

    public final void A0C(int i, int i2, int i3, Interpolator interpolator) {
        if (this.A00 != interpolator) {
            this.A00 = interpolator;
            this.A01 = new OverScroller(this.A06.getContext(), interpolator);
        }
        this.A06.setScrollState(2);
        this.A03 = 0;
        this.A02 = 0;
        this.A01.startScroll(0, 0, i, i2, i3);
        if (Build.VERSION.SDK_INT < 23) {
            OverScroller overScroller = this.A01;
            if (A08[7].length() != 26) {
                throw new RuntimeException();
            }
            A08[2] = "UeYo97OquvC2FnZv3LivDSVIricXCoYT";
            overScroller.computeScrollOffset();
        }
        A07();
    }

    public final void A0D(int i, int i2, Interpolator interpolator) {
        int iA01 = A01(i, i2, 0, 0);
        if (interpolator == null) {
            interpolator = F9.A1A;
        }
        A0C(i, i2, iA01, interpolator);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0275  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:130:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:30:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:56:0x017d  */
    /* JADX WARN: Code duplicated, block: B:61:0x018c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0196  */
    /* JADX WARN: Code duplicated, block: B:96:0x020f  */
    /* JADX WARN: Code duplicated, block: B:98:0x021b  */
    @Override // java.lang.Runnable
    public final void run() {
        boolean fullyConsumedVertical;
        boolean fullyConsumedVertical2;
        int iA03;
        if (this.A06.A06 == null) {
            A08();
            if (A08[2].charAt(8) != 'G') {
                A08[3] = "wyRlewweBEsEMs9L1doa5ZD019uED4";
                return;
            }
        } else {
            A04();
            this.A06.A1J();
            OverScroller overScroller = this.A01;
            AbstractC03474g abstractC03474g = this.A06.A06.A02;
            if (overScroller.computeScrollOffset()) {
                int[] iArr = this.A06.A16;
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int y = this.A02;
                int i = currX - y;
                int dx = this.A03;
                int i2 = currY - dx;
                int iA1h = 0;
                int iA1i = 0;
                this.A02 = currX;
                this.A03 = currY;
                int x = 0;
                int overscrollY = 0;
                if (this.A06.A1y(i, i2, iArr, null, 1)) {
                    i -= iArr[0];
                    i2 -= iArr[1];
                }
                if (this.A06.A04 != null) {
                    this.A06.A1K();
                    this.A06.A1L();
                    C2V.A01(A02(0, 9, 96));
                    F9 f9 = this.A06;
                    f9.A1l(f9.A0s);
                    if (i != 0) {
                        iA1h = this.A06.A06.A1h(i, this.A06.A0r, this.A06.A0s);
                        x = i - iA1h;
                    }
                    if (i2 != 0) {
                        iA1i = this.A06.A06.A1i(i2, this.A06.A0r, this.A06.A0s);
                        overscrollY = i2 - iA1i;
                    }
                    C2V.A00();
                    if (A08[4].charAt(10) != 'o') {
                        A08[7] = "AEnMZuqp98GVRFTkSbmwbA51QL";
                        this.A06.A1P();
                        this.A06.A1M();
                        this.A06.A1r(false);
                        if (abstractC03474g != null) {
                            if (!abstractC03474g.A0E() && abstractC03474g.A0F()) {
                                iA03 = this.A06.A0s.A03();
                                if (iA03 == 0) {
                                    abstractC03474g.A09();
                                } else if (abstractC03474g.A07() >= iA03) {
                                    abstractC03474g.A04(i - x, i2 - overscrollY);
                                } else {
                                    abstractC03474g.A0A(iA03 - 1);
                                    abstractC03474g.A04(i - x, i2 - overscrollY);
                                }
                            }
                        }
                    } else {
                        this.A06.A1P();
                        this.A06.A1M();
                        this.A06.A1r(false);
                        if (abstractC03474g != null) {
                            if (!abstractC03474g.A0E()) {
                                iA03 = this.A06.A0s.A03();
                                if (iA03 == 0) {
                                    abstractC03474g.A09();
                                } else if (abstractC03474g.A07() >= iA03) {
                                    abstractC03474g.A04(i - x, i2 - overscrollY);
                                } else {
                                    abstractC03474g.A0A(iA03 - 1);
                                    abstractC03474g.A04(i - x, i2 - overscrollY);
                                }
                            }
                        }
                    }
                    if (A08[4].charAt(10) == 'o') {
                        throw new RuntimeException();
                    }
                    A08[3] = "TGS8taa2nLIFayhr7f7v";
                }
                if (!this.A06.A0v.isEmpty()) {
                    this.A06.invalidate();
                }
                if (this.A06.getOverScrollMode() != 2) {
                    this.A06.A1Z(i, i2);
                }
                if (!this.A06.A1x(iA1h, iA1i, x, overscrollY, null, 1) && (x != 0 || overscrollY != 0)) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i3 = 0;
                    if (x != currX) {
                        if (x < 0) {
                            i3 = -currVelocity;
                        } else {
                            i3 = x > 0 ? currVelocity : 0;
                        }
                    }
                    if (overscrollY != currY) {
                        if (overscrollY < 0) {
                            currVelocity = -currVelocity;
                        } else if (overscrollY <= 0) {
                            currVelocity = 0;
                        }
                    } else {
                        currVelocity = 0;
                    }
                    int overScrollMode = this.A06.getOverScrollMode();
                    String[] strArr = A08;
                    if (strArr[5].charAt(12) != strArr[1].charAt(12)) {
                        A08[7] = "VAPByUbSVbCRl876Iw5SK7wrPn";
                        if (overScrollMode != 2) {
                            this.A06.A1Y(i3, currVelocity);
                        }
                    } else if (overScrollMode != 2) {
                        this.A06.A1Y(i3, currVelocity);
                    }
                    if (i3 == 0 && x != currX) {
                        int velY = overScroller.getFinalX();
                        if (velY == 0) {
                            if (currVelocity == 0) {
                                overScroller.abortAnimation();
                            } else {
                                overScroller.abortAnimation();
                            }
                        }
                    } else if (currVelocity == 0 || overscrollY == currY || overScroller.getFinalY() == 0) {
                        overScroller.abortAnimation();
                    }
                }
                if (iA1h != 0 || iA1i != 0) {
                    F9 f10 = this.A06;
                    String[] strArr2 = A08;
                    String str = strArr2[6];
                    String str2 = strArr2[0];
                    int velY2 = str.length();
                    if (velY2 != str2.length()) {
                        f10.A1b(iA1h, iA1i);
                    } else {
                        String[] strArr3 = A08;
                        strArr3[6] = "bSHjdsVkhDQdmG1cm4T37Ejfm8kVFC";
                        strArr3[0] = "uWlM2d1CCrIfar3HOPPYeFU5881RH0";
                        f10.A1b(iA1h, iA1i);
                    }
                }
                if (!this.A06.awakenScrollBars()) {
                    this.A06.invalidate();
                }
                int velY3 = (i2 != 0 && this.A06.A06.A25() && iA1i == i2) ? 1 : 0;
                if (i != 0) {
                    boolean fullyConsumedVertical3 = this.A06.A06.A24();
                    if (fullyConsumedVertical3 && iA1h == i) {
                        fullyConsumedVertical = true;
                    } else {
                        fullyConsumedVertical = false;
                    }
                } else {
                    fullyConsumedVertical = false;
                }
                boolean z = (i == 0 && i2 == 0) || fullyConsumedVertical || velY3 != 0;
                boolean zIsFinished = overScroller.isFinished();
                if (A08[4].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                A08[2] = "98aPJs2vUpcbHQSYyxrV3zG03CSHn11I";
                if (zIsFinished) {
                    this.A06.setScrollState(0);
                    fullyConsumedVertical2 = F9.A1E;
                    if (fullyConsumedVertical2) {
                        this.A06.A02.A02();
                    }
                    this.A06.A1X(1);
                } else {
                    if (!z) {
                        boolean fullyConsumedVertical4 = this.A06.A1v(1);
                        if (!fullyConsumedVertical4) {
                            this.A06.setScrollState(0);
                            fullyConsumedVertical2 = F9.A1E;
                            if (fullyConsumedVertical2) {
                                this.A06.A02.A02();
                            }
                            this.A06.A1X(1);
                        }
                    }
                    A07();
                    if (this.A06.A03 != null) {
                        this.A06.A03.A0B(this.A06, i, i2);
                    }
                }
            }
            if (abstractC03474g != null) {
                boolean zA0E = abstractC03474g.A0E();
                String[] strArr4 = A08;
                if (strArr4[5].charAt(12) != strArr4[1].charAt(12)) {
                    String[] strArr5 = A08;
                    strArr5[6] = "1QtdEsEbLTCaQSWKyl1hJXPObs6yvI";
                    strArr5[0] = "gIBnLdKBfiMzk6Ug2irxti7V3sW67K";
                    if (zA0E) {
                        abstractC03474g.A04(0, 0);
                    }
                    if (!this.A05) {
                        abstractC03474g.A09();
                    }
                }
            }
            A05();
            return;
        }
        throw new RuntimeException();
    }
}
