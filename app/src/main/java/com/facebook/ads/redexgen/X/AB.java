package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class AB extends AbstractC0936Sl {

    @Nullable
    public N8 A00;

    @Nullable
    public InterfaceC0839Os A01;

    @Nullable
    public C0849Pc A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    @Nullable
    public RelativeLayout A06;
    public SB A07;
    public final C1075Xy A08;
    public final N6 A09;
    public final AbstractC0768Lz A0A;
    public final AbstractC0754Lj A0B;
    public final L4 A0C;
    public final AbstractC0724Kc A0D;
    public final String A0E;
    public final Paint A0F;
    public final Path A0G;
    public final RectF A0H;
    public final C0830Oj A0I;
    public static String[] A0J = {"dJoea1DbFsfm9GTpKIzcXYdmCRfBe4FS", "N1xc2MysRccxXRgwDgHXZSQeh7bFq7uk", "3nDu3mubCrSGPsHb", "SUxuavEQD34fwSKO8hxc7w", "hmAyL1Y1BI3zOyZEMNvfuG", "1nycCDmAbpyAo4RWRzHJ2ixoeiRT", "fh6VcnyoMwgZMcb2oBIx6", "bmD"};
    public static final int A0L = (int) (Lr.A00 * 0.0f);
    public static final int A0M = (int) (Lr.A00 * 9.0f);
    public static final int A0K = (int) (Lr.A00 * 9.0f);

    public AB(C0830Oj c0830Oj, boolean z, String str, SB sb) {
        super(c0830Oj, z);
        this.A0G = new Path();
        this.A0H = new RectF();
        this.A0D = new AH(this);
        this.A09 = new AF(this);
        this.A0B = new AE(this);
        this.A0A = new AD(this);
        this.A0C = new AC(this);
        this.A0I = c0830Oj;
        this.A07 = sb;
        this.A0E = str;
        this.A08 = c0830Oj.A05();
        setGravity(17);
        int i = A0L;
        setPadding(i, 0, i, i);
        MS.A0M(this, 0);
        setUpView(this.A08);
        this.A0F = new Paint();
        this.A0F.setColor(-16777216);
        this.A0F.setStyle(Paint.Style.FILL);
        this.A0F.setAlpha(16);
        this.A0F.setAntiAlias(true);
        if (Build.VERSION.SDK_INT < 18) {
            setLayerType(1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00() {
        if (this.A0I.A0A() != null && this.A02 != null) {
            this.A0I.A0A().A8o(this.A02.getSimpleVideoView());
            if (JR.A1Y(getContext())) {
                this.A0I.A0A().A07(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        if (this.A0I.A0A() != null) {
            this.A0I.A0A().A05();
            if (this.A02 != null) {
                this.A0I.A0A().AFG(this.A02.getSimpleVideoView());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A01 == null) {
            return;
        }
        if (!A0i() || !this.A05) {
            boolean zA0i = A0i();
            String[] strArr = A0J;
            if (strArr[3].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0J;
            strArr2[3] = "whWH7G9NZGoicUCMK8TGye";
            strArr2[4] = "jQqQ2QRGHP0rmsCqitHuog";
            if (zA0i || !this.A04) {
                return;
            }
        }
        this.A01.AA3();
    }

    private void A03(@Nullable View view) {
        RelativeLayout.LayoutParams layoutParams;
        if (view == null || (layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.addRule(13, -1);
        view.setLayoutParams(layoutParams);
    }

    public static void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        MS.A0K(view);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0826Of
    public final boolean A0B() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0826Of
    public final boolean A0c() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0936Sl
    public final void A0e() {
        C0849Pc c0849Pc;
        if (A0i() && (c0849Pc = this.A02) != null) {
            c0849Pc.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0936Sl
    public final void A0f() {
        if (A0i()) {
            A0g();
            C0849Pc c0849Pc = this.A02;
            if (c0849Pc != null) {
                c0849Pc.A05(Q6.A02);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0936Sl
    public final void A0g() {
        C0849Pc c0849Pc;
        float volume = this.A07.A0P().getVolume();
        if (A0i() && (c0849Pc = this.A02) != null && volume != c0849Pc.getVolume()) {
            this.A02.setVolume(volume);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0936Sl
    public final boolean A0h() {
        C0849Pc c0849Pc;
        return A0i() && (c0849Pc = this.A02) != null && c0849Pc.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0936Sl
    public final boolean A0i() {
        return this.A03;
    }

    public final void A0j(Map<String, String> map) {
        C0849Pc c0849Pc = this.A02;
        if (c0849Pc != null) {
            c0849Pc.A02();
            if (A0i()) {
                this.A02.A04(getAdEventManager(), this.A0E, map);
            }
        }
    }

    @Nullable
    public final C0849Pc getVideoView() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0826Of, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A0G.reset();
        this.A0H.set(0.0f, 0.0f, getWidth(), getHeight());
        int i = 0;
        boolean z = getResources().getConfiguration().orientation == 1;
        if (z) {
            i = A0K;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.drawPath(this.A0G, this.A0F);
        this.A0H.set(A0L, 0.0f, getWidth() - A0L, getHeight() - A0L);
        if (z) {
            i = A0M;
        }
        this.A0G.addRoundRect(this.A0H, i, i, Path.Direction.CW);
        canvas.clipPath(this.A0G);
        super.onDraw(canvas);
    }

    public void setImageUrl(String str) {
        N8 n8 = this.A00;
        if (n8 != null) {
            n8.setVisibility(0);
            new T3(this.A00, this.A08).A04().A06(new C0949Sy(this, null)).A07(str);
        }
        C0849Pc c0849Pc = this.A02;
        if (c0849Pc != null) {
            c0849Pc.setVisibility(8);
        }
    }

    public void setIsVideo(boolean z) {
        this.A03 = z;
    }

    public void setOnAssetsLoadedListener(InterfaceC0839Os interfaceC0839Os) {
        this.A01 = interfaceC0839Os;
    }

    public void setUpImageView(C1075Xy c1075Xy) {
        this.A00 = new N8(c1075Xy);
        A04(this.A00);
    }

    public void setUpMediaContainer(C1075Xy c1075Xy) {
        this.A06 = new RelativeLayout(c1075Xy);
        A04(this.A06);
        N8 n8 = this.A00;
        if (n8 != null) {
            this.A06.addView(n8);
            A03(this.A00);
        }
        C0849Pc c0849Pc = this.A02;
        if (c0849Pc != null) {
            this.A06.addView(c0849Pc);
            A03(this.A02);
        }
        addView(this.A06);
    }

    public void setUpVideoView(C1075Xy c1075Xy) {
        this.A02 = new C0849Pc(c1075Xy, new C0711Jp(this.A0E, getAdEventManager()));
        A04(this.A02);
    }

    private void setUpView(C1075Xy c1075Xy) {
        setUpImageView(c1075Xy);
        setUpVideoView(c1075Xy);
        setUpMediaContainer(c1075Xy);
    }

    public void setVideoPlaceholderUrl(String str) {
        C0849Pc c0849Pc = this.A02;
        if (c0849Pc != null) {
            c0849Pc.setPlaceholderUrl(str);
        }
    }

    public void setVideoUrl(String str) {
        N8 n8 = this.A00;
        if (n8 != null) {
            if (A0J[5].length() == 10) {
                throw new RuntimeException();
            }
            A0J[2] = "s54OOOYMcUndmM7F";
            n8.setVisibility(8);
        }
        C0849Pc c0849Pc = this.A02;
        if (c0849Pc != null) {
            c0849Pc.setVisibility(0);
            this.A02.setVideoURI(str);
            this.A02.A03(this.A0D);
            this.A02.A03(this.A09);
            this.A02.A03(this.A0B);
            this.A02.A03(this.A0A);
            this.A02.A03(this.A0C);
        }
    }
}
