package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1239bm extends AbstractC02540o {
    public static byte[] A03;

    @Nullable
    public View A00;
    public final AnonymousClass54 A01;
    public final C0579El A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, 20, 20, 21, 26, -58, 22, 24, 11, 25, 11, 20, 26, -58, 20, 27, 18, 18, -58, 7, 10, -4, 15, 11, 29};
    }

    public C1239bm(AnonymousClass54 anonymousClass54) {
        this.A02 = anonymousClass54.A09();
        this.A01 = anonymousClass54;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A0C() {
        this.A02.A0D().A3d();
        C0744Kz.A00(new C1241bo(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A0D() {
        this.A02.A0D().A3g();
        C0744Kz.A00(new C1240bn(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A0E(View view) {
        if (view != null) {
            this.A02.A0D().A3f();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if (this.A00 instanceof T5) {
                KO.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            FQ fqA08 = this.A01.A08();
            if (fqA08 != null) {
                fqA08.A0F();
            }
            C0744Kz.A00(new C1242bp(this));
            AnonymousClass54 anonymousClass54 = this.A01;
            anonymousClass54.A0B(anonymousClass54.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && JR.A0w(this.A01.A07().getContext())) {
                final OE oe = new OE();
                this.A01.A0D(oe);
                oe.A0C(this.A01.getPlacementId());
                oe.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0D() != null) {
                    oe.A09(this.A01.A08().A0D().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof T5) {
                    oe.A0A(((T5) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5D
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        if (this.A00.A00 != null) {
                            oe.setBounds(0, 0, this.A00.A00.getWidth(), this.A00.A00.getHeight());
                            OE oe2 = oe;
                            oe2.A0D(!oe2.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(oe);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A0F(InterfaceC02530n interfaceC02530n) {
        this.A02.A0D().A3e(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0G();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02540o
    public final void A0G(KH kh) {
        this.A02.A0D().A2a(MJ.A01(this.A01.A04()), kh.A03().getErrorCode(), kh.A04());
        C0744Kz.A00(new C1243bq(this, kh));
    }
}
