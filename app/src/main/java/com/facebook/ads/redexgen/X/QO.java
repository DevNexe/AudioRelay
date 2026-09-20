package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QO implements View.OnClickListener {
    public final /* synthetic */ C04076p A00;

    public QO(C04076p c04076p) {
        this.A00 = c04076p;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (L0.A02(this)) {
            return;
        }
        try {
            View v = this.A00.getVideoView();
            if (v != null) {
                if (this.A00.A02 != null) {
                    this.A00.A02.A02(EnumC0710Jo.A0p, null);
                }
                this.A00.A01.A0D().A2t();
                int i = QP.A00[this.A00.getVideoView().getState().ordinal()];
                if (i == 1 || i == 2 || i == 3 || i == 4) {
                    this.A00.getVideoView().A0b(Q6.A04, 12);
                } else if (i == 5) {
                    this.A00.getVideoView().A0e(true, 8);
                }
            }
        } catch (Throwable th) {
            L0.A00(th, this);
        }
    }
}
