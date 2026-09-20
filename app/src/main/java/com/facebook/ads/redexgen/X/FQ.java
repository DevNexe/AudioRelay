package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FQ extends d2 {

    @Nullable
    public View A00;
    public C0579El A01;

    public FQ(C0579El c0579El, C02811p c02811p) {
        super(c0579El, c02811p);
        this.A01 = c0579El;
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0J() {
        if (this.A00 != null) {
            this.A01.A0D().A3n();
            this.A06.A0E(this.A00);
        } else {
            this.A01.A0D().A3o();
        }
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0L(InterfaceC02530n interfaceC02530n, C9H c9h, C9F c9f, C02821q c02821q) {
        this.A01.A0D().A3h();
        C1348dd c1348dd = (C1348dd) interfaceC02530n;
        C1314d5 c1314d5 = new C1314d5(this, c02821q, c1348dd);
        A0C().postDelayed(c1314d5, c9h.A05().A05());
        c1348dd.A0I(this.A01, this.A08, this.A07.A07, new C1313d4(this, c1314d5), c02821q);
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0O(String str) {
        this.A01.A0D().A3m(str != null);
        super.A0O(str);
    }

    @Override // com.facebook.ads.redexgen.X.d2
    public final void A0R(boolean z) {
        super.A0R(z);
        this.A00 = null;
    }
}
