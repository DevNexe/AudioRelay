package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VC implements InterfaceC0650He {
    public static byte[] A06;
    public static String[] A07 = {"pM08nT1ncmNJ", "g85", "nscQf0o4Li7UcF904CUq0pnhLdimh0nx", "F8VXv1qVoFp68OVo6WPqVPomjNx", "ZQ8cSAnJS", "Qhc2B", "YeRFTalD9", "SLGuxMrf5R7JWBKvcRLC7wUDDVq2YQ4u"};
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;

    @Nullable
    public final I0<? super VC> A05;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 54);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{107, 98, 44, 35, 41, 63, 34, 36, 41, 18, 44, 62, 62, 40, 57, 98};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.AssetDataSource> */
    public VC(Context context, @Nullable I0<? super VC> i0) {
        this.A04 = context.getAssets();
        this.A05 = i0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final Uri A7k() {
        return this.A01;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x008e A[Catch: IOException -> 0x00b9, TRY_ENTER, TryCatch #0 {IOException -> 0x00b9, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0020, B:15:0x0064, B:24:0x0093, B:26:0x00a5, B:23:0x008e, B:32:0x00b3, B:33:0x00b8, B:6:0x0033, B:8:0x0041), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0093 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0020, B:15:0x0064, B:24:0x0093, B:26:0x00a5, B:23:0x008e, B:32:0x00b3, B:33:0x00b8, B:6:0x0033, B:8:0x0041), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5 A[Catch: IOException -> 0x00b9, TRY_LEAVE, TryCatch #0 {IOException -> 0x00b9, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0020, B:15:0x0064, B:24:0x0093, B:26:0x00a5, B:23:0x008e, B:32:0x00b3, B:33:0x00b8, B:6:0x0033, B:8:0x0041), top: B:37:0x0000 }] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final long ACw(C0654Hi c0654Hi) throws HX {
        try {
            this.A01 = c0654Hi.A04;
            String path = this.A01.getPath();
            if (path.startsWith(A00(1, 15, 123))) {
                path = path.substring(15);
            } else if (path.startsWith(A00(0, 1, 114))) {
                path = path.substring(1);
            }
            this.A02 = this.A04.open(path, 1);
            long jSkip = this.A02.skip(c0654Hi.A03);
            long skipped = c0654Hi.A03;
            if (A07[0].length() != 12) {
                throw new RuntimeException();
            }
            A07[7] = "V0B6GAr2PKDbDxhNZksh7AEMCKFKekNi";
            if (jSkip >= skipped) {
                long skipped2 = c0654Hi.A02;
                if (A07[1].length() != 3) {
                    String[] strArr = A07;
                    strArr[2] = "LLeOWo0qfJ5aEilGNMg5Y9nqgC8u5H4z";
                    strArr[3] = "bhHcjvupHtwrsEsZMKxHQW2SejO";
                    if (skipped2 != -1) {
                        long skipped3 = c0654Hi.A02;
                        this.A00 = skipped3;
                    } else {
                        long skipped4 = this.A02.available();
                        this.A00 = skipped4;
                        if (this.A00 == 2147483647L) {
                            this.A00 = -1L;
                        }
                    }
                } else {
                    A07[7] = "z68meBkT3TqiKmw4pf8g7Y6845REpoZL";
                    if (skipped2 != -1) {
                        long skipped5 = c0654Hi.A02;
                        this.A00 = skipped5;
                    } else {
                        long skipped6 = this.A02.available();
                        this.A00 = skipped6;
                        if (this.A00 == 2147483647L) {
                            this.A00 = -1L;
                        }
                    }
                }
                this.A03 = true;
                I0<? super VC> i0 = this.A05;
                if (i0 != null) {
                    i0.ACb(this, c0654Hi);
                }
                return this.A00;
            }
            throw new EOFException();
        } catch (IOException e) {
            throw new HX(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final void close() throws HX {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
                this.A02 = null;
                if (this.A03) {
                    this.A03 = false;
                    I0<? super VC> i0 = this.A05;
                    if (i0 != null) {
                        i0.ACa(this);
                    }
                }
            } catch (IOException e) {
                throw new HX(e);
            }
        } catch (Throwable th) {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                I0<? super VC> i1 = this.A05;
                if (i1 != null) {
                    i1.ACa(this);
                }
            }
            throw th;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final int read(byte[] bArr, int i, int i2) throws HX {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new HX(e);
            }
        }
        int i3 = this.A02.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new HX(new EOFException());
        }
        long j2 = this.A00;
        if (j2 != -1) {
            this.A00 = j2 - ((long) i3);
        }
        I0<? super VC> i0 = this.A05;
        if (i0 != null) {
            i0.AAG(this, i3);
        }
        return i3;
    }
}
