package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0996Uu implements InterfaceC0650He {
    public static byte[] A07;
    public static String[] A08 = {"bSKnstrcEyUtH2EUzSuh7p", "TJp7broMG9ALkddxCeG8bg", "OUGN6fd13DTUK57USEtQiA6N8BMR4vG7", "MPCQ8AeafYWdEx3u0S1dfC5VpPwXU5er", "I2tJ7ud2NszgocKkHkmClXbQ6vlHE0Sp", "WRhnMtRu3VoUyGpCORxDhLZcb6GbN7Pt", "ionJv1BxfCrQS8AxzLJ8Tcnsr6gm7Nx1", "YblFDiTYESfr8ZIRtB8BAyjauKLHc0qm"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;

    @Nullable
    public final I0<? super C0996Uu> A06;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 108);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{70, 113, 103, 123, 97, 102, 119, 113, 52, 125, 112, 113, 122, 96, 125, 114, 125, 113, 102, 52, 121, 97, 103, 96, 52, 118, 113, 52, 117, 122, 52, 125, 122, 96, 113, 115, 113, 102, 58, 7, 0, 27, 114, 63, 39, 33, 38, 114, 39, 33, 55, 114, 33, 49, 58, 55, 63, 55, 114, 32, 51, 37, 32, 55, 33, 61, 39, 32, 49, 55, 117, 102, 112, 117, 98, 116, 104, 114, 117, 100, 98};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I0 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.RawResourceDataSource> */
    public C0996Uu(Context context, @Nullable I0<? super C0996Uu> i0) {
        this.A05 = context.getResources();
        this.A06 = i0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final Uri A7k() {
        return this.A02;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0099 A[Catch: IOException -> 0x0105, TRY_ENTER, TryCatch #1 {IOException -> 0x0105, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0024, B:12:0x0071, B:21:0x009e, B:23:0x00a8, B:24:0x00ab, B:20:0x0099, B:34:0x00e0, B:35:0x00e5, B:38:0x00f5, B:39:0x0104, B:36:0x00e6, B:37:0x00f4), top: B:45:0x0000, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x009e A[Catch: IOException -> 0x0105, TryCatch #1 {IOException -> 0x0105, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0024, B:12:0x0071, B:21:0x009e, B:23:0x00a8, B:24:0x00ab, B:20:0x0099, B:34:0x00e0, B:35:0x00e5, B:38:0x00f5, B:39:0x0104, B:36:0x00e6, B:37:0x00f4), top: B:45:0x0000, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00ab A[Catch: IOException -> 0x0105, TRY_LEAVE, TryCatch #1 {IOException -> 0x0105, blocks: (B:2:0x0000, B:4:0x001a, B:5:0x0024, B:12:0x0071, B:21:0x009e, B:23:0x00a8, B:24:0x00ab, B:20:0x0099, B:34:0x00e0, B:35:0x00e5, B:38:0x00f5, B:39:0x0104, B:36:0x00e6, B:37:0x00f4), top: B:45:0x0000, inners: #0 }] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final long ACw(C0654Hi c0654Hi) throws C0669Hz {
        try {
            this.A02 = c0654Hi.A04;
            if (TextUtils.equals(A00(70, 11, 107), this.A02.getScheme())) {
                try {
                    this.A01 = this.A05.openRawResourceFd(Integer.parseInt(this.A02.getLastPathSegment()));
                    this.A03 = new FileInputStream(this.A01.getFileDescriptor());
                    this.A03.skip(this.A01.getStartOffset());
                    long jSkip = this.A03.skip(c0654Hi.A03);
                    long j = c0654Hi.A03;
                    String[] strArr = A08;
                    if (strArr[2].length() != strArr[3].length()) {
                        throw new RuntimeException();
                    }
                    A08[6] = "iO76s31fXqFvOM0OYTRIEsGTJvkob6S9";
                    if (jSkip >= j) {
                        long j2 = c0654Hi.A02;
                        String[] strArr2 = A08;
                        if (strArr2[7].charAt(29) == strArr2[4].charAt(29)) {
                            A08[6] = "iYapuwNl9CT51kyy49oka54a80smISGR";
                            if (j2 != -1) {
                                this.A00 = c0654Hi.A02;
                            } else {
                                long assetFileDescriptorLength = this.A01.getLength();
                                this.A00 = assetFileDescriptorLength != -1 ? assetFileDescriptorLength - c0654Hi.A03 : -1L;
                            }
                        } else if (j2 != -1) {
                            this.A00 = c0654Hi.A02;
                        } else {
                            long assetFileDescriptorLength2 = this.A01.getLength();
                            this.A00 = assetFileDescriptorLength2 != -1 ? assetFileDescriptorLength2 - c0654Hi.A03 : -1L;
                        }
                        this.A04 = true;
                        I0<? super C0996Uu> i0 = this.A06;
                        if (i0 != null) {
                            i0.ACb(this, c0654Hi);
                        }
                        long j3 = this.A00;
                        if (A08[5].charAt(8) == '3') {
                            A08[6] = "iRGOweuny9HsI73YGVQjG7u65oKi1WBQ";
                            return j3;
                        }
                        String[] strArr3 = A08;
                        strArr3[2] = "n5p9WsPQY6g4RIkYg3MxwUQx7y8GGMEo";
                        strArr3[3] = "FE0x6EHBGO2WzlvUTu5UgpGPG3v39OZa";
                        return j3;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new C0669Hz(A00(0, 39, 120));
                }
            }
            throw new C0669Hz(A00(39, 31, 62));
        } catch (IOException e) {
            throw new C0669Hz(e);
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x002f */
    /* JADX WARN: Bottom block not found for handler: all -> 0x006a */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws com.facebook.ads.redexgen.X.C0669Hz {
        /*
            r4 = this;
            r3 = 0
            r4.A02 = r3
            r2 = 0
            java.io.InputStream r0 = r4.A03     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L47
            if (r0 == 0) goto Ld
            java.io.InputStream r0 = r4.A03     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L47
            r0.close()     // Catch: java.io.IOException -> L40 java.lang.Throwable -> L47
        Ld:
            r4.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L2f
            if (r0 == 0) goto L18
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L2f
            r0.close()     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L2f
        L18:
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L27
            r4.A04 = r2
            com.facebook.ads.redexgen.X.I0<? super com.facebook.ads.redexgen.X.Uu> r0 = r4.A06
            if (r0 == 0) goto L27
            r0.ACa(r4)
        L27:
            return
        L28:
            r1 = move-exception
            com.facebook.ads.redexgen.X.Hz r0 = new com.facebook.ads.redexgen.X.Hz     // Catch: java.lang.Throwable -> L2f
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            throw r0     // Catch: java.lang.Throwable -> L2f
        L2f:
            r1 = move-exception
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L3f
            r4.A04 = r2
            com.facebook.ads.redexgen.X.I0<? super com.facebook.ads.redexgen.X.Uu> r0 = r4.A06
            if (r0 == 0) goto L3f
            r0.ACa(r4)
        L3f:
            throw r1
        L40:
            r1 = move-exception
            com.facebook.ads.redexgen.X.Hz r0 = new com.facebook.ads.redexgen.X.Hz     // Catch: java.lang.Throwable -> L47
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L47
            throw r0     // Catch: java.lang.Throwable -> L47
        L47:
            r1 = move-exception
            r4.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L6a
            if (r0 == 0) goto L53
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L6a
            r0.close()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L6a
        L53:
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L62
            r4.A04 = r2
            com.facebook.ads.redexgen.X.I0<? super com.facebook.ads.redexgen.X.Uu> r0 = r4.A06
            if (r0 == 0) goto L62
            r0.ACa(r4)
        L62:
            throw r1
        L63:
            r1 = move-exception
            com.facebook.ads.redexgen.X.Hz r0 = new com.facebook.ads.redexgen.X.Hz     // Catch: java.lang.Throwable -> L6a
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L6a
            throw r0     // Catch: java.lang.Throwable -> L6a
        L6a:
            r1 = move-exception
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L7a
            r4.A04 = r2
            com.facebook.ads.redexgen.X.I0<? super com.facebook.ads.redexgen.X.Uu> r0 = r4.A06
            if (r0 == 0) goto L7a
            r0.ACa(r4)
        L7a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0996Uu.close():void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final int read(byte[] bArr, int i, int i2) throws C0669Hz {
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
                throw new C0669Hz(e);
            }
        }
        int i3 = this.A03.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C0669Hz(new EOFException());
        }
        long j2 = this.A00;
        if (j2 != -1) {
            this.A00 = j2 - ((long) i3);
        }
        I0<? super C0996Uu> i0 = this.A06;
        if (i0 != null) {
            i0.AAG(this, i3);
        }
        return i3;
    }
}
