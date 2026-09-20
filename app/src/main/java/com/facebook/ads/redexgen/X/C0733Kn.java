package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0733Kn {

    @Nullable
    public final C9H A00;
    public final EnumC0732Km A01;

    @Nullable
    public final String A02;

    public C0733Kn(EnumC0732Km enumC0732Km) {
        this(enumC0732Km, null, null);
    }

    public C0733Kn(EnumC0732Km enumC0732Km, @Nullable C9H c9h, @Nullable String str) {
        this.A01 = enumC0732Km;
        this.A00 = c9h;
        this.A02 = str;
    }

    @Nullable
    public C9H A00() {
        return this.A00;
    }

    public final EnumC0732Km A01() {
        return this.A01;
    }

    @Nullable
    public final String A02() {
        return this.A02;
    }
}
