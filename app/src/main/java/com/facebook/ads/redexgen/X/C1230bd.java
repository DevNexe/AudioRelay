package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1230bd extends C5E implements MediaViewApi, Repairable, C8S {
    public static byte[] A0E;
    public static String[] A0F = {"5egxRyJvv3hsImr6xVPVZGZzS", "S92E58UIdGCmPOb4LYA51SRur0tU5vPU", "gB2LJBWgacco1yi3dwEv6yCRJyLib4yq", "IRYDxixZynQ1VjnPzR0JfxvjieAE", "Yx6PPUM30uHFy3rHO75LIsUaVykI", "YSQgGTlHzzB", "fqdcFq1cD4m6uZ0nLvDLKOa7nCA9CaYH", "MqJIv4BM2hfR6AMSoGkEEGT8SPZgcE8o"};
    public static final String A0G;
    public View A00;
    public View A01;
    public ImageView A02;
    public MediaView A03;

    @Nullable
    public MediaViewListener A04;
    public MediaViewVideoRenderer A05;
    public AdComponentViewParentApi A06;
    public C1075Xy A07;
    public C1A A08;
    public OD A09;

    @Nullable
    public A1 A0A;

    @Nullable
    public C0855Pi A0B;
    public boolean A0C;
    public boolean A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{56, 26, 9, 20, 14, 8, 30, 23, 91, 9, 30, 21, 31, 30, 9, 30, 9, 91, 22, 14, 8, 15, 91, 25, 30, 91, 8, 30, 15, 91, 25, 30, 29, 20, 9, 30, 91, 21, 26, 15, 18, 13, 30, 58, 31, 85, 26, 30, 29, 41, 56, 53, 57, 50, 63, 57, 18, 57, 40, 43, 51, 46, 55, 64, 100, 104, 110, 108, 41, 123, 108, 103, 109, 108, 123, 108, 123, 41, 100, 124, 122, 125, 41, 107, 108, 41, 122, 108, 125, 41, 107, 108, 111, 102, 123, 108, 41, 103, 104, 125, 96, 127, 108, 72, 109, 39, 96, 68, 72, 78, 76, 9, 91, 76, 71, 77, 76, 91, 76, 91, 9, 68, 92, 90, 93, 9, 75, 76, 9, 90, 76, 93, 9, 75, 76, 79, 70, 91, 76, 9, 71, 72, 93, 64, 95, 76, 107, 72, 71, 71, 76, 91, 104, 77, 7, 18, 53, 45, 58, 55, 50, 63, 123, 13, 50, 62, 44, 123, 56, 52, 53, 40, 47, 41, 46, 56, 47, 52, 41, 123, 43, 58, 41, 58, 54, 40, 123, 47, 34, 43, 62, 117, 1, 46, 59, 38, 57, 42, 111, 14, 43, 111, 6, 44, 32, 33, 111, 38, 60, 111, 33, 58, 35, 35, 97, 11, 52, 57, 56, 50, 125, 47, 56, 51, 57, 56, 47, 56, 47, 125, 48, 40, 46, 41, 125, 63, 56, 125, 46, 56, 41, 125, 63, 56, 59, 50, 47, 56, 125, 51, 60, 41, 52, 43, 56, 28, 57, 115, 26, 11, 18, 96, 108, 110, 45, 101, 98, 96, 102, 97, 108, 108, 104, 45, 98, 103, 112, 45, 109, 98, 119, 106, 117, 102, 45, 96, 111, 106, 96, 104, 102, 103, 117, 106, 103, 102, 108, 86, 113, 111, 62};
    }

    static {
        A08();
        A0G = MediaView.class.getSimpleName();
    }

    private void A05() {
        A1 a1 = this.A0A;
        if (a1 != null) {
            a1.setVisibility(8);
            AnonymousClass38.A0A(this.A0A.getDynamicWebViewController().A0O(), new ColorDrawable(0));
            this.A03.removeView(this.A0A);
            this.A0A = null;
        }
    }

    private void A06() {
        if (!this.A0D) {
            View view = this.A01;
            String[] strArr = A0F;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "HiqmuX4YAHl";
            strArr2[0] = "JtgDxExoVYEb5OmxUIRsQ7gjV";
            if (view != null) {
                MS.A0J(this.A08);
            }
            float f = Lr.A00;
            int iRound = Math.round(4.0f * f);
            int iRound2 = Math.round(12.0f * f);
            this.A08.setChildSpacing(iRound);
            this.A08.setPadding(0, iRound2, 0, iRound2);
            this.A08.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A01 = this.A08;
            this.A03.addView(this.A01, layoutParams);
            return;
        }
        throw new IllegalStateException(A04(0, 46, 84));
    }

    private void A07() {
        EnumC0765Lw.A04(this.A03, EnumC0765Lw.A0A);
        EnumC0765Lw.A04(this.A09, EnumC0765Lw.A0A);
        EnumC0765Lw.A04(this.A05, EnumC0765Lw.A0A);
        EnumC0765Lw.A04(this.A01, EnumC0765Lw.A0A);
    }

    private final void A09(View view, ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A03.addView(view, layoutParams);
        A01(true);
    }

    private void A0A(View view, UB ub) {
        C0855Pi c0855Pi = this.A0B;
        if (c0855Pi != null) {
            MediaView mediaView = this.A03;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "tYahJlzELN2bWoIKGOvNb4V2q4om3tal";
            strArr2[2] = "knO8IZUpKtredd0Q2IkvjJrJQGpJW1Qq";
            mediaView.removeView(c0855Pi);
        }
        if (!ub.A1d()) {
            return;
        }
        String strA1C = ub.A1C();
        Context context = this.A03.getContext();
        String[] strArr3 = A0F;
        if (strArr3[5].length() != strArr3[0].length()) {
            String[] strArr4 = A0F;
            strArr4[4] = "LedcnhOkj71a4gNr9a9uwwPVwkpS";
            strArr4[3] = "bOPNktfa058vxRDYU7HJ2aiUk3a2";
            if (context == null) {
                return;
            }
        } else if (context == null) {
            return;
        }
        C0855Pi c0855PiA01 = C0854Ph.A01(this.A07, strA1C);
        if (A0F[7].charAt(21) != 'L') {
            A0F[1] = "IBU68ioTGuVBWJ1dkmCJ7UK76Osi7EVF";
            this.A0B = c0855PiA01;
            if (this.A0B == null) {
                return;
            }
        } else {
            this.A0B = c0855PiA01;
            if (this.A0B == null) {
                return;
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(5, view.getId());
        layoutParams.addRule(7, view.getId());
        layoutParams.addRule(6, view.getId());
        layoutParams.addRule(8, view.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
        }
        A09(this.A0B, layoutParams);
        this.A06.bringChildToFront(this.A0B);
    }

    private void A0B(ImageView imageView) {
        if (!this.A0D) {
            ImageView imageView2 = this.A02;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "9onWrVOda1qlu0pAvyXYf5LKITz29A5r";
            strArr2[2] = "G6pev0JETY7bhqmEZOziJsmCoQM1bBBX";
            if (imageView2 != null) {
                MS.A0J(imageView2);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(imageView, layoutParams);
            imageView.setId(MS.A00());
            this.A02 = imageView;
            return;
        }
        throw new IllegalStateException(A04(106, 49, 6));
    }

    @TargetApi(21)
    private final void A0C(C1075Xy c1075Xy, AttributeSet attributeSet, int i, int i2, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1075Xy, attributeSet, i, i2));
        A0H(new OD(c1075Xy, attributeSet, i, i2));
        this.A08 = new C1A(c1075Xy, attributeSet, i);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1075Xy, attributeSet, i, i2));
        A07();
    }

    private final void A0D(C1075Xy c1075Xy, AttributeSet attributeSet, int i, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1075Xy, attributeSet, i));
        A0H(new OD(c1075Xy, attributeSet, i));
        this.A08 = new C1A(c1075Xy, attributeSet, i);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1075Xy, attributeSet, i));
        A07();
    }

    private final void A0E(C1075Xy c1075Xy, AttributeSet attributeSet, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1075Xy, attributeSet));
        A0H(new OD(c1075Xy, attributeSet));
        this.A08 = new C1A(c1075Xy, attributeSet);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1075Xy, attributeSet));
        A07();
    }

    private final void A0F(C1075Xy c1075Xy, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c1075Xy));
        A0H(new OD(c1075Xy));
        this.A08 = new C1A(c1075Xy);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c1075Xy));
        A07();
    }

    private void A0G(UB ub, boolean z, K5 k5) {
        T3 t3A04 = new T3(this.A02, this.A07).A04();
        if (z) {
            t3A04.A06(new C1237bk(this, ub));
        }
        t3A04.A07(k5.getUrl());
    }

    private void A0H(OD od) {
        if (!this.A0D) {
            OD od2 = this.A09;
            if (od2 != null) {
                this.A03.removeView(od2);
            }
            od.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(od, layoutParams);
            this.A09 = od;
            return;
        }
        throw new IllegalStateException(A04(63, 43, 38));
    }

    private boolean A0I(NativeAd nativeAd) {
        List<NativeAd> listA03 = ((C5M) nativeAd.getNativeAdApi()).A03();
        if (listA03 == null) {
            return false;
        }
        for (NativeAd childNativeAd : listA03) {
            if (childNativeAd.getAdCoverImage() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(NativeAd nativeAd) {
        return Build.VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(((C5M) nativeAd.getNativeAdApi()).A02());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0151  */
    /* JADX WARN: Code duplicated, block: B:27:0x0166  */
    /* JADX WARN: Code duplicated, block: B:35:0x0191  */
    /* JADX WARN: Code duplicated, block: B:36:0x0193  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:40:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:46:0x0227  */
    /* JADX WARN: Code duplicated, block: B:47:0x025c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0262  */
    /* JADX WARN: Code duplicated, block: B:51:0x0291  */
    /* JADX WARN: Code duplicated, block: B:53:0x029a  */
    /* JADX WARN: Code duplicated, block: B:56:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:59:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:61:0x0321  */
    /* JADX WARN: Code duplicated, block: B:62:0x0328  */
    /* JADX WARN: Code duplicated, block: B:64:0x032e  */
    /* JADX WARN: Code duplicated, block: B:66:0x035f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0368  */
    /* JADX WARN: Code duplicated, block: B:70:0x037c  */
    /* JADX WARN: Code duplicated, block: B:72:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:76:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:59:0x02f2, please report this as an issue */
    public final void A0L(NativeAd nativeAd) {
        View view;
        View view2;
        F9 f9;
        String[] strArr;
        O4 o4;
        String[] strArr2;
        View view3;
        View view4;
        boolean z;
        AbstractC1332dN viewAdapter;
        OD od;
        String[] strArr3;
        C1075Xy c1075XyA11 = ((UB) nativeAd.getInternalNativeAd()).A11();
        c1075XyA11.A0G(this);
        this.A07.A0F(c1075XyA11);
        this.A07.A0E(c1075XyA11.A0D());
        this.A0D = true;
        UB ubA0L = UB.A0L(nativeAd.getInternalNativeAd());
        ubA0L.A1Q(this.A03);
        this.A02.setVisibility(8);
        this.A02.setImageDrawable(null);
        if (ubA0L.A0z() != null) {
            boolean zA0r = ubA0L.A0z().A0r();
            if (A0F[7].charAt(21) != 'L') {
                String[] strArr4 = A0F;
                strArr4[4] = "CvXrj9TTP1W52m7bIbynzmDbx8Ql";
                strArr4[3] = "OGerX4RrBYJpkLXwbXTHIjvyoHPN";
                if (zA0r) {
                    if (!TextUtils.isEmpty(ubA0L.A0z().A0O().A0D().A08())) {
                        ubA0L.A11().A0D().AEj(EnumC02430c.A06);
                    } else {
                        ubA0L.A11().A0D().AEj(EnumC02430c.A05);
                    }
                    A05();
                    this.A09.setVisibility(8);
                    this.A09.setImage(null, null);
                    this.A05.setVisibility(8);
                    this.A05.unsetNativeAd();
                    ((C5L) this.A05.getMediaViewVideoRendererApi()).A03();
                    View view5 = this.A01;
                    if (view5 != null) {
                        view5.setVisibility(8);
                        View view6 = this.A01;
                        if (view6 instanceof O4) {
                            O4 o5 = (O4) view6;
                            if (A0F[1].charAt(24) != 't') {
                                String[] strArr5 = A0F;
                                strArr5[4] = "rVZQRbya12lyykx5Eq2uFJ3JGH4l";
                                strArr5[3] = "XRSLHysRpGcYp4QaXPRJ4K4uNDdg";
                                o5.A04();
                            } else {
                                o5.A04();
                            }
                        } else {
                            ((F9) view6).setAdapter(null);
                        }
                    }
                    A01(false);
                    C1235bi c1235bi = new C1235bi(this, ubA0L, nativeAd);
                    C1075Xy c1075Xy = this.A07;
                    this.A0A = new A1(c1075Xy, c1075Xy.A08(), c1235bi, ubA0L.A0z(), A04(261, 31, 44), 4, ubA0L.A19());
                    EnumC0765Lw.A04(this.A0A, EnumC0765Lw.A0A);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(13);
                    this.A03.addView(this.A0A, layoutParams);
                    A1 a1 = this.A0A;
                    this.A00 = a1;
                    bringChildToFront(a1);
                    this.A0A.setVisibility(0);
                    A0A(this.A0A, ubA0L);
                    A01(true);
                    return;
                }
                if (A0I(nativeAd)) {
                    if (A0J(nativeAd)) {
                        ubA0L.A11().A0D().AEj(EnumC02430c.A09);
                        ubA0L.A1b(this.A0C);
                        this.A00 = this.A05.getMediaViewVideoRendererApi().getVideoView();
                        A05();
                        this.A09.setVisibility(8);
                        this.A09.setImage(null, null);
                        view3 = this.A01;
                        if (view3 != null) {
                            view3.setVisibility(8);
                            view4 = this.A01;
                            if (view4 instanceof O4) {
                                ((O4) view4).A04();
                            } else {
                                ((F9) view4).setAdapter(null);
                            }
                        }
                        bringChildToFront(this.A05);
                        this.A05.setNativeAd(nativeAd);
                        ((C5L) this.A05.getMediaViewVideoRendererApi()).A04(nativeAd);
                        this.A05.setVisibility(0);
                        if (ubA0L.getAdCoverImage() != null) {
                            new T3(this.A03, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C1233bg(this, ubA0L)).A07(ubA0L.getAdCoverImage().getUrl());
                        }
                        if (BuildConfigApi.isDebug()) {
                            Log.i(A0G, A04(292, 9, 44) + ((C5M) nativeAd.getNativeAdApi()).A02());
                        }
                        A0A(this.A05, ubA0L);
                        return;
                    }
                    if (nativeAd.getAdCoverImage() != null) {
                        return;
                    }
                    ubA0L.A11().A0D().AEj(EnumC02430c.A07);
                    this.A00 = this.A09.getBodyImageView();
                    A05();
                    this.A05.setVisibility(8);
                    this.A05.unsetNativeAd();
                    ((C5L) this.A05.getMediaViewVideoRendererApi()).A03();
                    view = this.A01;
                    if (view != null) {
                        view.setVisibility(8);
                        view2 = this.A01;
                        if (view2 instanceof O4) {
                            o4 = (O4) view2;
                            strArr2 = A0F;
                            if (strArr2[5].length() != strArr2[0].length()) {
                                throw new RuntimeException();
                            }
                            String[] strArr6 = A0F;
                            strArr6[4] = "yqBcm6jNekaOStoZQ6HlGjXfWvjo";
                            strArr6[3] = "wDgm0JyWXySbfCdb16XoSedMN32V";
                            o4.A04();
                        } else {
                            f9 = (F9) view2;
                            strArr = A0F;
                            if (strArr[4].length() != strArr[3].length()) {
                                f9.setAdapter(null);
                            } else {
                                A0F[1] = "WgZqidqfP4WcIOVybwW8feV31RK292EI";
                                f9.setAdapter(null);
                            }
                        }
                    }
                    bringChildToFront(this.A09);
                    this.A09.setVisibility(0);
                    new T3(this.A09, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C1232bf(this, ubA0L)).A07(ubA0L.getAdCoverImage().getUrl());
                    A0A(this.A09, ubA0L);
                    return;
                }
                ubA0L.A11().A0D().AEj(EnumC02430c.A03);
                if (ubA0L.A17() == K8.A0B) {
                    z = true;
                } else {
                    z = false;
                }
                if (JR.A22(this.A07) || z) {
                    this.A01 = this.A08;
                    ((C1A) this.A01).setCurrentPosition(0);
                    ((C1A) this.A01).setShowTextInCarousel(z);
                    if (!z) {
                        viewAdapter = new FR((C1A) this.A01, ubA0L.A1H(), this.A07);
                    } else {
                        viewAdapter = new FX(this.A07, (C1A) this.A01, ubA0L.A1H(), ubA0L.A16());
                    }
                    viewAdapter.A0G(new C1234bh(this, ubA0L));
                    ((F9) this.A01).setAdapter(viewAdapter);
                } else {
                    A01(false);
                    int width = this.A03.getWidth();
                    for (ViewGroup viewGroup = (ViewGroup) this.A03.getParent(); width == 0 && viewGroup != null; viewGroup = (ViewGroup) viewGroup.getParent()) {
                        width = viewGroup.getWidth();
                    }
                    MS.A0J(this.A01);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams2.addRule(13);
                    this.A01 = new O4(this.A07);
                    this.A03.addView(this.A01, layoutParams2);
                    ((O4) this.A01).A05(ubA0L, width);
                    MS.A0K(this.A01);
                    A01(true);
                }
                this.A00 = this.A01;
                A05();
                od = this.A09;
                strArr3 = A0F;
                if (strArr3[4].length() == strArr3[3].length()) {
                    A0F[7] = "vPdWlOkx37ezmD0GPDFfrvR6XxeFyYC2";
                    od.setVisibility(8);
                    this.A09.setImage(null, null);
                    this.A05.setVisibility(8);
                    this.A05.unsetNativeAd();
                    ((C5L) this.A05.getMediaViewVideoRendererApi()).A03();
                    bringChildToFront(this.A01);
                    this.A01.setVisibility(0);
                    A0A(this.A01, ubA0L);
                    return;
                }
            }
        } else {
            if (A0I(nativeAd)) {
                if (A0J(nativeAd)) {
                    ubA0L.A11().A0D().AEj(EnumC02430c.A09);
                    ubA0L.A1b(this.A0C);
                    this.A00 = this.A05.getMediaViewVideoRendererApi().getVideoView();
                    A05();
                    this.A09.setVisibility(8);
                    this.A09.setImage(null, null);
                    view3 = this.A01;
                    if (view3 != null) {
                        view3.setVisibility(8);
                        view4 = this.A01;
                        if (view4 instanceof O4) {
                            ((O4) view4).A04();
                        } else {
                            ((F9) view4).setAdapter(null);
                        }
                    }
                    bringChildToFront(this.A05);
                    this.A05.setNativeAd(nativeAd);
                    ((C5L) this.A05.getMediaViewVideoRendererApi()).A04(nativeAd);
                    this.A05.setVisibility(0);
                    if (ubA0L.getAdCoverImage() != null) {
                        new T3(this.A03, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C1233bg(this, ubA0L)).A07(ubA0L.getAdCoverImage().getUrl());
                    }
                    if (BuildConfigApi.isDebug()) {
                        Log.i(A0G, A04(292, 9, 44) + ((C5M) nativeAd.getNativeAdApi()).A02());
                    }
                    A0A(this.A05, ubA0L);
                    return;
                }
                if (nativeAd.getAdCoverImage() != null) {
                    return;
                }
                ubA0L.A11().A0D().AEj(EnumC02430c.A07);
                this.A00 = this.A09.getBodyImageView();
                A05();
                this.A05.setVisibility(8);
                this.A05.unsetNativeAd();
                ((C5L) this.A05.getMediaViewVideoRendererApi()).A03();
                view = this.A01;
                if (view != null) {
                    view.setVisibility(8);
                    view2 = this.A01;
                    if (view2 instanceof O4) {
                        o4 = (O4) view2;
                        strArr2 = A0F;
                        if (strArr2[5].length() != strArr2[0].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr7 = A0F;
                        strArr7[4] = "yqBcm6jNekaOStoZQ6HlGjXfWvjo";
                        strArr7[3] = "wDgm0JyWXySbfCdb16XoSedMN32V";
                        o4.A04();
                    } else {
                        f9 = (F9) view2;
                        strArr = A0F;
                        if (strArr[4].length() != strArr[3].length()) {
                            f9.setAdapter(null);
                        } else {
                            A0F[1] = "WgZqidqfP4WcIOVybwW8feV31RK292EI";
                            f9.setAdapter(null);
                        }
                    }
                }
                bringChildToFront(this.A09);
                this.A09.setVisibility(0);
                new T3(this.A09, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C1232bf(this, ubA0L)).A07(ubA0L.getAdCoverImage().getUrl());
                A0A(this.A09, ubA0L);
                return;
            }
            ubA0L.A11().A0D().AEj(EnumC02430c.A03);
            if (ubA0L.A17() == K8.A0B) {
                z = true;
            } else {
                z = false;
            }
            if (JR.A22(this.A07)) {
                this.A01 = this.A08;
                ((C1A) this.A01).setCurrentPosition(0);
                ((C1A) this.A01).setShowTextInCarousel(z);
                if (!z) {
                    viewAdapter = new FR((C1A) this.A01, ubA0L.A1H(), this.A07);
                } else {
                    viewAdapter = new FX(this.A07, (C1A) this.A01, ubA0L.A1H(), ubA0L.A16());
                }
                viewAdapter.A0G(new C1234bh(this, ubA0L));
                ((F9) this.A01).setAdapter(viewAdapter);
            } else {
                this.A01 = this.A08;
                ((C1A) this.A01).setCurrentPosition(0);
                ((C1A) this.A01).setShowTextInCarousel(z);
                if (!z) {
                    viewAdapter = new FR((C1A) this.A01, ubA0L.A1H(), this.A07);
                } else {
                    viewAdapter = new FX(this.A07, (C1A) this.A01, ubA0L.A1H(), ubA0L.A16());
                }
                viewAdapter.A0G(new C1234bh(this, ubA0L));
                ((F9) this.A01).setAdapter(viewAdapter);
            }
            this.A00 = this.A01;
            A05();
            od = this.A09;
            strArr3 = A0F;
            if (strArr3[4].length() == strArr3[3].length()) {
                A0F[7] = "vPdWlOkx37ezmD0GPDFfrvR6XxeFyYC2";
                od.setVisibility(8);
                this.A09.setImage(null, null);
                this.A05.setVisibility(8);
                this.A05.unsetNativeAd();
                ((C5L) this.A05.getMediaViewVideoRendererApi()).A03();
                bringChildToFront(this.A01);
                this.A01.setVisibility(0);
                A0A(this.A01, ubA0L);
                return;
            }
        }
        throw new RuntimeException();
    }

    public final void A0M(NativeAdBaseApi nativeAdBaseApi, boolean z) {
        C1075Xy c1075XyA11 = ((UB) nativeAdBaseApi).A11();
        this.A07.A0F(c1075XyA11);
        c1075XyA11.A0G(this);
        this.A0D = true;
        UB ubA0L = UB.A0L(nativeAdBaseApi);
        ubA0L.A1P(this.A03);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((C5L) this.A05.getMediaViewVideoRendererApi()).A03();
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
            View view2 = this.A01;
            if (view2 instanceof O4) {
                ((O4) view2).A04();
            } else {
                ((F9) view2).setAdapter(null);
            }
        }
        this.A02.setVisibility(0);
        bringChildToFront(this.A02);
        this.A00 = this.A02;
        K5 adIcon = ubA0L.getAdIcon();
        if (adIcon != null) {
            Bitmap bitmapA0M = ubA0L.A10().A0M(adIcon.getUrl());
            if (bitmapA0M != null) {
                this.A02.setImageBitmap(bitmapA0M);
                if (z) {
                    this.A03.post(new C1238bl(this, ubA0L));
                }
            } else {
                A0G(ubA0L, z, adIcon);
            }
        } else {
            UA uaA15 = ubA0L.A15();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            c1075XyA11.A0D().A2a(ubA0L.A0x(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (uaA15 != null) {
                uaA15.AAi(KH.A00(adErrorType));
            }
            Log.e(A04(46, 17, 115), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                this.A07.A06().A8y(A04(258, 3, 84), C04578z.A0W, new AnonymousClass90(A04(192, 23, 96)));
            }
        }
        A0A(this.A02, ubA0L);
    }

    public final boolean A0N() {
        View view = this.A01;
        return view != null && view.getVisibility() == 0;
    }

    @Override // com.facebook.ads.redexgen.X.C8S
    public final C1075Xy A5b() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        if (view == this.A01 || view == this.A05 || view == this.A09 || view == this.A02) {
            this.A06.bringChildToFront(view);
            C0855Pi c0855Pi = this.A0B;
            if (c0855Pi != null) {
                this.A06.bringChildToFront(c0855Pi);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A05.pause(false);
        this.A05.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getHeight();
        }
        if (A0F[1].charAt(24) == 't') {
            throw new RuntimeException();
        }
        A0F[7] = "3C5Zne3gt6SFfa7y1AnuQltffgpI3Oh8";
        return 0;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaWidth() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageWidth();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getWidth();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getWidth();
        }
        String[] strArr = A0F;
        if (strArr[6].charAt(12) == strArr[2].charAt(12)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0F;
        strArr2[5] = "pFreRfYdfw1";
        strArr2[0] = "pVUprXCJsnglf8IlGtX2XFBaJ";
        return 0;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C1075Xy) {
            this.A07 = (C1075Xy) context;
        } else {
            this.A07 = C5G.A02(context);
        }
        this.A07.A0G(this);
        int initializationType = adViewConstructorParams.getInitializationType();
        if (initializationType == 0) {
            A0F(this.A07, mediaView);
        } else if (initializationType == 1) {
            A0E(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
        } else if (initializationType == 2) {
            A0D(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), mediaView);
        } else if (initializationType == 3) {
            A0C(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
        } else {
            throw new IllegalArgumentException(A04(155, 37, 116));
        }
        A01(true);
    }

    @Override // com.facebook.ads.redexgen.X.C5E, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        int width = this.A03.getWidth();
        int height = this.A03.getHeight();
        if (width > 0 && height > 0) {
            this.A03.repair(th);
            this.A03.getLayoutParams().width = width;
            MediaView mediaView = this.A03;
            if (A0F[1].charAt(24) == 't') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[5] = "Mgb6bOJjyiN";
            strArr[0] = "MTEeDXbdwkPsq4eW7ABfM3WBi";
            mediaView.getLayoutParams().height = height;
            this.A03.setBackgroundColor(-3355444);
            return;
        }
        this.A03.repair(th);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A04 = mediaViewListener;
        if (mediaViewListener == null) {
            ((C5L) this.A05.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((C5L) this.A05.getMediaViewVideoRendererApi()).A07(new C1231be(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0D) {
            MediaViewVideoRenderer mediaViewVideoRenderer2 = this.A05;
            if (A0F[7].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "ifAS5bhxfK6Gg4eu5Yemnhg9EBEfp9jT";
            strArr[2] = "R5YDbsM1msNnvJcIFydw3DY2O0brJ9d9";
            if (mediaViewVideoRenderer2 != null) {
                this.A03.removeView(mediaViewVideoRenderer2);
                this.A05.getMediaViewVideoRendererApi().destroy();
            }
            ((C5L) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A07.A08());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((C1230bd) this.A03.getMediaViewApi()).A09(mediaViewVideoRenderer, layoutParams);
            this.A05 = mediaViewVideoRenderer;
            this.A0C = !(this.A05 instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(MS.A00());
            return;
        }
        throw new IllegalStateException(A04(215, 43, 114));
    }
}
