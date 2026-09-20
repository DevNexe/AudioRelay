package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class ViewOnClickListenerC04217e extends NQ implements View.OnClickListener {
    public static String[] A05 = {"dj2bca5KMhic7lU7SNdjndSTQwmssf52", "TPlcacN2BRfqpmqqou3eGj4ypEirHC", "lK1i5T", "LDnNwGMA5Xj1Rc4RK", "9vPtQslMJEvaRYxyY6ZiMi1q6kn3NQTo", "pbwCeIFhJ07zfEQSECI2TdcOW", "Wj7W52", "ztBFgo3EeJBil6N8wes8zN"};
    public final N6 A00;
    public final AbstractC0768Lz A01;
    public final AbstractC0754Lj A02;
    public final L4 A03;
    public final QR A04;

    public ViewOnClickListenerC04217e(C1075Xy c1075Xy) {
        this(c1075Xy, null);
    }

    public ViewOnClickListenerC04217e(C1075Xy c1075Xy, AttributeSet attributeSet) {
        this(c1075Xy, attributeSet, 0);
    }

    public ViewOnClickListenerC04217e(C1075Xy c1075Xy, AttributeSet attributeSet, int i) {
        super(c1075Xy, attributeSet, i);
        this.A03 = new L4() { // from class: com.facebook.ads.redexgen.X.7l
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04609c
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(LG lg) {
                this.A00.setVisibility(0);
            }
        };
        this.A01 = new AbstractC0768Lz() { // from class: com.facebook.ads.redexgen.X.7k
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04609c
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass85 anonymousClass85) {
                this.A00.A04.setChecked(true);
            }
        };
        this.A02 = new AbstractC0754Lj() { // from class: com.facebook.ads.redexgen.X.7g
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04609c
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0767Ly c0767Ly) {
                this.A00.A04.setChecked(false);
            }
        };
        this.A00 = new N6() { // from class: com.facebook.ads.redexgen.X.7f
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04609c
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass88 anonymousClass88) {
                this.A00.A04.setChecked(true);
            }
        };
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.A04 = new QR(c1075Xy);
        this.A04.setChecked(true);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (displayMetrics.density * 25.0f), (int) (displayMetrics.density * 25.0f));
        setVisibility(8);
        addView(this.A04, layoutParams);
        setClickable(true);
        setFocusable(true);
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final void A07() {
        super.A07();
        setOnClickListener(this);
        this.A04.setOnClickListener(this);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A03, this.A00, this.A01, this.A02);
        }
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final void A08() {
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A02, this.A01, this.A00, this.A03);
        }
        setOnClickListener(null);
        this.A04.setOnClickListener(null);
        super.A08();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            QK videoView = getVideoView();
            if (videoView == null) {
                return;
            }
            if (videoView.getState() == EnumC0892Qt.A07 || videoView.getState() == EnumC0892Qt.A05 || videoView.getState() == EnumC0892Qt.A06) {
                videoView.A0b(Q6.A04, 11);
            } else if (videoView.getState() == EnumC0892Qt.A0A) {
                videoView.A0e(true, 7);
            }
        } catch (Throwable th) {
            if (A05[5].length() != 25) {
                throw new RuntimeException();
            }
            A05[7] = "YsoDkb8mAWGLBYzRGBa3i8";
            L0.A00(th, this);
        }
    }

    public void setPauseAccessibilityLabel(@Nullable String str) {
        this.A04.setPauseAccessibilityLabel(str);
    }

    public void setPlayAccessibilityLabel(@Nullable String str) {
        this.A04.setPlayAccessibilityLabel(str);
    }
}
