package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TF implements O1 {
    public final /* synthetic */ C0813Ns A00;

    public TF(C0813Ns c0813Ns) {
        this.A00 = c0813Ns;
    }

    @Override // com.facebook.ads.redexgen.X.O1
    public final void AAA(boolean z) {
        if (this.A00.A07 && this.A00.A00 != null) {
            this.A00.A00.setEnabled(z);
            this.A00.A00.setAlpha(z ? 1.0f : 0.3f);
        }
    }

    @Override // com.facebook.ads.redexgen.X.O1
    public final void AAp(boolean z) {
        if (this.A00.A07 && this.A00.A02 != null) {
            this.A00.A02.setEnabled(z);
            this.A00.A02.setAlpha(z ? 1.0f : 0.3f);
        }
    }
}
