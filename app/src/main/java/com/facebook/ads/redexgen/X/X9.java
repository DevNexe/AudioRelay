package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class X9 implements BY {
    public static boolean A0p;
    public static boolean A0q;
    public static byte[] A0r;
    public static String[] A0s = {"5Nyv0guRYVcKSAuezGPcUxg9vJAOBGI4", "vvUbbcGamjazB6O7sNKlV2Due1EGN4h1", "bCdq7Y65nqLa7O1PpyZ9UmfFfim1tIKH", "XSMaSGyqY735xp0uf5mX1ioiT5AfU73", "LbuXdG3g6wlkS0wgubrQcd1EFcxL1vaW", "BfdFnDj7fdcaZnnCNK5XWBslzsEwyMTC", "82TROEAjyC6M053XP3PwF3IgkAnZSWb8", "TH4S9e3rxD8emXavfeipeAwkF3kWLOvQ"};
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public AudioTrack A0M;

    @Nullable
    public AudioTrack A0N;

    @Nullable
    public C0490Ah A0O;
    public C0490Ah A0P;
    public BD A0Q;

    @Nullable
    public BW A0R;

    @Nullable
    public ByteBuffer A0S;

    @Nullable
    public ByteBuffer A0T;

    @Nullable
    public ByteBuffer A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public byte[] A0c;
    public BL[] A0d;
    public ByteBuffer[] A0e;
    public final ConditionVariable A0f;

    @Nullable
    public final BE A0g;
    public final C0512Be A0h;
    public final XC A0i;
    public final InterfaceC0515Bh A0j;
    public final X3 A0k;
    public final ArrayDeque<C0517Bj> A0l;
    public final boolean A0m;
    public final BL[] A0n;
    public final BL[] A0o;

    public static String A0I(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0r, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 75);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0O() {
        A0r = new byte[]{68, 72, 15, 7, 28, 72, 94, 106, 123, 118, 112, 75, 109, 126, 124, 116, 78, 99, 121, 105, 101, 100, 126, 99, 100, 127, 99, 126, 115, 42, 110, 111, 126, 111, 105, 126, 111, 110, 42, 81, 111, 114, 122, 111, 105, 126, 111, 110, 42, 14, 22, 9, 4, 9, 1, 8, 63, 41, 63, 46, 46, 51, 52, 61, 122, 41, 46, 59, 54, 54, 63, 62, 122, 59, 47, 62, 51, 53, 122, 46, 40, 59, 57, 49, 102, 93, 86, 75, 67, 86, 80, 71, 86, 87, 19, 82, 70, 87, 90, 92, 19, 86, 93, 80, 92, 87, 90, 93, 84, 9, 19, 96, 91, 70, 64, 69, 69, 90, 71, 65, 80, 81, 21, 86, 93, 84, 91, 91, 80, 89, 21, 86, 90, 64, 91, 65, 15, 21, 101, 10, 3, 31, 24, 9, 30, 59, 40, 58, 40};
    }

    static {
        A0O();
        A0p = false;
        A0q = false;
    }

    public X9(@Nullable BE be, InterfaceC0515Bh interfaceC0515Bh, boolean z) {
        this.A0g = be;
        this.A0j = (InterfaceC0515Bh) IK.A01(interfaceC0515Bh);
        this.A0m = z;
        this.A0f = new ConditionVariable(true);
        this.A0h = new C0512Be(new XA(this, null));
        this.A0i = new XC();
        this.A0k = new X3();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new X6(), this.A0i, this.A0k);
        Collections.addAll(arrayList, interfaceC0515Bh.A5l());
        this.A0o = (BL[]) arrayList.toArray(new BL[arrayList.size()]);
        this.A0n = new BL[]{new X8()};
        this.A00 = 1.0f;
        this.A0D = 0;
        this.A0Q = BD.A04;
        this.A01 = 0;
        this.A0P = C0490Ah.A04;
        this.A04 = -1;
        this.A0d = new BL[0];
        this.A0e = new ByteBuffer[0];
        this.A0l = new ArrayDeque<>();
    }

    public X9(@Nullable BE be, BL[] blArr) {
        this(be, blArr, false);
    }

    public X9(@Nullable BE be, BL[] blArr, boolean z) {
        this(be, new XB(blArr), z);
    }

    public static int A00(int i, ByteBuffer byteBuffer) {
        if (i == 7 || i == 8) {
            return C0519Bl.A00(byteBuffer);
        }
        if (i == 5) {
            return BA.A00();
        }
        if (i == 6) {
            return BA.A03(byteBuffer);
        }
        if (i == 14) {
            int iA02 = BA.A02(byteBuffer);
            if (iA02 == -1) {
                return 0;
            }
            int iA04 = BA.A04(byteBuffer, iA02);
            String[] strArr = A0s;
            if (strArr[5].charAt(2) != strArr[2].charAt(2)) {
                throw new RuntimeException();
            }
            A0s[3] = "Dqt88CMr8vwwAc3fZIJcRVt2XyhD8Cl";
            return iA04 * 16;
        }
        throw new IllegalStateException(A0I(84, 27, 120) + i);
    }

    @TargetApi(21)
    public static int A01(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
        return audioTrack.write(byteBuffer, i, 1);
    }

    @TargetApi(21)
    private int A02(AudioTrack audioTrack, ByteBuffer byteBuffer, int i, long j) {
        if (this.A0S == null) {
            this.A0S = ByteBuffer.allocate(16);
            this.A0S.order(ByteOrder.BIG_ENDIAN);
            this.A0S.putInt(1431633921);
        }
        if (this.A03 == 0) {
            this.A0S.putInt(4, i);
            this.A0S.putLong(8, 1000 * j);
            this.A0S.position(0);
            this.A03 = i;
        }
        int iRemaining = this.A0S.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.A0S, iRemaining, 1);
            if (iWrite < 0) {
                this.A03 = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iA01 = A01(audioTrack, byteBuffer, i);
        String[] strArr = A0s;
        if (strArr[4].charAt(9) == strArr[1].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[5] = "EGdI4VK4aN1uiBzzsuaeFo7lQ03tB7Gh";
        strArr2[2] = "vodoofn0TiYpLi76FRuwTlDh379TFVaK";
        if (iA01 < 0) {
            this.A03 = 0;
            return iA01;
        }
        this.A03 -= iA01;
        return iA01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A03() {
        return this.A0X ? this.A0J / ((long) this.A0B) : this.A0I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long A04() {
        return this.A0X ? this.A0L / ((long) this.A09) : this.A0K;
    }

    private long A05(long j) {
        return A08(this.A0j.A7V()) + j;
    }

    private long A06(long j) {
        C0517Bj c0517BjRemove = null;
        while (!this.A0l.isEmpty() && j >= this.A0l.getFirst().A01) {
            c0517BjRemove = this.A0l.remove();
        }
        if (c0517BjRemove != null) {
            this.A0P = c0517BjRemove.A02;
            this.A0G = c0517BjRemove.A01;
            this.A0F = c0517BjRemove.A00 - this.A0H;
        }
        if (this.A0P.A01 == 1.0f) {
            return (this.A0F + j) - this.A0G;
        }
        if (this.A0l.isEmpty()) {
            return this.A0F + this.A0j.A6y(j - this.A0G);
        }
        return this.A0F + C0695Iz.A0C(j - this.A0G, this.A0P.A01);
    }

    private long A07(long j) {
        return (((long) this.A0A) * j) / 1000000;
    }

    private long A08(long j) {
        return (1000000 * j) / ((long) this.A0A);
    }

    private long A09(long j) {
        return (1000000 * j) / ((long) this.A06);
    }

    @TargetApi(21)
    private AudioTrack A0D() {
        AudioAttributes audioAttributesA00;
        if (this.A0b) {
            audioAttributesA00 = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        } else {
            audioAttributesA00 = this.A0Q.A00();
        }
        AudioFormat audioFormatBuild = new AudioFormat.Builder().setChannelMask(this.A07).setEncoding(this.A08).setSampleRate(this.A0A).build();
        int i = this.A01;
        if (i == 0) {
            i = 0;
        }
        return new AudioTrack(audioAttributesA00, audioFormatBuild, this.A02, 1, i);
    }

    private AudioTrack A0E() throws BV {
        AudioTrack audioTrack;
        if (C0695Iz.A02 >= 21) {
            audioTrack = A0D();
        } else {
            int iA03 = C0695Iz.A03(this.A0Q.A03);
            int i = this.A01;
            String[] strArr = A0s;
            String str = strArr[4];
            String str2 = strArr[1];
            int state = str.charAt(9);
            if (state == str2.charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[4] = "uEqtixTroQ47jvhgXsjygxp317gkhCVZ";
            strArr2[1] = "MeWTB72qJhBmjPGmSmxXQDSK14yx53vJ";
            if (i == 0) {
                audioTrack = new AudioTrack(iA03, this.A0A, this.A07, this.A08, this.A02, 1);
            } else {
                audioTrack = new AudioTrack(iA03, this.A0A, this.A07, this.A08, this.A02, 1, i);
            }
        }
        int state2 = audioTrack.getState();
        if (state2 == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new BV(state2, this.A0A, this.A07, this.A02);
    }

    private AudioTrack A0F(int i) {
        return new AudioTrack(3, 4000, 4, 2, 2, 0, i);
    }

    private void A0J() {
        int i = 0;
        while (true) {
            BL[] blArr = this.A0d;
            if (i < blArr.length) {
                BL bl = blArr[i];
                bl.flush();
                this.A0e[i] = bl.A73();
                i++;
            } else {
                return;
            }
        }
    }

    private void A0K() throws BV {
        C0490Ah c0490AhA3Q;
        this.A0f.block();
        this.A0M = A0E();
        int audioSessionId = this.A0M.getAudioSessionId();
        if (A0p && C0695Iz.A02 < 21) {
            AudioTrack audioTrack = this.A0N;
            if (audioTrack != null) {
                int audioSessionId2 = audioTrack.getAudioSessionId();
                String[] strArr = A0s;
                if (strArr[4].charAt(9) == strArr[1].charAt(9)) {
                    throw new RuntimeException();
                }
                A0s[7] = "BXErtyYgJXamt9yde7CeLqS26Q9j6Dt3";
                if (audioSessionId != audioSessionId2) {
                    A0L();
                }
            }
            if (this.A0N == null) {
                this.A0N = A0F(audioSessionId);
            }
        }
        if (this.A01 != audioSessionId) {
            this.A01 = audioSessionId;
            BW bw = this.A0R;
            if (bw != null) {
                bw.AA8(audioSessionId);
            }
        }
        if (this.A0V) {
            c0490AhA3Q = this.A0j.A3Q(this.A0P);
        } else {
            c0490AhA3Q = C0490Ah.A04;
        }
        this.A0P = c0490AhA3Q;
        A0N();
        this.A0h.A0G(this.A0M, this.A08, this.A09, this.A02);
        A0M();
    }

    private void A0L() {
        if (this.A0N == null) {
            return;
        }
        AudioTrack audioTrack = this.A0N;
        this.A0N = null;
        new C0514Bg(this, audioTrack).start();
    }

    private void A0M() {
        if (!A0U()) {
            return;
        }
        if (C0695Iz.A02 >= 21) {
            AudioTrack audioTrack = this.A0M;
            float f = this.A00;
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            A0s[7] = "8NL9PZoDB9Ch1WQJQaXfXaVAIVHPoweZ";
            A0Q(audioTrack, f);
            return;
        }
        A0R(this.A0M, this.A00);
    }

    private void A0N() {
        ArrayList arrayList = new ArrayList();
        for (BL bl : A0V()) {
            if (bl.A8N()) {
                arrayList.add(bl);
            } else {
                bl.flush();
            }
        }
        int size = arrayList.size();
        BL[] blArr = new BL[size];
        if (A0s[3].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0s;
        strArr[5] = "YRdEguSYP1wOqJMzR8T0sEbN9ru3F1GF";
        strArr[2] = "jCd7Ib2fALhdhS4xedSLoMHgXMVbMQ2Z";
        this.A0d = (BL[]) arrayList.toArray(blArr);
        this.A0e = new ByteBuffer[size];
        A0J();
    }

    private void A0P(long j) throws BX {
        ByteBuffer input;
        int length = this.A0d.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                input = this.A0e[i - 1];
            } else {
                input = this.A0T;
                if (input == null) {
                    input = BL.A00;
                }
            }
            if (i == length) {
                A0S(input, j);
            } else {
                BL audioProcessor = this.A0d[i];
                audioProcessor.ADV(input);
                ByteBuffer byteBufferA73 = audioProcessor.A73();
                this.A0e[i] = byteBufferA73;
                if (byteBufferA73.hasRemaining()) {
                    i++;
                }
            }
            if (input.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    @TargetApi(21)
    public static void A0Q(AudioTrack audioTrack, float f) {
        audioTrack.setVolume(f);
    }

    public static void A0R(AudioTrack audioTrack, float f) {
        audioTrack.setStereoVolume(f, f);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c6  */
    private void A0S(ByteBuffer byteBuffer, long j) throws BX {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        ByteBuffer byteBuffer2 = this.A0U;
        if (byteBuffer2 != null) {
            IK.A03(byteBuffer2 == byteBuffer);
        } else {
            this.A0U = byteBuffer;
            int bytesWritten = C0695Iz.A02;
            if (bytesWritten < 21) {
                int iRemaining = byteBuffer.remaining();
                byte[] bArr = this.A0c;
                if (bArr != null) {
                    int bytesWritten2 = bArr.length;
                    if (bytesWritten2 < iRemaining) {
                        this.A0c = new byte[iRemaining];
                    }
                } else {
                    this.A0c = new byte[iRemaining];
                }
                int iPosition = byteBuffer.position();
                byteBuffer.get(this.A0c, 0, iRemaining);
                byteBuffer.position(iPosition);
                this.A0C = 0;
            }
        }
        int iRemaining2 = byteBuffer.remaining();
        int iA01 = 0;
        int bytesWritten3 = C0695Iz.A02;
        if (bytesWritten3 < 21) {
            int bytesWritten4 = this.A0h.A0B(this.A0L);
            if (bytesWritten4 > 0) {
                int iMin = Math.min(iRemaining2, bytesWritten4);
                AudioTrack audioTrack = this.A0M;
                byte[] bArr2 = this.A0c;
                int bytesWritten5 = this.A0C;
                iA01 = audioTrack.write(bArr2, bytesWritten5, iMin);
                if (iA01 > 0) {
                    int bytesWritten6 = this.A0C;
                    this.A0C = bytesWritten6 + iA01;
                    int bytesWritten7 = byteBuffer.position();
                    byteBuffer.position(bytesWritten7 + iA01);
                }
            }
        } else if (!this.A0b) {
            iA01 = A01(this.A0M, byteBuffer, iRemaining2);
        } else {
            IK.A04(j != -9223372036854775807L);
            String[] strArr = A0s;
            String str = strArr[6];
            String str2 = strArr[0];
            int iCharAt = str.charAt(18);
            int bytesWritten8 = str2.charAt(18);
            if (iCharAt != bytesWritten8) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[6] = "uc8dsziOyfZDdpAIC1PVCulQ3xFiNwSU";
            strArr2[0] = "f1kQp84DxGThwffoyoPMW5CjH544FPQd";
            iA01 = A02(this.A0M, byteBuffer, iRemaining2, j);
        }
        this.A0E = SystemClock.elapsedRealtime();
        if (iA01 >= 0) {
            if (this.A0X) {
                this.A0L += (long) iA01;
            }
            if (iA01 == iRemaining2) {
                if (!this.A0X) {
                    long j2 = this.A0K;
                    int bytesWritten9 = this.A05;
                    this.A0K = j2 + ((long) bytesWritten9);
                }
                this.A0U = null;
                return;
            }
            return;
        }
        throw new BX(iA01);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076 A[RETURN] */
    private boolean A0T() throws BX {
        boolean z = false;
        if (this.A04 == -1) {
            this.A04 = this.A0Z ? 0 : this.A0d.length;
            z = true;
        }
        while (true) {
            int i = this.A04;
            BL[] blArr = this.A0d;
            if (i < blArr.length) {
                BL bl = blArr[i];
                if (z) {
                    bl.ADU();
                }
                A0P(-9223372036854775807L);
                boolean zA8R = bl.A8R();
                String[] strArr = A0s;
                if (strArr[4].charAt(9) == strArr[1].charAt(9)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0s;
                strArr2[4] = "2xZTToEoCwsl8MeSQ9EIUdCBiuq4j6Lb";
                strArr2[1] = "WXli42TSAlQlgSv7suJf6xw7W0hHNYE8";
                if (!zA8R) {
                    return false;
                }
                z = true;
                this.A04++;
            } else {
                ByteBuffer byteBuffer = this.A0U;
                if (A0s[3].length() == 31) {
                    String[] strArr3 = A0s;
                    strArr3[5] = "9QdkqYSTFHb7WYiPiRp7Y6nS2TP2i0It";
                    strArr3[2] = "gIdgEUZyaZheDXAdPlxJ5YfvFSsVsGnk";
                    if (byteBuffer != null) {
                        A0S(byteBuffer, -9223372036854775807L);
                        if (this.A0U != null) {
                            return false;
                        }
                    }
                } else if (byteBuffer != null) {
                    A0S(byteBuffer, -9223372036854775807L);
                    if (this.A0U != null) {
                        return false;
                    }
                }
                this.A04 = -1;
                return true;
            }
        }
    }

    private boolean A0U() {
        return this.A0M != null;
    }

    private BL[] A0V() {
        if (this.A0a) {
            return this.A0n;
        }
        return this.A0o;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1 A[PHI: r5
  0x00f1: PHI (r5v2 int) = (r5v0 int), (r5v3 int) binds: [B:76:0x0163, B:53:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0102  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:0x0153  */
    /* JADX WARN: Code duplicated, block: B:78:0x0166  */
    @Override // com.facebook.ads.redexgen.X.BY
    public final void A46(int i, int sampleRate, int i2, int i3, @Nullable int[] iArr, int sampleRate2, int encoding) throws BU {
        boolean z;
        int i4;
        int i5;
        boolean flush;
        int iA05;
        boolean zA47 = false;
        this.A06 = i2;
        this.A0X = C0695Iz.A0c(i);
        if (this.A0m && A8Q(1073741824)) {
            boolean zA0b = C0695Iz.A0b(i);
            String[] strArr = A0s;
            if (strArr[4].charAt(9) == strArr[1].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0s;
            strArr2[6] = "pSgUMuqclJtR7Wll0dPjJ2zzf2ilR1Rg";
            strArr2[0] = "HOjaWwZtZrcuosAAwRPsfae4433kR7Xp";
            if (zA0b) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.A0a = z;
        if (this.A0X) {
            this.A0B = C0695Iz.A05(i, sampleRate);
        }
        int iA75 = i;
        boolean z2 = this.A0X && i != 4;
        this.A0V = z2 && !this.A0a;
        if (z2) {
            this.A0k.A00(sampleRate2, encoding);
            this.A0i.A00(iArr);
            for (BL bl : A0V()) {
                try {
                    zA47 |= bl.A47(i2, sampleRate, iA75);
                    if (bl.A8N()) {
                        sampleRate = bl.A74();
                        i2 = bl.A76();
                        iA75 = bl.A75();
                    }
                } catch (BK e) {
                    throw new BU(e);
                }
            }
        }
        switch (sampleRate) {
            case 1:
                i4 = 4;
                break;
            case 2:
                i4 = 12;
                break;
            case 3:
                i4 = 28;
                break;
            case 4:
                i4 = 204;
                break;
            case 5:
                i4 = 220;
                break;
            case 6:
                i4 = 252;
                break;
            case 7:
                i4 = 1276;
                break;
            case 8:
                i4 = AG.A00;
                break;
            default:
                throw new BU(A0I(111, 27, 126) + sampleRate);
        }
        int i6 = C0695Iz.A02;
        String[] strArr3 = A0s;
        String str = strArr3[6];
        String str2 = strArr3[0];
        int channelConfig = str.charAt(18);
        if (channelConfig != str2.charAt(18)) {
            i5 = 5;
            if (i6 <= 23) {
                if (A0I(139, 6, 39).equals(C0695Iz.A03)) {
                    if (A0I(49, 6, 11).equals(C0695Iz.A05)) {
                        if (sampleRate != 3 || sampleRate == i5) {
                            i4 = 252;
                        } else if (sampleRate == 7) {
                            i4 = AG.A00;
                        }
                    }
                }
            }
        } else {
            String[] strArr4 = A0s;
            strArr4[4] = "YZfXt3sXT4j271kDE0ioC9OxQaOXWjH5";
            strArr4[1] = "T3cPMba1o5OKtrwqBxp9YFX0amMUuBH0";
            i5 = 5;
            if (i6 <= 23) {
                if (A0I(139, 6, 39).equals(C0695Iz.A03)) {
                    if (A0I(49, 6, 11).equals(C0695Iz.A05)) {
                        if (sampleRate != 3) {
                            i4 = 252;
                        } else {
                            i4 = 252;
                        }
                    }
                }
            }
        }
        int channelConfig2 = C0695Iz.A02;
        if (channelConfig2 <= 25) {
            if (!A0I(145, 4, 22).equals(C0695Iz.A03) || this.A0X) {
                flush = true;
            } else {
                flush = true;
                String[] strArr5 = A0s;
                String str3 = strArr5[5];
                String str4 = strArr5[2];
                int channelConfig3 = str3.charAt(2);
                if (channelConfig3 != str4.charAt(2)) {
                    throw new RuntimeException();
                }
                String[] strArr6 = A0s;
                strArr6[6] = "lyxpn71WQn9dckKW56P9nO6T9wnpMgEk";
                strArr6[0] = "LnPBCXPfIDTyG7NKycPeENmI65ZDVhzG";
                if (sampleRate == 1) {
                    i4 = 12;
                }
            }
        } else {
            flush = true;
        }
        if (!zA47 && A0U() && this.A08 == iA75) {
            int i7 = this.A0A;
            int channelConfig4 = A0s[3].length();
            if (channelConfig4 != 31) {
                throw new RuntimeException();
            }
            A0s[7] = "QJheChQOtEbeash7G8AcHOsRzFDcTJZ5";
            if (i7 == i2 && this.A07 == i4) {
                return;
            }
        }
        reset();
        this.A0Z = z2;
        this.A0A = i2;
        this.A07 = i4;
        this.A08 = iA75;
        if (this.A0X) {
            iA05 = C0695Iz.A05(this.A08, sampleRate);
        } else {
            iA05 = -1;
        }
        this.A09 = iA05;
        if (i3 != 0) {
            this.A02 = i3;
            return;
        }
        if (this.A0X) {
            int channelCount = AudioTrack.getMinBufferSize(i2, i4, this.A08);
            if (channelCount == -2) {
                flush = false;
            }
            IK.A04(flush);
            this.A02 = C0695Iz.A06(channelCount * 4, ((int) A07(250000L)) * this.A09, (int) Math.max(channelCount, A07(750000L) * ((long) this.A09)));
            return;
        }
        int channelConfig5 = this.A08;
        if (channelConfig5 == i5 || channelConfig5 == 6) {
            this.A02 = 20480;
        } else if (channelConfig5 == 7) {
            this.A02 = 49152;
        } else {
            this.A02 = 294912;
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A4o() {
        if (this.A0b) {
            this.A0b = false;
            this.A01 = 0;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A5B(int i) {
        IK.A04(C0695Iz.A02 >= 21);
        if (!this.A0b || this.A01 != i) {
            this.A0b = true;
            this.A01 = i;
            reset();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final long A6G(boolean z) {
        if (!A0U() || this.A0D == 0) {
            return Long.MIN_VALUE;
        }
        return this.A0H + A05(A06(Math.min(this.A0h.A0C(z), A08(A04()))));
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final C0490Ah A7E() {
        return this.A0P;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x010b  */
    /* JADX WARN: Code duplicated, block: B:56:0x0119  */
    /* JADX WARN: Code duplicated, block: B:58:0x012c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x014c  */
    /* JADX WARN: Code duplicated, block: B:67:0x0163  */
    /* JADX WARN: Code duplicated, block: B:69:0x0173  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f3  */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x0173, please report this as an issue */
    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean A7v(ByteBuffer byteBuffer, long j) throws BV, BX {
        int i;
        String[] strArr;
        long jA09;
        int i2;
        BW bw;
        long jAbs;
        long j2;
        ByteBuffer byteBuffer2 = this.A0T;
        IK.A03(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (!A0U()) {
            A0K();
            if (this.A0Y) {
                ADE();
            }
        }
        if (!this.A0h.A0L(A04())) {
            return false;
        }
        ByteBuffer byteBuffer3 = this.A0T;
        String strA0I = A0I(6, 10, 84);
        if (byteBuffer3 == null) {
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.A0X && this.A05 == 0) {
                this.A05 = A00(this.A08, byteBuffer);
                if (this.A05 == 0) {
                    return true;
                }
            }
            if (this.A0O != null) {
                boolean zA0T = A0T();
                String[] strArr2 = A0s;
                if (strArr2[6].charAt(18) == strArr2[0].charAt(18)) {
                    A0s[7] = "32G65PTM58F7sQCdfpmp6BeZ89jlEc3c";
                    if (!zA0T) {
                        return false;
                    }
                    C0490Ah c0490Ah = this.A0O;
                    this.A0O = null;
                    this.A0l.add(new C0517Bj(this.A0j.A3Q(c0490Ah), Math.max(0L, j), A08(A04()), null));
                    A0N();
                    i = this.A0D;
                    strArr = A0s;
                    if (strArr[6].charAt(18) != strArr[0].charAt(18)) {
                        String[] strArr3 = A0s;
                        strArr3[5] = "fLdk8aATSmJXoquyNHeNsiC6Q5oLlXzM";
                        strArr3[2] = "ENde7HZSsZADB3fZdejE9kxAgCgEEhM2";
                        if (i == 0) {
                            this.A0H = Math.max(0L, j);
                            if (A0s[3].length() != 31) {
                                throw new RuntimeException();
                            }
                            String[] strArr4 = A0s;
                            strArr4[5] = "k8d1uoKGcn9oqEPcbfqEuDtWZEluvqcv";
                            strArr4[2] = "0FdbLpGzKjPPYkWO7EHSmW7ecHxpzOIE";
                            this.A0D = 1;
                        } else {
                            jA09 = this.A0H + A09(A03());
                            if (this.A0D == 1) {
                                jAbs = Math.abs(jA09 - j);
                                if (A0s[7].charAt(5) != 'v') {
                                    String[] strArr5 = A0s;
                                    strArr5[5] = "Mjd2F7C7kiLCVUTRblLdSlwSo04If9jH";
                                    strArr5[2] = "SFdTDB39f2uDBeT9Tbwwt5W5QdPlKJfQ";
                                    if (jAbs > 200000) {
                                        Log.e(strA0I, A0I(16, 33, 65) + jA09 + A0I(0, 6, 35) + j + A0I(138, 1, 115));
                                        this.A0D = 2;
                                    }
                                } else {
                                    A0s[7] = "vGS91cAAG7hMw0xriamqCYCKlpI1kVhb";
                                    if (jAbs > 200000) {
                                        Log.e(strA0I, A0I(16, 33, 65) + jA09 + A0I(0, 6, 35) + j + A0I(138, 1, 115));
                                        this.A0D = 2;
                                    }
                                }
                            }
                            i2 = this.A0D;
                            if (A0s[3].length() == 31) {
                                String[] strArr6 = A0s;
                                strArr6[6] = "1n9GuuRZsd3tbftYhBPGe0z5aHsix9eq";
                                strArr6[0] = "CrYGxTKVQxqkoEEYRaPu1U1mUEDoOHWT";
                                if (i2 == 2) {
                                    this.A0H += j - jA09;
                                    this.A0D = 1;
                                    bw = this.A0R;
                                    if (bw != null) {
                                        bw.ABt();
                                    }
                                }
                            }
                        }
                        if (this.A0X) {
                            this.A0J += (long) byteBuffer.remaining();
                        } else {
                            j2 = this.A0I;
                            if (A0s[7].charAt(5) != 'v') {
                                A0s[7] = "RMIgxhGSPUjaAJeGU8ndpU4l5tEpmaGN";
                                this.A0I = j2 + ((long) this.A05);
                            }
                        }
                        this.A0T = byteBuffer;
                    } else {
                        A0s[7] = "e4cnN7UP0SnjMswao4r9LHhuRWlwcAUo";
                        if (i == 0) {
                            this.A0H = Math.max(0L, j);
                            if (A0s[3].length() != 31) {
                                throw new RuntimeException();
                            }
                            String[] strArr7 = A0s;
                            strArr7[5] = "k8d1uoKGcn9oqEPcbfqEuDtWZEluvqcv";
                            strArr7[2] = "0FdbLpGzKjPPYkWO7EHSmW7ecHxpzOIE";
                            this.A0D = 1;
                        } else {
                            jA09 = this.A0H + A09(A03());
                            if (this.A0D == 1) {
                                jAbs = Math.abs(jA09 - j);
                                if (A0s[7].charAt(5) != 'v') {
                                    String[] strArr8 = A0s;
                                    strArr8[5] = "Mjd2F7C7kiLCVUTRblLdSlwSo04If9jH";
                                    strArr8[2] = "SFdTDB39f2uDBeT9Tbwwt5W5QdPlKJfQ";
                                    if (jAbs > 200000) {
                                        Log.e(strA0I, A0I(16, 33, 65) + jA09 + A0I(0, 6, 35) + j + A0I(138, 1, 115));
                                        this.A0D = 2;
                                    }
                                } else {
                                    A0s[7] = "vGS91cAAG7hMw0xriamqCYCKlpI1kVhb";
                                    if (jAbs > 200000) {
                                        Log.e(strA0I, A0I(16, 33, 65) + jA09 + A0I(0, 6, 35) + j + A0I(138, 1, 115));
                                        this.A0D = 2;
                                    }
                                }
                            }
                            i2 = this.A0D;
                            if (A0s[3].length() == 31) {
                                String[] strArr9 = A0s;
                                strArr9[6] = "1n9GuuRZsd3tbftYhBPGe0z5aHsix9eq";
                                strArr9[0] = "CrYGxTKVQxqkoEEYRaPu1U1mUEDoOHWT";
                                if (i2 == 2) {
                                    this.A0H += j - jA09;
                                    this.A0D = 1;
                                    bw = this.A0R;
                                    if (bw != null) {
                                        bw.ABt();
                                    }
                                }
                            }
                        }
                        if (this.A0X) {
                            this.A0J += (long) byteBuffer.remaining();
                        } else {
                            j2 = this.A0I;
                            if (A0s[7].charAt(5) != 'v') {
                                A0s[7] = "RMIgxhGSPUjaAJeGU8ndpU4l5tEpmaGN";
                                this.A0I = j2 + ((long) this.A05);
                            }
                        }
                        this.A0T = byteBuffer;
                    }
                }
            } else {
                i = this.A0D;
                strArr = A0s;
                if (strArr[6].charAt(18) != strArr[0].charAt(18)) {
                    String[] strArr10 = A0s;
                    strArr10[5] = "fLdk8aATSmJXoquyNHeNsiC6Q5oLlXzM";
                    strArr10[2] = "ENde7HZSsZADB3fZdejE9kxAgCgEEhM2";
                    if (i == 0) {
                        this.A0H = Math.max(0L, j);
                        if (A0s[3].length() != 31) {
                            throw new RuntimeException();
                        }
                        String[] strArr11 = A0s;
                        strArr11[5] = "k8d1uoKGcn9oqEPcbfqEuDtWZEluvqcv";
                        strArr11[2] = "0FdbLpGzKjPPYkWO7EHSmW7ecHxpzOIE";
                        this.A0D = 1;
                    } else {
                        jA09 = this.A0H + A09(A03());
                        if (this.A0D == 1) {
                            jAbs = Math.abs(jA09 - j);
                            if (A0s[7].charAt(5) != 'v') {
                                String[] strArr12 = A0s;
                                strArr12[5] = "Mjd2F7C7kiLCVUTRblLdSlwSo04If9jH";
                                strArr12[2] = "SFdTDB39f2uDBeT9Tbwwt5W5QdPlKJfQ";
                                if (jAbs > 200000) {
                                    Log.e(strA0I, A0I(16, 33, 65) + jA09 + A0I(0, 6, 35) + j + A0I(138, 1, 115));
                                    this.A0D = 2;
                                }
                            } else {
                                A0s[7] = "vGS91cAAG7hMw0xriamqCYCKlpI1kVhb";
                                if (jAbs > 200000) {
                                    Log.e(strA0I, A0I(16, 33, 65) + jA09 + A0I(0, 6, 35) + j + A0I(138, 1, 115));
                                    this.A0D = 2;
                                }
                            }
                        }
                        i2 = this.A0D;
                        if (A0s[3].length() == 31) {
                            String[] strArr13 = A0s;
                            strArr13[6] = "1n9GuuRZsd3tbftYhBPGe0z5aHsix9eq";
                            strArr13[0] = "CrYGxTKVQxqkoEEYRaPu1U1mUEDoOHWT";
                            if (i2 == 2) {
                                this.A0H += j - jA09;
                                this.A0D = 1;
                                bw = this.A0R;
                                if (bw != null) {
                                    bw.ABt();
                                }
                            }
                        }
                    }
                    if (this.A0X) {
                        this.A0J += (long) byteBuffer.remaining();
                    } else {
                        j2 = this.A0I;
                        if (A0s[7].charAt(5) != 'v') {
                            A0s[7] = "RMIgxhGSPUjaAJeGU8ndpU4l5tEpmaGN";
                            this.A0I = j2 + ((long) this.A05);
                        }
                    }
                    this.A0T = byteBuffer;
                } else {
                    A0s[7] = "e4cnN7UP0SnjMswao4r9LHhuRWlwcAUo";
                    if (i == 0) {
                        this.A0H = Math.max(0L, j);
                        if (A0s[3].length() != 31) {
                            throw new RuntimeException();
                        }
                        String[] strArr14 = A0s;
                        strArr14[5] = "k8d1uoKGcn9oqEPcbfqEuDtWZEluvqcv";
                        strArr14[2] = "0FdbLpGzKjPPYkWO7EHSmW7ecHxpzOIE";
                        this.A0D = 1;
                    } else {
                        jA09 = this.A0H + A09(A03());
                        if (this.A0D == 1) {
                            jAbs = Math.abs(jA09 - j);
                            if (A0s[7].charAt(5) != 'v') {
                                String[] strArr15 = A0s;
                                strArr15[5] = "Mjd2F7C7kiLCVUTRblLdSlwSo04If9jH";
                                strArr15[2] = "SFdTDB39f2uDBeT9Tbwwt5W5QdPlKJfQ";
                                if (jAbs > 200000) {
                                    Log.e(strA0I, A0I(16, 33, 65) + jA09 + A0I(0, 6, 35) + j + A0I(138, 1, 115));
                                    this.A0D = 2;
                                }
                            } else {
                                A0s[7] = "vGS91cAAG7hMw0xriamqCYCKlpI1kVhb";
                                if (jAbs > 200000) {
                                    Log.e(strA0I, A0I(16, 33, 65) + jA09 + A0I(0, 6, 35) + j + A0I(138, 1, 115));
                                    this.A0D = 2;
                                }
                            }
                        }
                        i2 = this.A0D;
                        if (A0s[3].length() == 31) {
                            String[] strArr16 = A0s;
                            strArr16[6] = "1n9GuuRZsd3tbftYhBPGe0z5aHsix9eq";
                            strArr16[0] = "CrYGxTKVQxqkoEEYRaPu1U1mUEDoOHWT";
                            if (i2 == 2) {
                                this.A0H += j - jA09;
                                this.A0D = 1;
                                bw = this.A0R;
                                if (bw != null) {
                                    bw.ABt();
                                }
                            }
                        }
                    }
                    if (this.A0X) {
                        this.A0J += (long) byteBuffer.remaining();
                    } else {
                        j2 = this.A0I;
                        if (A0s[7].charAt(5) != 'v') {
                            A0s[7] = "RMIgxhGSPUjaAJeGU8ndpU4l5tEpmaGN";
                            this.A0I = j2 + ((long) this.A05);
                        }
                    }
                    this.A0T = byteBuffer;
                }
            }
            throw new RuntimeException();
        }
        if (!this.A0Z) {
            A0S(this.A0T, j);
        } else {
            A0P(j);
        }
        if (!this.A0T.hasRemaining()) {
            this.A0T = null;
            return true;
        }
        if (this.A0h.A0K(A04())) {
            Log.w(strA0I, A0I(55, 29, 17));
            reset();
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A7y() {
        if (this.A0D == 1) {
            this.A0D = 2;
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean A83() {
        return A0U() && this.A0h.A0J(A04());
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean A8Q(int i) {
        if (C0695Iz.A0c(i)) {
            return i != 4 || C0695Iz.A02 >= 21;
        }
        BE be = this.A0g;
        return be != null && be.A04(i);
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final boolean A8R() {
        return !A0U() || (this.A0W && !A83());
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void ADE() {
        this.A0Y = true;
        if (A0U()) {
            this.A0h.A0E();
            AudioTrack audioTrack = this.A0M;
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            A0s[3] = "NrYH7da7InJYZ7DcifiCDIWgHy9XttZ";
            audioTrack.play();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void ADF() throws BX {
        if (this.A0W) {
            return;
        }
        boolean zA0U = A0U();
        String[] strArr = A0s;
        if (strArr[6].charAt(18) != strArr[0].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0s;
        strArr2[6] = "potoNIjJr8c5PhhOHWP3V8xbrUltb98O";
        strArr2[0] = "s7h49TBBG9Upv5zOzLPi805BwVxtpEdY";
        if (zA0U && A0T()) {
            this.A0h.A0F(A04());
            this.A0M.stop();
            this.A03 = 0;
            this.A0W = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void ADm() {
        reset();
        A0L();
        for (BL bl : this.A0o) {
            bl.reset();
            if (A0s[3].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0s;
            strArr[5] = "qwdTDv5zTd3QZESqVqPfOIKdJj7Lz8kg";
            strArr[2] = "LbdTDWALSGuogzF76GUONHDiI7JL2ED4";
        }
        for (BL bl2 : this.A0n) {
            bl2.reset();
        }
        this.A01 = 0;
        this.A0Y = false;
        if (A0s[7].charAt(5) != 'v') {
            A0s[3] = "7yJp0zMcRreZgWUPzTirOlbpECU1qPL";
            return;
        }
        String[] strArr2 = A0s;
        strArr2[5] = "IJdzF7l1OUCqcHSZRNfx63TpictB3CeC";
        strArr2[2] = "IidC6PogfV1YW6p29FProDWayU60rDbu";
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEU(BD bd) {
        if (this.A0Q.equals(bd)) {
            return;
        }
        this.A0Q = bd;
        if (this.A0b) {
            return;
        }
        reset();
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void AEb(BW bw) {
        this.A0R = bw;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final C0490Ah AEf(C0490Ah c0490Ah) {
        if (A0U() && !this.A0V) {
            this.A0P = C0490Ah.A04;
            return this.A0P;
        }
        C0490Ah c0490Ah2 = this.A0O;
        if (c0490Ah2 == null) {
            if (!this.A0l.isEmpty()) {
                c0490Ah2 = this.A0l.getLast().A02;
            } else {
                c0490Ah2 = this.A0P;
            }
        }
        if (!c0490Ah.equals(c0490Ah2)) {
            if (A0U()) {
                this.A0O = c0490Ah;
            } else {
                this.A0P = this.A0j.A3Q(c0490Ah);
            }
        }
        return this.A0P;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void pause() {
        this.A0Y = false;
        if (A0U() && this.A0h.A0I()) {
            this.A0M.pause();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void reset() {
        if (A0U()) {
            this.A0J = 0L;
            this.A0I = 0L;
            this.A0L = 0L;
            this.A0K = 0L;
            this.A05 = 0;
            C0490Ah c0490Ah = this.A0O;
            if (c0490Ah != null) {
                this.A0P = c0490Ah;
                this.A0O = null;
            } else if (!this.A0l.isEmpty()) {
                ArrayDeque<C0517Bj> arrayDeque = this.A0l;
                if (A0s[7].charAt(5) == 'v') {
                    throw new RuntimeException();
                }
                A0s[7] = "7Zd0LJuJ8v1AsDIGeh9Ten8e10sO09Lx";
                this.A0P = arrayDeque.getLast().A02;
            }
            this.A0l.clear();
            this.A0F = 0L;
            this.A0G = 0L;
            this.A0T = null;
            this.A0U = null;
            A0J();
            this.A0W = false;
            this.A04 = -1;
            this.A0S = null;
            this.A03 = 0;
            this.A0D = 0;
            if (this.A0h.A0H()) {
                this.A0M.pause();
            }
            AudioTrack audioTrack = this.A0M;
            this.A0M = null;
            this.A0h.A0D();
            this.A0f.close();
            new C0513Bf(this, audioTrack).start();
        }
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void setVolume(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            A0M();
        }
    }
}
