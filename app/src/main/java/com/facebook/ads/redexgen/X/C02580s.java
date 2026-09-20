package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C02580s {
    public static InterfaceC02530n A00;

    @Nullable
    public final InterfaceC02530n A00(C1075Xy c1075Xy, AdPlacementType adPlacementType) {
        InterfaceC02530n interfaceC02530n = A00;
        if (interfaceC02530n != null) {
            return interfaceC02530n;
        }
        int i = C02570r.A00[adPlacementType.ordinal()];
        if (i == 1) {
            return new C1348dd();
        }
        if (i == 2) {
            return new C1347dc();
        }
        if (i == 3) {
            return new C1345da(c1075Xy);
        }
        if (i == 4) {
            return new C0610Fq(c1075Xy);
        }
        if (i != 5) {
            return null;
        }
        return new C0602Fi();
    }
}
