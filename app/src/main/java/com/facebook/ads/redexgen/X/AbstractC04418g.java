package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@VisibleForTesting
public abstract class AbstractC04418g<T> {
    public EnumC04408f A00;

    @Nullable
    public abstract T A03();

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8g != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    public final EnumC04408f A00() {
        return this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.8g != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    public final void A01(EnumC04408f enumC04408f) {
        this.A00 = enumC04408f;
    }
}
