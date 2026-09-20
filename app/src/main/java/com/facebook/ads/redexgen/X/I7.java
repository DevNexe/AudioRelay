package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
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
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(14)
public final class I7 extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC0876Qd, InterfaceC0890Qr, InterfaceC0878Qf {
    public static byte[] A0N;
    public static String[] A0O = {"5i34yksohRV8hSvEB2dTOBGqhO", "V2RNkeamXobpzSRVkM4sjlG", "1HR", "8SLqGCa2wxiVkGjIaPVK9LXerY", "SSmTkZgpl4jZsKBndOsNgmbhAq5FKejN", "hgMiihLf1lx1lIiVFZ8jC", "euSTtDnbG06q2RqThlQcyR1Es6oMHQDw", "iHXqYQoKvaPWKvo"};
    public static final String A0P;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;

    @Nullable
    public Surface A07;
    public View A08;

    @Nullable
    public MediaController A09;
    public C1075Xy A0A;
    public Q6 A0B;

    @Nullable
    public C0879Qg A0C;
    public EnumC0892Qt A0D;
    public EnumC0892Qt A0E;

    @Nullable
    public InterfaceC0893Qu A0F;

    @Nullable
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 68);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A0N = new byte[]{86, 126, 126, 118, 125, 116, 49, 112, 125, 102, 112, 104, 98, 49, 101, 121, 99, 126, 102, 49, 112, 127, 49, 116, 105, 114, 116, 97, 101, 120, 126, 127, 49, 102, 120, 101, 121, 49, 98, 116, 101, 83, 112, 114, 122, 118, 99, 126, 100, 127, 117, 85, 99, 112, 102, 112, 115, 125, 116, 49, 126, 127, 49, 95, 126, 100, 118, 112, 101, 49, 112, 115, 126, 103, 116, 63, 49, 98, 126, 49, 102, 116, 49, 98, 120, 125, 116, 127, 101, 125, 104, 49, 120, 118, 127, 126, 99, 116, 49, 120, 101, 63, 76, 100, 100, 108, 103, 110, 43, 106, 103, 124, 106, 114, 120, 43, 127, 99, 121, 100, 124, 43, 106, 101, 43, 110, 115, 104, 110, 123, 127, 98, 100, 101, 43, 124, 98, 127, 99, 43, 120, 110, 127, 77, 100, 121, 110, 108, 121, 100, 126, 101, 111, 43, 100, 101, 43, 69, 100, 126, 108, 106, 127, 43, 106, 105, 100, 125, 110, 37, 43, 120, 100, 43, 124, 110, 43, 120, 98, 103, 110, 101, 127, 103, 114, 43, 98, 108, 101, 100, 121, 110, 43, 98, 127, 37, 33, 30, 19, 18, 24, 87, 4, 3, 22, 3, 18, 87, 20, 31, 22, 25, 16, 18, 19, 87, 3, 24, 87, 95, 93, 86, 93, 74, 81, 91};
        String[] strArr = A0O;
        if (strArr[4].charAt(4) == strArr[6].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "4Rjqxy3w03hT2rk3wOaPN94qCv";
        strArr2[0] = "J56YrdEaTg6GnpCj3tljjm9xxp";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (JR.A1J(this.A0A) && this.A0D != EnumC0892Qt.A08) {
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long jCurrentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            InterfaceC0893Qu interfaceC0893Qu = this.A0F;
            if (interfaceC0893Qu != null) {
                interfaceC0893Qu.AAq(currentPosition, currentPosition2, jCurrentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0P = I7.class.getSimpleName();
    }

    public I7(C1075Xy c1075Xy) {
        super(c1075Xy);
        this.A0D = EnumC0892Qt.A04;
        this.A0E = EnumC0892Qt.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = Q6.A03;
        this.A0K = false;
        this.A0A = c1075Xy;
    }

    public I7(C1075Xy c1075Xy, AttributeSet attributeSet) {
        super(c1075Xy, attributeSet);
        this.A0D = EnumC0892Qt.A04;
        this.A0E = EnumC0892Qt.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = Q6.A03;
        this.A0K = false;
        this.A0A = c1075Xy;
    }

    public I7(C1075Xy c1075Xy, AttributeSet attributeSet, int i) {
        super(c1075Xy, attributeSet, i);
        this.A0D = EnumC0892Qt.A04;
        this.A0E = EnumC0892Qt.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = Q6.A03;
        this.A0K = false;
        this.A0A = c1075Xy;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    private void A04() {
        this.A0C = new C0879Qg(this.A0A);
        this.A0C.A0H(this);
        this.A0C.A0G(this);
        this.A0C.A0I(false);
        if (this.A0J && !this.A0I) {
            Activity activityA0C = this.A0A.A0C();
            if (A0O[5].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[4] = "kOzpobq3cn2ENPvO1dz11rE9gYrdsM2t";
            strArr[6] = "XeC6T5eSgweGxN3AGx0qK1AhpVQau6BW";
            if (activityA0C != null) {
                this.A09 = new MediaController(activityA0C);
                MediaController mediaController = this.A09;
                View view = this.A08;
                if (view == null) {
                    view = this;
                }
                mediaController.setAnchorView(view);
                this.A09.setMediaPlayer(new C0884Ql(this));
                this.A09.setEnabled(true);
            } else {
                this.A09 = null;
            }
        }
        String str = this.A0G;
        String[] strArr2 = A0O;
        if (strArr2[4].charAt(4) != strArr2[6].charAt(4)) {
            A0O[1] = "7OzxCvlMe7OewOex";
            if (str != null) {
                if (str.length() != 0 || this.A0K) {
                }
            }
            setVideoState(EnumC0892Qt.A08);
            if (isAvailable()) {
                onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
            }
        }
        String[] strArr3 = A0O;
        strArr3[4] = "NXAVCVHzJxAz58YH1UEgH4PHy83Kp8aQ";
        strArr3[6] = "f1ODdwAOeVqSGvJpvEMDUKedn4FgojKu";
        if (str != null) {
            if (str.length() != 0) {
            }
        }
        setVideoState(EnumC0892Qt.A08);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
        this.A0C.A0F(this.A0A.A00(), this.A06);
        setVideoState(EnumC0892Qt.A08);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }

    private void A05() {
        C0879Qg c0879Qg = this.A0C;
        if (c0879Qg == null) {
            return;
        }
        C0877Qe c0877QeA08 = c0879Qg.A08();
        String[] strArr = A0O;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "yniwio37QFCiL85s5GWvJngxgc";
        strArr2[0] = "95HbvmBBNGyB2bovEph22CE4vZ";
        if (c0877QeA08 != null) {
            A08(c0877QeA08.A01, c0877QeA08.A00);
        }
    }

    private void A06() {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
        }
        C0879Qg c0879Qg = this.A0C;
        if (c0879Qg != null) {
            c0879Qg.A09();
            if (A0O[5].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[3] = "he0jjWxzFB8qDestWT3k7cDZmQ";
            strArr[0] = "YQusGxI3ZRGEiRLtvLIlZ3cCdg";
            this.A0C = null;
        }
        this.A09 = null;
        this.A0M = false;
        setVideoState(EnumC0892Qt.A04);
    }

    private void A08(int i, int i2) {
        if (i != this.A03 || i2 != this.A02) {
            this.A03 = i;
            this.A02 = i2;
            if (this.A03 != 0 && this.A02 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return C0879Qg.A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void A7u() {
        if (!this.A0H) {
            AD5(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final boolean A85() {
        C0879Qg c0879Qg = this.A0C;
        return c0879Qg != null && c0879Qg.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final boolean A86() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final boolean A8b() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0876Qd
    public final void ABr(String str, Exception exc) {
        this.A0A.A0D().A9c(str);
        this.A0A.A0D().A2v(1);
        setVideoState(EnumC0892Qt.A03);
        this.A0A.A06().A8y(A03(219, 7, 124), C04578z.A1N, new AnonymousClass90(exc));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0876Qd
    public final void ABs(boolean z, int i) {
        if (this.A0C == null) {
            return;
        }
        if (i == 1) {
            setVideoState(EnumC0892Qt.A04);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                A05();
                this.A04 = System.currentTimeMillis();
                setRequestedVolume(this.A00);
                long j = this.A05;
                if (j > 0 && j < this.A0C.A07()) {
                    this.A0C.A0D(this.A05);
                    this.A05 = 0L;
                }
                if (this.A0C.A06() != 0 && !z && this.A0M) {
                    setVideoState(EnumC0892Qt.A05);
                    return;
                }
                if (z || this.A0D == EnumC0892Qt.A06) {
                    return;
                }
                setVideoState(EnumC0892Qt.A07);
                EnumC0892Qt enumC0892Qt = this.A0E;
                String[] strArr = A0O;
                if (strArr[4].charAt(4) != strArr[6].charAt(4)) {
                    String[] strArr2 = A0O;
                    strArr2[3] = "QOwsd8cFgtBxhwq2W5mYjt9JcX";
                    strArr2[0] = "NiYGjjh9hUScPgNoOA1xOqSddN";
                    if (enumC0892Qt != EnumC0892Qt.A0A) {
                        return;
                    }
                } else if (enumC0892Qt != EnumC0892Qt.A0A) {
                    return;
                }
                AEw(this.A0B, 8);
                EnumC0892Qt enumC0892Qt2 = EnumC0892Qt.A04;
                String[] strArr3 = A0O;
                if (strArr3[3].length() == strArr3[0].length()) {
                    A0O[5] = "yetXNvPdXumqVjXfCpilY";
                    this.A0E = enumC0892Qt2;
                    return;
                }
            } else {
                if (i != 4) {
                    return;
                }
                if (z) {
                    setVideoState(EnumC0892Qt.A06);
                }
                C0879Qg c0879Qg = this.A0C;
                if (A0O[5].length() == 21) {
                    A0O[5] = "KLjUXng8f5n9djrrPXv2F";
                    if (c0879Qg != null) {
                        c0879Qg.A0I(false);
                        if (!z) {
                            this.A0C.A0A();
                        }
                    }
                    this.A0M = false;
                    return;
                }
            }
            throw new RuntimeException();
        }
        A05();
        int i2 = this.A01;
        if (A0O[1].length() == 30) {
            throw new RuntimeException();
        }
        String[] strArr4 = A0O;
        strArr4[2] = "9yr";
        strArr4[7] = "mKFyaVoRgsxwFz3";
        if (i2 < 0) {
            return;
        }
        int i3 = this.A01;
        this.A01 = -1;
        InterfaceC0893Qu interfaceC0893Qu = this.A0F;
        if (interfaceC0893Qu == null) {
            return;
        }
        int currentPosition = getCurrentPosition();
        String[] strArr5 = A0O;
        if (strArr5[3].length() != strArr5[0].length()) {
            interfaceC0893Qu.ACG(i3, currentPosition);
        } else {
            A0O[5] = "bt2gfLOq6VYcjgDmYUS3R";
            interfaceC0893Qu.ACG(i3, currentPosition);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0878Qf
    public final void ACq(int i, int i2, int i3, float f) {
        A08(i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void AD5(boolean z, int i) {
        this.A0A.A0D().A2r(i);
        this.A0E = EnumC0892Qt.A05;
        this.A0L = z;
        C0879Qg c0879Qg = this.A0C;
        if (c0879Qg != null) {
            c0879Qg.A0I(false);
        } else {
            setVideoState(EnumC0892Qt.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void AEr(int i) {
        this.A0A.A0D().A9d(i);
        setVideoState(EnumC0892Qt.A09);
        AF3(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void AEw(Q6 q6, int i) {
        this.A0A.A0D().A32(i);
        this.A0L = false;
        this.A0E = EnumC0892Qt.A0A;
        this.A0B = q6;
        if (this.A0C == null) {
            setup(this.A06);
        } else {
            if (this.A0D != EnumC0892Qt.A07 && this.A0D != EnumC0892Qt.A05 && this.A0D != EnumC0892Qt.A06) {
                return;
            }
            this.A0C.A0I(true);
            setVideoState(EnumC0892Qt.A0A);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void AF3(int i) {
        this.A0A.A0D().A34(i);
        this.A0E = EnumC0892Qt.A04;
        C0879Qg c0879Qg = this.A0C;
        if (c0879Qg != null) {
            c0879Qg.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(EnumC0892Qt.A04);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void destroy() {
        A06();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public int getCurrentPosition() {
        C0879Qg c0879Qg = this.A0C;
        if (c0879Qg != null) {
            return (int) c0879Qg.A06();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public int getDuration() {
        C0879Qg c0879Qg = this.A0C;
        if (c0879Qg == null) {
            return 0;
        }
        return (int) c0879Qg.A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public Q6 getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public EnumC0892Qt getState() {
        return this.A0D;
    }

    public EnumC0892Qt getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public int getVideoWidth() {
        return this.A03;
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
        if (JR.A1t(getContext()) && !isHardwareAccelerated()) {
            setVideoState(EnumC0892Qt.A03);
            AF3(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
        }
        this.A07 = new Surface(surfaceTexture);
        C0879Qg c0879Qg = this.A0C;
        if (c0879Qg == null) {
            return;
        }
        c0879Qg.A0E(this.A07);
        if (this.A0D == EnumC0892Qt.A05 && !this.A0L) {
            AEw(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
            C0879Qg c0879Qg = this.A0C;
            if (c0879Qg != null) {
                c0879Qg.A0E(null);
            }
        }
        if (this.A0D == EnumC0892Qt.A05) {
            return true;
        }
        if (A0O[5].length() != 21) {
            throw new RuntimeException();
        }
        A0O[5] = "TScQzo9LVHiM3saFvXTgi";
        AD5(false, 5);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A0C == null) {
            return;
        }
        MediaController mediaController = this.A09;
        if (mediaController != null && mediaController.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0D != EnumC0892Qt.A05) {
                A7u();
            }
        } else {
            if (this.A0D != EnumC0892Qt.A05 || this.A0L) {
                return;
            }
            AEw(this.A0B, 9);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public final void seekTo(int i) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i);
            return;
        }
        long j = i;
        String[] strArr = A0O;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0O[5] = "kfjJwAtkK1UY2s6fcoM3d";
        this.A05 = j;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        boolean zIsDebugBuild = AdInternalSettings.isDebugBuild();
        if (A0O[5].length() != 21) {
            throw new RuntimeException();
        }
        A0O[1] = "HF5JdwiOlRNKOfaOH";
        if (!zIsDebugBuild) {
            return;
        }
        Log.w(A0P, A03(0, 102, 85));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0H = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new ViewOnTouchListenerC0886Qn(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
            return;
        }
        if (!AdInternalSettings.isDebugBuild()) {
            return;
        }
        String str = A0P;
        String[] strArr = A0O;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[4] = "adR4uJi1AjYNmamYU7fKdN8LPQzpuqJY";
        strArr2[6] = "LCKmfGi2Ka9VnYBnqFwdGZK0MZJmec2m";
        Log.w(str, A03(102, 94, 79));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setFullScreen(boolean z) {
        this.A0J = z;
        if (z && !this.A0I) {
            setOnTouchListener(new ViewOnTouchListenerC0885Qm(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A0C != null && this.A0D != EnumC0892Qt.A08 && this.A0D != EnumC0892Qt.A04) {
            this.A0C.A0C(f);
        }
    }

    public void setTestMode(boolean z) {
        this.A0K = z;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setVideoMPD(@Nullable String str) {
        this.A0G = str;
    }

    private void setVideoState(EnumC0892Qt enumC0892Qt) {
        if (enumC0892Qt != this.A0D) {
            if (this.A0A.A03().A8P()) {
                String str = A03(196, 23, 51) + enumC0892Qt;
            }
            this.A0D = enumC0892Qt;
            if (this.A0D == EnumC0892Qt.A0A) {
                this.A0M = true;
            }
            InterfaceC0893Qu interfaceC0893Qu = this.A0F;
            if (interfaceC0893Qu != null) {
                interfaceC0893Qu.ACs(enumC0892Qt);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setVideoStateChangeListener(@Nullable InterfaceC0893Qu interfaceC0893Qu) {
        this.A0F = interfaceC0893Qu;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0890Qr
    public void setup(Uri uri) {
        this.A0A.A0D().A2u();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}
