package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HU {
    public final int A00;
    public final HR A01;

    @Nullable
    public final Object A02;
    public final C0504Av[] A03;

    public HU(C0504Av[] c0504AvArr, HQ[] hqArr, @Nullable Object obj) {
        this.A03 = c0504AvArr;
        this.A01 = new HR(hqArr);
        this.A02 = obj;
        this.A00 = c0504AvArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(HU hu2) {
        if (hu2 == null || hu2.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i = 0; i < this.A01.A01; i++) {
            if (!A02(hu2, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(HU hu2, int i) {
        return hu2 != null && C0695Iz.A0g(this.A03[i], hu2.A03[i]) && C0695Iz.A0g(this.A01.A00(i), hu2.A01.A00(i));
    }
}
