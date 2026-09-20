package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0775Mg {

    @Nullable
    public static C0775Mg A02;
    public final C0957Th A00;
    public final C0777Mi A01;

    public C0775Mg(C1075Xy c1075Xy, Executor executor, C9H c9h) {
        this.A01 = new C0777Mi(c1075Xy);
        this.A00 = new C0957Th(executor, c9h, c1075Xy);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1075Xy c1075Xy, Executor executor, C9H c9h) {
        if (!JR.A10(c1075Xy)) {
            return;
        }
        C0775Mg c0775Mg = A02;
        if (c0775Mg == null) {
            A02 = new C0775Mg(c1075Xy, executor, c9h);
            A02.A00();
        } else {
            c0775Mg.A02(c9h);
        }
    }

    private void A02(C9H c9h) {
        this.A00.A07(c9h);
    }
}
