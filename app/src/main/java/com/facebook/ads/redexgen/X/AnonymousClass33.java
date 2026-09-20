package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.33, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass33 extends E4 implements Handler.Callback {
    public static String[] A0D = {"fagSsoac43UJSJG", "PL0Df5XObPsMjoFT3sU6Lp83XbviyP8R", "k75ap2fxOZvkqr2FjEQ9d3Y", "qEZm9kPptvCV49j1bDgJYwonF92a", "8QH8MqTnW7KMzd9bL", "CjrIcpNXno9M2QOeMZvTD2WdktHrPs5P", "AfT76Pf2kDJi2th", "sZbuEqgSWLt9Albo4x4yfDH"};
    public int A00;
    public int A01;
    public Format A02;
    public VS A03;
    public C0531Bx A04;
    public AbstractC0523Bp A05;
    public AbstractC0523Bp A06;
    public boolean A07;
    public boolean A08;
    public final Handler A09;
    public final AZ A0A;
    public final InterfaceC0620Ga A0B;
    public final InterfaceC0621Gb A0C;

    public AnonymousClass33(InterfaceC0621Gb interfaceC0621Gb, Looper looper) {
        this(interfaceC0621Gb, looper, InterfaceC0620Ga.A00);
    }

    public AnonymousClass33(InterfaceC0621Gb interfaceC0621Gb, Looper looper, InterfaceC0620Ga interfaceC0620Ga) {
        super(3);
        this.A0C = (InterfaceC0621Gb) IK.A01(interfaceC0621Gb);
        this.A09 = looper == null ? null : new Handler(looper, this);
        this.A0B = interfaceC0620Ga;
        this.A0A = new AZ();
    }

    private long A00() {
        int i = this.A01;
        if (i == -1 || i >= this.A06.A6c()) {
            return Long.MAX_VALUE;
        }
        return this.A06.A6b(this.A01);
    }

    private void A01() {
        A06(Collections.emptyList());
    }

    private void A02() {
        this.A04 = null;
        this.A01 = -1;
        AbstractC0523Bp abstractC0523Bp = this.A06;
        if (abstractC0523Bp != null) {
            abstractC0523Bp.A08();
            this.A06 = null;
        }
        AbstractC0523Bp abstractC0523Bp2 = this.A05;
        if (abstractC0523Bp2 != null) {
            abstractC0523Bp2.A08();
            this.A05 = null;
        }
    }

    private void A03() {
        A02();
        this.A03.ADm();
        this.A03 = null;
        this.A00 = 0;
    }

    private void A04() {
        A03();
        this.A03 = this.A0B.A4G(this.A02);
    }

    private void A05(List<GX> list) {
        this.A0C.AAS(list);
    }

    private void A06(List<GX> list) {
        Handler handler = this.A09;
        if (handler != null) {
            handler.obtainMessage(0, list).sendToTarget();
        } else {
            A05(list);
        }
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public final void A12() {
        this.A02 = null;
        A01();
        A03();
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public final void A15(long j, boolean z) {
        A01();
        this.A07 = false;
        this.A08 = false;
        if (this.A00 != 0) {
            A04();
            return;
        }
        A02();
        VS vs = this.A03;
        String[] strArr = A0D;
        if (strArr[2].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A0D[1] = "SIdEizz9oP1X0InrrFd2Zym6xF4ie8Hi";
        vs.flush();
    }

    @Override // com.facebook.ads.redexgen.X.E4
    public final void A17(Format[] formatArr, long j) throws AM {
        this.A02 = formatArr[0];
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            this.A03 = this.A0B.A4G(this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final boolean A8R() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.XG
    public final boolean A8c() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bb  */
    @Override // com.facebook.ads.redexgen.X.XG
    public final void ADz(long j, long j2) throws Exception {
        if (this.A08) {
            return;
        }
        if (this.A05 == null) {
            this.A03.AEg(j);
            try {
                this.A05 = this.A03.A4l();
            } catch (GZ e) {
                throw AM.A01(e, A0y());
            }
        }
        if (A7W() != 2) {
            return;
        }
        boolean z = false;
        if (this.A06 != null) {
            long jA00 = A00();
            while (jA00 <= j) {
                this.A01++;
                jA00 = A00();
                z = true;
            }
        }
        AbstractC0523Bp abstractC0523Bp = this.A05;
        String[] strArr = A0D;
        if (strArr[4].length() != strArr[3].length()) {
            A0D[1] = "XY0BtpFryTh5vJ9OnDecIRSpslOi5uhK";
            if (abstractC0523Bp != null) {
                if (abstractC0523Bp.A04()) {
                    if (!z && A00() == Long.MAX_VALUE) {
                        int i = this.A00;
                        String[] strArr2 = A0D;
                        if (strArr2[6].length() != strArr2[0].length()) {
                            String[] strArr3 = A0D;
                            strArr3[4] = "mbnDFqY2K95bUayMi";
                            strArr3[3] = "jZB4HApNBiduyvnow8cew7gbgOu4";
                            if (i == 2) {
                                A04();
                            } else {
                                A02();
                                this.A08 = true;
                            }
                        } else {
                            String[] strArr4 = A0D;
                            strArr4[4] = "MeHVLRPd9fQTHEeBi";
                            strArr4[3] = "YXb6olWsbop2pyVFpyT7RkPVUyda";
                            if (i == 2) {
                                A04();
                            } else {
                                A02();
                                this.A08 = true;
                            }
                        }
                    }
                } else if (((X1) this.A05).A01 <= j) {
                    AbstractC0523Bp abstractC0523Bp2 = this.A06;
                    if (abstractC0523Bp2 != null) {
                        abstractC0523Bp2.A08();
                    }
                    this.A06 = this.A05;
                    String[] strArr5 = A0D;
                    if (strArr5[4].length() != strArr5[3].length()) {
                        A0D[5] = "X2bpaAWybcYqy3FAGHkwIjlm6aPwbX20";
                        this.A05 = null;
                        this.A01 = this.A06.A70(j);
                        z = true;
                    }
                }
            }
            if (z) {
                A06(this.A06.A6B(j));
            }
            if (this.A00 == 2) {
                return;
            }
            while (!this.A07) {
                try {
                    if (this.A04 == null) {
                        this.A04 = this.A03.A4k();
                        if (this.A04 == null) {
                            return;
                        }
                    }
                    if (this.A00 == 1) {
                        this.A04.A02(4);
                        this.A03.ADW(this.A04);
                        this.A04 = null;
                        this.A00 = 2;
                        return;
                    }
                    int iA10 = A10(this.A0A, this.A04, false);
                    if (iA10 == -4) {
                        if (this.A04.A04()) {
                            this.A07 = true;
                        } else {
                            this.A04.A00 = this.A0A.A00.A0G;
                            this.A04.A08();
                        }
                        this.A03.ADW(this.A04);
                        this.A04 = null;
                    } else if (iA10 == -3) {
                        return;
                    }
                } catch (GZ e2) {
                    throw AM.A01(e2, A0y());
                }
            }
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0503Au
    public final int AF7(Format format) {
        if (this.A0B.AF8(format)) {
            return E4.A0x(null, format.A0H) ? 4 : 2;
        }
        if (C0672Ic.A0A(format.A0O)) {
            return 1;
        }
        return 0;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            A05((List) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }
}
