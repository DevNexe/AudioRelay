package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0992Uq implements InterfaceC0650He {
    public static byte[] A0L;
    public static String[] A0M = {"xvXnimfZlroovEtMoHYEYdvHQmTptcRb", "VShQwZMBIZykoEi", "P7iiojcQSdjMkPZizdNAiKDH8422CMpJ", "OxKv", "P8zJvNho1beYtiBqU3s9pOljEd8sbOL5", "Bz35mpVTEU3xTv8hVu6cT493QseTsu6A", "YnRJs9xpv2Ig79N4M2dWIXRLqnd73xG0", "iIjgXD4YmMEy6XOGrZ4fgbIBHD"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public Uri A05;
    public Uri A06;
    public InterfaceC0650He A07;
    public I8 A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final InterfaceC0650He A0D;
    public final InterfaceC0650He A0E;
    public final InterfaceC0650He A0F;
    public final I4 A0G;

    @Nullable
    public final I6 A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0M[1].length() != 15) {
                throw new RuntimeException();
            }
            A0M[1] = "0DeGlGnSrcDo9YH";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 36);
            i4++;
        }
    }

    public static void A06() {
        A0L = new byte[]{28, 29, 48, 18, 16, 27, 22, 23, 49, 10, 7, 22, 0, 33, 22, 18, 23};
    }

    static {
        A06();
    }

    public C0992Uq(I4 i4, InterfaceC0650He interfaceC0650He, InterfaceC0650He interfaceC0650He2, @Nullable InterfaceC0648Hc interfaceC0648Hc, int i, @Nullable I6 i6) {
        this.A0G = i4;
        this.A0D = interfaceC0650He2;
        this.A0I = (i & 1) != 0;
        this.A0K = (i & 2) != 0;
        this.A0J = (i & 4) != 0;
        this.A0F = interfaceC0650He;
        if (interfaceC0648Hc != null) {
            this.A0E = new C0995Ut(interfaceC0650He, interfaceC0648Hc);
        } else {
            this.A0E = null;
        }
        this.A0H = i6;
    }

    private int A00(C0654Hi c0654Hi) {
        if (this.A0K && this.A0C) {
            return 0;
        }
        if (this.A0J && c0654Hi.A02 == -1) {
            return 1;
        }
        return -1;
    }

    public static Uri A01(I4 i4, String str, Uri uri) {
        IE contentMetadata = i4.A69(str);
        Uri uriA01 = IF.A01(contentMetadata);
        return uriA01 == null ? uri : uriA01;
    }

    private void A03() throws IOException {
        InterfaceC0650He interfaceC0650He = this.A07;
        if (interfaceC0650He == null) {
            return;
        }
        try {
            interfaceC0650He.close();
        } finally {
            this.A07 = null;
            this.A0A = false;
            I8 i8 = this.A08;
            if (i8 != null) {
                this.A0G.ADq(i8);
                this.A08 = null;
            }
        }
    }

    private void A04() {
        if (this.A0H != null && this.A04 > 0) {
            this.A0G.A5v();
            throw new NullPointerException(A02(0, 17, 87));
        }
    }

    private void A05() throws IOException {
        this.A01 = 0L;
        if (A0C()) {
            this.A0G.AEW(this.A09, this.A03);
        }
    }

    private void A07(IOException iOException) {
        if (A0A() || (iOException instanceof I2)) {
            this.A0C = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01bb A[PHI: r4
  0x01bb: PHI (r4v9 long) = (r4v8 long), (r4v10 long) binds: [B:76:0x01d0, B:73:0x01b9] A[DONT_GENERATE, DONT_INLINE]] */
    private void A08(boolean z) throws IOException {
        I8 i8AEz;
        long jMin;
        long j;
        C0654Hi c0654Hi;
        InterfaceC0650He nextDataSource;
        long j2;
        if (this.A0B) {
            i8AEz = null;
        } else if (this.A0I) {
            try {
                I4 i4 = this.A0G;
                String str = this.A09;
                long length = this.A03;
                i8AEz = i4.AEz(str, length);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            I4 i5 = this.A0G;
            String str2 = this.A09;
            long length2 = this.A03;
            i8AEz = i5.AF0(str2, length2);
        }
        if (i8AEz == null) {
            nextDataSource = this.A0F;
            c0654Hi = new C0654Hi(this.A06, this.A03, this.A01, this.A09, this.A00);
        } else {
            boolean z2 = i8AEz.A05;
            if (A0M[1].length() != 15) {
                throw new RuntimeException();
            }
            A0M[1] = "1UJmYg9w0Ah8MKa";
            if (z2) {
                Uri uriFromFile = Uri.fromFile(i8AEz.A03);
                long j3 = this.A03 - i8AEz.A02;
                long filePosition = i8AEz.A01 - j3;
                long j4 = this.A01;
                if (j4 != -1) {
                    filePosition = Math.min(filePosition, j4);
                }
                c0654Hi = new C0654Hi(uriFromFile, this.A03, j3, filePosition, this.A09, this.A00);
                nextDataSource = this.A0D;
            } else {
                if (i8AEz.A02()) {
                    jMin = this.A01;
                } else {
                    jMin = i8AEz.A01;
                    if (A0M[5].charAt(13) != 'v') {
                        j = this.A01;
                        if (j != -1) {
                            jMin = Math.min(jMin, j);
                        }
                    } else {
                        String[] strArr = A0M;
                        strArr[4] = "PC7XIFFDC47aQsnqIkxNyje9RJvaJdFU";
                        strArr[2] = "PcakhZiXuGMneXp1j61qedRiaoGK74TH";
                        j = this.A01;
                        if (j != -1) {
                            jMin = Math.min(jMin, j);
                        }
                    }
                }
                c0654Hi = new C0654Hi(this.A06, this.A03, jMin, this.A09, this.A00);
                if (this.A0E != null) {
                    nextDataSource = this.A0E;
                } else {
                    nextDataSource = this.A0F;
                    this.A0G.ADq(i8AEz);
                    i8AEz = null;
                }
            }
        }
        boolean z3 = this.A0B;
        if (A0M[5].charAt(13) == 'v') {
            String[] strArr2 = A0M;
            strArr2[0] = "KvwFMKvPDdyoDof7jewHEr1dZonPaeal";
            strArr2[6] = "fxC7lv0XmsujX3kF6ChIFpCKa92dKX8Z";
            if (!z3 && nextDataSource == this.A0F) {
                j2 = this.A03 + 102400;
            } else {
                j2 = Long.MAX_VALUE;
            }
            this.A02 = j2;
            if (z) {
                IK.A04(A09());
                if (nextDataSource == this.A0F) {
                    return;
                }
                try {
                    A03();
                } catch (Throwable th) {
                    if (i8AEz.A01()) {
                        this.A0G.ADq(i8AEz);
                    }
                    throw th;
                }
            }
            if (i8AEz != null && i8AEz.A01()) {
                this.A08 = i8AEz;
            }
            this.A07 = nextDataSource;
            this.A0A = c0654Hi.A02 == -1;
            long jACw = nextDataSource.ACw(c0654Hi);
            IG ig = new IG();
            if (this.A0A) {
                String[] strArr3 = A0M;
                if (strArr3[0].charAt(29) != strArr3[6].charAt(29)) {
                    String[] strArr4 = A0M;
                    strArr4[0] = "rfibpnYYT7oq3SE3U0OfIBxRp9qsAWQT";
                    strArr4[6] = "JzsYqi5M8NJiAfZVcvXbGjq2yK7Lit7o";
                    if (jACw != -1) {
                        this.A01 = jACw;
                        IF.A05(ig, this.A03 + this.A01);
                    }
                }
            }
            if (A0B()) {
                InterfaceC0650He nextDataSource2 = this.A07;
                this.A05 = nextDataSource2.A7k();
                if (true ^ this.A06.equals(this.A05)) {
                    Uri uri = this.A05;
                    String[] strArr5 = A0M;
                    if (strArr5[0].charAt(29) != strArr5[6].charAt(29)) {
                        A0M[1] = "ZUbplsDkGQ2eIUx";
                        IF.A06(ig, uri);
                    } else {
                        String[] strArr6 = A0M;
                        strArr6[0] = "maM98InkYobA9Ucv5ADUn4EtGMwEmyQA";
                        strArr6[6] = "AIUrjRExFhVdShuhpMN8pAFUNrsIDDQG";
                        IF.A06(ig, uri);
                    }
                } else {
                    IF.A04(ig);
                }
            }
            boolean zA0C = A0C();
            String[] strArr7 = A0M;
            if (strArr7[0].charAt(29) == strArr7[6].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr8 = A0M;
            strArr8[7] = "TYUadxfFh4EA22dSKzJNDq7wo1";
            strArr8[3] = "qycP";
            if (zA0C) {
                this.A0G.A3P(this.A09, ig);
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private boolean A09() {
        return this.A07 == this.A0F;
    }

    private boolean A0A() {
        return this.A07 == this.A0D;
    }

    private boolean A0B() {
        return !A0A();
    }

    private boolean A0C() {
        return this.A07 == this.A0E;
    }

    public static boolean A0D(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof C0651Hf) && ((C0651Hf) cause).A00 == 0) {
                return true;
            }
        }
        if (A0M[5].charAt(13) != 'v') {
            throw new RuntimeException();
        }
        A0M[1] = "Fi50x9pU4R4a4ch";
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final Uri A7k() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final long ACw(C0654Hi c0654Hi) throws IOException {
        try {
            this.A09 = IA.A02(c0654Hi);
            this.A06 = c0654Hi.A04;
            this.A05 = A01(this.A0G, this.A09, this.A06);
            this.A00 = c0654Hi.A00;
            this.A03 = c0654Hi.A03;
            this.A0B = A00(c0654Hi) != -1;
            boolean z = this.A0B;
            if (c0654Hi.A02 != -1 || this.A0B) {
                this.A01 = c0654Hi.A02;
            } else {
                this.A01 = this.A0G.A68(this.A09);
                if (this.A01 != -1) {
                    this.A01 -= c0654Hi.A03;
                    if (this.A01 <= 0) {
                        throw new C0651Hf(0);
                    }
                }
            }
            A08(false);
            return this.A01;
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final void close() throws IOException {
        this.A06 = null;
        this.A05 = null;
        A04();
        try {
            A03();
        } catch (IOException e) {
            A07(e);
            throw e;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.A01 == 0) {
            return -1;
        }
        try {
            long j = this.A03;
            long j2 = this.A02;
            String[] strArr = A0M;
            if (strArr[4].charAt(0) != strArr[2].charAt(0)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[7] = "DFL6VfCjI9oAtZuqjooU4v3Ar2";
            strArr2[3] = "hOjd";
            if (j >= j2) {
                A08(true);
            }
            int i3 = this.A07.read(bArr, i, i2);
            if (i3 != -1) {
                if (A0A()) {
                    this.A04 += (long) i3;
                }
                this.A03 += (long) i3;
                if (this.A01 != -1) {
                    this.A01 -= (long) i3;
                }
            } else if (this.A0A) {
                A05();
            } else if (this.A01 > 0 || this.A01 == -1) {
                A03();
                A08(false);
                return read(bArr, i, i2);
            }
            return i3;
        } catch (IOException e) {
            if (this.A0A && A0D(e)) {
                A05();
                return -1;
            }
            A07(e);
            throw e;
        }
    }
}
