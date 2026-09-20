package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1332dN extends C4H<C0952Tc> {
    public static final int A05 = (int) (Lr.A00 * 4.0f);

    @Nullable
    public AnonymousClass17 A00;
    public final List<UB> A01;
    public final int A02;
    public final C1075Xy A03;

    @DoNotStrip
    public final AbstractC0894Qv A04 = new C1334dP(this);

    public AbstractC1332dN(C1A c1a, List<UB> list, C1075Xy c1075Xy) {
        this.A03 = c1075Xy;
        this.A02 = c1a.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A02(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A02;
        if (i == 0) {
            i2 *= 2;
        }
        marginLayoutParams.setMargins(i2, 0, i >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    public final int A0D() {
        return this.A01.size();
    }

    public final void A0F(ImageView imageView, int i) {
        UB ub = this.A01.get(i);
        K5 adCoverImage = ub.getAdCoverImage();
        if (adCoverImage != null) {
            T3 t3A04 = new T3(imageView, this.A03).A04();
            t3A04.A06(new C1333dO(this, i, ub));
            t3A04.A07(adCoverImage.getUrl());
        }
    }

    public final void A0G(AnonymousClass17 anonymousClass17) {
        this.A00 = anonymousClass17;
    }

    @Override // com.facebook.ads.redexgen.X.C4H
    /* JADX INFO: renamed from: A0H, reason: merged with bridge method [inline-methods] */
    public void A0E(C0952Tc c0952Tc, int i) {
        c0952Tc.A0l().setLayoutParams(A02(i));
    }
}
