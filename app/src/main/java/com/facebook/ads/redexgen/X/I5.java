package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(14)
public final class I5 extends TextureView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener, InterfaceC0890Qr {
    public static byte[] A0N;
    public static String[] A0O = {"w6W1Pn4pGSy1veXw7fNic4Q20vJelJ2", "acNB2lhq8cVPZLtYghlcj8euurSBcqdx", "I2BPPFoGG3lXsTKKPy2FKKasdsM", "uMMu8699SI696vicAGdUyhB1Kjcnsg5D", "S7aPtd9QGtmzyQ9VrNW20IwmaDF5p1Ml", "zS648UlhjTBJXulz7NmFsyAIwaw2iCpI", "ZyXsHo9oibpczWLkt42IpHWLTZevRgPI", "euMEykkwaXnS"};
    public static final String A0P;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;

    @Nullable
    public MediaPlayer A06;
    public Uri A07;
    public Surface A08;
    public View A09;

    @Nullable
    public MediaController A0A;
    public Q6 A0B;
    public EnumC0892Qt A0C;
    public EnumC0892Qt A0D;

    @Nullable
    public InterfaceC0893Qu A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final long A0K;
    public final MediaController.MediaPlayerControl A0L;
    public final C1075Xy A0M;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0N = new byte[]{89, 87, 91, 89, 30, 3, 15, 9, 26, 89, 91, 65, 91, 89, 57, 102, 105, 75, 68, 68, 69, 94, 10, 90, 88, 79, 90, 75, 88, 79, 10, 71, 79, 78, 67, 75, 10, 90, 70, 75, 83, 79, 88, 10, 93, 67, 94, 66, 10, 121, 95, 88, 76, 75, 73, 79, 126, 79, 82, 94, 95, 88, 79, 16, 10, 45, 1, 27, 2, 10, 0, 73, 26, 78, 28, 11, 26, 28, 7, 11, 24, 11, 78, 24, 7, 10, 11, 1, 78, 7, 0, 8, 1, 28, 3, 15, 26, 7, 1, 0, 93, 122, 114, 119, 126, 127, 59, 111, 116, 59, 116, 107, 126, 117, 59, 122, 104, 104, 126, 111, 104, 59, 15, 39, 39, 47, 36, 45, 104, 41, 36, 63, 41, 49, 59, 104, 60, 32, 58, 39, 63, 104, 41, 38, 104, 45, 48, 43, 45, 56, 60, 33, 39, 38, 104, 63, 33, 60, 32, 104, 59, 45, 60, 10, 41, 43, 35, 47, 58, 39, 61, 38, 44, 12, 58, 41, 63, 41, 42, 36, 45, 104, 39, 38, 104, 6, 39, 61, 47, 41, 60, 104, 41, 42, 39, 62, 45, 102, 104, 59, 39, 104, 63, 45, 104, 59, 33, 36, 45, 38, 60, 36, 49, 104, 33, 47, 38, 39, 58, 45, 104, 33, 60, 102, 50, 26, 26, 18, 25, 16, 85, 20, 25, 2, 20, 12, 6, 85, 1, 29, 7, 26, 2, 85, 20, 27, 85, 16, 13, 22, 16, 5, 1, 28, 26, 27, 85, 2, 28, 1, 29, 85, 6, 16, 1, 51, 26, 7, 16, 18, 7, 26, 0, 27, 17, 85, 26, 27, 85, 59, 26, 0, 18, 20, 1, 85, 20, 23, 26, 3, 16, 91, 85, 6, 26, 85, 2, 16, 85, 6, 28, 25, 16, 27, 1, 25, 12, 85, 28, 18, 27, 26, 7, 16, 85, 28, 1, 91, 2, 57, 54, 53, 59, 50, 119, 35, 56, 119, 52, 59, 56, 36, 50, 21, 42, 39, 38, 44, 99, 48, 55, 34, 55, 38, 99, 32, 43, 34, 45, 36, 38, 39, 99, 55, 44, 99, 2, 16, 16, 6, 23, 112, 108, 97, 121, 101, 114, 88, 1, 84, 75, 66, 87, 1, 3, 25, 3, 1};
    }

    static {
        A04();
        A0P = I5.class.getSimpleName();
    }

    public I5(C1075Xy c1075Xy) {
        super(c1075Xy);
        this.A0C = EnumC0892Qt.A04;
        this.A0D = EnumC0892Qt.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = Q6.A03;
        this.A0L = new C0887Qo(this);
        this.A0M = c1075Xy;
    }

    public I5(C1075Xy c1075Xy, AttributeSet attributeSet) {
        super(c1075Xy, attributeSet);
        this.A0C = EnumC0892Qt.A04;
        this.A0D = EnumC0892Qt.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = Q6.A03;
        this.A0L = new C0887Qo(this);
        this.A0M = c1075Xy;
    }

    public I5(C1075Xy c1075Xy, AttributeSet attributeSet, int i) {
        super(c1075Xy, attributeSet, i);
        this.A0C = EnumC0892Qt.A04;
        this.A0D = EnumC0892Qt.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = Q6.A03;
        this.A0L = new C0887Qo(this);
        this.A0M = c1075Xy;
    }

    private boolean A05() {
        return (this.A0C == EnumC0892Qt.A08 || this.A0C == EnumC0892Qt.A07) ? false : true;
    }

    private boolean A06() {
        return this.A0C == EnumC0892Qt.A07 || this.A0C == EnumC0892Qt.A0A || this.A0C == EnumC0892Qt.A05 || this.A0C == EnumC0892Qt.A06;
    }

    private boolean A07() {
        return (this.A0C == EnumC0892Qt.A08 || this.A0C == EnumC0892Qt.A07) ? false : true;
    }

    private boolean A08() {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.reset();
            return true;
        } catch (IllegalStateException e) {
            this.A0M.A06().A8y(A03(361, 6, 114), C04578z.A2G, new AnonymousClass90(e));
            return false;
        }
    }

    private boolean A09(@Nullable Surface surface) {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.setSurface(surface);
            if (A0O[1].charAt(7) != 'q') {
                throw new RuntimeException();
            }
            A0O[5] = "NiAMWdvt78S0m1zvL3gvle9zEu4JiNqO";
            return true;
        } catch (IllegalStateException e) {
            this.A0M.A06().A8y(A03(361, 6, 114), C04578z.A2H, new AnonymousClass90(e));
            return false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void A7u() {
        if (!this.A0F) {
            AD5(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    @SuppressLint({"NewApi"})
    public final boolean A85() {
        if (this.A06 == null || Build.VERSION.SDK_INT < 16) {
            return false;
        }
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.A06.getTrackInfo()) {
                int trackType = trackInfo.getTrackType();
                String[] strArr = A0O;
                if (strArr[3].charAt(29) != strArr[6].charAt(29)) {
                    throw new RuntimeException();
                }
                A0O[5] = "iSqF26gJBktCMb0RObgKl91oEThpz7Z0";
                if (trackType == 2) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            Log.e(A0P, A03(65, 35, 28), e);
            return true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final boolean A86() {
        return this.A0J;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final boolean A8b() {
        return this.A0I;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void AD5(boolean z, int i) {
        this.A0M.A0D().A2r(i);
        this.A0D = EnumC0892Qt.A05;
        if (this.A06 != null) {
            if (!A05()) {
                return;
            }
            this.A0I = z;
            this.A06.pause();
            if (this.A0C != EnumC0892Qt.A06) {
                setVideoState(EnumC0892Qt.A05);
                return;
            }
            return;
        }
        setVideoState(EnumC0892Qt.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void AEr(int i) {
        this.A0M.A0D().A9d(i);
        setVideoState(EnumC0892Qt.A09);
        AF3(5);
        this.A03 = 0;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x0047  */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void AEw(Q6 q6, int i) throws Throwable {
        MediaPlayer mediaPlayer;
        int i2;
        this.A0M.A0D().A32(i);
        this.A0I = false;
        this.A0D = EnumC0892Qt.A0A;
        this.A0B = q6;
        if (this.A0C == EnumC0892Qt.A0A || this.A0C == EnumC0892Qt.A07) {
            mediaPlayer = this.A06;
            if (mediaPlayer == null) {
                setup(this.A07);
            } else {
                i2 = this.A03;
                if (i2 > 0) {
                    mediaPlayer.seekTo(i2);
                }
                this.A06.start();
                if (this.A0C == EnumC0892Qt.A07 || this.A0J) {
                    setVideoState(EnumC0892Qt.A0A);
                }
            }
        } else {
            EnumC0892Qt enumC0892Qt = this.A0C;
            if (A0O[7].length() == 4) {
                throw new RuntimeException();
            }
            A0O[4] = "NTKGPTGyq7PSuZ6pDxSrkOD3BAS3oRMw";
            if (enumC0892Qt == EnumC0892Qt.A04 || this.A0C == EnumC0892Qt.A05 || this.A0C == EnumC0892Qt.A06) {
                mediaPlayer = this.A06;
                if (mediaPlayer == null) {
                    setup(this.A07);
                } else {
                    i2 = this.A03;
                    if (i2 > 0) {
                        mediaPlayer.seekTo(i2);
                    }
                    this.A06.start();
                    if (this.A0C == EnumC0892Qt.A07) {
                        setVideoState(EnumC0892Qt.A0A);
                    } else {
                        setVideoState(EnumC0892Qt.A0A);
                    }
                }
            }
        }
        if (isAvailable()) {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (A0O[1].charAt(7) != 'q') {
                A0O[4] = "Wn6W9Nu3dNfA4pP49CdphRQGwehyl3Rd";
                onSurfaceTextureAvailable(surfaceTexture, 0, 0);
            } else {
                A0O[7] = "pXleF17jKjib";
                onSurfaceTextureAvailable(surfaceTexture, 0, 0);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void AF3(int i) {
        this.A0M.A0D().A34(i);
        this.A0D = EnumC0892Qt.A04;
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer != null) {
            int currentPosition = mediaPlayer.getCurrentPosition();
            if (currentPosition > 0) {
                this.A03 = currentPosition;
            }
            this.A06.stop();
            if (A0O[4].charAt(14) == '3') {
                throw new RuntimeException();
            }
            A0O[5] = "KulxFUFqA4xnUTvaQLfyg7cstmOjzycv";
            A08();
            this.A06.release();
            this.A06 = null;
            MediaController mediaController = this.A0A;
            if (mediaController != null) {
                mediaController.hide();
                this.A0A.setEnabled(false);
            }
        }
        setVideoState(EnumC0892Qt.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void destroy() {
        if (this.A06 != null) {
            A09(null);
            this.A06.setOnBufferingUpdateListener(null);
            this.A06.setOnCompletionListener(null);
            this.A06.setOnErrorListener(null);
            this.A06.setOnInfoListener(null);
            this.A06.setOnPreparedListener(null);
            this.A06.setOnVideoSizeChangedListener(null);
            this.A06.setOnSeekCompleteListener(null);
            A08();
            this.A06 = null;
            setVideoState(EnumC0892Qt.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public int getCurrentPosition() {
        if (this.A06 == null || !A06()) {
            return 0;
        }
        return this.A06.getCurrentPosition();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public int getDuration() {
        if (this.A06 == null) {
            return 0;
        }
        boolean zA06 = A06();
        String[] strArr = A0O;
        if (strArr[3].charAt(29) != strArr[6].charAt(29)) {
            throw new RuntimeException();
        }
        A0O[1] = "tqb6wmVqQGZxPylUtz2fkCIx7Bf2WilJ";
        if (!zA06) {
            return 0;
        }
        return this.A06.getDuration();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public long getInitialBufferTime() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public Q6 getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public EnumC0892Qt getState() {
        return this.A0C;
    }

    public EnumC0892Qt getTargetState() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public int getVideoHeight() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public int getVideoWidth() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            setVideoState(EnumC0892Qt.A03);
            this.A0M.A0D().A2v(5);
            AF3(8);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2 = this.A06;
        if (mediaPlayer2 != null) {
            mediaPlayer2.pause();
        }
        setVideoState(EnumC0892Qt.A06);
        seekTo(0);
        this.A03 = 0;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) throws Throwable {
        this.A0M.A0D().A9c(A03(367, 11, 81) + i + A03(0, 14, 9) + i2 + A03(14, 2, 105));
        if (this.A01 > 0 && getState() == EnumC0892Qt.A0A) {
            this.A01--;
            AF3(6);
            AEw(this.A0B, 10);
        } else {
            setVideoState(EnumC0892Qt.A03);
            this.A0M.A0D().A2v(1);
            AF3(7);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 3) {
            this.A0J = true;
            if (this.A0D == EnumC0892Qt.A0A) {
                setVideoState(EnumC0892Qt.A0A);
            }
            return true;
        }
        if (i != 701) {
            if (i == 702 && A07()) {
                setVideoState(EnumC0892Qt.A0A);
            }
        } else {
            EnumC0892Qt enumC0892Qt = EnumC0892Qt.A02;
            if (A0O[4].charAt(14) != '3') {
                String[] strArr = A0O;
                strArr[3] = "iL0L5EQxu2M5tvy2sZDjl5tOkB9wsg4Q";
                strArr[6] = "qEr4cYtmjtQdjlZthk5xBRgssZbq5gW6";
                setVideoState(enumC0892Qt);
            } else {
                setVideoState(enumC0892Qt);
            }
        }
        String[] strArr2 = A0O;
        if (strArr2[3].charAt(29) != strArr2[6].charAt(29)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0O;
        strArr3[3] = "BctcOQJYgBcKf8RdBMRoW9O8jkER1gO3";
        strArr3[6] = "NFF5b4NOHp1wMQpQtAU8ibXMpYWuxgZg";
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) throws Throwable {
        setVideoState(EnumC0892Qt.A07);
        if (this.A0H && !this.A0G) {
            Activity activityA0C = this.A0M.A0C();
            if (activityA0C != null) {
                this.A0A = new MediaController(activityA0C);
                MediaController mediaController = this.A0A;
                View view = this.A09;
                if (view == null) {
                    view = this;
                }
                mediaController.setAnchorView(view);
                MediaController mediaController2 = this.A0A;
                MediaController.MediaPlayerControl mediaPlayerControl = this.A0L;
                if (A0O[1].charAt(7) != 'q') {
                    throw new RuntimeException();
                }
                String[] strArr = A0O;
                strArr[3] = "fPjFRSSzuUrY85KdwEQXHAUI7gq3zgJX";
                strArr[6] = "QlnNj2Zi0n3XZkktRetea07zoE6PUgNL";
                mediaController2.setMediaPlayer(mediaPlayerControl);
                this.A0A.setEnabled(true);
            } else {
                this.A0A = null;
            }
        }
        setRequestedVolume(this.A00);
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        int i = this.A03;
        if (i > 0) {
            if (i >= this.A06.getDuration()) {
                this.A03 = 0;
            }
            this.A06.seekTo(this.A03);
            this.A03 = 0;
        }
        EnumC0892Qt enumC0892Qt = this.A0D;
        EnumC0892Qt enumC0892Qt2 = EnumC0892Qt.A0A;
        String[] strArr2 = A0O;
        if (strArr2[2].length() == strArr2[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0O;
        strArr3[3] = "i4HMjCzdRtS7Zf5jyUfqsJgJBFC3Hgk3";
        strArr3[6] = "nPyigXhxANl12gOwrMulZJ84NGYQcgH1";
        if (enumC0892Qt == enumC0892Qt2) {
            AEw(this.A0B, 8);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        InterfaceC0893Qu interfaceC0893Qu = this.A0E;
        if (interfaceC0893Qu == null) {
            return;
        }
        interfaceC0893Qu.ACG(this.A02, this.A03);
        this.A03 = 0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.A08 == null) {
            this.A08 = new Surface(surfaceTexture);
        }
        if (!A09(this.A08)) {
            setVideoState(EnumC0892Qt.A03);
            this.A0M.A0D().A2v(4);
            destroy();
        } else if (this.A0C == EnumC0892Qt.A05 && !this.A0I) {
            AEw(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        A09(null);
        Surface surface = this.A08;
        if (surface != null) {
            surface.release();
            this.A08 = null;
        }
        if (this.A0C != EnumC0892Qt.A05) {
            AD5(false, 5);
        }
        if (A0O[1].charAt(7) != 'q') {
            throw new RuntimeException();
        }
        A0O[5] = "wJEag4Up5dB02EoPbWjrYUJlPYnnpJPt";
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (JR.A1J(this.A0M) && this.A06 != null) {
            boolean zA06 = A06();
            if (A0O[1].charAt(7) != 'q') {
                throw new RuntimeException();
            }
            A0O[5] = "zsAx7U2aKSd2GPuux6v5Um4uWviEPJCj";
            if (!zA06) {
                return;
            }
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            InterfaceC0893Qu interfaceC0893Qu = this.A0E;
            if (interfaceC0893Qu != null) {
                interfaceC0893Qu.AAq(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        if (this.A05 != 0 && this.A04 != 0) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) throws Throwable {
        super.onWindowFocusChanged(z);
        if (this.A06 == null) {
            return;
        }
        MediaController mediaController = this.A0A;
        if (mediaController != null && mediaController.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0C != EnumC0892Qt.A05) {
                A7u();
            }
        } else {
            if (this.A0C != EnumC0892Qt.A05 || this.A0I) {
                return;
            }
            AEw(this.A0B, 9);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void seekTo(int i) {
        if (this.A06 != null && A06()) {
            if (i < getDuration() && i > 0) {
                this.A02 = getCurrentPosition();
                this.A03 = i;
                this.A06.seekTo(i);
                return;
            }
            return;
        }
        this.A03 = i;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0P, A03(122, 102, 58));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0F = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setControlsAnchorView(View view) {
        this.A09 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC0889Qq(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0P, A03(224, 94, 7));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setFullScreen(boolean z) {
        this.A0H = z;
        if (this.A0H && !this.A0G) {
            setOnTouchListener(new ViewOnTouchListenerC0888Qp(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A06 != null && this.A0C != EnumC0892Qt.A08 && this.A0C != EnumC0892Qt.A04) {
            this.A06.setVolume(f, f);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setVideoMPD(@Nullable String str) {
    }

    private void setVideoState(EnumC0892Qt enumC0892Qt) {
        if (enumC0892Qt != this.A0C) {
            if (this.A0M.A03().A8P()) {
                String str = A03(333, 23, 49) + enumC0892Qt;
            }
            this.A0C = enumC0892Qt;
            InterfaceC0893Qu interfaceC0893Qu = this.A0E;
            if (interfaceC0893Qu != null) {
                interfaceC0893Qu.ACs(enumC0892Qt);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setVideoStateChangeListener(@Nullable InterfaceC0893Qu interfaceC0893Qu) {
        this.A0E = interfaceC0893Qu;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setup(Uri uri) throws Throwable {
        MediaPlayer mediaPlayer;
        String strA03 = A03(318, 15, 37);
        this.A0M.A0D().A2u();
        this.A0J = false;
        this.A07 = uri;
        if (this.A06 != null) {
            A08();
            A09(null);
            mediaPlayer = this.A06;
            setVideoState(EnumC0892Qt.A04);
        } else {
            mediaPlayer = new MediaPlayer();
        }
        try {
            if (uri.getScheme().equals(A03(356, 5, 17))) {
                AssetFileDescriptor assetFileDescriptorOpenFd = null;
                try {
                    try {
                        assetFileDescriptorOpenFd = getContext().getAssets().openFd(uri.getPath().substring(1));
                        try {
                            mediaPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
                            try {
                                assetFileDescriptorOpenFd.close();
                            } catch (IOException e) {
                                Log.w(A0P, strA03 + e);
                            }
                        } catch (IOException e2) {
                            e = e2;
                            Log.w(A0P, A03(100, 22, 105) + e);
                            setVideoState(EnumC0892Qt.A03);
                            this.A0M.A0D().A2v(2);
                            if (assetFileDescriptorOpenFd != null) {
                                try {
                                    assetFileDescriptorOpenFd.close();
                                } catch (IOException e3) {
                                    Log.w(A0P, strA03 + e3);
                                }
                            }
                        } catch (SecurityException e4) {
                            e = e4;
                            Log.w(A0P, A03(100, 22, 105) + e);
                            setVideoState(EnumC0892Qt.A03);
                            this.A0M.A0D().A2v(2);
                            if (assetFileDescriptorOpenFd != null) {
                                assetFileDescriptorOpenFd.close();
                            }
                        } catch (Throwable th) {
                            th = th;
                            if (assetFileDescriptorOpenFd != null) {
                                try {
                                    assetFileDescriptorOpenFd.close();
                                } catch (IOException e5) {
                                    Log.w(A0P, strA03 + e5);
                                }
                            }
                            throw th;
                        }
                    } catch (IOException e6) {
                        e = e6;
                    } catch (SecurityException e7) {
                        e = e7;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                mediaPlayer.setDataSource(uri.toString());
            }
            mediaPlayer.setLooping(false);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.prepareAsync();
            this.A06 = mediaPlayer;
            setVideoState(EnumC0892Qt.A08);
        } catch (Exception e8) {
            setVideoState(EnumC0892Qt.A03);
            this.A0M.A0D().A2v(3);
            mediaPlayer.release();
            Log.e(A0P, A03(16, 49, 88) + e8);
        }
        setSurfaceTextureListener(this);
        if (isAvailable()) {
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (A0O[7].length() == 4) {
                throw new RuntimeException();
            }
            A0O[5] = "GkXkHTY3uhjERev32sedrwEWoQBzNpUt";
            onSurfaceTextureAvailable(surfaceTexture, 0, 0);
        }
    }
}
