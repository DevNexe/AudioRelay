package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ho, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0658Ho extends IOException {
    public final int A00;
    public final C0654Hi A01;

    public C0658Ho(IOException iOException, C0654Hi c0654Hi, int i) {
        super(iOException);
        this.A01 = c0654Hi;
        this.A00 = i;
    }

    public C0658Ho(String str, C0654Hi c0654Hi, int i) {
        super(str);
        this.A01 = c0654Hi;
        this.A00 = i;
    }

    public C0658Ho(String str, IOException iOException, C0654Hi c0654Hi, int i) {
        super(str, iOException);
        this.A01 = c0654Hi;
        this.A00 = i;
    }
}
