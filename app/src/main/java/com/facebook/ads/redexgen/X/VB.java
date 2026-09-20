package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class VB implements InterfaceC0650He {
    public static byte[] A07;
    public static String[] A08 = {"XY5JZk6rXZ0NPH7SICFbrzLAUaQN4bdH", "HnCNMjQ424yFS", "kyBc0", "GnRsDPDWJf0qkzwG5UAakx0LVXBsKD8t", "8DLCIs9NQKYqN", "T4UYq1MMo7qynT2Sse3Gz88uK5Ayy8ub", "yyLccmqAJUyLoqB1F9xK1icYlgZtX35P", "UgvPXgEXHuOjKzkqR3R9kUCYtrFgRRdg"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;

    @Nullable
    public final I0<? super VB> A06;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-38, 6, 12, 3, -5, -73, 5, 6, 11, -73, 6, 7, -4, 5, -73, -3, 0, 3, -4, -73, -5, -4, 10, -6, 9, 0, 7, 11, 6, 9, -73, -3, 6, 9, -47, -73, -14};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.ContentDataSource> */
    public VB(Context context, @Nullable I0<? super VB> i0) {
        this.A05 = context.getContentResolver();
        this.A06 = i0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final Uri A7k() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final long ACw(C0654Hi c0654Hi) throws C0646Ha {
        try {
            this.A02 = c0654Hi.A04;
            this.A01 = this.A05.openAssetFileDescriptor(this.A02, A00(36, 1, 12));
            if (this.A01 != null) {
                this.A03 = new FileInputStream(this.A01.getFileDescriptor());
                long startOffset = this.A01.getStartOffset();
                long jSkip = this.A03.skip(c0654Hi.A03 + startOffset) - startOffset;
                long skipped = c0654Hi.A03;
                String[] strArr = A08;
                if (strArr[1].length() != strArr[4].length()) {
                    throw new RuntimeException();
                }
                A08[2] = "hKUpJ";
                if (jSkip == skipped) {
                    long assetFileDescriptorLength = -1;
                    if (c0654Hi.A02 != -1) {
                        long skipped2 = c0654Hi.A02;
                        this.A00 = skipped2;
                    } else {
                        long length = this.A01.getLength();
                        if (length == -1) {
                            FileChannel channel = this.A03.getChannel();
                            long size = channel.size();
                            if (size != 0) {
                                long channelSize = channel.position();
                                assetFileDescriptorLength = size - channelSize;
                            }
                            this.A00 = assetFileDescriptorLength;
                        } else {
                            this.A00 = length - jSkip;
                        }
                    }
                    this.A04 = true;
                    I0<? super VB> i0 = this.A06;
                    if (i0 != null) {
                        i0.ACb(this, c0654Hi);
                    }
                    return this.A00;
                }
                throw new EOFException();
            }
            throw new FileNotFoundException(A00(0, 36, 35) + this.A02);
        } catch (IOException e) {
            throw new C0646Ha(e);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x002f */
    /* JADX WARN: Bottom block not found for handler: all -> 0x008a */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws com.facebook.ads.redexgen.X.C0646Ha {
        /*
            r6 = this;
            r5 = 0
            r6.A02 = r5
            r4 = 0
            java.io.FileInputStream r0 = r6.A03     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L47
            if (r0 == 0) goto Ld
            java.io.FileInputStream r0 = r6.A03     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L47
            r0.close()     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L47
        Ld:
            r6.A03 = r5
            android.content.res.AssetFileDescriptor r0 = r6.A01     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L2f
            if (r0 == 0) goto L18
            android.content.res.AssetFileDescriptor r0 = r6.A01     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L2f
            r0.close()     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L2f
        L18:
            r6.A01 = r5
            boolean r0 = r6.A04
            if (r0 == 0) goto L27
            r6.A04 = r4
            com.facebook.ads.redexgen.X.I0<? super com.facebook.ads.redexgen.X.VB> r0 = r6.A06
            if (r0 == 0) goto L27
            r0.ACa(r6)
        L27:
            return
        L28:
            r1 = move-exception
            com.facebook.ads.redexgen.X.Ha r0 = new com.facebook.ads.redexgen.X.Ha     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            throw r0     // Catch: java.lang.Throwable -> L2f
        L2f:
            r1 = move-exception
            r6.A01 = r5
            boolean r0 = r6.A04
            if (r0 == 0) goto L3f
            r6.A04 = r4
            com.facebook.ads.redexgen.X.I0<? super com.facebook.ads.redexgen.X.VB> r0 = r6.A06
            if (r0 == 0) goto L3f
            r0.ACa(r6)
        L3f:
            throw r1
        L40:
            r1 = move-exception
            com.facebook.ads.redexgen.X.Ha r0 = new com.facebook.ads.redexgen.X.Ha     // Catch: java.lang.Throwable -> L47
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L47
            throw r0     // Catch: java.lang.Throwable -> L47
        L47:
            r3 = move-exception
            r6.A03 = r5
            android.content.res.AssetFileDescriptor r0 = r6.A01     // Catch: java.io.IOException -> L83 java.lang.Throwable -> L8a
            if (r0 == 0) goto L53
            android.content.res.AssetFileDescriptor r0 = r6.A01     // Catch: java.io.IOException -> L83 java.lang.Throwable -> L8a
            r0.close()     // Catch: java.io.IOException -> L83 java.lang.Throwable -> L8a
        L53:
            r6.A01 = r5
            boolean r0 = r6.A04
            if (r0 == 0) goto L82
            r6.A04 = r4
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VB.A08
            r0 = 6
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 21
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L97
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VB.A08
            java.lang.String r1 = "49IvJFCSRSvhrewf7IAXf1OPFzRU50IL"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "4e2AtDz0XDbCK0xcLVm9895RacU2kPwa"
            r0 = 0
            r2[r0] = r1
            com.facebook.ads.redexgen.X.I0<? super com.facebook.ads.redexgen.X.VB> r0 = r6.A06
            if (r0 == 0) goto L82
            r0.ACa(r6)
        L82:
            throw r3
        L83:
            r1 = move-exception
            com.facebook.ads.redexgen.X.Ha r0 = new com.facebook.ads.redexgen.X.Ha     // Catch: java.lang.Throwable -> L8a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L8a
            throw r0     // Catch: java.lang.Throwable -> L8a
        L8a:
            r3 = move-exception
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.VB.A08
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 5
            if (r1 == r0) goto L9d
        L97:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L9d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VB.A08
            java.lang.String r1 = "kTWz6VteXXEhzWgbUko802OKji9Q57bF"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "6Ww6RN6r5MWdHFclCOICUvV4AoOZijgl"
            r0 = 3
            r2[r0] = r1
            r6.A01 = r5
            boolean r0 = r6.A04
            if (r0 == 0) goto Lb8
            r6.A04 = r4
            com.facebook.ads.redexgen.X.I0<? super com.facebook.ads.redexgen.X.VB> r0 = r6.A06
            if (r0 == 0) goto Lb8
            r0.ACa(r6)
        Lb8:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VB.close():void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final int read(byte[] bArr, int i, int i2) throws C0646Ha {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (A08[7].charAt(11) != 'j') {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[1] = "ibErvL6ImcJTe";
        strArr[4] = "i4reTFCBluewh";
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0646Ha(e);
            }
        }
        int i3 = this.A03.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C0646Ha(new EOFException());
        }
        long j2 = this.A00;
        if (j2 != -1) {
            this.A00 = j2 - ((long) i3);
        }
        I0<? super VB> i0 = this.A06;
        if (i0 != null) {
            i0.AAG(this, i3);
        }
        return i3;
    }
}
