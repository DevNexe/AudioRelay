package com.facebook.ads.redexgen.X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04076p extends NQ {
    public final Paint A00;
    public final C1075Xy A01;

    @Nullable
    public final C0711Jp A02;
    public final N6 A03;
    public final AbstractC0768Lz A04;
    public final AbstractC0754Lj A05;
    public final QR A06;

    public C04076p(C1075Xy c1075Xy, boolean z, @Nullable C0711Jp c0711Jp) {
        super(c1075Xy);
        this.A04 = new AbstractC0768Lz() { // from class: com.facebook.ads.redexgen.X.7b
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04609c
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass85 anonymousClass85) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A05 = new AbstractC0754Lj() { // from class: com.facebook.ads.redexgen.X.7a
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04609c
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(C0767Ly c0767Ly) {
                this.A00.A06.setChecked(false);
            }
        };
        this.A03 = new N6() { // from class: com.facebook.ads.redexgen.X.7O
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC04609c
            /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass88 anonymousClass88) {
                this.A00.A06.setChecked(true);
            }
        };
        this.A02 = c0711Jp;
        this.A01 = c1075Xy;
        this.A06 = new QR(c1075Xy, z);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) (((double) displayMetrics.density) * 23.76d), (int) (((double) displayMetrics.density) * 23.76d));
        layoutParams.addRule(13);
        this.A06.setLayoutParams(layoutParams);
        this.A06.setChecked(true);
        this.A06.setClickable(false);
        this.A00 = new Paint();
        this.A00.setStyle(Paint.Style.FILL);
        if (z) {
            this.A00.setColor(-1728053248);
        } else {
            this.A00.setColor(-1);
            this.A00.setAlpha(204);
        }
        MS.A0M(this, 0);
        addView(this.A06);
        setGravity(17);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams((int) (((double) displayMetrics.density) * 72.0d), (int) (((double) displayMetrics.density) * 72.0d));
        layoutParams2.addRule(13);
        setLayoutParams(layoutParams2);
        MS.A0G(1004, this);
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final void A07() {
        super.A07();
        if (getVideoView() != null) {
            getVideoView().getEventBus().A03(this.A04, this.A05, this.A03);
        }
        setOnClickListener(new QO(this));
    }

    @Override // com.facebook.ads.redexgen.X.NQ
    public final void A08() {
        setOnClickListener(null);
        if (getVideoView() != null) {
            getVideoView().getEventBus().A04(this.A03, this.A05, this.A04);
        }
        super.A08();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int centerX = Math.min((getWidth() - getPaddingLeft()) - getPaddingRight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        int i = centerX / 2;
        canvas.drawCircle(getPaddingLeft() + i, getPaddingTop() + (centerX / 2), i, this.A00);
        super.onDraw(canvas);
    }
}
