package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.b7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1198b7 extends AbstractC04006i implements InterfaceC03956d {
    public C6S A00;
    public final C6C A01;
    public final Map<Integer, C04106s> A02;

    @SuppressLint({"UseSparseArrays"})
    public C1198b7(Context context, C6C c6c) {
        super(context, c6c);
        this.A02 = new HashMap();
        this.A01 = c6c;
    }

    public final void A02(C04106s c04106s) {
        this.A02.put(Integer.valueOf(c04106s.A00()), c04106s);
    }

    public final void A03(EnumC04146w enumC04146w, Context context) {
        this.A00 = C6S.A00(context, this.A01);
        this.A00.A04(this.A02, enumC04146w);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03956d
    public final void AD6() {
        C6S c6s = this.A00;
        if (c6s != null) {
            c6s.A03();
        }
    }
}
