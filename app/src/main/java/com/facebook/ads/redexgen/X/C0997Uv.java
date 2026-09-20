package com.facebook.ads.redexgen.X;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0997Uv implements InterfaceC0650He {
    public final int A00;
    public final InterfaceC0650He A01;
    public final C0683In A02;

    public C0997Uv(InterfaceC0650He interfaceC0650He, C0683In c0683In, int i) {
        this.A01 = (InterfaceC0650He) IK.A01(interfaceC0650He);
        this.A02 = (C0683In) IK.A01(c0683In);
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    @Nullable
    public final Uri A7k() {
        return this.A01.A7k();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final long ACw(C0654Hi c0654Hi) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.ACw(c0654Hi);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final void close() throws IOException {
        this.A01.close();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0650He
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        this.A02.A02(this.A00);
        return this.A01.read(bArr, i, i2);
    }
}
