package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04106s {
    public final int A00;
    public final InterfaceC04136v A01;
    public final EnumSet<EnumC04176z> A02;

    public C04106s(int i, EnumSet<EnumC04176z> enumSet, InterfaceC04136v interfaceC04136v) {
        this.A00 = i;
        this.A02 = enumSet;
        this.A01 = interfaceC04136v;
    }

    public final int A00() {
        return this.A00;
    }

    @Nullable
    public final InterfaceC04136v A01() {
        if (this.A02.contains(EnumC04176z.A07)) {
            return this.A01;
        }
        return null;
    }

    @Nullable
    public final InterfaceC04136v A02(EnumC04146w enumC04146w) {
        if (A04(enumC04146w)) {
            return this.A01;
        }
        return null;
    }

    public final EnumSet<EnumC04176z> A03() {
        return this.A02;
    }

    public final boolean A04(EnumC04146w enumC04146w) {
        return C7J.A0E(enumC04146w) && this.A02.contains(EnumC04176z.A00(enumC04146w.A03()));
    }
}
