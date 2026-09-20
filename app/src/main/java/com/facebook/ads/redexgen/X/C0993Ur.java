package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0993Ur implements InterfaceC0648Hc {
    public static String[] A0B = {"w20bAWjYMNQBWlbon1lxwLvvC2Wc6aDw", "lwUY3oAzCyDGvzazHVXOHQ3zY7kbNweW", "UaweMkDBVxVyODuJAIk0oAizBiXulMgw", "HCwWhWYnSwS9lU8hovQ66gM", "BSrpyguVpFJpaQafc1NdT7mO3uIgLmFW", "PMiNqiQ4kgs0VWuHsJy6tm47yNuoSJAG", "LFxM2Smyc2PeWHZihlec1nFmzNKIeMAJ", "CwFpegEhQfdxfTMnj3Ot7m2"};
    public long A00;
    public long A01;
    public C0654Hi A02;
    public C0686Iq A03;
    public File A04;
    public FileOutputStream A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final I4 A09;
    public final boolean A0A;

    public C0993Ur(I4 i4, long j) {
        this(i4, j, 20480, true);
    }

    public C0993Ur(I4 i4, long j, int i, boolean z) {
        this.A09 = (I4) IK.A01(i4);
        this.A08 = j;
        this.A07 = i;
        this.A0A = z;
    }

    private void A00() throws IOException {
        OutputStream outputStream = this.A06;
        if (outputStream == null) {
            return;
        }
        boolean z = false;
        try {
            outputStream.flush();
            if (this.A0A) {
                this.A05.getFD().sync();
            }
            boolean z2 = true;
            byte b = b == true ? 1 : 0;
        } finally {
            C0695Iz.A0X(this.A06);
            this.A06 = null;
            File file = this.A04;
            this.A04 = null;
            if (z) {
                this.A09.A44(file);
            } else {
                file.delete();
            }
        }
    }

    private void A01() throws IOException {
        long jMin;
        if (this.A02.A02 == -1) {
            jMin = this.A08;
        } else {
            long j = this.A02.A02;
            long maxLength = this.A00;
            long j2 = j - maxLength;
            long maxLength2 = this.A08;
            jMin = Math.min(j2, maxLength2);
        }
        I4 i4 = this.A09;
        String str = this.A02.A05;
        long maxLength3 = this.A02.A01;
        this.A04 = i4.AEx(str, this.A00 + maxLength3, jMin);
        this.A05 = new FileOutputStream(this.A04);
        int i = this.A07;
        if (i > 0) {
            C0686Iq c0686Iq = this.A03;
            if (c0686Iq == null) {
                this.A03 = new C0686Iq(this.A05, i);
            } else {
                c0686Iq.A00(this.A05);
            }
            this.A06 = this.A03;
        } else {
            this.A06 = this.A05;
        }
        this.A01 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0648Hc
    public final void ACy(C0654Hi c0654Hi) throws C0994Us {
        if (c0654Hi.A02 == -1 && !c0654Hi.A02(2)) {
            this.A02 = null;
            return;
        }
        this.A02 = c0654Hi;
        this.A00 = 0L;
        try {
            A01();
        } catch (IOException e) {
            throw new C0994Us(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0648Hc
    public final void close() throws C0994Us {
        if (this.A02 == null) {
            return;
        }
        try {
            A00();
        } catch (IOException e) {
            throw new C0994Us(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0648Hc
    public final void write(byte[] bArr, int bytesToWrite, int i) throws C0994Us {
        if (this.A02 == null) {
            return;
        }
        int i2 = 0;
        while (i2 < i) {
            try {
                long j = this.A01;
                long j2 = this.A08;
                if (A0B[0].charAt(30) != 'D') {
                    throw new RuntimeException();
                }
                A0B[6] = "jgYsfafqQwydOQ8BdugE0IR3OVOgVMqo";
                if (j == j2) {
                    A00();
                    A01();
                }
                int iMin = (int) Math.min(i - i2, this.A08 - this.A01);
                this.A06.write(bArr, bytesToWrite + i2, iMin);
                i2 += iMin;
                this.A01 += (long) iMin;
                this.A00 += (long) iMin;
            } catch (IOException e) {
                throw new C0994Us(e);
            }
        }
    }
}
